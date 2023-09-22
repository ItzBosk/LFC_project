// $ANTLR 3.5.1 /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g 2023-09-22 12:39:23

    package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ACT", "AMI", "AND", "AP", 
		"ARE", "AS", "BETTER", "CHARACTER", "CL", "CM", "COMMENT", "DIFFBET", 
		"DIGIT", "DOT", "ENTER", "EP", "ERROR_TK", "EXEUNT", "EXIT", "FS", "ID", 
		"IFNOT", "IFSO", "LB", "LETTER", "LETUS", "ME", "NEGATIVEADJECTIVE", "NEGATIVENOUN", 
		"NEUTRALADJECTIVE", "NEUTRALNOUN", "POSITIVEADJECTIVE", "POSITIVENOUN", 
		"PRINTASCII", "PRINTVALUE", "PROCEEDTO", "PRODOF", "QM", "RB", "READASCII", 
		"READVALUE", "RECALL", "REMEMBER", "RETURNTO", "SC", "SCENE", "SCENEC", 
		"SUMOF", "THAN", "THOUART", "THYSELF", "WEMUST", "WESHALL", "WORSE", "WS", 
		"YOU", "YOUC", "YOURSELF"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int ACT=5;
	public static final int AMI=6;
	public static final int AND=7;
	public static final int AP=8;
	public static final int ARE=9;
	public static final int AS=10;
	public static final int BETTER=11;
	public static final int CHARACTER=12;
	public static final int CL=13;
	public static final int CM=14;
	public static final int COMMENT=15;
	public static final int DIFFBET=16;
	public static final int DIGIT=17;
	public static final int DOT=18;
	public static final int ENTER=19;
	public static final int EP=20;
	public static final int ERROR_TK=21;
	public static final int EXEUNT=22;
	public static final int EXIT=23;
	public static final int FS=24;
	public static final int ID=25;
	public static final int IFNOT=26;
	public static final int IFSO=27;
	public static final int LB=28;
	public static final int LETTER=29;
	public static final int LETUS=30;
	public static final int ME=31;
	public static final int NEGATIVEADJECTIVE=32;
	public static final int NEGATIVENOUN=33;
	public static final int NEUTRALADJECTIVE=34;
	public static final int NEUTRALNOUN=35;
	public static final int POSITIVEADJECTIVE=36;
	public static final int POSITIVENOUN=37;
	public static final int PRINTASCII=38;
	public static final int PRINTVALUE=39;
	public static final int PROCEEDTO=40;
	public static final int PRODOF=41;
	public static final int QM=42;
	public static final int RB=43;
	public static final int READASCII=44;
	public static final int READVALUE=45;
	public static final int RECALL=46;
	public static final int REMEMBER=47;
	public static final int RETURNTO=48;
	public static final int SC=49;
	public static final int SCENE=50;
	public static final int SCENEC=51;
	public static final int SUMOF=52;
	public static final int THAN=53;
	public static final int THOUART=54;
	public static final int THYSELF=55;
	public static final int WEMUST=56;
	public static final int WESHALL=57;
	public static final int WORSE=58;
	public static final int WS=59;
	public static final int YOU=60;
	public static final int YOUC=61;
	public static final int YOURSELF=62;

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
	@Override public String getGrammarFileName() { return "/Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g"; }


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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:44:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:46:2: ( title )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:47:6: title
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:50:1: title : ( titlechar )* d= DOT (t= WS )? body ;
	public final void title() throws RecognitionException {
		Token d=null;
		Token t=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:51:2: ( ( titlechar )* d= DOT (t= WS )? body )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:53:6: ( titlechar )* d= DOT (t= WS )? body
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:53:6: ( titlechar )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:53:6: titlechar
					{
					pushFollow(FOLLOW_titlechar_in_title90);
					titlechar();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title95); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:53:24: (t= WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:53:24: t= WS
					{
					t=(Token)match(input,WS,FOLLOW_WS_in_title99); 
					}
					break;

			}

			h.checkTitle(d);
			pushFollow(FOLLOW_body_in_title121);
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



	// $ANTLR start "titlechar"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:59:1: titlechar : f= ID ;
	public final void titlechar() throws RecognitionException {
		Token f=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:59:11: (f= ID )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:60:2: f= ID
			{
			f=(Token)match(input,ID,FOLLOW_ID_in_titlechar144); 
			h.buildTitle(f);
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
	// $ANTLR end "titlechar"



	// $ANTLR start "body"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:63:1: body : ( dramatisPersonae )+ ( acts ( scenes )+ )+ ;
	public final void body() throws RecognitionException {
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:64:2: ( ( dramatisPersonae )+ ( acts ( scenes )+ )+ )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:65:6: ( dramatisPersonae )+ ( acts ( scenes )+ )+
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:65:6: ( dramatisPersonae )+
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
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:65:6: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body169);
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

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:66:6: ( acts ( scenes )+ )+
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
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:66:7: acts ( scenes )+
					{
					pushFollow(FOLLOW_acts_in_body179);
					acts();
					state._fsp--;

					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:67:6: ( scenes )+
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
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:67:6: scenes
							{
							pushFollow(FOLLOW_scenes_in_body186);
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:70:1: dramatisPersonae : ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:71:6: (ch= CHARACTER co= COMMENT )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:73:6: ch= CHARACTER co= COMMENT
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae221); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae225); 
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:84:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:85:6: ( ACT rn= ID co= COMMENT )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:87:6: ACT rn= ID co= COMMENT
			{
			match(input,ACT,FOLLOW_ACT_in_acts304); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_acts308); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts312); 
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:92:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( comparison )? ( exitRule | exeuntRule )? ( remember )? ( recall )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:93:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( comparison )? ( exitRule | exeuntRule )? ( remember )? ( recall )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:95:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( comparison )? ( exitRule | exeuntRule )? ( remember )? ( recall )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes362); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes366); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes370); 
			h.checkScene(rn, co);
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:98:6: ( enterRule )?
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
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:98:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes395);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:99:6: ( stageEvent )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CHARACTER) ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1==CL) ) {
						int LA7_3 = input.LA(3);
						if ( (LA7_3==WS) ) {
							int LA7_4 = input.LA(4);
							if ( (LA7_4==THOUART||LA7_4==YOU) ) {
								alt7=1;
							}

						}
						else if ( (LA7_3==EOF||LA7_3==ACT||LA7_3==CHARACTER||LA7_3==LB||LA7_3==SCENE||LA7_3==THOUART||LA7_3==YOU) ) {
							alt7=1;
						}

					}

				}

				switch (alt7) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:99:6: stageEvent
					{
					pushFollow(FOLLOW_stageEvent_in_scenes403);
					stageEvent();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:100:6: ( comparison )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==CHARACTER) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==CL) ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3==WS) ) {
						int LA8_4 = input.LA(4);
						if ( (LA8_4==AMI) ) {
							alt8=1;
						}
					}
					else if ( (LA8_3==AMI) ) {
						alt8=1;
					}
				}
			}
			switch (alt8) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:100:6: comparison
					{
					pushFollow(FOLLOW_comparison_in_scenes411);
					comparison();
					state._fsp--;

					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:101:6: ( exitRule | exeuntRule )?
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LB) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==EXIT) ) {
					alt9=1;
				}
				else if ( (LA9_1==EXEUNT) ) {
					alt9=2;
				}
			}
			switch (alt9) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:101:7: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes420);
					exitRule();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:102:6: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_scenes429);
					exeuntRule();
					state._fsp--;

					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:103:6: ( remember )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CHARACTER) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==CL) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==WS) ) {
						int LA10_4 = input.LA(4);
						if ( (LA10_4==REMEMBER) ) {
							alt10=1;
						}
					}
					else if ( (LA10_3==REMEMBER) ) {
						alt10=1;
					}
				}
			}
			switch (alt10) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:103:6: remember
					{
					pushFollow(FOLLOW_remember_in_scenes438);
					remember();
					state._fsp--;

					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:104:6: ( recall )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CHARACTER) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:104:6: recall
					{
					pushFollow(FOLLOW_recall_in_scenes446);
					recall();
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:108:1: enterRule : LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:2: ( LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:5: LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_enterRule469); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule471); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:14: (ch1= CHARACTER )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CHARACTER) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:15: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule476); 
					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:31: (and= AND ch2= CHARACTER )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AND) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:32: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_enterRule483); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule487); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule491); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:59: ( WS )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==WS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:111:59: WS
					{
					match(input,WS,FOLLOW_WS_in_enterRule493); 
					}
					break;

			}

			h.checkEnter(ch1, and, ch2);
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:120:1: exitRule : LB EXIT ch= CHARACTER RB ( WS )? ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:121:2: ( LB EXIT ch= CHARACTER RB ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:123:6: LB EXIT ch= CHARACTER RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exitRule547); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule549); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule553); 
			match(input,RB,FOLLOW_RB_in_exitRule555); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:123:30: ( WS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:123:30: WS
					{
					match(input,WS,FOLLOW_WS_in_exitRule557); 
					}
					break;

			}

			h.checkExit(ch);
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:130:1: exeuntRule : LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:6: ( LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:6: LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exeuntRule612); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule614); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:16: (ch1= CHARACTER )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CHARACTER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:17: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule619); 
					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:33: (and= AND ch2= CHARACTER )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==AND) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:34: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_exeuntRule626); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule630); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule634); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:61: ( WS )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==WS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:133:61: WS
					{
					match(input,WS,FOLLOW_WS_in_exeuntRule636); 
					}
					break;

			}

			h.checkExeunt(ch1, and, ch2);
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:140:1: stageEvent : (ch1= CHARACTER CL ( ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )* ) ;
	public final void stageEvent() throws RecognitionException {
		Token ch1=null;
		Token noun1=null;
		Token operationtype=null;
		Token noun2=null;
		Token noun3=null;
		Token noun4=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:141:6: ( (ch1= CHARACTER CL ( ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )* ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:6: (ch1= CHARACTER CL ( ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )* )
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:6: (ch1= CHARACTER CL ( ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )* )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:7: ch1= CHARACTER CL ( ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )*
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent684); 
			match(input,CL,FOLLOW_CL_in_stageEvent686); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:6: ( ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==THOUART||(LA28_0 >= WS && LA28_0 <= YOU)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:7: ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT )
					{
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:7: ( WS )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==WS) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:7: WS
							{
							match(input,WS,FOLLOW_WS_in_stageEvent696); 
							}
							break;

					}

					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:10: ( YOU ( ARE )? | THOUART )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==YOU) ) {
						alt21=1;
					}
					else if ( (LA21_0==THOUART) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:11: YOU ( ARE )?
							{
							match(input,YOU,FOLLOW_YOU_in_stageEvent699); 
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:15: ( ARE )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==ARE) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:15: ARE
									{
									match(input,ARE,FOLLOW_ARE_in_stageEvent701); 
									}
									break;

							}

							}
							break;
						case 2 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:22: THOUART
							{
							match(input,THOUART,FOLLOW_THOUART_in_stageEvent706); 
							}
							break;

					}

					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:145:6: ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) )
					int alt27=3;
					switch ( input.LA(1) ) {
					case A:
					case NEGATIVEADJECTIVE:
					case NEGATIVENOUN:
					case NEUTRALADJECTIVE:
					case NEUTRALNOUN:
					case POSITIVEADJECTIVE:
					case POSITIVENOUN:
						{
						alt27=1;
						}
						break;
					case AS:
						{
						alt27=2;
						}
						break;
					case DIFFBET:
					case PRODOF:
					case SUMOF:
						{
						alt27=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}
					switch (alt27) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:145:7: ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
							{
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:145:7: ( A )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==A) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:145:7: A
									{
									match(input,A,FOLLOW_A_in_stageEvent717); 
									}
									break;

							}

							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:145:9: ( adjective )*
							loop23:
							while (true) {
								int alt23=2;
								int LA23_0 = input.LA(1);
								if ( (LA23_0==NEGATIVEADJECTIVE||LA23_0==NEUTRALADJECTIVE||LA23_0==POSITIVEADJECTIVE) ) {
									alt23=1;
								}

								switch (alt23) {
								case 1 :
									// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:145:10: adjective
									{
									pushFollow(FOLLOW_adjective_in_stageEvent720);
									adjective();
									state._fsp--;

									}
									break;

								default :
									break loop23;
								}
							}

							noun1=input.LT(1);
							if ( input.LA(1)==NEGATIVENOUN||input.LA(1)==NEUTRALNOUN||input.LA(1)==POSITIVENOUN ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;
						case 2 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:6: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
							{
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:6: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:7: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
							{
							match(input,AS,FOLLOW_AS_in_stageEvent746); 
							if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,AS,FOLLOW_AS_in_stageEvent760); 
							operationtype=input.LT(1);
							if ( input.LA(1)==DIFFBET||input.LA(1)==PRODOF||input.LA(1)==SUMOF ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,A,FOLLOW_A_in_stageEvent776); 
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:116: ( adjective )*
							loop24:
							while (true) {
								int alt24=2;
								int LA24_0 = input.LA(1);
								if ( (LA24_0==NEGATIVEADJECTIVE||LA24_0==NEUTRALADJECTIVE||LA24_0==POSITIVEADJECTIVE) ) {
									alt24=1;
								}

								switch (alt24) {
								case 1 :
									// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:116: adjective
									{
									pushFollow(FOLLOW_adjective_in_stageEvent779);
									adjective();
									state._fsp--;

									}
									break;

								default :
									break loop24;
								}
							}

							noun2=input.LT(1);
							if ( input.LA(1)==NEGATIVENOUN||input.LA(1)==NEUTRALNOUN||input.LA(1)==POSITIVENOUN ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,AND,FOLLOW_AND_in_stageEvent802); 
							match(input,A,FOLLOW_A_in_stageEvent804); 
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:147:12: ( adjectiveSecond )*
							loop25:
							while (true) {
								int alt25=2;
								int LA25_0 = input.LA(1);
								if ( (LA25_0==NEGATIVEADJECTIVE||LA25_0==NEUTRALADJECTIVE||LA25_0==POSITIVEADJECTIVE) ) {
									alt25=1;
								}

								switch (alt25) {
								case 1 :
									// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:147:12: adjectiveSecond
									{
									pushFollow(FOLLOW_adjectiveSecond_in_stageEvent806);
									adjectiveSecond();
									state._fsp--;

									}
									break;

								default :
									break loop25;
								}
							}

							noun3=input.LT(1);
							if ( input.LA(1)==NEGATIVENOUN||input.LA(1)==NEUTRALNOUN||input.LA(1)==POSITIVENOUN ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}

							}
							break;
						case 3 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:148:6: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
							{
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:148:6: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:148:7: operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
							{
							operationtype=input.LT(1);
							if ( input.LA(1)==DIFFBET||input.LA(1)==PRODOF||input.LA(1)==SUMOF ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,THYSELF,FOLLOW_THYSELF_in_stageEvent845); 
							match(input,AND,FOLLOW_AND_in_stageEvent847); 
							match(input,A,FOLLOW_A_in_stageEvent849); 
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:148:62: ( adjective )*
							loop26:
							while (true) {
								int alt26=2;
								int LA26_0 = input.LA(1);
								if ( (LA26_0==NEGATIVEADJECTIVE||LA26_0==NEUTRALADJECTIVE||LA26_0==POSITIVEADJECTIVE) ) {
									alt26=1;
								}

								switch (alt26) {
								case 1 :
									// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:148:62: adjective
									{
									pushFollow(FOLLOW_adjective_in_stageEvent851);
									adjective();
									state._fsp--;

									}
									break;

								default :
									break loop26;
								}
							}

							noun4=input.LT(1);
							if ( input.LA(1)==NEGATIVENOUN||input.LA(1)==NEUTRALNOUN||input.LA(1)==POSITIVENOUN ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}

							}
							break;

					}

					if ( input.LA(1)==DOT||input.LA(1)==EP ) {
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
					break loop28;
				}
			}

			}

			h.checkStageEvent(ch1, noun1, noun2, noun3, noun4, operationtype);
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



	// $ANTLR start "adjective"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:153:1: adjective : ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjective() throws RecognitionException {
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:154:2: ( ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:155:2: ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
			{
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.adjectiveCounter++;
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
	// $ANTLR end "adjective"



	// $ANTLR start "comparison"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:160:1: comparison : ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL ( WS )? gt= ( IFSO | IFNOT ) ( LETUS | WESHALL | WEMUST ) ( RETURNTO | PROCEEDTO ) SCENEC rn= ID DOT ( WS )? ;
	public final void comparison() throws RecognitionException {
		Token ch1=null;
		Token ev=null;
		Token ch2=null;
		Token gt=null;
		Token rn=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:161:2: (ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL ( WS )? gt= ( IFSO | IFNOT ) ( LETUS | WESHALL | WEMUST ) ( RETURNTO | PROCEEDTO ) SCENEC rn= ID DOT ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:162:2: ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL ( WS )? gt= ( IFSO | IFNOT ) ( LETUS | WESHALL | WEMUST ) ( RETURNTO | PROCEEDTO ) SCENEC rn= ID DOT ( WS )?
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_comparison927); 
			match(input,CL,FOLLOW_CL_in_comparison929); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:162:19: ( WS )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==WS) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:162:19: WS
					{
					match(input,WS,FOLLOW_WS_in_comparison931); 
					}
					break;

			}

			match(input,AMI,FOLLOW_AMI_in_comparison935); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:164:5: ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE )
			int alt30=3;
			switch ( input.LA(1) ) {
			case BETTER:
				{
				alt30=1;
				}
				break;
			case AS:
				{
				alt30=2;
				}
				break;
			case WORSE:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:164:6: BETTER
					{
					ev=(Token)match(input,BETTER,FOLLOW_BETTER_in_comparison942); 
					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:164:15: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					{
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:164:15: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:164:16: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS
					{
					ev=(Token)match(input,AS,FOLLOW_AS_in_comparison947); 
					ev=input.LT(1);
					if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ev=(Token)match(input,AS,FOLLOW_AS_in_comparison961); 
					}

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:164:84: WORSE
					{
					ev=(Token)match(input,WORSE,FOLLOW_WORSE_in_comparison966); 
					}
					break;

			}

			match(input,THAN,FOLLOW_THAN_in_comparison971); 
			match(input,YOUC,FOLLOW_YOUC_in_comparison973); 
			match(input,QM,FOLLOW_QM_in_comparison975); 
			ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_comparison982); 
			match(input,CL,FOLLOW_CL_in_comparison984); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:167:19: ( WS )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==WS) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:167:19: WS
					{
					match(input,WS,FOLLOW_WS_in_comparison986); 
					}
					break;

			}

			gt=input.LT(1);
			if ( (input.LA(1) >= IFNOT && input.LA(1) <= IFSO) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( input.LA(1)==LETUS||(input.LA(1) >= WEMUST && input.LA(1) <= WESHALL) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( input.LA(1)==PROCEEDTO||input.LA(1)==RETURNTO ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,SCENEC,FOLLOW_SCENEC_in_comparison1020); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_comparison1024); 
			match(input,DOT,FOLLOW_DOT_in_comparison1026); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:168:87: ( WS )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==WS) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:168:87: WS
					{
					match(input,WS,FOLLOW_WS_in_comparison1028); 
					}
					break;

			}

			h.checkComparison(ch1, ev, ch2, gt, rn);
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
	// $ANTLR end "comparison"



	// $ANTLR start "adjectiveSecond"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:174:1: adjectiveSecond : ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjectiveSecond() throws RecognitionException {
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:175:2: ( ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:176:2: ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
			{
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.adjectiveCounter2++;
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
	// $ANTLR end "adjectiveSecond"



	// $ANTLR start "remember"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:180:1: remember : (ch= CHARACTER ) CL ( WS )? REMEMBER who= ( ME | YOURSELF ) DOT ;
	public final void remember() throws RecognitionException {
		Token ch=null;
		Token who=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:181:2: ( (ch= CHARACTER ) CL ( WS )? REMEMBER who= ( ME | YOURSELF ) DOT )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:182:2: (ch= CHARACTER ) CL ( WS )? REMEMBER who= ( ME | YOURSELF ) DOT
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:182:2: (ch= CHARACTER )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:182:3: ch= CHARACTER
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_remember1076); 
			}

			match(input,CL,FOLLOW_CL_in_remember1079); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:182:20: ( WS )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==WS) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:182:20: WS
					{
					match(input,WS,FOLLOW_WS_in_remember1081); 
					}
					break;

			}

			match(input,REMEMBER,FOLLOW_REMEMBER_in_remember1085); 
			who=input.LT(1);
			if ( input.LA(1)==ME||input.LA(1)==YOURSELF ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,DOT,FOLLOW_DOT_in_remember1097); 
			h.checkRemember(ch, who);
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
	// $ANTLR end "remember"



	// $ANTLR start "recall"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:187:1: recall : (ch= CHARACTER ) CL ( WS )? RECALL ( ID )* ( DOT | EP ) ;
	public final void recall() throws RecognitionException {
		Token ch=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:188:2: ( (ch= CHARACTER ) CL ( WS )? RECALL ( ID )* ( DOT | EP ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:189:2: (ch= CHARACTER ) CL ( WS )? RECALL ( ID )* ( DOT | EP )
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:189:2: (ch= CHARACTER )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:189:3: ch= CHARACTER
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_recall1115); 
			}

			match(input,CL,FOLLOW_CL_in_recall1118); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:189:20: ( WS )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==WS) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:189:20: WS
					{
					match(input,WS,FOLLOW_WS_in_recall1120); 
					}
					break;

			}

			match(input,RECALL,FOLLOW_RECALL_in_recall1124); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:190:9: ( ID )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==ID) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:190:9: ID
					{
					match(input,ID,FOLLOW_ID_in_recall1126); 
					}
					break;

				default :
					break loop35;
				}
			}

			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			//h.chechRecall(ch);
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
	// $ANTLR end "recall"



	// $ANTLR start "printRule"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:194:1: printRule : phrase= ( PRINTVALUE | PRINTASCII ) ;
	public final void printRule() throws RecognitionException {
		Token phrase=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:195:2: (phrase= ( PRINTVALUE | PRINTASCII ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:196:2: phrase= ( PRINTVALUE | PRINTASCII )
			{
			phrase=input.LT(1);
			if ( (input.LA(1) >= PRINTASCII && input.LA(1) <= PRINTVALUE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			//	h.chechPrint(phrase);
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
	// $ANTLR end "printRule"



	// $ANTLR start "readRule"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:200:1: readRule : phrase= ( READVALUE | READASCII ) ;
	public final void readRule() throws RecognitionException {
		Token phrase=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:201:2: (phrase= ( READVALUE | READASCII ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:202:2: phrase= ( READVALUE | READASCII )
			{
			phrase=input.LT(1);
			if ( (input.LA(1) >= READASCII && input.LA(1) <= READVALUE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
		//	h.chechRead(phrase);
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
	// $ANTLR end "readRule"

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titlechar_in_title90 = new BitSet(new long[]{0x0000000002040000L});
	public static final BitSet FOLLOW_DOT_in_title95 = new BitSet(new long[]{0x0800000000001000L});
	public static final BitSet FOLLOW_WS_in_title99 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_body_in_title121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_titlechar144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body169 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_acts_in_body179 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_scenes_in_body186 = new BitSet(new long[]{0x0004000000000022L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae221 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts304 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_acts308 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMENT_in_acts312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes362 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_scenes366 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMENT_in_scenes370 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_enterRule_in_scenes395 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_stageEvent_in_scenes403 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_comparison_in_scenes411 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_exitRule_in_scenes420 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes429 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_remember_in_scenes438 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_recall_in_scenes446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule469 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule471 = new BitSet(new long[]{0x0000080000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule476 = new BitSet(new long[]{0x0000080000000080L});
	public static final BitSet FOLLOW_AND_in_enterRule483 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule487 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_enterRule491 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_WS_in_enterRule493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule547 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule549 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule553 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_exitRule555 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_WS_in_exitRule557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule612 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule614 = new BitSet(new long[]{0x0000080000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule619 = new BitSet(new long[]{0x0000080000000080L});
	public static final BitSet FOLLOW_AND_in_exeuntRule626 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule630 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule634 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_WS_in_exeuntRule636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent684 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_stageEvent686 = new BitSet(new long[]{0x1840000000000002L});
	public static final BitSet FOLLOW_WS_in_stageEvent696 = new BitSet(new long[]{0x1040000000000000L});
	public static final BitSet FOLLOW_YOU_in_stageEvent699 = new BitSet(new long[]{0x0010023F00010610L});
	public static final BitSet FOLLOW_ARE_in_stageEvent701 = new BitSet(new long[]{0x0010023F00010410L});
	public static final BitSet FOLLOW_THOUART_in_stageEvent706 = new BitSet(new long[]{0x0010023F00010410L});
	public static final BitSet FOLLOW_A_in_stageEvent717 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent720 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_stageEvent726 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_AS_in_stageEvent746 = new BitSet(new long[]{0x0000001500000000L});
	public static final BitSet FOLLOW_set_in_stageEvent748 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_stageEvent760 = new BitSet(new long[]{0x0010020000010000L});
	public static final BitSet FOLLOW_set_in_stageEvent764 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent776 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent779 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_stageEvent784 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_stageEvent802 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent804 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjectiveSecond_in_stageEvent806 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_stageEvent811 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_stageEvent833 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THYSELF_in_stageEvent845 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_stageEvent847 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent849 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent851 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_stageEvent856 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_stageEvent875 = new BitSet(new long[]{0x1840000000000002L});
	public static final BitSet FOLLOW_set_in_adjective899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_comparison927 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_comparison929 = new BitSet(new long[]{0x0800000000000040L});
	public static final BitSet FOLLOW_WS_in_comparison931 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AMI_in_comparison935 = new BitSet(new long[]{0x0400000000000C00L});
	public static final BitSet FOLLOW_BETTER_in_comparison942 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_AS_in_comparison947 = new BitSet(new long[]{0x0000001500000000L});
	public static final BitSet FOLLOW_set_in_comparison949 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_comparison961 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_WORSE_in_comparison966 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_THAN_in_comparison971 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_YOUC_in_comparison973 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_QM_in_comparison975 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_comparison982 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_comparison984 = new BitSet(new long[]{0x080000000C000000L});
	public static final BitSet FOLLOW_WS_in_comparison986 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_set_in_comparison992 = new BitSet(new long[]{0x0300000040000000L});
	public static final BitSet FOLLOW_set_in_comparison1000 = new BitSet(new long[]{0x0001010000000000L});
	public static final BitSet FOLLOW_set_in_comparison1012 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SCENEC_in_comparison1020 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_comparison1024 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_comparison1026 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_WS_in_comparison1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjectiveSecond1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_remember1076 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_remember1079 = new BitSet(new long[]{0x0800800000000000L});
	public static final BitSet FOLLOW_WS_in_remember1081 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_REMEMBER_in_remember1085 = new BitSet(new long[]{0x4000000080000000L});
	public static final BitSet FOLLOW_set_in_remember1089 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_remember1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_recall1115 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_recall1118 = new BitSet(new long[]{0x0800400000000000L});
	public static final BitSet FOLLOW_WS_in_recall1120 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RECALL_in_recall1124 = new BitSet(new long[]{0x0000000002140000L});
	public static final BitSet FOLLOW_ID_in_recall1126 = new BitSet(new long[]{0x0000000002140000L});
	public static final BitSet FOLLOW_set_in_recall1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_printRule1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_readRule1177 = new BitSet(new long[]{0x0000000000000002L});
}
