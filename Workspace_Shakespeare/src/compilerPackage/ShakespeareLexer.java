// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-11 15:23:58

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ACT=4;
	public static final int AP=5;
	public static final int CHARACTER=6;
	public static final int CL=7;
	public static final int CM=8;
	public static final int DIGIT=9;
	public static final int DOT=10;
	public static final int ENTER=11;
	public static final int EP=12;
	public static final int EXEUNT=13;
	public static final int EXIT=14;
	public static final int FIFTY=15;
	public static final int FIVE=16;
	public static final int FIVEHUNDRED=17;
	public static final int FS=18;
	public static final int GOTO=19;
	public static final int HUNDREDS=20;
	public static final int ID=21;
	public static final int INPUTASCII=22;
	public static final int INPUTVALUE=23;
	public static final int LB=24;
	public static final int LETTER=25;
	public static final int NEGATIVEADJECTIVE=26;
	public static final int NEGATIVENOUN=27;
	public static final int NEUTRALADJECTIVE=28;
	public static final int NEUTRALNOUN=29;
	public static final int NUMBER=30;
	public static final int ONE=31;
	public static final int ONEHUNDRED=32;
	public static final int ONETHOUSAND=33;
	public static final int OUTPUTASCII=34;
	public static final int OUTPUTVALUE=35;
	public static final int POSITIVEADJECTIVE=36;
	public static final int POSITIVENOUN=37;
	public static final int QM=38;
	public static final int RB=39;
	public static final int SCENE=40;
	public static final int TEN=41;
	public static final int TENS=42;
	public static final int UNITS=43;
	public static final int WS=44;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }

	// $ANTLR start "ONE"
	public final void mONE() throws RecognitionException {
		try {
			int _type = ONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:75:13: ( 'I' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:75:15: 'I'
			{
			match('I'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONE"

	// $ANTLR start "FIVE"
	public final void mFIVE() throws RecognitionException {
		try {
			int _type = FIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:76:13: ( 'V' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:76:15: 'V'
			{
			match('V'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIVE"

	// $ANTLR start "TEN"
	public final void mTEN() throws RecognitionException {
		try {
			int _type = TEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:77:13: ( 'X' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:77:15: 'X'
			{
			match('X'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEN"

	// $ANTLR start "FIFTY"
	public final void mFIFTY() throws RecognitionException {
		try {
			int _type = FIFTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:78:13: ( 'L' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:78:15: 'L'
			{
			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIFTY"

	// $ANTLR start "ONEHUNDRED"
	public final void mONEHUNDRED() throws RecognitionException {
		try {
			int _type = ONEHUNDRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:13: ( 'C' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:15: 'C'
			{
			match('C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONEHUNDRED"

	// $ANTLR start "FIVEHUNDRED"
	public final void mFIVEHUNDRED() throws RecognitionException {
		try {
			int _type = FIVEHUNDRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:13: ( 'D' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:15: 'D'
			{
			match('D'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIVEHUNDRED"

	// $ANTLR start "ONETHOUSAND"
	public final void mONETHOUSAND() throws RecognitionException {
		try {
			int _type = ONETHOUSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:13: ( 'M' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:15: 'M'
			{
			match('M'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONETHOUSAND"

	// $ANTLR start "UNITS"
	public final void mUNITS() throws RecognitionException {
		try {
			int _type = UNITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:8: ( ( ONE )+ | ( ONE )+ ( FIVE | TEN ) | FIVE ( ONE )* )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:10: ( ONE )+
					{
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:10: ( ONE )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0=='I') ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='I' ) {
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
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:5: ( ONE )+ ( FIVE | TEN )
					{
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:5: ( ONE )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0=='I') ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='I' ) {
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
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					if ( input.LA(1)=='V'||input.LA(1)=='X' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:5: FIVE ( ONE )*
					{
					mFIVE(); 

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:10: ( ONE )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0=='I') ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='I' ) {
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
							break loop3;
						}
					}

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
	// $ANTLR end "UNITS"

	// $ANTLR start "TENS"
	public final void mTENS() throws RecognitionException {
		try {
			int _type = TENS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:8: ( ( TEN )+ ( FIFTY )* | ( FIFTY )+ ( TEN )* )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='X') ) {
				alt9=1;
			}
			else if ( (LA9_0=='L') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:10: ( TEN )+ ( FIFTY )*
					{
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:10: ( TEN )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='X') ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='X' ) {
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
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:15: ( FIFTY )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='L') ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='L' ) {
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
							break loop6;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:5: ( FIFTY )+ ( TEN )*
					{
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:5: ( FIFTY )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='L') ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='L' ) {
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
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:12: ( TEN )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='X') ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='X' ) {
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
							break loop8;
						}
					}

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
	// $ANTLR end "TENS"

	// $ANTLR start "HUNDREDS"
	public final void mHUNDREDS() throws RecognitionException {
		try {
			int _type = HUNDREDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:10: ( ( ONEHUNDRED )+ ( FIVEHUNDRED | ONETHOUSAND )* | FIVEHUNDRED ( ONEHUNDRED )* )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='C') ) {
				alt13=1;
			}
			else if ( (LA13_0=='D') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:12: ( ONEHUNDRED )+ ( FIVEHUNDRED | ONETHOUSAND )*
					{
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:12: ( ONEHUNDRED )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='C') ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='C' ) {
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:24: ( FIVEHUNDRED | ONETHOUSAND )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0=='D'||LA11_0=='M') ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='M' ) {
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
							break loop11;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:94:5: FIVEHUNDRED ( ONEHUNDRED )*
					{
					mFIVEHUNDRED(); 

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:94:17: ( ONEHUNDRED )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='C') ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
							{
							if ( input.LA(1)=='C' ) {
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
							break loop12;
						}
					}

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
	// $ANTLR end "HUNDREDS"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:9: ( ( HUNDREDS )? ( TENS )? UNITS )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:11: ( HUNDREDS )? ( TENS )? UNITS
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:11: ( HUNDREDS )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= 'C' && LA14_0 <= 'D')) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:11: HUNDREDS
					{
					mHUNDREDS(); 

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:21: ( TENS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='L'||LA15_0=='X') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:21: TENS
					{
					mTENS(); 

					}
					break;

			}

			mUNITS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:5: ( 'Romeo' | 'Juliet' | 'Hamlet' | 'Ghost' | 'LadyMacbeth' | 'Ophelia' | 'Tebaldo' | 'Claudio' | 'Mercuzio' | 'Banquo' | 'Fulgencio' | 'Gertrude' | 'Desdemona' | 'Jago' | 'Polonio' | 'Macduff' | 'Shylock' | 'Laerte' | 'Orazio' | 'Prospero' )
			int alt16=20;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt16=1;
				}
				break;
			case 'J':
				{
				int LA16_2 = input.LA(2);
				if ( (LA16_2=='u') ) {
					alt16=2;
				}
				else if ( (LA16_2=='a') ) {
					alt16=14;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'H':
				{
				alt16=3;
				}
				break;
			case 'G':
				{
				int LA16_4 = input.LA(2);
				if ( (LA16_4=='h') ) {
					alt16=4;
				}
				else if ( (LA16_4=='e') ) {
					alt16=12;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'L':
				{
				int LA16_5 = input.LA(2);
				if ( (LA16_5=='a') ) {
					int LA16_19 = input.LA(3);
					if ( (LA16_19=='d') ) {
						alt16=5;
					}
					else if ( (LA16_19=='e') ) {
						alt16=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 19, input);
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
							new NoViableAltException("", 16, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'O':
				{
				int LA16_6 = input.LA(2);
				if ( (LA16_6=='p') ) {
					alt16=6;
				}
				else if ( (LA16_6=='r') ) {
					alt16=19;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'T':
				{
				alt16=7;
				}
				break;
			case 'C':
				{
				alt16=8;
				}
				break;
			case 'M':
				{
				int LA16_9 = input.LA(2);
				if ( (LA16_9=='e') ) {
					alt16=9;
				}
				else if ( (LA16_9=='a') ) {
					alt16=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'B':
				{
				alt16=10;
				}
				break;
			case 'F':
				{
				alt16=11;
				}
				break;
			case 'D':
				{
				alt16=13;
				}
				break;
			case 'P':
				{
				int LA16_13 = input.LA(2);
				if ( (LA16_13=='o') ) {
					alt16=15;
				}
				else if ( (LA16_13=='r') ) {
					alt16=20;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
				{
				alt16=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:9: 'Romeo'
					{
					match("Romeo"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:9: 'Juliet'
					{
					match("Juliet"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:7: 'Hamlet'
					{
					match("Hamlet"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:9: 'Ghost'
					{
					match("Ghost"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:9: 'LadyMacbeth'
					{
					match("LadyMacbeth"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:9: 'Ophelia'
					{
					match("Ophelia"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:9: 'Tebaldo'
					{
					match("Tebaldo"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:9: 'Claudio'
					{
					match("Claudio"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:9: 'Mercuzio'
					{
					match("Mercuzio"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:9: 'Banquo'
					{
					match("Banquo"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:9: 'Fulgencio'
					{
					match("Fulgencio"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:9: 'Gertrude'
					{
					match("Gertrude"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:9: 'Desdemona'
					{
					match("Desdemona"); 

					}
					break;
				case 14 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:9: 'Jago'
					{
					match("Jago"); 

					}
					break;
				case 15 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:9: 'Polonio'
					{
					match("Polonio"); 

					}
					break;
				case 16 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:9: 'Macduff'
					{
					match("Macduff"); 

					}
					break;
				case 17 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:9: 'Shylock'
					{
					match("Shylock"); 

					}
					break;
				case 18 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:118:9: 'Laerte'
					{
					match("Laerte"); 

					}
					break;
				case 19 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:9: 'Orazio'
					{
					match("Orazio"); 

					}
					break;
				case 20 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:9: 'Prospero'
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

	// $ANTLR start "POSITIVENOUN"
	public final void mPOSITIVENOUN() throws RecognitionException {
		try {
			int _type = POSITIVENOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:5: ( 'Heaven' | 'King' | 'Lord' | 'angel' | 'flower' | 'happiness' | 'joy' | 'plum' | 'summer’s day' | 'hero' | 'rose' | 'kingdom' | 'pony' )
			int alt17=13;
			switch ( input.LA(1) ) {
			case 'H':
				{
				alt17=1;
				}
				break;
			case 'K':
				{
				alt17=2;
				}
				break;
			case 'L':
				{
				alt17=3;
				}
				break;
			case 'a':
				{
				alt17=4;
				}
				break;
			case 'f':
				{
				alt17=5;
				}
				break;
			case 'h':
				{
				int LA17_6 = input.LA(2);
				if ( (LA17_6=='a') ) {
					alt17=6;
				}
				else if ( (LA17_6=='e') ) {
					alt17=10;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'j':
				{
				alt17=7;
				}
				break;
			case 'p':
				{
				int LA17_8 = input.LA(2);
				if ( (LA17_8=='l') ) {
					alt17=8;
				}
				else if ( (LA17_8=='o') ) {
					alt17=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt17=9;
				}
				break;
			case 'r':
				{
				alt17=11;
				}
				break;
			case 'k':
				{
				alt17=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:9: 'Heaven'
					{
					match("Heaven"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:9: 'King'
					{
					match("King"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:9: 'Lord'
					{
					match("Lord"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:9: 'angel'
					{
					match("angel"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:130:9: 'flower'
					{
					match("flower"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:9: 'happiness'
					{
					match("happiness"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:9: 'joy'
					{
					match("joy"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:9: 'plum'
					{
					match("plum"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:9: 'summer’s day'
					{
					match("summer’s day"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:135:9: 'hero'
					{
					match("hero"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:9: 'rose'
					{
					match("rose"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:9: 'kingdom'
					{
					match("kingdom"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:138:9: 'pony'
					{
					match("pony"); 

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
	// $ANTLR end "POSITIVENOUN"

	// $ANTLR start "NEUTRALNOUN"
	public final void mNEUTRALNOUN() throws RecognitionException {
		try {
			int _type = NEUTRALNOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:5: ( 'animal' | 'aunt' | 'brother' | 'cat' | 'chihuahua' | 'cousin' | 'cow' | 'daughter' | 'door' | 'face' | 'father' | 'fellow' | 'granddaughter' | 'grandfather' | 'grandmother' | 'grandson' | 'hair' | 'hamster' | 'horse' | 'lamp' | 'lantern' | 'mistletoe' | 'moon' | 'morning' | 'mother' | 'nephew' | 'niece' | 'nose' | 'purse' | 'road' | 'roman' | 'sister' | 'sky' | 'son' | 'squirrel' | 'stonewall' | 'thing' | 'town' | 'tree' | 'uncle' | 'wind' )
			int alt18=41;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:9: 'animal'
					{
					match("animal"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:9: 'aunt'
					{
					match("aunt"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:146:9: 'brother'
					{
					match("brother"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:9: 'cat'
					{
					match("cat"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:9: 'chihuahua'
					{
					match("chihuahua"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:149:9: 'cousin'
					{
					match("cousin"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:150:9: 'cow'
					{
					match("cow"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:151:9: 'daughter'
					{
					match("daughter"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:152:9: 'door'
					{
					match("door"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:153:9: 'face'
					{
					match("face"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:9: 'father'
					{
					match("father"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:155:9: 'fellow'
					{
					match("fellow"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:156:9: 'granddaughter'
					{
					match("granddaughter"); 

					}
					break;
				case 14 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:157:9: 'grandfather'
					{
					match("grandfather"); 

					}
					break;
				case 15 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:9: 'grandmother'
					{
					match("grandmother"); 

					}
					break;
				case 16 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:159:9: 'grandson'
					{
					match("grandson"); 

					}
					break;
				case 17 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:160:9: 'hair'
					{
					match("hair"); 

					}
					break;
				case 18 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:161:9: 'hamster'
					{
					match("hamster"); 

					}
					break;
				case 19 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:162:9: 'horse'
					{
					match("horse"); 

					}
					break;
				case 20 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:163:9: 'lamp'
					{
					match("lamp"); 

					}
					break;
				case 21 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:164:9: 'lantern'
					{
					match("lantern"); 

					}
					break;
				case 22 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:165:9: 'mistletoe'
					{
					match("mistletoe"); 

					}
					break;
				case 23 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:166:9: 'moon'
					{
					match("moon"); 

					}
					break;
				case 24 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:167:9: 'morning'
					{
					match("morning"); 

					}
					break;
				case 25 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:168:9: 'mother'
					{
					match("mother"); 

					}
					break;
				case 26 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:169:9: 'nephew'
					{
					match("nephew"); 

					}
					break;
				case 27 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:170:9: 'niece'
					{
					match("niece"); 

					}
					break;
				case 28 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:9: 'nose'
					{
					match("nose"); 

					}
					break;
				case 29 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:172:9: 'purse'
					{
					match("purse"); 

					}
					break;
				case 30 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:173:9: 'road'
					{
					match("road"); 

					}
					break;
				case 31 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:174:9: 'roman'
					{
					match("roman"); 

					}
					break;
				case 32 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:9: 'sister'
					{
					match("sister"); 

					}
					break;
				case 33 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:176:9: 'sky'
					{
					match("sky"); 

					}
					break;
				case 34 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:177:9: 'son'
					{
					match("son"); 

					}
					break;
				case 35 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:178:9: 'squirrel'
					{
					match("squirrel"); 

					}
					break;
				case 36 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:179:9: 'stonewall'
					{
					match("stonewall"); 

					}
					break;
				case 37 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:180:9: 'thing'
					{
					match("thing"); 

					}
					break;
				case 38 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:181:9: 'town'
					{
					match("town"); 

					}
					break;
				case 39 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:182:9: 'tree'
					{
					match("tree"); 

					}
					break;
				case 40 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:183:9: 'uncle'
					{
					match("uncle"); 

					}
					break;
				case 41 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:184:9: 'wind'
					{
					match("wind"); 

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
	// $ANTLR end "NEUTRALNOUN"

	// $ANTLR start "NEGATIVENOUN"
	public final void mNEGATIVENOUN() throws RecognitionException {
		try {
			int _type = NEGATIVENOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:5: ( 'Hell' | 'Microsoft' | 'bastard' | 'beggar' | 'blister' | 'codpiece' | 'coward' | 'curse' | 'death' | 'devil' | 'draught' | 'famine' | 'flirt-gill' | 'goat' | 'hate' | 'hog' | 'hound' | 'leech' | 'lie' | 'pig' | 'plague' | 'starvation' | 'toad' | 'war' | 'wolf' )
			int alt19=25;
			switch ( input.LA(1) ) {
			case 'H':
				{
				alt19=1;
				}
				break;
			case 'M':
				{
				alt19=2;
				}
				break;
			case 'b':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt19=3;
					}
					break;
				case 'e':
					{
					alt19=4;
					}
					break;
				case 'l':
					{
					alt19=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'c':
				{
				int LA19_4 = input.LA(2);
				if ( (LA19_4=='o') ) {
					int LA19_17 = input.LA(3);
					if ( (LA19_17=='d') ) {
						alt19=6;
					}
					else if ( (LA19_17=='w') ) {
						alt19=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA19_4=='u') ) {
					alt19=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA19_5 = input.LA(2);
				if ( (LA19_5=='e') ) {
					int LA19_19 = input.LA(3);
					if ( (LA19_19=='a') ) {
						alt19=9;
					}
					else if ( (LA19_19=='v') ) {
						alt19=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA19_5=='r') ) {
					alt19=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				int LA19_6 = input.LA(2);
				if ( (LA19_6=='a') ) {
					alt19=12;
				}
				else if ( (LA19_6=='l') ) {
					alt19=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'g':
				{
				alt19=14;
				}
				break;
			case 'h':
				{
				int LA19_8 = input.LA(2);
				if ( (LA19_8=='a') ) {
					alt19=15;
				}
				else if ( (LA19_8=='o') ) {
					int LA19_24 = input.LA(3);
					if ( (LA19_24=='g') ) {
						alt19=16;
					}
					else if ( (LA19_24=='u') ) {
						alt19=17;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 24, input);
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
							new NoViableAltException("", 19, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				int LA19_9 = input.LA(2);
				if ( (LA19_9=='e') ) {
					alt19=18;
				}
				else if ( (LA19_9=='i') ) {
					alt19=19;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'p':
				{
				int LA19_10 = input.LA(2);
				if ( (LA19_10=='i') ) {
					alt19=20;
				}
				else if ( (LA19_10=='l') ) {
					alt19=21;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt19=22;
				}
				break;
			case 't':
				{
				alt19=23;
				}
				break;
			case 'w':
				{
				int LA19_13 = input.LA(2);
				if ( (LA19_13=='a') ) {
					alt19=24;
				}
				else if ( (LA19_13=='o') ) {
					alt19=25;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:9: 'Hell'
					{
					match("Hell"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:191:9: 'Microsoft'
					{
					match("Microsoft"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:192:9: 'bastard'
					{
					match("bastard"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:193:9: 'beggar'
					{
					match("beggar"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:194:9: 'blister'
					{
					match("blister"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:195:9: 'codpiece'
					{
					match("codpiece"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:196:9: 'coward'
					{
					match("coward"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:197:9: 'curse'
					{
					match("curse"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:198:9: 'death'
					{
					match("death"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:199:9: 'devil'
					{
					match("devil"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:200:9: 'draught'
					{
					match("draught"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:201:9: 'famine'
					{
					match("famine"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:202:9: 'flirt-gill'
					{
					match("flirt-gill"); 

					}
					break;
				case 14 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:203:9: 'goat'
					{
					match("goat"); 

					}
					break;
				case 15 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:204:9: 'hate'
					{
					match("hate"); 

					}
					break;
				case 16 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:205:9: 'hog'
					{
					match("hog"); 

					}
					break;
				case 17 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:206:9: 'hound'
					{
					match("hound"); 

					}
					break;
				case 18 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:207:9: 'leech'
					{
					match("leech"); 

					}
					break;
				case 19 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:208:9: 'lie'
					{
					match("lie"); 

					}
					break;
				case 20 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:209:9: 'pig'
					{
					match("pig"); 

					}
					break;
				case 21 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:210:9: 'plague'
					{
					match("plague"); 

					}
					break;
				case 22 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:211:9: 'starvation'
					{
					match("starvation"); 

					}
					break;
				case 23 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:212:9: 'toad'
					{
					match("toad"); 

					}
					break;
				case 24 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:213:9: 'war'
					{
					match("war"); 

					}
					break;
				case 25 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:214:9: 'wolf'
					{
					match("wolf"); 

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
	// $ANTLR end "NEGATIVENOUN"

	// $ANTLR start "POSITIVEADJECTIVE"
	public final void mPOSITIVEADJECTIVE() throws RecognitionException {
		try {
			int _type = POSITIVEADJECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:219:5: ( 'amazing' | 'beautiful' | 'blossoming' | 'bold' | 'brave' | 'charming' | 'clearest' | 'cunning' | 'cute' | 'delicious' | 'embroidered' | 'fair' | 'fine' | 'gentle' | 'golden' | 'good' | 'handsome' | 'happy' | 'healthy' | 'honest' | 'lovely' | 'loving' | 'mighty' | 'noble' | 'peaceful' | 'pretty' | 'prompt' | 'proud' | 'reddest' | 'rich' | 'smooth' | 'sunny' | 'sweet' | 'sweetest' | 'trustworthy' | 'warm' )
			int alt20=36;
			switch ( input.LA(1) ) {
			case 'a':
				{
				alt20=1;
				}
				break;
			case 'b':
				{
				switch ( input.LA(2) ) {
				case 'e':
					{
					alt20=2;
					}
					break;
				case 'l':
					{
					alt20=3;
					}
					break;
				case 'o':
					{
					alt20=4;
					}
					break;
				case 'r':
					{
					alt20=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'c':
				{
				switch ( input.LA(2) ) {
				case 'h':
					{
					alt20=6;
					}
					break;
				case 'l':
					{
					alt20=7;
					}
					break;
				case 'u':
					{
					int LA20_23 = input.LA(3);
					if ( (LA20_23=='n') ) {
						alt20=8;
					}
					else if ( (LA20_23=='t') ) {
						alt20=9;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 23, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'd':
				{
				alt20=10;
				}
				break;
			case 'e':
				{
				alt20=11;
				}
				break;
			case 'f':
				{
				int LA20_6 = input.LA(2);
				if ( (LA20_6=='a') ) {
					alt20=12;
				}
				else if ( (LA20_6=='i') ) {
					alt20=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'g':
				{
				int LA20_7 = input.LA(2);
				if ( (LA20_7=='e') ) {
					alt20=14;
				}
				else if ( (LA20_7=='o') ) {
					int LA20_27 = input.LA(3);
					if ( (LA20_27=='l') ) {
						alt20=15;
					}
					else if ( (LA20_27=='o') ) {
						alt20=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 27, input);
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
							new NoViableAltException("", 20, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'h':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					int LA20_28 = input.LA(3);
					if ( (LA20_28=='n') ) {
						alt20=17;
					}
					else if ( (LA20_28=='p') ) {
						alt20=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'e':
					{
					alt20=19;
					}
					break;
				case 'o':
					{
					alt20=20;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'l':
				{
				int LA20_9 = input.LA(2);
				if ( (LA20_9=='o') ) {
					int LA20_31 = input.LA(3);
					if ( (LA20_31=='v') ) {
						int LA20_45 = input.LA(4);
						if ( (LA20_45=='e') ) {
							alt20=21;
						}
						else if ( (LA20_45=='i') ) {
							alt20=22;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 45, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 31, input);
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
							new NoViableAltException("", 20, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				alt20=23;
				}
				break;
			case 'n':
				{
				alt20=24;
				}
				break;
			case 'p':
				{
				int LA20_12 = input.LA(2);
				if ( (LA20_12=='e') ) {
					alt20=25;
				}
				else if ( (LA20_12=='r') ) {
					int LA20_33 = input.LA(3);
					if ( (LA20_33=='e') ) {
						alt20=26;
					}
					else if ( (LA20_33=='o') ) {
						int LA20_47 = input.LA(4);
						if ( (LA20_47=='m') ) {
							alt20=27;
						}
						else if ( (LA20_47=='u') ) {
							alt20=28;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 47, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 33, input);
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
							new NoViableAltException("", 20, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'r':
				{
				int LA20_13 = input.LA(2);
				if ( (LA20_13=='e') ) {
					alt20=29;
				}
				else if ( (LA20_13=='i') ) {
					alt20=30;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt20=31;
					}
					break;
				case 'u':
					{
					alt20=32;
					}
					break;
				case 'w':
					{
					int LA20_38 = input.LA(3);
					if ( (LA20_38=='e') ) {
						int LA20_48 = input.LA(4);
						if ( (LA20_48=='e') ) {
							int LA20_53 = input.LA(5);
							if ( (LA20_53=='t') ) {
								int LA20_54 = input.LA(6);
								if ( (LA20_54=='e') ) {
									alt20=34;
								}

								else {
									alt20=33;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 20, 53, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 48, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 38, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 't':
				{
				alt20=35;
				}
				break;
			case 'w':
				{
				alt20=36;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:219:9: 'amazing'
					{
					match("amazing"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:220:9: 'beautiful'
					{
					match("beautiful"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:221:9: 'blossoming'
					{
					match("blossoming"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:222:9: 'bold'
					{
					match("bold"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:223:9: 'brave'
					{
					match("brave"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:224:9: 'charming'
					{
					match("charming"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:225:9: 'clearest'
					{
					match("clearest"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:226:9: 'cunning'
					{
					match("cunning"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:227:9: 'cute'
					{
					match("cute"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:228:9: 'delicious'
					{
					match("delicious"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:229:9: 'embroidered'
					{
					match("embroidered"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:230:9: 'fair'
					{
					match("fair"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:231:9: 'fine'
					{
					match("fine"); 

					}
					break;
				case 14 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:232:9: 'gentle'
					{
					match("gentle"); 

					}
					break;
				case 15 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:233:9: 'golden'
					{
					match("golden"); 

					}
					break;
				case 16 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:234:9: 'good'
					{
					match("good"); 

					}
					break;
				case 17 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:235:9: 'handsome'
					{
					match("handsome"); 

					}
					break;
				case 18 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:236:9: 'happy'
					{
					match("happy"); 

					}
					break;
				case 19 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:237:9: 'healthy'
					{
					match("healthy"); 

					}
					break;
				case 20 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:238:9: 'honest'
					{
					match("honest"); 

					}
					break;
				case 21 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:239:9: 'lovely'
					{
					match("lovely"); 

					}
					break;
				case 22 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:240:9: 'loving'
					{
					match("loving"); 

					}
					break;
				case 23 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:241:9: 'mighty'
					{
					match("mighty"); 

					}
					break;
				case 24 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:242:9: 'noble'
					{
					match("noble"); 

					}
					break;
				case 25 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:243:9: 'peaceful'
					{
					match("peaceful"); 

					}
					break;
				case 26 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:244:9: 'pretty'
					{
					match("pretty"); 

					}
					break;
				case 27 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:245:9: 'prompt'
					{
					match("prompt"); 

					}
					break;
				case 28 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:246:9: 'proud'
					{
					match("proud"); 

					}
					break;
				case 29 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:247:9: 'reddest'
					{
					match("reddest"); 

					}
					break;
				case 30 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:248:9: 'rich'
					{
					match("rich"); 

					}
					break;
				case 31 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:249:9: 'smooth'
					{
					match("smooth"); 

					}
					break;
				case 32 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:250:9: 'sunny'
					{
					match("sunny"); 

					}
					break;
				case 33 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:251:9: 'sweet'
					{
					match("sweet"); 

					}
					break;
				case 34 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:252:9: 'sweetest'
					{
					match("sweetest"); 

					}
					break;
				case 35 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:253:9: 'trustworthy'
					{
					match("trustworthy"); 

					}
					break;
				case 36 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:254:9: 'warm'
					{
					match("warm"); 

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
	// $ANTLR end "POSITIVEADJECTIVE"

	// $ANTLR start "NEUTRALADJECTIVE"
	public final void mNEUTRALADJECTIVE() throws RecognitionException {
		try {
			int _type = NEUTRALADJECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:259:5: ( 'big' | 'black' | 'blue' | 'bluest' | 'bottomless' | 'furry' | 'green' | 'hard' | 'huge' | 'large' | 'little' | 'normal' | 'old' | 'purple' | 'red' | 'rural' | 'small' | 'tiny' | 'white' | 'yellow' )
			int alt21=20;
			switch ( input.LA(1) ) {
			case 'b':
				{
				switch ( input.LA(2) ) {
				case 'i':
					{
					alt21=1;
					}
					break;
				case 'l':
					{
					int LA21_15 = input.LA(3);
					if ( (LA21_15=='a') ) {
						alt21=2;
					}
					else if ( (LA21_15=='u') ) {
						int LA21_24 = input.LA(4);
						if ( (LA21_24=='e') ) {
							int LA21_25 = input.LA(5);
							if ( (LA21_25=='s') ) {
								alt21=4;
							}

							else {
								alt21=3;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 21, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'o':
					{
					alt21=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'f':
				{
				alt21=6;
				}
				break;
			case 'g':
				{
				alt21=7;
				}
				break;
			case 'h':
				{
				int LA21_4 = input.LA(2);
				if ( (LA21_4=='a') ) {
					alt21=8;
				}
				else if ( (LA21_4=='u') ) {
					alt21=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				int LA21_5 = input.LA(2);
				if ( (LA21_5=='a') ) {
					alt21=10;
				}
				else if ( (LA21_5=='i') ) {
					alt21=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'n':
				{
				alt21=12;
				}
				break;
			case 'o':
				{
				alt21=13;
				}
				break;
			case 'p':
				{
				alt21=14;
				}
				break;
			case 'r':
				{
				int LA21_9 = input.LA(2);
				if ( (LA21_9=='e') ) {
					alt21=15;
				}
				else if ( (LA21_9=='u') ) {
					alt21=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt21=17;
				}
				break;
			case 't':
				{
				alt21=18;
				}
				break;
			case 'w':
				{
				alt21=19;
				}
				break;
			case 'y':
				{
				alt21=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:259:9: 'big'
					{
					match("big"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:260:9: 'black'
					{
					match("black"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:261:9: 'blue'
					{
					match("blue"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:262:9: 'bluest'
					{
					match("bluest"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:263:9: 'bottomless'
					{
					match("bottomless"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:264:9: 'furry'
					{
					match("furry"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:265:9: 'green'
					{
					match("green"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:266:9: 'hard'
					{
					match("hard"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:267:9: 'huge'
					{
					match("huge"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:268:9: 'large'
					{
					match("large"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:269:9: 'little'
					{
					match("little"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:270:9: 'normal'
					{
					match("normal"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:271:9: 'old'
					{
					match("old"); 

					}
					break;
				case 14 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:272:9: 'purple'
					{
					match("purple"); 

					}
					break;
				case 15 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:273:9: 'red'
					{
					match("red"); 

					}
					break;
				case 16 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:274:9: 'rural'
					{
					match("rural"); 

					}
					break;
				case 17 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:275:9: 'small'
					{
					match("small"); 

					}
					break;
				case 18 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:276:9: 'tiny'
					{
					match("tiny"); 

					}
					break;
				case 19 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:277:9: 'white'
					{
					match("white"); 

					}
					break;
				case 20 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:278:9: 'yellow'
					{
					match("yellow"); 

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
	// $ANTLR end "NEUTRALADJECTIVE"

	// $ANTLR start "NEGATIVEADJECTIVE"
	public final void mNEGATIVEADJECTIVE() throws RecognitionException {
		try {
			int _type = NEGATIVEADJECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:283:5: ( 'bad' | 'cowardly' | 'cursed' | 'damned' | 'dirty' | 'disgusting' | 'distasteful' | 'dusty' | 'evil' | 'fat' | 'fat-kidneyed' | 'fatherless' | 'foul' | 'hairy' | 'half-witted' | 'horrible' | 'horrid' | 'infected' | 'lying' | 'miserable' | 'misused' | 'oozing' | 'rotten' | 'smelly' | 'snotty' | 'sorry' | 'stinking' | 'stuffed' | 'stupid' | 'vile' | 'villainous' | 'worried' )
			int alt22=32;
			switch ( input.LA(1) ) {
			case 'b':
				{
				alt22=1;
				}
				break;
			case 'c':
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2=='o') ) {
					alt22=2;
				}
				else if ( (LA22_2=='u') ) {
					alt22=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt22=4;
					}
					break;
				case 'i':
					{
					int LA22_18 = input.LA(3);
					if ( (LA22_18=='r') ) {
						alt22=5;
					}
					else if ( (LA22_18=='s') ) {
						int LA22_31 = input.LA(4);
						if ( (LA22_31=='g') ) {
							alt22=6;
						}
						else if ( (LA22_31=='t') ) {
							alt22=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 31, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'u':
					{
					alt22=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'e':
				{
				alt22=9;
				}
				break;
			case 'f':
				{
				int LA22_5 = input.LA(2);
				if ( (LA22_5=='a') ) {
					int LA22_20 = input.LA(3);
					if ( (LA22_20=='t') ) {
						switch ( input.LA(4) ) {
						case '-':
							{
							alt22=11;
							}
							break;
						case 'h':
							{
							alt22=12;
							}
							break;
						default:
							alt22=10;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA22_5=='o') ) {
					alt22=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'h':
				{
				int LA22_6 = input.LA(2);
				if ( (LA22_6=='a') ) {
					int LA22_22 = input.LA(3);
					if ( (LA22_22=='i') ) {
						alt22=14;
					}
					else if ( (LA22_22=='l') ) {
						alt22=15;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA22_6=='o') ) {
					int LA22_23 = input.LA(3);
					if ( (LA22_23=='r') ) {
						int LA22_35 = input.LA(4);
						if ( (LA22_35=='r') ) {
							int LA22_45 = input.LA(5);
							if ( (LA22_45=='i') ) {
								int LA22_52 = input.LA(6);
								if ( (LA22_52=='b') ) {
									alt22=16;
								}
								else if ( (LA22_52=='d') ) {
									alt22=17;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 22, 52, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 22, 45, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 35, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 23, input);
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
							new NoViableAltException("", 22, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'i':
				{
				alt22=18;
				}
				break;
			case 'l':
				{
				alt22=19;
				}
				break;
			case 'm':
				{
				int LA22_9 = input.LA(2);
				if ( (LA22_9=='i') ) {
					int LA22_24 = input.LA(3);
					if ( (LA22_24=='s') ) {
						int LA22_36 = input.LA(4);
						if ( (LA22_36=='e') ) {
							alt22=20;
						}
						else if ( (LA22_36=='u') ) {
							alt22=21;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 24, input);
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
							new NoViableAltException("", 22, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'o':
				{
				alt22=22;
				}
				break;
			case 'r':
				{
				alt22=23;
				}
				break;
			case 's':
				{
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt22=24;
					}
					break;
				case 'n':
					{
					alt22=25;
					}
					break;
				case 'o':
					{
					alt22=26;
					}
					break;
				case 't':
					{
					int LA22_28 = input.LA(3);
					if ( (LA22_28=='i') ) {
						alt22=27;
					}
					else if ( (LA22_28=='u') ) {
						int LA22_38 = input.LA(4);
						if ( (LA22_38=='f') ) {
							alt22=28;
						}
						else if ( (LA22_38=='p') ) {
							alt22=29;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 38, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'v':
				{
				int LA22_13 = input.LA(2);
				if ( (LA22_13=='i') ) {
					int LA22_29 = input.LA(3);
					if ( (LA22_29=='l') ) {
						int LA22_39 = input.LA(4);
						if ( (LA22_39=='e') ) {
							alt22=30;
						}
						else if ( (LA22_39=='l') ) {
							alt22=31;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 39, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 29, input);
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
							new NoViableAltException("", 22, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'w':
				{
				alt22=32;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:283:9: 'bad'
					{
					match("bad"); 

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:284:9: 'cowardly'
					{
					match("cowardly"); 

					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:285:9: 'cursed'
					{
					match("cursed"); 

					}
					break;
				case 4 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:286:9: 'damned'
					{
					match("damned"); 

					}
					break;
				case 5 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:287:9: 'dirty'
					{
					match("dirty"); 

					}
					break;
				case 6 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:288:9: 'disgusting'
					{
					match("disgusting"); 

					}
					break;
				case 7 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:289:9: 'distasteful'
					{
					match("distasteful"); 

					}
					break;
				case 8 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:290:9: 'dusty'
					{
					match("dusty"); 

					}
					break;
				case 9 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:291:9: 'evil'
					{
					match("evil"); 

					}
					break;
				case 10 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:292:9: 'fat'
					{
					match("fat"); 

					}
					break;
				case 11 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:293:9: 'fat-kidneyed'
					{
					match("fat-kidneyed"); 

					}
					break;
				case 12 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:294:9: 'fatherless'
					{
					match("fatherless"); 

					}
					break;
				case 13 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:295:9: 'foul'
					{
					match("foul"); 

					}
					break;
				case 14 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:296:9: 'hairy'
					{
					match("hairy"); 

					}
					break;
				case 15 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:297:9: 'half-witted'
					{
					match("half-witted"); 

					}
					break;
				case 16 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:298:9: 'horrible'
					{
					match("horrible"); 

					}
					break;
				case 17 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:299:9: 'horrid'
					{
					match("horrid"); 

					}
					break;
				case 18 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:300:9: 'infected'
					{
					match("infected"); 

					}
					break;
				case 19 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:301:9: 'lying'
					{
					match("lying"); 

					}
					break;
				case 20 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:302:9: 'miserable'
					{
					match("miserable"); 

					}
					break;
				case 21 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:303:9: 'misused'
					{
					match("misused"); 

					}
					break;
				case 22 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:304:9: 'oozing'
					{
					match("oozing"); 

					}
					break;
				case 23 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:305:9: 'rotten'
					{
					match("rotten"); 

					}
					break;
				case 24 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:306:9: 'smelly'
					{
					match("smelly"); 

					}
					break;
				case 25 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:307:9: 'snotty'
					{
					match("snotty"); 

					}
					break;
				case 26 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:308:9: 'sorry'
					{
					match("sorry"); 

					}
					break;
				case 27 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:309:9: 'stinking'
					{
					match("stinking"); 

					}
					break;
				case 28 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:310:9: 'stuffed'
					{
					match("stuffed"); 

					}
					break;
				case 29 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:311:9: 'stupid'
					{
					match("stupid"); 

					}
					break;
				case 30 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:312:9: 'vile'
					{
					match("vile"); 

					}
					break;
				case 31 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:313:9: 'villainous'
					{
					match("villainous"); 

					}
					break;
				case 32 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:314:9: 'worried'
					{
					match("worried"); 

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
	// $ANTLR end "NEGATIVEADJECTIVE"

	// $ANTLR start "ACT"
	public final void mACT() throws RecognitionException {
		try {
			int _type = ACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:320:6: ( 'Act' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:320:8: 'Act'
			{
			match("Act"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACT"

	// $ANTLR start "SCENE"
	public final void mSCENE() throws RecognitionException {
		try {
			int _type = SCENE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:321:8: ( 'Scene' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:321:10: 'Scene'
			{
			match("Scene"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCENE"

	// $ANTLR start "ENTER"
	public final void mENTER() throws RecognitionException {
		try {
			int _type = ENTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:322:17: ( 'Enter' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:322:22: 'Enter'
			{
			match("Enter"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTER"

	// $ANTLR start "EXIT"
	public final void mEXIT() throws RecognitionException {
		try {
			int _type = EXIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:323:17: ( 'Exit' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:323:22: 'Exit'
			{
			match("Exit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXIT"

	// $ANTLR start "EXEUNT"
	public final void mEXEUNT() throws RecognitionException {
		try {
			int _type = EXEUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:324:17: ( 'Exeunt' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:324:22: 'Exeunt'
			{
			match("Exeunt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXEUNT"

	// $ANTLR start "GOTO"
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:325:17: ( 'goto' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:325:22: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO"

	// $ANTLR start "OUTPUTVALUE"
	public final void mOUTPUTVALUE() throws RecognitionException {
		try {
			int _type = OUTPUTVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:327:17: ( 'Open your heart' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:327:22: 'Open your heart'
			{
			match("Open your heart"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTPUTVALUE"

	// $ANTLR start "OUTPUTASCII"
	public final void mOUTPUTASCII() throws RecognitionException {
		try {
			int _type = OUTPUTASCII;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:328:17: ( 'Speak your mind' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:328:22: 'Speak your mind'
			{
			match("Speak your mind"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTPUTASCII"

	// $ANTLR start "INPUTVALUE"
	public final void mINPUTVALUE() throws RecognitionException {
		try {
			int _type = INPUTVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:329:17: ( 'Open your mind' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:329:22: 'Open your mind'
			{
			match("Open your mind"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INPUTVALUE"

	// $ANTLR start "INPUTASCII"
	public final void mINPUTASCII() throws RecognitionException {
		try {
			int _type = INPUTASCII;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:330:17: ( 'Listen to your heart' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:330:22: 'Listen to your heart'
			{
			match("Listen to your heart"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INPUTASCII"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:336:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:339:7: ( '0' .. '9' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:342:5: ( ':' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:342:7: ':'
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

	// $ANTLR start "CM"
	public final void mCM() throws RecognitionException {
		try {
			int _type = CM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:343:5: ( ',' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:343:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CM"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:344:8: ( '.' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:344:11: '.'
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

	// $ANTLR start "AP"
	public final void mAP() throws RecognitionException {
		try {
			int _type = AP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:346:8: ( '\\'' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:346:10: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AP"

	// $ANTLR start "EP"
	public final void mEP() throws RecognitionException {
		try {
			int _type = EP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:347:8: ( '!' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:347:11: '!'
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
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:348:8: ( '?' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:348:10: '?'
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

	// $ANTLR start "FS"
	public final void mFS() throws RecognitionException {
		try {
			int _type = FS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:349:4: ( '/' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:349:6: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:352:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:352:7: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:353:3: ( LETTER | DIGIT | '_' )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
					break loop23;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:357:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:357:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:357:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '\t' && LA24_0 <= '\n')||LA24_0=='\r'||LA24_0==' ') ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:366:4: ( '[' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:366:6: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:367:4: ( ']' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:367:6: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:8: ( ONE | FIVE | TEN | FIFTY | ONEHUNDRED | FIVEHUNDRED | ONETHOUSAND | UNITS | TENS | HUNDREDS | NUMBER | CHARACTER | POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ACT | SCENE | ENTER | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTVALUE | INPUTASCII | CL | CM | DOT | AP | EP | QM | FS | ID | WS | LB | RB )
		int alt25=39;
		alt25 = dfa25.predict(input);
		switch (alt25) {
			case 1 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:10: ONE
				{
				mONE(); 

				}
				break;
			case 2 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:14: FIVE
				{
				mFIVE(); 

				}
				break;
			case 3 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:19: TEN
				{
				mTEN(); 

				}
				break;
			case 4 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:23: FIFTY
				{
				mFIFTY(); 

				}
				break;
			case 5 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:29: ONEHUNDRED
				{
				mONEHUNDRED(); 

				}
				break;
			case 6 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:40: FIVEHUNDRED
				{
				mFIVEHUNDRED(); 

				}
				break;
			case 7 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:52: ONETHOUSAND
				{
				mONETHOUSAND(); 

				}
				break;
			case 8 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:64: UNITS
				{
				mUNITS(); 

				}
				break;
			case 9 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:70: TENS
				{
				mTENS(); 

				}
				break;
			case 10 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:75: HUNDREDS
				{
				mHUNDREDS(); 

				}
				break;
			case 11 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:84: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 12 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:91: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 13 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:101: POSITIVENOUN
				{
				mPOSITIVENOUN(); 

				}
				break;
			case 14 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:114: NEUTRALNOUN
				{
				mNEUTRALNOUN(); 

				}
				break;
			case 15 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:126: NEGATIVENOUN
				{
				mNEGATIVENOUN(); 

				}
				break;
			case 16 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:139: POSITIVEADJECTIVE
				{
				mPOSITIVEADJECTIVE(); 

				}
				break;
			case 17 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:157: NEUTRALADJECTIVE
				{
				mNEUTRALADJECTIVE(); 

				}
				break;
			case 18 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:174: NEGATIVEADJECTIVE
				{
				mNEGATIVEADJECTIVE(); 

				}
				break;
			case 19 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:192: ACT
				{
				mACT(); 

				}
				break;
			case 20 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:196: SCENE
				{
				mSCENE(); 

				}
				break;
			case 21 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:202: ENTER
				{
				mENTER(); 

				}
				break;
			case 22 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:208: EXIT
				{
				mEXIT(); 

				}
				break;
			case 23 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:213: EXEUNT
				{
				mEXEUNT(); 

				}
				break;
			case 24 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:220: GOTO
				{
				mGOTO(); 

				}
				break;
			case 25 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:225: OUTPUTVALUE
				{
				mOUTPUTVALUE(); 

				}
				break;
			case 26 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:237: OUTPUTASCII
				{
				mOUTPUTASCII(); 

				}
				break;
			case 27 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:249: INPUTVALUE
				{
				mINPUTVALUE(); 

				}
				break;
			case 28 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:260: INPUTASCII
				{
				mINPUTASCII(); 

				}
				break;
			case 29 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:271: CL
				{
				mCL(); 

				}
				break;
			case 30 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:274: CM
				{
				mCM(); 

				}
				break;
			case 31 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:277: DOT
				{
				mDOT(); 

				}
				break;
			case 32 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:281: AP
				{
				mAP(); 

				}
				break;
			case 33 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:284: EP
				{
				mEP(); 

				}
				break;
			case 34 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:287: QM
				{
				mQM(); 

				}
				break;
			case 35 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:290: FS
				{
				mFS(); 

				}
				break;
			case 36 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:293: ID
				{
				mID(); 

				}
				break;
			case 37 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:296: WS
				{
				mWS(); 

				}
				break;
			case 38 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:299: LB
				{
				mLB(); 

				}
				break;
			case 39 :
				// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:302: RB
				{
				mRB(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA25 dfa25 = new DFA25(this);
	static final String DFA4_eotS =
		"\1\uffff\1\3\3\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\111\3\uffff";
	static final String DFA4_maxS =
		"\1\126\1\130\3\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\3\1\1\1\2";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\1\14\uffff\1\2",
			"\1\1\14\uffff\1\4\1\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "84:1: UNITS : ( ( ONE )+ | ( ONE )+ ( FIVE | TEN ) | FIVE ( ONE )* );";
		}
	}

	static final String DFA18_eotS =
		"\100\uffff";
	static final String DFA18_eofS =
		"\100\uffff";
	static final String DFA18_minS =
		"\1\141\1\156\1\uffff\3\141\1\162\2\141\1\151\1\145\1\uffff\1\157\1\151"+
		"\1\150\6\uffff\1\165\2\uffff\1\143\1\uffff\1\141\1\151\1\uffff\1\155\1"+
		"\uffff\1\157\3\uffff\1\141\14\uffff\1\156\11\uffff\2\144\4\uffff";
	static final String DFA18_maxS =
		"\1\167\1\165\1\uffff\2\157\1\145\1\162\1\157\1\141\2\157\1\uffff\1\157"+
		"\1\164\1\162\6\uffff\1\167\2\uffff\1\164\1\uffff\1\141\1\155\1\uffff\1"+
		"\156\1\uffff\1\164\3\uffff\1\155\14\uffff\1\156\11\uffff\1\144\1\163\4"+
		"\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\3\10\uffff\1\35\3\uffff\1\50\1\51\1\1\1\2\1\4\1\5\1\uffff\1"+
		"\10\1\11\1\uffff\1\14\2\uffff\1\23\1\uffff\1\26\1\uffff\1\32\1\33\1\34"+
		"\1\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\6\1\7\1\12\1\13\1\uffff"+
		"\1\21\1\22\1\24\1\25\1\27\1\30\1\31\1\36\1\37\2\uffff\1\15\1\16\1\17\1"+
		"\20";
	static final String DFA18_specialS =
		"\100\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\3\uffff\1\10\1\11\1\12\1\uffff\1"+
			"\13\1\uffff\1\14\1\15\1\16\1\17\1\uffff\1\20",
			"\1\21\6\uffff\1\22",
			"",
			"\1\23\6\uffff\1\24\6\uffff\1\25",
			"\1\26\15\uffff\1\27",
			"\1\30\3\uffff\1\31",
			"\1\32",
			"\1\33\15\uffff\1\34",
			"\1\35",
			"\1\36\5\uffff\1\37",
			"\1\40\3\uffff\1\41\5\uffff\1\42",
			"",
			"\1\43",
			"\1\44\1\uffff\1\45\3\uffff\1\46\1\uffff\1\47\2\uffff\1\50",
			"\1\51\6\uffff\1\52\2\uffff\1\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54\1\uffff\1\55",
			"",
			"",
			"\1\56\20\uffff\1\57",
			"",
			"\1\60",
			"\1\61\3\uffff\1\62",
			"",
			"\1\63\1\64",
			"",
			"\1\65\2\uffff\1\66\1\uffff\1\67",
			"",
			"",
			"",
			"\1\70\13\uffff\1\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\72",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\74\1\uffff\1\75\6\uffff\1\76\5\uffff\1\77",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "143:1: NEUTRALNOUN : ( 'animal' | 'aunt' | 'brother' | 'cat' | 'chihuahua' | 'cousin' | 'cow' | 'daughter' | 'door' | 'face' | 'father' | 'fellow' | 'granddaughter' | 'grandfather' | 'grandmother' | 'grandson' | 'hair' | 'hamster' | 'horse' | 'lamp' | 'lantern' | 'mistletoe' | 'moon' | 'morning' | 'mother' | 'nephew' | 'niece' | 'nose' | 'purse' | 'road' | 'roman' | 'sister' | 'sky' | 'son' | 'squirrel' | 'stonewall' | 'thing' | 'town' | 'tree' | 'uncle' | 'wind' );";
		}
	}

	static final String DFA25_eotS =
		"\1\uffff\1\67\1\72\1\74\1\104\1\110\1\116\1\123\44\63\14\uffff\2\u00b9"+
		"\1\uffff\1\u00b9\1\uffff\2\u00ba\2\u00bb\3\63\1\uffff\2\u00ba\1\63\1\uffff"+
		"\2\u00c3\3\63\1\uffff\1\u00c3\3\63\1\uffff\145\63\3\uffff\2\u00bb\5\63"+
		"\1\uffff\41\63\1\u0191\20\63\1\u01a3\3\63\1\u01a7\4\63\1\u01a3\6\63\2"+
		"\u01b4\17\63\1\u01c6\6\63\1\u0191\10\63\1\u01c6\1\u01b4\3\63\1\u01b4\32"+
		"\63\1\u01a3\25\63\1\u01a3\5\63\1\u01c6\4\63\1\u0217\5\63\1\u01a7\10\63"+
		"\1\u0225\2\63\1\u01a3\15\63\1\u01a7\2\63\1\u01b4\3\63\1\u01b4\1\63\1\uffff"+
		"\1\63\1\u023c\1\63\1\u023c\1\63\1\u0191\1\63\1\u01b4\1\63\1\u01a3\1\63"+
		"\1\u01c6\1\63\1\u01a7\3\63\1\uffff\2\63\1\u01c6\1\uffff\1\u01a7\1\63\1"+
		"\u01a7\11\63\1\uffff\14\63\1\u01a7\1\u01b4\3\63\1\uffff\1\u023c\12\63"+
		"\1\u01c6\1\u023c\10\63\1\u023c\3\63\1\u01b4\12\63\1\u01a3\1\63\1\u023c"+
		"\1\u0283\1\63\1\u01b4\13\63\1\u01b4\4\63\1\u01b4\3\63\1\u01b4\1\u01a3"+
		"\1\u01b4\1\63\1\u01c6\1\63\1\u01b4\1\u023c\1\u01a3\3\63\1\u0191\3\63\1"+
		"\u0191\1\63\1\uffff\1\63\1\u02a1\11\63\1\u0225\1\63\1\uffff\2\63\1\u0225"+
		"\2\63\1\uffff\7\63\1\u02b8\1\63\1\u01a7\6\63\1\uffff\1\63\1\u01c6\1\63"+
		"\1\u023c\1\u0191\3\63\1\u01b4\1\63\1\u01a3\2\63\1\u01b4\4\63\1\u023c\1"+
		"\63\1\u023c\1\63\1\u0191\7\63\1\u01c6\1\63\1\u023c\1\63\1\u01b4\2\63\1"+
		"\u01c6\2\63\1\u023c\5\63\1\u01c6\7\63\1\u01a3\4\63\2\u01a3\2\63\1\u0191"+
		"\2\63\1\u0191\1\63\1\u01c6\1\63\1\uffff\2\63\1\u01c6\1\u01a3\3\63\1\u0191"+
		"\7\63\1\u01b4\1\u023c\1\63\1\u01b4\1\63\1\u01b4\1\63\1\u01c6\5\63\1\u030a"+
		"\1\uffff\2\63\1\u0225\6\63\2\u0225\1\u01a7\2\63\1\uffff\1\u0225\1\63\1"+
		"\u0225\4\63\2\uffff\1\u01b4\1\63\1\u01a7\1\u01b4\1\u01a3\1\u01b4\5\63"+
		"\1\u0191\1\u023c\1\u01a3\1\u01c6\1\63\2\u023c\1\63\1\u01b4\5\63\1\u0191"+
		"\1\u023c\1\u0191\1\63\2\u0191\4\63\1\u01a3\3\63\1\u01c6\3\63\1\u01b4\1"+
		"\u01a3\1\63\1\u0191\3\63\1\u0191\10\63\2\u023c\1\63\1\u01c6\2\u023c\3"+
		"\63\1\u023c\1\63\2\u01b4\1\u01c6\3\63\1\u0191\1\u01c6\2\63\1\uffff\1\u034a"+
		"\1\63\1\uffff\1\u0225\2\63\1\u0225\2\63\1\u0225\1\uffff\1\u0225\1\63\1"+
		"\u0225\1\63\1\u0225\1\u023c\2\63\1\u01b4\1\63\1\u023c\6\63\1\u0191\1\63"+
		"\1\u023c\1\u01a7\1\u01b4\1\u01a3\1\63\1\u01a3\6\63\1\u023c\3\63\1\u01a3"+
		"\6\63\1\u01b4\2\63\1\u0191\1\u01b4\1\63\1\u0191\3\63\1\uffff\2\63\1\u0225"+
		"\1\63\1\u0225\1\uffff\1\63\1\u0225\2\63\1\u023c\1\u0191\1\u023c\1\u01b4"+
		"\2\63\1\u0191\1\u023c\4\63\1\u023c\1\u0191\1\u01a3\1\u023c\1\u01b4\6\63"+
		"\1\u01b4\4\63\1\u0191\2\63\1\u0225\1\u01a3\1\uffff\1\u0225\1\63\1\u01a7"+
		"\1\u01b4\1\63\1\u023c\2\63\1\u01b4\1\u023c\5\63\1\u01b4\1\u0191\4\63\1"+
		"\uffff\1\u0191\1\u01a3\1\u023c\1\u01c6\1\u0191\6\63\1\u0191\1\u0225\2"+
		"\uffff\1\u0191\1\63\2\u01b4\2\u023c\1\63\1\u01b4";
	static final String DFA25_eofS =
		"\u03a4\uffff";
	static final String DFA25_minS =
		"\1\11\7\60\1\157\2\141\1\145\1\160\1\145\1\141\1\165\1\157\1\143\1\151"+
		"\1\155\2\141\1\157\1\145\1\151\1\145\1\151\3\141\1\145\1\141\1\151\1\145"+
		"\1\150\1\156\1\141\1\155\1\154\1\145\1\156\1\151\1\143\1\156\14\uffff"+
		"\2\60\1\uffff\1\60\1\uffff\4\60\1\144\1\162\1\163\1\uffff\2\60\1\141\1"+
		"\uffff\2\60\2\111\1\163\1\uffff\1\60\1\162\2\143\1\uffff\1\155\1\154\1"+
		"\147\1\155\1\141\1\157\1\162\1\145\1\141\1\142\1\156\2\154\1\157\1\171"+
		"\2\145\1\156\1\147\1\156\1\141\1\151\1\143\1\154\1\156\1\162\1\165\1\151"+
		"\1\141\2\147\1\171\1\141\1\156\1\162\1\147\1\141\1\145\1\155\1\163\1\171"+
		"\1\156\1\165\2\141\1\145\1\157\1\141\1\144\1\143\1\162\1\156\1\141\1\144"+
		"\2\141\1\154\1\147\1\164\1\141\1\144\1\156\1\145\1\155\1\157\2\141\1\162"+
		"\1\163\2\141\1\156\1\155\2\145\1\166\1\151\1\147\1\157\1\160\1\145\1\142"+
		"\1\151\1\141\1\145\1\156\1\143\1\156\1\162\1\154\1\151\1\142\1\151\1\144"+
		"\1\172\1\154\1\146\1\154\2\164\1\145\3\uffff\2\60\1\171\1\162\1\144\1"+
		"\164\1\165\1\uffff\2\111\1\144\1\143\1\144\1\162\1\145\1\151\1\157\1\154"+
		"\1\166\1\154\1\163\1\164\1\145\1\156\1\172\1\141\1\161\1\147\1\157\1\163"+
		"\1\154\1\156\1\141\1\147\1\145\1\155\1\164\1\172\1\167\1\162\1\145\1\60"+
		"\1\151\1\162\1\154\1\145\1\162\1\154\1\160\1\162\1\163\1\145\2\144\1\146"+
		"\1\157\1\154\1\162\1\60\1\156\2\145\1\60\1\155\1\147\1\171\1\160\1\60"+
		"\1\143\1\164\2\155\1\156\1\164\2\60\1\162\1\151\1\156\1\162\1\156\1\146"+
		"\1\157\2\154\1\145\1\164\1\145\1\144\1\141\1\164\1\60\1\150\1\141\1\147"+
		"\1\164\1\166\1\164\1\60\1\147\1\165\2\163\1\143\1\145\1\144\1\164\2\60"+
		"\1\150\1\162\1\163\1\60\1\160\1\163\1\156\1\145\1\141\1\147\1\156\1\162"+
		"\1\164\2\151\1\165\1\164\1\147\1\164\1\156\1\145\1\164\2\144\1\157\1\164"+
		"\1\160\1\164\1\147\1\143\1\60\1\164\1\145\1\156\1\145\1\150\2\156\2\150"+
		"\1\143\1\145\1\154\1\155\2\156\1\144\1\145\1\163\1\171\1\154\1\144\1\60"+
		"\1\146\1\162\1\164\1\162\1\154\1\60\1\151\1\154\2\145\1\60\1\145\1\164"+
		"\1\165\1\115\1\164\1\60\1\145\1\144\1\145\2\165\2\157\1\145\1\60\2\145"+
		"\1\60\1\164\1\162\1\154\1\40\1\151\1\154\1\165\1\145\1\156\1\160\1\157"+
		"\1\145\1\153\1\60\1\154\1\141\1\60\1\151\1\145\1\164\1\60\1\145\1\uffff"+
		"\1\156\1\60\1\157\1\60\1\171\1\60\1\151\1\60\1\164\1\60\1\163\1\60\1\55"+
		"\1\60\1\164\1\145\1\151\1\uffff\1\144\1\163\1\60\1\uffff\1\60\1\165\1"+
		"\60\1\145\1\154\1\145\1\164\1\160\1\144\1\145\1\171\1\145\1\uffff\1\171"+
		"\1\162\1\145\1\166\1\153\1\146\1\151\1\164\2\154\2\164\2\60\1\156\2\145"+
		"\1\uffff\1\60\1\154\1\144\1\150\1\145\2\141\2\164\1\163\1\153\2\60\1\157"+
		"\1\165\1\155\1\151\1\162\1\151\1\145\1\151\1\60\1\162\1\150\1\145\1\60"+
		"\1\150\1\154\1\143\1\147\1\171\1\165\1\141\1\171\1\144\1\156\1\60\1\145"+
		"\2\60\1\154\1\60\2\145\1\150\2\154\1\156\1\147\1\154\1\162\1\163\1\164"+
		"\1\60\1\151\3\145\1\60\1\145\1\141\1\147\3\60\1\164\1\60\1\145\3\60\1"+
		"\151\1\145\1\157\1\60\1\156\1\157\1\143\1\60\1\141\1\uffff\1\162\1\60"+
		"\1\156\1\141\1\145\1\156\1\151\1\155\1\172\1\146\1\163\1\60\1\164\1\uffff"+
		"\1\164\1\156\1\60\1\165\1\151\1\171\1\157\1\144\1\157\1\156\1\151\1\145"+
		"\1\143\1\60\1\40\1\60\1\154\1\156\1\162\1\55\1\162\1\145\1\uffff\1\167"+
		"\1\60\1\156\2\60\1\145\1\157\1\150\1\60\1\142\1\60\1\164\1\145\1\60\1"+
		"\145\1\146\1\171\1\164\1\60\1\162\1\60\1\162\1\60\1\162\1\167\1\141\1"+
		"\151\1\145\1\144\1\150\1\60\1\171\1\60\1\171\1\60\1\156\1\163\1\60\1\157"+
		"\1\145\1\60\2\162\1\151\1\145\1\157\1\60\1\164\1\155\1\141\1\151\1\156"+
		"\1\144\1\145\1\60\1\156\1\145\1\164\1\144\2\60\1\151\1\150\1\60\2\163"+
		"\1\60\1\144\1\60\1\156\1\uffff\1\145\1\162\2\60\1\145\1\171\1\147\1\60"+
		"\1\145\1\141\1\145\1\171\1\156\1\162\1\167\2\60\1\154\1\60\1\167\1\60"+
		"\1\145\1\60\1\151\1\147\1\167\1\164\1\151\1\60\1\uffff\1\164\1\143\1\60"+
		"\1\40\2\157\1\151\1\146\1\157\3\60\1\144\1\141\1\157\1\60\1\157\1\60\1"+
		"\143\1\157\1\162\1\153\2\uffff\1\60\1\147\4\60\1\145\1\162\1\155\1\171"+
		"\1\154\4\60\1\165\2\60\1\u00e2\1\60\1\145\1\141\1\164\1\156\1\144\3\60"+
		"\1\163\2\60\1\164\1\155\1\162\1\144\1\60\1\146\1\162\1\155\1\60\1\154"+
		"\1\150\1\156\2\60\1\143\1\60\1\147\1\163\1\145\1\60\1\157\3\164\2\141"+
		"\2\157\2\60\1\156\3\60\1\164\1\142\1\144\1\60\1\147\3\60\1\157\2\144\2"+
		"\60\1\145\1\156\1\uffff\1\60\1\142\1\uffff\1\60\1\156\1\157\1\60\1\146"+
		"\1\145\1\60\1\165\1\60\1\151\1\60\1\157\2\60\1\145\1\163\1\60\1\145\1"+
		"\60\1\145\3\154\1\151\1\147\1\60\1\164\4\60\1\165\1\60\1\151\1\145\1\165"+
		"\1\147\1\171\1\145\1\60\1\164\1\162\1\165\1\60\1\151\1\145\1\165\2\164"+
		"\1\156\1\60\1\157\1\154\2\60\1\162\1\60\1\145\1\144\1\157\1\uffff\1\145"+
		"\1\141\1\60\1\164\1\60\1\162\1\157\1\60\2\163\4\60\1\154\1\157\2\60\1"+
		"\154\1\156\1\163\1\141\5\60\1\163\1\156\1\146\1\147\2\150\1\60\2\145\1"+
		"\164\1\162\1\60\1\165\1\164\2\60\1\40\1\60\1\163\2\60\1\156\1\60\1\147"+
		"\1\163\2\60\1\147\1\165\1\150\2\145\2\60\1\150\1\145\1\163\2\150\5\60"+
		"\1\154\1\164\2\162\1\171\1\144\2\60\2\uffff\1\60\1\145\4\60\1\162\1\60";
	static final String DFA25_maxS =
		"\10\172\1\157\1\165\1\145\1\150\1\162\1\145\1\141\1\165\1\162\1\160\1"+
		"\151\3\165\1\157\1\165\1\167\1\165\1\151\1\162\2\165\1\162\1\171\2\157"+
		"\1\162\1\156\1\157\1\166\1\157\1\145\1\156\1\151\1\143\1\170\14\uffff"+
		"\2\172\1\uffff\1\172\1\uffff\4\172\1\145\1\162\1\163\1\uffff\2\172\1\141"+
		"\1\uffff\2\172\2\130\1\163\1\uffff\1\172\1\162\2\143\1\uffff\1\155\1\154"+
		"\1\147\1\155\1\154\1\157\1\162\1\150\1\141\1\142\1\156\2\154\1\157\1\171"+
		"\2\145\1\156\1\151\1\156\1\141\1\157\1\164\1\154\1\156\1\162\1\165\1\164"+
		"\1\162\1\165\1\147\1\171\1\165\1\156\1\162\1\147\1\141\1\157\1\156\1\163"+
		"\1\171\1\162\2\165\1\157\1\145\1\157\1\164\1\144\1\143\1\162\1\156\1\157"+
		"\1\163\1\147\1\165\1\164\1\147\1\164\1\151\1\167\1\164\1\145\1\165\1\157"+
		"\1\166\1\141\2\163\1\145\1\164\1\156\1\162\1\145\1\164\1\166\1\151\1\163"+
		"\1\164\1\160\1\145\1\163\1\151\1\167\1\165\1\156\1\143\1\156\2\162\1\151"+
		"\1\142\1\151\1\144\1\172\1\154\1\146\1\154\2\164\1\151\3\uffff\2\172\1"+
		"\171\1\162\1\144\1\164\1\165\1\uffff\1\126\1\130\1\144\1\143\1\144\1\162"+
		"\1\145\1\151\1\157\1\154\1\166\1\154\1\163\1\164\1\145\1\156\1\172\1\141"+
		"\1\161\1\147\1\157\1\163\1\154\1\156\1\141\1\147\1\145\1\155\1\164\1\172"+
		"\1\167\1\162\1\145\1\172\1\151\1\162\1\154\1\145\1\162\1\154\1\160\1\162"+
		"\1\163\1\145\2\144\1\146\1\157\1\154\1\163\1\172\1\156\2\145\1\172\1\155"+
		"\1\147\1\171\1\163\1\172\1\143\1\164\1\165\1\155\1\156\1\164\2\172\1\162"+
		"\1\151\1\156\1\162\1\156\1\160\1\157\2\154\1\145\1\164\1\145\1\144\1\141"+
		"\1\164\1\172\1\150\1\141\1\147\1\164\1\166\1\164\1\172\1\147\1\165\2\163"+
		"\1\143\1\145\1\144\1\164\2\172\1\150\1\162\1\163\1\172\1\160\1\163\1\156"+
		"\1\145\1\141\1\147\1\156\1\162\1\164\2\151\1\165\3\164\1\156\1\145\1\164"+
		"\2\144\1\157\1\164\1\160\1\164\1\147\1\143\1\172\1\164\1\151\1\156\1\165"+
		"\1\150\2\156\2\150\1\143\1\145\1\154\1\155\2\156\1\144\1\145\1\163\1\171"+
		"\1\154\1\144\1\172\1\146\1\162\1\164\1\162\1\154\1\172\1\151\1\154\1\145"+
		"\1\154\1\172\1\145\1\164\1\165\1\115\1\164\1\172\1\145\1\144\1\145\2\165"+
		"\2\157\1\145\1\172\2\145\1\172\1\164\1\162\1\154\1\40\1\151\1\154\1\165"+
		"\1\145\1\156\1\160\1\157\1\145\1\153\1\172\1\154\1\141\1\172\1\151\1\145"+
		"\1\164\1\172\1\145\1\uffff\1\156\1\172\1\157\1\172\1\171\1\172\1\171\1"+
		"\172\1\164\1\172\1\163\1\172\1\55\1\172\1\164\1\145\1\151\1\uffff\1\144"+
		"\1\163\1\172\1\uffff\1\172\1\165\1\172\1\145\1\154\1\145\1\164\1\160\1"+
		"\144\1\145\1\171\1\145\1\uffff\1\171\1\162\1\145\1\166\1\153\1\146\1\151"+
		"\1\164\2\154\2\164\2\172\1\156\2\145\1\uffff\1\172\1\154\1\144\1\150\1"+
		"\145\2\141\2\164\1\163\1\153\2\172\1\157\1\165\1\155\1\151\1\162\1\151"+
		"\1\145\1\151\1\172\1\162\1\150\1\145\1\172\1\150\1\154\1\143\1\147\1\171"+
		"\1\165\1\141\1\171\1\144\1\156\1\172\1\145\2\172\1\154\1\172\2\145\1\150"+
		"\2\154\1\156\1\147\1\154\1\162\1\163\1\164\1\172\1\151\3\145\1\172\1\145"+
		"\1\141\1\147\3\172\1\164\1\172\1\145\3\172\1\151\1\145\1\157\1\172\1\156"+
		"\1\157\1\143\1\172\1\141\1\uffff\1\162\1\172\1\156\1\141\1\145\1\156\1"+
		"\151\1\155\1\172\1\146\1\163\1\172\1\164\1\uffff\1\164\1\156\1\172\1\165"+
		"\1\151\1\171\1\157\1\144\1\157\1\156\1\151\1\145\1\143\1\172\1\40\1\172"+
		"\1\154\1\156\1\162\1\55\1\162\1\145\1\uffff\1\167\1\172\1\156\2\172\1"+
		"\145\1\157\1\150\1\172\1\144\1\172\1\164\1\145\1\172\1\145\1\146\1\171"+
		"\1\164\1\172\1\162\1\172\1\162\1\172\1\162\1\167\1\141\1\151\1\145\1\144"+
		"\1\150\1\172\1\171\1\172\1\171\1\172\1\156\1\163\1\172\1\157\1\145\1\172"+
		"\2\162\1\151\1\145\1\157\1\172\1\164\1\155\1\141\1\151\1\156\1\144\1\145"+
		"\1\172\1\156\1\145\1\164\1\144\2\172\1\151\1\150\1\172\2\163\1\172\1\163"+
		"\1\172\1\156\1\uffff\1\145\1\162\2\172\1\145\1\171\1\147\1\172\1\145\1"+
		"\141\1\145\1\171\1\156\1\162\1\167\2\172\1\154\1\172\1\167\1\172\1\145"+
		"\1\172\1\151\1\147\1\167\1\164\1\151\1\172\1\uffff\1\164\1\143\1\172\1"+
		"\40\2\157\1\151\1\146\1\157\3\172\1\144\1\141\1\157\1\172\1\157\1\172"+
		"\1\143\1\157\1\162\1\153\2\uffff\1\172\1\147\4\172\1\145\1\162\1\155\1"+
		"\171\1\154\4\172\1\165\2\172\1\u00e2\1\172\1\145\1\141\1\164\1\156\1\144"+
		"\3\172\1\163\2\172\1\164\1\155\1\162\1\144\1\172\1\146\1\162\1\155\1\172"+
		"\1\154\1\150\1\156\2\172\1\143\1\172\1\147\1\163\1\145\1\172\1\157\3\164"+
		"\2\141\2\157\2\172\1\156\3\172\1\164\1\142\1\144\1\172\1\147\3\172\1\157"+
		"\2\144\2\172\1\145\1\156\1\uffff\1\172\1\142\1\uffff\1\172\1\156\1\157"+
		"\1\172\1\146\1\145\1\172\1\165\1\172\1\151\1\172\1\157\2\172\1\145\1\163"+
		"\1\172\1\145\1\172\1\145\3\154\1\151\1\147\1\172\1\164\4\172\1\165\1\172"+
		"\1\151\1\145\1\165\1\147\1\171\1\145\1\172\1\164\1\162\1\165\1\172\1\151"+
		"\1\145\1\165\2\164\1\156\1\172\1\157\1\154\2\172\1\162\1\172\1\145\1\144"+
		"\1\157\1\uffff\1\145\1\141\1\172\1\164\1\172\1\162\1\157\1\172\2\163\4"+
		"\172\1\154\1\157\2\172\1\154\1\156\1\163\1\141\5\172\1\163\1\156\1\146"+
		"\1\147\2\150\1\172\2\145\1\164\1\162\1\172\1\165\1\164\2\172\1\40\1\172"+
		"\1\163\2\172\1\156\1\172\1\147\1\163\2\172\1\147\1\165\1\150\2\145\2\172"+
		"\1\150\1\145\1\163\1\150\1\155\5\172\1\154\1\164\2\162\1\171\1\144\2\172"+
		"\2\uffff\1\172\1\145\4\172\1\162\1\172";
	static final String DFA25_acceptS =
		"\54\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\1\2"+
		"\uffff\1\2\1\uffff\1\3\7\uffff\1\4\3\uffff\1\5\5\uffff\1\6\4\uffff\1\7"+
		"\145\uffff\1\10\1\11\1\13\7\uffff\1\12\u00cd\uffff\1\22\21\uffff\1\17"+
		"\3\uffff\1\15\14\uffff\1\16\21\uffff\1\21\120\uffff\1\23\15\uffff\1\14"+
		"\26\uffff\1\20\106\uffff\1\30\35\uffff\1\26\26\uffff\1\24\1\32\120\uffff"+
		"\1\25\2\uffff\1\34\74\uffff\1\27\117\uffff\1\31\1\33\10\uffff";
	static final String DFA25_specialS =
		"\u03a4\uffff}>";
	static final String[] DFA25_transitionS = {
			"\2\64\2\uffff\1\64\22\uffff\1\64\1\60\5\uffff\1\57\4\uffff\1\55\1\uffff"+
			"\1\56\1\62\12\uffff\1\54\4\uffff\1\61\1\uffff\1\52\1\16\1\5\1\6\1\53"+
			"\1\17\1\13\1\12\1\1\1\11\1\22\1\4\1\7\1\63\1\14\1\20\1\63\1\10\1\21\1"+
			"\15\1\63\1\2\1\63\1\3\2\63\1\65\1\uffff\1\66\1\uffff\1\63\1\uffff\1\23"+
			"\1\33\1\34\1\35\1\45\1\24\1\36\1\25\1\50\1\26\1\32\1\37\1\40\1\41\1\46"+
			"\1\27\1\63\1\31\1\30\1\42\1\43\1\51\1\44\1\63\1\47\1\63",
			"\12\63\7\uffff\10\63\1\70\14\63\1\71\1\63\1\71\2\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\12\63\7\uffff\10\63\1\73\21\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\10\63\1\77\2\63\1\75\11\63\1\100\1\63\1\76\2\63\4\uffff"+
			"\1\63\1\uffff\32\63",
			"\12\63\7\uffff\10\63\1\77\2\63\1\106\11\63\1\100\1\63\1\105\2\63\4\uffff"+
			"\1\63\1\uffff\1\101\7\63\1\103\5\63\1\102\13\63",
			"\12\63\7\uffff\2\63\1\112\1\111\4\63\1\77\2\63\1\114\1\111\10\63\1\100"+
			"\1\63\1\113\2\63\4\uffff\1\63\1\uffff\13\63\1\107\16\63",
			"\12\63\7\uffff\2\63\1\117\5\63\1\77\2\63\1\114\11\63\1\100\1\63\1\113"+
			"\2\63\4\uffff\1\63\1\uffff\4\63\1\115\25\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\121\3\63\1\120\3\63\1\122"+
			"\21\63",
			"\1\124",
			"\1\126\23\uffff\1\125",
			"\1\127\3\uffff\1\130",
			"\1\132\2\uffff\1\131",
			"\1\133\1\uffff\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140\2\uffff\1\141",
			"\1\143\4\uffff\1\142\7\uffff\1\144",
			"\1\145",
			"\1\150\1\146\6\uffff\1\147",
			"\1\152\3\uffff\1\153\3\uffff\1\154\2\uffff\1\151\2\uffff\1\156\5\uffff"+
			"\1\155",
			"\1\157\3\uffff\1\160\11\uffff\1\161\5\uffff\1\162",
			"\1\163",
			"\1\170\3\uffff\1\167\2\uffff\1\164\2\uffff\1\165\2\uffff\1\171\2\uffff"+
			"\1\166",
			"\1\173\1\uffff\1\174\1\uffff\1\u0080\1\u0082\1\175\1\uffff\1\176\2\uffff"+
			"\1\177\1\172\1\uffff\1\u0081",
			"\1\u0084\3\uffff\1\u0085\5\uffff\1\u0083\5\uffff\1\u0086",
			"\1\u0087",
			"\1\u0089\3\uffff\1\u008a\3\uffff\1\u008d\2\uffff\1\u008b\2\uffff\1\u008c"+
			"\2\uffff\1\u0088",
			"\1\u008e\6\uffff\1\u008f\3\uffff\1\u0092\2\uffff\1\u0090\5\uffff\1\u0091",
			"\1\u0093\3\uffff\1\u0095\3\uffff\1\u0097\5\uffff\1\u0094\2\uffff\1\u0096"+
			"\2\uffff\1\u0098",
			"\1\u009b\11\uffff\1\u009a\2\uffff\1\u0099",
			"\1\u009c\3\uffff\1\u009d\3\uffff\1\u009e\5\uffff\1\u009f\11\uffff\1"+
			"\u00a0",
			"\1\u00a1\5\uffff\1\u00a2",
			"\1\u00a3\3\uffff\1\u00a4\5\uffff\1\u00a5",
			"\1\u00a6\1\u00a9\5\uffff\1\u00a7\2\uffff\1\u00a8",
			"\1\u00aa",
			"\1\u00ac\6\uffff\1\u00ae\1\u00ab\5\uffff\1\u00ad",
			"\1\u00af\10\uffff\1\u00b0",
			"\1\u00b1\2\uffff\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7\11\uffff\1\u00b8",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\63\7\uffff\10\63\1\70\14\63\1\71\1\63\1\71\2\63\4\uffff\1\63\1\uffff"+
			"\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\10\63\1\73\21\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\10\63\1\77\2\63\1\75\11\63\1\100\4\63\4\uffff\1\63\1"+
			"\uffff\32\63",
			"\12\63\7\uffff\10\63\1\77\2\63\1\75\11\63\1\100\1\63\1\76\2\63\4\uffff"+
			"\1\63\1\uffff\32\63",
			"\12\63\7\uffff\10\63\1\77\14\63\1\u00bc\1\63\1\u00bc\2\63\4\uffff\1"+
			"\63\1\uffff\32\63",
			"\12\63\7\uffff\10\63\1\u00bd\21\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00be\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"",
			"\12\63\7\uffff\10\63\1\77\14\63\1\100\1\63\1\105\2\63\4\uffff\1\63\1"+
			"\uffff\32\63",
			"\12\63\7\uffff\10\63\1\77\2\63\1\106\11\63\1\100\1\63\1\105\2\63\4\uffff"+
			"\1\63\1\uffff\32\63",
			"\1\u00c2",
			"",
			"\12\63\7\uffff\3\63\1\111\4\63\1\77\2\63\1\114\1\111\10\63\1\100\1\63"+
			"\1\113\2\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\2\63\1\112\1\111\4\63\1\77\2\63\1\114\1\111\10\63\1\100"+
			"\1\63\1\113\2\63\4\uffff\1\63\1\uffff\32\63",
			"\1\77\2\uffff\1\u00c4\11\uffff\1\100\1\uffff\1\113",
			"\1\77\2\uffff\1\114\11\uffff\1\100\1\uffff\1\u00c5",
			"\1\u00c6",
			"",
			"\12\63\7\uffff\2\63\1\117\5\63\1\77\2\63\1\114\11\63\1\100\1\63\1\113"+
			"\2\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce\12\uffff\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d3\2\uffff\1\u00d2",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de\1\uffff\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e3\5\uffff\1\u00e2",
			"\1\u00e4\5\uffff\1\u00e7\3\uffff\1\u00e6\6\uffff\1\u00e5",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ed\2\uffff\1\u00f2\1\u00ee\1\u00f0\1\uffff\1\u00ec\1\uffff\1\u00f1"+
			"\1\uffff\1\u00ef",
			"\1\u00f4\20\uffff\1\u00f3",
			"\1\u00f6\6\uffff\1\u00f8\3\uffff\1\u00f5\2\uffff\1\u00f7",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fc\23\uffff\1\u00fb",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101\11\uffff\1\u0102",
			"\1\u0103\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107\3\uffff\1\u0108",
			"\1\u0109",
			"\1\u010b\7\uffff\1\u010c\5\uffff\1\u010a\5\uffff\1\u010d",
			"\1\u010f\3\uffff\1\u0110\11\uffff\1\u010e",
			"\1\u0111",
			"\1\u0112",
			"\1\u0114\13\uffff\1\u0115\5\uffff\1\u0113\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011c\15\uffff\1\u011b",
			"\1\u011e\16\uffff\1\u011d",
			"\1\u0120\5\uffff\1\u011f",
			"\1\u0123\7\uffff\1\u0121\5\uffff\1\u0122\5\uffff\1\u0124",
			"\1\u0125\7\uffff\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u012a\7\uffff\1\u0129",
			"\1\u012d\20\uffff\1\u012b\1\uffff\1\u012c",
			"\1\u012f\3\uffff\1\u012e\1\uffff\1\u0130",
			"\1\u0131",
			"\1\u0133\7\uffff\1\u0132",
			"\1\u0134",
			"\1\u0135\12\uffff\1\u0137\11\uffff\1\u0136",
			"\1\u0138",
			"\1\u0139\1\u013a",
			"\1\u013b",
			"\1\u013c\3\uffff\1\u013d",
			"\1\u013e\12\uffff\1\u013f\2\uffff\1\u0140\4\uffff\1\u0141",
			"\1\u0142",
			"\1\u0143\1\u0144\3\uffff\1\u0145",
			"\1\u0146",
			"\1\u0147\16\uffff\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014c\13\uffff\1\u014b",
			"\1\u014d\2\uffff\1\u014e\1\uffff\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0153\17\uffff\1\u0154\1\u0152",
			"\1\u0155",
			"\1\u0157\25\uffff\1\u0156",
			"\1\u0158\17\uffff\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e\5\uffff\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016b\3\uffff\1\u016a",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\10\63\1\u00bd\21\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"",
			"\1\77\2\uffff\1\u00c4\11\uffff\1\100",
			"\1\77\14\uffff\1\100\1\uffff\1\u00c5",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\7\63\1\u0190\22\63",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a2\1\u01a1",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ac\2\uffff\1\u01ab",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af\7\uffff\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba\11\uffff\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u01c5\26\63",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u01d8\31\63",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6\14\uffff\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01f4",
			"\1\u01f5\3\uffff\1\u01f6",
			"\1\u01f7",
			"\1\u01f9\16\uffff\1\u01f8\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\14\63\1\u020c\15\63",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215\6\uffff\1\u0216",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0226",
			"\1\u0227",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0235",
			"\1\u0236",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u023a",
			"",
			"\1\u023b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u023d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u023e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u023f\17\uffff\1\u0240",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\30\63\1\u0241\1\63",
			"\1\u0242",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0243",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0191",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"",
			"\1\u0247",
			"\1\u0248",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0249",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"\1\u026b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u026c\7\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0271",
			"\1\u0272",
			"\1\u0273",
			"\1\u0274",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0282",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0284",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0297",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0298",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u029f",
			"",
			"\1\u02a0",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02ab",
			"",
			"\1\u02ac",
			"\1\u02ad",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02b9",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u01a3",
			"\1\u02bd",
			"\1\u02be",
			"",
			"\1\u02bf",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02c0",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02c4\1\uffff\1\u02c5",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02c6",
			"\1\u02c7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02cc",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02cd",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02d5",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u02d6\25\63",
			"\1\u02d7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02d8",
			"\1\u02d9",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02da",
			"\1\u02db",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"\1\u02e7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\3\63\1\u02e8\26\63",
			"\1\u02e9",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02ed",
			"\1\u02ee",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02ef",
			"\1\u02f0",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02f1\1\uffff\1\u02f2\6\uffff\1\u02f3\5\uffff\1\u02f4",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02f5",
			"",
			"\1\u02f6",
			"\1\u02f7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0302",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0303",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0304",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\1\u0308",
			"\1\u0309",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u030b",
			"\1\u030c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0316",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u031b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u031c\16\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0322",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01a7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0328",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0333\16\63",
			"\1\u0334",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0340",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0344",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0348",
			"\1\u0349",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u034b",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u034c",
			"\1\u034d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u034e",
			"\1\u034f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0350",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0351",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0352",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0353",
			"\1\u0354",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0355",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u035c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u035d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u036d",
			"\1\u036e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u036f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0370",
			"\1\u0371",
			"\1\u0372",
			"",
			"\1\u0373",
			"\1\u0374",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0375",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0376",
			"\1\u0377",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0378",
			"\1\u0379",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u037a",
			"\1\u037b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u038a",
			"\1\u038b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u038c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u038d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u038e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u038f",
			"\1\u0390",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a\4\uffff\1\u039b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u03a2",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u03a3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63"
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ONE | FIVE | TEN | FIFTY | ONEHUNDRED | FIVEHUNDRED | ONETHOUSAND | UNITS | TENS | HUNDREDS | NUMBER | CHARACTER | POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ACT | SCENE | ENTER | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTVALUE | INPUTASCII | CL | CM | DOT | AP | EP | QM | FS | ID | WS | LB | RB );";
		}
	}

}
