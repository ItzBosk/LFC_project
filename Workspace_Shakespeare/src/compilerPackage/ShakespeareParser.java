// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-19 09:33:45

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
		"EXIT", "FS", "ID", "INPUTASCII", "INPUTVALUE", "LB", "LETTER", "NEGATIVEADJECTIVE", 
		"NEGATIVENOUN", "NEUTRALADJECTIVE", "NEUTRALNOUN", "OUTPUTASCII", "OUTPUTVALUE", 
		"POSITIVEADJECTIVE", "POSITIVENOUN", "QM", "RB", "SCENE", "WS", "'C'", 
		"'D'", "'I'", "'L'", "'M'", "'V'", "'X'"
	};
	public static final int EOF=-1;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
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
	public static final int INPUTASCII=20;
	public static final int INPUTVALUE=21;
	public static final int LB=22;
	public static final int LETTER=23;
	public static final int NEGATIVEADJECTIVE=24;
	public static final int NEGATIVENOUN=25;
	public static final int NEUTRALADJECTIVE=26;
	public static final int NEUTRALNOUN=27;
	public static final int OUTPUTASCII=28;
	public static final int OUTPUTVALUE=29;
	public static final int POSITIVEADJECTIVE=30;
	public static final int POSITIVENOUN=31;
	public static final int QM=32;
	public static final int RB=33;
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
			pushFollow(FOLLOW_body_in_title128);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:61:1: body : ( dramatisPersonae )+ acts scenes ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:2: ( ( dramatisPersonae )+ acts scenes )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:6: ( dramatisPersonae )+ acts scenes
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:6: ( dramatisPersonae )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:6: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body155);
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

			pushFollow(FOLLOW_acts_in_body164);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body171);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:1: dramatisPersonae :ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:6: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:5: ch= CHARACTER co= COMMENT
			{
			System.out.println("* Sto per riconoscere un attore");
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae203); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae207); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:1: acts : ACT root co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:6: ( ACT root co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:6: ACT root co= COMMENT
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts279); 
			pushFollow(FOLLOW_root_in_acts281);
			root();
			state._fsp--;

			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts285); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:1: scenes : SCENE root co= COMMENT ;
	public final void scenes() throws RecognitionException {
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:88:2: ( SCENE root co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:6: SCENE root co= COMMENT
			{
			System.out.println("* Sto per riconoscere una scena");
			match(input,SCENE,FOLLOW_SCENE_in_scenes329); 
			pushFollow(FOLLOW_root_in_scenes331);
			root();
			state._fsp--;

			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes335); 
			System.out.println("    - Ho riconosciuto una scena");
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:95:1: enterRule : LB ENTER CHARACTER ( AND CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:5: ( LB ENTER CHARACTER ( AND CHARACTER )? RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:97:5: LB ENTER CHARACTER ( AND CHARACTER )? RB
			{
			System.out.println("* Sto per riconoscere un'entrata in scena");
			match(input,LB,FOLLOW_LB_in_enterRule371); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule373); 
			match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule375); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:24: ( AND CHARACTER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==AND) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:25: AND CHARACTER
					{
					match(input,AND,FOLLOW_AND_in_enterRule378); 
					match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule380); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule384); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:1: exitRule : LB EXIT CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:2: ( LB EXIT CHARACTER RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:6: LB EXIT CHARACTER RB
			{
			System.out.println("* Sto per riconoscere un'uscita di scena");
			match(input,LB,FOLLOW_LB_in_exitRule422); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule424); 
			match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule426); 
			match(input,RB,FOLLOW_RB_in_exitRule428); 
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



	// $ANTLR start "multipleExitRule"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:1: multipleExitRule : LB EXEUNT ( CHARACTER AND CHARACTER )? RB ;
	public final void multipleExitRule() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:6: ( LB EXEUNT ( CHARACTER AND CHARACTER )? RB )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:6: LB EXEUNT ( CHARACTER AND CHARACTER )? RB
			{
			System.out.println("* Sto per riconoscere un'uscita di scena multipla");
			match(input,LB,FOLLOW_LB_in_multipleExitRule471); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_multipleExitRule473); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:16: ( CHARACTER AND CHARACTER )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==CHARACTER) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:17: CHARACTER AND CHARACTER
					{
					match(input,CHARACTER,FOLLOW_CHARACTER_in_multipleExitRule476); 
					match(input,AND,FOLLOW_AND_in_multipleExitRule478); 
					match(input,CHARACTER,FOLLOW_CHARACTER_in_multipleExitRule480); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_multipleExitRule484); 
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
	// $ANTLR end "multipleExitRule"



	// $ANTLR start "one"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:1: one : 'I' ;
	public final void one() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:13: ( 'I' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:15: 'I'
			{
			match(input,38,FOLLOW_38_in_one518); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:1: five : 'V' ;
	public final void five() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:13: ( 'V' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:15: 'V'
			{
			match(input,41,FOLLOW_41_in_five532); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:1: ten : 'X' ;
	public final void ten() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:13: ( 'X' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:15: 'X'
			{
			match(input,42,FOLLOW_42_in_ten547); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:1: fifty : 'L' ;
	public final void fifty() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:13: ( 'L' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:15: 'L'
			{
			match(input,39,FOLLOW_39_in_fifty560); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:130:1: oneHundred : 'C' ;
	public final void oneHundred() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:130:13: ( 'C' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:130:15: 'C'
			{
			match(input,36,FOLLOW_36_in_oneHundred568); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:1: fiveHundred : 'D' ;
	public final void fiveHundred() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:13: ( 'D' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:15: 'D'
			{
			match(input,37,FOLLOW_37_in_fiveHundred575); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:1: oneThousand : 'M' ;
	public final void oneThousand() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:13: ( 'M' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:15: 'M'
			{
			match(input,40,FOLLOW_40_in_oneThousand582); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:134:1: root returns [Token tk] : rn= ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? ) ;
	public final Token root() throws RecognitionException {
		Token tk = null;


		Token rn=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:135:6: (rn= ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? ) )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:6: rn= ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:9: ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:10: ( oneThousand )* ( hundreds )? ( tens )? ( units )?
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:10: ( oneThousand )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==40) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:11: oneThousand
					{
					pushFollow(FOLLOW_oneThousand_in_root611);
					oneThousand();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:25: ( hundreds )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= 36 && LA7_0 <= 37)) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:25: hundreds
					{
					pushFollow(FOLLOW_hundreds_in_root615);
					hundreds();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:35: ( tens )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==39||LA8_0==42) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:35: tens
					{
					pushFollow(FOLLOW_tens_in_root618);
					tens();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:41: ( units )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==38||LA9_0==41) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:41: units
					{
					pushFollow(FOLLOW_units_in_root621);
					units();
					state._fsp--;

					}
					break;

			}

			}

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



	// $ANTLR start "units"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:140:1: units : ( one ( ( one )* | five | ten ) | five ( one )* );
	public final void units() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:141:6: ( one ( ( one )* | five | ten ) | five ( one )* )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==38) ) {
				alt13=1;
			}
			else if ( (LA13_0==41) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:6: one ( ( one )* | five | ten )
					{
					pushFollow(FOLLOW_one_in_units652);
					one();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:10: ( ( one )* | five | ten )
					int alt11=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 38:
						{
						alt11=1;
						}
						break;
					case 41:
						{
						alt11=2;
						}
						break;
					case 42:
						{
						alt11=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:11: ( one )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:11: ( one )*
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( (LA10_0==38) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:12: one
									{
									pushFollow(FOLLOW_one_in_units656);
									one();
									state._fsp--;

									}
									break;

								default :
									break loop10;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:20: five
							{
							pushFollow(FOLLOW_five_in_units662);
							five();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:28: ten
							{
							pushFollow(FOLLOW_ten_in_units667);
							ten();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:35: five ( one )*
					{
					pushFollow(FOLLOW_five_in_units672);
					five();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:40: ( one )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==38) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:142:41: one
							{
							pushFollow(FOLLOW_one_in_units675);
							one();
							state._fsp--;

							}
							break;

						default :
							break loop12;
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:146:1: tens : ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* );
	public final void tens() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:147:6: ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==42) ) {
				alt17=1;
			}
			else if ( (LA17_0==39) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:6: ten ( ( ten )* | fifty | oneHundred )
					{
					pushFollow(FOLLOW_ten_in_tens708);
					ten();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:10: ( ( ten )* | fifty | oneHundred )
					int alt15=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 38:
					case 41:
					case 42:
						{
						alt15=1;
						}
						break;
					case 39:
						{
						alt15=2;
						}
						break;
					case 36:
						{
						alt15=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:11: ( ten )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:11: ( ten )*
							loop14:
							while (true) {
								int alt14=2;
								int LA14_0 = input.LA(1);
								if ( (LA14_0==42) ) {
									alt14=1;
								}

								switch (alt14) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:12: ten
									{
									pushFollow(FOLLOW_ten_in_tens712);
									ten();
									state._fsp--;

									}
									break;

								default :
									break loop14;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:20: fifty
							{
							pushFollow(FOLLOW_fifty_in_tens718);
							fifty();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:28: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_tens722);
							oneHundred();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:42: fifty ( ten )*
					{
					pushFollow(FOLLOW_fifty_in_tens727);
					fifty();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:48: ( ten )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==42) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:148:49: ten
							{
							pushFollow(FOLLOW_ten_in_tens730);
							ten();
							state._fsp--;

							}
							break;

						default :
							break loop16;
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:152:1: hundreds : ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* );
	public final void hundreds() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:153:5: ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==36) ) {
				alt21=1;
			}
			else if ( (LA21_0==37) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:5: oneHundred ( ( oneHundred )* | fiveHundred | oneThousand )
					{
					pushFollow(FOLLOW_oneHundred_in_hundreds755);
					oneHundred();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:16: ( ( oneHundred )* | fiveHundred | oneThousand )
					int alt19=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 36:
					case 38:
					case 39:
					case 41:
					case 42:
						{
						alt19=1;
						}
						break;
					case 37:
						{
						alt19=2;
						}
						break;
					case 40:
						{
						alt19=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:17: ( oneHundred )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:17: ( oneHundred )*
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( (LA18_0==36) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:18: oneHundred
									{
									pushFollow(FOLLOW_oneHundred_in_hundreds759);
									oneHundred();
									state._fsp--;

									}
									break;

								default :
									break loop18;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:33: fiveHundred
							{
							pushFollow(FOLLOW_fiveHundred_in_hundreds765);
							fiveHundred();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:47: oneThousand
							{
							pushFollow(FOLLOW_oneThousand_in_hundreds769);
							oneThousand();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:62: fiveHundred ( oneHundred )*
					{
					pushFollow(FOLLOW_fiveHundred_in_hundreds774);
					fiveHundred();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:74: ( oneHundred )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==36) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:154:75: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_hundreds777);
							oneHundred();
							state._fsp--;

							}
							break;

						default :
							break loop20;
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



	public static final BitSet FOLLOW_title_in_parseSPL67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title103 = new BitSet(new long[]{0x0000000000081000L});
	public static final BitSet FOLLOW_DOT_in_title108 = new BitSet(new long[]{0x0000000800000080L});
	public static final BitSet FOLLOW_WS_in_title110 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_body_in_title128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body155 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_acts_in_body164 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae203 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts279 = new BitSet(new long[]{0x000007F000000400L});
	public static final BitSet FOLLOW_root_in_acts281 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_acts285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes329 = new BitSet(new long[]{0x000007F000000400L});
	public static final BitSet FOLLOW_root_in_scenes331 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_scenes335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule371 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule373 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule375 = new BitSet(new long[]{0x0000000200000020L});
	public static final BitSet FOLLOW_AND_in_enterRule378 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule380 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RB_in_enterRule384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule422 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule424 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule426 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RB_in_exitRule428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_multipleExitRule471 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EXEUNT_in_multipleExitRule473 = new BitSet(new long[]{0x0000000200000080L});
	public static final BitSet FOLLOW_CHARACTER_in_multipleExitRule476 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_multipleExitRule478 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_multipleExitRule480 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_RB_in_multipleExitRule484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_one518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_five532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ten547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_fifty560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_oneHundred568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_fiveHundred575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_oneThousand582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_root611 = new BitSet(new long[]{0x000007F000000002L});
	public static final BitSet FOLLOW_hundreds_in_root615 = new BitSet(new long[]{0x000006C000000002L});
	public static final BitSet FOLLOW_tens_in_root618 = new BitSet(new long[]{0x0000024000000002L});
	public static final BitSet FOLLOW_units_in_root621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_in_units652 = new BitSet(new long[]{0x0000064000000002L});
	public static final BitSet FOLLOW_one_in_units656 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_five_in_units662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ten_in_units667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_five_in_units672 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_one_in_units675 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_ten_in_tens708 = new BitSet(new long[]{0x0000049000000002L});
	public static final BitSet FOLLOW_ten_in_tens712 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_fifty_in_tens718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneHundred_in_tens722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fifty_in_tens727 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ten_in_tens730 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds755 = new BitSet(new long[]{0x0000013000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds759 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_hundreds769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds774 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds777 = new BitSet(new long[]{0x0000001000000002L});
}
