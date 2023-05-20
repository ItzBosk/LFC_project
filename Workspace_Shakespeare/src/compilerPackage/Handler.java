package compilerPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import antlr.Parser;
import compilerPackage.temp.Shakespeare;
import compilerPackage.util.CharacterDescriptor;
import compilerPackage.util.RomanNumber;

public class Handler {

	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
//	public static int UNDECLARED_VAR_ERROR = 2;
//	public static int DECLARED_VAR_ERROR = 3;
//	public static int INC_ERROR = 4;
//	public static int MISS_INC_ERROR = 5;
//	public static int DIV_BY_ZERO_ERROR = 6;

	// Shakespeare errors
	public static int MISSING_TITLE = 3;
	public static int MISSING_DOT = 4;
	public static int MISSING_CHARACTER = 5;
	public static int INVALID_CHARACTER = 6;
	public static int MISSING_COMMENT = 7;
	public static int ALREADY_DECLARED_CHARACTER = 8;
	public static int INVALID_ROMAN_NUMBER = 9;
	public static int ALREADY_DEFINED_ACT = 10;
	public static int ALREADY_DEFINED_SCENE_IN_ACT = 11;
	public static int SKIPPED_ACT = 12;
	public static int SKIPPED_SCENE = 13;
	public static int UNDECLARED_CHARACTER = 14;
	public static int CHARACTER_ALREADY_ON_STAGE = 15;
	public static int ALREADY_TWO_CARACTERS_ON_STAGE = 16;
	public static int CHARACTER_NOT_ON_STAGE = 17;

	TokenStream input; // mi rappresenta lo scanner
	List<String> errorList; // lista in cui registro errori

	Hashtable<String, CharacterDescriptor> characterList; // character, value, on stage or not
	double scenicMoment; // gestione atti e scene

	public Handler(TokenStream input) {
		this.input = input;
		errorList = new ArrayList<String>();
		characterList = new Hashtable<String, CharacterDescriptor>(101);
		scenicMoment = 0;
	}

	// lista degli errori printata dal Parser
	public List<String> getErrorList() {
		return errorList;
	}

	// gestione errori sintattici e lessicali (trasfrmati in sintattici)
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			// gestione errore subito all'inizio del file (input.LT(-1) sarebbe fuori dal
			// file)
			if (input.LT(-1) == null)
				tk = input.LT(+1);
			else
				tk = input.LT(-1);

