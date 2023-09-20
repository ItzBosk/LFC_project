package compilerPackage;

// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-04 18:53:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Shakespeare extends Lexer {
	public static final int EOF = -1;
	public static final int CHAR = 4;
	public static final int COMMENT = 5;
	public static final int ESC_SEQ = 6;
	public static final int HEX_DIGIT = 7;
	public static final int ID = 8;
	public static final int INT = 9;
	public static final int OCTAL_ESC = 10;
	public static final int STRING = 11;
	public static final int UNICODE_ESC = 12;
	public static final int WS = 13;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Shakespeare() {
	}

	public Shakespeare(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public Shakespeare(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String getGrammarFileName() {
		//return "C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g";
		return "C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakaspeare.g";
	}

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:3:5:
			// ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' |
			// '_' )* )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:3:7:
			// ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' |
			// '_' )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:3:31:
				// ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if (((LA1_0 >= '0' && LA1_0 <= '9') || (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_'
							|| (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop1;
					}
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:6:5:
			// ( ( '0' .. '9' )+ )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:6:7:
			// ( '0' .. '9' )+
			{
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:6:7:
				// ( '0' .. '9' )+
				int cnt2 = 0;
				loop2: while (true) {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if (((LA2_0 >= '0' && LA2_0 <= '9'))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2, input);
						throw eee;
					}
					cnt2++;
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:10:5:
			// ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options
			// {greedy=false; } : . )* '*/' )
			int alt6 = 2;
			int LA6_0 = input.LA(1);
			if ((LA6_0 == '/')) {
				int LA6_1 = input.LA(2);
				if ((LA6_1 == '/')) {
					alt6 = 1;
				} else if ((LA6_1 == '*')) {
					alt6 = 2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae = new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
			case 1:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:10:9:
			// '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
				match("//");

				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:10:14:
				// (~ ( '\\n' | '\\r' ) )*
				loop3: while (true) {
					int alt3 = 2;
					int LA3_0 = input.LA(1);
					if (((LA3_0 >= '\u0000' && LA3_0 <= '\t') || (LA3_0 >= '\u000B' && LA3_0 <= '\f')
							|| (LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop3;
					}
				}

				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:10:28:
				// ( '\\r' )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);
				if ((LA4_0 == '\r')) {
					alt4 = 1;
				}
				switch (alt4) {
				case 1:
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:10:28:
				// '\\r'
				{
					match('\r');
				}
					break;

				}

				match('\n');
				_channel = HIDDEN;
			}
				break;
			case 2:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:11:9:
			// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:11:14:
				// ( options {greedy=false; } : . )*
				loop5: while (true) {
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					if ((LA5_0 == '*')) {
						int LA5_1 = input.LA(2);
						if ((LA5_1 == '/')) {
							alt5 = 2;
						} else if (((LA5_1 >= '\u0000' && LA5_1 <= '.') || (LA5_1 >= '0' && LA5_1 <= '\uFFFF'))) {
							alt5 = 1;
						}

					} else if (((LA5_0 >= '\u0000' && LA5_0 <= ')') || (LA5_0 >= '+' && LA5_0 <= '\uFFFF'))) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:11:42:
					// .
					{
						matchAny();
					}
						break;

					default:
						break loop5;
					}
				}

				match("*/");

				_channel = HIDDEN;
			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:14:5:
			// ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:14:9:
			// ( ' ' | '\\t' | '\\r' | '\\n' )
			{
				if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:22:5:
			// ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:22:8:
			// '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
				match('\"');
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:22:12:
				// ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
				loop7: while (true) {
					int alt7 = 3;
					int LA7_0 = input.LA(1);
					if ((LA7_0 == '\\')) {
						alt7 = 1;
					} else if (((LA7_0 >= '\u0000' && LA7_0 <= '!') || (LA7_0 >= '#' && LA7_0 <= '[')
							|| (LA7_0 >= ']' && LA7_0 <= '\uFFFF'))) {
						alt7 = 2;
					}

					switch (alt7) {
					case 1:
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:22:14:
					// ESC_SEQ
					{
						mESC_SEQ();

					}
						break;
					case 2:
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:22:24:
					// ~ ( '\\\\' | '\"' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!')
								|| (input.LA(1) >= '#' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop7;
					}
				}

				match('\"');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:5:
			// ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:8:
			// '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
				match('\'');
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:13:
				// ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
				int alt8 = 2;
				int LA8_0 = input.LA(1);
				if ((LA8_0 == '\\')) {
					alt8 = 1;
				} else if (((LA8_0 >= '\u0000' && LA8_0 <= '&') || (LA8_0 >= '(' && LA8_0 <= '[')
						|| (LA8_0 >= ']' && LA8_0 <= '\uFFFF'))) {
					alt8 = 2;
				}

				else {
					NoViableAltException nvae = new NoViableAltException("", 8, 0, input);
					throw nvae;
				}

				switch (alt8) {
				case 1:
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:15:
				// ESC_SEQ
				{
					mESC_SEQ();

				}
					break;
				case 2:
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:25:
				// ~ ( '\\'' | '\\\\' )
				{
					if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '[')
							|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
						input.consume();
					} else {
						MismatchedSetException mse = new MismatchedSetException(null, input);
						recover(mse);
						throw mse;
					}
				}
					break;

				}

				match('\'');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:29:11:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
			{
				if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}

		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:33:5:
			// ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) |
			// UNICODE_ESC | OCTAL_ESC )
			int alt9 = 3;
			int LA9_0 = input.LA(1);
			if ((LA9_0 == '\\')) {
				switch (input.LA(2)) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't': {
					alt9 = 1;
				}
					break;
				case 'u': {
					alt9 = 2;
				}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7': {
					alt9 = 3;
				}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae = new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae = new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
			case 1:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:33:9:
			// '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
				match('\\');
				if (input.LA(1) == '\"' || input.LA(1) == '\'' || input.LA(1) == '\\' || input.LA(1) == 'b'
						|| input.LA(1) == 'f' || input.LA(1) == 'n' || input.LA(1) == 'r' || input.LA(1) == 't') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}
				break;
			case 2:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:9:
			// UNICODE_ESC
			{
				mUNICODE_ESC();

			}
				break;
			case 3:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:35:9:
			// OCTAL_ESC
			{
				mOCTAL_ESC();

			}
				break;

			}
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:40:5:
			// ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' )
			// ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt10 = 3;
			int LA10_0 = input.LA(1);
			if ((LA10_0 == '\\')) {
				int LA10_1 = input.LA(2);
				if (((LA10_1 >= '0' && LA10_1 <= '3'))) {
					int LA10_2 = input.LA(3);
					if (((LA10_2 >= '0' && LA10_2 <= '7'))) {
						int LA10_4 = input.LA(4);
						if (((LA10_4 >= '0' && LA10_4 <= '7'))) {
							alt10 = 1;
						}

						else {
							alt10 = 2;
						}

					}

					else {
						alt10 = 3;
					}

				} else if (((LA10_1 >= '4' && LA10_1 <= '7'))) {
					int LA10_3 = input.LA(3);
					if (((LA10_3 >= '0' && LA10_3 <= '7'))) {
						alt10 = 2;
					}

					else {
						alt10 = 3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae = new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae = new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
			case 1:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:40:9:
			// '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
			{
				match('\\');
				if ((input.LA(1) >= '0' && input.LA(1) <= '3')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}
				break;
			case 2:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:41:9:
			// '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
			{
				match('\\');
				if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}
				break;
			case 3:
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:42:9:
			// '\\\\' ( '0' .. '7' )
			{
				match('\\');
				if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
			}
				break;

			}
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:5:
			// ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:9:
			// '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
				match('\\');
				match('u');
				mHEX_DIGIT();

				mHEX_DIGIT();

				mHEX_DIGIT();

				mHEX_DIGIT();

			}

		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:8:
		// ( ID | INT | COMMENT | WS | STRING | CHAR )
		int alt11 = 6;
		switch (input.LA(1)) {
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
		case 'z': {
			alt11 = 1;
		}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': {
			alt11 = 2;
		}
			break;
		case '/': {
			alt11 = 3;
		}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ': {
			alt11 = 4;
		}
			break;
		case '\"': {
			alt11 = 5;
		}
			break;
		case '\'': {
			alt11 = 6;
		}
			break;
		default:
			NoViableAltException nvae = new NoViableAltException("", 11, 0, input);
			throw nvae;
		}
		switch (alt11) {
		case 1:
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:10:
		// ID
		{
			mID();

		}
			break;
		case 2:
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:13:
		// INT
		{
			mINT();

		}
			break;
		case 3:
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:17:
		// COMMENT
		{
			mCOMMENT();

		}
			break;
		case 4:
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:25:
		// WS
		{
			mWS();

		}
			break;
		case 5:
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:28:
		// STRING
		{
			mSTRING();

		}
			break;
		case 6:
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:35:
		// CHAR
		{
			mCHAR();

		}
			break;

		}
	}

}
