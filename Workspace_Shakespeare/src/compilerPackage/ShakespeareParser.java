// $ANTLR 3.5.1 C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-10-04 10:00:39

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
	@Override public String getGrammarFileName() { return "C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }


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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( title )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:6: title
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:50:1: title : ( titlechar )* d= DOT (t= WS )? body ;
	public final void title() throws RecognitionException {
		Token d=null;
		Token t=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:51:2: ( ( titlechar )* d= DOT (t= WS )? body )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: ( titlechar )* d= DOT (t= WS )? body
			{
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: ( titlechar )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: titlechar
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
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:24: (t= WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:24: t= WS
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:1: titlechar : f= ID ;
	public final void titlechar() throws RecognitionException {
		Token f=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:11: (f= ID )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:2: f= ID
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:1: body : ( dramatisPersonae )+ ( acts ( scenes )+ )+ ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:2: ( ( dramatisPersonae )+ ( acts ( scenes )+ )+ )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: ( dramatisPersonae )+ ( acts ( scenes )+ )+
			{
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: ( dramatisPersonae )+
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
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: dramatisPersonae
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

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:6: ( acts ( scenes )+ )+
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
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:7: acts ( scenes )+
					{
					pushFollow(FOLLOW_acts_in_body179);
					acts();
					state._fsp--;

					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:6: ( scenes )+
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
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:6: scenes
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:1: dramatisPersonae : ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:6: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:73:6: ch= CHARACTER co= COMMENT
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:6: ( ACT rn= ID co= COMMENT )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:6: ACT rn= ID co= COMMENT
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( conditionalRule )? ( exitRule | exeuntRule )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( conditionalRule )? ( exitRule | exeuntRule )? )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( conditionalRule )? ( exitRule | exeuntRule )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes362); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes366); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes370); 
			h.checkScene(rn, co);
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: ( enterRule )?
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
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes395);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:6: ( stageEvent )*
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
						else if ( (LA7_3==EOF||LA7_3==ACT||LA7_3==CHARACTER||LA7_3==LB||(LA7_3 >= PRINTASCII && LA7_3 <= PRINTVALUE)||(LA7_3 >= READASCII && LA7_3 <= REMEMBER)||LA7_3==SCENE||LA7_3==THOUART||LA7_3==YOU) ) {
							alt7=1;
						}

					}

				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:6: stageEvent
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

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:6: ( conditionalRule )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==CHARACTER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:6: conditionalRule
					{
					pushFollow(FOLLOW_conditionalRule_in_scenes411);
					conditionalRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:6: ( exitRule | exeuntRule )?
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
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:7: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes420);
					exitRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:6: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_scenes429);
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:1: enterRule : LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:2: ( LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:5: LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB
			{
			match(input,LB,FOLLOW_LB_in_enterRule453); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule455); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:14: (ch1= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CHARACTER) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:15: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule460); 
					}
					break;

			}

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:31: (and= AND ch2= CHARACTER )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:32: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_enterRule467); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule471); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule475); 
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:118:1: exitRule : LB EXIT ch= CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:2: ( LB EXIT ch= CHARACTER RB )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:6: LB EXIT ch= CHARACTER RB
			{
			match(input,LB,FOLLOW_LB_in_exitRule528); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule530); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule534); 
			match(input,RB,FOLLOW_RB_in_exitRule536); 
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:1: exeuntRule : LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:6: ( LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:6: LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB
			{
			match(input,LB,FOLLOW_LB_in_exeuntRule590); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule592); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:16: (ch1= CHARACTER )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CHARACTER) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:17: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule597); 
					}
					break;

			}

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:33: (and= AND ch2= CHARACTER )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AND) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:34: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_exeuntRule604); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule608); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule612); 
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:1: stageEvent : ch= CHARACTER CL ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] | ( WS )? wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatement[ch,wh] | assignmentComparison[ch,wh] | assignmentOperation[ch,wh] ) )* ;
	public final void stageEvent() throws RecognitionException {
		Token ch=null;
		Token wh=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:138:6: (ch= CHARACTER CL ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] | ( WS )? wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatement[ch,wh] | assignmentComparison[ch,wh] | assignmentOperation[ch,wh] ) )* )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:139:6: ch= CHARACTER CL ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] | ( WS )? wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatement[ch,wh] | assignmentComparison[ch,wh] | assignmentOperation[ch,wh] ) )*
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent657); 
			match(input,CL,FOLLOW_CL_in_stageEvent659); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:140:6: ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] | ( WS )? wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatement[ch,wh] | assignmentComparison[ch,wh] | assignmentOperation[ch,wh] ) )*
			loop18:
			while (true) {
				int alt18=6;
				switch ( input.LA(1) ) {
				case REMEMBER:
					{
					alt18=1;
					}
					break;
				case RECALL:
					{
					alt18=2;
					}
					break;
				case PRINTASCII:
				case PRINTVALUE:
					{
					alt18=3;
					}
					break;
				case READASCII:
				case READVALUE:
					{
					alt18=4;
					}
					break;
				case THOUART:
				case WS:
				case YOU:
					{
					alt18=5;
					}
					break;
				}
				switch (alt18) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:6: rememberRule[ch]
					{
					pushFollow(FOLLOW_rememberRule_in_stageEvent673);
					rememberRule(ch);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:8: recallRule[ch]
					{
					pushFollow(FOLLOW_recallRule_in_stageEvent685);
					recallRule(ch);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:8: printRule[ch]
					{
					pushFollow(FOLLOW_printRule_in_stageEvent697);
					printRule(ch);
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:8: readRule[ch]
					{
					pushFollow(FOLLOW_readRule_in_stageEvent708);
					readRule(ch);
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:8: ( WS )? wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatement[ch,wh] | assignmentComparison[ch,wh] | assignmentOperation[ch,wh] )
					{
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:8: ( WS )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==WS) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:8: WS
							{
							match(input,WS,FOLLOW_WS_in_stageEvent720); 
							}
							break;

					}

					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:15: ( YOU ( ARE )? | THOUART )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==YOU) ) {
						alt16=1;
					}
					else if ( (LA16_0==THOUART) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:16: YOU ( ARE )?
							{
							wh=(Token)match(input,YOU,FOLLOW_YOU_in_stageEvent726); 
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:20: ( ARE )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==ARE) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:20: ARE
									{
									wh=(Token)match(input,ARE,FOLLOW_ARE_in_stageEvent728); 
									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:27: THOUART
							{
							wh=(Token)match(input,THOUART,FOLLOW_THOUART_in_stageEvent733); 
							}
							break;

					}

					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:146:7: ( assignmentStatement[ch,wh] | assignmentComparison[ch,wh] | assignmentOperation[ch,wh] )
					int alt17=3;
					switch ( input.LA(1) ) {
					case A:
					case NEGATIVEADJECTIVE:
					case NEGATIVENOUN:
					case NEUTRALADJECTIVE:
					case NEUTRALNOUN:
					case POSITIVEADJECTIVE:
					case POSITIVENOUN:
						{
						alt17=1;
						}
						break;
					case AS:
						{
						alt17=2;
						}
						break;
					case DIFFBET:
					case PRODOF:
					case SUMOF:
						{
						alt17=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:7: assignmentStatement[ch,wh]
							{
							pushFollow(FOLLOW_assignmentStatement_in_stageEvent751);
							assignmentStatement(ch, wh);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:9: assignmentComparison[ch,wh]
							{
							pushFollow(FOLLOW_assignmentComparison_in_stageEvent762);
							assignmentComparison(ch, wh);
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:149:9: assignmentOperation[ch,wh]
							{
							pushFollow(FOLLOW_assignmentOperation_in_stageEvent773);
							assignmentOperation(ch, wh);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop18;
				}
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
	// $ANTLR end "stageEvent"



	// $ANTLR start "assignmentStatement"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:156:1: assignmentStatement[Token ch,Token wh] : ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) ;
	public final void assignmentStatement(Token ch, Token wh) throws RecognitionException {
		Token noun=null;
		Token el=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:157:2: ( ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:2: ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT )
			{
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:2: ( A )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==A) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:2: A
					{
					match(input,A,FOLLOW_A_in_assignmentStatement813); 
					}
					break;

			}

			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:4: ( adjective )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==NEGATIVEADJECTIVE||LA20_0==NEUTRALADJECTIVE||LA20_0==POSITIVEADJECTIVE) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:5: adjective
					{
					pushFollow(FOLLOW_adjective_in_assignmentStatement816);
					adjective();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			noun=input.LT(1);
			if ( input.LA(1)==NEGATIVENOUN||input.LA(1)==NEUTRALNOUN||input.LA(1)==POSITIVENOUN ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			el=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkAssignmentStatement(ch, noun, wh,el);
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
	// $ANTLR end "assignmentStatement"



	// $ANTLR start "assignmentComparison"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:162:1: assignmentComparison[Token ch, Token wh] : ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) el= ( EP | DOT ) ;
	public final void assignmentComparison(Token ch, Token wh) throws RecognitionException {
		Token adj=null;
		Token operationtype=null;
		Token noun1=null;
		Token noun2=null;
		Token el=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:163:2: ( ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) el= ( EP | DOT ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:164:2: ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) el= ( EP | DOT )
			{
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:164:2: ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:164:3: AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
			{
			match(input,AS,FOLLOW_AS_in_assignmentComparison860); 
			adj=input.LT(1);
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,AS,FOLLOW_AS_in_assignmentComparison879); 
			operationtype=input.LT(1);
			if ( input.LA(1)==DIFFBET||input.LA(1)==PRODOF||input.LA(1)==SUMOF ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,A,FOLLOW_A_in_assignmentComparison896); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:167:4: ( adjective )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==NEGATIVEADJECTIVE||LA21_0==NEUTRALADJECTIVE||LA21_0==POSITIVEADJECTIVE) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:167:4: adjective
					{
					pushFollow(FOLLOW_adjective_in_assignmentComparison898);
					adjective();
					state._fsp--;

					}
					break;

				default :
					break loop21;
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
			match(input,AND,FOLLOW_AND_in_assignmentComparison916); 
			match(input,A,FOLLOW_A_in_assignmentComparison918); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:168:8: ( adjectiveSecond )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==NEGATIVEADJECTIVE||LA22_0==NEUTRALADJECTIVE||LA22_0==POSITIVEADJECTIVE) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:168:8: adjectiveSecond
					{
					pushFollow(FOLLOW_adjectiveSecond_in_assignmentComparison920);
					adjectiveSecond();
					state._fsp--;

					}
					break;

				default :
					break loop22;
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
			}

			el=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkAssignmentComparison(ch, noun1, noun2, operationtype,wh,adj,el);
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
	// $ANTLR end "assignmentComparison"



	// $ANTLR start "assignmentOperation"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:172:1: assignmentOperation[Token ch,Token wh] : operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) ;
	public final void assignmentOperation(Token ch, Token wh) throws RecognitionException {
		Token operationtype=null;
		Token noun=null;
		Token el=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:173:2: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:174:2: operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT )
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
			match(input,THYSELF,FOLLOW_THYSELF_in_assignmentOperation977); 
			match(input,AND,FOLLOW_AND_in_assignmentOperation981); 
			match(input,A,FOLLOW_A_in_assignmentOperation983); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:8: ( adjective )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==NEGATIVEADJECTIVE||LA23_0==NEUTRALADJECTIVE||LA23_0==POSITIVEADJECTIVE) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:8: adjective
					{
					pushFollow(FOLLOW_adjective_in_assignmentOperation985);
					adjective();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			noun=input.LT(1);
			if ( input.LA(1)==NEGATIVENOUN||input.LA(1)==NEUTRALNOUN||input.LA(1)==POSITIVENOUN ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			el=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkAssignmentOperation(ch, noun, operationtype,wh,el);
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
	// $ANTLR end "assignmentOperation"



	// $ANTLR start "adjective"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:179:1: adjective : adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjective() throws RecognitionException {
		Token adj=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:180:2: (adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:181:2: adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
			{
			adj=input.LT(1);
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.adjectiveCounter++;
				 h.adjBuilder(adj);
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



	// $ANTLR start "conditionalRule"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:186:1: conditionalRule : ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL gt= ( IFSO | IFNOT ) gt2= ( LETUS | WESHALL | WEMUST ) gt3rs= ( RETURNTO | PROCEEDTO ) gt4= SCENEC rn= ID DOT ;
	public final void conditionalRule() throws RecognitionException {
		Token ch1=null;
		Token ev=null;
		Token ch2=null;
		Token gt=null;
		Token gt2=null;
		Token gt3rs=null;
		Token gt4=null;
		Token rn=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:187:2: (ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL gt= ( IFSO | IFNOT ) gt2= ( LETUS | WESHALL | WEMUST ) gt3rs= ( RETURNTO | PROCEEDTO ) gt4= SCENEC rn= ID DOT )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:188:2: ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL gt= ( IFSO | IFNOT ) gt2= ( LETUS | WESHALL | WEMUST ) gt3rs= ( RETURNTO | PROCEEDTO ) gt4= SCENEC rn= ID DOT
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_conditionalRule1054); 
			match(input,CL,FOLLOW_CL_in_conditionalRule1056); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:188:19: ( WS )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==WS) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:188:19: WS
					{
					match(input,WS,FOLLOW_WS_in_conditionalRule1058); 
					}
					break;

			}

			match(input,AMI,FOLLOW_AMI_in_conditionalRule1062); 
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:5: ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE )
			int alt25=3;
			switch ( input.LA(1) ) {
			case BETTER:
				{
				alt25=1;
				}
				break;
			case AS:
				{
				alt25=2;
				}
				break;
			case WORSE:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:6: BETTER
					{
					ev=(Token)match(input,BETTER,FOLLOW_BETTER_in_conditionalRule1069); 
					}
					break;
				case 2 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:15: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					{
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:15: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:16: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS
					{
					ev=(Token)match(input,AS,FOLLOW_AS_in_conditionalRule1074); 
					ev=input.LT(1);
					if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ev=(Token)match(input,AS,FOLLOW_AS_in_conditionalRule1088); 
					}

					}
					break;
				case 3 :
					// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:84: WORSE
					{
					ev=(Token)match(input,WORSE,FOLLOW_WORSE_in_conditionalRule1093); 
					}
					break;

			}

			match(input,THAN,FOLLOW_THAN_in_conditionalRule1098); 
			match(input,YOUC,FOLLOW_YOUC_in_conditionalRule1100); 
			match(input,QM,FOLLOW_QM_in_conditionalRule1102); 
			ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_conditionalRule1109); 
			match(input,CL,FOLLOW_CL_in_conditionalRule1111); 
			gt=input.LT(1);
			if ( (input.LA(1) >= IFNOT && input.LA(1) <= IFSO) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			gt2=input.LT(1);
			if ( input.LA(1)==LETUS||(input.LA(1) >= WEMUST && input.LA(1) <= WESHALL) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			gt3rs=input.LT(1);
			if ( input.LA(1)==PROCEEDTO||input.LA(1)==RETURNTO ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			gt4=(Token)match(input,SCENEC,FOLLOW_SCENEC_in_conditionalRule1150); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_conditionalRule1154); 
			match(input,DOT,FOLLOW_DOT_in_conditionalRule1156); 
			h.checkConditional(ch1, ev, ch2, gt,gt2,gt3rs,gt4, rn);
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
	// $ANTLR end "conditionalRule"



	// $ANTLR start "adjectiveSecond"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:200:1: adjectiveSecond : adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjectiveSecond() throws RecognitionException {
		Token adj=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:201:2: (adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:202:2: adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
			{
			adj=input.LT(1);
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.adjectiveCounter2++;
				 h.adjBuilder2(adj);
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



	// $ANTLR start "rememberRule"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:207:1: rememberRule[Token ch] : REMEMBER who= ( ME | YOURSELF ) DOT ;
	public final void rememberRule(Token ch) throws RecognitionException {
		Token who=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:208:2: ( REMEMBER who= ( ME | YOURSELF ) DOT )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:210:2: REMEMBER who= ( ME | YOURSELF ) DOT
			{
			match(input,REMEMBER,FOLLOW_REMEMBER_in_rememberRule1206); 
			who=input.LT(1);
			if ( input.LA(1)==ME||input.LA(1)==YOURSELF ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,DOT,FOLLOW_DOT_in_rememberRule1218); 
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
	// $ANTLR end "rememberRule"



	// $ANTLR start "recallRule"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:214:1: recallRule[Token ch] : RECALL DOT ;
	public final void recallRule(Token ch) throws RecognitionException {
		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:215:2: ( RECALL DOT )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:217:2: RECALL DOT
			{
			match(input,RECALL,FOLLOW_RECALL_in_recallRule1237); 
			match(input,DOT,FOLLOW_DOT_in_recallRule1239); 
			h.checkRecall(ch);
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
	// $ANTLR end "recallRule"



	// $ANTLR start "printRule"
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:222:1: printRule[Token ch] : phrase= ( PRINTVALUE | PRINTASCII ) wh= ( DOT | EP ) ;
	public final void printRule(Token ch) throws RecognitionException {
		Token phrase=null;
		Token wh=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:223:2: (phrase= ( PRINTVALUE | PRINTASCII ) wh= ( DOT | EP ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:225:2: phrase= ( PRINTVALUE | PRINTASCII ) wh= ( DOT | EP )
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
			wh=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkPrint(ch, phrase, wh);
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
	// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:231:1: readRule[Token ch] : phrase= ( READVALUE | READASCII ) wh= ( DOT | EP ) ;
	public final void readRule(Token ch) throws RecognitionException {
		Token phrase=null;
		Token wh=null;

		try {
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:232:2: (phrase= ( READVALUE | READASCII ) wh= ( DOT | EP ) )
			// C:\\Users\\UrchinaSfaso\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:234:2: phrase= ( READVALUE | READASCII ) wh= ( DOT | EP )
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
			wh=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkRead(ch, phrase,wh);
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
	public static final BitSet FOLLOW_conditionalRule_in_scenes411 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_exitRule_in_scenes420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule453 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule455 = new BitSet(new long[]{0x0000080000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule460 = new BitSet(new long[]{0x0000080000000080L});
	public static final BitSet FOLLOW_AND_in_enterRule467 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule471 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_enterRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule528 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule530 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule534 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_exitRule536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule590 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule592 = new BitSet(new long[]{0x0000080000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule597 = new BitSet(new long[]{0x0000080000000080L});
	public static final BitSet FOLLOW_AND_in_exeuntRule604 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule608 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent657 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_stageEvent659 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_rememberRule_in_stageEvent673 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_recallRule_in_stageEvent685 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_printRule_in_stageEvent697 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_readRule_in_stageEvent708 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_WS_in_stageEvent720 = new BitSet(new long[]{0x1040000000000000L});
	public static final BitSet FOLLOW_YOU_in_stageEvent726 = new BitSet(new long[]{0x0010023F00010610L});
	public static final BitSet FOLLOW_ARE_in_stageEvent728 = new BitSet(new long[]{0x0010023F00010410L});
	public static final BitSet FOLLOW_THOUART_in_stageEvent733 = new BitSet(new long[]{0x0010023F00010410L});
	public static final BitSet FOLLOW_assignmentStatement_in_stageEvent751 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_assignmentComparison_in_stageEvent762 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_assignmentOperation_in_stageEvent773 = new BitSet(new long[]{0x1840F0C000000002L});
	public static final BitSet FOLLOW_A_in_assignmentStatement813 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjective_in_assignmentStatement816 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentStatement822 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_assignmentStatement836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_assignmentComparison860 = new BitSet(new long[]{0x0000001500000000L});
	public static final BitSet FOLLOW_set_in_assignmentComparison866 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_assignmentComparison879 = new BitSet(new long[]{0x0010020000010000L});
	public static final BitSet FOLLOW_set_in_assignmentComparison883 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_assignmentComparison896 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjective_in_assignmentComparison898 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentComparison903 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_assignmentComparison916 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_assignmentComparison918 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjectiveSecond_in_assignmentComparison920 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentComparison925 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_assignmentComparison940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assignmentOperation965 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THYSELF_in_assignmentOperation977 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_assignmentOperation981 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_assignmentOperation983 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjective_in_assignmentOperation985 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentOperation990 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_assignmentOperation1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjective1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_conditionalRule1054 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_conditionalRule1056 = new BitSet(new long[]{0x0800000000000040L});
	public static final BitSet FOLLOW_WS_in_conditionalRule1058 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AMI_in_conditionalRule1062 = new BitSet(new long[]{0x0400000000000C00L});
	public static final BitSet FOLLOW_BETTER_in_conditionalRule1069 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_AS_in_conditionalRule1074 = new BitSet(new long[]{0x0000001500000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule1076 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_conditionalRule1088 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_WORSE_in_conditionalRule1093 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_THAN_in_conditionalRule1098 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_YOUC_in_conditionalRule1100 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_QM_in_conditionalRule1102 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_conditionalRule1109 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_conditionalRule1111 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule1116 = new BitSet(new long[]{0x0300000040000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule1126 = new BitSet(new long[]{0x0001010000000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule1140 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SCENEC_in_conditionalRule1150 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_conditionalRule1154 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_conditionalRule1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjectiveSecond1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMEMBER_in_rememberRule1206 = new BitSet(new long[]{0x4000000080000000L});
	public static final BitSet FOLLOW_set_in_rememberRule1210 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_rememberRule1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECALL_in_recallRule1237 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_recallRule1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_printRule1261 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_printRule1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_readRule1300 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_readRule1311 = new BitSet(new long[]{0x0000000000000002L});
}
