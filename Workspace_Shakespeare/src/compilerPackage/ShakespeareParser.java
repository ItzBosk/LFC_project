// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-16 12:45:59

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
	@Override public String getGrammarFileName() { return "C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }


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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( title )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:2: title
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:1: title : (t= ID )* d= DOT ( WS )? body ;
	public final void title() throws RecognitionException {
		Token t=null;
		Token d=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ( (t= ID )* d= DOT ( WS )? body )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:55:6: (t= ID )* d= DOT ( WS )? body
			{
			System.out.println("* I'm about to recognize the title..");
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:7: (t= ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:7: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_title110); 
					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title115); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:18: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:18: WS
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:1: body : ( dramatisPersonae )+ ( acts scenes )+ ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:2: ( ( dramatisPersonae )+ ( acts scenes )+ )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:6: ( dramatisPersonae )+ ( acts scenes )+
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:6: ( dramatisPersonae )+
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
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:6: dramatisPersonae
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

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: ( acts scenes )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ACT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:7: acts scenes
					{
					pushFollow(FOLLOW_acts_in_body176);
					acts();
					state._fsp--;

					pushFollow(FOLLOW_scenes_in_body183);
					scenes();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
	// $ANTLR end "body"



	// $ANTLR start "dramatisPersonae"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:1: dramatisPersonae :ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:6: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:5: ch= CHARACTER co= COMMENT
			{
			System.out.println("* I'm about to recognize a new actor..");
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae217); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae221); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:6: ( ACT rn= ID co= COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:6: ACT rn= ID co= COMMENT
			{
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )+ ( exitRule )? ( exeuntRule )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )+ ( exitRule )? ( exeuntRule )? )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:94:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )+ ( exitRule )? ( exeuntRule )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes361); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes365); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes369); 
			h.checkScene(rn, co);
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:97:6: ( enterRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LB) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:97:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes393);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: ( stageEvent )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CHARACTER) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: stageEvent
					{
					pushFollow(FOLLOW_stageEvent_in_scenes401);
					stageEvent();
					state._fsp--;

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:6: ( exitRule )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LB) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==EXIT) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:6: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes409);
					exitRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:6: ( exeuntRule )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LB) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:6: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_scenes417);
					exeuntRule();
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
	// $ANTLR end "scenes"



	// $ANTLR start "enterRule"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:1: enterRule : LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:2: ( LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:2: LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB
			{
			System.out.println("* I'm about to recognize an entrance on the scene..");
			match(input,LB,FOLLOW_LB_in_enterRule441); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule443); 
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule447); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:28: ( AND ch2= CHARACTER )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==AND) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:29: AND ch2= CHARACTER
					{
					match(input,AND,FOLLOW_AND_in_enterRule450); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule454); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule458); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:1: exitRule : LB EXIT ch= CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:2: ( LB EXIT ch= CHARACTER RB )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:118:6: LB EXIT ch= CHARACTER RB
			{
			System.out.println("* I'm about to recognize an exit..");
			match(input,LB,FOLLOW_LB_in_exitRule514); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule516); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule520); 
			match(input,RB,FOLLOW_RB_in_exitRule522); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:1: exeuntRule : LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:6: ( LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:6: LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB
			{
			System.out.println("* I'm about to recognize a multiple exit..");
			match(input,LB,FOLLOW_LB_in_exeuntRule579); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule581); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:16: (ch1= CHARACTER AND ch2= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CHARACTER) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:17: ch1= CHARACTER AND ch2= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule586); 
					match(input,AND,FOLLOW_AND_in_exeuntRule588); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule592); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule596); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:135:1: stageEvent :ch1= CHARACTER CL ID DOT ;
	public final void stageEvent() throws RecognitionException {
		Token ch1=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:2: (ch1= CHARACTER CL ID DOT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:2: ch1= CHARACTER CL ID DOT
			{
			System.out.println("* I am about to recognize stage events..");
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent638); 
			match(input,CL,FOLLOW_CL_in_stageEvent640); 
			match(input,ID,FOLLOW_ID_in_stageEvent642); 
			match(input,DOT,FOLLOW_DOT_in_stageEvent644); 
			h.checkStageEvent(ch1);
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
	public static final BitSet FOLLOW_acts_in_body176 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body183 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae217 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts302 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_acts306 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_acts310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes361 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_scenes365 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_scenes369 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_enterRule_in_scenes393 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_stageEvent_in_scenes401 = new BitSet(new long[]{0x0000000000100082L});
	public static final BitSet FOLLOW_exitRule_in_scenes409 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule441 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule443 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule447 = new BitSet(new long[]{0x0000000080000020L});
	public static final BitSet FOLLOW_AND_in_enterRule450 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule454 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_enterRule458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule514 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule516 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule520 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exitRule522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule579 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule581 = new BitSet(new long[]{0x0000000080000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule586 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_exeuntRule588 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule592 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent638 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_in_stageEvent640 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_stageEvent642 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_stageEvent644 = new BitSet(new long[]{0x0000000000000002L});
}
