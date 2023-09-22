// $ANTLR 3.5.1 /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g 2023-09-22 12:14:29

    package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ShakespeareLexer() {} 
	public ShakespeareLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ShakespeareLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g"; }

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:213:5: ( 'Romeo' | 'Juliet' | 'Hamlet' | 'Ghost' | 'LadyMacbeth' | 'Ophelia' | 'Tebaldo' | 'Claudio' | 'Mercuzio' | 'Banquo' | 'Fulgencio' | 'Gertrude' | 'Desdemona' | 'Jago' | 'Polonio' | 'Macduff' | 'Shylock' | 'Laerte' | 'Orazio' | 'Prospero' )
			int alt1=20;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt1=1;
				}
				break;
			case 'J':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='u') ) {
					alt1=2;
				}
				else if ( (LA1_2=='a') ) {
					alt1=14;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'H':
				{
				alt1=3;
				}
				break;
			case 'G':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='h') ) {
					alt1=4;
				}
				else if ( (LA1_4=='e') ) {
					alt1=12;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'L':
				{
				int LA1_5 = input.LA(2);
				if ( (LA1_5=='a') ) {
					int LA1_19 = input.LA(3);
					if ( (LA1_19=='d') ) {
						alt1=5;
					}
					else if ( (LA1_19=='e') ) {
						alt1=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'O':
				{
				int LA1_6 = input.LA(2);
				if ( (LA1_6=='p') ) {
					alt1=6;
				}
				else if ( (LA1_6=='r') ) {
					alt1=19;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'T':
				{
				alt1=7;
				}
				break;
			case 'C':
				{
				alt1=8;
				}
				break;
			case 'M':
				{
				int LA1_9 = input.LA(2);
				if ( (LA1_9=='e') ) {
					alt1=9;
				}
				else if ( (LA1_9=='a') ) {
					alt1=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'B':
				{
				alt1=10;
				}
				break;
			case 'F':
				{
				alt1=11;
				}
				break;
			case 'D':
				{
				alt1=13;
				}
				break;
			case 'P':
				{
				int LA1_13 = input.LA(2);
				if ( (LA1_13=='o') ) {
					alt1=15;
				}
				else if ( (LA1_13=='r') ) {
					alt1=20;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
				{
				alt1=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:213:9: 'Romeo'
					{
					match("Romeo"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:214:9: 'Juliet'
					{
					match("Juliet"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:215:9: 'Hamlet'
					{
					match("Hamlet"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:216:9: 'Ghost'
					{
					match("Ghost"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:217:9: 'LadyMacbeth'
					{
					match("LadyMacbeth"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:218:9: 'Ophelia'
					{
					match("Ophelia"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:219:9: 'Tebaldo'
					{
					match("Tebaldo"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:220:9: 'Claudio'
					{
					match("Claudio"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:221:9: 'Mercuzio'
					{
					match("Mercuzio"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:222:9: 'Banquo'
					{
					match("Banquo"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:223:9: 'Fulgencio'
					{
					match("Fulgencio"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:224:9: 'Gertrude'
					{
					match("Gertrude"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:225:9: 'Desdemona'
					{
					match("Desdemona"); 

					}
					break;
				case 14 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:226:9: 'Jago'
					{
					match("Jago"); 

					}
					break;
				case 15 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:227:9: 'Polonio'
					{
					match("Polonio"); 

					}
					break;
				case 16 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:228:9: 'Macduff'
					{
					match("Macduff"); 

					}
					break;
				case 17 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:229:9: 'Shylock'
					{
					match("Shylock"); 

					}
					break;
				case 18 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:230:9: 'Laerte'
					{
					match("Laerte"); 

					}
					break;
				case 19 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:231:9: 'Orazio'
					{
					match("Orazio"); 

					}
					break;
				case 20 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:232:9: 'Prospero'
					{
					match("Prospero"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "POSITIVENOUN"
	public final void mPOSITIVENOUN() throws RecognitionException {
		try {
			int _type = POSITIVENOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:238:5: ( 'Heaven' | 'King' | 'Lord' | 'angel' | 'flower' | 'happiness' | 'joy' | 'plum' | 'summer’s day' | 'hero' | 'rose' | 'kingdom' | 'pony' )
			int alt2=13;
			switch ( input.LA(1) ) {
			case 'H':
				{
				alt2=1;
				}
				break;
			case 'K':
				{
				alt2=2;
				}
				break;
			case 'L':
				{
				alt2=3;
				}
				break;
			case 'a':
				{
				alt2=4;
				}
				break;
			case 'f':
				{
				alt2=5;
				}
				break;
			case 'h':
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6=='a') ) {
					alt2=6;
				}
				else if ( (LA2_6=='e') ) {
					alt2=10;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'j':
				{
				alt2=7;
				}
				break;
			case 'p':
				{
				int LA2_8 = input.LA(2);
				if ( (LA2_8=='l') ) {
					alt2=8;
				}
				else if ( (LA2_8=='o') ) {
					alt2=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt2=9;
				}
				break;
			case 'r':
				{
				alt2=11;
				}
				break;
			case 'k':
				{
				alt2=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:238:9: 'Heaven'
					{
					match("Heaven"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:239:9: 'King'
					{
					match("King"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:240:9: 'Lord'
					{
					match("Lord"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:241:9: 'angel'
					{
					match("angel"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:242:9: 'flower'
					{
					match("flower"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:243:9: 'happiness'
					{
					match("happiness"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:244:9: 'joy'
					{
					match("joy"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:245:9: 'plum'
					{
					match("plum"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:246:9: 'summer’s day'
					{
					match("summer’s day"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:247:9: 'hero'
					{
					match("hero"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:248:9: 'rose'
					{
					match("rose"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:249:9: 'kingdom'
					{
					match("kingdom"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:250:9: 'pony'
					{
					match("pony"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSITIVENOUN"

	// $ANTLR start "NEUTRALNOUN"
	public final void mNEUTRALNOUN() throws RecognitionException {
		try {
			int _type = NEUTRALNOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:256:5: ( 'animal' | 'aunt' | 'brother' | 'cat' | 'chihuahua' | 'cousin' | 'cow' | 'daughter' | 'door' | 'face' | 'father' | 'fellow' | 'granddaughter' | 'grandfather' | 'grandmother' | 'grandson' | 'hair' | 'hamster' | 'horse' | 'lamp' | 'lantern' | 'mistletoe' | 'moon' | 'morning' | 'mother' | 'nephew' | 'niece' | 'nose' | 'purse' | 'road' | 'roman' | 'sister' | 'sky' | 'son' | 'squirrel' | 'stonewall' | 'thing' | 'town' | 'tree' | 'uncle' | 'wind' )
			int alt3=41;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:256:9: 'animal'
					{
					match("animal"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:257:9: 'aunt'
					{
					match("aunt"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:258:9: 'brother'
					{
					match("brother"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:259:9: 'cat'
					{
					match("cat"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:260:9: 'chihuahua'
					{
					match("chihuahua"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:261:9: 'cousin'
					{
					match("cousin"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:262:9: 'cow'
					{
					match("cow"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:263:9: 'daughter'
					{
					match("daughter"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:264:9: 'door'
					{
					match("door"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:265:9: 'face'
					{
					match("face"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:266:9: 'father'
					{
					match("father"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:267:9: 'fellow'
					{
					match("fellow"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:268:9: 'granddaughter'
					{
					match("granddaughter"); 

					}
					break;
				case 14 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:269:9: 'grandfather'
					{
					match("grandfather"); 

					}
					break;
				case 15 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:270:9: 'grandmother'
					{
					match("grandmother"); 

					}
					break;
				case 16 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:271:9: 'grandson'
					{
					match("grandson"); 

					}
					break;
				case 17 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:272:9: 'hair'
					{
					match("hair"); 

					}
					break;
				case 18 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:273:9: 'hamster'
					{
					match("hamster"); 

					}
					break;
				case 19 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:274:9: 'horse'
					{
					match("horse"); 

					}
					break;
				case 20 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:275:9: 'lamp'
					{
					match("lamp"); 

					}
					break;
				case 21 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:276:9: 'lantern'
					{
					match("lantern"); 

					}
					break;
				case 22 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:277:9: 'mistletoe'
					{
					match("mistletoe"); 

					}
					break;
				case 23 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:278:9: 'moon'
					{
					match("moon"); 

					}
					break;
				case 24 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:279:9: 'morning'
					{
					match("morning"); 

					}
					break;
				case 25 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:280:9: 'mother'
					{
					match("mother"); 

					}
					break;
				case 26 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:281:9: 'nephew'
					{
					match("nephew"); 

					}
					break;
				case 27 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:282:9: 'niece'
					{
					match("niece"); 

					}
					break;
				case 28 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:283:9: 'nose'
					{
					match("nose"); 

					}
					break;
				case 29 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:284:9: 'purse'
					{
					match("purse"); 

					}
					break;
				case 30 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:285:9: 'road'
					{
					match("road"); 

					}
					break;
				case 31 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:286:9: 'roman'
					{
					match("roman"); 

					}
					break;
				case 32 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:287:9: 'sister'
					{
					match("sister"); 

					}
					break;
				case 33 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:288:9: 'sky'
					{
					match("sky"); 

					}
					break;
				case 34 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:289:9: 'son'
					{
					match("son"); 

					}
					break;
				case 35 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:290:9: 'squirrel'
					{
					match("squirrel"); 

					}
					break;
				case 36 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:291:9: 'stonewall'
					{
					match("stonewall"); 

					}
					break;
				case 37 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:292:9: 'thing'
					{
					match("thing"); 

					}
					break;
				case 38 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:293:9: 'town'
					{
					match("town"); 

					}
					break;
				case 39 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:294:9: 'tree'
					{
					match("tree"); 

					}
					break;
				case 40 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:295:9: 'uncle'
					{
					match("uncle"); 

					}
					break;
				case 41 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:296:9: 'wind'
					{
					match("wind"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEUTRALNOUN"

	// $ANTLR start "NEGATIVENOUN"
	public final void mNEGATIVENOUN() throws RecognitionException {
		try {
			int _type = NEGATIVENOUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:302:5: ( 'Hell' | 'Microsoft' | 'bastard' | 'beggar' | 'blister' | 'codpiece' | 'coward' | 'curse' | 'death' | 'devil' | 'draught' | 'famine' | 'flirt-gill' | 'goat' | 'hate' | 'hog' | 'hound' | 'leech' | 'lie' | 'pig' | 'plague' | 'starvation' | 'toad' | 'war' | 'wolf' )
			int alt4=25;
			switch ( input.LA(1) ) {
			case 'H':
				{
				alt4=1;
				}
				break;
			case 'M':
				{
				alt4=2;
				}
				break;
			case 'b':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt4=3;
					}
					break;
				case 'e':
					{
					alt4=4;
					}
					break;
				case 'l':
					{
					alt4=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'c':
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4=='o') ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17=='d') ) {
						alt4=6;
					}
					else if ( (LA4_17=='w') ) {
						alt4=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_4=='u') ) {
					alt4=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA4_5 = input.LA(2);
				if ( (LA4_5=='e') ) {
					int LA4_19 = input.LA(3);
					if ( (LA4_19=='a') ) {
						alt4=9;
					}
					else if ( (LA4_19=='v') ) {
						alt4=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_5=='r') ) {
					alt4=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				int LA4_6 = input.LA(2);
				if ( (LA4_6=='a') ) {
					alt4=12;
				}
				else if ( (LA4_6=='l') ) {
					alt4=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'g':
				{
				alt4=14;
				}
				break;
			case 'h':
				{
				int LA4_8 = input.LA(2);
				if ( (LA4_8=='a') ) {
					alt4=15;
				}
				else if ( (LA4_8=='o') ) {
					int LA4_24 = input.LA(3);
					if ( (LA4_24=='g') ) {
						alt4=16;
					}
					else if ( (LA4_24=='u') ) {
						alt4=17;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				int LA4_9 = input.LA(2);
				if ( (LA4_9=='e') ) {
					alt4=18;
				}
				else if ( (LA4_9=='i') ) {
					alt4=19;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'p':
				{
				int LA4_10 = input.LA(2);
				if ( (LA4_10=='i') ) {
					alt4=20;
				}
				else if ( (LA4_10=='l') ) {
					alt4=21;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt4=22;
				}
				break;
			case 't':
				{
				alt4=23;
				}
				break;
			case 'w':
				{
				int LA4_13 = input.LA(2);
				if ( (LA4_13=='a') ) {
					alt4=24;
				}
				else if ( (LA4_13=='o') ) {
					alt4=25;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:302:9: 'Hell'
					{
					match("Hell"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:303:9: 'Microsoft'
					{
					match("Microsoft"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:304:9: 'bastard'
					{
					match("bastard"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:305:9: 'beggar'
					{
					match("beggar"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:306:9: 'blister'
					{
					match("blister"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:307:9: 'codpiece'
					{
					match("codpiece"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:308:9: 'coward'
					{
					match("coward"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:309:9: 'curse'
					{
					match("curse"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:310:9: 'death'
					{
					match("death"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:311:9: 'devil'
					{
					match("devil"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:312:9: 'draught'
					{
					match("draught"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:313:9: 'famine'
					{
					match("famine"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:314:9: 'flirt-gill'
					{
					match("flirt-gill"); 

					}
					break;
				case 14 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:315:9: 'goat'
					{
					match("goat"); 

					}
					break;
				case 15 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:316:9: 'hate'
					{
					match("hate"); 

					}
					break;
				case 16 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:317:9: 'hog'
					{
					match("hog"); 

					}
					break;
				case 17 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:318:9: 'hound'
					{
					match("hound"); 

					}
					break;
				case 18 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:319:9: 'leech'
					{
					match("leech"); 

					}
					break;
				case 19 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:320:9: 'lie'
					{
					match("lie"); 

					}
					break;
				case 20 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:321:9: 'pig'
					{
					match("pig"); 

					}
					break;
				case 21 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:322:9: 'plague'
					{
					match("plague"); 

					}
					break;
				case 22 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:323:9: 'starvation'
					{
					match("starvation"); 

					}
					break;
				case 23 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:324:9: 'toad'
					{
					match("toad"); 

					}
					break;
				case 24 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:325:9: 'war'
					{
					match("war"); 

					}
					break;
				case 25 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:326:9: 'wolf'
					{
					match("wolf"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATIVENOUN"

	// $ANTLR start "POSITIVEADJECTIVE"
	public final void mPOSITIVEADJECTIVE() throws RecognitionException {
		try {
			int _type = POSITIVEADJECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:331:5: ( 'amazing' | 'beautiful' | 'blossoming' | 'bold' | 'brave' | 'charming' | 'clearest' | 'cunning' | 'cute' | 'delicious' | 'embroidered' | 'fair' | 'fine' | 'gentle' | 'golden' | 'good' | 'handsome' | 'happy' | 'healthy' | 'honest' | 'lovely' | 'loving' | 'mighty' | 'noble' | 'peaceful' | 'pretty' | 'prompt' | 'proud' | 'reddest' | 'rich' | 'smooth' | 'sunny' | 'sweet' | 'sweetest' | 'trustworthy' | 'warm' )
			int alt5=36;
			switch ( input.LA(1) ) {
			case 'a':
				{
				alt5=1;
				}
				break;
			case 'b':
				{
				switch ( input.LA(2) ) {
				case 'e':
					{
					alt5=2;
					}
					break;
				case 'l':
					{
					alt5=3;
					}
					break;
				case 'o':
					{
					alt5=4;
					}
					break;
				case 'r':
					{
					alt5=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'c':
				{
				switch ( input.LA(2) ) {
				case 'h':
					{
					alt5=6;
					}
					break;
				case 'l':
					{
					alt5=7;
					}
					break;
				case 'u':
					{
					int LA5_23 = input.LA(3);
					if ( (LA5_23=='n') ) {
						alt5=8;
					}
					else if ( (LA5_23=='t') ) {
						alt5=9;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 23, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'd':
				{
				alt5=10;
				}
				break;
			case 'e':
				{
				alt5=11;
				}
				break;
			case 'f':
				{
				int LA5_6 = input.LA(2);
				if ( (LA5_6=='a') ) {
					alt5=12;
				}
				else if ( (LA5_6=='i') ) {
					alt5=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'g':
				{
				int LA5_7 = input.LA(2);
				if ( (LA5_7=='e') ) {
					alt5=14;
				}
				else if ( (LA5_7=='o') ) {
					int LA5_27 = input.LA(3);
					if ( (LA5_27=='l') ) {
						alt5=15;
					}
					else if ( (LA5_27=='o') ) {
						alt5=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 27, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'h':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					int LA5_28 = input.LA(3);
					if ( (LA5_28=='n') ) {
						alt5=17;
					}
					else if ( (LA5_28=='p') ) {
						alt5=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'e':
					{
					alt5=19;
					}
					break;
				case 'o':
					{
					alt5=20;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'l':
				{
				int LA5_9 = input.LA(2);
				if ( (LA5_9=='o') ) {
					int LA5_31 = input.LA(3);
					if ( (LA5_31=='v') ) {
						int LA5_45 = input.LA(4);
						if ( (LA5_45=='e') ) {
							alt5=21;
						}
						else if ( (LA5_45=='i') ) {
							alt5=22;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 45, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 31, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				alt5=23;
				}
				break;
			case 'n':
				{
				alt5=24;
				}
				break;
			case 'p':
				{
				int LA5_12 = input.LA(2);
				if ( (LA5_12=='e') ) {
					alt5=25;
				}
				else if ( (LA5_12=='r') ) {
					int LA5_33 = input.LA(3);
					if ( (LA5_33=='e') ) {
						alt5=26;
					}
					else if ( (LA5_33=='o') ) {
						int LA5_47 = input.LA(4);
						if ( (LA5_47=='m') ) {
							alt5=27;
						}
						else if ( (LA5_47=='u') ) {
							alt5=28;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 47, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 33, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'r':
				{
				int LA5_13 = input.LA(2);
				if ( (LA5_13=='e') ) {
					alt5=29;
				}
				else if ( (LA5_13=='i') ) {
					alt5=30;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt5=31;
					}
					break;
				case 'u':
					{
					alt5=32;
					}
					break;
				case 'w':
					{
					int LA5_38 = input.LA(3);
					if ( (LA5_38=='e') ) {
						int LA5_48 = input.LA(4);
						if ( (LA5_48=='e') ) {
							int LA5_53 = input.LA(5);
							if ( (LA5_53=='t') ) {
								int LA5_54 = input.LA(6);
								if ( (LA5_54=='e') ) {
									alt5=34;
								}

								else {
									alt5=33;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 53, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 48, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 38, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 't':
				{
				alt5=35;
				}
				break;
			case 'w':
				{
				alt5=36;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:331:9: 'amazing'
					{
					match("amazing"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:332:9: 'beautiful'
					{
					match("beautiful"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:333:9: 'blossoming'
					{
					match("blossoming"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:334:9: 'bold'
					{
					match("bold"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:335:9: 'brave'
					{
					match("brave"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:336:9: 'charming'
					{
					match("charming"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:337:9: 'clearest'
					{
					match("clearest"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:338:9: 'cunning'
					{
					match("cunning"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:339:9: 'cute'
					{
					match("cute"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:340:9: 'delicious'
					{
					match("delicious"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:341:9: 'embroidered'
					{
					match("embroidered"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:342:9: 'fair'
					{
					match("fair"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:343:9: 'fine'
					{
					match("fine"); 

					}
					break;
				case 14 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:344:9: 'gentle'
					{
					match("gentle"); 

					}
					break;
				case 15 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:345:9: 'golden'
					{
					match("golden"); 

					}
					break;
				case 16 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:346:9: 'good'
					{
					match("good"); 

					}
					break;
				case 17 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:347:9: 'handsome'
					{
					match("handsome"); 

					}
					break;
				case 18 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:348:9: 'happy'
					{
					match("happy"); 

					}
					break;
				case 19 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:349:9: 'healthy'
					{
					match("healthy"); 

					}
					break;
				case 20 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:350:9: 'honest'
					{
					match("honest"); 

					}
					break;
				case 21 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:351:9: 'lovely'
					{
					match("lovely"); 

					}
					break;
				case 22 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:352:9: 'loving'
					{
					match("loving"); 

					}
					break;
				case 23 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:353:9: 'mighty'
					{
					match("mighty"); 

					}
					break;
				case 24 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:354:9: 'noble'
					{
					match("noble"); 

					}
					break;
				case 25 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:355:9: 'peaceful'
					{
					match("peaceful"); 

					}
					break;
				case 26 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:356:9: 'pretty'
					{
					match("pretty"); 

					}
					break;
				case 27 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:357:9: 'prompt'
					{
					match("prompt"); 

					}
					break;
				case 28 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:358:9: 'proud'
					{
					match("proud"); 

					}
					break;
				case 29 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:359:9: 'reddest'
					{
					match("reddest"); 

					}
					break;
				case 30 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:360:9: 'rich'
					{
					match("rich"); 

					}
					break;
				case 31 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:361:9: 'smooth'
					{
					match("smooth"); 

					}
					break;
				case 32 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:362:9: 'sunny'
					{
					match("sunny"); 

					}
					break;
				case 33 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:363:9: 'sweet'
					{
					match("sweet"); 

					}
					break;
				case 34 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:364:9: 'sweetest'
					{
					match("sweetest"); 

					}
					break;
				case 35 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:365:9: 'trustworthy'
					{
					match("trustworthy"); 

					}
					break;
				case 36 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:366:9: 'warm'
					{
					match("warm"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSITIVEADJECTIVE"

	// $ANTLR start "NEUTRALADJECTIVE"
	public final void mNEUTRALADJECTIVE() throws RecognitionException {
		try {
			int _type = NEUTRALADJECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:371:5: ( 'big' | 'black' | 'blue' | 'bluest' | 'bottomless' | 'furry' | 'green' | 'hard' | 'huge' | 'large' | 'little' | 'normal' | 'old' | 'purple' | 'red' | 'rural' | 'small' | 'tiny' | 'white' | 'yellow' )
			int alt6=20;
			switch ( input.LA(1) ) {
			case 'b':
				{
				switch ( input.LA(2) ) {
				case 'i':
					{
					alt6=1;
					}
					break;
				case 'l':
					{
					int LA6_15 = input.LA(3);
					if ( (LA6_15=='a') ) {
						alt6=2;
					}
					else if ( (LA6_15=='u') ) {
						int LA6_24 = input.LA(4);
						if ( (LA6_24=='e') ) {
							int LA6_25 = input.LA(5);
							if ( (LA6_25=='s') ) {
								alt6=4;
							}

							else {
								alt6=3;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'o':
					{
					alt6=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'f':
				{
				alt6=6;
				}
				break;
			case 'g':
				{
				alt6=7;
				}
				break;
			case 'h':
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4=='a') ) {
					alt6=8;
				}
				else if ( (LA6_4=='u') ) {
					alt6=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				int LA6_5 = input.LA(2);
				if ( (LA6_5=='a') ) {
					alt6=10;
				}
				else if ( (LA6_5=='i') ) {
					alt6=11;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'n':
				{
				alt6=12;
				}
				break;
			case 'o':
				{
				alt6=13;
				}
				break;
			case 'p':
				{
				alt6=14;
				}
				break;
			case 'r':
				{
				int LA6_9 = input.LA(2);
				if ( (LA6_9=='e') ) {
					alt6=15;
				}
				else if ( (LA6_9=='u') ) {
					alt6=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt6=17;
				}
				break;
			case 't':
				{
				alt6=18;
				}
				break;
			case 'w':
				{
				alt6=19;
				}
				break;
			case 'y':
				{
				alt6=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:371:9: 'big'
					{
					match("big"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:372:9: 'black'
					{
					match("black"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:373:9: 'blue'
					{
					match("blue"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:374:9: 'bluest'
					{
					match("bluest"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:375:9: 'bottomless'
					{
					match("bottomless"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:376:9: 'furry'
					{
					match("furry"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:377:9: 'green'
					{
					match("green"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:378:9: 'hard'
					{
					match("hard"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:379:9: 'huge'
					{
					match("huge"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:380:9: 'large'
					{
					match("large"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:381:9: 'little'
					{
					match("little"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:382:9: 'normal'
					{
					match("normal"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:383:9: 'old'
					{
					match("old"); 

					}
					break;
				case 14 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:384:9: 'purple'
					{
					match("purple"); 

					}
					break;
				case 15 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:385:9: 'red'
					{
					match("red"); 

					}
					break;
				case 16 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:386:9: 'rural'
					{
					match("rural"); 

					}
					break;
				case 17 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:387:9: 'small'
					{
					match("small"); 

					}
					break;
				case 18 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:388:9: 'tiny'
					{
					match("tiny"); 

					}
					break;
				case 19 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:389:9: 'white'
					{
					match("white"); 

					}
					break;
				case 20 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:390:9: 'yellow'
					{
					match("yellow"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEUTRALADJECTIVE"

	// $ANTLR start "NEGATIVEADJECTIVE"
	public final void mNEGATIVEADJECTIVE() throws RecognitionException {
		try {
			int _type = NEGATIVEADJECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:395:5: ( 'bad' | 'cowardly' | 'cursed' | 'damned' | 'dirty' | 'disgusting' | 'distasteful' | 'dusty' | 'evil' | 'fat' | 'fat-kidneyed' | 'fatherless' | 'foul' | 'hairy' | 'half-witted' | 'horrible' | 'horrid' | 'infected' | 'lying' | 'miserable' | 'misused' | 'oozing' | 'rotten' | 'smelly' | 'snotty' | 'sorry' | 'stinking' | 'stuffed' | 'stupid' | 'vile' | 'villainous' | 'worried' )
			int alt7=32;
			switch ( input.LA(1) ) {
			case 'b':
				{
				alt7=1;
				}
				break;
			case 'c':
				{
				int LA7_2 = input.LA(2);
				if ( (LA7_2=='o') ) {
					alt7=2;
				}
				else if ( (LA7_2=='u') ) {
					alt7=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt7=4;
					}
					break;
				case 'i':
					{
					int LA7_18 = input.LA(3);
					if ( (LA7_18=='r') ) {
						alt7=5;
					}
					else if ( (LA7_18=='s') ) {
						int LA7_31 = input.LA(4);
						if ( (LA7_31=='g') ) {
							alt7=6;
						}
						else if ( (LA7_31=='t') ) {
							alt7=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 31, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'u':
					{
					alt7=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'e':
				{
				alt7=9;
				}
				break;
			case 'f':
				{
				int LA7_5 = input.LA(2);
				if ( (LA7_5=='a') ) {
					int LA7_20 = input.LA(3);
					if ( (LA7_20=='t') ) {
						switch ( input.LA(4) ) {
						case '-':
							{
							alt7=11;
							}
							break;
						case 'h':
							{
							alt7=12;
							}
							break;
						default:
							alt7=10;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_5=='o') ) {
					alt7=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'h':
				{
				int LA7_6 = input.LA(2);
				if ( (LA7_6=='a') ) {
					int LA7_22 = input.LA(3);
					if ( (LA7_22=='i') ) {
						alt7=14;
					}
					else if ( (LA7_22=='l') ) {
						alt7=15;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_6=='o') ) {
					int LA7_23 = input.LA(3);
					if ( (LA7_23=='r') ) {
						int LA7_35 = input.LA(4);
						if ( (LA7_35=='r') ) {
							int LA7_45 = input.LA(5);
							if ( (LA7_45=='i') ) {
								int LA7_52 = input.LA(6);
								if ( (LA7_52=='b') ) {
									alt7=16;
								}
								else if ( (LA7_52=='d') ) {
									alt7=17;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 7, 52, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 45, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 35, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 23, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'i':
				{
				alt7=18;
				}
				break;
			case 'l':
				{
				alt7=19;
				}
				break;
			case 'm':
				{
				int LA7_9 = input.LA(2);
				if ( (LA7_9=='i') ) {
					int LA7_24 = input.LA(3);
					if ( (LA7_24=='s') ) {
						int LA7_36 = input.LA(4);
						if ( (LA7_36=='e') ) {
							alt7=20;
						}
						else if ( (LA7_36=='u') ) {
							alt7=21;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'o':
				{
				alt7=22;
				}
				break;
			case 'r':
				{
				alt7=23;
				}
				break;
			case 's':
				{
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt7=24;
					}
					break;
				case 'n':
					{
					alt7=25;
					}
					break;
				case 'o':
					{
					alt7=26;
					}
					break;
				case 't':
					{
					int LA7_28 = input.LA(3);
					if ( (LA7_28=='i') ) {
						alt7=27;
					}
					else if ( (LA7_28=='u') ) {
						int LA7_38 = input.LA(4);
						if ( (LA7_38=='f') ) {
							alt7=28;
						}
						else if ( (LA7_38=='p') ) {
							alt7=29;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 38, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'v':
				{
				int LA7_13 = input.LA(2);
				if ( (LA7_13=='i') ) {
					int LA7_29 = input.LA(3);
					if ( (LA7_29=='l') ) {
						int LA7_39 = input.LA(4);
						if ( (LA7_39=='e') ) {
							alt7=30;
						}
						else if ( (LA7_39=='l') ) {
							alt7=31;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 39, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 29, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'w':
				{
				alt7=32;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:395:9: 'bad'
					{
					match("bad"); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:396:9: 'cowardly'
					{
					match("cowardly"); 

					}
					break;
				case 3 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:397:9: 'cursed'
					{
					match("cursed"); 

					}
					break;
				case 4 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:398:9: 'damned'
					{
					match("damned"); 

					}
					break;
				case 5 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:399:9: 'dirty'
					{
					match("dirty"); 

					}
					break;
				case 6 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:400:9: 'disgusting'
					{
					match("disgusting"); 

					}
					break;
				case 7 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:401:9: 'distasteful'
					{
					match("distasteful"); 

					}
					break;
				case 8 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:402:9: 'dusty'
					{
					match("dusty"); 

					}
					break;
				case 9 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:403:9: 'evil'
					{
					match("evil"); 

					}
					break;
				case 10 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:404:9: 'fat'
					{
					match("fat"); 

					}
					break;
				case 11 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:405:9: 'fat-kidneyed'
					{
					match("fat-kidneyed"); 

					}
					break;
				case 12 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:406:9: 'fatherless'
					{
					match("fatherless"); 

					}
					break;
				case 13 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:407:9: 'foul'
					{
					match("foul"); 

					}
					break;
				case 14 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:408:9: 'hairy'
					{
					match("hairy"); 

					}
					break;
				case 15 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:409:9: 'half-witted'
					{
					match("half-witted"); 

					}
					break;
				case 16 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:410:9: 'horrible'
					{
					match("horrible"); 

					}
					break;
				case 17 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:411:9: 'horrid'
					{
					match("horrid"); 

					}
					break;
				case 18 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:412:9: 'infected'
					{
					match("infected"); 

					}
					break;
				case 19 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:413:9: 'lying'
					{
					match("lying"); 

					}
					break;
				case 20 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:414:9: 'miserable'
					{
					match("miserable"); 

					}
					break;
				case 21 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:415:9: 'misused'
					{
					match("misused"); 

					}
					break;
				case 22 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:416:9: 'oozing'
					{
					match("oozing"); 

					}
					break;
				case 23 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:417:9: 'rotten'
					{
					match("rotten"); 

					}
					break;
				case 24 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:418:9: 'smelly'
					{
					match("smelly"); 

					}
					break;
				case 25 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:419:9: 'snotty'
					{
					match("snotty"); 

					}
					break;
				case 26 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:420:9: 'sorry'
					{
					match("sorry"); 

					}
					break;
				case 27 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:421:9: 'stinking'
					{
					match("stinking"); 

					}
					break;
				case 28 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:422:9: 'stuffed'
					{
					match("stuffed"); 

					}
					break;
				case 29 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:423:9: 'stupid'
					{
					match("stupid"); 

					}
					break;
				case 30 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:424:9: 'vile'
					{
					match("vile"); 

					}
					break;
				case 31 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:425:9: 'villainous'
					{
					match("villainous"); 

					}
					break;
				case 32 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:426:9: 'worried'
					{
					match("worried"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATIVEADJECTIVE"

	// $ANTLR start "ACT"
	public final void mACT() throws RecognitionException {
		try {
			int _type = ACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:431:10: ( 'Act' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:431:14: 'Act'
			{
			match("Act"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACT"

	// $ANTLR start "SCENE"
	public final void mSCENE() throws RecognitionException {
		try {
			int _type = SCENE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:432:13: ( 'Scene' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:432:18: 'Scene'
			{
			match("Scene"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCENE"

	// $ANTLR start "ENTER"
	public final void mENTER() throws RecognitionException {
		try {
			int _type = ENTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:433:17: ( 'Enter' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:433:19: 'Enter'
			{
			match("Enter"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTER"

	// $ANTLR start "EXIT"
	public final void mEXIT() throws RecognitionException {
		try {
			int _type = EXIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:434:17: ( 'Exit' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:434:25: 'Exit'
			{
			match("Exit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXIT"

	// $ANTLR start "EXEUNT"
	public final void mEXEUNT() throws RecognitionException {
		try {
			int _type = EXEUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:435:17: ( 'Exeunt' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:435:25: 'Exeunt'
			{
			match("Exeunt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXEUNT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:436:14: ( 'and' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:436:16: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "YOU"
	public final void mYOU() throws RecognitionException {
		try {
			int _type = YOU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:440:14: ( 'You' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:440:18: 'You'
			{
			match("You"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YOU"

	// $ANTLR start "ARE"
	public final void mARE() throws RecognitionException {
		try {
			int _type = ARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:441:10: ( 'are' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:441:14: 'are'
			{
			match("are"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARE"

	// $ANTLR start "THOUART"
	public final void mTHOUART() throws RecognitionException {
		try {
			int _type = THOUART;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:442:13: ( 'Thou art' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:442:17: 'Thou art'
			{
			match("Thou art"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THOUART"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:443:10: ( 'as' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:443:14: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "SUMOF"
	public final void mSUMOF() throws RecognitionException {
		try {
			int _type = SUMOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:444:14: ( 'the sum of' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:444:18: 'the sum of'
			{
			match("the sum of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUMOF"

	// $ANTLR start "DIFFBET"
	public final void mDIFFBET() throws RecognitionException {
		try {
			int _type = DIFFBET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:445:17: ( 'the difference between' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:445:21: 'the difference between'
			{
			match("the difference between"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFFBET"

	// $ANTLR start "PRODOF"
	public final void mPRODOF() throws RecognitionException {
		try {
			int _type = PRODOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:446:10: ( 'the product of' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:446:14: 'the product of'
			{
			match("the product of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRODOF"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			int _type = A;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:447:4: ( 'a' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:447:8: 'a'
			{
			match('a'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "THYSELF"
	public final void mTHYSELF() throws RecognitionException {
		try {
			int _type = THYSELF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:448:10: ( 'thyself' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:448:14: 'thyself'
			{
			match("thyself"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THYSELF"

	// $ANTLR start "AMI"
	public final void mAMI() throws RecognitionException {
		try {
			int _type = AMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:452:6: ( 'Am I' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:452:8: 'Am I'
			{
			match("Am I"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMI"

	// $ANTLR start "BETTER"
	public final void mBETTER() throws RecognitionException {
		try {
			int _type = BETTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:453:9: ( 'better' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:453:14: 'better'
			{
			match("better"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BETTER"

	// $ANTLR start "WORSE"
	public final void mWORSE() throws RecognitionException {
		try {
			int _type = WORSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:454:8: ( 'worse' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:454:11: 'worse'
			{
			match("worse"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORSE"

	// $ANTLR start "THAN"
	public final void mTHAN() throws RecognitionException {
		try {
			int _type = THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:455:7: ( 'than' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:455:9: 'than'
			{
			match("than"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THAN"

	// $ANTLR start "YOUC"
	public final void mYOUC() throws RecognitionException {
		try {
			int _type = YOUC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:456:7: ( 'you' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:456:10: 'you'
			{
			match("you"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YOUC"

	// $ANTLR start "SCENEC"
	public final void mSCENEC() throws RecognitionException {
		try {
			int _type = SCENEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:457:9: ( 'scene' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:457:11: 'scene'
			{
			match("scene"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCENEC"

	// $ANTLR start "IFSO"
	public final void mIFSO() throws RecognitionException {
		try {
			int _type = IFSO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:458:7: ( 'If so,' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:458:9: 'If so,'
			{
			match("If so,"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IFSO"

	// $ANTLR start "IFNOT"
	public final void mIFNOT() throws RecognitionException {
		try {
			int _type = IFNOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:459:8: ( 'If not,' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:459:10: 'If not,'
			{
			match("If not,"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IFNOT"

	// $ANTLR start "LETUS"
	public final void mLETUS() throws RecognitionException {
		try {
			int _type = LETUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:460:8: ( 'let us' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:460:10: 'let us'
			{
			match("let us"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETUS"

	// $ANTLR start "WESHALL"
	public final void mWESHALL() throws RecognitionException {
		try {
			int _type = WESHALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:461:10: ( 'we shall' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:461:12: 'we shall'
			{
			match("we shall"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WESHALL"

	// $ANTLR start "WEMUST"
	public final void mWEMUST() throws RecognitionException {
		try {
			int _type = WEMUST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:462:9: ( 'we must' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:462:11: 'we must'
			{
			match("we must"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WEMUST"

	// $ANTLR start "RETURNTO"
	public final void mRETURNTO() throws RecognitionException {
		try {
			int _type = RETURNTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:463:10: ( 'return to' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:463:12: 'return to'
			{
			match("return to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURNTO"

	// $ANTLR start "PROCEEDTO"
	public final void mPROCEEDTO() throws RecognitionException {
		try {
			int _type = PROCEEDTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:464:11: ( 'proceed to' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:464:13: 'proceed to'
			{
			match("proceed to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROCEEDTO"

	// $ANTLR start "PRINTVALUE"
	public final void mPRINTVALUE() throws RecognitionException {
		try {
			int _type = PRINTVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:468:17: ( 'Open your heart' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:468:25: 'Open your heart'
			{
			match("Open your heart"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTVALUE"

	// $ANTLR start "PRINTASCII"
	public final void mPRINTASCII() throws RecognitionException {
		try {
			int _type = PRINTASCII;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:469:17: ( 'Speak your mind' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:469:25: 'Speak your mind'
			{
			match("Speak your mind"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTASCII"

	// $ANTLR start "READVALUE"
	public final void mREADVALUE() throws RecognitionException {
		try {
			int _type = READVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:470:17: ( 'Open your mind' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:470:25: 'Open your mind'
			{
			match("Open your mind"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READVALUE"

	// $ANTLR start "READASCII"
	public final void mREADASCII() throws RecognitionException {
		try {
			int _type = READASCII;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:471:17: ( 'Listen to your heart' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:471:25: 'Listen to your heart'
			{
			match("Listen to your heart"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READASCII"

	// $ANTLR start "REMEMBER"
	public final void mREMEMBER() throws RecognitionException {
		try {
			int _type = REMEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:475:10: ( 'Remember' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:475:15: 'Remember'
			{
			match("Remember"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REMEMBER"

	// $ANTLR start "ME"
	public final void mME() throws RecognitionException {
		try {
			int _type = ME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:476:5: ( 'me' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:476:10: 'me'
			{
			match("me"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ME"

	// $ANTLR start "YOURSELF"
	public final void mYOURSELF() throws RecognitionException {
		try {
			int _type = YOURSELF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:477:10: ( 'yourself' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:477:15: 'yourself'
			{
			match("yourself"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YOURSELF"

	// $ANTLR start "RECALL"
	public final void mRECALL() throws RecognitionException {
		try {
			int _type = RECALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:478:9: ( 'Recall' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:478:14: 'Recall'
			{
			match("Recall"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECALL"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:483:10: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:486:9: ( '0' .. '9' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:489:6: ( ':' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:489:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "CM"
	public final void mCM() throws RecognitionException {
		try {
			int _type = CM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:490:6: ( ',' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:490:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CM"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:491:9: ( '.' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:491:13: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:492:7: ( ';' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:492:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "AP"
	public final void mAP() throws RecognitionException {
		try {
			int _type = AP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:493:9: ( '\\'' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:493:13: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AP"

	// $ANTLR start "EP"
	public final void mEP() throws RecognitionException {
		try {
			int _type = EP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:494:9: ( '!' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:494:13: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EP"

	// $ANTLR start "QM"
	public final void mQM() throws RecognitionException {
		try {
			int _type = QM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:495:9: ( '?' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:495:13: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QM"

	// $ANTLR start "FS"
	public final void mFS() throws RecognitionException {
		try {
			int _type = FS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:496:6: ( '/' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:496:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FS"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:497:6: ( '[' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:497:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:498:6: ( ']' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:498:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:501:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:501:9: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:502:9: ( LETTER | DIGIT | '_' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:507:6: ( ( ', ' | ': ' ) ( (~ ( '\\n' | '\\r' ) )* ) ( '\\r' )? '\\n' )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:9: ( ', ' | ': ' ) ( (~ ( '\\n' | '\\r' ) )* ) ( '\\r' )? '\\n'
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:9: ( ', ' | ': ' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==',') ) {
				alt9=1;
			}
			else if ( (LA9_0==':') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:10: ', '
					{
					match(", "); 

					}
					break;
				case 2 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:17: ': '
					{
					match(": "); 

					}
					break;

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:23: ( (~ ( '\\n' | '\\r' ) )* )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:26: (~ ( '\\n' | '\\r' ) )*
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:26: (~ ( '\\n' | '\\r' ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			}

			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:42: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:508:42: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:513:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:514:2: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:514:2: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:528:17: ( . )
			// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:528:19: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TK"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:8: ( CHARACTER | POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ACT | SCENE | ENTER | EXIT | EXEUNT | AND | YOU | ARE | THOUART | AS | SUMOF | DIFFBET | PRODOF | A | THYSELF | AMI | BETTER | WORSE | THAN | YOUC | SCENEC | IFSO | IFNOT | LETUS | WESHALL | WEMUST | RETURNTO | PROCEEDTO | PRINTVALUE | PRINTASCII | READVALUE | READASCII | REMEMBER | ME | YOURSELF | RECALL | CL | CM | DOT | SC | AP | EP | QM | FS | LB | RB | ID | COMMENT | WS | ERROR_TK )
		int alt13=57;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:10: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 2 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:20: POSITIVENOUN
				{
				mPOSITIVENOUN(); 

				}
				break;
			case 3 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:33: NEUTRALNOUN
				{
				mNEUTRALNOUN(); 

				}
				break;
			case 4 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:45: NEGATIVENOUN
				{
				mNEGATIVENOUN(); 

				}
				break;
			case 5 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:58: POSITIVEADJECTIVE
				{
				mPOSITIVEADJECTIVE(); 

				}
				break;
			case 6 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:76: NEUTRALADJECTIVE
				{
				mNEUTRALADJECTIVE(); 

				}
				break;
			case 7 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:93: NEGATIVEADJECTIVE
				{
				mNEGATIVEADJECTIVE(); 

				}
				break;
			case 8 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:111: ACT
				{
				mACT(); 

				}
				break;
			case 9 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:115: SCENE
				{
				mSCENE(); 

				}
				break;
			case 10 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:121: ENTER
				{
				mENTER(); 

				}
				break;
			case 11 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:127: EXIT
				{
				mEXIT(); 

				}
				break;
			case 12 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:132: EXEUNT
				{
				mEXEUNT(); 

				}
				break;
			case 13 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:139: AND
				{
				mAND(); 

				}
				break;
			case 14 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:143: YOU
				{
				mYOU(); 

				}
				break;
			case 15 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:147: ARE
				{
				mARE(); 

				}
				break;
			case 16 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:151: THOUART
				{
				mTHOUART(); 

				}
				break;
			case 17 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:159: AS
				{
				mAS(); 

				}
				break;
			case 18 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:162: SUMOF
				{
				mSUMOF(); 

				}
				break;
			case 19 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:168: DIFFBET
				{
				mDIFFBET(); 

				}
				break;
			case 20 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:176: PRODOF
				{
				mPRODOF(); 

				}
				break;
			case 21 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:183: A
				{
				mA(); 

				}
				break;
			case 22 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:185: THYSELF
				{
				mTHYSELF(); 

				}
				break;
			case 23 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:193: AMI
				{
				mAMI(); 

				}
				break;
			case 24 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:197: BETTER
				{
				mBETTER(); 

				}
				break;
			case 25 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:204: WORSE
				{
				mWORSE(); 

				}
				break;
			case 26 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:210: THAN
				{
				mTHAN(); 

				}
				break;
			case 27 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:215: YOUC
				{
				mYOUC(); 

				}
				break;
			case 28 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:220: SCENEC
				{
				mSCENEC(); 

				}
				break;
			case 29 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:227: IFSO
				{
				mIFSO(); 

				}
				break;
			case 30 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:232: IFNOT
				{
				mIFNOT(); 

				}
				break;
			case 31 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:238: LETUS
				{
				mLETUS(); 

				}
				break;
			case 32 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:244: WESHALL
				{
				mWESHALL(); 

				}
				break;
			case 33 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:252: WEMUST
				{
				mWEMUST(); 

				}
				break;
			case 34 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:259: RETURNTO
				{
				mRETURNTO(); 

				}
				break;
			case 35 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:268: PROCEEDTO
				{
				mPROCEEDTO(); 

				}
				break;
			case 36 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:278: PRINTVALUE
				{
				mPRINTVALUE(); 

				}
				break;
			case 37 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:289: PRINTASCII
				{
				mPRINTASCII(); 

				}
				break;
			case 38 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:300: READVALUE
				{
				mREADVALUE(); 

				}
				break;
			case 39 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:310: READASCII
				{
				mREADASCII(); 

				}
				break;
			case 40 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:320: REMEMBER
				{
				mREMEMBER(); 

				}
				break;
			case 41 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:329: ME
				{
				mME(); 

				}
				break;
			case 42 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:332: YOURSELF
				{
				mYOURSELF(); 

				}
				break;
			case 43 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:341: RECALL
				{
				mRECALL(); 

				}
				break;
			case 44 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:348: CL
				{
				mCL(); 

				}
				break;
			case 45 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:351: CM
				{
				mCM(); 

				}
				break;
			case 46 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:354: DOT
				{
				mDOT(); 

				}
				break;
			case 47 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:358: SC
				{
				mSC(); 

				}
				break;
			case 48 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:361: AP
				{
				mAP(); 

				}
				break;
			case 49 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:364: EP
				{
				mEP(); 

				}
				break;
			case 50 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:367: QM
				{
				mQM(); 

				}
				break;
			case 51 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:370: FS
				{
				mFS(); 

				}
				break;
			case 52 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:373: LB
				{
				mLB(); 

				}
				break;
			case 53 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:376: RB
				{
				mRB(); 

				}
				break;
			case 54 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:379: ID
				{
				mID(); 

				}
				break;
			case 55 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:382: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 56 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:390: WS
				{
				mWS(); 

				}
				break;
			case 57 :
				// /Users/riccardocontessi/Public/LFC_project/Workspace_Shakespeare/src/compilerPackage/Shakespeare.g:1:393: ERROR_TK
				{
				mERROR_TK(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA3_eotS =
		"\100\uffff";
	static final String DFA3_eofS =
		"\100\uffff";
	static final String DFA3_minS =
		"\1\141\1\156\1\uffff\3\141\1\162\2\141\1\151\1\145\1\uffff\1\157\1\151"+
		"\1\150\6\uffff\1\165\2\uffff\1\143\1\uffff\1\141\1\151\1\uffff\1\155\1"+
		"\uffff\1\157\3\uffff\1\141\14\uffff\1\156\11\uffff\2\144\4\uffff";
	static final String DFA3_maxS =
		"\1\167\1\165\1\uffff\2\157\1\145\1\162\1\157\1\141\2\157\1\uffff\1\157"+
		"\1\164\1\162\6\uffff\1\167\2\uffff\1\164\1\uffff\1\141\1\155\1\uffff\1"+
		"\156\1\uffff\1\164\3\uffff\1\155\14\uffff\1\156\11\uffff\1\144\1\163\4"+
		"\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\10\uffff\1\35\3\uffff\1\50\1\51\1\1\1\2\1\4\1\5\1\uffff\1"+
		"\10\1\11\1\uffff\1\14\2\uffff\1\23\1\uffff\1\26\1\uffff\1\32\1\33\1\34"+
		"\1\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\6\1\7\1\12\1\13\1\uffff"+
		"\1\21\1\22\1\24\1\25\1\27\1\30\1\31\1\36\1\37\2\uffff\1\15\1\16\1\17\1"+
		"\20";
	static final String DFA3_specialS =
		"\100\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\3\uffff\1\10\1\11\1\12\1\uffff\1"+
			"\13\1\uffff\1\14\1\15\1\16\1\17\1\uffff\1\20",
			"\1\21\6\uffff\1\22",
			"",
			"\1\23\6\uffff\1\24\6\uffff\1\25",
			"\1\26\15\uffff\1\27",
			"\1\30\3\uffff\1\31",
			"\1\32",
			"\1\33\15\uffff\1\34",
			"\1\35",
			"\1\36\5\uffff\1\37",
			"\1\40\3\uffff\1\41\5\uffff\1\42",
			"",
			"\1\43",
			"\1\44\1\uffff\1\45\3\uffff\1\46\1\uffff\1\47\2\uffff\1\50",
			"\1\51\6\uffff\1\52\2\uffff\1\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54\1\uffff\1\55",
			"",
			"",
			"\1\56\20\uffff\1\57",
			"",
			"\1\60",
			"\1\61\3\uffff\1\62",
			"",
			"\1\63\1\64",
			"",
			"\1\65\2\uffff\1\66\1\uffff\1\67",
			"",
			"",
			"",
			"\1\70\13\uffff\1\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\72",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\74\1\uffff\1\75\6\uffff\1\76\5\uffff\1\77",
			"",
			"",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "255:1: NEUTRALNOUN : ( 'animal' | 'aunt' | 'brother' | 'cat' | 'chihuahua' | 'cousin' | 'cow' | 'daughter' | 'door' | 'face' | 'father' | 'fellow' | 'granddaughter' | 'grandfather' | 'grandmother' | 'grandson' | 'hair' | 'hamster' | 'horse' | 'lamp' | 'lantern' | 'mistletoe' | 'moon' | 'morning' | 'mother' | 'nephew' | 'niece' | 'nose' | 'purse' | 'road' | 'roman' | 'sister' | 'sky' | 'son' | 'squirrel' | 'stonewall' | 'thing' | 'town' | 'tree' | 'uncle' | 'wind' );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\17\72\1\132\32\72\1\u00b3\1\u00b4\13\uffff\2\72\1\uffff\36\72"+
		"\1\u00e4\1\uffff\73\72\1\u0156\33\72\14\uffff\42\72\1\u019d\2\72\1\u01a0"+
		"\1\uffff\3\72\1\u01a5\20\72\1\u01b7\3\72\1\u01bb\4\72\1\u01b7\6\72\2\u01c9"+
		"\20\72\1\u01dc\7\72\1\u01a5\11\72\1\u01dc\1\u01c9\3\72\1\u01c9\32\72\1"+
		"\u01b7\10\72\1\uffff\20\72\1\u01b7\3\72\1\uffff\2\72\1\u01dc\2\72\1\u0233"+
		"\2\72\1\u0237\1\uffff\3\72\1\u023b\1\uffff\4\72\1\u0242\2\72\1\u01b7\4"+
		"\72\1\u01bb\22\72\1\u01bb\2\72\1\uffff\1\u01c9\1\72\1\uffff\2\72\1\u01c9"+
		"\1\72\1\uffff\1\72\1\u0262\1\72\1\u0262\1\72\1\u01a5\1\72\1\u01c9\1\72"+
		"\1\u01b7\1\72\1\u01dc\1\72\1\u01bb\3\72\1\uffff\2\72\1\u01dc\1\uffff\1"+
		"\u01bb\1\72\1\u01bb\12\72\1\uffff\15\72\1\u01bb\1\u01c9\3\72\1\uffff\1"+
		"\72\1\u0262\13\72\1\u01dc\1\u0262\10\72\1\u0262\3\72\1\u01c9\12\72\1\u01b7"+
		"\1\72\1\u0262\1\72\1\u01c9\3\72\1\uffff\10\72\1\u01c9\4\72\1\u01c9\3\72"+
		"\1\uffff\1\72\1\u02c4\1\u01c9\1\u01b7\1\u01c9\1\72\1\u01dc\1\72\1\u01c9"+
		"\1\u0262\1\u01b7\3\72\2\uffff\1\72\1\u01a5\3\72\1\uffff\1\72\1\u01a5\1"+
		"\72\1\uffff\1\72\1\u02d1\1\72\3\uffff\1\u0242\3\72\1\uffff\2\72\1\u0242"+
		"\5\72\1\uffff\2\72\1\uffff\12\72\1\u02ea\1\72\1\u01bb\6\72\1\uffff\1\72"+
		"\1\u01dc\1\72\1\u0262\1\u01a5\3\72\1\u01c9\1\72\1\u01b7\2\72\1\u01c9\4"+
		"\72\1\u0262\2\72\1\u0262\1\72\1\u01a5\7\72\1\u01dc\1\72\1\u0262\1\72\1"+
		"\u030b\1\u01c9\3\72\1\u01dc\2\72\1\u0262\6\72\1\u01dc\7\72\1\u01b7\4\72"+
		"\2\u01b7\2\72\1\u01a5\2\72\1\u01a5\1\72\1\u01dc\3\72\1\u01dc\1\u01b7\3"+
		"\72\1\u01a5\7\72\1\u01c9\1\u0262\1\72\1\u01c9\3\uffff\1\72\1\uffff\1\72"+
		"\1\u01c9\1\72\1\u033c\1\u01dc\6\72\1\u0343\1\uffff\2\72\1\u0346\2\u0242"+
		"\1\u01bb\2\72\1\u0242\2\72\1\uffff\1\u0242\5\72\1\u0242\5\72\2\uffff\1"+
		"\u01c9\1\72\1\u01bb\1\u01c9\1\u01b7\1\u01c9\5\72\1\u01a5\1\u0262\1\u01b7"+
		"\1\u01dc\1\72\2\u0262\2\72\1\u01c9\5\72\1\u01a5\1\u0262\1\u01a5\1\72\1"+
		"\u01a5\1\uffff\1\u01a5\5\72\1\u01b7\1\72\1\u036b\2\72\1\u01dc\3\72\1\u01c9"+
		"\1\u01b7\1\72\1\u01a5\3\72\1\u01a5\10\72\2\u0262\1\72\1\u01dc\2\u0262"+
		"\3\72\1\u0262\1\72\2\u01c9\1\u01dc\3\72\1\uffff\1\72\1\u01a5\1\u01dc\3"+
		"\72\1\uffff\1\u038a\1\72\1\uffff\2\72\1\uffff\1\u0242\1\uffff\2\u0242"+
		"\1\72\1\u0242\3\72\1\u0242\1\72\1\u0242\1\u0262\2\72\1\u01c9\1\72\1\u0262"+
		"\7\72\1\u01a5\1\72\1\u0262\1\uffff\1\u01bb\1\u01c9\1\u01b7\1\72\1\uffff"+
		"\1\u01b7\6\72\1\u0262\3\72\1\u01b7\6\72\1\u01c9\2\72\1\u01a5\1\u01c9\1"+
		"\u03b1\1\72\1\u01a5\4\72\1\uffff\1\u03b7\1\u0242\1\72\1\uffff\1\u0242"+
		"\3\72\1\u0242\2\72\1\u0262\1\u01a5\1\u0262\1\uffff\1\u01c9\2\72\1\u01a5"+
		"\1\u0262\4\72\1\u0262\1\u01a5\1\u01b7\1\u0262\1\u01c9\6\72\1\u01c9\2\72"+
		"\1\uffff\2\72\1\u03cf\1\u01a5\1\72\1\uffff\1\72\1\uffff\1\u01b7\2\u0242"+
		"\1\72\1\u01bb\1\u01c9\1\72\1\u0262\2\72\1\u01c9\1\u0262\5\72\1\u01c9\1"+
		"\u01a5\2\72\1\uffff\2\72\1\uffff\1\u01a5\1\u01b7\1\u0262\1\u01dc\1\u01a5"+
		"\6\72\1\u01a5\1\u0242\2\uffff\1\u01a5\1\72\2\u01c9\2\u0262\1\72\1\u01c9";
	static final String DFA13_eofS =
		"\u03ea\uffff";
	static final String DFA13_minS =
		"\1\0\1\145\2\141\1\145\1\141\1\160\1\145\1\154\2\141\1\165\1\145\1\157"+
		"\1\143\1\151\1\60\2\141\1\157\1\145\1\143\1\145\1\151\3\141\1\145\1\141"+
		"\2\145\1\150\1\156\1\141\1\155\1\154\1\145\1\156\1\151\1\143\1\156\1\157"+
		"\1\146\2\40\13\uffff\1\155\1\143\1\uffff\1\154\1\147\1\155\1\141\1\157"+
		"\1\162\1\144\1\162\1\163\1\145\1\141\1\142\1\157\1\141\1\162\2\143\1\156"+
		"\1\154\1\163\1\154\1\157\1\171\2\145\1\156\1\144\1\156\1\141\1\145\1\60"+
		"\1\uffff\1\151\1\143\1\154\1\156\1\162\1\165\1\151\1\141\2\147\1\171\1"+
		"\141\1\156\1\162\1\147\1\141\1\145\1\155\1\163\1\171\1\156\1\165\2\141"+
		"\1\145\1\157\1\145\1\141\1\144\1\143\1\162\1\156\1\141\1\144\2\141\1\154"+
		"\1\147\1\164\1\141\1\144\1\156\1\145\1\155\1\157\2\141\1\162\1\163\2\141"+
		"\1\156\1\155\2\145\1\166\1\151\1\147\1\157\1\60\1\160\1\145\1\142\2\141"+
		"\1\145\1\156\1\143\1\156\1\162\1\154\1\151\1\40\1\142\1\151\1\144\1\172"+
		"\1\154\1\165\1\146\1\154\1\164\1\40\1\164\1\145\1\165\1\40\14\uffff\2"+
		"\145\1\141\1\151\1\157\1\154\1\166\1\154\1\163\1\164\1\171\1\162\1\144"+
		"\1\164\1\145\1\156\1\172\1\141\2\165\1\143\1\144\1\162\1\161\1\147\1\144"+
		"\1\157\1\163\1\154\1\156\1\141\1\147\1\145\1\155\1\60\1\164\1\172\1\60"+
		"\1\uffff\1\167\1\162\1\145\1\60\1\151\1\162\1\154\1\145\1\162\1\154\1"+
		"\160\1\162\1\163\1\145\2\144\1\146\1\157\1\154\1\162\1\60\1\156\2\145"+
		"\1\60\1\155\1\147\1\171\1\160\1\60\1\143\1\164\1\143\1\155\1\156\1\164"+
		"\2\60\1\162\1\151\1\156\1\162\1\156\1\146\1\157\2\154\1\145\1\164\1\156"+
		"\1\145\1\144\1\141\1\164\1\60\1\165\1\150\1\141\1\147\1\164\1\166\1\164"+
		"\1\60\1\147\1\165\1\164\2\163\1\143\1\145\1\144\1\164\2\60\1\150\1\162"+
		"\1\163\1\60\1\160\1\163\1\156\1\145\1\141\1\147\1\156\1\162\1\164\2\151"+
		"\1\165\1\164\1\147\1\164\1\156\1\145\1\164\2\144\1\164\1\160\1\164\1\147"+
		"\1\143\1\40\1\60\1\164\1\145\1\156\1\145\1\150\2\156\1\150\1\uffff\1\150"+
		"\1\143\1\145\1\154\1\155\1\156\1\40\1\163\2\156\1\144\1\145\1\163\1\171"+
		"\1\154\1\144\1\60\1\146\1\162\1\164\1\155\1\162\1\154\1\60\1\151\1\154"+
		"\1\60\2\145\1\60\1\uffff\1\145\1\164\1\165\1\60\1\156\1\157\1\155\1\154"+
		"\1\145\1\60\2\145\1\60\1\164\1\162\1\115\1\164\1\60\1\145\1\154\1\40\1"+
		"\151\1\154\1\40\1\144\2\165\1\157\1\165\2\145\1\156\1\160\1\157\1\145"+
		"\1\153\1\60\1\154\1\141\1\uffff\1\60\1\151\1\uffff\1\145\1\164\1\60\1"+
		"\145\1\uffff\1\156\1\60\1\157\1\60\1\171\1\60\1\151\1\60\1\164\1\60\1"+
		"\163\1\60\1\55\1\60\1\164\1\145\1\151\1\uffff\1\144\1\163\1\60\1\uffff"+
		"\1\60\1\165\1\60\1\145\1\154\1\145\1\164\1\160\1\144\2\145\1\171\1\145"+
		"\1\uffff\1\171\1\162\1\145\1\166\1\153\1\146\1\151\1\164\2\154\2\164\1"+
		"\145\2\60\1\156\2\145\1\uffff\1\162\1\60\1\154\1\144\1\150\1\145\2\141"+
		"\1\164\1\145\1\164\1\163\1\153\2\60\1\157\1\165\1\155\1\151\1\162\1\151"+
		"\1\145\1\151\1\60\1\162\1\150\1\145\1\60\1\150\1\154\1\143\1\147\1\171"+
		"\1\165\1\141\1\171\1\144\1\156\1\60\1\145\1\60\1\154\1\60\2\145\1\150"+
		"\1\uffff\2\154\1\156\1\147\1\154\1\162\1\163\1\164\1\60\1\151\3\145\1"+
		"\60\1\145\1\141\1\147\1\144\1\145\4\60\1\164\1\60\1\145\3\60\1\151\2\145"+
		"\2\uffff\1\157\1\60\1\156\1\157\1\163\1\uffff\1\143\1\60\1\141\1\uffff"+
		"\1\162\1\60\1\156\3\uffff\1\60\1\142\1\154\1\164\1\uffff\1\164\1\156\1"+
		"\60\1\165\1\141\1\145\1\156\1\151\1\171\1\157\1\144\1\uffff\1\151\1\172"+
		"\1\146\1\163\1\157\1\156\1\155\1\151\1\145\1\143\1\60\1\40\1\60\1\154"+
		"\1\156\1\162\1\55\1\162\1\145\1\uffff\1\167\1\60\1\156\2\60\1\145\1\157"+
		"\1\150\1\60\1\142\1\60\1\164\1\145\1\60\1\145\1\146\1\171\1\164\1\60\1"+
		"\145\1\162\1\60\1\162\1\60\1\162\1\167\1\141\1\151\1\145\1\144\1\150\1"+
		"\60\1\171\1\60\1\171\2\60\1\156\1\163\1\156\1\60\1\157\1\145\1\60\2\162"+
		"\1\151\1\162\1\145\1\157\1\60\1\164\1\155\1\141\1\151\1\156\1\144\1\145"+
		"\1\60\1\156\1\145\1\164\1\144\2\60\1\151\1\150\1\60\2\163\1\60\1\144\1"+
		"\60\1\156\1\145\1\162\2\60\1\145\1\171\1\147\1\60\1\145\1\141\1\145\1"+
		"\171\1\156\1\162\1\167\2\60\1\154\1\60\3\uffff\1\154\1\uffff\1\167\1\60"+
		"\1\145\2\60\1\151\1\147\1\167\1\145\1\164\1\151\1\60\1\uffff\1\164\1\145"+
		"\4\60\1\144\1\143\1\60\1\40\1\141\1\157\1\60\2\157\1\151\1\146\1\157\1"+
		"\60\1\143\2\157\1\162\1\153\2\uffff\1\60\1\147\4\60\1\145\1\162\1\155"+
		"\1\171\1\154\4\60\1\165\2\60\1\144\1\u2019\1\60\1\145\1\141\1\164\1\156"+
		"\1\144\3\60\1\163\1\60\1\uffff\1\60\1\164\1\40\1\155\1\162\1\144\1\60"+
		"\1\146\1\60\1\162\1\155\1\60\1\154\1\150\1\156\2\60\1\143\1\60\1\147\1"+
		"\163\1\145\1\60\1\157\3\164\2\141\2\157\2\60\1\156\3\60\1\164\1\142\1"+
		"\144\1\60\1\147\3\60\1\146\1\157\1\144\1\uffff\1\144\2\60\1\154\1\145"+
		"\1\156\1\uffff\1\60\1\162\1\uffff\1\145\1\142\1\uffff\1\60\1\165\2\60"+
		"\1\157\1\60\1\146\1\151\1\156\1\60\1\157\2\60\1\145\1\163\1\60\1\145\1"+
		"\60\1\145\1\154\1\40\2\154\1\151\1\147\1\60\1\164\1\60\1\uffff\3\60\1"+
		"\165\1\uffff\1\60\1\151\1\145\1\165\1\147\1\171\1\145\1\60\1\164\1\162"+
		"\1\165\1\60\1\151\1\145\1\165\2\164\1\156\1\60\1\157\1\154\3\60\1\162"+
		"\1\60\1\145\1\146\1\144\1\157\1\uffff\2\60\1\145\1\162\1\60\1\164\1\157"+
		"\1\141\1\60\2\163\3\60\1\uffff\1\60\1\154\1\157\2\60\1\154\1\156\1\163"+
		"\1\141\5\60\1\163\1\156\1\146\1\147\2\150\1\60\2\145\1\uffff\1\164\1\162"+
		"\2\60\1\165\1\uffff\1\164\1\40\3\60\1\163\2\60\1\156\1\60\1\147\1\163"+
		"\2\60\1\147\1\165\1\150\2\145\2\60\1\150\1\145\1\uffff\1\163\2\150\5\60"+
		"\1\154\1\164\2\162\1\171\1\144\2\60\2\uffff\1\60\1\145\4\60\1\162\1\60";
	static final String DFA13_maxS =
		"\1\uffff\1\157\1\165\1\145\1\150\1\157\1\162\1\150\1\154\1\151\1\141\1"+
		"\165\1\145\1\162\1\160\1\151\1\172\2\165\1\157\1\165\1\167\1\165\1\151"+
		"\1\162\2\165\1\162\1\171\2\157\1\162\1\156\1\157\1\166\2\157\1\156\1\151"+
		"\1\155\1\170\1\157\1\146\2\40\13\uffff\2\155\1\uffff\1\154\1\147\1\155"+
		"\1\154\1\157\1\162\1\145\1\162\1\163\1\150\1\141\1\142\1\157\1\141\1\162"+
		"\2\143\1\156\1\154\1\163\1\154\1\157\1\171\2\145\1\156\1\151\1\156\1\141"+
		"\1\145\1\172\1\uffff\1\157\1\164\1\154\1\156\1\162\1\165\1\164\1\162\1"+
		"\165\1\147\1\171\1\165\1\156\1\162\1\147\1\141\1\157\1\156\1\163\1\171"+
		"\1\162\2\165\1\157\1\145\1\157\1\145\2\164\1\143\1\162\1\156\1\157\1\163"+
		"\1\164\1\165\1\164\1\147\1\164\1\151\1\167\1\164\1\145\1\165\1\157\1\166"+
		"\1\141\2\163\1\145\1\157\1\156\1\162\2\164\1\166\1\151\1\163\1\164\1\172"+
		"\1\160\1\145\1\163\1\171\1\167\1\165\1\156\1\143\1\156\2\162\1\151\1\40"+
		"\1\142\1\151\1\144\1\172\1\154\1\165\1\146\1\154\1\164\1\40\1\164\1\151"+
		"\1\165\1\40\14\uffff\2\145\1\141\1\151\1\157\1\154\1\166\1\154\1\163\1"+
		"\164\1\171\1\162\1\144\1\164\1\145\1\156\1\172\1\141\2\165\1\143\1\144"+
		"\1\162\1\161\1\147\1\144\1\157\1\163\1\154\1\156\1\141\1\147\1\145\1\155"+
		"\1\172\1\164\2\172\1\uffff\1\167\1\162\1\145\1\172\1\151\1\162\1\154\1"+
		"\145\1\162\1\154\1\160\1\162\1\163\1\145\2\144\1\146\1\157\1\154\1\163"+
		"\1\172\1\156\2\145\1\172\1\155\1\147\1\171\1\163\1\172\1\143\1\164\1\165"+
		"\1\155\1\156\1\164\2\172\1\162\1\151\1\156\1\162\1\156\1\160\1\157\2\154"+
		"\1\145\1\164\1\156\1\145\1\144\1\141\1\164\1\172\1\165\1\150\1\141\1\147"+
		"\1\164\1\166\1\164\1\172\1\147\1\165\1\164\2\163\1\143\1\145\1\144\1\164"+
		"\2\172\1\150\1\162\1\163\1\172\1\160\1\163\1\156\1\145\1\141\1\147\1\156"+
		"\1\162\1\164\2\151\1\165\3\164\1\156\1\145\1\164\2\144\1\164\1\160\1\164"+
		"\1\147\1\143\1\40\1\172\1\164\1\151\1\156\1\165\1\150\2\156\1\150\1\uffff"+
		"\1\150\1\143\1\145\1\154\1\155\1\156\1\40\1\163\2\156\1\144\1\145\1\163"+
		"\1\171\1\154\1\144\1\172\1\146\1\163\1\164\1\163\1\162\1\154\1\172\1\151"+
		"\1\154\1\172\1\145\1\154\1\172\1\uffff\1\145\1\164\1\165\1\172\1\163\1"+
		"\157\1\155\1\154\1\145\1\172\2\145\1\172\1\164\1\162\1\115\1\164\1\172"+
		"\1\145\1\154\1\40\1\151\1\154\1\40\1\144\2\165\1\157\1\165\2\145\1\156"+
		"\1\160\1\157\1\145\1\153\1\172\1\154\1\141\1\uffff\1\172\1\151\1\uffff"+
		"\1\145\1\164\1\172\1\145\1\uffff\1\156\1\172\1\157\1\172\1\171\1\172\1"+
		"\171\1\172\1\164\1\172\1\163\1\172\1\55\1\172\1\164\1\145\1\151\1\uffff"+
		"\1\144\1\163\1\172\1\uffff\1\172\1\165\1\172\1\145\1\154\1\145\1\164\1"+
		"\160\1\144\2\145\1\171\1\145\1\uffff\1\171\1\162\1\145\1\166\1\153\1\146"+
		"\1\151\1\164\2\154\2\164\1\145\2\172\1\156\2\145\1\uffff\1\162\1\172\1"+
		"\154\1\144\1\150\1\145\2\141\1\164\1\145\1\164\1\163\1\153\2\172\1\157"+
		"\1\165\1\155\1\151\1\162\1\151\1\145\1\151\1\172\1\162\1\150\1\145\1\172"+
		"\1\150\1\154\1\143\1\147\1\171\1\165\1\141\1\171\1\144\1\156\1\172\1\145"+
		"\1\172\1\154\1\172\2\145\1\150\1\uffff\2\154\1\156\1\147\1\154\1\162\1"+
		"\163\1\164\1\172\1\151\3\145\1\172\1\145\1\141\1\147\1\163\1\145\4\172"+
		"\1\164\1\172\1\145\3\172\1\151\2\145\2\uffff\1\157\1\172\1\156\1\157\1"+
		"\163\1\uffff\1\143\1\172\1\141\1\uffff\1\162\1\172\1\156\3\uffff\1\172"+
		"\1\142\1\154\1\164\1\uffff\1\164\1\156\1\172\1\165\1\141\1\145\1\156\1"+
		"\151\1\171\1\157\1\144\1\uffff\1\151\1\172\1\146\1\163\1\157\1\156\1\155"+
		"\1\151\1\145\1\143\1\172\1\40\1\172\1\154\1\156\1\162\1\55\1\162\1\145"+
		"\1\uffff\1\167\1\172\1\156\2\172\1\145\1\157\1\150\1\172\1\144\1\172\1"+
		"\164\1\145\1\172\1\145\1\146\1\171\1\164\1\172\1\145\1\162\1\172\1\162"+
		"\1\172\1\162\1\167\1\141\1\151\1\145\1\144\1\150\1\172\1\171\1\172\1\171"+
		"\2\172\1\156\1\163\1\156\1\172\1\157\1\145\1\172\2\162\1\151\1\162\1\145"+
		"\1\157\1\172\1\164\1\155\1\141\1\151\1\156\1\144\1\145\1\172\1\156\1\145"+
		"\1\164\1\144\2\172\1\151\1\150\1\172\2\163\1\172\1\163\1\172\1\156\1\145"+
		"\1\162\2\172\1\145\1\171\1\147\1\172\1\145\1\141\1\145\1\171\1\156\1\162"+
		"\1\167\2\172\1\154\1\172\3\uffff\1\154\1\uffff\1\167\1\172\1\145\2\172"+
		"\1\151\1\147\1\167\1\145\1\164\1\151\1\172\1\uffff\1\164\1\145\4\172\1"+
		"\144\1\143\1\172\1\40\1\141\1\157\1\172\2\157\1\151\1\146\1\157\1\172"+
		"\1\143\2\157\1\162\1\153\2\uffff\1\172\1\147\4\172\1\145\1\162\1\155\1"+
		"\171\1\154\4\172\1\165\2\172\1\144\1\u2019\1\172\1\145\1\141\1\164\1\156"+
		"\1\144\3\172\1\163\1\172\1\uffff\1\172\1\164\1\40\1\155\1\162\1\144\1"+
		"\172\1\146\1\172\1\162\1\155\1\172\1\154\1\150\1\156\2\172\1\143\1\172"+
		"\1\147\1\163\1\145\1\172\1\157\3\164\2\141\2\157\2\172\1\156\3\172\1\164"+
		"\1\142\1\144\1\172\1\147\3\172\1\146\1\157\1\144\1\uffff\1\144\2\172\1"+
		"\154\1\145\1\156\1\uffff\1\172\1\162\1\uffff\1\145\1\142\1\uffff\1\172"+
		"\1\165\2\172\1\157\1\172\1\146\1\151\1\156\1\172\1\157\2\172\1\145\1\163"+
		"\1\172\1\145\1\172\1\145\1\154\1\40\2\154\1\151\1\147\1\172\1\164\1\172"+
		"\1\uffff\3\172\1\165\1\uffff\1\172\1\151\1\145\1\165\1\147\1\171\1\145"+
		"\1\172\1\164\1\162\1\165\1\172\1\151\1\145\1\165\2\164\1\156\1\172\1\157"+
		"\1\154\3\172\1\162\1\172\1\145\1\146\1\144\1\157\1\uffff\2\172\1\145\1"+
		"\162\1\172\1\164\1\157\1\141\1\172\2\163\3\172\1\uffff\1\172\1\154\1\157"+
		"\2\172\1\154\1\156\1\163\1\141\5\172\1\163\1\156\1\146\1\147\2\150\1\172"+
		"\2\145\1\uffff\1\164\1\162\2\172\1\165\1\uffff\1\164\1\40\3\172\1\163"+
		"\2\172\1\156\1\172\1\147\1\163\2\172\1\147\1\165\1\150\2\145\2\172\1\150"+
		"\1\145\1\uffff\1\163\1\150\1\155\5\172\1\154\1\164\2\162\1\171\1\144\2"+
		"\172\2\uffff\1\172\1\145\4\172\1\162\1\172";
	static final String DFA13_acceptS =
		"\55\uffff\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\70\1\71\2\uffff"+
		"\1\66\37\uffff\1\25\127\uffff\1\67\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
		"\1\63\1\64\1\65\1\70\46\uffff\1\21\161\uffff\1\51\36\uffff\1\27\47\uffff"+
		"\1\15\2\uffff\1\17\4\uffff\1\7\21\uffff\1\4\3\uffff\1\2\15\uffff\1\3\22"+
		"\uffff\1\6\56\uffff\1\37\40\uffff\1\40\1\41\5\uffff\1\33\3\uffff\1\10"+
		"\3\uffff\1\16\1\35\1\36\4\uffff\1\1\13\uffff\1\20\23\uffff\1\5\135\uffff"+
		"\1\22\1\23\1\24\1\uffff\1\32\14\uffff\1\13\30\uffff\1\11\1\45\37\uffff"+
		"\1\34\60\uffff\1\31\6\uffff\1\12\2\uffff\1\53\2\uffff\1\47\34\uffff\1"+
		"\42\4\uffff\1\30\36\uffff\1\14\16\uffff\1\43\27\uffff\1\26\5\uffff\1\50"+
		"\27\uffff\1\52\20\uffff\1\44\1\46\10\uffff";
	static final String DFA13_specialS =
		"\1\0\u03e9\uffff}>";
	static final String[] DFA13_transitionS = {
			"\11\67\2\66\2\67\1\66\22\67\1\66\1\60\5\67\1\57\4\67\1\54\1\67\1\55\1"+
			"\62\12\67\1\53\1\56\3\67\1\61\1\67\1\47\1\12\1\10\1\14\1\50\1\13\1\4"+
			"\1\3\1\52\1\2\1\17\1\5\1\11\1\65\1\6\1\15\1\65\1\1\1\16\1\7\4\65\1\51"+
			"\1\65\1\63\1\67\1\64\1\67\1\65\1\67\1\20\1\30\1\31\1\32\1\42\1\21\1\33"+
			"\1\22\1\45\1\23\1\27\1\34\1\35\1\36\1\43\1\24\1\65\1\26\1\25\1\37\1\40"+
			"\1\46\1\41\1\65\1\44\1\65\uff85\67",
			"\1\71\11\uffff\1\70",
			"\1\74\23\uffff\1\73",
			"\1\75\3\uffff\1\76",
			"\1\100\2\uffff\1\77",
			"\1\101\7\uffff\1\103\5\uffff\1\102",
			"\1\104\1\uffff\1\105",
			"\1\106\2\uffff\1\107",
			"\1\110",
			"\1\112\3\uffff\1\111\3\uffff\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117\2\uffff\1\120",
			"\1\122\4\uffff\1\121\7\uffff\1\123",
			"\1\124",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\14\72\1\127\1\125\3\72\1\130"+
			"\1\131\1\72\1\126\5\72",
			"\1\134\3\uffff\1\135\3\uffff\1\136\2\uffff\1\133\2\uffff\1\140\5\uffff"+
			"\1\137",
			"\1\141\3\uffff\1\142\11\uffff\1\143\5\uffff\1\144",
			"\1\145",
			"\1\152\3\uffff\1\151\2\uffff\1\146\2\uffff\1\147\2\uffff\1\153\2\uffff"+
			"\1\150",
			"\1\165\5\uffff\1\155\1\uffff\1\156\1\uffff\1\162\1\164\1\157\1\uffff"+
			"\1\160\2\uffff\1\161\1\154\1\uffff\1\163",
			"\1\167\3\uffff\1\170\5\uffff\1\166\5\uffff\1\171",
			"\1\172",
			"\1\174\3\uffff\1\175\3\uffff\1\u0080\2\uffff\1\176\2\uffff\1\177\2\uffff"+
			"\1\173",
			"\1\u0081\6\uffff\1\u0082\3\uffff\1\u0085\2\uffff\1\u0083\5\uffff\1\u0084",
			"\1\u0086\3\uffff\1\u0088\3\uffff\1\u008a\5\uffff\1\u0087\2\uffff\1\u0089"+
			"\2\uffff\1\u008b",
			"\1\u008e\11\uffff\1\u008d\2\uffff\1\u008c",
			"\1\u008f\3\uffff\1\u0090\3\uffff\1\u0091\5\uffff\1\u0092\11\uffff\1"+
			"\u0093",
			"\1\u0096\3\uffff\1\u0094\5\uffff\1\u0095",
			"\1\u0097\3\uffff\1\u0098\5\uffff\1\u0099",
			"\1\u009a\1\u009d\5\uffff\1\u009b\2\uffff\1\u009c",
			"\1\u009e",
			"\1\u00a0\3\uffff\1\u00a3\2\uffff\1\u00a2\1\u009f\5\uffff\1\u00a1",
			"\1\u00a4\10\uffff\1\u00a5",
			"\1\u00a6\2\uffff\1\u00a7",
			"\1\u00a8\11\uffff\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac\11\uffff\1\u00ad",
			"\1\u00ae\11\uffff\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00be",
			"\1\u00c0\11\uffff\1\u00bf",
			"",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4\12\uffff\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cd\2\uffff\1\u00cc",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00e0\2\uffff\1\u00de\1\uffff\1\u00df",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u00e6\5\uffff\1\u00e5",
			"\1\u00e7\5\uffff\1\u00ea\3\uffff\1\u00e9\6\uffff\1\u00e8",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00f0\2\uffff\1\u00f5\1\u00f1\1\u00f3\1\uffff\1\u00ef\1\uffff\1\u00f4"+
			"\1\uffff\1\u00f2",
			"\1\u00f7\20\uffff\1\u00f6",
			"\1\u00f9\6\uffff\1\u00fb\3\uffff\1\u00f8\2\uffff\1\u00fa",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00ff\23\uffff\1\u00fe",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104\11\uffff\1\u0105",
			"\1\u0106\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a\3\uffff\1\u010b",
			"\1\u010c",
			"\1\u010e\7\uffff\1\u010f\5\uffff\1\u010d\5\uffff\1\u0110",
			"\1\u0112\3\uffff\1\u0113\11\uffff\1\u0111",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0118\13\uffff\1\u0119\5\uffff\1\u0117\1\u011a",
			"\1\u011b\17\uffff\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0121\15\uffff\1\u0120",
			"\1\u0123\16\uffff\1\u0122",
			"\1\u0125\5\uffff\1\u0124\14\uffff\1\u0126",
			"\1\u0129\7\uffff\1\u0127\5\uffff\1\u0128\5\uffff\1\u012a",
			"\1\u012b\7\uffff\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u0130\7\uffff\1\u012f",
			"\1\u0133\20\uffff\1\u0131\1\uffff\1\u0132",
			"\1\u0135\3\uffff\1\u0134\1\uffff\1\u0136",
			"\1\u0137",
			"\1\u0139\7\uffff\1\u0138",
			"\1\u013a",
			"\1\u013b\12\uffff\1\u013d\11\uffff\1\u013c",
			"\1\u013e",
			"\1\u013f\1\u0140",
			"\1\u0141",
			"\1\u0142\3\uffff\1\u0143",
			"\1\u0144\12\uffff\1\u0145\2\uffff\1\u0146",
			"\1\u0147",
			"\1\u0148\1\u0149\3\uffff\1\u014a",
			"\1\u014b\16\uffff\1\u014c",
			"\1\u014d\16\uffff\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0152\13\uffff\1\u0151",
			"\1\u0153\2\uffff\1\u0154\1\uffff\1\u0155",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0157",
			"\1\u0158",
			"\1\u015a\17\uffff\1\u015b\1\u0159",
			"\1\u015f\3\uffff\1\u015d\3\uffff\1\u015c\17\uffff\1\u015e",
			"\1\u0161\25\uffff\1\u0160",
			"\1\u0162\17\uffff\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168\5\uffff\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0178\3\uffff\1\u0177",
			"\1\u0179",
			"\1\u017a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u019e",
			"\1\u019f",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\7\72\1\u01a4\22\72",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b6\1\u01b5",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01c0\2\uffff\1\u01bf",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c5\11\uffff\1\u01c3\7\uffff\1\u01c4",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf\11\uffff\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\3\72\1\u01db\26\72",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\u01f0\31\72",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe\14\uffff\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u020c",
			"\1\u020d\3\uffff\1\u020e",
			"\1\u020f",
			"\1\u0211\16\uffff\1\u0210\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\14\72\1\u0227\15\72",
			"\1\u0228",
			"\1\u0229\1\u022a",
			"\1\u022b",
			"\1\u022d\5\uffff\1\u022c",
			"\1\u022e",
			"\1\u022f",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0230",
			"\1\u0231",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\21\72\1\u0232\10\72",
			"\1\u0234",
			"\1\u0235\6\uffff\1\u0236",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u023d\4\uffff\1\u023c",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0243",
			"\1\u0244",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u025b",
			"\1\u025c",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u025d",
			"",
			"\1\u025e",
			"\1\u025f",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0260",
			"",
			"\1\u0261",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0263",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0264",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0265\17\uffff\1\u0266",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\30\72\1\u0267\1\72",
			"\1\u0268",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0269",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u01a5",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"",
			"\1\u026d",
			"\1\u026e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u026f",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0270",
			"\1\u0271",
			"\1\u0272",
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"",
			"\1\u028a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\22\72\1\u0296\7\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"\1\u02ab",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02ac",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02ad",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c1\13\uffff\1\u02c2\2\uffff\1\u02c0",
			"\1\u02c3",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02c5",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02c6",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"",
			"",
			"\1\u02ca",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"",
			"\1\u02ce",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02cf",
			"",
			"\1\u02d0",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02d2",
			"",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02d3",
			"\1\u02d4",
			"\1\u02d5",
			"",
			"\1\u02d6",
			"\1\u02d7",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02eb",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02ec",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u01b7",
			"\1\u02ef",
			"\1\u02f0",
			"",
			"\1\u02f1",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02f2",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02f6\1\uffff\1\u02f7",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02f8",
			"\1\u02f9",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u02fe",
			"\1\u02ff",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0300",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0308",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u0309\25\72",
			"\1\u030a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u030f",
			"\1\u0310",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\3\72\1\u031e\26\72",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0323",
			"\1\u0324",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0325",
			"\1\u0326",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0327\1\uffff\1\u0328\6\uffff\1\u0329\5\uffff\1\u032a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0338",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"",
			"\1\u0339",
			"",
			"\1\u033a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u033b",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\1\u0344",
			"\1\u0345",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0347",
			"\1\u0348",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0356",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72\1\u0357\16\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u035d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u035e",
			"\1\u01bb",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0364",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u036a",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u036c",
			"\1\u036d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72\1\u0371\16\72",
			"\1\u0372",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u037e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0382",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"",
			"\1\u0386",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u038b",
			"",
			"\1\u038c",
			"\1\u038d",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u038e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u038f",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0393",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0394",
			"\1\u0395",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0396",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u039e",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u039f",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03af",
			"\1\u03b0",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03b2",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03b8",
			"\1\u03b9",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03bd",
			"\1\u03be",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03bf",
			"\1\u03c0",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03c5",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03cb",
			"\1\u03cc",
			"",
			"\1\u03cd",
			"\1\u03ce",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03d0",
			"",
			"\1\u03d1",
			"\1\u03d2",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03d3",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03d4",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03d5",
			"\1\u03d6",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03dc",
			"\1\u03dd",
			"",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0\4\uffff\1\u03e1",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"",
			"",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03e8",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
			"\1\u03e9",
			"\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CHARACTER | POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ACT | SCENE | ENTER | EXIT | EXEUNT | AND | YOU | ARE | THOUART | AS | SUMOF | DIFFBET | PRODOF | A | THYSELF | AMI | BETTER | WORSE | THAN | YOUC | SCENEC | IFSO | IFNOT | LETUS | WESHALL | WEMUST | RETURNTO | PROCEEDTO | PRINTVALUE | PRINTASCII | READVALUE | READASCII | REMEMBER | ME | YOURSELF | RECALL | CL | CM | DOT | SC | AP | EP | QM | FS | LB | RB | ID | COMMENT | WS | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_0 = input.LA(1);
						s = -1;
						if ( (LA13_0=='R') ) {s = 1;}
						else if ( (LA13_0=='J') ) {s = 2;}
						else if ( (LA13_0=='H') ) {s = 3;}
						else if ( (LA13_0=='G') ) {s = 4;}
						else if ( (LA13_0=='L') ) {s = 5;}
						else if ( (LA13_0=='O') ) {s = 6;}
						else if ( (LA13_0=='T') ) {s = 7;}
						else if ( (LA13_0=='C') ) {s = 8;}
						else if ( (LA13_0=='M') ) {s = 9;}
						else if ( (LA13_0=='B') ) {s = 10;}
						else if ( (LA13_0=='F') ) {s = 11;}
						else if ( (LA13_0=='D') ) {s = 12;}
						else if ( (LA13_0=='P') ) {s = 13;}
						else if ( (LA13_0=='S') ) {s = 14;}
						else if ( (LA13_0=='K') ) {s = 15;}
						else if ( (LA13_0=='a') ) {s = 16;}
						else if ( (LA13_0=='f') ) {s = 17;}
						else if ( (LA13_0=='h') ) {s = 18;}
						else if ( (LA13_0=='j') ) {s = 19;}
						else if ( (LA13_0=='p') ) {s = 20;}
						else if ( (LA13_0=='s') ) {s = 21;}
						else if ( (LA13_0=='r') ) {s = 22;}
						else if ( (LA13_0=='k') ) {s = 23;}
						else if ( (LA13_0=='b') ) {s = 24;}
						else if ( (LA13_0=='c') ) {s = 25;}
						else if ( (LA13_0=='d') ) {s = 26;}
						else if ( (LA13_0=='g') ) {s = 27;}
						else if ( (LA13_0=='l') ) {s = 28;}
						else if ( (LA13_0=='m') ) {s = 29;}
						else if ( (LA13_0=='n') ) {s = 30;}
						else if ( (LA13_0=='t') ) {s = 31;}
						else if ( (LA13_0=='u') ) {s = 32;}
						else if ( (LA13_0=='w') ) {s = 33;}
						else if ( (LA13_0=='e') ) {s = 34;}
						else if ( (LA13_0=='o') ) {s = 35;}
						else if ( (LA13_0=='y') ) {s = 36;}
						else if ( (LA13_0=='i') ) {s = 37;}
						else if ( (LA13_0=='v') ) {s = 38;}
						else if ( (LA13_0=='A') ) {s = 39;}
						else if ( (LA13_0=='E') ) {s = 40;}
						else if ( (LA13_0=='Y') ) {s = 41;}
						else if ( (LA13_0=='I') ) {s = 42;}
						else if ( (LA13_0==':') ) {s = 43;}
						else if ( (LA13_0==',') ) {s = 44;}
						else if ( (LA13_0=='.') ) {s = 45;}
						else if ( (LA13_0==';') ) {s = 46;}
						else if ( (LA13_0=='\'') ) {s = 47;}
						else if ( (LA13_0=='!') ) {s = 48;}
						else if ( (LA13_0=='?') ) {s = 49;}
						else if ( (LA13_0=='/') ) {s = 50;}
						else if ( (LA13_0=='[') ) {s = 51;}
						else if ( (LA13_0==']') ) {s = 52;}
						else if ( (LA13_0=='N'||LA13_0=='Q'||(LA13_0 >= 'U' && LA13_0 <= 'X')||LA13_0=='Z'||LA13_0=='_'||LA13_0=='q'||LA13_0=='x'||LA13_0=='z') ) {s = 53;}
						else if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 54;}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||(LA13_0 >= '\"' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '+')||LA13_0=='-'||(LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= '<' && LA13_0 <= '>')||LA13_0=='@'||LA13_0=='\\'||LA13_0=='^'||LA13_0=='`'||(LA13_0 >= '{' && LA13_0 <= '\uFFFF')) ) {s = 55;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
