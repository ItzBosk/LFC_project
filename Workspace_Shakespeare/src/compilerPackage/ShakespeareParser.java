// $ANTLR 3.5.1 D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-10-05 12:31:37

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
		"IFNOT", "IFSO", "LB", "LETTER", "LETUS", "ME", "NEGATIVEADJECTIVE", "NEGATIVENOUN", 
		"NEUTRALADJECTIVE", "NEUTRALNOUN", "POSITIVEADJECTIVE", "POSITIVENOUN", 
		"PRINTASCII", "PRINTVALUE", "PROCEEDTO", "PRODOF", "QM", "RB", "READASCII", 
		"READVALUE", "RECALL", "REMEMBER", "RETURNTO", "SC", "SCENE", "SCENEC", 
		"SUMOF", "THAN", "THOUART", "THYSELF", "WEMUST", "WESHALL", "WORSE", "WS", 
		"YOU", "YOUC", "YOURSELF"
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
	public static final int ME=31;
	public static final int NEGATIVEADJECTIVE=32;
	public static final int NEGATIVENOUN=33;
	public static final int NEUTRALADJECTIVE=34;
	public static final int NEUTRALNOUN=35;
	public static final int POSITIVEADJECTIVE=36;
	public static final int POSITIVENOUN=37;
	public static final int PRINTASCII=38;
	public static final int PRINTVALUE=39;
	public static final int PROCEEDTO=40;
	public static final int PRODOF=41;
	public static final int QM=42;
	public static final int RB=43;
	public static final int READASCII=44;
	public static final int READVALUE=45;
	public static final int RECALL=46;
	public static final int REMEMBER=47;
	public static final int RETURNTO=48;
	public static final int SC=49;
	public static final int SCENE=50;
	public static final int SCENEC=51;
	public static final int SUMOF=52;
	public static final int THAN=53;
	public static final int THOUART=54;
	public static final int THYSELF=55;
	public static final int WEMUST=56;
	public static final int WESHALL=57;
	public static final int WORSE=58;
	public static final int WS=59;
	public static final int YOU=60;
	public static final int YOUC=61;
	public static final int YOURSELF=62;

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


	    SPLhandler h;	// Handler declaration
	    public SPLhandler getHandler () {
	        return h;
	    }
	    
	    // Override and delegation in the management of syntactic errors
	    public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
	     // getting some meta info of the error
	        String hdr = " * " + getErrorHeader(e);
	        String msg = " - " + getErrorMessage(e, tokenNames);
	        
	        // current token
	        Token tk = input.LT(1);
	        
	        // let the handler handle the message
	        h.handleError(tk, hdr, msg);
	    }

	    // passing token stream to the handler	
	    void initParser () {
	        h = new SPLhandler(input);
	    }



	// $ANTLR start "parseSPL"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:44:1: parseSPL : titleRule ;
	public final void parseSPL() throws RecognitionException {
		initParser();
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:46:2: ( titleRule )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:47:6: titleRule
			{
			pushFollow(FOLLOW_titleRule_in_parseSPL63);
			titleRule();
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



	// $ANTLR start "titleRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:51:1: titleRule : ( titlecharRule )* d= DOT bodyRule ;
	public final void titleRule() throws RecognitionException {
		Token d=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:52:2: ( ( titlecharRule )* d= DOT bodyRule )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: ( titlecharRule )* d= DOT bodyRule
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: ( titlecharRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:53:6: titlecharRule
					{
					pushFollow(FOLLOW_titlecharRule_in_titleRule84);
					titlecharRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			d=(Token)match(input,DOT,FOLLOW_DOT_in_titleRule89); 
			h.checkTitle(d);
			pushFollow(FOLLOW_bodyRule_in_titleRule103);
			bodyRule();
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
	// $ANTLR end "titleRule"



	// $ANTLR start "titlecharRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:58:1: titlecharRule : f= ID ;
	public final void titlecharRule() throws RecognitionException {
		Token f=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:59:2: (f= ID )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:60:2: f= ID
			{
			f=(Token)match(input,ID,FOLLOW_ID_in_titlecharRule127); 
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
	// $ANTLR end "titlecharRule"



	// $ANTLR start "bodyRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:64:1: bodyRule : ( dramatisPersonaeRule )+ ( actRule ( sceneRule )+ )+ ;
	public final void bodyRule() throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:65:2: ( ( dramatisPersonaeRule )+ ( actRule ( sceneRule )+ )+ )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:6: ( dramatisPersonaeRule )+ ( actRule ( sceneRule )+ )+
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:6: ( dramatisPersonaeRule )+
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:66:6: dramatisPersonaeRule
					{
					pushFollow(FOLLOW_dramatisPersonaeRule_in_bodyRule154);
					dramatisPersonaeRule();
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

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:6: ( actRule ( sceneRule )+ )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ACT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:7: actRule ( sceneRule )+
					{
					pushFollow(FOLLOW_actRule_in_bodyRule163);
					actRule();
					state._fsp--;

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:15: ( sceneRule )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==SCENE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:67:15: sceneRule
							{
							pushFollow(FOLLOW_sceneRule_in_bodyRule165);
							sceneRule();
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bodyRule"



	// $ANTLR start "dramatisPersonaeRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:71:1: dramatisPersonaeRule : ch= CHARACTER co= COMMENT ;
	public final void dramatisPersonaeRule() throws RecognitionException {
		Token ch=null;
		Token co=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:72:6: (ch= CHARACTER co= COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:73:6: ch= CHARACTER co= COMMENT
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_dramatisPersonaeRule195); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_dramatisPersonaeRule199); 
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
	// $ANTLR end "dramatisPersonaeRule"



	// $ANTLR start "actRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:78:1: actRule : ACT rn= ID co= COMMENT ;
	public final void actRule() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:79:6: ( ACT rn= ID co= COMMENT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:80:6: ACT rn= ID co= COMMENT
			{
			match(input,ACT,FOLLOW_ACT_in_actRule231); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_actRule235); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_actRule239); 
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
	// $ANTLR end "actRule"



	// $ANTLR start "sceneRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:85:1: sceneRule : SCENE rn= ID co= COMMENT ( enterRule )? ( stageEventRule )* ( conditionalRule )? ( exitRule | exeuntRule )? ;
	public final void sceneRule() throws RecognitionException {
		Token rn=null;
		Token co=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:86:2: ( SCENE rn= ID co= COMMENT ( enterRule )? ( stageEventRule )* ( conditionalRule )? ( exitRule | exeuntRule )? )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:87:6: SCENE rn= ID co= COMMENT ( enterRule )? ( stageEventRule )* ( conditionalRule )? ( exitRule | exeuntRule )?
			{
			match(input,SCENE,FOLLOW_SCENE_in_sceneRule278); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_sceneRule282); 
			co=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_sceneRule286); 
			h.checkScene(rn, co);
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:6: ( enterRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LB) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==ENTER) ) {
					alt5=1;
				}
			}
			switch (alt5) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:89:6: enterRule
					{
					pushFollow(FOLLOW_enterRule_in_sceneRule305);
					enterRule();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:6: ( stageEventRule )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CHARACTER) ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1==CL) ) {
						int LA6_3 = input.LA(3);
						if ( (LA6_3==EOF||LA6_3==ACT||LA6_3==CHARACTER||LA6_3==LB||(LA6_3 >= PRINTASCII && LA6_3 <= PRINTVALUE)||(LA6_3 >= READASCII && LA6_3 <= REMEMBER)||LA6_3==SCENE||LA6_3==THOUART||LA6_3==YOU) ) {
							alt6=1;
						}

					}

				}

				switch (alt6) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:90:6: stageEventRule
					{
					pushFollow(FOLLOW_stageEventRule_in_sceneRule313);
					stageEventRule();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:6: ( conditionalRule )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CHARACTER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:91:6: conditionalRule
					{
					pushFollow(FOLLOW_conditionalRule_in_sceneRule321);
					conditionalRule();
					state._fsp--;

					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:6: ( exitRule | exeuntRule )?
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
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:7: exitRule
					{
					pushFollow(FOLLOW_exitRule_in_sceneRule330);
					exitRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:92:18: exeuntRule
					{
					pushFollow(FOLLOW_exeuntRule_in_sceneRule334);
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
	// $ANTLR end "sceneRule"



	// $ANTLR start "enterRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:96:1: enterRule : LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ;
	public final void enterRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:97:2: ( LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:5: LB ENTER (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB
			{
			match(input,LB,FOLLOW_LB_in_enterRule356); 
			match(input,ENTER,FOLLOW_ENTER_in_enterRule358); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:14: (ch1= CHARACTER )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CHARACTER) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:15: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule363); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:31: (and= AND ch2= CHARACTER )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==AND) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:98:32: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_enterRule370); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_enterRule374); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_enterRule378); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:103:1: exitRule : LB EXIT ch= CHARACTER RB ;
	public final void exitRule() throws RecognitionException {
		Token ch=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:104:2: ( LB EXIT ch= CHARACTER RB )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:105:6: LB EXIT ch= CHARACTER RB
			{
			match(input,LB,FOLLOW_LB_in_exitRule405); 
			match(input,EXIT,FOLLOW_EXIT_in_exitRule407); 
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exitRule411); 
			match(input,RB,FOLLOW_RB_in_exitRule413); 
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
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:110:1: exeuntRule : LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB ;
	public final void exeuntRule() throws RecognitionException {
		Token ch1=null;
		Token and=null;
		Token ch2=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:111:6: ( LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:6: LB EXEUNT (ch1= CHARACTER )? (and= AND ch2= CHARACTER )? RB
			{
			match(input,LB,FOLLOW_LB_in_exeuntRule449); 
			match(input,EXEUNT,FOLLOW_EXEUNT_in_exeuntRule451); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:16: (ch1= CHARACTER )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CHARACTER) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:17: ch1= CHARACTER
					{
					ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule456); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:33: (and= AND ch2= CHARACTER )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==AND) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:112:34: and= AND ch2= CHARACTER
					{
					and=(Token)match(input,AND,FOLLOW_AND_in_exeuntRule463); 
					ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_exeuntRule467); 
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_exeuntRule471); 
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



	// $ANTLR start "stageEventRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:117:1: stageEventRule : ch= CHARACTER CL ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] |wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatementRule[ch,wh] | assignmentComparisonRule[ch,wh] | assignmentOperationRule[ch,wh] ) )* ;
	public final void stageEventRule() throws RecognitionException {
		Token ch=null;
		Token wh=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:118:6: (ch= CHARACTER CL ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] |wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatementRule[ch,wh] | assignmentComparisonRule[ch,wh] | assignmentOperationRule[ch,wh] ) )* )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:119:6: ch= CHARACTER CL ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] |wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatementRule[ch,wh] | assignmentComparisonRule[ch,wh] | assignmentOperationRule[ch,wh] ) )*
			{
			ch=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_stageEventRule505); 
			match(input,CL,FOLLOW_CL_in_stageEventRule507); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:120:6: ( rememberRule[ch] | recallRule[ch] | printRule[ch] | readRule[ch] |wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatementRule[ch,wh] | assignmentComparisonRule[ch,wh] | assignmentOperationRule[ch,wh] ) )*
			loop16:
			while (true) {
				int alt16=6;
				switch ( input.LA(1) ) {
				case REMEMBER:
					{
					alt16=1;
					}
					break;
				case RECALL:
					{
					alt16=2;
					}
					break;
				case PRINTASCII:
				case PRINTVALUE:
					{
					alt16=3;
					}
					break;
				case READASCII:
				case READVALUE:
					{
					alt16=4;
					}
					break;
				case THOUART:
				case YOU:
					{
					alt16=5;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:121:6: rememberRule[ch]
					{
					pushFollow(FOLLOW_rememberRule_in_stageEventRule521);
					rememberRule(ch);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:122:8: recallRule[ch]
					{
					pushFollow(FOLLOW_recallRule_in_stageEventRule533);
					recallRule(ch);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:123:8: printRule[ch]
					{
					pushFollow(FOLLOW_printRule_in_stageEventRule545);
					printRule(ch);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:124:8: readRule[ch]
					{
					pushFollow(FOLLOW_readRule_in_stageEventRule556);
					readRule(ch);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:8: wh= ( YOU ( ARE )? | THOUART ) ( assignmentStatementRule[ch,wh] | assignmentComparisonRule[ch,wh] | assignmentOperationRule[ch,wh] )
					{
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:11: ( YOU ( ARE )? | THOUART )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==YOU) ) {
						alt14=1;
					}
					else if ( (LA14_0==THOUART) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:12: YOU ( ARE )?
							{
							wh=(Token)match(input,YOU,FOLLOW_YOU_in_stageEventRule571); 
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:16: ( ARE )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==ARE) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:16: ARE
									{
									wh=(Token)match(input,ARE,FOLLOW_ARE_in_stageEventRule573); 
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:125:23: THOUART
							{
							wh=(Token)match(input,THOUART,FOLLOW_THOUART_in_stageEventRule578); 
							}
							break;

					}

					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:126:7: ( assignmentStatementRule[ch,wh] | assignmentComparisonRule[ch,wh] | assignmentOperationRule[ch,wh] )
					int alt15=3;
					switch ( input.LA(1) ) {
					case A:
					case NEGATIVEADJECTIVE:
					case NEGATIVENOUN:
					case NEUTRALADJECTIVE:
					case NEUTRALNOUN:
					case POSITIVEADJECTIVE:
					case POSITIVENOUN:
						{
						alt15=1;
						}
						break;
					case AS:
						{
						alt15=2;
						}
						break;
					case DIFFBET:
					case PRODOF:
					case SUMOF:
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
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:127:7: assignmentStatementRule[ch,wh]
							{
							pushFollow(FOLLOW_assignmentStatementRule_in_stageEventRule596);
							assignmentStatementRule(ch, wh);
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:128:9: assignmentComparisonRule[ch,wh]
							{
							pushFollow(FOLLOW_assignmentComparisonRule_in_stageEventRule608);
							assignmentComparisonRule(ch, wh);
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:129:9: assignmentOperationRule[ch,wh]
							{
							pushFollow(FOLLOW_assignmentOperationRule_in_stageEventRule620);
							assignmentOperationRule(ch, wh);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop16;
				}
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
	// $ANTLR end "stageEventRule"



	// $ANTLR start "assignmentStatementRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:135:1: assignmentStatementRule[Token ch, Token wh] : ( A )? ( adjectiveRule )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) ;
	public final void assignmentStatementRule(Token ch, Token wh) throws RecognitionException {
		Token noun=null;
		Token el=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:136:2: ( ( A )? ( adjectiveRule )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:2: ( A )? ( adjectiveRule )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT )
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:2: ( A )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==A) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:2: A
					{
					match(input,A,FOLLOW_A_in_assignmentStatementRule655); 
					}
					break;

			}

			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:5: ( adjectiveRule )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==NEGATIVEADJECTIVE||LA18_0==NEUTRALADJECTIVE||LA18_0==POSITIVEADJECTIVE) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:137:6: adjectiveRule
					{
					pushFollow(FOLLOW_adjectiveRule_in_assignmentStatementRule659);
					adjectiveRule();
					state._fsp--;

					}
					break;

				default :
					break loop18;
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
			el=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkAssignmentStatement(ch, noun, wh, el);
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
	// $ANTLR end "assignmentStatementRule"



	// $ANTLR start "assignmentComparisonRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:143:1: assignmentComparisonRule[Token ch, Token wh] : ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveRule )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecondRule )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) el= ( EP | DOT ) ;
	public final void assignmentComparisonRule(Token ch, Token wh) throws RecognitionException {
		Token adj=null;
		Token operationtype=null;
		Token noun1=null;
		Token noun2=null;
		Token el=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:144:2: ( ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveRule )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecondRule )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) el= ( EP | DOT ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:2: ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveRule )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecondRule )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) ) el= ( EP | DOT )
			{
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:2: ( AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveRule )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecondRule )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:145:3: AS adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS operationtype= ( SUMOF | DIFFBET | PRODOF ) A ( adjectiveRule )* noun1= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) AND A ( adjectiveSecondRule )* noun2= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN )
			{
			match(input,AS,FOLLOW_AS_in_assignmentComparisonRule705); 
			adj=input.LT(1);
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,AS,FOLLOW_AS_in_assignmentComparisonRule724); 
			operationtype=input.LT(1);
			if ( input.LA(1)==DIFFBET||input.LA(1)==PRODOF||input.LA(1)==SUMOF ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,A,FOLLOW_A_in_assignmentComparisonRule743); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:149:4: ( adjectiveRule )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==NEGATIVEADJECTIVE||LA19_0==NEUTRALADJECTIVE||LA19_0==POSITIVEADJECTIVE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:149:4: adjectiveRule
					{
					pushFollow(FOLLOW_adjectiveRule_in_assignmentComparisonRule745);
					adjectiveRule();
					state._fsp--;

					}
					break;

				default :
					break loop19;
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
			match(input,AND,FOLLOW_AND_in_assignmentComparisonRule763); 
			match(input,A,FOLLOW_A_in_assignmentComparisonRule767); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:151:4: ( adjectiveSecondRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==NEGATIVEADJECTIVE||LA20_0==NEUTRALADJECTIVE||LA20_0==POSITIVEADJECTIVE) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:151:4: adjectiveSecondRule
					{
					pushFollow(FOLLOW_adjectiveSecondRule_in_assignmentComparisonRule769);
					adjectiveSecondRule();
					state._fsp--;

					}
					break;

				default :
					break loop20;
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
			}

			el=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkAssignmentComparison(ch, noun1, noun2, operationtype, wh, adj,el);
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
	// $ANTLR end "assignmentComparisonRule"



	// $ANTLR start "assignmentOperationRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:157:1: assignmentOperationRule[Token ch, Token wh] : operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjectiveRule )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) ;
	public final void assignmentOperationRule(Token ch, Token wh) throws RecognitionException {
		Token operationtype=null;
		Token noun=null;
		Token el=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:2: (operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjectiveRule )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:159:2: operationtype= ( SUMOF | DIFFBET | PRODOF ) THYSELF AND A ( adjectiveRule )* noun= ( POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN ) el= ( EP | DOT )
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
			match(input,THYSELF,FOLLOW_THYSELF_in_assignmentOperationRule828); 
			match(input,AND,FOLLOW_AND_in_assignmentOperationRule832); 
			match(input,A,FOLLOW_A_in_assignmentOperationRule834); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:160:8: ( adjectiveRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==NEGATIVEADJECTIVE||LA21_0==NEUTRALADJECTIVE||LA21_0==POSITIVEADJECTIVE) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:160:8: adjectiveRule
					{
					pushFollow(FOLLOW_adjectiveRule_in_assignmentOperationRule836);
					adjectiveRule();
					state._fsp--;

					}
					break;

				default :
					break loop21;
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
			el=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkAssignmentOperation(ch, noun, operationtype,wh,el);
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
	// $ANTLR end "assignmentOperationRule"



	// $ANTLR start "adjectiveRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:165:1: adjectiveRule : adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjectiveRule() throws RecognitionException {
		Token adj=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:166:2: (adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:167:2: adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
			{
			adj=input.LT(1);
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.adjectiveCounter++;
				 h.adjBuilder(adj);
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
	// $ANTLR end "adjectiveRule"



	// $ANTLR start "conditionalRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:173:1: conditionalRule : ch1= CHARACTER CL AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL gt= ( IFSO | IFNOT ) gt2= ( LETUS | WESHALL | WEMUST ) gt3rs= ( RETURNTO | PROCEEDTO ) gt4= SCENEC rn= ID DOT ;
	public final void conditionalRule() throws RecognitionException {
		Token ch1=null;
		Token ev=null;
		Token ch2=null;
		Token gt=null;
		Token gt2=null;
		Token gt3rs=null;
		Token gt4=null;
		Token rn=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:174:2: (ch1= CHARACTER CL AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL gt= ( IFSO | IFNOT ) gt2= ( LETUS | WESHALL | WEMUST ) gt3rs= ( RETURNTO | PROCEEDTO ) gt4= SCENEC rn= ID DOT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:2: ch1= CHARACTER CL AMI ev= ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE ) THAN YOUC QM ch2= CHARACTER CL gt= ( IFSO | IFNOT ) gt2= ( LETUS | WESHALL | WEMUST ) gt3rs= ( RETURNTO | PROCEEDTO ) gt4= SCENEC rn= ID DOT
			{
			ch1=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_conditionalRule906); 
			match(input,CL,FOLLOW_CL_in_conditionalRule908); 
			match(input,AMI,FOLLOW_AMI_in_conditionalRule911); 
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:177:5: ( BETTER | ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS ) | WORSE )
			int alt22=3;
			switch ( input.LA(1) ) {
			case BETTER:
				{
				alt22=1;
				}
				break;
			case AS:
				{
				alt22=2;
				}
				break;
			case WORSE:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:178:3: BETTER
					{
					ev=(Token)match(input,BETTER,FOLLOW_BETTER_in_conditionalRule921); 
					}
					break;
				case 2 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:179:5: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					{
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:179:5: ( AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS )
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:179:6: AS ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) AS
					{
					ev=(Token)match(input,AS,FOLLOW_AS_in_conditionalRule929); 
					ev=input.LT(1);
					if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ev=(Token)match(input,AS,FOLLOW_AS_in_conditionalRule943); 
					}

					}
					break;
				case 3 :
					// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:180:5: WORSE
					{
					ev=(Token)match(input,WORSE,FOLLOW_WORSE_in_conditionalRule951); 
					}
					break;

			}

			match(input,THAN,FOLLOW_THAN_in_conditionalRule958); 
			match(input,YOUC,FOLLOW_YOUC_in_conditionalRule960); 
			match(input,QM,FOLLOW_QM_in_conditionalRule962); 
			ch2=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_conditionalRule969); 
			match(input,CL,FOLLOW_CL_in_conditionalRule971); 
			gt=input.LT(1);
			if ( (input.LA(1) >= IFNOT && input.LA(1) <= IFSO) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			gt2=input.LT(1);
			if ( input.LA(1)==LETUS||(input.LA(1) >= WEMUST && input.LA(1) <= WESHALL) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			gt3rs=input.LT(1);
			if ( input.LA(1)==PROCEEDTO||input.LA(1)==RETURNTO ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			gt4=(Token)match(input,SCENEC,FOLLOW_SCENEC_in_conditionalRule1016); 
			rn=(Token)match(input,ID,FOLLOW_ID_in_conditionalRule1020); 
			match(input,DOT,FOLLOW_DOT_in_conditionalRule1022); 
			h.checkConditional(ch1, ev, ch2, gt,gt2,gt3rs,gt4, rn);
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
	// $ANTLR end "conditionalRule"



	// $ANTLR start "adjectiveSecondRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:194:1: adjectiveSecondRule : adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) ;
	public final void adjectiveSecondRule() throws RecognitionException {
		Token adj=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:195:2: (adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:196:2: adj= ( POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE )
			{
			adj=input.LT(1);
			if ( input.LA(1)==NEGATIVEADJECTIVE||input.LA(1)==NEUTRALADJECTIVE||input.LA(1)==POSITIVEADJECTIVE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.adjectiveCounter2++;
				 h.adjBuilder2(adj);
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
	// $ANTLR end "adjectiveSecondRule"



	// $ANTLR start "rememberRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:202:1: rememberRule[Token ch] : REMEMBER who= ( ME | YOURSELF ) DOT ;
	public final void rememberRule(Token ch) throws RecognitionException {
		Token who=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:203:2: ( REMEMBER who= ( ME | YOURSELF ) DOT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:204:2: REMEMBER who= ( ME | YOURSELF ) DOT
			{
			match(input,REMEMBER,FOLLOW_REMEMBER_in_rememberRule1071); 
			who=input.LT(1);
			if ( input.LA(1)==ME||input.LA(1)==YOURSELF ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,DOT,FOLLOW_DOT_in_rememberRule1083); 
			h.checkRemember(ch, who);
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
	// $ANTLR end "rememberRule"



	// $ANTLR start "recallRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:209:1: recallRule[Token ch] : RECALL DOT ;
	public final void recallRule(Token ch) throws RecognitionException {
		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:210:2: ( RECALL DOT )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:211:2: RECALL DOT
			{
			match(input,RECALL,FOLLOW_RECALL_in_recallRule1101); 
			match(input,DOT,FOLLOW_DOT_in_recallRule1103); 
			h.checkRecall(ch);
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
	// $ANTLR end "recallRule"



	// $ANTLR start "printRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:216:1: printRule[Token ch] : phrase= ( PRINTVALUE | PRINTASCII ) wh= ( DOT | EP ) ;
	public final void printRule(Token ch) throws RecognitionException {
		Token phrase=null;
		Token wh=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:217:2: (phrase= ( PRINTVALUE | PRINTASCII ) wh= ( DOT | EP ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:218:2: phrase= ( PRINTVALUE | PRINTASCII ) wh= ( DOT | EP )
			{
			phrase=input.LT(1);
			if ( (input.LA(1) >= PRINTASCII && input.LA(1) <= PRINTVALUE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			wh=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkPrint(ch, phrase, wh);
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
	// $ANTLR end "printRule"



	// $ANTLR start "readRule"
	// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:224:1: readRule[Token ch] : phrase= ( READVALUE | READASCII ) wh= ( DOT | EP ) ;
	public final void readRule(Token ch) throws RecognitionException {
		Token phrase=null;
		Token wh=null;

		try {
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:225:2: (phrase= ( READVALUE | READASCII ) wh= ( DOT | EP ) )
			// D:\\università\\4° anno - 1° periodo\\(PA)   PROGRAMMAZIONE AVANZATA   38090-mod2\\esempi programmazione\\git\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:226:2: phrase= ( READVALUE | READASCII ) wh= ( DOT | EP )
			{
			phrase=input.LT(1);
			if ( (input.LA(1) >= READASCII && input.LA(1) <= READVALUE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			wh=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==EP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			h.checkRead(ch, phrase, wh);
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
	// $ANTLR end "readRule"

	// Delegated rules



	public static final BitSet FOLLOW_titleRule_in_parseSPL63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titlecharRule_in_titleRule84 = new BitSet(new long[]{0x0000000002040000L});
	public static final BitSet FOLLOW_DOT_in_titleRule89 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_bodyRule_in_titleRule103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_titlecharRule127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dramatisPersonaeRule_in_bodyRule154 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_actRule_in_bodyRule163 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_sceneRule_in_bodyRule165 = new BitSet(new long[]{0x0004000000000022L});
	public static final BitSet FOLLOW_CHARACTER_in_dramatisPersonaeRule195 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMENT_in_dramatisPersonaeRule199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACT_in_actRule231 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_actRule235 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMENT_in_actRule239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCENE_in_sceneRule278 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_sceneRule282 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMENT_in_sceneRule286 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_enterRule_in_sceneRule305 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_stageEventRule_in_sceneRule313 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_conditionalRule_in_sceneRule321 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_exitRule_in_sceneRule330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exeuntRule_in_sceneRule334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_enterRule356 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENTER_in_enterRule358 = new BitSet(new long[]{0x0000080000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule363 = new BitSet(new long[]{0x0000080000000080L});
	public static final BitSet FOLLOW_AND_in_enterRule370 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_enterRule374 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_enterRule378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exitRule405 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EXIT_in_exitRule407 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exitRule411 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_exitRule413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_exeuntRule449 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EXEUNT_in_exeuntRule451 = new BitSet(new long[]{0x0000080000001080L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule456 = new BitSet(new long[]{0x0000080000000080L});
	public static final BitSet FOLLOW_AND_in_exeuntRule463 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_exeuntRule467 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RB_in_exeuntRule471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_stageEventRule505 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_stageEventRule507 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_rememberRule_in_stageEventRule521 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_recallRule_in_stageEventRule533 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_printRule_in_stageEventRule545 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_readRule_in_stageEventRule556 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_YOU_in_stageEventRule571 = new BitSet(new long[]{0x0010023F00010610L});
	public static final BitSet FOLLOW_ARE_in_stageEventRule573 = new BitSet(new long[]{0x0010023F00010410L});
	public static final BitSet FOLLOW_THOUART_in_stageEventRule578 = new BitSet(new long[]{0x0010023F00010410L});
	public static final BitSet FOLLOW_assignmentStatementRule_in_stageEventRule596 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_assignmentComparisonRule_in_stageEventRule608 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_assignmentOperationRule_in_stageEventRule620 = new BitSet(new long[]{0x1040F0C000000002L});
	public static final BitSet FOLLOW_A_in_assignmentStatementRule655 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjectiveRule_in_assignmentStatementRule659 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentStatementRule665 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_assignmentStatementRule680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_assignmentComparisonRule705 = new BitSet(new long[]{0x0000001500000000L});
	public static final BitSet FOLLOW_set_in_assignmentComparisonRule711 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_assignmentComparisonRule724 = new BitSet(new long[]{0x0010020000010000L});
	public static final BitSet FOLLOW_set_in_assignmentComparisonRule730 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_assignmentComparisonRule743 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjectiveRule_in_assignmentComparisonRule745 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentComparisonRule750 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_assignmentComparisonRule763 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_assignmentComparisonRule767 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjectiveSecondRule_in_assignmentComparisonRule769 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentComparisonRule774 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_assignmentComparisonRule791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assignmentOperationRule816 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THYSELF_in_assignmentOperationRule828 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_assignmentOperationRule832 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_A_in_assignmentOperationRule834 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_adjectiveRule_in_assignmentOperationRule836 = new BitSet(new long[]{0x0000003F00000000L});
	public static final BitSet FOLLOW_set_in_assignmentOperationRule841 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_assignmentOperationRule855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjectiveRule878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_conditionalRule906 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_conditionalRule908 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AMI_in_conditionalRule911 = new BitSet(new long[]{0x0400000000000C00L});
	public static final BitSet FOLLOW_BETTER_in_conditionalRule921 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_AS_in_conditionalRule929 = new BitSet(new long[]{0x0000001500000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule931 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_AS_in_conditionalRule943 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_WORSE_in_conditionalRule951 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_THAN_in_conditionalRule958 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_YOUC_in_conditionalRule960 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_QM_in_conditionalRule962 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHARACTER_in_conditionalRule969 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_conditionalRule971 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule976 = new BitSet(new long[]{0x0300000040000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule988 = new BitSet(new long[]{0x0001010000000000L});
	public static final BitSet FOLLOW_set_in_conditionalRule1004 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SCENEC_in_conditionalRule1016 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_conditionalRule1020 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_conditionalRule1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_adjectiveSecondRule1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMEMBER_in_rememberRule1071 = new BitSet(new long[]{0x4000000080000000L});
	public static final BitSet FOLLOW_set_in_rememberRule1075 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_rememberRule1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECALL_in_recallRule1101 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_recallRule1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_printRule1123 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_printRule1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_readRule1160 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_set_in_readRule1171 = new BitSet(new long[]{0x0000000000000002L});
}
