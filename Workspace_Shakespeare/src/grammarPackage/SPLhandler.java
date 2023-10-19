package grammarPackage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

import org.antlr.grammar.v3.ANTLRParser.exceptionGroup_return;
import org.antlr.grammar.v3.ANTLRParser.tokenSpec_return;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import antlr.Parser;
import interfacePackage.SPLinterrface;
import outputPackage.HtmlToPDF;
import utilityPackage.CharacterDescriptor;
import utilityPackage.RomanNumber;
import utilityPackage.Util;

public class SPLhandler {

	// generic errors
	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;

	// Shakespeare errors
	public static int MISSING_TITLE = 3;
	public static int MISSING_DOT = 4;
	public static int INVALID_DECLARATION = 5;
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
	public static int MISSING_IF_STATEMENT = 23;
	public static int EMPTY_STACK = 24;
	public static int INVALID_ASCII_OUTPUT = 25;
	public static int INVALID_INT_INPUT = 26;
	public static int UNDECLARED_CHARACTER = 27;
	public static int NO_MULTIPLE_ASCII_INPUT = 28;
	public static int INVALID_ASCII_INPUT = 29;
	public static int NO_EOF = 30;

	public static String userInput;
	public static String[] userInputSplitted;
	public static int effectiveInput; // user input
	public static int neededInput; // required input by the program
	TokenStream input; // scanner of the input file

	List<String> errorList; // errors log
	Hashtable<String, CharacterDescriptor> stageCharacterList;
	Iterator<Map.Entry<String, CharacterDescriptor>> it; // for multiple Exeunt
	int actNumber; // current act
	int sceneNumber; // current scene
	int adjectiveCounter; // counter for adjective is assigment
	int adjectiveCounter2; // counter for adjective is assigmentOperation
	boolean checkError; // checks for occures errros in every checkMethod
	gotoHandler goTo = new gotoHandler();
	String execOutput; // progressive building of the output
	String adjString = "";
	String adjString2 = "";

	public SPLhandler(TokenStream input) {
		// input managing
		neededInput = 0;
		userInput = SPLinterrface.getUserInput().replaceAll("\\s", ""); // remove white spaces
		if (userInput.length() == 0) // avoid problems with split function
			effectiveInput = 0;

		else {
			userInputSplitted = userInput.split(",");
			effectiveInput = userInputSplitted.length;
		}

		this.input = input;
		errorList = new ArrayList<String>();
		stageCharacterList = new Hashtable<String, CharacterDescriptor>(101);
		actNumber = 0;
		sceneNumber = 0;
		adjectiveCounter = 0;
		adjectiveCounter2 = 0;
		checkError = false;
		it = stageCharacterList.entrySet().iterator();
		execOutput = "";
	}

	// error list printed by the Parser
	public List<String> getErrorList() {
		return errorList;
	}

	// management of syntactic and lexical errors (transformed into syntactic)
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			if (input.LT(-1) == null)
				tk = input.LT(+1);
			else
				tk = input.LT(-1);

