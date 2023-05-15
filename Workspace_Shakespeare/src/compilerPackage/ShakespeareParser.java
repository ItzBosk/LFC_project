// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-15 17:51:27

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "AP", "CHARACTER", "CM", 
		"DIGIT", "DOT", "ENTER", "EP", "ERROR_TK", "EXEUNT", "EXIT", "FS", "GOTO", 
		"ID", "INPUTASCII", "INPUTVALUE", "LB", "LETTER", "NEGATIVEADJECTIVE", 
		"NEGATIVENOUN", "NEUTRALADJECTIVE", "NEUTRALNOUN", "NL", "OUTPUTASCII", 
		"OUTPUTVALUE", "POSITIVEADJECTIVE", "POSITIVENOUN", "PP", "QM", "RB", 
		"SCENE", "WS", "'C'", "'D'", "'I'", "'L'", "'M'", "'V'", "'X'"
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
	public static final int AP=5;
	public static final int CHARACTER=6;
	public static final int CM=7;
	public static final int DIGIT=8;
	public static final int DOT=9;
	public static final int ENTER=10;
	public static final int EP=11;
	public static final int ERROR_TK=12;
	public static final int EXEUNT=13;
	public static final int EXIT=14;
	public static final int FS=15;
	public static final int GOTO=16;
	public static final int ID=17;
	public static final int INPUTASCII=18;
	public static final int INPUTVALUE=19;
	public static final int LB=20;
	public static final int LETTER=21;
	public static final int NEGATIVEADJECTIVE=22;
	public static final int NEGATIVENOUN=23;
	public static final int NEUTRALADJECTIVE=24;
	public static final int NEUTRALNOUN=25;
	public static final int NL=26;
	public static final int OUTPUTASCII=27;
	public static final int OUTPUTVALUE=28;
	public static final int POSITIVEADJECTIVE=29;
	public static final int POSITIVENOUN=30;
	public static final int PP=31;
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
			pushFollow(FOLLOW_title_in_parseSPL60);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:1: title : (t= ID )* d= DOT (nl= NL )+ body ;
	public final void title() throws RecognitionException {
		Token t=null;
		Token d=null;
		Token nl=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ( (t= ID )* d= DOT (nl= NL )+ body )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:55:2: (t= ID )* d= DOT (nl= NL )+ body
			{
			System.out.println("* Sto per riconoscere il titolo");
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:10: (t= ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:10: t= ID
					{
					t=(Token)match(input,ID,FOLLOW_ID_in_title89); 
					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_title94); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:23: (nl= NL )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==NL) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:23: nl= NL
					{
					nl=(Token)match(input,NL,FOLLOW_NL_in_title98); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			h.checkNullTitle(t, d, nl);
			System.out.println("    - Ho riconosciuto il titolo");
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:1: body : ( dramatisPersonae )+ acts scenes ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:6: ( ( dramatisPersonae )+ acts scenes )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:2: ( dramatisPersonae )+ acts scenes
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:2: ( dramatisPersonae )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:2: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body121);
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

			pushFollow(FOLLOW_acts_in_body126);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body129);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:1: dramatisPersonae :ch= CHARACTER cm= CM co= ( ID | CHARACTER )+ d= DOT (nl= NL )+ ;
	public final void dramatisPersonae() throws RecognitionException {
		Token ch=null;
		Token cm=null;
		Token co=null;
		Token d=null;
		Token nl=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:2: (ch= CHARACTER cm= CM co= ( ID | CHARACTER )+ d= DOT (nl= NL )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:2: ch= CHARACTER cm= CM co= ( ID | CHARACTER )+ d= DOT (nl= NL )+
			{
			System.out.println("* Sto per riconoscere un attore");
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae146); 
			cm=(Token)match(input,CM,FOLLOW_CM_in_dramatisPersonae150); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:72:24: ( ID | CHARACTER )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CHARACTER||LA4_0==ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( input.LA(1)==CHARACTER||input.LA(1)==ID ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_dramatisPersonae165); 
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:72:50: (nl= NL )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==NL) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:72:50: nl= NL
					{
					nl=(Token)match(input,NL,FOLLOW_NL_in_dramatisPersonae169); 
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			h.checkPersonae(ch, cm, co, d, nl);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:1: acts : ACT root ( ID )+ ;
	public final void acts() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:2: ( ACT root ( ID )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:2: ACT root ( ID )+
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts204); 
			pushFollow(FOLLOW_root_in_acts206);
			root();
			state._fsp--;

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:11: ( ID )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:11: ID
					{
					match(input,ID,FOLLOW_ID_in_acts208); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:1: scenes : SCENE root ( ID )+ ;
	public final void scenes() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:8: ( SCENE root ( ID )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:2: SCENE root ( ID )+
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes225); 
			pushFollow(FOLLOW_root_in_scenes227);
			root();
			state._fsp--;

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:13: ( ID )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ID) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:13: ID
					{
					match(input,ID,FOLLOW_ID_in_scenes229); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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



	// $ANTLR start "one"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:1: one : 'I' ;
	public final void one() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:13: ( 'I' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:15: 'I'
			{
			match(input,38,FOLLOW_38_in_one255); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:1: five : 'V' ;
	public final void five() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:13: ( 'V' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:15: 'V'
			{
			match(input,41,FOLLOW_41_in_five269); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:1: ten : 'X' ;
	public final void ten() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:13: ( 'X' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:15: 'X'
			{
			match(input,42,FOLLOW_42_in_ten284); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:1: fifty : 'L' ;
	public final void fifty() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:13: ( 'L' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:15: 'L'
			{
			match(input,39,FOLLOW_39_in_fifty297); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:1: oneHundred : 'C' ;
	public final void oneHundred() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:13: ( 'C' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:15: 'C'
			{
			match(input,36,FOLLOW_36_in_oneHundred305); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:1: fiveHundred : 'D' ;
	public final void fiveHundred() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:13: ( 'D' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:15: 'D'
			{
			match(input,37,FOLLOW_37_in_fiveHundred312); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:1: oneThousand : 'M' ;
	public final void oneThousand() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:13: ( 'M' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:15: 'M'
			{
			match(input,40,FOLLOW_40_in_oneThousand319); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:1: root : ( oneThousand )* ( hundreds )? ( tens )? ( units )? ;
	public final void root() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:7: ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:9: ( oneThousand )* ( hundreds )? ( tens )? ( units )?
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:9: ( oneThousand )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==40) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:10: oneThousand
					{
					pushFollow(FOLLOW_oneThousand_in_root329);
					oneThousand();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:24: ( hundreds )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= 36 && LA9_0 <= 37)) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:24: hundreds
					{
					pushFollow(FOLLOW_hundreds_in_root333);
					hundreds();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:34: ( tens )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==39||LA10_0==42) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:34: tens
					{
					pushFollow(FOLLOW_tens_in_root336);
					tens();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:40: ( units )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==38||LA11_0==41) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:40: units
					{
					pushFollow(FOLLOW_units_in_root339);
					units();
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
	// $ANTLR end "root"



	// $ANTLR start "units"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:1: units : ( one ( ( one )* | five | ten ) | five ( one )* );
	public final void units() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:7: ( one ( ( one )* | five | ten ) | five ( one )* )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==38) ) {
				alt15=1;
			}
			else if ( (LA15_0==41) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:9: one ( ( one )* | five | ten )
					{
					pushFollow(FOLLOW_one_in_units349);
					one();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:13: ( ( one )* | five | ten )
					int alt13=3;
					switch ( input.LA(1) ) {
					case ID:
					case 38:
						{
						alt13=1;
						}
						break;
					case 41:
						{
						alt13=2;
						}
						break;
					case 42:
						{
						alt13=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:14: ( one )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:14: ( one )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==38) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:15: one
									{
									pushFollow(FOLLOW_one_in_units353);
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
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:23: five
							{
							pushFollow(FOLLOW_five_in_units359);
							five();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:31: ten
							{
							pushFollow(FOLLOW_ten_in_units364);
							ten();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:38: five ( one )*
					{
					pushFollow(FOLLOW_five_in_units369);
					five();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:43: ( one )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==38) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:44: one
							{
							pushFollow(FOLLOW_one_in_units372);
							one();
							state._fsp--;

							}
							break;

						default :
							break loop14;
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:1: tens : ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* );
	public final void tens() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:7: ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==42) ) {
				alt19=1;
			}
			else if ( (LA19_0==39) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:9: ten ( ( ten )* | fifty | oneHundred )
					{
					pushFollow(FOLLOW_ten_in_tens385);
					ten();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:13: ( ( ten )* | fifty | oneHundred )
					int alt17=3;
					switch ( input.LA(1) ) {
					case ID:
					case 38:
					case 41:
					case 42:
						{
						alt17=1;
						}
						break;
					case 39:
						{
						alt17=2;
						}
						break;
					case 36:
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
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:14: ( ten )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:14: ( ten )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( (LA16_0==42) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:15: ten
									{
									pushFollow(FOLLOW_ten_in_tens389);
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
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:23: fifty
							{
							pushFollow(FOLLOW_fifty_in_tens395);
							fifty();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:31: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_tens399);
							oneHundred();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:45: fifty ( ten )*
					{
					pushFollow(FOLLOW_fifty_in_tens404);
					fifty();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:51: ( ten )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==42) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:52: ten
							{
							pushFollow(FOLLOW_ten_in_tens407);
							ten();
							state._fsp--;

							}
							break;

						default :
							break loop18;
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:1: hundreds : ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* );
	public final void hundreds() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:10: ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==36) ) {
				alt23=1;
			}
			else if ( (LA23_0==37) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:12: oneHundred ( ( oneHundred )* | fiveHundred | oneThousand )
					{
					pushFollow(FOLLOW_oneHundred_in_hundreds418);
					oneHundred();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:23: ( ( oneHundred )* | fiveHundred | oneThousand )
					int alt21=3;
					switch ( input.LA(1) ) {
					case ID:
					case 36:
					case 38:
					case 39:
					case 41:
					case 42:
						{
						alt21=1;
						}
						break;
					case 37:
						{
						alt21=2;
						}
						break;
					case 40:
						{
						alt21=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:24: ( oneHundred )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:24: ( oneHundred )*
							loop20:
							while (true) {
								int alt20=2;
								int LA20_0 = input.LA(1);
								if ( (LA20_0==36) ) {
									alt20=1;
								}

								switch (alt20) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:25: oneHundred
									{
									pushFollow(FOLLOW_oneHundred_in_hundreds422);
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
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:40: fiveHundred
							{
							pushFollow(FOLLOW_fiveHundred_in_hundreds428);
							fiveHundred();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:54: oneThousand
							{
							pushFollow(FOLLOW_oneThousand_in_hundreds432);
							oneThousand();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:69: fiveHundred ( oneHundred )*
					{
					pushFollow(FOLLOW_fiveHundred_in_hundreds437);
					fiveHundred();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:81: ( oneHundred )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==36) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:82: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_hundreds440);
							oneHundred();
							state._fsp--;

							}
							break;

						default :
							break loop22;
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



	public static final BitSet FOLLOW_title_in_parseSPL60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title89 = new BitSet(new long[]{0x0000000000020200L});
	public static final BitSet FOLLOW_DOT_in_title94 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_NL_in_title98 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_body_in_title109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body121 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_body126 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae146 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CM_in_dramatisPersonae150 = new BitSet(new long[]{0x0000000000020040L});
	public static final BitSet FOLLOW_DOT_in_dramatisPersonae165 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_NL_in_dramatisPersonae169 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ACT_in_acts204 = new BitSet(new long[]{0x000007F000020000L});
	public static final BitSet FOLLOW_root_in_acts206 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_acts208 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_SCENE_in_scenes225 = new BitSet(new long[]{0x000007F000020000L});
	public static final BitSet FOLLOW_root_in_scenes227 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_scenes229 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_38_in_one255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_five269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ten284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_fifty297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_oneHundred305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_fiveHundred312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_oneThousand319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_root329 = new BitSet(new long[]{0x000007F000000002L});
	public static final BitSet FOLLOW_hundreds_in_root333 = new BitSet(new long[]{0x000006C000000002L});
	public static final BitSet FOLLOW_tens_in_root336 = new BitSet(new long[]{0x0000024000000002L});
	public static final BitSet FOLLOW_units_in_root339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_in_units349 = new BitSet(new long[]{0x0000064000000002L});
	public static final BitSet FOLLOW_one_in_units353 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_five_in_units359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ten_in_units364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_five_in_units369 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_one_in_units372 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_ten_in_tens385 = new BitSet(new long[]{0x0000049000000002L});
	public static final BitSet FOLLOW_ten_in_tens389 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_fifty_in_tens395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneHundred_in_tens399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fifty_in_tens404 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ten_in_tens407 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds418 = new BitSet(new long[]{0x0000013000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds422 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_hundreds432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds437 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds440 = new BitSet(new long[]{0x0000001000000002L});
}
