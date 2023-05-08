// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-08 09:42:59

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CHARACTER=4;
	public static final int CL=5;
	public static final int DIGIT=6;
	public static final int DOT=7;
	public static final int EP=8;
	public static final int ID=9;
	public static final int LETTER=10;
	public static final int QM=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ShakespeareLexer() {} 
	public ShakespeareLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ShakespeareLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:49:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:52:7: ( '0' .. '9' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:55:5: ( 'Romeo' | 'Juliet' | 'Ghost' | 'LadyMacbeth' | 'Ofelia' | 'Tebaldo' | 'Claudio' | 'Mercuzio' | 'Banquo' | 'Fulgencio' | 'Gertrude' | 'Desdemona' | 'Jago' | 'Polonio' | 'Macduff' | 'Shylock' | 'Laerte' | 'Orazio' | 'Prospero' )
			int alt1=19;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt1=1;
				}
				break;
			case 'J':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='u') ) {
					alt1=2;
				}
				else if ( (LA1_2=='a') ) {
					alt1=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'G':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='h') ) {
					alt1=3;
				}
				else if ( (LA1_3=='e') ) {
					alt1=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'L':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='a') ) {
					int LA1_18 = input.LA(3);
					if ( (LA1_18=='d') ) {
						alt1=4;
					}
					else if ( (LA1_18=='e') ) {
						alt1=17;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'O':
				{
				int LA1_5 = input.LA(2);
				if ( (LA1_5=='f') ) {
					alt1=5;
				}
				else if ( (LA1_5=='r') ) {
					alt1=18;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'T':
				{
				alt1=6;
				}
				break;
			case 'C':
				{
				alt1=7;
				}
				break;
			case 'M':
				{
				int LA1_8 = input.LA(2);
				if ( (LA1_8=='e') ) {
					alt1=8;
				}
				else if ( (LA1_8=='a') ) {
					alt1=15;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'B':
				{
				alt1=9;
				}
				break;
			case 'F':
				{
				alt1=10;
				}
				break;
			case 'D':
				{
				alt1=12;
				}
				break;
			case 'P':
				{
				int LA1_12 = input.LA(2);
				if ( (LA1_12=='o') ) {
					alt1=14;
				}
				else if ( (LA1_12=='r') ) {
					alt1=19;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
				{
				alt1=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:55:9: 'Romeo'
					{
					match("Romeo"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:9: 'Juliet'
					{
					match("Juliet"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:9: 'Ghost'
					{
					match("Ghost"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:9: 'LadyMacbeth'
					{
					match("LadyMacbeth"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:9: 'Ofelia'
					{
					match("Ofelia"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:9: 'Tebaldo'
					{
					match("Tebaldo"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:61:9: 'Claudio'
					{
					match("Claudio"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:9: 'Mercuzio'
					{
					match("Mercuzio"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:9: 'Banquo'
					{
					match("Banquo"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:9: 'Fulgencio'
					{
					match("Fulgencio"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:9: 'Gertrude'
					{
					match("Gertrude"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:9: 'Desdemona'
					{
					match("Desdemona"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:9: 'Jago'
					{
					match("Jago"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:9: 'Polonio'
					{
					match("Polonio"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:9: 'Macduff'
					{
					match("Macduff"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:9: 'Shylock'
					{
					match("Shylock"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:9: 'Laerte'
					{
					match("Laerte"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:72:9: 'Orazio'
					{
					match("Orazio"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:73:9: 'Prospero'
					{
					match("Prospero"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:77:5: ( ':' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:77:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:8: ( '.' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:11: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "EP"
	public final void mEP() throws RecognitionException {
		try {
			int _type = EP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:8: ( '!' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:11: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EP"

	// $ANTLR start "QM"
	public final void mQM() throws RecognitionException {
		try {
			int _type = QM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:8: ( '?' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:10: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:7: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:88:3: ( LETTER | DIGIT | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:8: ( CHARACTER | CL | DOT | EP | QM | ID )
		int alt3=6;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:10: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 2 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:20: CL
				{
				mCL(); 

				}
				break;
			case 3 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:23: DOT
				{
				mDOT(); 

				}
				break;
			case 4 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:27: EP
				{
				mEP(); 

				}
				break;
			case 5 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:30: QM
				{
				mQM(); 

				}
				break;
			case 6 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:33: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\1\uffff\15\22\5\uffff\47\22\1\115\20\22\1\115\1\22\1\uffff\1\115\17\22"+
		"\1\115\2\22\3\115\4\22\1\115\7\22\2\115\1\22\1\115\2\22\1\115\1\22\2\115"+
		"\1\22\1\115\2\22\1\115\1\22\2\115\1\22\1\115";
	static final String DFA3_eofS =
		"\u0084\uffff";
	static final String DFA3_minS =
		"\1\41\1\157\1\141\1\145\1\141\1\146\1\145\1\154\2\141\1\165\1\145\1\157"+
		"\1\150\5\uffff\1\155\1\154\1\147\1\157\1\162\1\144\1\145\1\141\1\142\1"+
		"\141\1\162\1\143\1\156\1\154\1\163\1\154\1\157\1\171\1\145\1\151\1\157"+
		"\1\163\1\164\1\171\1\162\1\154\1\172\1\141\1\165\1\143\1\144\1\161\1\147"+
		"\1\144\1\157\1\163\1\154\1\157\1\145\1\60\1\164\1\162\1\115\1\164\2\151"+
		"\1\154\1\144\3\165\2\145\1\156\1\160\1\157\1\60\1\164\1\uffff\1\60\1\165"+
		"\1\141\1\145\1\141\1\157\1\144\1\151\1\172\1\146\1\157\1\156\1\155\1\151"+
		"\1\145\1\143\1\60\1\144\1\143\3\60\2\157\1\151\1\146\1\60\1\143\2\157"+
		"\1\162\1\153\1\145\1\142\2\60\1\157\1\60\1\151\1\156\1\60\1\157\2\60\1"+
		"\145\1\60\1\157\1\141\1\60\1\164\2\60\1\150\1\60";
	static final String DFA3_maxS =
		"\1\172\1\157\1\165\1\150\1\141\1\162\1\145\1\154\1\145\1\141\1\165\1\145"+
		"\1\162\1\150\5\uffff\1\155\1\154\1\147\1\157\1\162\2\145\1\141\1\142\1"+
		"\141\1\162\1\143\1\156\1\154\1\163\1\154\1\157\1\171\1\145\1\151\1\157"+
		"\1\163\1\164\1\171\1\162\1\154\1\172\1\141\1\165\1\143\1\144\1\161\1\147"+
		"\1\144\1\157\1\163\1\154\1\157\1\145\1\172\1\164\1\162\1\115\1\164\2\151"+
		"\1\154\1\144\3\165\2\145\1\156\1\160\1\157\1\172\1\164\1\uffff\1\172\1"+
		"\165\1\141\1\145\1\141\1\157\1\144\1\151\1\172\1\146\1\157\1\156\1\155"+
		"\1\151\1\145\1\143\1\172\1\144\1\143\3\172\2\157\1\151\1\146\1\172\1\143"+
		"\2\157\1\162\1\153\1\145\1\142\2\172\1\157\1\172\1\151\1\156\1\172\1\157"+
		"\2\172\1\145\1\172\1\157\1\141\1\172\1\164\2\172\1\150\1\172";
	static final String DFA3_acceptS =
		"\16\uffff\1\2\1\3\1\4\1\5\1\6\72\uffff\1\1\66\uffff";
	static final String DFA3_specialS =
		"\u0084\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\20\14\uffff\1\17\13\uffff\1\16\4\uffff\1\21\1\uffff\1\22\1\11\1\7"+
			"\1\13\1\22\1\12\1\3\2\22\1\2\1\22\1\4\1\10\1\22\1\5\1\14\1\22\1\1\1\15"+
			"\1\6\6\22\4\uffff\1\22\1\uffff\32\22",
			"\1\23",
			"\1\25\23\uffff\1\24",
			"\1\27\2\uffff\1\26",
			"\1\30",
			"\1\31\13\uffff\1\32",
			"\1\33",
			"\1\34",
			"\1\36\3\uffff\1\35",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42\2\uffff\1\43",
			"\1\44",
			"",
			"",
			"",
			"",
			"",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\136",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\156",
			"\1\157",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\173",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\174",
			"\1\175",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\176",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\177",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\u0080",
			"\1\u0081",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\u0082",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\u0083",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CHARACTER | CL | DOT | EP | QM | ID );";
		}
	}

}
