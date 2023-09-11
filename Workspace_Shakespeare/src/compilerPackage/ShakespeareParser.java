// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-11 14:09:00

    package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "AND", "AP", "CHARACTER", 
		"CL", "CM", "COMMENT", "DIGIT", "DOT", "ENTER", "EP", "ERROR_TK", "EXEUNT", 
		"EXIT", "FS", "ID", "LB", "LETTER", "NEGATIVEADJECTIVE", "NEGATIVENOUN", 
		"NEUTRALADJECTIVE", "NEUTRALNOUN", "POSITIVEADJECTIVE", "POSITIVENOUN", 
		"PRINTASCII", "PRINTVALUE", "QM", "RB", "READASCII", "READVALUE", "RN", 
		"SCENE", "WS"
	};
	public static final int EOF=-1;
	public static final int ACT=4;
	public static final int AND=5;
	public static final int AP=6;
	public static final int CHARACTER=7;
	public static final int CL=8;
	public static final int CM=9;
	public static final int COMMENT=10;
	public static final int DIGIT=11;
	public static final int DOT=12;
	public static final int ENTER=13;
	public static final int EP=14;
	public static final int ERROR_TK=15;
	public static final int EXEUNT=16;
	public static final int EXIT=17;
	public static final int FS=18;
	public static final int ID=19;
	public static final int LB=20;
	public static final int LETTER=21;
	public static final int NEGATIVEADJECTIVE=22;
	public static final int NEGATIVENOUN=23;
	public static final int NEUTRALADJECTIVE=24;
	public static final int NEUTRALNOUN=25;
	public static final int POSITIVEADJECTIVE=26;
	public static final int POSITIVENOUN=27;
	public static final int PRINTASCII=28;
	public static final int PRINTVALUE=29;
	public static final int QM=30;
	public static final int RB=31;
	public static final int READASCII=32;
	public static final int READVALUE=33;
	public static final int RN=34;
	public static final int SCENE=35;
	public static final int WS=36;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }


	    Handler h; //dichiaro l'handler con dentro le funzioni di controllo in jav
	    public Handler getHandler () {
	        return h;
	    }
	    
	    // Override e delega nella gestione degli errori sintattici
	    public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
	     // recupero alcune meta informazioni relative all'errore
	        String hdr = " * " + getErrorHeader(e);
	        String msg = " - " + getErrorMessage(e, tokenNames);
	        
	        // recupero il token corrente  
	        Token tk = input.LT(1);
	        
	        // lascio gestire il messaggio all'handler
	        h.handleError(tk, hdr, msg);
	    }

	    void initParser () {
	        // passo lo stream di token all'handler 
	        h = new Handler(input);
	    }



	// $ANTLR start "parseSPL"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:45:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:2: ( title )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:48:2: title
			{
			System.out.println("* Sto per riconoscere un documento Shakespeare");
			pushFollow(FOLLOW_title_in_parseSPL67);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:1: title : (t= ID )* d= DOT ( WS )? body ;
	public final void title() throws RecognitionException {
		Token t=null;
		Token d=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ( (t= ID )* d= DOT ( WS )? body )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:55:6: (t= ID )* d= DOT ( WS )? body
			{
			System.out.println("* Sto per riconoscere il titolo");
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:7: (t= ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:7: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_title103); 
					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title108); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:18: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:18: WS
					{
					match(input,WS,FOLLOW_WS_in_title110); 
					}
					break;

			}

			h.checkNullTitle(t, d);
			System.out.println("    - Ho riconosciuto il titolo");
			pushFollow(FOLLOW_body_in_title133);
			body();
			state._fsp--;

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



	// $ANTLR start "body"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:1: body : ( dramatisPersonae )+ acts scenes ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:2: ( ( dramatisPersonae )+ acts scenes )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:6: ( dramatisPersonae )+ acts scenes
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:6: ( dramatisPersonae )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:6: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body160);
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

			pushFollow(FOLLOW_acts_in_body169);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body176);
			scenes();
			state._fsp--;

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
	// $ANTLR end "body"



	// $ANTLR start "dramatisPersonae"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:1: dramatisPersonae :ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:6: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:5: ch= CHARACTER co= COMMENT
			{
			System.out.println("* Sto per riconoscere un attore");
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae208); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae212); 
			h.checkPersonae(ch, co);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:1: acts : ACT root co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:6: ( ACT root co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:6: ACT root co= COMMENT
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts289); 
			pushFollow(FOLLOW_root_in_acts291);
			root();
			state._fsp--;

			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts295); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:1: scenes : SCENE root co= COMMENT ( enterRule )? ( stageEvent )+ ;
	public final void scenes() throws RecognitionException {
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:2: ( SCENE root co= COMMENT ( enterRule )? ( stageEvent )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:6: SCENE root co= COMMENT ( enterRule )? ( stageEvent )+
			{
			System.out.println("* Sto per riconoscere una scena");
			match(input,SCENE,FOLLOW_SCENE_in_scenes339); 
			pushFollow(FOLLOW_root_in_scenes341);
			root();
			state._fsp--;

			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes345); 
			System.out.println("    - Ho riconosciuto una scena");
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:94:6: ( enterRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:94:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes359);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:6: ( stageEvent )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHARACTER) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:6: stageEvent
					{
					pushFollow(FOLLOW_stageEvent_in_scenes367);
					stageEvent();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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



	// $ANTLR start "enterRule"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:1: enterRule : LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:2: ( LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:2: LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB
			{
			System.out.println("* Sto per riconoscere un'entrata in scena");
			match(input,LB,FOLLOW_LB_in_enterRule391); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule393); 
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule397); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:28: ( AND ch2= CHARACTER )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==AND) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:29: AND ch2= CHARACTER
					{
					match(input,AND,FOLLOW_AND_in_enterRule400); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule404); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule408); 
			h.checkEnter(ch1, ch2);
			System.out.println("    - Ho riconosciuto un'entrata in scena");
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
	// $ANTLR end "enterRule"



	// $ANTLR start "exitRule"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:1: exitRule : LB EXIT ch= CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:2: ( LB EXIT ch= CHARACTER RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:6: LB EXIT ch= CHARACTER RB
			{
			System.out.println("* Sto per riconoscere un'uscita di scena");
			match(input,LB,FOLLOW_LB_in_exitRule458); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule460); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule464); 
			match(input,RB,FOLLOW_RB_in_exitRule466); 
			h.checkExit(ch);
			System.out.println("    - Ho riconosciuto un'uscita di scena");
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
	// $ANTLR end "exitRule"



	// $ANTLR start "exeuntRule"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:1: exeuntRule : LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:6: ( LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:6: LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB
			{
			System.out.println("* Sto per riconoscere un'uscita di scena multipla");
			match(input,LB,FOLLOW_LB_in_exeuntRule516); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule518); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:16: (ch1= CHARACTER AND ch2= CHARACTER )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CHARACTER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:17: ch1= CHARACTER AND ch2= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule523); 
					match(input,AND,FOLLOW_AND_in_exeuntRule525); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule529); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule533); 
			h.checkExeunt(ch1, ch2);
			System.out.println("    - Ho riconosciuto un'uscita di scena multipla");
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
	// $ANTLR end "exeuntRule"



	// $ANTLR start "stageEvent"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:1: stageEvent : CHARACTER CL ID DOT ;
	public final void stageEvent() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:2: ( CHARACTER CL ID DOT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:2: CHARACTER CL ID DOT
			{
			System.out.println("* Sto per riconoscere degli stage events");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent566); 
			match(input,CL,FOLLOW_CL_in_stageEvent568); 
			match(input,ID,FOLLOW_ID_in_stageEvent570); 
			match(input,DOT,FOLLOW_DOT_in_stageEvent572); 
			h.checkStageEvent();
			System.out.println("    - Ho riconosciuto degli stage events");
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
	// $ANTLR end "stageEvent"



	// $ANTLR start "root"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:135:1: root returns [Token tk] : rn= RN ;
	public final Token root() throws RecognitionException {
		Token tk = null;


		Token rn=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:6: (rn= RN )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:6: rn= RN
			{
			rn=(Token)match(input,RN,FOLLOW_RN_in_root607); 
			tk = rn;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tk;
	}
	// $ANTLR end "root"

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title103 = new BitSet(new long[]{0x0000000000081000L});
	public static final BitSet FOLLOW_DOT_in_title108 = new BitSet(new long[]{0x0000001000000080L});
	public static final BitSet FOLLOW_WS_in_title110 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_body_in_title133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body160 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_acts_in_body169 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_scenes_in_body176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae208 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts289 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_root_in_acts291 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_acts295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes339 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_root_in_scenes341 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_scenes345 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_enterRule_in_scenes359 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_stageEvent_in_scenes367 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_LB_in_enterRule391 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule393 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule397 = new BitSet(new long[]{0x0000000080000020L});
	public static final BitSet FOLLOW_AND_in_enterRule400 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule404 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_enterRule408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule458 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule460 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule464 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exitRule466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule516 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule518 = new BitSet(new long[]{0x0000000080000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule523 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_exeuntRule525 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule529 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent566 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_in_stageEvent568 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_stageEvent570 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_stageEvent572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RN_in_root607 = new BitSet(new long[]{0x0000000000000002L});
}
