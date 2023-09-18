// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-18 16:28:57

    package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ACT", "AND", "AP", "ARE", 
		"AS", "CHARACTER", "CL", "CM", "COMMENT", "DIFF", "DIGIT", "DOT", "ENTER", 
		"EP", "ERROR_TK", "EXEUNT", "EXIT", "FS", "ID", "LB", "LETTER", "NEGATIVEADJECTIVE", 
		"NEGATIVENOUN", "NEUTRALADJECTIVE", "NEUTRALNOUN", "POSITIVEADJECTIVE", 
		"POSITIVENOUN", "PRINTASCII", "PRINTVALUE", "QM", "RB", "READASCII", "READVALUE", 
		"SCENE", "SUMOF", "THOUART", "WS", "YOU"
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
	public static final int DIFF=14;
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
	public static final int QM=34;
	public static final int RB=35;
	public static final int READASCII=36;
	public static final int READVALUE=37;
	public static final int SCENE=38;
	public static final int SUMOF=39;
	public static final int THOUART=40;
	public static final int WS=41;
	public static final int YOU=42;

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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:1: title : ( titlechar )* d= DOT (t= WS )? body ;
	public final void title() throws RecognitionException {
		Token d=null;
		Token t=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ( ( titlechar )* d= DOT (t= WS )? body )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:6: ( titlechar )* d= DOT (t= WS )? body
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:6: ( titlechar )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:6: titlechar
					{
					pushFollow(FOLLOW_titlechar_in_title107);
					titlechar();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title112); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:24: (t= WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:24: t= WS
					{
					t=(Token)match(input,WS,FOLLOW_WS_in_title116); 
					}
					break;

			}

			h.checkTitle(d);
			pushFollow(FOLLOW_body_in_title138);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:1: titlechar : f= ID ;
	public final void titlechar() throws RecognitionException {
		Token f=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:11: (f= ID )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:2: f= ID
			{
			f=(Token)match(input,ID,FOLLOW_ID_in_titlechar161); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:1: body : ( dramatisPersonae )+ ( acts ( scenes )+ )+ ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:2: ( ( dramatisPersonae )+ ( acts ( scenes )+ )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:6: ( dramatisPersonae )+ ( acts ( scenes )+ )+
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:6: ( dramatisPersonae )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:6: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body186);
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

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:6: ( acts ( scenes )+ )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:7: acts ( scenes )+
					{
					pushFollow(FOLLOW_acts_in_body196);
					acts();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:6: ( scenes )+
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
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:6: scenes
							{
							pushFollow(FOLLOW_scenes_in_body203);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:73:1: dramatisPersonae : ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:74:6: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:76:6: ch= CHARACTER co= COMMENT
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae238); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae242); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:1: acts : ACT rn= ID co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:88:6: ( ACT rn= ID co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:6: ACT rn= ID co= COMMENT
			{
			match(input,ACT,FOLLOW_ACT_in_acts321); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_acts325); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts329); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:1: scenes : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule | exeuntRule )? ;
	public final void scenes() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule | exeuntRule )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEvent )* ( exitRule | exeuntRule )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes379); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_scenes383); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes387); 
			h.checkScene(rn, co);
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:6: ( enterRule )?
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:101:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_scenes412);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:6: ( stageEvent )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CHARACTER) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:6: stageEvent
					{
					pushFollow(FOLLOW_stageEvent_in_scenes420);
					stageEvent();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:6: ( exitRule | exeuntRule )?
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:7: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_scenes429);
					exitRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:6: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_scenes438);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:1: enterRule : LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:2: ( LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:5: LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_enterRule468); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule470); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:14: (ch1= CHARACTER )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CHARACTER) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:15: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule475); 
					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:31: (and= AND ch2= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==AND) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:32: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_enterRule482); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule486); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule490); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:59: ( WS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:59: WS
					{
					match(input,WS,FOLLOW_WS_in_enterRule492); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:1: exitRule : LB EXIT ch= CHARACTER RB ( WS )? ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:2: ( LB EXIT ch= CHARACTER RB ( WS )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:124:6: LB EXIT ch= CHARACTER RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exitRule546); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule548); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule552); 
			match(input,RB,FOLLOW_RB_in_exitRule554); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:124:30: ( WS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:124:30: WS
					{
					match(input,WS,FOLLOW_WS_in_exitRule556); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:1: exeuntRule : LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:6: ( LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:6: LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ( WS )?
			{
			match(input,LB,FOLLOW_LB_in_exeuntRule611); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule613); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:16: (ch1= CHARACTER )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==CHARACTER) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:17: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule618); 
					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:33: (and= AND ch2= CHARACTER )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==AND) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:34: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_exeuntRule625); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule629); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule633); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:61: ( WS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:61: WS
					{
					match(input,WS,FOLLOW_WS_in_exeuntRule635); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:140:1: stageEvent : (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) EP ) ;
	public final void stageEvent() throws RecognitionException {
		Token ch1=null;
		Token noun=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:2: ( (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) EP ) )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:2: (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) EP )
			{
			System.out.println("* I am about to recognize stage events..");
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:2: (ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) EP )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:3: ch1= CHARACTER CL ( WS )? ( YOU ( ARE )? | THOUART ) ( A )? ( adjective )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) EP
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEvent677); 
			match(input,CL,FOLLOW_CL_in_stageEvent679); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:20: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:20: WS
					{
					match(input,WS,FOLLOW_WS_in_stageEvent681); 
					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:2: ( YOU ( ARE )? | THOUART )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:3: YOU ( ARE )?
					{
					match(input,YOU,FOLLOW_YOU_in_stageEvent686); 
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:7: ( ARE )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARE) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:7: ARE
							{
							match(input,ARE,FOLLOW_ARE_in_stageEvent688); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:14: THOUART
					{
					match(input,THOUART,FOLLOW_THOUART_in_stageEvent693); 
					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:24: ( A )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==A) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:24: A
					{
					match(input,A,FOLLOW_A_in_stageEvent697); 
					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:2: ( adjective )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==NEGATIVEADJECTIVE||LA20_0==NEUTRALADJECTIVE||LA20_0==POSITIVEADJECTIVE) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:3: adjective
					{
					pushFollow(FOLLOW_adjective_in_stageEvent704);
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
			match(input,EP,FOLLOW_EP_in_stageEvent722); 
			}

			h.checkStageEvent(ch1, noun);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:151:1: adjective : ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjective() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:152:2: ( ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:153:2: ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
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

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titlechar_in_title107 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_DOT_in_title112 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_WS_in_title116 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_body_in_title138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_titlechar161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body186 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_acts_in_body196 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_scenes_in_body203 = new BitSet(new long[]{0x0000004000000022L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae238 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts321 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_acts325 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMENT_in_acts329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes379 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_scenes383 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMENT_in_scenes387 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_enterRule_in_scenes412 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_stageEvent_in_scenes420 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_exitRule_in_scenes429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exeuntRule_in_scenes438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule468 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule470 = new BitSet(new long[]{0x0000000800000440L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule475 = new BitSet(new long[]{0x0000000800000040L});
	public static final BitSet FOLLOW_AND_in_enterRule482 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule486 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RB_in_enterRule490 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_WS_in_enterRule492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule546 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule548 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule552 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RB_in_exitRule554 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_WS_in_exitRule556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule611 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule613 = new BitSet(new long[]{0x0000000800000440L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule618 = new BitSet(new long[]{0x0000000800000040L});
	public static final BitSet FOLLOW_AND_in_exeuntRule625 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule629 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule633 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_WS_in_exeuntRule635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEvent677 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CL_in_stageEvent679 = new BitSet(new long[]{0x0000070000000000L});
	public static final BitSet FOLLOW_WS_in_stageEvent681 = new BitSet(new long[]{0x0000050000000000L});
	public static final BitSet FOLLOW_YOU_in_stageEvent686 = new BitSet(new long[]{0x00000000FC000110L});
	public static final BitSet FOLLOW_ARE_in_stageEvent688 = new BitSet(new long[]{0x00000000FC000010L});
	public static final BitSet FOLLOW_THOUART_in_stageEvent693 = new BitSet(new long[]{0x00000000FC000010L});
	public static final BitSet FOLLOW_A_in_stageEvent697 = new BitSet(new long[]{0x00000000FC000000L});
	public static final BitSet FOLLOW_adjective_in_stageEvent704 = new BitSet(new long[]{0x00000000FC000000L});
	public static final BitSet FOLLOW_set_in_stageEvent710 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EP_in_stageEvent722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjective745 = new BitSet(new long[]{0x0000000000000002L});
}