		if (tk.getType() == ShakespeareLexer.ERROR_TK)
			errMsg = "Lexical Error " + LEXICAL_ERROR;
		else
			errMsg = "Syntax Error " + SYNTAX_ERROR;

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: " + " on token '"
				+ tk.getText() + "'";
		// errMsg += "\n" + hdr + "\n**********\n" + msg; // scarto msg automatico
		errorList.add(errMsg); // msg di errore che ho in output
	}

	// gestione errori semantici
	void myErrorHandler(int code, Token tk) {
		String errMsg;
		// i primi due casi non dovrebbero mai avvenire... ma giusto in caso...
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error " + code;

		if (tk == null)
			// gestione errore subito all'inizio del file (input.LT(-1) sarebbe fuori dal
			// file)
			if (input.LT(-1) == null)
				tk = input.LT(+1);
			else
				tk = input.LT(-1);
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: ";

//		if (code == UNDECLARED_VAR_ERROR)
//			errMsg += "The variable '" + tk.getText() + "' is undeclared";
//		else if (code == DECLARED_VAR_ERROR)
//			errMsg += "The variable '" + tk.getText() + "' has been already declared";
//		else if (code == INC_ERROR)
//			errMsg += "Cannot use '++' or '--' before and after the variable '" + tk.getText() + "'";
//		else if (code == MISS_INC_ERROR)
//			errMsg += "Missing '++' or '--' before or after the variable '" + tk.getText() + "'";
//		else if (code == DIV_BY_ZERO_ERROR)
//			errMsg += "Division by 0";

		// Shakespeare errors
		if (code == MISSING_TITLE)
			errMsg += "Missing title";
		else if (code == MISSING_DOT)
			errMsg += "Missing dot after " + input.LT(-1).getText();
		else if (code == MISSING_CHARACTER)
			errMsg += "Missing character name in declaration";
		else if (code == INVALID_CHARACTER)
			errMsg += "Invalid character name";
		else if (code == MISSING_COMMENT)
			errMsg += "Missing comment";
		else if (code == ALREADY_DECLARED_CHARACTER)
			errMsg += "The character has been already declared";
		else if (code == INVALID_ROMAN_NUMBER)
			errMsg += "The number is not a roman number";
		else if (code == ALREADY_DEFINED_ACT)
			errMsg += "Already defined act";
		else if (code == ALREADY_DEFINED_SCENE_IN_ACT)
			errMsg += "Already defined scene in this act";
		else if (code == SKIPPED_ACT)
			errMsg += "Skipped one or more act in numeration";
		else if (code == SKIPPED_SCENE)
			errMsg += "Skipped one or more scene in this act in numeration";
		else if (code == UNDECLARED_CHARACTER)
			errMsg += "Character never declared";
		else if (code == CHARACTER_ALREADY_ON_STAGE)
			errMsg += "Character already on stage";
		else if (code == ALREADY_TWO_CARACTERS_ON_STAGE)
			errMsg += "There are already two characters on stage";
		else if (code == CHARACTER_NOT_ON_STAGE)
			errMsg += "The character is not on stage";

		errorList.add(errMsg);
	}

	// controlla titolo
	public void checkNullTitle(Token t, Token d) { // t=testo, d=dot
		try {
			if (t == null) {
				myErrorHandler(MISSING_TITLE, null);
			} else if (!d.getText().equals(".")) {
				myErrorHandler(MISSING_DOT, d);
			}
		} catch (NullPointerException ex) {
			System.err.println(ex.toString());
			myErrorHandler(MISSING_TITLE, null);
		}
	}

	// dramatisPersonae
	public void checkPersonae(Token ch, Token co) { // ch=characters, co=comment
		if (ch == null)
			myErrorHandler(MISSING_CHARACTER, ch);
		else {
			// controllo se token corrisponde a token CHARACTERS
			if (ch.getType() != ShakespeareLexer.CHARACTER)
				myErrorHandler(INVALID_CHARACTER, ch);
			if (!characterList.containsKey(ch.getText()))
				characterList.put(ch.getText(), new CharacterDescriptor(ch.getText(), 0, false));
			else
				myErrorHandler(ALREADY_DECLARED_CHARACTER, ch);
		}
		stampaPersonaggi();
		if (co == null)
			myErrorHandler(MISSING_COMMENT, co);
	}

	//////////////////////// RomanNumber.java /////////////////////////////////////
	public static boolean isRoman(String s) {
		return s.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
	}

	public static int decodeSingle(char letter) {
		switch (letter) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return 0;
		}
	}

	public static int decode(String romanNumber) {
		int result = 0;
		// loop over all but the last character
		for (int i = 0; i < romanNumber.length() - 1; i++) {
			// if this character has a lower value than the next character
			if (decodeSingle(romanNumber.charAt(i)) < decodeSingle(romanNumber.charAt(i + 1))) {
				result -= decodeSingle(romanNumber.charAt(i)); // subtract it
			} else {
				result += decodeSingle(romanNumber.charAt(i)); // add it
			}
		}
		// decode the last character, which is always added
		result += decodeSingle(romanNumber.charAt(romanNumber.length() - 1));
		return result;
	}
	//////////////////////////////////////////////////////////////////////////////////////

	// dichiarazione atto
	public void checkAct(Token rn, Token co) {
//		if (rn != null) {
//			String romanNumber = rn.getText();
//			if (!isRoman(romanNumber))
//				myErrorHandler(INVALID_ROMAN_NUMBER, rn);
//			else {
//				int newAct = decode(romanNumber);
//				if (scenicMoment > newAct) 		// già definito
//					myErrorHandler(ALREADY_DEFINED_ACT, rn);
//				else if (newAct > scenicMoment + 1) 	// salto nella numerazione
//					myErrorHandler(SKIPPED_ACT, rn);
//				else
//					scenicMoment = (int) scenicMoment + 1;
//			}
//		}
//		if (co == null)
//			myErrorHandler(MISSING_COMMENT, co);
	}

	// dichiarazione atto
	public void checkScene(Token rn, Token co) {
//		if (rn != null) {
//			String romanNumber = rn.getText();
//			if (!isRoman(romanNumber))
//				myErrorHandler(INVALID_ROMAN_NUMBER, rn);
//			else {
//				// sarebbe bello arrotondare, però va e penso che in caso di moooolte scene potrebbe dare problemi
//				double newScene = (double) decode(romanNumber) / 10;
//				if ((scenicMoment - (int) scenicMoment) > newScene) // già definita in questo atto
//					myErrorHandler(ALREADY_DEFINED_SCENE_IN_ACT, rn);
//				else if ((scenicMoment + newScene - 0.1) > (scenicMoment + 0.1)) // salto nella numerazione
//					myErrorHandler(SKIPPED_SCENE, rn);
//				else
//					scenicMoment = scenicMoment + 0.1;  // okappa
//			}
//		}
//		if (co == null)
//			myErrorHandler(MISSING_COMMENT, co);
	}

	// controlla se ci sono già due character in scena
	public boolean onStageCheck() {
		int onStageCounter = 0;
		Enumeration<String> characters = characterList.keys();
		while (characters.hasMoreElements()) {
			String character = characters.nextElement();
			CharacterDescriptor description = characterList.get(character);
			if (description.onStage) {
				if (onStageCounter < 1)
					onStageCounter++;
				else // c'è già un altro personaggio
					return true;
			}
		}
		return false; // c'è al massimo un solo personaggio
	}

	// entrata in scena
	public void checkEnter(Token ch1, Token ch2) {
		// Quanti personaggi possono entrare al massimo? due?
		// direi di sì -> onStageCheck()
		if (ch1 != null) {
			if (!onStageCheck()) { // se non ci sono già due personaggi onStage
				if (!characterList.containsKey(ch1.getText())) // dichiarato?
					myErrorHandler(UNDECLARED_CHARACTER, ch1);
				else {
					if (characterList.get(ch1.getText()).onStage) // era già in scena?
						myErrorHandler(CHARACTER_ALREADY_ON_STAGE, ch1);
					else
						characterList.get(ch1.getText()).onStage = true; // aggiorno onStage
				}
			} else
				myErrorHandler(ALREADY_TWO_CARACTERS_ON_STAGE, ch1);
		} else
			myErrorHandler(MISSING_CHARACTER, ch1);
		if (ch2 != null) {
			if (!onStageCheck()) {
				if (!characterList.containsKey(ch2.getText())) // dichiarato?
					myErrorHandler(UNDECLARED_CHARACTER, ch2);
				else {
					if (characterList.get(ch2.getText()).onStage) // era già in scena?
						myErrorHandler(CHARACTER_ALREADY_ON_STAGE, ch2);
					else
						characterList.get(ch2.getText()).onStage = true; // aggiorno onStage
				}
			} else
				myErrorHandler(ALREADY_TWO_CARACTERS_ON_STAGE, ch1);
		} else
			myErrorHandler(MISSING_CHARACTER, ch2);

		stampaPersonaggi();
	}

	// uscita di scena
	public void checkExit(Token ch) {
		if (ch != null) {
			if (!characterList.containsKey(ch.getText())) // dichiarato?
				myErrorHandler(UNDECLARED_CHARACTER, ch);
			else if (!characterList.get(ch.getText()).onStage) // esiste ma non era in scena
				myErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
			else // esce di scena -> valore (azzero o lascio)
				characterList.get(ch.getText()).onStage = false;
		} else
			myErrorHandler(MISSING_CHARACTER, ch);
	}

	// uscita di scena multipla
	public void checkExeunt(Token ch1, Token ch2) {
		if (ch1 != null)
			checkExit(ch1);
		if (ch2 != null)
			checkExit(ch2);
	}

	// operazioni svolte su/da un personaggio
	public void checkStageEvent() {
		// personaggi dichiarato?
		// personaggio era in scena?
		// aggiorno valore personaggio
	}

	public void stampaPersonaggi() {
		System.out.println("---------------");
		System.out.println("U' Guagliu':");
		for (String character : characterList.keySet())
			System.out.println("name= " + character + "\t|val= " + characterList.get(character).value + "\t|onstage= "
					+ String.valueOf(characterList.get(character).onStage));
		System.out.println("---------------");
	}