		if (tk.getType() == ShakespeareLexer.ERROR_TK)
			errMsg = "Lexical Error " + LEXICAL_ERROR;
		else {
			errMsg = "Syntax Error " + SYNTAX_ERROR;
			if (tk.getType() == ShakespeareLexer.EOF) {
				errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: " + " on token '"
						+ input.LT(-1).getText() + "' : You cannot end a program like this. You should instead continue the current scene or start another act/scene";
				errorList.add(errMsg);
				return;
			}
				
		}
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: " + " on token '"
				+ tk.getText() + "'";
		errorList.add(errMsg); // error message
	}

	// management of semantic errors
	void dramaErrorHandler(int code, Token tk) {
		checkError = true; // there is certainly an error
		String errMsg;
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error " + code;

		// managing error at the beginning of the file
		if (tk == null)
			if (input.LT(-1) == null)
				tk = input.LT(+1);
			else
				tk = input.LT(-1);
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine() + 1) + "]: ";

		// Shakespeare errors
		if (code == MISSING_TITLE)
			errMsg += "Missing title";
		else if (code == MISSING_DOT)
			errMsg += "Missing dot after " + input.LT(-1).getText();
		else if (code == INVALID_DECLARATION)
			errMsg += "Missing stage character name in declaration";
		else if (code == INVALID_CHARACTER)
			errMsg += tk.getText() + " is an invalid stage character name";
		else if (code == MISSING_COMMENT)
			errMsg += "Missing comment after " + input.LT(-1).getText();
		else if (code == ALREADY_DECLARED_CHARACTER)
			errMsg += "The stage character " + tk.getText() + " has already been declared";
		else if (code == MISSING_ACT_NUMBER)
			errMsg += "The act number is missing";
		else if (code == INVALID_ROMAN_NUMBER)
			errMsg += "The inserted number " + tk.getText() + " is not roman";
		else if (code == ALREADY_DEFINED_ACT)
			errMsg += "The act " + RomanNumber.decode(tk.getText()) + " has already been declared";
		else if (code == MISSING_SCENE_NUMBER)
			errMsg += "The scene number is missing";
		else if (code == ALREADY_DEFINED_SCENE_IN_ACT)
			errMsg += "The scene " + RomanNumber.decode(tk.getText()) + " has already been declared in act "
					+ actNumber;
		else if (code == SKIPPED_ACT)
			errMsg += "Skipped " + (RomanNumber.decode(tk.getText()) - actNumber)
					+ " acts: the last declared act is the " + actNumber + ", you are now going to act "
					+ RomanNumber.decode(tk.getText());
		else if (code == SKIPPED_SCENE)
			errMsg += "Skipped " + (RomanNumber.decode(tk.getText()) - sceneNumber) + " scenes in act " + actNumber
					+ ": the last declared scene is the " + sceneNumber + ", you are now going to scene "
					+ RomanNumber.decode(tk.getText());
		else if (code == UNDECLARED_CHARACTER)
			errMsg += "The stage character " + tk.getText() + " has never been declared";
		else if (code == CHARACTER_ALREADY_ON_STAGE)
			errMsg += "The stage character " + tk.getText() + " is already on stage";
		else if (code == ALREADY_TWO_CARACTERS_ON_STAGE)
			errMsg += "There are already two stage characters on stage, " + tk.getText() + " cannot enter";
		else if (code == CHARACTER_NOT_ON_STAGE)
			errMsg += "The stage character " + tk.getText() + " is not on stage";
		else if (code == ONLY_ONE_CHARACTER_ON_STAGE)
			errMsg += tk.getText() + " is the only stage character on stage";
		else if (code == MISSING_CHARACTER_IN_ENTER)
			errMsg += "Stage character missing in entrance";
		else if (code == MISSING_CHARACTER_IN_EXIT)
			errMsg += "Missing stage character name in exit";
		else if (code == EXEUNT_SINGLE_CHARACTER)
			errMsg += "Single exit is not allowed with Exeunt, instead use Exit or add another stage character besides "
					+ tk.getText();
		else if (code == MISSING_IF_STATEMENT)
			errMsg += "Missing 'If so' or 'If not' statement";
		else if (code == EMPTY_STACK)
			errMsg += "The stack of " + tk.getText() + " is empty, cannot assign a new value to stage character";
		else if (code == INVALID_INT_INPUT)
			errMsg += "The value inserted for " + secondStageCharacter(tk) + " is not an integer value";
		else if (code == INVALID_ASCII_INPUT)
			errMsg += "The inserted ASCII character for " + secondStageCharacter(tk) + " is not valid";
		else if (code == INVALID_ASCII_OUTPUT)
			errMsg += "Does not exist a valid ASCII character corresponding to "
					+ stageCharacterList.get(secondStageCharacter(tk)).getValue();
		else if (code == NO_MULTIPLE_ASCII_INPUT)
			errMsg += "The inserted ASCII character for " + secondStageCharacter(tk)
					+ " is not valid, only single character input is allowed";
		else if (code == NO_EOF)
			errMsg += "You cannot end a program like this " + tk.getText();

		errorList.add(errMsg);
	}

	public void checkTitle(Token d) {
		try {
			if (title == null) {
				dramaErrorHandler(MISSING_TITLE, null);
			} else if (!d.getText().equals(".")) {
				dramaErrorHandler(MISSING_DOT, d);
			} else {
				System.out.println("\n\n");
				System.out.println("==================================== TITLE =================================");
				System.out.println(Util.middleSpacer(title, 72));
				System.out.println("============================================================================\n");
				HtmlToPDF.HTML.addTitle(title);
				HtmlToPDF.HTML.reset();
				title = "";
			}
		} catch (NullPointerException ex) {
			System.err.println(ex.toString());
			dramaErrorHandler(MISSING_TITLE, null);
		}
	}

	public static String title = "";

	public void buildTitle(Token ch) {
		title += ch.getText() + " ";
	}

	public void checkPersonae(Token ch, Token co) {
		checkError = false;
		if (ch == null)
			dramaErrorHandler(INVALID_DECLARATION, ch);
		else {
			if (ch.getType() != ShakespeareLexer.CHARACTER)
				dramaErrorHandler(INVALID_CHARACTER, ch);
			if (!stageCharacterList.containsKey(ch.getText()))
				stageCharacterList.put(ch.getText(), new CharacterDescriptor(ch.getText()));
			else
				dramaErrorHandler(ALREADY_DECLARED_CHARACTER, ch);
		}
		if (co == null)
			dramaErrorHandler(MISSING_COMMENT, co);

		if (!checkError) {
			System.out.println("--------------------------------- NEW ACTOR --------------------------------");
			System.out.println("   - Name: \t\t" + ch.getText());
			System.out.println("   - Description: \t" + co.getText().substring(2, co.getText().length() - 2) + "\n");
			printCharacters();
			System.out.println("\n----------------------------------------------------------------------------\n");
			HtmlToPDF.HTML.addPersonae(ch.getText());
		}
	}

	public void checkAct(Token rn, Token co) {
		checkError = false;
		if (rn != null) {
			String romanNumber = rn.getText();
			if (!RomanNumber.isRoman(romanNumber))
				dramaErrorHandler(INVALID_ROMAN_NUMBER, rn);
			else {
				int newAct = RomanNumber.decode(romanNumber);
				if (newAct <= actNumber)
					dramaErrorHandler(ALREADY_DEFINED_ACT, rn);
				else if (newAct > actNumber + 1)
					dramaErrorHandler(SKIPPED_ACT, rn);
				else {
					if (co == null)
						dramaErrorHandler(MISSING_COMMENT, co);
				}
			}
		} else
			dramaErrorHandler(MISSING_ACT_NUMBER, rn);

		if (!checkError) {
			actNumber++;
			sceneNumber = 0;
			if (goTo.logList.size() != 0)
				System.out.println("Goto List");
//			goTo.print();
			goTo.clearLog();
			System.out.println("===============================    ACT " + Util.evenSpacer(actNumber, 3)
					+ "   ===============================");
			System.out.println(Util.middleSpacer(co.getText().substring(2, co.getText().length() - 3), 72));
			System.out.println("============================================================================\n");
			HtmlToPDF.HTML.addAct(String.valueOf(actNumber), co.getText().substring(2, co.getText().length() - 3));
		}
	}

	public void checkScene(Token rn, Token co) {
		if (rn != null) {
			String romanNumber = rn.getText();
			if (!RomanNumber.isRoman(romanNumber))
				dramaErrorHandler(INVALID_ROMAN_NUMBER, rn);
			else {
				int newScene = RomanNumber.decode(romanNumber);
				if (newScene == newScene + 1)
					dramaErrorHandler(ALREADY_DEFINED_SCENE_IN_ACT, rn);
				else if (newScene > sceneNumber + 1)
					dramaErrorHandler(SKIPPED_SCENE, rn);
				else {
					if (co == null)
						dramaErrorHandler(MISSING_COMMENT, co);
				}
			}
		} else
			dramaErrorHandler(MISSING_SCENE_NUMBER, rn);

		if (!checkError) {
			sceneNumber++;
			System.out.println("==============================    SCENE " + Util.evenSpacer(sceneNumber, 3)
					+ "   ==============================");
			System.out.println(Util.middleSpacer(co.getText().substring(2, co.getText().length() - 3), 72));
			System.out.println("============================================================================");
			System.out.println();
			HtmlToPDF.HTML.addScene(String.valueOf(sceneNumber), co.getText().substring(2, co.getText().length() - 3));
		}
	}

	// check if there are 2 stage characters on stage
	public boolean onStageCheck() {
		int onStageCounter = 0;
		Enumeration<String> stageCharacters = stageCharacterList.keys();
		while (stageCharacters.hasMoreElements()) {
			String character = stageCharacters.nextElement();
			CharacterDescriptor description = stageCharacterList.get(character);
			if (description.onStage) {
				if (onStageCounter < 1)
					onStageCounter++;
				else // there is another stage character
					return true;
			}
		}
		return false; // there is at most only one stage character
	}

	// find which other stage character is in the scene
	public String secondStageCharacter(Token ch1) {
		Enumeration<String> stageCharacters = stageCharacterList.keys();
		while (stageCharacters.hasMoreElements()) {
			String character = stageCharacters.nextElement();
			CharacterDescriptor description = stageCharacterList.get(character);
			if (description.onStage && (!description.name.equals(ch1.getText()))) {
				return description.name;
			}
		}
		return null;
	}

	public void checkEntrance(Token ch) {
		checkError = false;
		if (!onStageCheck()) {
			if (!stageCharacterList.containsKey(ch.getText()))
				dramaErrorHandler(UNDECLARED_CHARACTER, ch);
			else {
				if (stageCharacterList.get(ch.getText()).onStage)
					dramaErrorHandler(CHARACTER_ALREADY_ON_STAGE, ch);
				else
					stageCharacterList.get(ch.getText()).onStage = true;
			}
		} else
			dramaErrorHandler(ALREADY_TWO_CARACTERS_ON_STAGE, ch);
	}

	public void checkEnter(Token ch1, Token and, Token ch2) {
		checkError = false;
		if (ch1 != null) {
			if (and != null && ch2 != null) { // multiple entrance
				checkEntrance(ch1);
				checkEntrance(ch2);
			} else { // single entrance
				if (and == null && ch2 == null)
					checkEntrance(ch1);
			}
		} else
			dramaErrorHandler(MISSING_CHARACTER_IN_ENTER, ch1);

		if (!checkError) {
			System.out.println("---------------------------- " + Util.middleSpacer("Entering " + ch1.getText(), 18)
					+ " ----------------------------");
			if (ch2 != null)
				System.out.println("---------------------------- " + Util.middleSpacer("Entering " + ch2.getText(), 18)
						+ " ----------------------------");
			printCharacters();
		}
	}

	public void checkExit(Token ch, boolean print) {
		checkError = false;
		if (ch != null) {
			if (!stageCharacterList.containsKey(ch.getText()))
				dramaErrorHandler(UNDECLARED_CHARACTER, ch);
			else if (!stageCharacterList.get(ch.getText()).onStage)
				dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
			else
				stageCharacterList.get(ch.getText()).onStage = false;
		} else
			dramaErrorHandler(MISSING_CHARACTER_IN_EXIT, ch);

		if (print && !checkError) {
			System.out.println("---------------------------- " + Util.middleSpacer("Exiting " + ch.getText(), 17)
					+ " -----------------------------");
			printCharacters();
		}

	}

	public void checkExit(Token ch) {
		checkExit(ch, true);
	}

	public void checkExeunt(Token ch1, Token and, Token ch2) {
		checkError = false;
		// all the characters in the scene leaves the stage
		if (ch1 == null && and == null && ch2 == null) {
			for (String str : stageCharacterList.keySet()) {
				stageCharacterList.get(str).onStage = false;
				System.out.println("--------------------------- " + Util.middleSpacer("Exiting " + str, 17)
						+ " -----------------------------");
			}
			printCharacters();
		}
		// double exit
		if (ch1 != null) {
			if (and != null && ch2 != null) {
				checkExit(ch1, false);
				checkExit(ch2, false);
				if (!checkError) {
					System.out.println("--------------------------- "
							+ Util.middleSpacer("Exiting " + ch1.getText(), 17) + " ----------------------------");
					System.out.println("--------------------------- "
							+ Util.middleSpacer("Exiting " + ch2.getText(), 17) + " ----------------------------");
					System.out.print("\n");
					printCharacters();
				}
			} else
				dramaErrorHandler(EXEUNT_SINGLE_CHARACTER, ch1);
		}
	}

	// stageEvent 1
	public void checkAssignmentStatement(Token ch, Token noun, Token wh, Token el, Token neg) {
		checkError = false;
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		else {
			if (!stageCharacterList.get(ch.getText()).onStage)
				dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
		}

		if (onStageCheck()) {
			String updateCh = secondStageCharacter(ch);
			int newValue = 0;
			if (noun.getType() == ShakespeareLexer.POSITIVENOUN || noun.getType() == ShakespeareLexer.NEUTRALNOUN) {
				newValue = (int) Math.pow(2, adjectiveCounter);
				stageCharacterList.get(updateCh).assignValue((int) Math.pow(2, adjectiveCounter));
			} else
				newValue = (-1 * (int) Math.pow(2, adjectiveCounter));

			if (neg == null)
				stageCharacterList.get(updateCh).assignValue(newValue);
			else
				stageCharacterList.get(updateCh).assignValue(-newValue); // negation

			goTo.newLog(sceneNumber, updateCh, 1, String.valueOf(stageCharacterList.get(updateCh).getValue()));
			if (!checkError && noun != null) {
				System.out.println("---------------------------   STAGE EVENT   ------------------------------");
				System.out.println("   - Actor: \t\t\t\t\t" + updateCh);
				System.out.println("   - Noun: \t\t\t" + noun.getText());
				System.out.println("   - Num of adjectives: \t\t" + adjectiveCounter);
				System.out.println("   - New value: \t\t\t\\t\t" + stageCharacterList.get(updateCh).getValue() + "\n");
				HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(),
						" " + adjString + " " + noun.getText() + el.getText());
				adjString = "";
			}
			printCharacters();
			adjectiveCounter = 0;
		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);
	}

	// stageEvent 2
	public void checkAssignmentComparison(Token ch, Token noun1, Token noun2, Token sub1, Token sub2,
			Token operationtype, Token wh, Token adj, Token el, Token neg) {
		checkError = false;
		String op1Personae = "";
		String op2Personae = "";
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		else {
			if (!stageCharacterList.get(ch.getText()).onStage)
				dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
		}

		if (onStageCheck()) {
			String updateCh = secondStageCharacter(ch);
			int op1 = 0; // first operand
			if (noun1 != null && sub1 == null) {
				if (noun1.getType() == ShakespeareLexer.POSITIVENOUN
						|| noun1.getType() == ShakespeareLexer.NEUTRALNOUN) {
					op1 = (int) Math.pow(2, adjectiveCounter);
				} else
					op1 = -1 * (int) Math.pow(2, adjectiveCounter);
			} else if (noun1 == null && sub1 != null) {
				if (sub1.getType() == ShakespeareLexer.THYSELF || sub1.getType() == ShakespeareLexer.YOURSELF) {
					op1 = stageCharacterList.get(updateCh).getValue();
					op1Personae = updateCh;
				} else {
					op1 = stageCharacterList.get(ch.getText()).getValue(); // ME
					op1Personae = ch.getText();
				}
			}

			int op2 = 0; // second operand
			if (noun2 != null && sub2 == null) {
				if (noun2.getType() == ShakespeareLexer.POSITIVENOUN
						|| noun2.getType() == ShakespeareLexer.NEUTRALNOUN) {
					op2 = (int) Math.pow(2, adjectiveCounter2);
				} else
					op2 = -1 * (int) Math.pow(2, adjectiveCounter2);

			} else if (noun2 == null && sub2 != null) {
				if (sub2.getType() == ShakespeareLexer.THYSELF || sub2.getType() == ShakespeareLexer.YOURSELF) {
					op2 = stageCharacterList.get(updateCh).getValue();
					op2Personae = updateCh;
				} else {
					op2 = stageCharacterList.get(ch.getText()).getValue(); // ME
					op2Personae = ch.getText();
				}

			} else
				System.err.println("op2 non valido");

			int optType = 0;
			switch (operationtype.getType()) {
			case ShakespeareLexer.SUMOF:
				stageCharacterList.get(updateCh).assignValue(op1 + op2);
				optType = 0;
				break;
			case ShakespeareLexer.DIFFBET:
				stageCharacterList.get(updateCh).assignValue(op1 - op2);
				optType = 1;
				break;
			case ShakespeareLexer.PRODOF:
				stageCharacterList.get(updateCh).assignValue(op1 * op2);
				optType = 2;
				break;
			case ShakespeareLexer.QUOTOF:
				stageCharacterList.get(updateCh).assignValue(op1 / op2);
				optType = 3;
				break;
			}

			if(op1Personae=="")
			{
				if(op2Personae=="") {
					goTo.newLog(sceneNumber, updateCh, 1, String.valueOf(stageCharacterList.get(updateCh).getValue()));
				}else
				{// numero / persona
					goTo.newLog(sceneNumber, updateCh, 5,String.valueOf(op1),op2Personae,optType,1);
				}
			}
			else {
				if(op2Personae=="") {
					// persona / numero
					goTo.newLog(sceneNumber, updateCh, 5,op1Personae,String.valueOf(op2),optType,2);
				}else
				{// persona / persona
					goTo.newLog(sceneNumber, updateCh, 5,op1Personae,op2Personae,optType,3);
				}
			}


			if (!checkError) {
				System.out.println("---------------------------   STAGE EVENT  ------------------------------");
				System.out.println("   - Actor: \t\t\t\t\t" + updateCh);
				if (noun1 != null) {
					System.out.println("   - First operand: \t\t\t\t" + noun1.getText());
					System.out.println("   - Num of adjectives for first operand: \t\t" + adjectiveCounter);
				} else
					System.out.println("   - First operand: \t\t\t\t" + sub1.getText());
				if (noun2 != null) {
					System.out.println("   - Second operand: \t\t\t\t" + noun2.getText());
					System.out.println("   - Num of adjectives for second operand: \t\t" + adjectiveCounter2);
				} else
					System.out.println("   - Second operand: \t\t\t\t" + sub2.getText());
				System.out.println("   - New value: \t\t\t\t\t" + stageCharacterList.get(updateCh).getValue() + "\n");

				if (noun1 != null && noun2 != null) // noun1 and noun2
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(),
							" as " + adj.getText() + " as " + operationtype.getText() + " a " + adjString
									+ noun1.getText() + " and a " + adjString2 + " " + noun2.getText() + el.getText());
				else if (sub1 != null && noun2 != null) // me and noun2
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(),
							" as " + adj.getText() + " as " + operationtype.getText() + " " + sub1.getText() + " and a "
									+ adjString2 + " " + noun2.getText() + el.getText());
				else if (sub1 != null && sub2 != null) // me and me
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(), " as " + adj.getText() + " as "
							+ operationtype.getText() + " " + sub1.getText() + " and " + sub2.getText() + el.getText());
				else if (noun1 != null && sub2 != null) // noun1 and me
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(),
							" as " + adj.getText() + " as " + operationtype.getText() + " a " + adjString + " "
									+ noun1.getText() + " and " + sub2.getText() + el.getText());
				adjString = "";
				adjString2 = "";
			}
			printCharacters();
			adjectiveCounter = 0; // after every assignment return 0
			adjectiveCounter2 = 0; // after every assignment return 0

		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);
	}

	// stageEvent 3
	public void checkAssignmentOperation(Token ch, Token noun1, Token noun2, Token sub1, Token sub2,
			Token operationtype, Token wh, Token el, Token neg) {
		checkError = false;
		String op1Personae = "";
		String op2Personae = "";
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		else {
			if (!stageCharacterList.get(ch.getText()).onStage)
				dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);
		}

		if (onStageCheck()) {
			String updateCh = secondStageCharacter(ch);
			int op1 = 0; // first operand
			if (noun1 != null && sub1 == null) {
				if (noun1.getType() == ShakespeareLexer.POSITIVENOUN
						|| noun1.getType() == ShakespeareLexer.NEUTRALNOUN) {
					op1 = (int) Math.pow(2, adjectiveCounter);
					
				} else
					op1 = -1 * (int) Math.pow(2, adjectiveCounter);
			} else if (noun1 == null && sub1 != null) {
				if (sub1.getType() == ShakespeareLexer.THYSELF || sub1.getType() == ShakespeareLexer.YOURSELF) {
					op1 = stageCharacterList.get(updateCh).getValue();
					op1Personae = updateCh;
				} else {
					op1 = stageCharacterList.get(ch.getText()).getValue(); // ME
					op1Personae = ch.getText();
				}
			}

			int op2 = 0; // second operand
			if (noun2 != null && sub2 == null) {
				if (noun2.getType() == ShakespeareLexer.POSITIVENOUN
						|| noun2.getType() == ShakespeareLexer.NEUTRALNOUN) {
					op2 = (int) Math.pow(2, adjectiveCounter2);
				} else
					op2 = -1 * (int) Math.pow(2, adjectiveCounter2);
			} else if (noun2 == null && sub2 != null) {
				if (sub2.getType() == ShakespeareLexer.THYSELF || sub2.getType() == ShakespeareLexer.YOURSELF) {
					op2 = stageCharacterList.get(updateCh).getValue();
					op2Personae = updateCh;
				} else {
					op2 = stageCharacterList.get(ch.getText()).getValue(); // ME
					op2Personae = ch.getText();
				}

			} else
				System.err.println("op2 non valido");

			int optType = 0;
			switch (operationtype.getType()) {
			case ShakespeareLexer.SUMOF:
				stageCharacterList.get(updateCh).assignValue(op1 + op2);
				optType = 0;
				break;
			case ShakespeareLexer.DIFFBET:
				stageCharacterList.get(updateCh).assignValue(op1 - op2);
				optType = 1;
				break;
			case ShakespeareLexer.PRODOF:
				stageCharacterList.get(updateCh).assignValue(op1 * op2);
				optType = 2;
				break;
			case ShakespeareLexer.QUOTOF:
				stageCharacterList.get(updateCh).assignValue(op1 / op2);
				optType = 3;
				break;
			}

			if(op1Personae=="")
			{
				if(op2Personae=="") {
					goTo.newLog(sceneNumber, updateCh, 1, String.valueOf(stageCharacterList.get(updateCh).getValue()));
				}else
				{// numero / persona
					goTo.newLog(sceneNumber, updateCh, 5,String.valueOf(op1),op2Personae,optType,1);
				}
			}
			else {
				if(op2Personae=="") {
					// persona / numero
					goTo.newLog(sceneNumber, updateCh, 5,op1Personae,String.valueOf(op2),optType,2);
				}else
				{// persona / persona
					goTo.newLog(sceneNumber, updateCh, 5,op1Personae,op2Personae,optType,3);
				}
			}
			


			if (!checkError) {
				System.out.println("---------------------------   STAGE EVENT  ------------------------------");
				System.out.println("   - Actor: \t\t\t\t\t" + updateCh);
				if (noun1 != null) {
					System.out.println("   - First operand: \t\t\t\t" + noun1.getText());
					System.out.println("   - Num of adjectives for first operand: \t\t" + adjectiveCounter);
				} else
					System.out.println("   - First operand: \t\t\t\t" + sub1.getText());
				if (noun2 != null) {
					System.out.println("   - Second operand: \t\t\t\t" + noun2.getText());
					System.out.println("   - Num of adjectives for second operand: \t\t" + adjectiveCounter2);
				} else
					System.out.println("   - Second operand: \t\t\t\t" + sub2.getText());
				System.out.println("   - New value: \t\t\t\t\t" + stageCharacterList.get(updateCh).getValue() + "\n");

				if (noun1 != null && noun2 != null) // noun1 and noun2
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(), operationtype.getText() + " a " + adjString
							+ " " + noun1.getText() + " and a " + adjString2 + " " + noun2.getText() + el.getText());
				else if (sub1 != null && noun2 != null) // me and noun2
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(), operationtype.getText() + " "
							+ sub1.getText() + " and a " + adjString2 + " " + noun2.getText() + el.getText());
				else if (sub1 != null && sub2 != null) // me and me
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(),
							operationtype.getText() + " " + sub1.getText() + " and " + sub2.getText() + el.getText());
				else if (noun1 != null && sub2 != null) // noun1 and me
					HtmlToPDF.HTML.addStageEvent(ch.getText(), wh.getText(), operationtype.getText() + " a " + adjString
							+ " " + noun1.getText() + " and " + sub2.getText() + el.getText());
				adjString = "";
				adjString2 = "";
			}
			printCharacters();
			adjectiveCounter = 0; // after every assignment return 0
			adjectiveCounter2 = 0; // after every assignment return 0
		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);
	}

	public void checkConditional(Token ch1, Token ev, Token ch2, Token gt, Token gt2, Token gt3rs, Token gt4,
			Token rn) {
		checkError = false;
		int opType = 0;
		if (!stageCharacterList.containsKey(ch1.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch1);
		else {
			if (!stageCharacterList.get(ch1.getText()).onStage)
				dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch1);
		}
		if (!stageCharacterList.containsKey(ch2.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch2);
		else {
			if (!stageCharacterList.get(ch2.getText()).onStage)
				dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch2);
		}

		if (onStageCheck()) {
			boolean comparison = false;
			switch (ev.getType()) {
			case ShakespeareLexer.BETTER:
				if (stageCharacterList.get(ch1.getText()).getValue() > stageCharacterList.get(ch2.getText()).getValue())
				{
					comparison = true;
					}
				break;
			case ShakespeareLexer.WORSE:
				if (stageCharacterList.get(ch1.getText()).getValue() < stageCharacterList.get(ch2.getText()).getValue())
					{comparison = true;
					opType = 1;
					}
				break;
			default:
				if (stageCharacterList.get(ch1.getText()).getValue() == stageCharacterList.get(ch2.getText())
						.getValue()) {
					comparison = true;		
					opType = 2;
				}
				break;
			}

			if (gt != null) {
					if (gt.getType() == ShakespeareLexer.IFSO) {
						if (!RomanNumber.isRoman(rn.getText()))
							dramaErrorHandler(INVALID_ROMAN_NUMBER, rn);
						else {
							HtmlToPDF.HTML.addStageEvent(ch1.getText(), "Am i " + ev.getText() + " than you?");
							HtmlToPDF.HTML.addStageEvent(ch2.getText(), gt.getText() + " " + gt2.getText() + " "
									+ gt3rs.getText() + " " + gt4.getText() + " " + rn.getText() + ".");
							goTo.newLog(sceneNumber,ch1.getText(),ch2.getText(),opType,RomanNumber.decode(rn.getText()));
							if (comparison) {goTo.Jump(RomanNumber.decode(rn.getText()));}
						}
					}
					if (gt.getType() == ShakespeareLexer.IFNOT) {
						if (!RomanNumber.isRoman(rn.getText()))
							dramaErrorHandler(INVALID_ROMAN_NUMBER, rn);
						else {
							HtmlToPDF.HTML.addStageEvent(ch1.getText(), "Am i " + ev.getText() + " than you?");
							HtmlToPDF.HTML.addStageEvent(ch2.getText(), gt.getText() + " " + gt2.getText() + " "
									+ gt3rs.getText() + " " + gt4.getText() + " " + rn.getText() + ".");
							goTo.newLog(sceneNumber,ch1.getText(),ch2.getText(),opType,RomanNumber.decode(rn.getText()));
							if (!comparison) {goTo.Jump(RomanNumber.decode(rn.getText()));}
						}
					
				}
			} else
				dramaErrorHandler(MISSING_IF_STATEMENT, gt);
		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch1);
	}

	public void adjBuilder(Token adj) {
		adjString += adj.getText() + " ";
	}

	public void adjBuilder2(Token adj) {
		adjString2 += adj.getText() + " ";
	}

	public void printCharacters() {
		System.out.println("	         State of the characters:");
		System.out.println("	         -------------------------------------");
		System.out.println("	         |NAME             |VALUE  |ON STAGE |");
		System.out.println("	         -------------------------------------");
		for (String character : stageCharacterList.keySet()) {
			String str = "	         |" + Util.evenSpacer(character, 17);
			if (stageCharacterList.get(character).getValue() > 9999999)
				str += "|" + Util.evenSpacer("xxxxx..", 7); // Viene filtrata solo la stampa e non il valore vero
			else
				str += "|" + Util.evenSpacer(stageCharacterList.get(character).getValue(), 7);
			str += "|" + Util.evenSpacer(String.valueOf(stageCharacterList.get(character).onStage), 9) + "|";
			System.out.println(str);

			str = "";
			boolean first = true;

			for (Integer f : stageCharacterList.get(character).getStack()) {
				String g = String.valueOf(f);
				while (String.valueOf(g + ",").length() > 31) {
					if (first) {
						System.out.println("	         |->[" + Util.evenSpacer(g.substring(0, 31), 31) + "]|");
						first = false;
					} else
						System.out.println("	         |  [" + Util.evenSpacer(g.substring(0, 31), 31) + "]|");
					g = g.substring(32, g.length());
				}

				if (String.valueOf(g + ",").length() + str.length() > 31) {
					if (first) {
						System.out.println("	         |->[" + Util.evenSpacer(str, 31) + "]|");
						first = false;
					} else
						System.out.println("	         |  [" + Util.evenSpacer(str, 31) + "]|");

					str = "";
				}

				str += g + ",";
			}
			if (str != "")
				str = str.substring(0, str.length() - 1);
			if (first)
				System.out.println("	         |->[" + Util.evenSpacer(str, 31) + "]|");
			else
				System.out.println("	         |  [" + Util.evenSpacer(str, 31) + "]|");
			System.out.println("	         -------------------------------------");
		}
	}

	public void finalPrint() {
		System.out.println("\n");
		System.out.println("================================= OUTPUT ===================================");
		while (execOutput.length() > 72) {
			System.out.println(execOutput.substring(0, 76));
			execOutput = execOutput.substring(72, execOutput.length());
		}
		System.out.println(execOutput);
		System.out.println("============================================================================\n");
	}

	private class loggedAction {
		int scene;
		String character;
		Object assignedValue;
		int actionType; // switch to understand the action type saved in the log
		String op1,op2;
		int optType; // 1+, 2-, 3*, 4/
		int personType; // 1 number-person ,2 person-number , 3 person-person
		int targetScene;
		///////
		// 1 -> setting the value of a stage character
		// 2 -> prints the value of a stage character
		// 3 -> remember, push
		// 4 -> recall, pop
		// 5 -> confronti
		// 6 -> goto
		///////

		public loggedAction(int scene, String character, int actionType, Object assignedValue) {
			this.scene = scene;
			this.character = character;
			this.assignedValue = assignedValue;
			this.actionType = actionType;
		}

		public loggedAction(int scene, String character, int actionType) {
			this.scene = scene;
			this.character = character;
			this.actionType = actionType;
		}
		
		public loggedAction(int scene, String character, int actionType,String aop1,String aop2,int optType,int personType) {
			this.scene = scene;
			this.character = character;
			this.actionType = actionType;
			this.op1 = aop1;
			this.op2 = aop2;
			this.optType = optType;
			this.personType = personType;
		}
		
		public loggedAction(int Scene, String ch1, String ch2, int type, int target) {
			this.scene = Scene;
			this.op1 = ch1;
			this.op2 = ch2;
			this.optType = type;
			this.actionType = 6;
			this.targetScene = target;
		}
	}

	private class gotoHandler {
		ArrayList<loggedAction> logList = new ArrayList<loggedAction>();

		public void newLog(int Scene, String CharacterName, int ActionType, Object AssignedValue) {
			logList.add(new loggedAction(Scene, CharacterName, ActionType, AssignedValue));
		}

		public void newLog(int Scene, String Character, int ActionType) {
			logList.add(new loggedAction(Scene, Character, ActionType));
		}
		
		public void newLog(int Scene, String Character, int ActionType,String op1, String op2, int optType, int personType) {
			logList.add(new loggedAction(Scene, Character, ActionType,op1,op2,optType,personType));
		}
		
		public void newLog(int Scene, String ch1, String ch2, int type, int target) {
			logList.add(new loggedAction(Scene,ch1,ch2,type,target));
		}

		public void clearLog() {
			logList.clear();
		}

		public void Jump(int scene) {
			System.out.println("---------------------------   JUMP TO SCENE "+scene+" -----------------------------");

			//print();
			for (loggedAction singleLog : logList) {
				if (singleLog.scene >= scene) {
					switch (singleLog.actionType) {
					case 1:
						stageCharacterList.get(singleLog.character)
								.assignValue(Integer.valueOf((String) singleLog.assignedValue));
						break;
					case 2:
						//execOutput += (String) singleLog.assignedValue;
						execOutput += stageCharacterList.get(singleLog.character).getValue();
						break;
					case 3:
						stageCharacterList.get(singleLog.character).push((int) singleLog.assignedValue);
						break;
					case 4:
						stageCharacterList.get(singleLog.character).pop();
						break;
					case 5:
						switch(singleLog.optType) {
							case 0:
								switch(singleLog.personType) {
								case 1:// 1 number-person 
									stageCharacterList.get(singleLog.character)
									.assignValue(Integer.valueOf(singleLog.op1)
											+
											stageCharacterList.get(singleLog.op2).getValue());
									break;
								case 2:// 2 person-number
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											+
											Integer.valueOf(singleLog.op2));
									break;
								case 3:// 3 person-person
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											+
											stageCharacterList.get(singleLog.op2).getValue());
									break;
									
								}

								break;
							case 1:
								switch(singleLog.personType) {
								case 1:// 1 number-person 
									stageCharacterList.get(singleLog.character)
									.assignValue(Integer.valueOf(singleLog.op1)
											-
											stageCharacterList.get(singleLog.op2).getValue());
									break;
								case 2:// 2 person-number
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											-
											Integer.valueOf(singleLog.op2));
									break;
								case 3:// 3 person-person

									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											-
											stageCharacterList.get(singleLog.op2).getValue());
									break;
									
								}
								break;
							case 2:
								switch(singleLog.personType) {
								case 1:// 1 number-person 
									stageCharacterList.get(singleLog.character)
									.assignValue(Integer.valueOf(singleLog.op1)
											*
											stageCharacterList.get(singleLog.op2).getValue());
									break;
								case 2:// 2 person-number
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											*
											Integer.valueOf(singleLog.op2));
									break;
								case 3:// 3 person-person
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											*
											stageCharacterList.get(singleLog.op2).getValue());
									break;
									
								}
								break;
							case 3:
								switch(singleLog.personType) {
								case 1:// 1 number-person 
									stageCharacterList.get(singleLog.character)
									.assignValue(Integer.valueOf(singleLog.op1)
											/
											stageCharacterList.get(singleLog.op2).getValue());
									break;
								case 2:// 2 person-number
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											/
											Integer.valueOf(singleLog.op2));
									break;
								case 3:// 3 person-person
									stageCharacterList.get(singleLog.character)
									.assignValue(stageCharacterList.get(singleLog.op1).getValue()
											/
											stageCharacterList.get(singleLog.op2).getValue());
									break;
									
								}
								break;
								}
						
						break;
					case 6:
						switch(singleLog.optType) {
						case 0: // >
							if(stageCharacterList.get(singleLog.op1).getValue() > stageCharacterList.get(singleLog.op2).getValue())
								Jump(singleLog.targetScene);
							break;
						case 1: // <
							if(stageCharacterList.get(singleLog.op1).getValue() < stageCharacterList.get(singleLog.op2).getValue())
								Jump(singleLog.targetScene);
							break;
						case 2: // =
							if(stageCharacterList.get(singleLog.op1).getValue() == stageCharacterList.get(singleLog.op2).getValue())
								Jump(singleLog.targetScene);
							break;
						}
						break;
					}
					//System.err.println("eseguo azione "+singleLog.actionType+" per " + singleLog.character);
				}
			}
		}

		public void print() {
			for (loggedAction singleLog : logList) {
				System.out.println("Scene: " + singleLog.scene + ", Character: " + singleLog.character + ", Action: "
						+ singleLog.actionType + ", Value: " + singleLog.assignedValue + ", op1 e op2: "+singleLog.op1+" "+singleLog.op2);
			}
		}
	}

	public void checkRemember(Token ch, Token who) {
		checkError = false;
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		if (!stageCharacterList.get(ch.getText()).onStage)
			dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);

		if (onStageCheck()) {
			String updateCh = secondStageCharacter(ch);
			if (who.getType() == ShakespeareLexer.ME) {
				stageCharacterList.get(updateCh).push(stageCharacterList.get(ch.getText()).getValue());
				goTo.newLog(sceneNumber, updateCh, 3, stageCharacterList.get(ch.getText()).getValue());
			}

			else {
				stageCharacterList.get(updateCh).push(stageCharacterList.get(updateCh).getValue());
				goTo.newLog(sceneNumber, updateCh, 3, stageCharacterList.get(updateCh).getValue());
			}

		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);

		if (!checkError) {
			System.out.println("---------------------------   REMEMBER ACTION  -----------------------------");
			System.out.println("   - Actor: \t\t\t\t\t" + secondStageCharacter(ch));
			if (who.getType() == ShakespeareLexer.ME)
				System.out.println("   - Pushed value: \t" + stageCharacterList.get(ch.getText()).getValue() + "\n");
			else
				System.out.println(
						"   - Pushed value: \t" + stageCharacterList.get(secondStageCharacter(ch)).getValue() + "\n");
			HtmlToPDF.HTML.addStageEvent(ch.getText(), "Remember " + who.getText() + ".");
			printCharacters();
		}
	}

	public void checkRecall(Token ch) {
		checkError = false;
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		if (!stageCharacterList.get(ch.getText()).onStage)
			dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);

		if (onStageCheck()) {
			String updateCh = secondStageCharacter(ch);
			if (!stageCharacterList.get(updateCh).pop())
				dramaErrorHandler(EMPTY_STACK, ch);
		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);
		System.err.println(execOutput);

		if (!checkError) {
			System.out.println("----------------------------   RECALL ACTION  ------------------------------");
			System.out.println("   - Actor: \t\t\t\t\t" + secondStageCharacter(ch));
			System.out.println("   - Popped value: \t" + stageCharacterList.get(ch.getText()).getValue() + "\n");
			goTo.newLog(sceneNumber, secondStageCharacter(ch), 4);
			HtmlToPDF.HTML.addStageEvent(ch.getText(), "Recall.");
			printCharacters();
		}
	}

	public void checkPrint(Token ch, Token phrase, Token ws) {
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		if (!stageCharacterList.get(ch.getText()).onStage)
			dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);

		if (onStageCheck()) {
			String secondCh = secondStageCharacter(ch);
			HtmlToPDF.HTML.addStageEvent(ch.getText(), phrase.getText() + ws.getText());
			if (phrase.getType() == ShakespeareLexer.PRINTVALUE) {
				execOutput += stageCharacterList.get(secondCh).getValue();
				goTo.newLog(sceneNumber, secondCh, 2, String.valueOf(stageCharacterList.get(secondCh).getValue()));
			} else {
				// only some values are considered valid and printed
				if (stageCharacterList.get(secondCh).getValue() >= 32
						&& stageCharacterList.get(secondCh).getValue() <= 126) {
					char asciiValue = (char) stageCharacterList.get(secondCh).getValue(); // ASCII conversion
					goTo.newLog(sceneNumber, secondCh, 2, String.valueOf(asciiValue));
					execOutput += asciiValue;
				} else
					dramaErrorHandler(INVALID_ASCII_OUTPUT, ch);
				;
			}
		} else
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);
	}

	public void checkRead(Token ch, Token phrase, Token ws) {
		checkError = false;
		if (!stageCharacterList.containsKey(ch.getText()))
			dramaErrorHandler(UNDECLARED_CHARACTER, ch);
		if (!stageCharacterList.get(ch.getText()).onStage)
			dramaErrorHandler(CHARACTER_NOT_ON_STAGE, ch);

		if (!onStageCheck())
			dramaErrorHandler(ONLY_ONE_CHARACTER_ON_STAGE, ch);

		if (!checkError) {
			String secondCh = secondStageCharacter(ch);

			neededInput += 1; // increase at every function call to check the number of input needed

			// handling number of input elements
			if (neededInput > effectiveInput) // needed input > effective input
				return;

			HtmlToPDF.HTML.addStageEvent(ch.getText(), phrase.getText() + ws.getText());
			if (phrase.getType() == ShakespeareLexer.READVALUE) {
				// read int value
				String input = userInputSplitted[neededInput - 1];
				try {
					int intInput = Integer.parseInt(input);
					stageCharacterList.get(secondCh).assignValue(intInput);
					goTo.newLog(sceneNumber, secondCh, 1, String.valueOf(intInput));
				} catch (NumberFormatException e) {
					dramaErrorHandler(INVALID_INT_INPUT, ch);
				}
			} else {
				// read ASCII value
				String input = userInputSplitted[neededInput - 1];
				try {
					if (input.length() > 1) {
						dramaErrorHandler(NO_MULTIPLE_ASCII_INPUT, ch);
						return;
					}
					char asciiInput = (char) input.charAt(0);
					int newValue = asciiInput;
					if (newValue >= 32 && newValue <= 126) {
						stageCharacterList.get(secondCh).assignValue(newValue);
						goTo.newLog(sceneNumber, secondCh, 1, String.valueOf(newValue));
					} else
						dramaErrorHandler(INVALID_ASCII_INPUT, ch);
				} catch (Exception e) {
					dramaErrorHandler(INVALID_ASCII_INPUT, ch);
				}
			}
		}
	}
	
	// check end of file
//	public void checkEOF(Token eof) {
////		if (eof != null)
////			dramaErrorHandler(NO_EOF, eof);
//		
//		if (eof.getType() == ShakespeareLexer.EOF)
//			dramaErrorHandler(NO_EOF, eof);
//		
//	}
	
}
