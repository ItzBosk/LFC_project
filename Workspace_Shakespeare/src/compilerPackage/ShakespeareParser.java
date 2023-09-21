// $ANTLR 3.5.1 D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-21 22:46:54

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
		"IFNOT", "IFSO", "LB", "LETTER", "LETUS", "NEGATIVEADJECTIVE", "NEGATIVENOUN", 
		"NEUTRALADJECTIVE", "NEUTRALNOUN", "POSITIVEADJECTIVE", "POSITIVENOUN", 
		"PRINTASCII", "PRINTVALUE", "PROCEEDTO", "PRODOF", "QM", "RB", "READASCII", 
		"READVALUE", "RETURNTO", "SC", "SCENE", "SCENEC", "SUMOF", "THAN", "THOUART", 
		"THYSELF", "WEMUST", "WESHALL", "WORSE", "WS", "YOU", "YOUC"
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
	public static final int NEGATIVEADJECTIVE=31;
	public static final int NEGATIVENOUN=32;
	public static final int NEUTRALADJECTIVE=33;
	public static final int NEUTRALNOUN=34;
	public static final int POSITIVEADJECTIVE=35;
	public static final int POSITIVENOUN=36;
	public static final int PRINTASCII=37;
	public static final int PRINTVALUE=38;
	public static final int PROCEEDTO=39;
	public static final int PRODOF=40;
	public static final int QM=41;
	public static final int RB=42;
	public static final int READASCII=43;
	public static final int READVALUE=44;
	public static final int RETURNTO=45;
	public static final int SC=46;
	public static final int SCENE=47;
	public static final int SCENEC=48;
	public static final int SUMOF=49;
	public static final int THAN=50;
	public static final int THOUART=51;
	public static final int THYSELF=52;
	public static final int WEMUST=53;
	public static final int WESHALL=54;
	public static final int WORSE=55;
	public static final int WS=56;
	public static final int YOU=57;
	public static final int YOUC=58;

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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( title )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:6: title
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:50:1: title : ( titlechar )* d= DOT (t= WS )? body ;
	public final void title() throws RecognitionException {
		Token d=null;
		Token t=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:51:2: ( ( titlechar )* d= DOT (t= WS )? body )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: ( titlechar )* d= DOT (t= WS )? body
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: ( titlechar )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: titlechar
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
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:24: (t= WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:24: t= WS
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:1: titlechar : f= ID ;
	public final void titlechar() throws RecognitionException {
		Token f=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:11: (f= ID )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:2: f= ID
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:1: body : ( dramatisPersonae )+ ( acts ( scenes )+ )+ ;
	public final void body() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:2: ( ( dramatisPersonae )+ ( acts ( scenes )+ )+ )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: ( dramatisPersonae )+ ( acts ( scenes )+ )+
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: ( dramatisPersonae )+
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:6: dramatisPersonae
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

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:6: ( acts ( scenes )+ )+
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:7: acts ( scenes )+
					{
					pushFollow(FOLLOW_acts_in_body179);
					acts();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:6: ( scenes )+
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:6: scenes
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:1: dramatisPersonae : ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:6: (ch= CHARACTER co= COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:73:6: ch= CHARACTER co= COMMENT
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:6: ( ACT rn= ID co= COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:6: ACT rn= ID co= COMMENT
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( comparison )? ( exitRule | exeuntRule )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( comparison )? ( exitRule | exeuntRule )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( comparison )? ( exitRule | exeuntRule )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes362); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes366); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes370); 
			h.checkScene(rn, co);
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: ( enterRule )?
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes395);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:6: ( stageEvent )*
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
						else if ( (LA7_3==THOUART||LA7_3==YOU) ) {
							alt7=1;
						}

					}

				}

				switch (alt7) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:99:6: stageEvent
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

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:6: ( comparison )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==CHARACTER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:100:6: comparison
					{
					pushFollow(FOLLOW_comparison_in_scenes411);
					comparison();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:6: ( exitRule | exeuntRule )?
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:7: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes420);
					exitRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:6: exeuntRule
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:1: enterRule : LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:2: ( LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:5: LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_enterRule459); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule461); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:14: (ch1= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CHARACTER) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:15: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule466); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:31: (and= AND ch2= CHARACTER )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:32: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_enterRule473); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule477); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule481); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:59: ( WS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:59: WS
					{
					match(input,WS,FOLLOW_WS_in_enterRule483); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:1: exitRule : LB EXIT ch= CHARACTER RB ( WS )? ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:2: ( LB EXIT ch= CHARACTER RB ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:6: LB EXIT ch= CHARACTER RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exitRule537); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule539); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule543); 
			match(input,RB,FOLLOW_RB_in_exitRule545); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:30: ( WS )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==WS) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:30: WS
					{
					match(input,WS,FOLLOW_WS_in_exitRule547); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:1: exeuntRule : LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:130:6: ( LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:6: LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exeuntRule602); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule604); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:16: (ch1= CHARACTER )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==CHARACTER) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:17: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule609); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:33: (and= AND ch2= CHARACTER )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==AND) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:34: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_exeuntRule616); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule620); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule624); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:61: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:61: WS
					{
					match(input,WS,FOLLOW_WS_in_exeuntRule626); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:139:1: stageEvent : (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) ) ;
	public final void stageEvent() throws RecognitionException {
		Token ch1=null;
		Token noun1=null;
		Token operationtype=null;
		Token noun2=null;
		Token noun3=null;
		Token noun4=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:140:6: ( (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:6: (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:6: (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:7: ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) ) ( EP | DOT )
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent674); 
			match(input,CL,FOLLOW_CL_in_stageEvent676); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:24: ( WS )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==WS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:24: WS
					{
					match(input,WS,FOLLOW_WS_in_stageEvent678); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:6: ( YOU ( ARE )? | THOUART )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==YOU) ) {
				alt19=1;
			}
			else if ( (LA19_0==THOUART) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:7: YOU ( ARE )?
					{
					match(input,YOU,FOLLOW_YOU_in_stageEvent688); 
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:11: ( ARE )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ARE) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:11: ARE
							{
							match(input,ARE,FOLLOW_ARE_in_stageEvent690); 
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:18: THOUART
					{
					match(input,THOUART,FOLLOW_THOUART_in_stageEvent695); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:6: ( ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) | (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) )
			int alt25=3;
			switch ( input.LA(1) ) {
			case A:
			case NEGATIVEADJECTIVE:
			case NEGATIVENOUN:
			case NEUTRALADJECTIVE:
			case NEUTRALNOUN:
			case POSITIVEADJECTIVE:
			case POSITIVENOUN:
				{
				alt25=1;
				}
				break;
			case AS:
				{
				alt25=2;
				}
				break;
			case DIFFBET:
			case PRODOF:
			case SUMOF:
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:7: ( A )? ( adjective )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
					{
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:7: ( A )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==A) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:7: A
							{
							match(input,A,FOLLOW_A_in_stageEvent706); 
							}
							break;

					}

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:9: ( adjective )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==NEGATIVEADJECTIVE||LA21_0==NEUTRALADJECTIVE||LA21_0==POSITIVEADJECTIVE) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:10: adjective
							{
							pushFollow(FOLLOW_adjective_in_stageEvent709);
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
					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:6: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					{
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:6: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:7: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjective )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecond )* noun3= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
					{
					match(input,AS,FOLLOW_AS_in_stageEvent735); 
					if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,AS,FOLLOW_AS_in_stageEvent749); 
					operationtype=input.LT(1);
					if ( input.LA(1)==DIFFBET||input.LA(1)==PRODOF||input.LA(1)==SUMOF ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,A,FOLLOW_A_in_stageEvent765); 
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:116: ( adjective )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==NEGATIVEADJECTIVE||LA22_0==NEUTRALADJECTIVE||LA22_0==POSITIVEADJECTIVE) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:116: adjective
							{
							pushFollow(FOLLOW_adjective_in_stageEvent768);
							adjective();
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
					match(input,AND,FOLLOW_AND_in_stageEvent791); 
					match(input,A,FOLLOW_A_in_stageEvent793); 
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:146:12: ( adjectiveSecond )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==NEGATIVEADJECTIVE||LA23_0==NEUTRALADJECTIVE||LA23_0==POSITIVEADJECTIVE) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:146:12: adjectiveSecond
							{
							pushFollow(FOLLOW_adjectiveSecond_in_stageEvent795);
							adjectiveSecond();
							state._fsp--;

							}
							break;

						default :
							break loop23;
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:6: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					{
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:6: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:7: operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjective )+ noun4= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
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
					match(input,THYSELF,FOLLOW_THYSELF_in_stageEvent834); 
					match(input,AND,FOLLOW_AND_in_stageEvent836); 
					match(input,A,FOLLOW_A_in_stageEvent838); 
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:62: ( adjective )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==NEGATIVEADJECTIVE||LA24_0==NEUTRALADJECTIVE||LA24_0==POSITIVEADJECTIVE) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:62: adjective
							{
							pushFollow(FOLLOW_adjective_in_stageEvent840);
							adjective();
							state._fsp--;

							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:152:1: adjective : ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjective() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:153:2: ( ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:2: ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:160:1: adjectiveSecond : ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjectiveSecond() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:161:2: ( ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:162:2: ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
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



	// $ANTLR start "comparison"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:167:1: comparison : ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL ( WS )? gt= ( IFSO | IFNOT ) ( LETUS | WESHALL | WEMUST ) ( RETURNTO | PROCEEDTO ) SCENEC rn= ID DOT ( WS )? ;
	public final void comparison() throws RecognitionException {
		Token ch1=null;
		Token ev=null;
		Token ch2=null;
		Token gt=null;
		Token rn=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:168:2: (ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL ( WS )? gt= ( IFSO | IFNOT ) ( LETUS | WESHALL | WEMUST ) ( RETURNTO | PROCEEDTO ) SCENEC rn= ID DOT ( WS )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:169:2: ch1= CHARACTER CL ( WS )? AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL ( WS )? gt= ( IFSO | IFNOT ) ( LETUS | WESHALL | WEMUST ) ( RETURNTO | PROCEEDTO ) SCENEC rn= ID DOT ( WS )?
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_comparison943); 
			match(input,CL,FOLLOW_CL_in_comparison945); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:169:19: ( WS )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==WS) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:169:19: WS
					{
					match(input,WS,FOLLOW_WS_in_comparison947); 
					}
					break;

			}

			match(input,AMI,FOLLOW_AMI_in_comparison951); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:5: ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE )
			int alt27=3;
			switch ( input.LA(1) ) {
			case BETTER:
				{
				alt27=1;
				}
				break;
			case AS:
				{
				alt27=2;
				}
				break;
			case WORSE:
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:6: BETTER
					{
					ev=(Token)match(input,BETTER,FOLLOW_BETTER_in_comparison958); 
					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:15: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					{
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:15: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:16: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS
					{
					ev=(Token)match(input,AS,FOLLOW_AS_in_comparison963); 
					ev=input.LT(1);
					if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ev=(Token)match(input,AS,FOLLOW_AS_in_comparison977); 
					}

					}
					break;
				case 3 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:84: WORSE
					{
					ev=(Token)match(input,WORSE,FOLLOW_WORSE_in_comparison982); 
					}
					break;

			}

			match(input,THAN,FOLLOW_THAN_in_comparison987); 
			match(input,YOUC,FOLLOW_YOUC_in_comparison989); 
			match(input,QM,FOLLOW_QM_in_comparison991); 
			ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_comparison998); 
			match(input,CL,FOLLOW_CL_in_comparison1000); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:174:19: ( WS )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==WS) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:174:19: WS
					{
					match(input,WS,FOLLOW_WS_in_comparison1002); 
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
			match(input,SCENEC,FOLLOW_SCENEC_in_comparison1036); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_comparison1040); 
			match(input,DOT,FOLLOW_DOT_in_comparison1042); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:87: ( WS )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==WS) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:87: WS
					{
					match(input,WS,FOLLOW_WS_in_comparison1044); 
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

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titlechar_in_title90 = new BitSet(new long[]{0x0000000002040000L});
	public static final BitSet FOLLOW_DOT_in_title95 = new BitSet(new long[]{0x0100000000001000L});
	public static final BitSet FOLLOW_WS_in_title99 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_body_in_title121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_titlechar144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body169 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_acts_in_body179 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_scenes_in_body186 = new BitSet(new long[]{0x0000800000000022L});
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
	public static final BitSet FOLLOW_comparison_in_scenes411 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_exitRule_in_scenes420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule459 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule461 = new BitSet(new long[]{0x0000040000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule466 = new BitSet(new long[]{0x0000040000000080L});
	public static final BitSet FOLLOW_AND_in_enterRule473 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule477 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RB_in_enterRule481 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_WS_in_enterRule483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule537 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule539 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule543 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RB_in_exitRule545 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_WS_in_exitRule547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule602 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule604 = new BitSet(new long[]{0x0000040000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule609 = new BitSet(new long[]{0x0000040000000080L});
	public static final BitSet FOLLOW_AND_in_exeuntRule616 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule620 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule624 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_WS_in_exeuntRule626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent674 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_stageEvent676 = new BitSet(new long[]{0x0308000000000000L});
	public static final BitSet FOLLOW_WS_in_stageEvent678 = new BitSet(new long[]{0x0208000000000000L});
	public static final BitSet FOLLOW_YOU_in_stageEvent688 = new BitSet(new long[]{0x0002011F80010610L});
	public static final BitSet FOLLOW_ARE_in_stageEvent690 = new BitSet(new long[]{0x0002011F80010410L});
	public static final BitSet FOLLOW_THOUART_in_stageEvent695 = new BitSet(new long[]{0x0002011F80010410L});
	public static final BitSet FOLLOW_A_in_stageEvent706 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent709 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_set_in_stageEvent715 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_AS_in_stageEvent735 = new BitSet(new long[]{0x0000000A80000000L});
	public static final BitSet FOLLOW_set_in_stageEvent737 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_stageEvent749 = new BitSet(new long[]{0x0002010000010000L});
	public static final BitSet FOLLOW_set_in_stageEvent753 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent765 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent768 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_set_in_stageEvent773 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_stageEvent791 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent793 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_adjectiveSecond_in_stageEvent795 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_set_in_stageEvent800 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_stageEvent822 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_THYSELF_in_stageEvent834 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_stageEvent836 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_stageEvent838 = new BitSet(new long[]{0x0000000A80000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent840 = new BitSet(new long[]{0x0000001F80000000L});
	public static final BitSet FOLLOW_set_in_stageEvent845 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_stageEvent864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjective886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjectiveSecond913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_comparison943 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_comparison945 = new BitSet(new long[]{0x0100000000000040L});
	public static final BitSet FOLLOW_WS_in_comparison947 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AMI_in_comparison951 = new BitSet(new long[]{0x0080000000000C00L});
	public static final BitSet FOLLOW_BETTER_in_comparison958 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_AS_in_comparison963 = new BitSet(new long[]{0x0000000A80000000L});
	public static final BitSet FOLLOW_set_in_comparison965 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_comparison977 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_WORSE_in_comparison982 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_THAN_in_comparison987 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_YOUC_in_comparison989 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_QM_in_comparison991 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_comparison998 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_comparison1000 = new BitSet(new long[]{0x010000000C000000L});
	public static final BitSet FOLLOW_WS_in_comparison1002 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_set_in_comparison1008 = new BitSet(new long[]{0x0060000040000000L});
	public static final BitSet FOLLOW_set_in_comparison1016 = new BitSet(new long[]{0x0000208000000000L});
	public static final BitSet FOLLOW_set_in_comparison1028 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SCENEC_in_comparison1036 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_comparison1040 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_comparison1042 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_WS_in_comparison1044 = new BitSet(new long[]{0x0000000000000002L});
}
