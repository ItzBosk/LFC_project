// $ANTLR 3.5.1 D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-11 18:35:47

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "AP", "CHARACTER", "CM", 
		"DIGIT", "DOT", "ENTER", "EP", "EXEUNT", "EXIT", "FS", "GOTO", "ID", "INPUTASCII", 
		"INPUTVALUE", "LB", "LETTER", "NEGATIVEADJECTIVE", "NEGATIVENOUN", "NEUTRALADJECTIVE", 
		"NEUTRALNOUN", "OUTPUTASCII", "OUTPUTVALUE", "POSITIVEADJECTIVE", "POSITIVENOUN", 
		"PP", "QM", "RB", "SCENE", "WS", "'C'", "'D'", "'I'", "'L'", "'M'", "'V'", 
		"'X'"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int ACT=4;
	public static final int AP=5;
	public static final int CHARACTER=6;
	public static final int CM=7;
	public static final int DIGIT=8;
	public static final int DOT=9;
	public static final int ENTER=10;
	public static final int EP=11;
	public static final int EXEUNT=12;
	public static final int EXIT=13;
	public static final int FS=14;
	public static final int GOTO=15;
	public static final int ID=16;
	public static final int INPUTASCII=17;
	public static final int INPUTVALUE=18;
	public static final int LB=19;
	public static final int LETTER=20;
	public static final int NEGATIVEADJECTIVE=21;
	public static final int NEGATIVENOUN=22;
	public static final int NEUTRALADJECTIVE=23;
	public static final int NEUTRALNOUN=24;
	public static final int OUTPUTASCII=25;
	public static final int OUTPUTVALUE=26;
	public static final int POSITIVEADJECTIVE=27;
	public static final int POSITIVENOUN=28;
	public static final int PP=29;
	public static final int QM=30;
	public static final int RB=31;
	public static final int SCENE=32;
	public static final int WS=33;

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
	@Override public String getGrammarFileName() { return "D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }






	// $ANTLR start "parseSPL"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:24:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:2: ( title )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:26:2: title
			{
			System.out.println("* Sto per riconoscere un documento Shakespeare");
			pushFollow(FOLLOW_title_in_parseSPL56);
			title();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un documento Shakespeare");
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
	// $ANTLR end "parseSPL"



	// $ANTLR start "title"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:33:1: title : ( ID )+ DOT ( WS )? ( dramatisPersonae )+ acts scenes ;
	public final void title() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:2: ( ( ID )+ DOT ( WS )? ( dramatisPersonae )+ acts scenes )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:35:2: ( ID )+ DOT ( WS )? ( dramatisPersonae )+ acts scenes
			{
			System.out.println("* Sto per riconoscere il titolo");
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:2: ( ID )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:2: ID
					{
					match(input,ID,FOLLOW_ID_in_title76); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,DOT,FOLLOW_DOT_in_title79); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:10: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:10: WS
					{
					match(input,WS,FOLLOW_WS_in_title81); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:37:2: ( dramatisPersonae )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CHARACTER) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:37:2: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_title85);
					dramatisPersonae();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			pushFollow(FOLLOW_acts_in_title90);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_title93);
			scenes();
			state._fsp--;

			System.out.println("    - Ho riconosciuto il titolo");
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
	// $ANTLR end "title"



	// $ANTLR start "dramatisPersonae"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:43:1: dramatisPersonae : CHARACTER CM ( WS )? ( ID | CHARACTER | FS )* DOT ( WS )? ;
	public final void dramatisPersonae() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:2: ( CHARACTER CM ( WS )? ( ID | CHARACTER | FS )* DOT ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:45:2: CHARACTER CM ( WS )? ( ID | CHARACTER | FS )* DOT ( WS )?
			{
			System.out.println("* Sto per riconoscere un attore");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae111); 
			match(input,CM,FOLLOW_CM_in_dramatisPersonae113); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:15: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==WS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:15: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae115); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:19: ( ID | CHARACTER | FS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHARACTER||LA5_0==FS||LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( input.LA(1)==CHARACTER||input.LA(1)==FS||input.LA(1)==ID ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_dramatisPersonae131); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:46: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:46: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae133); 
					}
					break;

			}

			System.out.println("    - Ho riconosciuto un attore");
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
	// $ANTLR end "dramatisPersonae"



	// $ANTLR start "acts"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:1: acts : ACT ( WS )? root PP ( WS )? ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )* DOT ( WS )? ;
	public final void acts() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:2: ( ACT ( WS )? root PP ( WS )? ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )* DOT ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:2: ACT ( WS )? root PP ( WS )? ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )* DOT ( WS )?
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts166); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:6: ( WS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==WS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:6: WS
					{
					match(input,WS,FOLLOW_WS_in_acts168); 
					}
					break;

			}

			pushFollow(FOLLOW_root_in_acts171);
			root();
			state._fsp--;

			match(input,PP,FOLLOW_PP_in_acts173); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:18: ( WS )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==WS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:18: WS
					{
					match(input,WS,FOLLOW_WS_in_acts175); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:22: ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= ACT && LA9_0 <= CHARACTER)||LA9_0==ENTER||(LA9_0 >= EXEUNT && LA9_0 <= INPUTVALUE)||(LA9_0 >= NEGATIVEADJECTIVE && LA9_0 <= POSITIVENOUN)||LA9_0==SCENE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( (input.LA(1) >= ACT && input.LA(1) <= CHARACTER)||input.LA(1)==ENTER||(input.LA(1) >= EXEUNT && input.LA(1) <= INPUTVALUE)||(input.LA(1) >= NEGATIVEADJECTIVE && input.LA(1) <= POSITIVENOUN)||input.LA(1)==SCENE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_acts225); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:77: ( WS )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==WS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:77: WS
					{
					match(input,WS,FOLLOW_WS_in_acts227); 
					}
					break;

			}

			System.out.println("    - Ho riconosciuto un atto");
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
	// $ANTLR end "acts"



	// $ANTLR start "scenes"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:1: scenes : SCENE ( WS )? root PP ( WS )? ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )* DOT ( WS )? ;
	public final void scenes() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:8: ( SCENE ( WS )? root PP ( WS )? ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )* DOT ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:2: SCENE ( WS )? root PP ( WS )? ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )* DOT ( WS )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes244); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:8: ( WS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:8: WS
					{
					match(input,WS,FOLLOW_WS_in_scenes246); 
					}
					break;

			}

			pushFollow(FOLLOW_root_in_scenes249);
			root();
			state._fsp--;

			match(input,PP,FOLLOW_PP_in_scenes251); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:20: ( WS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:20: WS
					{
					match(input,WS,FOLLOW_WS_in_scenes253); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:24: ( CHARACTER | ID | POSITIVENOUN | NEGATIVENOUN | NEUTRALNOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ENTER | SCENE | ACT | EXIT | EXEUNT | GOTO | OUTPUTVALUE | OUTPUTASCII | INPUTASCII | INPUTVALUE | FS | AP )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= ACT && LA13_0 <= CHARACTER)||LA13_0==ENTER||(LA13_0 >= EXEUNT && LA13_0 <= INPUTVALUE)||(LA13_0 >= NEGATIVEADJECTIVE && LA13_0 <= POSITIVENOUN)||LA13_0==SCENE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( (input.LA(1) >= ACT && input.LA(1) <= CHARACTER)||input.LA(1)==ENTER||(input.LA(1) >= EXEUNT && input.LA(1) <= INPUTVALUE)||(input.LA(1) >= NEGATIVEADJECTIVE && input.LA(1) <= POSITIVENOUN)||input.LA(1)==SCENE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_scenes303); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:77: ( WS )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==WS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:77: WS
					{
					match(input,WS,FOLLOW_WS_in_scenes305); 
					}
					break;

			}

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
	// $ANTLR end "scenes"



	// $ANTLR start "one"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:1: one : 'I' ;
	public final void one() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:13: ( 'I' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:15: 'I'
			{
			match(input,36,FOLLOW_36_in_one331); 
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
	// $ANTLR end "one"



	// $ANTLR start "five"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:1: five : 'V' ;
	public final void five() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:13: ( 'V' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:15: 'V'
			{
			match(input,39,FOLLOW_39_in_five345); 
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
	// $ANTLR end "five"



	// $ANTLR start "ten"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:1: ten : 'X' ;
	public final void ten() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:13: ( 'X' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:15: 'X'
			{
			match(input,40,FOLLOW_40_in_ten360); 
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
	// $ANTLR end "ten"



	// $ANTLR start "fifty"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:1: fifty : 'L' ;
	public final void fifty() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:13: ( 'L' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:15: 'L'
			{
			match(input,37,FOLLOW_37_in_fifty373); 
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
	// $ANTLR end "fifty"



	// $ANTLR start "oneHundred"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:1: oneHundred : 'C' ;
	public final void oneHundred() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:13: ( 'C' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:15: 'C'
			{
			match(input,34,FOLLOW_34_in_oneHundred381); 
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
	// $ANTLR end "oneHundred"



	// $ANTLR start "fiveHundred"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:1: fiveHundred : 'D' ;
	public final void fiveHundred() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:13: ( 'D' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:15: 'D'
			{
			match(input,35,FOLLOW_35_in_fiveHundred388); 
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
	// $ANTLR end "fiveHundred"



	// $ANTLR start "oneThousand"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:1: oneThousand : 'M' ;
	public final void oneThousand() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:13: ( 'M' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:15: 'M'
			{
			match(input,38,FOLLOW_38_in_oneThousand395); 
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
	// $ANTLR end "oneThousand"



	// $ANTLR start "root"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:1: root : ( oneThousand )* ( hundreds )? ( tens )? ( units )? ;
	public final void root() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:7: ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:9: ( oneThousand )* ( hundreds )? ( tens )? ( units )?
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:9: ( oneThousand )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==38) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:10: oneThousand
					{
					pushFollow(FOLLOW_oneThousand_in_root405);
					oneThousand();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:24: ( hundreds )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= 34 && LA16_0 <= 35)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:24: hundreds
					{
					pushFollow(FOLLOW_hundreds_in_root409);
					hundreds();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:34: ( tens )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==37||LA17_0==40) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:34: tens
					{
					pushFollow(FOLLOW_tens_in_root412);
					tens();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:40: ( units )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==36||LA18_0==39) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:40: units
					{
					pushFollow(FOLLOW_units_in_root415);
					units();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "root"



	// $ANTLR start "units"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:1: units : ( one ( ( one )* | five | ten ) | five ( one )* );
	public final void units() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:7: ( one ( ( one )* | five | ten ) | five ( one )* )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==36) ) {
				alt22=1;
			}
			else if ( (LA22_0==39) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:9: one ( ( one )* | five | ten )
					{
					pushFollow(FOLLOW_one_in_units425);
					one();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:13: ( ( one )* | five | ten )
					int alt20=3;
					switch ( input.LA(1) ) {
					case PP:
					case 36:
						{
						alt20=1;
						}
						break;
					case 39:
						{
						alt20=2;
						}
						break;
					case 40:
						{
						alt20=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}
					switch (alt20) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:14: ( one )*
							{
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:14: ( one )*
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( (LA19_0==36) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:15: one
									{
									pushFollow(FOLLOW_one_in_units429);
									one();
									state._fsp--;

									}
									break;

								default :
									break loop19;
								}
							}

							}
							break;
						case 2 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:23: five
							{
							pushFollow(FOLLOW_five_in_units435);
							five();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:31: ten
							{
							pushFollow(FOLLOW_ten_in_units440);
							ten();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:38: five ( one )*
					{
					pushFollow(FOLLOW_five_in_units445);
					five();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:43: ( one )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==36) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:44: one
							{
							pushFollow(FOLLOW_one_in_units448);
							one();
							state._fsp--;

							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;

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
	// $ANTLR end "units"



	// $ANTLR start "tens"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:1: tens : ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* );
	public final void tens() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:7: ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==40) ) {
				alt26=1;
			}
			else if ( (LA26_0==37) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:9: ten ( ( ten )* | fifty | oneHundred )
					{
					pushFollow(FOLLOW_ten_in_tens461);
					ten();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:13: ( ( ten )* | fifty | oneHundred )
					int alt24=3;
					switch ( input.LA(1) ) {
					case PP:
					case 36:
					case 39:
					case 40:
						{
						alt24=1;
						}
						break;
					case 37:
						{
						alt24=2;
						}
						break;
					case 34:
						{
						alt24=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:14: ( ten )*
							{
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:14: ( ten )*
							loop23:
							while (true) {
								int alt23=2;
								int LA23_0 = input.LA(1);
								if ( (LA23_0==40) ) {
									alt23=1;
								}

								switch (alt23) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:15: ten
									{
									pushFollow(FOLLOW_ten_in_tens465);
									ten();
									state._fsp--;

									}
									break;

								default :
									break loop23;
								}
							}

							}
							break;
						case 2 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:23: fifty
							{
							pushFollow(FOLLOW_fifty_in_tens471);
							fifty();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:31: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_tens475);
							oneHundred();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:45: fifty ( ten )*
					{
					pushFollow(FOLLOW_fifty_in_tens480);
					fifty();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:51: ( ten )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==40) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:52: ten
							{
							pushFollow(FOLLOW_ten_in_tens483);
							ten();
							state._fsp--;

							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;

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
	// $ANTLR end "tens"



	// $ANTLR start "hundreds"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:1: hundreds : ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* );
	public final void hundreds() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:10: ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==34) ) {
				alt30=1;
			}
			else if ( (LA30_0==35) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:12: oneHundred ( ( oneHundred )* | fiveHundred | oneThousand )
					{
					pushFollow(FOLLOW_oneHundred_in_hundreds494);
					oneHundred();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:23: ( ( oneHundred )* | fiveHundred | oneThousand )
					int alt28=3;
					switch ( input.LA(1) ) {
					case PP:
					case 34:
					case 36:
					case 37:
					case 39:
					case 40:
						{
						alt28=1;
						}
						break;
					case 35:
						{
						alt28=2;
						}
						break;
					case 38:
						{
						alt28=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}
					switch (alt28) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:24: ( oneHundred )*
							{
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:24: ( oneHundred )*
							loop27:
							while (true) {
								int alt27=2;
								int LA27_0 = input.LA(1);
								if ( (LA27_0==34) ) {
									alt27=1;
								}

								switch (alt27) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:25: oneHundred
									{
									pushFollow(FOLLOW_oneHundred_in_hundreds498);
									oneHundred();
									state._fsp--;

									}
									break;

								default :
									break loop27;
								}
							}

							}
							break;
						case 2 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:40: fiveHundred
							{
							pushFollow(FOLLOW_fiveHundred_in_hundreds504);
							fiveHundred();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:54: oneThousand
							{
							pushFollow(FOLLOW_oneThousand_in_hundreds508);
							oneThousand();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:69: fiveHundred ( oneHundred )*
					{
					pushFollow(FOLLOW_fiveHundred_in_hundreds513);
					fiveHundred();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:81: ( oneHundred )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==34) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:82: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_hundreds516);
							oneHundred();
							state._fsp--;

							}
							break;

						default :
							break loop29;
						}
					}

					}
					break;

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
	// $ANTLR end "hundreds"

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title76 = new BitSet(new long[]{0x0000000000010200L});
	public static final BitSet FOLLOW_DOT_in_title79 = new BitSet(new long[]{0x0000000200000040L});
	public static final BitSet FOLLOW_WS_in_title81 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_dramatisPersonae_in_title85 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_title90 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_scenes_in_title93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae111 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_dramatisPersonae113 = new BitSet(new long[]{0x0000000200014240L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae115 = new BitSet(new long[]{0x0000000000014240L});
	public static final BitSet FOLLOW_DOT_in_dramatisPersonae131 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts166 = new BitSet(new long[]{0x000001FE20000000L});
	public static final BitSet FOLLOW_WS_in_acts168 = new BitSet(new long[]{0x000001FC20000000L});
	public static final BitSet FOLLOW_root_in_acts171 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PP_in_acts173 = new BitSet(new long[]{0x000000031FE7F670L});
	public static final BitSet FOLLOW_WS_in_acts175 = new BitSet(new long[]{0x000000011FE7F670L});
	public static final BitSet FOLLOW_DOT_in_acts225 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_WS_in_acts227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes244 = new BitSet(new long[]{0x000001FE20000000L});
	public static final BitSet FOLLOW_WS_in_scenes246 = new BitSet(new long[]{0x000001FC20000000L});
	public static final BitSet FOLLOW_root_in_scenes249 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PP_in_scenes251 = new BitSet(new long[]{0x000000031FE7F670L});
	public static final BitSet FOLLOW_WS_in_scenes253 = new BitSet(new long[]{0x000000011FE7F670L});
	public static final BitSet FOLLOW_DOT_in_scenes303 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_WS_in_scenes305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_one331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_five345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_ten360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_fifty373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_oneHundred381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_fiveHundred388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_oneThousand395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_root405 = new BitSet(new long[]{0x000001FC00000002L});
	public static final BitSet FOLLOW_hundreds_in_root409 = new BitSet(new long[]{0x000001B000000002L});
	public static final BitSet FOLLOW_tens_in_root412 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_units_in_root415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_in_units425 = new BitSet(new long[]{0x0000019000000002L});
	public static final BitSet FOLLOW_one_in_units429 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_five_in_units435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ten_in_units440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_five_in_units445 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_one_in_units448 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_ten_in_tens461 = new BitSet(new long[]{0x0000012400000002L});
	public static final BitSet FOLLOW_ten_in_tens465 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_fifty_in_tens471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneHundred_in_tens475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fifty_in_tens480 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_ten_in_tens483 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds494 = new BitSet(new long[]{0x0000004C00000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds498 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_hundreds508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds513 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds516 = new BitSet(new long[]{0x0000000400000002L});
}
