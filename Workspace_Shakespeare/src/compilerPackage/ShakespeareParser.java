// $ANTLR 3.5.1 C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-11 15:23:58

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
		"NEUTRALNOUN", "NUMBER", "ONE", "ONEHUNDRED", "ONETHOUSAND", "OUTPUTASCII", 
		"OUTPUTVALUE", "POSITIVEADJECTIVE", "POSITIVENOUN", "QM", "RB", "SCENE", 
		"TEN", "TENS", "UNITS", "WS"
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
	public static final int NUMBER=30;
	public static final int ONE=31;
	public static final int ONEHUNDRED=32;
	public static final int ONETHOUSAND=33;
	public static final int OUTPUTASCII=34;
	public static final int OUTPUTVALUE=35;
	public static final int POSITIVEADJECTIVE=36;
	public static final int POSITIVENOUN=37;
	public static final int QM=38;
	public static final int RB=39;
	public static final int SCENE=40;
	public static final int TEN=41;
	public static final int TENS=42;
	public static final int UNITS=43;
	public static final int WS=44;

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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:33:1: title : ( ID )+ DOT ( WS )? ( dramatisPersonae )+ acts scenes ;
	public final void title() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:2: ( ( ID )+ DOT ( WS )? ( dramatisPersonae )+ acts scenes )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:35:2: ( ID )+ DOT ( WS )? ( dramatisPersonae )+ acts scenes
			{
			System.out.println("* Sto per riconoscere il titolo");
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:2: ( ID )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:2: ID
					{
					match(input,ID,FOLLOW_ID_in_title76); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,DOT,FOLLOW_DOT_in_title79); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:10: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:10: WS
					{
					match(input,WS,FOLLOW_WS_in_title81); 
					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:37:2: ( dramatisPersonae )+
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
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:37:2: dramatisPersonae
					{
					pushFollow(FOLLOW_dramatisPersonae_in_title85);
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

			pushFollow(FOLLOW_acts_in_title90);
			acts();
			state._fsp--;

			pushFollow(FOLLOW_scenes_in_title93);
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:43:1: dramatisPersonae : CHARACTER CM ( WS )? ( ID | CHARACTER | UNITS | FS )* DOT ( WS )? ;
	public final void dramatisPersonae() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:2: ( CHARACTER CM ( WS )? ( ID | CHARACTER | UNITS | FS )* DOT ( WS )? )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:45:2: CHARACTER CM ( WS )? ( ID | CHARACTER | UNITS | FS )* DOT ( WS )?
			{
			System.out.println("* Sto per riconoscere un attore");
			match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonae111); 
			match(input,CM,FOLLOW_CM_in_dramatisPersonae113); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:15: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==WS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:15: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae115); 
					}
					break;

			}

			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:19: ( ID | CHARACTER | UNITS | FS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHARACTER||LA5_0==FS||LA5_0==ID||LA5_0==UNITS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
					{
					if ( input.LA(1)==CHARACTER||input.LA(1)==FS||input.LA(1)==ID||input.LA(1)==UNITS ) {
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
					break loop5;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_dramatisPersonae135); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:54: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:54: WS
					{
					match(input,WS,FOLLOW_WS_in_dramatisPersonae137); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:57:1: acts : ACT NUMBER CL ( ID )* DOT WS ;
	public final void acts() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:2: ( ACT NUMBER CL ( ID )* DOT WS )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:2: ACT NUMBER CL ( ID )* DOT WS
			{
			System.out.println("* Sto per riconoscere un atto");
			match(input,ACT,FOLLOW_ACT_in_acts170); 
			match(input,NUMBER,FOLLOW_NUMBER_in_acts172); 
			match(input,CL,FOLLOW_CL_in_acts174); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:16: ( ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ID) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:16: ID
					{
					match(input,ID,FOLLOW_ID_in_acts176); 
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_acts179); 
			match(input,WS,FOLLOW_WS_in_acts181); 
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
	// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:1: scenes : SCENE NUMBER CL ( ID )* DOT WS ;
	public final void scenes() throws RecognitionException {
		try {
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:8: ( SCENE NUMBER CL ( ID )* DOT WS )
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:2: SCENE NUMBER CL ( ID )* DOT WS
			{
			match(input,SCENE,FOLLOW_SCENE_in_scenes197); 
			match(input,NUMBER,FOLLOW_NUMBER_in_scenes199); 
			match(input,CL,FOLLOW_CL_in_scenes201); 
			// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:18: ( ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ID) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\TestBox\\Desktop\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:18: ID
					{
					match(input,ID,FOLLOW_ID_in_scenes203); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,DOT,FOLLOW_DOT_in_scenes206); 
			match(input,WS,FOLLOW_WS_in_scenes208); 
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

	// Delegated rules



	public static final BitSet FOLLOW_title_in_parseSPL56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_title76 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_title79 = new BitSet(new long[]{0x0000100000000040L});
	public static final BitSet FOLLOW_WS_in_title81 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_dramatisPersonae_in_title85 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_acts_in_title90 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_scenes_in_title93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonae111 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CM_in_dramatisPersonae113 = new BitSet(new long[]{0x0000180000240440L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae115 = new BitSet(new long[]{0x0000080000240440L});
	public static final BitSet FOLLOW_DOT_in_dramatisPersonae135 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_WS_in_dramatisPersonae137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_acts170 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NUMBER_in_acts172 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CL_in_acts174 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_ID_in_acts176 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_acts179 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_acts181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_scenes197 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NUMBER_in_scenes199 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CL_in_scenes201 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_ID_in_scenes203 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_DOT_in_scenes206 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WS_in_scenes208 = new BitSet(new long[]{0x0000000000000002L});
}
