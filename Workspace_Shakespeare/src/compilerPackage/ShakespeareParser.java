// $ANTLR 3.5.1 /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g 2023-09-20 12:22:34

    package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ACT", "AND", "AP", "ARE", 
		"AS", "CHARACTER", "CL", "CM", "COMMENT", "DIFFBET", "DIGIT", "DOT", "ENTER", 
		"EP", "ERROR_TK", "EXEUNT", "EXIT", "FS", "ID", "LB", "LETTER", "NEGATIVEADJECTIVE", 
		"NEGATIVENOUN", "NEUTRALADJECTIVE", "NEUTRALNOUN", "POSITIVEADJECTIVE", 
		"POSITIVENOUN", "PRINTASCII", "PRINTVALUE", "PRODOF", "QM", "RB", "READASCII", 
		"READVALUE", "SCENE", "SUMOF", "THOUART", "THYSELF", "WS", "YOU"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int ACT=5;
	public static final int AND=6;
	public static final int AP=7;
	public static final int ARE=8;
	public static final int AS=9;
	public static final int CHARACTER=10;
	public static final int CL=11;
	public static final int CM=12;
	public static final int COMMENT=13;
	public static final int DIFFBET=14;
	public static final int DIGIT=15;
	public static final int DOT=16;
	public static final int ENTER=17;
	public static final int EP=18;
	public static final int ERROR_TK=19;
	public static final int EXEUNT=20;
	public static final int EXIT=21;
	public static final int FS=22;
	public static final int ID=23;
	public static final int LB=24;
	public static final int LETTER=25;
	public static final int NEGATIVEADJECTIVE=26;
	public static final int NEGATIVENOUN=27;
	public static final int NEUTRALADJECTIVE=28;
	public static final int NEUTRALNOUN=29;
	public static final int POSITIVEADJECTIVE=30;
	public static final int POSITIVENOUN=31;
	public static final int PRINTASCII=32;
	public static final int PRINTVALUE=33;
	public static final int PRODOF=34;
	public static final int QM=35;
	public static final int RB=36;
	public static final int READASCII=37;
	public static final int READVALUE=38;
	public static final int SCENE=39;
	public static final int SUMOF=40;
	public static final int THOUART=41;
	public static final int THYSELF=42;
	public static final int WS=43;
	public static final int YOU=44;

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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:92:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule | exeuntRule )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:93:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule | exeuntRule )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:95:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule | exeuntRule )?
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
					alt7=1;
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

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:100:6: ( exitRule | exeuntRule )?
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LB) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==EXIT) ) {
					alt8=1;
				}
				else if ( (LA8_1==EXEUNT) ) {
					alt8=2;
				}
			}
			switch (alt8) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:100:7: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes412);
					exitRule();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:101:6: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_scenes421);
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:106:1: enterRule : LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:107:2: ( LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:5: LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_enterRule451); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule453); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:14: (ch1= CHARACTER )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CHARACTER) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:15: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule458); 
					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:31: (and= AND ch2= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==AND) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:32: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_enterRule465); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule469); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule473); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:59: ( WS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:109:59: WS
					{
					match(input,WS,FOLLOW_WS_in_enterRule475); 
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:118:1: exitRule : LB EXIT ch= CHARACTER RB ( WS )? ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:119:2: ( LB EXIT ch= CHARACTER RB ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:121:6: LB EXIT ch= CHARACTER RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exitRule529); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule531); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule535); 
			match(input,RB,FOLLOW_RB_in_exitRule537); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:121:30: ( WS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:121:30: WS
					{
					match(input,WS,FOLLOW_WS_in_exitRule539); 
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:128:1: exeuntRule : LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:129:6: ( LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:6: LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exeuntRule594); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule596); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:16: (ch1= CHARACTER )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==CHARACTER) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:17: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule601); 
					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:33: (and= AND ch2= CHARACTER )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==AND) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:34: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_exeuntRule608); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule612); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule616); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:61: ( WS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:131:61: WS
					{
					match(input,WS,FOLLOW_WS_in_exeuntRule618); 
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
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:138:1: stageEvent : (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) ) ;
	public final void stageEvent() throws RecognitionException {
		Token ch1=null;
		Token noun1=null;
		Token operationtype=null;
		Token noun2=null;
		Token noun3=null;
		Token noun4=null;

		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:139:6: ( (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:140:6: (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )
			{
			System.out.println("* I am about to recognize stage events..");
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:141:6: (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:141:7: ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT )
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent673); 
			match(input,CL,FOLLOW_CL_in_stageEvent675); 
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:141:24: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:141:24: WS
					{
					match(input,WS,FOLLOW_WS_in_stageEvent677); 
					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:6: ( YOU ( ARE )? | THOUART )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==YOU) ) {
				alt18=1;
			}
			else if ( (LA18_0==THOUART) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:7: YOU ( ARE )?
					{
					match(input,YOU,FOLLOW_YOU_in_stageEvent686); 
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:11: ( ARE )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARE) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:11: ARE
							{
							match(input,ARE,FOLLOW_ARE_in_stageEvent688); 
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:142:18: THOUART
					{
					match(input,THOUART,FOLLOW_THOUART_in_stageEvent693); 
					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:143:6: ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) )
			int alt23=3;
			switch ( input.LA(1) ) {
			case A:
			case NEGATIVEADJECTIVE:
			case NEGATIVENOUN:
			case NEUTRALADJECTIVE:
			case NEUTRALNOUN:
			case POSITIVEADJECTIVE:
			case POSITIVENOUN:
				{
				alt23=1;
				}
				break;
			case AS:
				{
				alt23=2;
				}
				break;
			case DIFFBET:
			case PRODOF:
			case SUMOF:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:143:7: ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
					{
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:143:7: ( A )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==A) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:143:7: A
							{
							match(input,A,FOLLOW_A_in_stageEvent704); 
							}
							break;

					}

					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:143:9: ( adjective )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==NEGATIVEADJECTIVE||LA20_0==NEUTRALADJECTIVE||LA20_0==POSITIVEADJECTIVE) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:143:10: adjective
							{
							pushFollow(FOLLOW_adjective_in_stageEvent707);
							adjective();
							state._fsp--;

							}
							break;

						default :
							break loop20;
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
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:6: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					{
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:6: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:7: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveSecond )+ noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
					{
					match(input,AS,FOLLOW_AS_in_stageEvent733); 
					if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,AS,FOLLOW_AS_in_stageEvent747); 
					operationtype=input.LT(1);
					if ( input.LA(1)==DIFFBET||input.LA(1)==PRODOF||input.LA(1)==SUMOF ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,A,FOLLOW_A_in_stageEvent763); 
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:116: ( adjectiveSecond )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==NEGATIVEADJECTIVE||LA21_0==NEUTRALADJECTIVE||LA21_0==POSITIVEADJECTIVE) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:144:116: adjectiveSecond
							{
							pushFollow(FOLLOW_adjectiveSecond_in_stageEvent766);
							adjectiveSecond();
							state._fsp--;

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
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
					match(input,AND,FOLLOW_AND_in_stageEvent789); 
					match(input,A,FOLLOW_A_in_stageEvent791); 
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
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:6: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					{
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:6: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:7: operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
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
					match(input,THYSELF,FOLLOW_THYSELF_in_stageEvent829); 
					match(input,AND,FOLLOW_AND_in_stageEvent831); 
					match(input,A,FOLLOW_A_in_stageEvent833); 
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:62: ( adjective )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==NEGATIVEADJECTIVE||LA22_0==NEUTRALADJECTIVE||LA22_0==POSITIVEADJECTIVE) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:146:62: adjective
							{
							pushFollow(FOLLOW_adjective_in_stageEvent835);
							adjective();
							state._fsp--;

							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
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

			h.checkStageEvent(ch1,noun1,noun2,noun3,noun4, operationtype);
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



	// $ANTLR start "adjectiveSecond"
	// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:160:1: adjectiveSecond : ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjectiveSecond() throws RecognitionException {
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:161:2: ( ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:162:2: ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
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

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titlechar_in_title90 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_DOT_in_title95 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_WS_in_title99 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_body_in_title121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_titlechar144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body169 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_acts_in_body179 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_scenes_in_body186 = new BitSet(new long[]{0x0000008000000022L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae221 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts304 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_acts308 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMENT_in_acts312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes362 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_scenes366 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMENT_in_scenes370 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_enterRule_in_scenes395 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_stageEvent_in_scenes403 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_exitRule_in_scenes412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule451 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule453 = new BitSet(new long[]{0x0000001000000440L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule458 = new BitSet(new long[]{0x0000001000000040L});
	public static final BitSet FOLLOW_AND_in_enterRule465 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule469 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RB_in_enterRule473 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_WS_in_enterRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule529 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule531 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule535 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RB_in_exitRule537 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_WS_in_exitRule539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule594 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule596 = new BitSet(new long[]{0x0000001000000440L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule601 = new BitSet(new long[]{0x0000001000000040L});
	public static final BitSet FOLLOW_AND_in_exeuntRule608 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule612 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule616 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_WS_in_exeuntRule618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent673 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CL_in_stageEvent675 = new BitSet(new long[]{0x00001A0000000000L});
	public static final BitSet FOLLOW_WS_in_stageEvent677 = new BitSet(new long[]{0x0000120000000000L});
	public static final BitSet FOLLOW_YOU_in_stageEvent686 = new BitSet(new long[]{0x00000104FC004310L});
	public static final BitSet FOLLOW_ARE_in_stageEvent688 = new BitSet(new long[]{0x00000104FC004210L});
	public static final BitSet FOLLOW_THOUART_in_stageEvent693 = new BitSet(new long[]{0x00000104FC004210L});
	public static final BitSet FOLLOW_A_in_stageEvent704 = new BitSet(new long[]{0x00000000FC000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent707 = new BitSet(new long[]{0x00000000FC000000L});
	public static final BitSet FOLLOW_set_in_stageEvent713 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_AS_in_stageEvent733 = new BitSet(new long[]{0x0000000054000000L});
	public static final BitSet FOLLOW_set_in_stageEvent735 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_AS_in_stageEvent747 = new BitSet(new long[]{0x0000010400004000L});
	public static final BitSet FOLLOW_set_in_stageEvent751 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent763 = new BitSet(new long[]{0x0000000054000000L});
	public static final BitSet FOLLOW_adjectiveSecond_in_stageEvent766 = new BitSet(new long[]{0x00000000FC000000L});
	public static final BitSet FOLLOW_set_in_stageEvent771 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AND_in_stageEvent789 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent791 = new BitSet(new long[]{0x00000000A8000000L});
	public static final BitSet FOLLOW_set_in_stageEvent795 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_set_in_stageEvent817 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_THYSELF_in_stageEvent829 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AND_in_stageEvent831 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent833 = new BitSet(new long[]{0x0000000054000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent835 = new BitSet(new long[]{0x00000000FC000000L});
	public static final BitSet FOLLOW_set_in_stageEvent840 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_set_in_stageEvent859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjective887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjectiveSecond913 = new BitSet(new long[]{0x0000000000000002L});
}
