// $ANTLR 3.5.1 D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-14 11:54:21

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
			
			// recuperoil token corrente  
			Token tk = input.LT(1);
			
			// lascio gestire il messaggio all'handler
			h.handleError(tk, hdr, msg);
	  	}

	 	void initParser () {
	 		// passo lo stream di token all'handler 
			h = new Handler(input);
		}



	// $ANTLR start "parseSPL"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:45:1: parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( title )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:2: title
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:52:1: title : ( ID )* DOT ( WS )? body ;
	public final void title() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:2: ( ( ID )* DOT ( WS )? body )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ( ID )* DOT ( WS )? body
			{
			System.out.println("* Sto per riconoscere il titolo");
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:9: ( ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:9: ID
					{
					match(input,ID,FOLLOW_ID_in_title81); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_title84); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:17: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:56:17: WS
					{
					match(input,WS,FOLLOW_WS_in_title86); 
					}
					break;

			}

			System.out.println("    - Ho riconosciuto il titolo");
			pushFollow(FOLLOW_body_in_title94);
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:1: body : ( dramatisPersonae )+ acts scenes ;
	public final void body() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:62:6: ( ( dramatisPersonae )+ acts scenes )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:2: ( dramatisPersonae )+ acts scenes
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:2: ( dramatisPersonae )+
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:63:2: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_body106);
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

			pushFollow(FOLLOW_acts_in_body111);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_body114);
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:68:1: dramatisPersonae : CHARACTER COMMENT ;
	public final void dramatisPersonae() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:69:2: ( CHARACTER COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:70:2: CHARACTER COMMENT
			{
			System.out.println("* Sto per riconoscere un attore");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae129); 
			match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonae131); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:82:1: acts : ACT root COMMENT ;
	public final void acts() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:83:2: ( ACT root COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:84:2: ACT root COMMENT
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts163); 
			pushFollow(FOLLOW_root_in_acts165);
			root();
			state._fsp--;

			match(input,COMMENT,FOLLOW_COMMENT_in_acts167); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:1: scenes : SCENE root COMMENT ;
	public final void scenes() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:8: ( SCENE root COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:2: SCENE root COMMENT
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes183); 
			pushFollow(FOLLOW_root_in_scenes185);
			root();
			state._fsp--;

			match(input,COMMENT,FOLLOW_COMMENT_in_scenes187); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:1: one : 'I' ;
	public final void one() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:13: ( 'I' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:102:15: 'I'
			{
			match(input,38,FOLLOW_38_in_one212); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:1: five : 'V' ;
	public final void five() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:13: ( 'V' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:15: 'V'
			{
			match(input,41,FOLLOW_41_in_five226); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:1: ten : 'X' ;
	public final void ten() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:13: ( 'X' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:15: 'X'
			{
			match(input,42,FOLLOW_42_in_ten241); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:1: fifty : 'L' ;
	public final void fifty() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:13: ( 'L' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:15: 'L'
			{
			match(input,39,FOLLOW_39_in_fifty254); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:1: oneHundred : 'C' ;
	public final void oneHundred() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:13: ( 'C' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:106:15: 'C'
			{
			match(input,36,FOLLOW_36_in_oneHundred262); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:1: fiveHundred : 'D' ;
	public final void fiveHundred() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:13: ( 'D' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:107:15: 'D'
			{
			match(input,37,FOLLOW_37_in_fiveHundred269); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:1: oneThousand : 'M' ;
	public final void oneThousand() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:13: ( 'M' )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:108:15: 'M'
			{
			match(input,40,FOLLOW_40_in_oneThousand276); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:1: root : ( oneThousand )* ( hundreds )? ( tens )? ( units )? ;
	public final void root() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:7: ( ( oneThousand )* ( hundreds )? ( tens )? ( units )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:9: ( oneThousand )* ( hundreds )? ( tens )? ( units )?
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:9: ( oneThousand )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==40) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:10: oneThousand
					{
					pushFollow(FOLLOW_oneThousand_in_root286);
					oneThousand();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:24: ( hundreds )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 36 && LA5_0 <= 37)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:24: hundreds
					{
					pushFollow(FOLLOW_hundreds_in_root290);
					hundreds();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:34: ( tens )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==39||LA6_0==42) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:34: tens
					{
					pushFollow(FOLLOW_tens_in_root293);
					tens();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:40: ( units )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38||LA7_0==41) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:40: units
					{
					pushFollow(FOLLOW_units_in_root296);
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:1: units : ( one ( ( one )* | five | ten ) | five ( one )* );
	public final void units() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:7: ( one ( ( one )* | five | ten ) | five ( one )* )
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:9: one ( ( one )* | five | ten )
					{
					pushFollow(FOLLOW_one_in_units306);
					one();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:13: ( ( one )* | five | ten )
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:14: ( one )*
							{
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:14: ( one )*
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( (LA8_0==38) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:15: one
									{
									pushFollow(FOLLOW_one_in_units310);
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:23: five
							{
							pushFollow(FOLLOW_five_in_units316);
							five();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:31: ten
							{
							pushFollow(FOLLOW_ten_in_units321);
							ten();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:38: five ( one )*
					{
					pushFollow(FOLLOW_five_in_units326);
					five();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:43: ( one )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==38) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:113:44: one
							{
							pushFollow(FOLLOW_one_in_units329);
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:1: tens : ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* );
	public final void tens() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:7: ( ten ( ( ten )* | fifty | oneHundred ) | fifty ( ten )* )
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:9: ten ( ( ten )* | fifty | oneHundred )
					{
					pushFollow(FOLLOW_ten_in_tens342);
					ten();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:13: ( ( ten )* | fifty | oneHundred )
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:14: ( ten )*
							{
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:14: ( ten )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==42) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:15: ten
									{
									pushFollow(FOLLOW_ten_in_tens346);
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:23: fifty
							{
							pushFollow(FOLLOW_fifty_in_tens352);
							fifty();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:31: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_tens356);
							oneHundred();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:45: fifty ( ten )*
					{
					pushFollow(FOLLOW_fifty_in_tens361);
					fifty();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:51: ( ten )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==42) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:116:52: ten
							{
							pushFollow(FOLLOW_ten_in_tens364);
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:1: hundreds : ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* );
	public final void hundreds() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:10: ( oneHundred ( ( oneHundred )* | fiveHundred | oneThousand ) | fiveHundred ( oneHundred )* )
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:12: oneHundred ( ( oneHundred )* | fiveHundred | oneThousand )
					{
					pushFollow(FOLLOW_oneHundred_in_hundreds375);
					oneHundred();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:23: ( ( oneHundred )* | fiveHundred | oneThousand )
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:24: ( oneHundred )*
							{
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:24: ( oneHundred )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( (LA16_0==36) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:25: oneHundred
									{
									pushFollow(FOLLOW_oneHundred_in_hundreds379);
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:40: fiveHundred
							{
							pushFollow(FOLLOW_fiveHundred_in_hundreds385);
							fiveHundred();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:54: oneThousand
							{
							pushFollow(FOLLOW_oneThousand_in_hundreds389);
							oneThousand();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:69: fiveHundred ( oneHundred )*
					{
					pushFollow(FOLLOW_fiveHundred_in_hundreds394);
					fiveHundred();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:81: ( oneHundred )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==36) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:82: oneHundred
							{
							pushFollow(FOLLOW_oneHundred_in_hundreds397);
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
	public static final BitSet FOLLOW_ID_in_title81 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_DOT_in_title84 = new BitSet(new long[]{0x0000000800000040L});
	public static final BitSet FOLLOW_WS_in_title86 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_body_in_title94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonae_in_body106 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_body111 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_scenes_in_body114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae129 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonae131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts163 = new BitSet(new long[]{0x000007F000000100L});
	public static final BitSet FOLLOW_root_in_acts165 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_acts167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes183 = new BitSet(new long[]{0x000007F000000100L});
	public static final BitSet FOLLOW_root_in_scenes185 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_scenes187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_one212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_five226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ten241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_fifty254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_oneHundred262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_fiveHundred269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_oneThousand276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_root286 = new BitSet(new long[]{0x000007F000000002L});
	public static final BitSet FOLLOW_hundreds_in_root290 = new BitSet(new long[]{0x000006C000000002L});
	public static final BitSet FOLLOW_tens_in_root293 = new BitSet(new long[]{0x0000024000000002L});
	public static final BitSet FOLLOW_units_in_root296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_in_units306 = new BitSet(new long[]{0x0000064000000002L});
	public static final BitSet FOLLOW_one_in_units310 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_five_in_units316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ten_in_units321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_five_in_units326 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_one_in_units329 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_ten_in_tens342 = new BitSet(new long[]{0x0000049000000002L});
	public static final BitSet FOLLOW_ten_in_tens346 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_fifty_in_tens352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneHundred_in_tens356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fifty_in_tens361 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ten_in_tens364 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds375 = new BitSet(new long[]{0x0000013000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds379 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneThousand_in_hundreds389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveHundred_in_hundreds394 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_oneHundred_in_hundreds397 = new BitSet(new long[]{0x0000001000000002L});
}