// --------------------------------------------------------------------------	

//	public void declareVar(Token t, Token v) {
//		if (t != null && v != null) {
//			String name = v.getText();
//			VarDescriptor vd = new VarDescriptor(name, t.getText());
//			if (symbolTable.containsKey(name))
//				myErrorHandler(DECLARED_VAR_ERROR, v);
//			else {
//				symbolTable.putIfAbsent(name, vd);
//				System.out.println("Hai appena dichiarato:" + name + " di tipo " + t.getText());
//			}
//		}
//	}
//
//	public void checkIncDec(Token o1, Token o2, Token id) {
//		if (o1 != null && o2 != null)
//			myErrorHandler(INC_ERROR, id);
//		else if (o1 == null && o2 == null)
//			myErrorHandler(MISS_INC_ERROR, id);
//	}
//
//	// ****
//	public boolean checkReference(Token var) {
//		if (var != null) {
//			String name = var.getText();
//			if (!symbolTable.containsKey(name))
//				myErrorHandler(UNDECLARED_VAR_ERROR, var);
//			else
//				return true;
//		}
//		return false;
//	}
//
//	public void assignValue(Token n, float v) {
//		if (n != null && checkReference(n)) {
//			String name = n.getText();
//			VarDescriptor vd = symbolTable.get(name);
//			if (vd != null)
//				vd.value = v;
//			System.out.println("Hai assegnato il valore " + v + " alla variabile " + name);
//		}
//	}
//
//	// *****
//	public float getVarValue(Token x) {
//		if (x != null && checkReference(x)) {
//			String name = x.getText();
//			VarDescriptor vd = symbolTable.get(name);
//			if (vd != null)
//				return vd.value;
//		}
//		return 0;
//	}
//
//	public float convertToFloat(Token n) { // passo un token
//		if (n != null) // controllo non sia nullo
//			return Float.parseFloat(n.getText()); // lo converto
//		return 0;
//	}
//
//	public float calculateAdd(float t1, Token op, float t2) { // valore 1' termine, token oprazione, valore 2' termine
//		float res = t1;
//		if (op != null) { // token opreatore non nullo
//			if (op.getText().equals("+")) // se il token vale "+"
//				res = t1 + t2; // allora sommo
//			else
//				res = t1 - t2; // altrimenti sottraggo
//		}
//
//		return res;
//	}
//
//	public float calculateMul(float f1, Token op, float f2) {
//		float res = f1;
//		if (op != null) {
//			if (op.getText().equals("*"))
//				res = f1 * f2;
//			else if (f2 != 0)
//				res = f1 / f2;
//			else // se denominatore divisione ==0
//				myErrorHandler(DIV_BY_ZERO_ERROR, op); // segnalo errore
//		}
//
//		return res;
//	}

}
