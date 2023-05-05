// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-05 14:16:42

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADD", "AND", "AND_BIT", 
		"ASSERT", "ASSING", "AT", "BASIC_TYPE", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CL", "CLASS", "CM", "COMMENT", "CONTINUE", "DEFAULT", "DIGIT", 
		"DIV", "DO", "DOT", "ELSE", "ENUM", "EQ", "ESC_SEQ", "EXPONENT", "EXTENDS", 
		"FINAL", "FINALLY", "FLOAT", "FOR", "GE", "GT", "HEX_DIGIT", "ID", "IF", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INTEGER", "INTERFACE", "LB", "LBR", 
		"LETTER", "LP", "LT", "MOD", "NATIVE", "NEQ", "NEW", "NOT", "OCTAL_ESC", 
		"OR", "OR_BIT", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RB", "RBR", 
		"RETURN", "RP", "SC", "STAR", "STATIC", "STRING", "SUB", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "UNICODE_ESC", 
		"VOID", "VOLATILE", "WHILE", "WS", "XOR"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ADD=5;
	public static final int AND=6;
	public static final int AND_BIT=7;
	public static final int ASSERT=8;
	public static final int ASSING=9;
	public static final int AT=10;
	public static final int BASIC_TYPE=11;
	public static final int BREAK=12;
	public static final int BYTE=13;
	public static final int CASE=14;
	public static final int CATCH=15;
	public static final int CHAR=16;
	public static final int CL=17;
	public static final int CLASS=18;
	public static final int CM=19;
	public static final int COMMENT=20;
	public static final int CONTINUE=21;
	public static final int DEFAULT=22;
	public static final int DIGIT=23;
	public static final int DIV=24;
	public static final int DO=25;
	public static final int DOT=26;
	public static final int ELSE=27;
	public static final int ENUM=28;
	public static final int EQ=29;
	public static final int ESC_SEQ=30;
	public static final int EXPONENT=31;
	public static final int EXTENDS=32;
	public static final int FINAL=33;
	public static final int FINALLY=34;
	public static final int FLOAT=35;
	public static final int FOR=36;
	public static final int GE=37;
	public static final int GT=38;
	public static final int HEX_DIGIT=39;
	public static final int ID=40;
	public static final int IF=41;
	public static final int IMPLEMENTS=42;
	public static final int IMPORT=43;
	public static final int INSTANCEOF=44;
	public static final int INTEGER=45;
	public static final int INTERFACE=46;
	public static final int LB=47;
	public static final int LBR=48;
	public static final int LETTER=49;
	public static final int LP=50;
	public static final int LT=51;
	public static final int MOD=52;
	public static final int NATIVE=53;
	public static final int NEQ=54;
	public static final int NEW=55;
	public static final int NOT=56;
	public static final int OCTAL_ESC=57;
	public static final int OR=58;
	public static final int OR_BIT=59;
	public static final int PACKAGE=60;
	public static final int PRIVATE=61;
	public static final int PROTECTED=62;
	public static final int PUBLIC=63;
	public static final int RB=64;
	public static final int RBR=65;
	public static final int RETURN=66;
	public static final int RP=67;
	public static final int SC=68;
	public static final int STAR=69;
	public static final int STATIC=70;
	public static final int STRING=71;
	public static final int SUB=72;
	public static final int SUPER=73;
	public static final int SWITCH=74;
	public static final int SYNCHRONIZED=75;
	public static final int THIS=76;
	public static final int THROW=77;
	public static final int THROWS=78;
	public static final int TRANSIENT=79;
	public static final int TRY=80;
	public static final int UNICODE_ESC=81;
	public static final int VOID=82;
	public static final int VOLATILE=83;
	public static final int WHILE=84;
	public static final int WS=85;
	public static final int XOR=86;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ShakespeareParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ShakespeareParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ShakespeareParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }






	// $ANTLR start "parseJava"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:24:1: parseJava : SC ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:2: ( SC )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:4: SC
			{
			match(input,SC,FOLLOW_SC_in_parseJava49); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseJava"

	// Delegated rules



	public static final BitSet FOLLOW_SC_in_parseJava49 = new BitSet(new long[]{0x0000000000000002L});
}
