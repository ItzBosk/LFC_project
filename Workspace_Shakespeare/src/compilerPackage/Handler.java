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
	public static int MISSING_CHARACTER_IN_MULTIPLE_ENTER = 20;
	public static int MISSING_CHARACTER_IN_MULTIPLE_EXIT = 21;
	public static int MISSING_CHARACTER_IN_ENTER = 22;
	public static int MISSING_CHARACTER_IN_EXIT = 23;
	public static int MISSING_AND_IN_MULTIPLE_EXIT = 24;
	public static int MISSING_AND_IN_MULTIPLE_ENTER = 25;

	TokenStream input; // mi rappresenta lo scanner
	List<String> errorList; // lista in cui registro errori

	Hashtable<String, CharacterDescriptor> characterList; // character, value, on stage or not
	Iterator<Map.Entry<String, CharacterDescriptor>> it; // per exeunt multipla.
	int actNumber;
	int sceneNumber;
	int adjectiveCounter;

	public Handler(TokenStream input) {
		this.input = input;
		errorList = new ArrayList<String>();
		characterList = new Hashtable<String, CharacterDescriptor>(101);
		actNumber = 0;
		sceneNumber = 0;
		adjectiveCounter = 0;
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
		else if (code == MISSING_CHARACTER_IN_MULTIPLE_ENTER)
			errMsg += "One character is missing in multiple entrance";
		else if (code == MISSING_CHARACTER_IN_MULTIPLE_EXIT)
			errMsg += "One character is missing in multiple exit";
		else if (code == MISSING_CHARACTER_IN_ENTER)
			errMsg += "Character missing in entrance";
		else if (code == MISSING_CHARACTER_IN_EXIT)
			errMsg += "One character is missing in exit";
		else if (code == MISSING_AND_IN_MULTIPLE_EXIT)
			errMsg += "AND is missing in multiple exit";
		else if (code == MISSING_AND_IN_MULTIPLE_ENTER)
			errMsg += "AND is missing in multiple entrance";

		errorList.add(errMsg);
	}

	// controlla titolo
	public void checkTitle( Token d) { // t=testo, d=dot
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
		title += ch.getText()+" ";
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

	// entrata in scena
	public void checkEnter(Token ch1, Token and, Token ch2) {
		if (ch1 != null) {
			if (and != null && ch2 != null) { // entrata doppia
				// ch1
				if (!onStageCheck()) {
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

				// ch2
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
					myErrorHandler(ALREADY_TWO_CARACTERS_ON_STAGE, ch2);
			} else {
				if (and == null && ch2 == null) { // entrata singola
					if (!onStageCheck()) {
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
				} else {
					// entrata doppia ma manca qualcosa
					if (and == null)
						myErrorHandler(MISSING_AND_IN_MULTIPLE_ENTER, and);
					if (ch2 == null)
						myErrorHandler(MISSING_CHARACTER_IN_MULTIPLE_ENTER, ch2);
				}
			}
		} else
			myErrorHandler(MISSING_CHARACTER_IN_ENTER, ch1);
		System.out.println("----------------------------   Entering "+ Util.evenSpacer(ch1.getText(),9) +" --------------------------");
		if(ch2 != null) 
			System.out.println("----------------------------   Entering "+ Util.evenSpacer(ch2.getText(),9) +" --------------------------");
		printCharacters();
	}

	// uscita di scena
	public void checkExit(Token ch, boolean print) {
		if (ch != null) {
			if (!characterList.containsKey(ch.getText())) // dichiarato?
				myErrorHandler(UNDECLARED_CHARACTER, ch);
			else if (!characterList.get(ch.getText()).onStage) // esiste ma non era in scena
				myErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
			else // esce di scena -> valore (azzero o lascio)
				characterList.get(ch.getText()).onStage = false;
		} else
			myErrorHandler(MISSING_CHARACTER_IN_EXIT, ch);
		if(print)
			{System.out.println("---------------------------- Exiting "+ Util.evenSpacer(ch.getText(),9) +" ----------------------------");
		printCharacters();}
	}
	public void checkExit(Token ch) {checkExit(ch,true);}
	

	// uscita di scena multipla
	public void checkExeunt(Token ch1, Token and, Token ch2) {
		// exeunt multipla, fa uscire tutti i personaggi on stage
		if (ch1 == null && and == null && ch2 == null) {
			while (it.hasNext()) {
				Map.Entry<String, CharacterDescriptor> entry = it.next();
				entry.getValue().onStage = false;
			}
			return;
		} else {
			// uscita doppia
			if (ch1 != null && and != null && ch2 != null) { // ch1 AND ch2
				checkExit(ch1,false);
				checkExit(ch2,false);
				System.out.println("---------------------------- Exiting "+ Util.evenSpacer(ch1.getText(),9) +" -----------------------------");
				System.out.println("---------------------------- Exiting "+ Util.evenSpacer(ch2.getText(),9) +" -----------------------------");
				printCharacters();
				return;
			}

			// uscita doppia ma manca qualcosa
			if (ch1 == null) {
				myErrorHandler(MISSING_CHARACTER_IN_MULTIPLE_EXIT, ch1);
				if (and == null)
					myErrorHandler(MISSING_AND_IN_MULTIPLE_EXIT, and);
				if (ch2 == null)
					myErrorHandler(MISSING_CHARACTER_IN_MULTIPLE_EXIT, ch2);
			} else {
				if (and == null)
					myErrorHandler(MISSING_AND_IN_MULTIPLE_EXIT, and);
				if (ch2 == null)
					myErrorHandler(MISSING_CHARACTER_IN_MULTIPLE_EXIT, ch2);
			}
		}
		printCharacters();
	}

	// operazioni svolte su/da un personaggio
	public void checkStageEvent(Token ch1, Token noun) {
		if (!characterList.containsKey(ch1.getText())) // dichiarato prima?
			myErrorHandler(UNDECLARED_CHARACTER, ch1);
		else {
			if (!characterList.get(ch1.getText()).onStage) // on stage?
				myErrorHandler(CHARACTER_NOT_ON_STAGE, ch1);
		}

		// check se e quale altro ch è in scena e aggiorno value
		if (onStageCheck()) {
			String updateCh = otherCharacter(ch1);
			if (noun.getType() == ShakespeareLexer.POSITIVENOUN || noun.getType() == ShakespeareLexer.NEUTRALNOUN) {
				characterList.get(updateCh).value = (int) Math.pow(2, adjectiveCounter);
			} else
				characterList.get(updateCh).value = -1 * (int) Math.pow(2, adjectiveCounter);
			adjectiveCounter = 0;
		} else
			myErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch1);
		
		//da capire dove mettere sta parte
		System.out.println("------------------------------ STAGE EVENT ---------------------------------");
		System.out.println("   - Actor: \t\t" + ch1.getText());
		System.out.println("   - Noun: \t" + noun.getText()+ "\n");

	}

	public void printCharacters() {
		System.out.println("	State of the characters:");
		System.out.println("	-------------------------------------");
		System.out.println("	|NAME             |VALUE  |ON STAGE |");
		for (String character : characterList.keySet()) {
			var stringa = "	|" + character;
			var count = 17 - character.length();
			while (count != 0) {
				stringa += ' ';
				count--;
			}
			;
			if (characterList.get(character).value > 9999)
				stringa += "|" + 9999; // Viene filtrata solo la stampa e non il valore vero
			else
				stringa += "|" + characterList.get(character).value;
			count = 7 - String.valueOf(characterList.get(character).value).length();
			while (count != 0) {
				stringa += ' ';
				count--;
			}
			;
			if (String.valueOf(characterList.get(character).onStage) == "false")
				stringa += "|" + String.valueOf(characterList.get(character).onStage) + "    |";
			else
				stringa += "|" + String.valueOf(characterList.get(character).onStage) + "     |";
			System.out.println(stringa);
		}
		System.out.println("	-------------------------------------");
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
