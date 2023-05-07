// $ANTLR 3.5.1 D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-07 18:28:38

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CL=4;
	public static final int DIGIT=5;
	public static final int DOT=6;
	public static final int EP=7;
	public static final int ID=8;
	public static final int LETTER=9;
	public static final int QM=10;

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
	@Override public String getGrammarFileName() { return "D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:49:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:52:7: ( '0' .. '9' )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:5: ( ':' )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:7: ':'
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
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:8: ( '.' )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:11: '.'
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
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:8: ( '!' )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:11: '!'
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
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:8: ( '?' )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:10: '?'
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
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:7: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:3: ( LETTER | DIGIT | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
					break loop1;
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
		// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:8: ( CL | DOT | EP | QM | ID )
		int alt2=5;
		switch ( input.LA(1) ) {
		case ':':
			{
			alt2=1;
			}
			break;
		case '.':
			{
			alt2=2;
			}
			break;
		case '!':
			{
			alt2=3;
			}
			break;
		case '?':
			{
			alt2=4;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt2=5;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:10: CL
				{
				mCL(); 

				}
				break;
			case 2 :
				// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:13: DOT
				{
				mDOT(); 

				}
				break;
			case 3 :
				// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:17: EP
				{
				mEP(); 

				}
				break;
			case 4 :
				// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:20: QM
				{
				mQM(); 

				}
				break;
			case 5 :
				// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:23: ID
				{
				mID(); 

				}
				break;

		}
	}



}
