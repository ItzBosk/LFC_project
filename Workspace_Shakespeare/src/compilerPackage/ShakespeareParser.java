// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-12 16:15:48

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "AP", "CHARACTER", "CM", 
		"COMMENT", "DIGIT", "DOT", "ENTER", "EP", "EXEUNT", "EXIT", "FS", "GOTO", 
		"ID", "INPUTASCII", "INPUTVALUE", "LB", "LETTER", "NEGATIVEADJECTIVE", 
		"NEGATIVENOUN", "NEUTRALADJECTIVE", "NEUTRALNOUN", "OUTPUTASCII", "OUTPUTVALUE", 
		"POSITIVEADJECTIVE", "POSITIVENOUN", "PP", "QM", "RB", "SCENE", "WS", 
		"'C'", "'D'", "'I'", "'L'", "'M'", "'V'", "'X'"
	};
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int ACT=4;
	public static final int AP=5;
	public static final int CHARACTER=6;
	public static final int CM=7;
	public static final int COMMENT=8;
	public static final int DIGIT=9;
	public static final int DOT=10;
	public static final int ENTER=11;
	public static final int EP=12;
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
	public static final int OUTPUTASCII=26;
	public static final int OUTPUTVALUE=27;
	public static final int POSITIVEADJECTIVE=28;
	public static final int POSITIVENOUN=29;
	public static final int PP=30;
	public static final int QM=31;
	public static final int RB=32;
	public static final int SCENE=33;
	public static final int WS=34;

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






	// $ANTLR start "parseSPL"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:24:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:2: ( title )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:26:2: title
			{
			System.out.println("* Sto per riconoscere un documento Shakespeare");
			pushFollow(FOLLOW_title_in_parseSPL54);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:31:1: title : ( ID )* DOT ( WS )? body ;
	public final void title() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:32:2: ( ( ID )* DOT ( WS )? body )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:33:2: ( ID )* DOT ( WS )? body
			{
			System.out.println("* Sto per riconoscere il titolo");
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:2: ( ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:2: ID
					{
					match(input,ID,FOLLOW_ID_in_title72); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_title75); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:10: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:10: WS
					{
					match(input,WS,FOLLOW_WS_in_title77); 
					}
					break;

			}

			System.out.println("    - Ho riconosciuto il titolo");
			pushFollow(FOLLOW_body_in_title84);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:39:1: body : ( dramatisPersonae )+ acts scenes ;
	public final void body() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:39:6: ( ( dramatisPersonae )+ acts scenes )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:40:2: ( dramatisPersonae )+ acts scenes
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:40:2: ( dramatisPersonae )+
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
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:40:2: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body96);
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

			pushFollow(FOLLOW_acts_in_body101);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body104);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:45:1: dramatisPersonae : CHARACTER COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( CHARACTER COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:2: CHARACTER COMMENT
			{
			System.out.println("* Sto per riconoscere un attore");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae119); 
			match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae121); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:1: acts : ACT root COMMENT ;
	public final void acts() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:2: ( ACT root COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:61:2: ACT root COMMENT
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts153); 
			pushFollow(FOLLOW_root_in_acts155);
			root();
			state._fsp--;

			match(input,COMMENT,FOLLOW_COMMENT_in_acts157); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:1: scenes : SCENE root COMMENT ;
	public final void scenes() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:8: ( SCENE root COMMENT )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:2: SCENE root COMMENT
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes173); 
			pushFollow(FOLLOW_root_in_scenes175);
			root();
			state._fsp--;

			match(input,COMMENT,FOLLOW_COMMENT_in_scenes177); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:1: one : 'I' ;
	public final void one() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:13: ( 'I' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:15: 'I'
			{
			match(input,37,FOLLOW_37_in_one202); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:1: five : 'V' ;
	public final void five() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:13: ( 'V' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:15: 'V'
			{
			match(input,40,FOLLOW_40_in_five216); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:1: ten : 'X' ;
	public final void ten() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:13: ( 'X' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:81:15: 'X'
			{
			match(input,41,FOLLOW_41_in_ten231); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:1: fifty : 'L' ;
	public final void fifty() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:13: ( 'L' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:15: 'L'
			{
			match(input,38,FOLLOW_38_in_fifty244); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:1: oneHundred : 'C' ;
	public final void oneHundred() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:13: ( 'C' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:15: 'C'
			{
			match(input,35,FOLLOW_35_in_oneHundred252); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:1: fiveHundred : 'D' ;
	public final void fiveHundred() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:13: ( 'D' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:15: 'D'
			{
			match(input,36,FOLLOW_36_in_fiveHundred259); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:1: oneThousand : 'M' ;
	public final void oneThousand() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:13: ( 'M' )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:15: 'M'
			{
			match(input,39,FOLLOW_39_in_oneThousand266); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:1: root : ( oneThousand )* ( hundreds )? ( tens )? ( units )? ;
	public final void root() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:7: ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:9: ( oneThousand )* ( hundreds )? ( tens )? ( units )?
			{
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:9: ( oneThousand )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==39) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:10: oneThousand
					{
					pushFollow(FOLLOW_oneThousand_in_root276);
					oneThousand();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:24: ( hundreds )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 35 && LA5_0 <= 36)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:24: hundreds
					{
					pushFollow(FOLLOW_hundreds_in_root280);
					hundreds();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:34: ( tens )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==38||LA6_0==41) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:34: tens
					{
					pushFollow(FOLLOW_tens_in_root283);
					tens();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:40: ( units )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==37||LA7_0==40) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:40: units
					{
					pushFollow(FOLLOW_units_in_root286);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:1: units : ( one ( ( one )* | five | ten ) | five ( one )* );
	public final void units() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:7: ( one ( ( one )* | five | ten ) | five ( one )* )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==37) ) {
				alt11=1;
			}
			else if ( (LA11_0==40) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:9: one ( ( one )* | five | ten )
					{
					pushFollow(FOLLOW_one_in_units296);
					one();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:13: ( ( one )* | five | ten )
					int alt9=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 37:
						{
						alt9=1;
						}
						break;
					case 40:
						{
						alt9=2;
						}
						break;
					case 41:
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
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:14: ( one )*
							{
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:14: ( one )*
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( (LA8_0==37) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:15: one
									{
									pushFollow(FOLLOW_one_in_units300);
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
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:23: five
							{
							pushFollow(FOLLOW_five_in_units306);
							five();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:31: ten
							{
							pushFollow(FOLLOW_ten_in_units311);
							ten();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:38: five ( one )*
					{
					pushFollow(FOLLOW_five_in_units316);
					five();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:43: ( one )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==37) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:44: one
							{
							pushFollow(FOLLOW_one_in_units319);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:1: tens : ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* );
	public final void tens() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:7: ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==41) ) {
				alt15=1;
			}
			else if ( (LA15_0==38) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:9: ten ( ( ten )* | fifty | oneHundred )
					{
					pushFollow(FOLLOW_ten_in_tens332);
					ten();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:13: ( ( ten )* | fifty | oneHundred )
					int alt13=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 37:
					case 40:
					case 41:
						{
						alt13=1;
						}
						break;
					case 38:
						{
						alt13=2;
						}
						break;
					case 35:
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
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:14: ( ten )*
							{
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:14: ( ten )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==41) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:15: ten
									{
									pushFollow(FOLLOW_ten_in_tens336);
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
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:23: fifty
							{
							pushFollow(FOLLOW_fifty_in_tens342);
							fifty();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:31: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_tens346);
							oneHundred();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:45: fifty ( ten )*
					{
					pushFollow(FOLLOW_fifty_in_tens351);
					fifty();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:51: ( ten )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==41) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:93:52: ten
							{
							pushFollow(FOLLOW_ten_in_tens354);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:1: hundreds : ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* );
	public final void hundreds() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:10: ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==35) ) {
				alt19=1;
			}
			else if ( (LA19_0==36) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:12: oneHundred ( ( oneHundred )* | fiveHundred | oneThousand )
					{
					pushFollow(FOLLOW_oneHundred_in_hundreds365);
					oneHundred();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:23: ( ( oneHundred )* | fiveHundred | oneThousand )
					int alt17=3;
					switch ( input.LA(1) ) {
					case COMMENT:
					case 35:
					case 37:
					case 38:
					case 40:
					case 41:
						{
						alt17=1;
						}
						break;
					case 36:
						{
						alt17=2;
						}
						break;
					case 39:
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
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:24: ( oneHundred )*
							{
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:24: ( oneHundred )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( (LA16_0==35) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:25: oneHundred
									{
									pushFollow(FOLLOW_oneHundred_in_hundreds369);
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
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:40: fiveHundred
							{
							pushFollow(FOLLOW_fiveHundred_in_hundreds375);
							fiveHundred();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:54: oneThousand
							{
							pushFollow(FOLLOW_oneThousand_in_hundreds379);
							oneThousand();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:69: fiveHundred ( oneHundred )*
					{
					pushFollow(FOLLOW_fiveHundred_in_hundreds384);
					fiveHundred();
					state._fsp--;

					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:81: ( oneHundred )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==35) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:82: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_hundreds387);
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



	public static final BitSet FOLLOW_title_in_parseSPL54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title72 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_DOT_in_title75 = new BitSet(new long[]{0x0000000400000040L});
	public static final BitSet FOLLOW_WS_in_title77 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_body_in_title84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body96 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_body101 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_scenes_in_body104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae119 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts153 = new BitSet(new long[]{0x000003F800000100L});
	public static final BitSet FOLLOW_root_in_acts155 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_acts157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes173 = new BitSet(new long[]{0x000003F800000100L});
	public static final BitSet FOLLOW_root_in_scenes175 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_scenes177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_one202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_five216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ten231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_fifty244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_oneHundred252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_fiveHundred259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_oneThousand266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_root276 = new BitSet(new long[]{0x000003F800000002L});
	public static final BitSet FOLLOW_hundreds_in_root280 = new BitSet(new long[]{0x0000036000000002L});
	public static final BitSet FOLLOW_tens_in_root283 = new BitSet(new long[]{0x0000012000000002L});
	public static final BitSet FOLLOW_units_in_root286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_in_units296 = new BitSet(new long[]{0x0000032000000002L});
	public static final BitSet FOLLOW_one_in_units300 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_five_in_units306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ten_in_units311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_five_in_units316 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_one_in_units319 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_ten_in_tens332 = new BitSet(new long[]{0x0000024800000002L});
	public static final BitSet FOLLOW_ten_in_tens336 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_fifty_in_tens342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneHundred_in_tens346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fifty_in_tens351 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ten_in_tens354 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds365 = new BitSet(new long[]{0x0000009800000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds369 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_hundreds379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds384 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds387 = new BitSet(new long[]{0x0000000800000002L});
}
