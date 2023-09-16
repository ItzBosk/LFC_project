// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-16 16:21:26

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
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:6: title
			{
			pushFollow(FOLLOW_title_in_parseSPL64);
			title();
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
	// $ANTLR end "parseSPL"



	// $ANTLR start "title"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:50:1: title : (t= ID )* d= DOT ( WS )? body ;
	public final void title() throws RecognitionException {
		Token t=null;
		Token d=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:51:2: ( (t= ID )* d= DOT ( WS )? body )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: (t= ID )* d= DOT ( WS )? body
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:7: (t= ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:7: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_title87); 
					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title92); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:18: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:18: WS
					{
					match(input,WS,FOLLOW_WS_in_title94); 
					}
					break;

			}

			h.checkTitle(t, d);
			pushFollow(FOLLOW_body_in_title109);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:1: body : ( dramatisPersonae )+ ( acts ( scenes )+ )+ ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:2: ( ( dramatisPersonae )+ ( acts ( scenes )+ )+ )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:6: ( dramatisPersonae )+ ( acts ( scenes )+ )+
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:6: ( dramatisPersonae )+
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
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:6: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body136);
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

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:61:6: ( acts ( scenes )+ )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ACT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:61:7: acts ( scenes )+
					{
					pushFollow(FOLLOW_acts_in_body146);
					acts();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:6: ( scenes )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==SCENE) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:6: scenes
							{
							pushFollow(FOLLOW_scenes_in_body153);
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
	// $ANTLR end "body"



	// $ANTLR start "dramatisPersonae"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:1: dramatisPersonae : ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:6: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:6: ch= CHARACTER co= COMMENT
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae183); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae187); 
			h.checkPersonae(ch, co);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:76:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:77:6: ( ACT rn= ID co= COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:6: ACT rn= ID co= COMMENT
			{
			match(input,ACT,FOLLOW_ACT_in_acts254); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_acts258); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts262); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule )? ( exeuntRule )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule )? ( exeuntRule )? )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule )? ( exeuntRule )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes312); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes316); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes320); 
			h.checkScene(rn, co);
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:6: ( enterRule )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LB) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==ENTER) ) {
					alt6=1;
				}
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes345);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:6: ( stageEvent )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CHARACTER) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:6: stageEvent
					{
					pushFollow(FOLLOW_stageEvent_in_scenes353);
					stageEvent();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:6: ( exitRule )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LB) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==EXIT) ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:6: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes361);
					exitRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:6: ( exeuntRule )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LB) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:6: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_scenes369);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:1: enterRule : LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:2: ( LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:2: LB ENTER ch1= CHARACTER ( AND ch2= CHARACTER )? RB
			{
			System.out.println("* I'm about to recognize an entrance on the scene..");
			match(input,LB,FOLLOW_LB_in_enterRule399); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule401); 
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule405); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:28: ( AND ch2= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==AND) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:29: AND ch2= CHARACTER
					{
					match(input,AND,FOLLOW_AND_in_enterRule408); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule412); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule416); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:1: exitRule : LB EXIT ch= CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:2: ( LB EXIT ch= CHARACTER RB )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:6: LB EXIT ch= CHARACTER RB
			{
			System.out.println("* I'm about to recognize an exit..");
			match(input,LB,FOLLOW_LB_in_exitRule472); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule474); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule478); 
			match(input,RB,FOLLOW_RB_in_exitRule480); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:1: exeuntRule : LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token ch2=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:6: ( LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:6: LB EXEUNT (ch1= CHARACTER AND ch2= CHARACTER )? RB
			{
			System.out.println("* I'm about to recognize a multiple exit..");
			match(input,LB,FOLLOW_LB_in_exeuntRule537); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule539); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:123:16: (ch1= CHARACTER AND ch2= CHARACTER )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CHARACTER) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:123:17: ch1= CHARACTER AND ch2= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule544); 
					match(input,AND,FOLLOW_AND_in_exeuntRule546); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule550); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule554); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:1: stageEvent :ch1= CHARACTER CL ID DOT ;
	public final void stageEvent() throws RecognitionException {
		Token ch1=null;

		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:130:2: (ch1= CHARACTER CL ID DOT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:2: ch1= CHARACTER CL ID DOT
			{
			System.out.println("* I am about to recognize stage events..");
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent596); 
			match(input,CL,FOLLOW_CL_in_stageEvent598); 
			match(input,ID,FOLLOW_ID_in_stageEvent600); 
			match(input,DOT,FOLLOW_DOT_in_stageEvent602); 
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



	public static final BitSet FOLLOW_title_in_parseSPL64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title87 = new BitSet(new long[]{0x0000000000081000L});
	public static final BitSet FOLLOW_DOT_in_title92 = new BitSet(new long[]{0x0000000800000080L});
	public static final BitSet FOLLOW_WS_in_title94 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_body_in_title109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body136 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_acts_in_body146 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body153 = new BitSet(new long[]{0x0000000400000012L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae183 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts254 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_acts258 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_acts262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes312 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_scenes316 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_scenes320 = new BitSet(new long[]{0x0000000000100082L});
	public static final BitSet FOLLOW_enterRule_in_scenes345 = new BitSet(new long[]{0x0000000000100082L});
	public static final BitSet FOLLOW_stageEvent_in_scenes353 = new BitSet(new long[]{0x0000000000100082L});
	public static final BitSet FOLLOW_exitRule_in_scenes361 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule399 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule401 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule405 = new BitSet(new long[]{0x0000000080000020L});
	public static final BitSet FOLLOW_AND_in_enterRule408 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule412 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_enterRule416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule472 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule474 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule478 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exitRule480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule537 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule539 = new BitSet(new long[]{0x0000000080000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule544 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_exeuntRule546 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule550 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent596 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CL_in_stageEvent598 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_stageEvent600 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_stageEvent602 = new BitSet(new long[]{0x0000000000000002L});
}
