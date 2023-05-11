// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-11 14:56:46

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "AP", "CHARACTER", "CL", 
		"CM", "DIGIT", "DOT", "ENTER", "EP", "EXEUNT", "EXIT", "FIFTY", "FIVE", 
		"FIVEHUNDRED", "FS", "GOTO", "HUNDREDS", "ID", "INPUTASCII", "INPUTVALUE", 
		"LB", "LETTER", "NEGATIVEADJECTIVE", "NEGATIVENOUN", "NEUTRALADJECTIVE", 
		"NEUTRALNOUN", "ONE", "ONEHUNDRED", "ONETHOUSAND", "OUTPUTASCII", "OUTPUTVALUE", 
		"POSITIVEADJECTIVE", "POSITIVENOUN", "QM", "RB", "SCENE", "TEN", "TENS", 
		"UNITS", "WS"
	};
	public static final int EOF=-1;
	public static final int ACT=4;
	public static final int AP=5;
	public static final int CHARACTER=6;
	public static final int CL=7;
	public static final int CM=8;
	public static final int DIGIT=9;
	public static final int DOT=10;
	public static final int ENTER=11;
	public static final int EP=12;
	public static final int EXEUNT=13;
	public static final int EXIT=14;
	public static final int FIFTY=15;
	public static final int FIVE=16;
	public static final int FIVEHUNDRED=17;
	public static final int FS=18;
	public static final int GOTO=19;
	public static final int HUNDREDS=20;
	public static final int ID=21;
	public static final int INPUTASCII=22;
	public static final int INPUTVALUE=23;
	public static final int LB=24;
	public static final int LETTER=25;
	public static final int NEGATIVEADJECTIVE=26;
	public static final int NEGATIVENOUN=27;
	public static final int NEUTRALADJECTIVE=28;
	public static final int NEUTRALNOUN=29;
	public static final int ONE=30;
	public static final int ONEHUNDRED=31;
	public static final int ONETHOUSAND=32;
	public static final int OUTPUTASCII=33;
	public static final int OUTPUTVALUE=34;
	public static final int POSITIVEADJECTIVE=35;
	public static final int POSITIVENOUN=36;
	public static final int QM=37;
	public static final int RB=38;
	public static final int SCENE=39;
	public static final int TEN=40;
	public static final int TENS=41;
	public static final int UNITS=42;
	public static final int WS=43;

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
			pushFollow(FOLLOW_title_in_parseSPL56);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:33:1: title : ID DOT ( WS )? ( dramatisPersonae )+ acts scenes ;
	public final void title() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:2: ( ID DOT ( WS )? ( dramatisPersonae )+ acts scenes )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:35:2: ID DOT ( WS )? ( dramatisPersonae )+ acts scenes
			{
			System.out.println("* Sto per riconoscere il titolo");
			match(input,ID,FOLLOW_ID_in_title76); 
			match(input,DOT,FOLLOW_DOT_in_title78); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:9: ( WS )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==WS) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:9: WS
					{
					match(input,WS,FOLLOW_WS_in_title80); 
					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:37:2: ( dramatisPersonae )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHARACTER) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:37:2: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_title84);
					dramatisPersonae();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			pushFollow(FOLLOW_acts_in_title89);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_title92);
			scenes();
			state._fsp--;

			System.out.println("    - Ho riconosciuto il titolo");
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



	// $ANTLR start "dramatisPersonae"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:43:1: dramatisPersonae : CHARACTER ( WS )? CM ( WS )? ( ID )* DOT ( WS )? ;
	public final void dramatisPersonae() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:2: ( CHARACTER ( WS )? CM ( WS )? ( ID )* DOT ( WS )? )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:45:2: CHARACTER ( WS )? CM ( WS )? ( ID )* DOT ( WS )?
			{
			System.out.println("* Sto per riconoscere un attore");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae110); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:12: ( WS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:12: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae112); 
					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_dramatisPersonae115); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:19: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==WS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:19: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae117); 
					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:23: ( ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:23: ID
					{
					match(input,ID,FOLLOW_ID_in_dramatisPersonae120); 
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_dramatisPersonae123); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:31: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:31: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae125); 
					}
					break;

			}

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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:52:1: acts : ACT UNITS CL ( ID )* DOT WS ;
	public final void acts() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:2: ( ACT UNITS CL ( ID )* DOT WS )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:2: ACT UNITS CL ( ID )* DOT WS
			{
			match(input,ACT,FOLLOW_ACT_in_acts146); 
			match(input,UNITS,FOLLOW_UNITS_in_acts148); 
			match(input,CL,FOLLOW_CL_in_acts150); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:15: ( ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ID) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:54:15: ID
					{
					match(input,ID,FOLLOW_ID_in_acts152); 
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_acts155); 
			match(input,WS,FOLLOW_WS_in_acts157); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:1: scenes : SCENE UNITS CL ( ID )* DOT WS ;
	public final void scenes() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:8: ( SCENE UNITS CL ( ID )* DOT WS )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:2: SCENE UNITS CL ( ID )* DOT WS
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes170); 
			match(input,UNITS,FOLLOW_UNITS_in_scenes172); 
			match(input,CL,FOLLOW_CL_in_scenes174); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:17: ( ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ID) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:17: ID
					{
					match(input,ID,FOLLOW_ID_in_scenes176); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_scenes179); 
			match(input,WS,FOLLOW_WS_in_scenes181); 
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



	// $ANTLR start "number"
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:1: number : ( UNITS | TENS UNITS | HUNDREDS TENS UNITS );
	public final void number() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:9: ( UNITS | TENS UNITS | HUNDREDS TENS UNITS )
			int alt9=3;
			switch ( input.LA(1) ) {
			case UNITS:
				{
				alt9=1;
				}
				break;
			case TENS:
				{
				alt9=2;
				}
				break;
			case HUNDREDS:
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
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:11: UNITS
					{
					match(input,UNITS,FOLLOW_UNITS_in_number367); 
					}
					break;
				case 2 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:5: TENS UNITS
					{
					match(input,TENS,FOLLOW_TENS_in_number373); 
					match(input,UNITS,FOLLOW_UNITS_in_number375); 
					}
					break;
				case 3 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:5: HUNDREDS TENS UNITS
					{
					match(input,HUNDREDS,FOLLOW_HUNDREDS_in_number381); 
					match(input,TENS,FOLLOW_TENS_in_number383); 
					match(input,UNITS,FOLLOW_UNITS_in_number385); 
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
	// $ANTLR end "number"

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title76 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_title78 = new BitSet(new long[]{0x0000080000000040L});
	public static final BitSet FOLLOW_WS_in_title80 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_dramatisPersonae_in_title84 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_title89 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_scenes_in_title92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae110 = new BitSet(new long[]{0x0000080000000100L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae112 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CM_in_dramatisPersonae115 = new BitSet(new long[]{0x0000080000200400L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae117 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_ID_in_dramatisPersonae120 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_dramatisPersonae123 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts146 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_UNITS_in_acts148 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CL_in_acts150 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_ID_in_acts152 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_acts155 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_WS_in_acts157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes170 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_UNITS_in_scenes172 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CL_in_scenes174 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_ID_in_scenes176 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_scenes179 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_WS_in_scenes181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNITS_in_number367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TENS_in_number373 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_UNITS_in_number375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HUNDREDS_in_number381 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_TENS_in_number383 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_UNITS_in_number385 = new BitSet(new long[]{0x0000000000000002L});
}
