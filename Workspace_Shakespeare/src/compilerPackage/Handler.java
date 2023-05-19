package compilerPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import antlr.Parser;
import compilerPackage.temp.Shakespeare;
import compilerPackage.util.CharacterDescriptor;

public class Handler {

	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int UNDECLARED_VAR_ERROR = 2;
	public static int DECLARED_VAR_ERROR = 3;
	public static int INC_ERROR = 4;
	public static int MISS_INC_ERROR = 5;
	public static int DIV_BY_ZERO_ERROR = 6;
	// Shakespeare errors
	public static int MISSING_TITLE = 7;
	public static int MISSING_DOT = 8;
	public static int MISSING_CHARACTER = 9;
	public static int INVALID_CHARACTER = 10;
	public static int MISSING_COMMENT = 11;

	TokenStream input; // mi rappresenta lo scanner
	List<String> errorList; // lista in cui registro errori

	Hashtable<String, CharacterDescriptor> characterList; // character, value, on stage or not
	float scenicMoment; // gestione atti e scene

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

		if (code == UNDECLARED_VAR_ERROR)
			errMsg += "The variable '" + tk.getText() + "' is undeclared";
		else if (code == DECLARED_VAR_ERROR)
			errMsg += "The variable '" + tk.getText() + "' has been already declared";
		else if (code == INC_ERROR)
			errMsg += "Cannot use '++' or '--' before and after the variable '" + tk.getText() + "'";
		else if (code == MISS_INC_ERROR)
			errMsg += "Missing '++' or '--' before or after the variable '" + tk.getText() + "'";
		else if (code == DIV_BY_ZERO_ERROR)
			errMsg += "Division by 0";
		// Shakespeare errors
		else if (code == MISSING_TITLE)
			errMsg += "Missing title";
		else if (code == MISSING_DOT)
			errMsg += "Missing dot after " + input.LT(-1).getText();
		else if (code == MISSING_CHARACTER)
			errMsg += "Missing character name in declaration";
		else if (code == INVALID_CHARACTER)
			errMsg += "Invalid character name";
		else if (code == MISSING_COMMENT)
			errMsg += "Missing comment";

		errorList.add(errMsg);
	}

	// controlla titolo
	public void checkNullTitle(Token t, Token d) { // t=testo, d=dot
		try {
			if (t == null) {
//				System.err.println("ERROR: missing title, please declare it");
				myErrorHandler(MISSING_TITLE, null);
			} else if (!d.getText().equals(".")) {
//				System.err.println("ERROR: dot missing in title");
				myErrorHandler(MISSING_DOT, d);
//				System.out.println(d.getText());
			}
		} catch (NullPointerException ex) {
			System.err.println(ex.toString());
			myErrorHandler(MISSING_TITLE, null);
		}
	}

	// dramatisPersonae
	public void checkPersonae(Token ch, Token co) { // ch=characters, co=comment
//		System.out.println(ch.getText());
//		System.out.println(co.getText());

		// controllo se token corrisponde a token CHARACTERS
		if (ch.getType() != ShakespeareLexer.CHARACTER) {
//			System.err.println("personagguio sbagliato");
			myErrorHandler(INVALID_CHARACTER, ch);
		}

		if (ch.getType() != ShakespeareLexer.CHARACTER && co != null) {
//			System.err.println("ERROR: missing character name");
			myErrorHandler(MISSING_CHARACTER, ch);
		}
		// to do: check personaggio valido
		if (co == null) {
//			System.err.println("ERROR: missing comment after character name");
			myErrorHandler(MISSING_COMMENT, co);
		}

		// System.out.println(ch.getText().toString());

	}

	// dichiarazione atto
	public void checkAct(Token rn, Token co) {
		// non è un numero romano
		// già definito
		// maggiore di ultimo atto definito + 1 (salto nella numerazione)
	}

	// dichiarazione atto
	public void checkScene(Token rn, Token co) {
		// non è un numero romano
		// già definita in questo atto -> serve tenere traccia dell'atto in cui sono
		// maggiore di ultima scena definita in questo atto + 1 (salto nella
		// numerazione)
	}

	// entrata in scena
	public void checkEnter(Token ch1, Token ch2) {
		// personaggio dichiarato?
		// personaggio era già in scena?
		// aggiorno onStage
	}

	// uscita di scena
	public void checkExit(Token ch) {
		// personaggio dichiarato?
		// personaggio era in scena?
		// aggiorno onStage
		// aggiorno valore (azzero o lascio)
	}

	// uscita di scena multipla
	public void checkExeunt(Token ch1, Token ch2) {
		// personaggi dichiarati?
		// personaggi erano in scena?
		// aggiorno onStage
		// aggiorno valori (azzero o lascio)
	}

	// operazioni svolte su/da un personaggio
	public void checkStageEvent() {
		// personaggi dichiarato?
		// personaggio era in scena?
		// aggiorno valore personaggio
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
