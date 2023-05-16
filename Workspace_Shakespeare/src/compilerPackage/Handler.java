package compilerPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import antlr.Parser;
import compilerPackage.temp.Shakespeare;
import compilerPackage.util.VarDescriptor;

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
	public static int MISSING_NEWLINE = 12;
	public static int MISSING_COMMA = 13;
	public static int MISSING_COLON = 14;
	public static int MISSING_ROMANIAN_NUMBER = 15;

	Hashtable<String, VarDescriptor> symbolTable; // con chiave e oggetto
	// ******
	List<String> errorList; // lista in cui registro errori
	TokenStream input; // mi rappresenta lo scanner

	// ******
	public Handler(TokenStream input) {
		this.input = input;
		symbolTable = new Hashtable<String, VarDescriptor>(101);
		errorList = new ArrayList<String>();
	}

	// ******
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
		else if (code == MISSING_NEWLINE)
			errMsg += "Missing new line";
		else if (code == MISSING_COMMA)
			errMsg += "Missing comma";
		else if (code == MISSING_COLON)
			errMsg += "Missing colon";
		else if (code == MISSING_ROMANIAN_NUMBER);
			errMsg += "Missing romanian number";
		
		errorList.add(errMsg);
	}

	// controlla titolo
	public void checkTitle(Token t, Token d, Token nl) { // t=testo, d=dot
//		try {
		if (t == null) {
			// System.err.println("ERROR: missing title, please declare it");
			myErrorHandler(MISSING_TITLE, null);
		} else if (!d.getText().equals(".")) {
			// System.err.println("ERROR: dot missing in title");
			myErrorHandler(MISSING_DOT, d);
			// System.out.println(d.getText());
		}
		if (nl.getType() != ShakespeareLexer.NL) {
			myErrorHandler(MISSING_NEWLINE, nl);
		}
//		} 
//		catch (NullPointerException ex) {
//			System.err.println(ex.toString());
//			 myErrorHandler(MISSING_TITLE, null);
//		}
	}

	// dramatisPersonae
	public void checkPersonae(Token ch, Token cm, Token co, Token d, Token nl) { // ch=characters, co=comment
		// System.err.println(ch.getText());
		// System.err.println(co.getText());

		// controllo se token corrisponde a token CHARACTERS
		if (ch == null) {
			System.err.println("ERROR: missing character name");
			myErrorHandler(MISSING_CHARACTER, ch);
		}
		if (ch.getType() != ShakespeareLexer.CHARACTER) {
			System.err.println("personagguio sbagliato");
			myErrorHandler(INVALID_CHARACTER, ch);
		}
		if (cm.getType() != ShakespeareLexer.CM) {
			myErrorHandler(MISSING_COMMA, cm);
		}
		if (co == null) {
			System.err.println("ERROR: missing character comment");
			myErrorHandler(MISSING_COMMENT, co);
		}
		if (!d.getText().equals(".")) {
			// System.err.println("ERROR: dot missing after character comment");
			myErrorHandler(MISSING_DOT, d);
			// System.out.println(d.getText());
		}
		if (nl.getType() != ShakespeareLexer.NL) {
			myErrorHandler(MISSING_NEWLINE, nl);
		}
		// System.out.println(ch.getText().toString());
	}

	
	public void checkAct(Token rn, Token cl, Token co, Token d, Token nl) {
		if (rn == null) {
			System.err.println("ERROR: missing romanian number");
			myErrorHandler(MISSING_ROMANIAN_NUMBER, rn);
		}
		
		// check numero romano valido
		// check atto non già dichiarato
		// check si procede in ordine senza saltare numeri
		
		if (cl.getType() != ShakespeareLexer.CL) {
			System.err.println("ERROR: missing colon");
			myErrorHandler(MISSING_COLON, cl);
		}
		if (co == null) {
			System.err.println("ERROR: missing act comment");
			myErrorHandler(MISSING_COMMENT, co);
		}
		if (!d.getText().equals(".")) {
			// System.err.println("ERROR: dot missing after character comment");
			myErrorHandler(MISSING_DOT, d);
			// System.out.println(d.getText());
		}
		if (nl.getType() != ShakespeareLexer.NL) {
			myErrorHandler(MISSING_NEWLINE, nl);
		}
	}
	
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
