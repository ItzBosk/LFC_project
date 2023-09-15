// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-15 10:10:31

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
		"PRINTASCII", "PRINTVALUE", "QM", "RB", "READASCII", "READVALUE", "SCENE", 
		"WS"
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
	public static final int SCENE=34;
	public static final int WS=35;

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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( title )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:2: title
			{
			System.out.println("* I'm about to recognize a Shakespeare document..");
			pushFollow(FOLLOW_title_in_parseSPL67);
			title();
			state._fsp--;

			System.out.println("* I recognized a Shakespeare document");
			System.out.println();
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
			System.out.println("* I'm about to recognize the title..");
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
					t=(Token)match(input,ID,FOLLOW_ID_in_title110); 
					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title115); 
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
					match(input,WS,FOLLOW_WS_in_title117); 
					}
					break;

			}

			h.checkTitle(t, d);
			pushFollow(FOLLOW_body_in_title139);
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
					pushFollow(FOLLOW_dramatisPersonae_in_body166);
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

			pushFollow(FOLLOW_acts_in_body175);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body182);
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
			System.out.println("* I'm about to recognize a new actor..");
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae214); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae218); 
			h.checkPersonae(ch, co);
			System.out.println("* I recognized the new actor");
			System.out.println();
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:6: ( ACT rn= ID co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:6: ACT rn= ID co= COMMENT
			{
			System.out.println("* I am about to recognize the next act..");
			match(input,ACT,FOLLOW_ACT_in_acts302); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_acts306); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts310); 
			h.checkAct(rn, co);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )+ ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )+
			{
			System.out.println("* I'm about to recognize the next scene..");
			match(input,SCENE,FOLLOW_SCENE_in_scenes362); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes366); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes370); 
			h.checkScene(rn, co);
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:97:6: ( enterRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:97:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes394);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: ( stageEvent )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: stageEvent
					{
					pushFollow(FOLLOW_stageEvent_in_scenes402);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:1: enterRule : LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:2: ( LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:2: LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB
			{
			System.out.println("* I'm about to recognize an entrance on the scene..");
			match(input,LB,FOLLOW_LB_in_enterRule426); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule428); 
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule432); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:28: ( AND ch2= CHARACTER )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==AND) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:29: AND ch2= CHARACTER
					{
					match(input,AND,FOLLOW_AND_in_enterRule435); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule439); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule443); 
			h.checkEnter(ch1, ch2);
			System.out.println("* I recognized an entrance on the scene");
			System.out.println();
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:1: exitRule : LB EXIT ch= CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:2: ( LB EXIT ch= CHARACTER RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:6: LB EXIT ch= CHARACTER RB
			{
			System.out.println("* I'm about to recognize an exit..");
			match(input,LB,FOLLOW_LB_in_exitRule499); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule501); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule505); 
			match(input,RB,FOLLOW_RB_in_exitRule507); 
			h.checkExit(ch);
			System.out.println("* I recognized an exit");
			System.out.println();
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:124:1: exeuntRule : LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:6: ( LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:6: LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB
			{
			System.out.println("* I'm about to recognize a multiple exit..");
			match(input,LB,FOLLOW_LB_in_exeuntRule564); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule566); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:16: (ch1= CHARACTER AND ch2= CHARACTER )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CHARACTER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:17: ch1= CHARACTER AND ch2= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule571); 
					match(input,AND,FOLLOW_AND_in_exeuntRule573); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule577); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule581); 
			h.checkExeunt(ch1, ch2);
			System.out.println("* I recognized a multiple exit");
			System.out.println();
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:1: stageEvent : CHARACTER CL ID DOT ;
	public final void stageEvent() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:2: ( CHARACTER CL ID DOT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:135:2: CHARACTER CL ID DOT
			{
			System.out.println("* I am about to recognize stage events..");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent621); 
			match(input,CL,FOLLOW_CL_in_stageEvent623); 
			match(input,ID,FOLLOW_ID_in_stageEvent625); 
			match(input,DOT,FOLLOW_DOT_in_stageEvent627); 
			h.checkStageEvent();
			System.out.println("* I recognized some stage events");
			System.out.println();
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

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title110 = new BitSet(new long[]{0x0000000000081000L});
	public static final BitSet FOLLOW_DOT_in_title115 = new BitSet(new long[]{0x0000000800000080L});
	public static final BitSet FOLLOW_WS_in_title117 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_body_in_title139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body166 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_acts_in_body175 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae214 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts302 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_acts306 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_acts310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes362 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_scenes366 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_scenes370 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_enterRule_in_scenes394 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_stageEvent_in_scenes402 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_LB_in_enterRule426 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule428 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule432 = new BitSet(new long[]{0x0000000080000020L});
	public static final BitSet FOLLOW_AND_in_enterRule435 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule439 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_enterRule443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule499 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule501 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule505 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exitRule507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule564 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule566 = new BitSet(new long[]{0x0000000080000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule571 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_exeuntRule573 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule577 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent621 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_in_stageEvent623 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_stageEvent625 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_stageEvent627 = new BitSet(new long[]{0x0000000000000002L});
}
