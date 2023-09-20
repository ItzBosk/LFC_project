package compilerPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import antlr.Parser;
import compilerPackage.temp.Shakespeare;
import compilerPackage.util.CharacterDescriptor;
import compilerPackage.util.RomanNumber;
import compilerPackage.util.Util;

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
	public static int UNDECLARED_CHARACTER = 5;
	public static int INVALID_CHARACTER = 6;
	public static int MISSING_COMMENT = 7;
	public static int ALREADY_DECLARED_CHARACTER = 8;
	public static int MISSING_ACT_NUMBER = 9;
	public static int INVALID_ROMAN_NUMBER = 10;
	public static int ALREADY_DEFINED_ACT = 11;
	public static int MISSING_SCENE_NUMBER = 12;
	public static int ALREADY_DEFINED_SCENE_IN_ACT = 13;
	public static int SKIPPED_ACT = 14;
	public static int SKIPPED_SCENE = 15;
	public static int CHARACTER_ALREADY_ON_STAGE = 16;
	public static int ALREADY_TWO_CARACTERS_ON_STAGE = 17;
	public static int CHARACTER_NOT_ON_STAGE = 18;
	public static int ONLY_ONE_CHARACTER_ON_STAGE = 19;
	public static int MISSING_CHARACTER_IN_ENTER = 20;
	public static int MISSING_CHARACTER_IN_EXIT = 21;
	public static int EXEUNT_SINGLE_CHARACTER = 22;

	TokenStream input; // mi rappresenta lo scanner
	List<String> errorList; // lista in cui registro errori

	Hashtable<String, CharacterDescriptor> characterList; // character, value, on stage or not
	Iterator<Map.Entry<String, CharacterDescriptor>> it; // per exeunt multipla.
	int actNumber;
	int sceneNumber;
	int adjectiveCounter;
	boolean checkError; // rimesso a false all'inizio di ogni metodo
	gotoHandler goTo = new gotoHandler();

	public Handler(TokenStream input) {
		this.input = input;
		errorList = new ArrayList<String>();
		characterList = new Hashtable<String, CharacterDescriptor>(101);
		actNumber = 0;
		sceneNumber = 0;
		adjectiveCounter = 0;
		checkError = false;
		it = characterList.entrySet().iterator();
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
		checkError = true; // c'è sicuramente un errore
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
		else if (code == UNDECLARED_CHARACTER)
			errMsg += "Missing character name in declaration";
		else if (code == INVALID_CHARACTER)
			errMsg += "Invalid character name";
		else if (code == MISSING_COMMENT)
			errMsg += "Missing comment";
		else if (code == ALREADY_DECLARED_CHARACTER)
			errMsg += "The character has been already declared";
		else if (code == MISSING_ACT_NUMBER)
			errMsg += "The act number is missing";
		else if (code == INVALID_ROMAN_NUMBER)
			errMsg += "The number is not a roman one";
		else if (code == ALREADY_DEFINED_ACT)
			errMsg += "Already defined act";
		else if (code == MISSING_SCENE_NUMBER)
			errMsg += "The scene number is missing";
		else if (code == ALREADY_DEFINED_SCENE_IN_ACT)
			errMsg += "Already defined scene in this act";
		else if (code == SKIPPED_ACT)
			errMsg += "Skipped one or more acts in numeration";
		else if (code == SKIPPED_SCENE)
			errMsg += "Skipped one or more scenes in this act in numeration";
		else if (code == UNDECLARED_CHARACTER)
			errMsg += "Character never declared";
		else if (code == CHARACTER_ALREADY_ON_STAGE)
			errMsg += "Character already on stage";
		else if (code == ALREADY_TWO_CARACTERS_ON_STAGE)
			errMsg += "There are already two characters on stage";
		else if (code == CHARACTER_NOT_ON_STAGE)
			errMsg += "The character is not on stage";
		else if (code == ONLY_ONE_CHARACTER_ON_STAGE)
			errMsg += "There is only one character on stage";
		else if (code == MISSING_CHARACTER_IN_ENTER)
			errMsg += "Character missing in entrance";
		else if (code == MISSING_CHARACTER_IN_EXIT)
			errMsg += "One character is missing in exit";
		else if (code == EXEUNT_SINGLE_CHARACTER)
			errMsg += "Single exit is not allowed with Exeunt, use Exit instead";

		errorList.add(errMsg);
	}

	// controlla titolo
	public void checkTitle(Token d) { // t=testo, d=dot
		try {
			if (title == null) {
				myErrorHandler(MISSING_TITLE, null);
			} else if (!d.getText().equals(".")) {
				myErrorHandler(MISSING_DOT, d);
			} else {
				System.out.println("\n\n");
				System.out.println("==================================== TITLE =================================");
				System.out.println(Util.middleSpacer(title, 77));
				System.out.println("============================================================================\n");
			}
		} catch (NullPointerException ex) {
			System.err.println(ex.toString());
			myErrorHandler(MISSING_TITLE, null);
		}
	}

	public static String title = "";

	public void buildTitle(Token ch) {
		title += ch.getText() + " ";
	}

	// dramatisPersonae
	public void checkPersonae(Token ch, Token co) { // ch=characters, co=comment
		if (ch == null)
			myErrorHandler(UNDECLARED_CHARACTER, ch);
		else {
			// controllo se token corrisponde a token CHARACTERS
			if (ch.getType() != ShakespeareLexer.CHARACTER)
				myErrorHandler(INVALID_CHARACTER, ch);
			if (!characterList.containsKey(ch.getText()))
				characterList.put(ch.getText(), new CharacterDescriptor(ch.getText(), 0, false));
			else
				myErrorHandler(ALREADY_DECLARED_CHARACTER, ch);
		}
		if (co == null)
			myErrorHandler(MISSING_COMMENT, co);
		System.out.println("--------------------------------- NEW ACTOR --------------------------------");
		System.out.println("   - Name: \t\t" + ch.getText());
		System.out.println("   - Description: \t" + co.getText().substring(2, co.getText().length() - 3) + "\n");
		printCharacters();
		System.out.println("\n----------------------------------------------------------------------------\n");

	}

	// dichiarazione atto
	public void checkAct(Token rn, Token co) {
		if (rn != null) {
			String romanNumber = rn.getText();
			if (!RomanNumber.isRoman(romanNumber))
				myErrorHandler(INVALID_ROMAN_NUMBER, rn);
			else {
				int newAct = RomanNumber.decode(romanNumber);
				if (newAct <= actNumber) // già definito
					myErrorHandler(ALREADY_DEFINED_ACT, rn);
				else if (newAct > actNumber + 1) // salto nella numerazione
					myErrorHandler(SKIPPED_ACT, rn);
				else {
					if (co == null)
						myErrorHandler(MISSING_COMMENT, co);
					else {
						actNumber++;
						sceneNumber = 0;
						//goTo.print();////urca
						goTo.clearLog();
						System.out.println("===============================    ACT " + Util.evenSpacer(actNumber, 3)
								+ "   ===============================");
						System.out.println(Util.middleSpacer(co.getText().substring(2, co.getText().length() - 3), 77));
						System.out.println(
								"============================================================================\n");
					}
				}
			}
		} else
			myErrorHandler(MISSING_ACT_NUMBER, rn);
	}

	// dichiarazione scena
	public void checkScene(Token rn, Token co) {
		if (rn != null) {
			String romanNumber = rn.getText();
			if (!RomanNumber.isRoman(romanNumber))
				myErrorHandler(INVALID_ROMAN_NUMBER, rn);
			else {
				int newScene = RomanNumber.decode(romanNumber);
				if (newScene == newScene + 1) // già definito
					myErrorHandler(ALREADY_DEFINED_SCENE_IN_ACT, rn);
				else if (newScene > sceneNumber + 1) // salto nella numerazione
					myErrorHandler(SKIPPED_SCENE, rn);
				else {
					if (co == null)
						myErrorHandler(MISSING_COMMENT, co);
					else {
						sceneNumber++;
						System.out.println("==============================    SCENE " + Util.evenSpacer(sceneNumber, 3)
								+ "   ==============================");
						System.out.println(Util.middleSpacer(co.getText().substring(2, co.getText().length() - 3), 77));
						System.out.println(
								"============================================================================");
						System.out.println();
					}
				}
			}
		} else
			myErrorHandler(MISSING_SCENE_NUMBER, rn);
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

	// trova quale altro personaggio è in scena
	public String otherCharacter(Token ch1) {
		Enumeration<String> characters = characterList.keys();
		while (characters.hasMoreElements()) {
			String character = characters.nextElement();
			CharacterDescriptor description = characterList.get(character);
			if (description.onStage && (!description.name.equals(ch1.getText()))) {
				return description.name;
			}
		}
		return null;
	}

	public void checkEntrance(Token ch) {
		checkError = false;
		if (!onStageCheck()) {
			if (!characterList.containsKey(ch.getText())) // dichiarato?
				myErrorHandler(UNDECLARED_CHARACTER, ch);
			else {
				if (characterList.get(ch.getText()).onStage) // era già in scena?
					myErrorHandler(CHARACTER_ALREADY_ON_STAGE, ch);
				else
					characterList.get(ch.getText()).onStage = true; // aggiorno onStage
			}
		} else
			myErrorHandler(ALREADY_TWO_CARACTERS_ON_STAGE, ch);
	}

	// entrata in scena
	public void checkEnter(Token ch1, Token and, Token ch2) {
		checkError = false;
		if (ch1 != null) {
			if (and != null && ch2 != null) { // entrata doppia
				checkEntrance(ch1);
				checkEntrance(ch2);
			} else {
				// entrata singola
				if (and == null && ch2 == null)
					checkEntrance(ch1);
			}
		} else
			myErrorHandler(MISSING_CHARACTER_IN_ENTER, ch1);

		if (checkError == false) {
			System.out.println("---------------------------- " + Util.middleSpacer("Entering " + ch1.getText(), 18)
					+ " ----------------------------");
			if (ch2 != null)
				System.out.println("---------------------------- " + Util.middleSpacer("Entering " + ch2.getText(), 18)
					+ " ----------------------------");
			printCharacters();
		}
	}
	
	// uscita di scena
	public void checkExit(Token ch, boolean print) {
		checkError = false;
		if (ch != null) {
			if (!characterList.containsKey(ch.getText())) // dichiarato?
				myErrorHandler(UNDECLARED_CHARACTER, ch);
			else if (!characterList.get(ch.getText()).onStage) // esiste ma non era in scena
				myErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
			else // esce di scena -> valore (azzero o lascio)
				characterList.get(ch.getText()).onStage = false;
		} else
			myErrorHandler(MISSING_CHARACTER_IN_EXIT, ch);
		if (print && !checkError) {
			System.out.println("---------------------------- " + Util.middleSpacer("Exiting " + ch.getText(), 17)
					+ " -----------------------------");
			printCharacters();
		}

	}

	public void checkExit(Token ch) {
		checkExit(ch, true);
	}

	// uscita di scena multipla
	public void checkExeunt(Token ch1, Token and, Token ch2) {
		checkError = false;
		// exeunt multipla, fa uscire tutti i personaggi on stage
		if (ch1 == null && and == null && ch2 == null) {
			for(String str : characterList.keySet()) {
				characterList.get(str).onStage = false;
				System.out.println("--------------------------- " + Util.middleSpacer("Exiting " + str,17)
				+ " -----------------------------");
			}
			printCharacters();
		}
		// uscita doppia
		if (ch1 != null) {
			if (and != null && ch2 != null) { // ch1 AND ch2
				checkExit(ch1, false);
				checkExit(ch2, false);
				if (!checkError) {
					checkExit(ch2, false);
					System.out.println("--------------------------- " + Util.middleSpacer("Exiting " + ch1.getText(), 17)
							+ " -----------------------------");
					System.out.println("--------------------------- " + Util.middleSpacer("Exiting " + ch2.getText(), 17)
							+ " -----------------------------");
					System.out.print("\n");
					printCharacters();
				}
			}
			else
				myErrorHandler(EXEUNT_SINGLE_CHARACTER, ch1);
		}
	}

	// operazioni svolte su/da un personaggio
	public void checkStageEvent(Token ch1,Token noun1,Token noun2,Token noun3,Token noun4) {
		checkError = false;
		if (!characterList.containsKey(ch1.getText())) // dichiarato prima?
			myErrorHandler(UNDECLARED_CHARACTER, ch1);
		else {
			if (!characterList.get(ch1.getText()).onStage) // on stage?
				myErrorHandler(CHARACTER_NOT_ON_STAGE, ch1);
		}

		// check se e quale altro ch è in scena e aggiorno value
		if (onStageCheck()) {
			String updateCh = otherCharacter(ch1);
			
			if(noun1 != null && noun2 == null && noun3 == null && noun4 == null) {
				//1' tipologia di frase
				if (noun1.getType() == ShakespeareLexer.POSITIVENOUN || noun1.getType() == ShakespeareLexer.NEUTRALNOUN) {
					characterList.get(updateCh).value = (int) Math.pow(2, adjectiveCounter);
					goTo.newLog(sceneNumber, updateCh, 1,characterList.get(updateCh).value );
				} else {
					characterList.get(updateCh).value = -1 * (int) Math.pow(2, adjectiveCounter);
					goTo.newLog(sceneNumber, updateCh, 1,characterList.get(updateCh).value );
				}
				adjectiveCounter = 0;
			}
			else if(noun1 == null && noun2 != null && noun3 != null && noun4 == null) {
				//2' tipologia di frase
			}
			else if(noun1 == null && noun2 == null && noun3 == null && noun4 != null) {
				//3' tipologia di frase
			}
			else {
				//errore. non rientra in nessuna tipologia.
			}
		} else
			myErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch1);

		
		// da capire dove mettere sta parte --> PROVA DI CONTE, da sistemare e tutto
		if (checkError == false && noun1 != null) {
			System.out.println("------------------------------ STAGE EVENT 1' frase ---------------------------------");
			System.out.println("   - Actor: \t\t" + ch1.getText());
			System.out.println("   - Phrase: \t\t" + noun1.getText() + "\n");
		}
		else if (checkError == false && noun2 != null && noun3 != null) {
			System.out.println("------------------------------ STAGE EVENT 2' frase ---------------------------------");
			System.out.println("   - Actor: \t\t" + ch1.getText());
			System.out.println("   - Phrase: \t\t" + noun2.getText() + "\n");
			System.out.println("   - Phrase: \t\t" + noun3.getText() + "\n");
		}
		else if (checkError == false && noun4 != null) {
			System.out.println("------------------------------ STAGE EVENT 3' frase ---------------------------------");
			System.out.println("   - Actor: \t\t" + ch1.getText());
			System.out.println("   - Phrase: \t\t" + noun4.getText() + "\n");
		}
		

	}

	public void printCharacters() {
		System.out.println("	         State of the characters:");
		System.out.println("	         -------------------------------------");
		System.out.println("	         |NAME             |VALUE  |ON STAGE |");
		for (String character : characterList.keySet()) {
			var stringa = "	         |" + Util.evenSpacer(character, 17);
			if (characterList.get(character).value > 9999)
				stringa += "|" + 9999; // Viene filtrata solo la stampa e non il valore vero
			else
				stringa += "|" + Util.evenSpacer(characterList.get(character).value,7);
			stringa += "|" + Util.evenSpacer(String.valueOf(characterList.get(character).onStage),9) + "|";
			System.out.println(stringa);
		}
		System.out.println("	         -------------------------------------");
	}

	
	/////urca
	private class loggedAction {
		int scene;
		String character;
		int assignedValue;
		int actionType; //Switch che utilizzo per capire di che tipo e' l'azione salvata nel log
				///////
				// 1 -> Settaggio del character ad un value
				// 2 -> Speak your mind che stampa il valore di un character in console
				// 3 ->
				///////
		
		public loggedAction(int scene,String character,int actionType, int assignedValue) {
			this.scene = scene;
			this.character = character;
			this.assignedValue = assignedValue;
			this.actionType = actionType;
		}
		
	}
	
	
	private  class gotoHandler {
		 ArrayList<loggedAction> logList = new ArrayList<loggedAction>();
		
		public  void newLog(int Scene, String CharacterName, int ActionType, int AssignedValue) {
			logList.add(new loggedAction(Scene,CharacterName,ActionType,AssignedValue));
		}
		
		public void clearLog() {
			logList.clear();
		}
		
		public void Jump(int scene) {
			for(loggedAction singleLog : logList) {
				if(singleLog.scene>= scene)
				{
					switch(singleLog.actionType) {
					case 1:
						characterList.get(singleLog.character).value = singleLog.assignedValue;
						break;
					case 2:
						//System.out.println("IL TIPO DICE COSE");
						break;
					}
				}
			}
		}
		
		public void print() {
			for(loggedAction singleLog : logList) {
				System.out.println("Scene: "+singleLog.scene+", Character: "+singleLog.character+"\t, Action: "+singleLog.actionType+", Value: "+singleLog.assignedValue);
			}
		}
		
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
