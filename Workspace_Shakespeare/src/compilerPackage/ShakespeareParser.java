// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-17 16:33:06

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "AP", "CHARACTER", "CM", 
		"COMMENT", "DIGIT", "DOT", "ENTER", "EP", "ERROR_TK", "EXEUNT", "EXIT", 
		"FS", "GOTO", "ID", "INPUTASCII", "INPUTVALUE", "LB", "LETTER", "NEGATIVEADJECTIVE", 
		"NEGATIVENOUN", "NEUTRALADJECTIVE", "NEUTRALNOUN", "OUTPUTASCII", "OUTPUTVALUE", 
		"POSITIVEADJECTIVE", "POSITIVENOUN", "PP", "QM", "RB", "SCENE", "WS", 
		"'C'", "'D'", "'I'", "'L'", "'M'", "'V'", "'X'"
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
	public static final int COMMENT=8;
	public static final int DIGIT=9;
	public static final int DOT=10;
	public static final int ENTER=11;
	public static final int EP=12;
	public static final int ERROR_TK=13;
	public static final int EXEUNT=14;
	public static final int EXIT=15;
	public static final int FS=16;
	public static final int GOTO=17;
	public static final int ID=18;
	public static final int INPUTASCII=19;
	public static final int INPUTVALUE=20;
	public static final int LB=21;
	public static final int LETTER=22;
	public static final int NEGATIVEADJECTIVE=23;
	public static final int NEGATIVENOUN=24;
	public static final int NEUTRALADJECTIVE=25;
	public static final int NEUTRALNOUN=26;
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:1: title : (t= ID )* d= DOT ( WS )? body ;
	public final void title() throws RecognitionException {
		Token t=null;
		Token d=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ( (t= ID )* d= DOT ( WS )? body )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:55:2: (t= ID )* d= DOT ( WS )? body
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:21: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:21: WS
					{
					match(input,WS,FOLLOW_WS_in_title96); 
					}
					break;

			}

			h.checkNullTitle(t, d);
			System.out.println("    - Ho riconosciuto il titolo");
			pushFollow(FOLLOW_body_in_title107);
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
					pushFollow(FOLLOW_dramatisPersonae_in_body119);
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

			pushFollow(FOLLOW_acts_in_body124);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body127);
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:2: (ch= CHARACTER co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:2: ch= CHARACTER co= COMMENT
			{
			System.out.println("* Sto per riconoscere un attore");
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae144); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae148); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:1: acts : ACT root co= COMMENT ;
	public final void acts() throws RecognitionException {
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:2: ( ACT root co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:2: ACT root co= COMMENT
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts182); 
			pushFollow(FOLLOW_root_in_acts184);
			root();
			state._fsp--;

			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_acts188); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:1: scenes : SCENE root co= COMMENT ;
	public final void scenes() throws RecognitionException {
		Token co=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:8: ( SCENE root co= COMMENT )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:2: SCENE root co= COMMENT
			{
			System.out.println("* Sto per riconoscere una scena");
			match(input,SCENE,FOLLOW_SCENE_in_scenes208); 
			pushFollow(FOLLOW_root_in_scenes210);
			root();
			state._fsp--;

			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_scenes214); 
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



	// $ANTLR start "one"
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:1: one : 'I' ;
	public final void one() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:13: ( 'I' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:15: 'I'
			{
			match(input,38,FOLLOW_38_in_one242); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:1: five : 'V' ;
	public final void five() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:13: ( 'V' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:15: 'V'
			{
			match(input,41,FOLLOW_41_in_five256); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:1: ten : 'X' ;
	public final void ten() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:13: ( 'X' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:15: 'X'
			{
			match(input,42,FOLLOW_42_in_ten271); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:1: fifty : 'L' ;
	public final void fifty() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:13: ( 'L' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:15: 'L'
			{
			match(input,39,FOLLOW_39_in_fifty284); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:1: oneHundred : 'C' ;
	public final void oneHundred() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:13: ( 'C' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:109:15: 'C'
			{
			match(input,36,FOLLOW_36_in_oneHundred292); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:1: fiveHundred : 'D' ;
	public final void fiveHundred() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:13: ( 'D' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:15: 'D'
			{
			match(input,37,FOLLOW_37_in_fiveHundred299); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:1: oneThousand : 'M' ;
	public final void oneThousand() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:13: ( 'M' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:15: 'M'
			{
			match(input,40,FOLLOW_40_in_oneThousand306); 
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:1: root returns [Token tk] : rn= ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? ) ;
	public final Token root() throws RecognitionException {
		Token tk = null;


		Token rn=null;

		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:114:2: (rn= ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? ) )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:2: rn= ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:5: ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:6: ( oneThousand )* ( hundreds )? ( tens )? ( units )?
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:6: ( oneThousand )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==40) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:7: oneThousand
					{
					pushFollow(FOLLOW_oneThousand_in_root327);
					oneThousand();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:21: ( hundreds )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 36 && LA5_0 <= 37)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:21: hundreds
					{
					pushFollow(FOLLOW_hundreds_in_root331);
					hundreds();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:31: ( tens )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==39||LA6_0==42) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:31: tens
					{
					pushFollow(FOLLOW_tens_in_root334);
					tens();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:37: ( units )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38||LA7_0==41) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:115:37: units
					{
					pushFollow(FOLLOW_units_in_root337);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:1: units : ( one ( ( one )* | five | ten ) | five ( one )* );
	public final void units() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:2: ( one ( ( one )* | five | ten ) | five ( one )* )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==38) ) {
				alt11=1;
			}
			else if ( (LA11_0==41) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:2: one ( ( one )* | five | ten )
					{
					pushFollow(FOLLOW_one_in_units356);
					one();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:6: ( ( one )* | five | ten )
					int alt9=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 38:
						{
						alt9=1;
						}
						break;
					case 41:
						{
						alt9=2;
						}
						break;
					case 42:
						{
						alt9=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:7: ( one )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:7: ( one )*
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( (LA8_0==38) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:8: one
									{
									pushFollow(FOLLOW_one_in_units360);
									one();
									state._fsp--;

									}
									break;

								default :
									break loop8;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:16: five
							{
							pushFollow(FOLLOW_five_in_units366);
							five();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:24: ten
							{
							pushFollow(FOLLOW_ten_in_units371);
							ten();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:31: five ( one )*
					{
					pushFollow(FOLLOW_five_in_units376);
					five();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:36: ( one )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==38) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:37: one
							{
							pushFollow(FOLLOW_one_in_units379);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:1: tens : ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* );
	public final void tens() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:2: ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==42) ) {
				alt15=1;
			}
			else if ( (LA15_0==39) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:2: ten ( ( ten )* | fifty | oneHundred )
					{
					pushFollow(FOLLOW_ten_in_tens397);
					ten();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:6: ( ( ten )* | fifty | oneHundred )
					int alt13=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 38:
					case 41:
					case 42:
						{
						alt13=1;
						}
						break;
					case 39:
						{
						alt13=2;
						}
						break;
					case 36:
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
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:7: ( ten )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:7: ( ten )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==42) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:8: ten
									{
									pushFollow(FOLLOW_ten_in_tens401);
									ten();
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
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:16: fifty
							{
							pushFollow(FOLLOW_fifty_in_tens407);
							fifty();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:24: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_tens411);
							oneHundred();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:38: fifty ( ten )*
					{
					pushFollow(FOLLOW_fifty_in_tens416);
					fifty();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:44: ( ten )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==42) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:45: ten
							{
							pushFollow(FOLLOW_ten_in_tens419);
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
	// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:131:1: hundreds : ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* );
	public final void hundreds() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:132:2: ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==36) ) {
				alt19=1;
			}
			else if ( (LA19_0==37) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:2: oneHundred ( ( oneHundred )* | fiveHundred | oneThousand )
					{
					pushFollow(FOLLOW_oneHundred_in_hundreds434);
					oneHundred();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:13: ( ( oneHundred )* | fiveHundred | oneThousand )
					int alt17=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 36:
					case 38:
					case 39:
					case 41:
					case 42:
						{
						alt17=1;
						}
						break;
					case 37:
						{
						alt17=2;
						}
						break;
					case 40:
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
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:14: ( oneHundred )*
							{
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:14: ( oneHundred )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( (LA16_0==36) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:15: oneHundred
									{
									pushFollow(FOLLOW_oneHundred_in_hundreds438);
									oneHundred();
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
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:30: fiveHundred
							{
							pushFollow(FOLLOW_fiveHundred_in_hundreds444);
							fiveHundred();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:44: oneThousand
							{
							pushFollow(FOLLOW_oneThousand_in_hundreds448);
							oneThousand();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:59: fiveHundred ( oneHundred )*
					{
					pushFollow(FOLLOW_fiveHundred_in_hundreds453);
					fiveHundred();
					state._fsp--;

					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:71: ( oneHundred )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==36) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:133:72: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_hundreds456);
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
	public static final BitSet FOLLOW_ID_in_title89 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_DOT_in_title94 = new BitSet(new long[]{0x0000000800000040L});
	public static final BitSet FOLLOW_WS_in_title96 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_body_in_title107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body119 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_body124 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae144 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts182 = new BitSet(new long[]{0x000007F000000100L});
	public static final BitSet FOLLOW_root_in_acts184 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_acts188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes208 = new BitSet(new long[]{0x000007F000000100L});
	public static final BitSet FOLLOW_root_in_scenes210 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_scenes214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_one242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_five256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ten271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_fifty284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_oneHundred292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_fiveHundred299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_oneThousand306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_root327 = new BitSet(new long[]{0x000007F000000002L});
	public static final BitSet FOLLOW_hundreds_in_root331 = new BitSet(new long[]{0x000006C000000002L});
	public static final BitSet FOLLOW_tens_in_root334 = new BitSet(new long[]{0x0000024000000002L});
	public static final BitSet FOLLOW_units_in_root337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_in_units356 = new BitSet(new long[]{0x0000064000000002L});
	public static final BitSet FOLLOW_one_in_units360 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_five_in_units366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ten_in_units371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_five_in_units376 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_one_in_units379 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_ten_in_tens397 = new BitSet(new long[]{0x0000049000000002L});
	public static final BitSet FOLLOW_ten_in_tens401 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_fifty_in_tens407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneHundred_in_tens411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fifty_in_tens416 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ten_in_tens419 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds434 = new BitSet(new long[]{0x0000013000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds438 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_hundreds448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds453 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds456 = new BitSet(new long[]{0x0000001000000002L});
}
