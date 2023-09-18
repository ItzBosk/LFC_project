// $ANTLR 3.5.1 C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-09-18 10:11:20

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
	@Override public String getGrammarFileName() { return "C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g"; }

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:5: ( 'Romeo' | 'Juliet' | 'Hamlet' | 'Ghost' | 'LadyMacbeth' | 'Ophelia' | 'Tebaldo' | 'Claudio' | 'Mercuzio' | 'Banquo' | 'Fulgencio' | 'Gertrude' | 'Desdemona' | 'Jago' | 'Polonio' | 'Macduff' | 'Shylock' | 'Laerte' | 'Orazio' | 'Prospero' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:158:9: 'Romeo'
					{
					match("Romeo"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:159:9: 'Juliet'
					{
					match("Juliet"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:160:9: 'Hamlet'
					{
					match("Hamlet"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:161:9: 'Ghost'
					{
					match("Ghost"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:162:9: 'LadyMacbeth'
					{
					match("LadyMacbeth"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:163:9: 'Ophelia'
					{
					match("Ophelia"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:164:9: 'Tebaldo'
					{
					match("Tebaldo"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:165:9: 'Claudio'
					{
					match("Claudio"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:166:9: 'Mercuzio'
					{
					match("Mercuzio"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:167:9: 'Banquo'
					{
					match("Banquo"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:168:9: 'Fulgencio'
					{
					match("Fulgencio"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:169:9: 'Gertrude'
					{
					match("Gertrude"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:170:9: 'Desdemona'
					{
					match("Desdemona"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:171:9: 'Jago'
					{
					match("Jago"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:172:9: 'Polonio'
					{
					match("Polonio"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:173:9: 'Macduff'
					{
					match("Macduff"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:174:9: 'Shylock'
					{
					match("Shylock"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:175:9: 'Laerte'
					{
					match("Laerte"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:176:9: 'Orazio'
					{
					match("Orazio"); 

					}
					break;
				case 20 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:177:9: 'Prospero'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:183:5: ( 'Heaven' | 'King' | 'Lord' | 'angel' | 'flower' | 'happiness' | 'joy' | 'plum' | 'summer’s day' | 'hero' | 'rose' | 'kingdom' | 'pony' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:183:9: 'Heaven'
					{
					match("Heaven"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:184:9: 'King'
					{
					match("King"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:185:9: 'Lord'
					{
					match("Lord"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:186:9: 'angel'
					{
					match("angel"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:187:9: 'flower'
					{
					match("flower"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:188:9: 'happiness'
					{
					match("happiness"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:189:9: 'joy'
					{
					match("joy"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:190:9: 'plum'
					{
					match("plum"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:191:9: 'summer’s day'
					{
					match("summer’s day"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:192:9: 'hero'
					{
					match("hero"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:193:9: 'rose'
					{
					match("rose"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:194:9: 'kingdom'
					{
					match("kingdom"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:195:9: 'pony'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:201:5: ( 'animal' | 'aunt' | 'brother' | 'cat' | 'chihuahua' | 'cousin' | 'cow' | 'daughter' | 'door' | 'face' | 'father' | 'fellow' | 'granddaughter' | 'grandfather' | 'grandmother' | 'grandson' | 'hair' | 'hamster' | 'horse' | 'lamp' | 'lantern' | 'mistletoe' | 'moon' | 'morning' | 'mother' | 'nephew' | 'niece' | 'nose' | 'purse' | 'road' | 'roman' | 'sister' | 'sky' | 'son' | 'squirrel' | 'stonewall' | 'thing' | 'town' | 'tree' | 'uncle' | 'wind' )
			int alt3=41;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:201:9: 'animal'
					{
					match("animal"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:202:9: 'aunt'
					{
					match("aunt"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:203:9: 'brother'
					{
					match("brother"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:204:9: 'cat'
					{
					match("cat"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:205:9: 'chihuahua'
					{
					match("chihuahua"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:206:9: 'cousin'
					{
					match("cousin"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:207:9: 'cow'
					{
					match("cow"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:208:9: 'daughter'
					{
					match("daughter"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:209:9: 'door'
					{
					match("door"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:210:9: 'face'
					{
					match("face"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:211:9: 'father'
					{
					match("father"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:212:9: 'fellow'
					{
					match("fellow"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:213:9: 'granddaughter'
					{
					match("granddaughter"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:214:9: 'grandfather'
					{
					match("grandfather"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:215:9: 'grandmother'
					{
					match("grandmother"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:216:9: 'grandson'
					{
					match("grandson"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:217:9: 'hair'
					{
					match("hair"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:218:9: 'hamster'
					{
					match("hamster"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:219:9: 'horse'
					{
					match("horse"); 

					}
					break;
				case 20 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:220:9: 'lamp'
					{
					match("lamp"); 

					}
					break;
				case 21 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:221:9: 'lantern'
					{
					match("lantern"); 

					}
					break;
				case 22 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:222:9: 'mistletoe'
					{
					match("mistletoe"); 

					}
					break;
				case 23 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:223:9: 'moon'
					{
					match("moon"); 

					}
					break;
				case 24 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:224:9: 'morning'
					{
					match("morning"); 

					}
					break;
				case 25 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:225:9: 'mother'
					{
					match("mother"); 

					}
					break;
				case 26 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:226:9: 'nephew'
					{
					match("nephew"); 

					}
					break;
				case 27 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:227:9: 'niece'
					{
					match("niece"); 

					}
					break;
				case 28 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:228:9: 'nose'
					{
					match("nose"); 

					}
					break;
				case 29 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:229:9: 'purse'
					{
					match("purse"); 

					}
					break;
				case 30 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:230:9: 'road'
					{
					match("road"); 

					}
					break;
				case 31 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:231:9: 'roman'
					{
					match("roman"); 

					}
					break;
				case 32 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:232:9: 'sister'
					{
					match("sister"); 

					}
					break;
				case 33 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:233:9: 'sky'
					{
					match("sky"); 

					}
					break;
				case 34 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:234:9: 'son'
					{
					match("son"); 

					}
					break;
				case 35 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:235:9: 'squirrel'
					{
					match("squirrel"); 

					}
					break;
				case 36 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:236:9: 'stonewall'
					{
					match("stonewall"); 

					}
					break;
				case 37 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:237:9: 'thing'
					{
					match("thing"); 

					}
					break;
				case 38 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:238:9: 'town'
					{
					match("town"); 

					}
					break;
				case 39 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:239:9: 'tree'
					{
					match("tree"); 

					}
					break;
				case 40 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:240:9: 'uncle'
					{
					match("uncle"); 

					}
					break;
				case 41 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:241:9: 'wind'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:247:5: ( 'Hell' | 'Microsoft' | 'bastard' | 'beggar' | 'blister' | 'codpiece' | 'coward' | 'curse' | 'death' | 'devil' | 'draught' | 'famine' | 'flirt-gill' | 'goat' | 'hate' | 'hog' | 'hound' | 'leech' | 'lie' | 'pig' | 'plague' | 'starvation' | 'toad' | 'war' | 'wolf' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:247:9: 'Hell'
					{
					match("Hell"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:248:9: 'Microsoft'
					{
					match("Microsoft"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:249:9: 'bastard'
					{
					match("bastard"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:250:9: 'beggar'
					{
					match("beggar"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:251:9: 'blister'
					{
					match("blister"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:252:9: 'codpiece'
					{
					match("codpiece"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:253:9: 'coward'
					{
					match("coward"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:254:9: 'curse'
					{
					match("curse"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:255:9: 'death'
					{
					match("death"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:256:9: 'devil'
					{
					match("devil"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:257:9: 'draught'
					{
					match("draught"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:258:9: 'famine'
					{
					match("famine"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:259:9: 'flirt-gill'
					{
					match("flirt-gill"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:260:9: 'goat'
					{
					match("goat"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:261:9: 'hate'
					{
					match("hate"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:262:9: 'hog'
					{
					match("hog"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:263:9: 'hound'
					{
					match("hound"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:264:9: 'leech'
					{
					match("leech"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:265:9: 'lie'
					{
					match("lie"); 

					}
					break;
				case 20 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:266:9: 'pig'
					{
					match("pig"); 

					}
					break;
				case 21 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:267:9: 'plague'
					{
					match("plague"); 

					}
					break;
				case 22 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:268:9: 'starvation'
					{
					match("starvation"); 

					}
					break;
				case 23 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:269:9: 'toad'
					{
					match("toad"); 

					}
					break;
				case 24 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:270:9: 'war'
					{
					match("war"); 

					}
					break;
				case 25 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:271:9: 'wolf'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:276:5: ( 'amazing' | 'beautiful' | 'blossoming' | 'bold' | 'brave' | 'charming' | 'clearest' | 'cunning' | 'cute' | 'delicious' | 'embroidered' | 'fair' | 'fine' | 'gentle' | 'golden' | 'good' | 'handsome' | 'happy' | 'healthy' | 'honest' | 'lovely' | 'loving' | 'mighty' | 'noble' | 'peaceful' | 'pretty' | 'prompt' | 'proud' | 'reddest' | 'rich' | 'smooth' | 'sunny' | 'sweet' | 'sweetest' | 'trustworthy' | 'warm' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:276:9: 'amazing'
					{
					match("amazing"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:277:9: 'beautiful'
					{
					match("beautiful"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:278:9: 'blossoming'
					{
					match("blossoming"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:279:9: 'bold'
					{
					match("bold"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:280:9: 'brave'
					{
					match("brave"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:281:9: 'charming'
					{
					match("charming"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:282:9: 'clearest'
					{
					match("clearest"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:283:9: 'cunning'
					{
					match("cunning"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:284:9: 'cute'
					{
					match("cute"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:285:9: 'delicious'
					{
					match("delicious"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:286:9: 'embroidered'
					{
					match("embroidered"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:287:9: 'fair'
					{
					match("fair"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:288:9: 'fine'
					{
					match("fine"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:289:9: 'gentle'
					{
					match("gentle"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:290:9: 'golden'
					{
					match("golden"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:291:9: 'good'
					{
					match("good"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:292:9: 'handsome'
					{
					match("handsome"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:293:9: 'happy'
					{
					match("happy"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:294:9: 'healthy'
					{
					match("healthy"); 

					}
					break;
				case 20 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:295:9: 'honest'
					{
					match("honest"); 

					}
					break;
				case 21 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:296:9: 'lovely'
					{
					match("lovely"); 

					}
					break;
				case 22 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:297:9: 'loving'
					{
					match("loving"); 

					}
					break;
				case 23 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:298:9: 'mighty'
					{
					match("mighty"); 

					}
					break;
				case 24 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:299:9: 'noble'
					{
					match("noble"); 

					}
					break;
				case 25 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:300:9: 'peaceful'
					{
					match("peaceful"); 

					}
					break;
				case 26 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:301:9: 'pretty'
					{
					match("pretty"); 

					}
					break;
				case 27 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:302:9: 'prompt'
					{
					match("prompt"); 

					}
					break;
				case 28 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:303:9: 'proud'
					{
					match("proud"); 

					}
					break;
				case 29 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:304:9: 'reddest'
					{
					match("reddest"); 

					}
					break;
				case 30 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:305:9: 'rich'
					{
					match("rich"); 

					}
					break;
				case 31 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:306:9: 'smooth'
					{
					match("smooth"); 

					}
					break;
				case 32 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:307:9: 'sunny'
					{
					match("sunny"); 

					}
					break;
				case 33 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:308:9: 'sweet'
					{
					match("sweet"); 

					}
					break;
				case 34 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:309:9: 'sweetest'
					{
					match("sweetest"); 

					}
					break;
				case 35 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:310:9: 'trustworthy'
					{
					match("trustworthy"); 

					}
					break;
				case 36 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:311:9: 'warm'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:316:5: ( 'big' | 'black' | 'blue' | 'bluest' | 'bottomless' | 'furry' | 'green' | 'hard' | 'huge' | 'large' | 'little' | 'normal' | 'old' | 'purple' | 'red' | 'rural' | 'small' | 'tiny' | 'white' | 'yellow' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:316:9: 'big'
					{
					match("big"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:317:9: 'black'
					{
					match("black"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:318:9: 'blue'
					{
					match("blue"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:319:9: 'bluest'
					{
					match("bluest"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:320:9: 'bottomless'
					{
					match("bottomless"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:321:9: 'furry'
					{
					match("furry"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:322:9: 'green'
					{
					match("green"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:323:9: 'hard'
					{
					match("hard"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:324:9: 'huge'
					{
					match("huge"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:325:9: 'large'
					{
					match("large"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:326:9: 'little'
					{
					match("little"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:327:9: 'normal'
					{
					match("normal"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:328:9: 'old'
					{
					match("old"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:329:9: 'purple'
					{
					match("purple"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:330:9: 'red'
					{
					match("red"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:331:9: 'rural'
					{
					match("rural"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:332:9: 'small'
					{
					match("small"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:333:9: 'tiny'
					{
					match("tiny"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:334:9: 'white'
					{
					match("white"); 

					}
					break;
				case 20 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:335:9: 'yellow'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:340:5: ( 'bad' | 'cowardly' | 'cursed' | 'damned' | 'dirty' | 'disgusting' | 'distasteful' | 'dusty' | 'evil' | 'fat' | 'fat-kidneyed' | 'fatherless' | 'foul' | 'hairy' | 'half-witted' | 'horrible' | 'horrid' | 'infected' | 'lying' | 'miserable' | 'misused' | 'oozing' | 'rotten' | 'smelly' | 'snotty' | 'sorry' | 'stinking' | 'stuffed' | 'stupid' | 'vile' | 'villainous' | 'worried' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:340:9: 'bad'
					{
					match("bad"); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:341:9: 'cowardly'
					{
					match("cowardly"); 

					}
					break;
				case 3 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:342:9: 'cursed'
					{
					match("cursed"); 

					}
					break;
				case 4 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:343:9: 'damned'
					{
					match("damned"); 

					}
					break;
				case 5 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:344:9: 'dirty'
					{
					match("dirty"); 

					}
					break;
				case 6 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:345:9: 'disgusting'
					{
					match("disgusting"); 

					}
					break;
				case 7 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:346:9: 'distasteful'
					{
					match("distasteful"); 

					}
					break;
				case 8 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:347:9: 'dusty'
					{
					match("dusty"); 

					}
					break;
				case 9 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:348:9: 'evil'
					{
					match("evil"); 

					}
					break;
				case 10 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:349:9: 'fat'
					{
					match("fat"); 

					}
					break;
				case 11 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:350:9: 'fat-kidneyed'
					{
					match("fat-kidneyed"); 

					}
					break;
				case 12 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:351:9: 'fatherless'
					{
					match("fatherless"); 

					}
					break;
				case 13 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:352:9: 'foul'
					{
					match("foul"); 

					}
					break;
				case 14 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:353:9: 'hairy'
					{
					match("hairy"); 

					}
					break;
				case 15 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:354:9: 'half-witted'
					{
					match("half-witted"); 

					}
					break;
				case 16 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:355:9: 'horrible'
					{
					match("horrible"); 

					}
					break;
				case 17 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:356:9: 'horrid'
					{
					match("horrid"); 

					}
					break;
				case 18 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:357:9: 'infected'
					{
					match("infected"); 

					}
					break;
				case 19 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:358:9: 'lying'
					{
					match("lying"); 

					}
					break;
				case 20 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:359:9: 'miserable'
					{
					match("miserable"); 

					}
					break;
				case 21 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:360:9: 'misused'
					{
					match("misused"); 

					}
					break;
				case 22 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:361:9: 'oozing'
					{
					match("oozing"); 

					}
					break;
				case 23 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:362:9: 'rotten'
					{
					match("rotten"); 

					}
					break;
				case 24 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:363:9: 'smelly'
					{
					match("smelly"); 

					}
					break;
				case 25 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:364:9: 'snotty'
					{
					match("snotty"); 

					}
					break;
				case 26 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:365:9: 'sorry'
					{
					match("sorry"); 

					}
					break;
				case 27 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:366:9: 'stinking'
					{
					match("stinking"); 

					}
					break;
				case 28 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:367:9: 'stuffed'
					{
					match("stuffed"); 

					}
					break;
				case 29 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:368:9: 'stupid'
					{
					match("stupid"); 

					}
					break;
				case 30 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:369:9: 'vile'
					{
					match("vile"); 

					}
					break;
				case 31 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:370:9: 'villainous'
					{
					match("villainous"); 

					}
					break;
				case 32 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:371:9: 'worried'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:376:10: ( 'Act' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:376:14: 'Act'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:377:13: ( 'Scene' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:377:18: 'Scene'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:378:17: ( 'Enter' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:378:25: 'Enter'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:379:17: ( 'Exit' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:379:25: 'Exit'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:380:17: ( 'Exeunt' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:380:25: 'Exeunt'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:381:14: ( 'and' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:381:16: 'and'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:385:14: ( 'You' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:385:18: 'You'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:386:10: ( 'are' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:386:14: 'are'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:387:13: ( 'Thou art' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:387:17: 'Thou art'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:388:10: ( 'as' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:388:14: 'as'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:389:14: ( 'the sum of' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:389:18: 'the sum of'
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

	// $ANTLR start "DIFF"
	public final void mDIFF() throws RecognitionException {
		try {
			int _type = DIFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:390:14: ( 'the difference between a' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:390:18: 'the difference between a'
			{
			match("the difference between a"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFF"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			int _type = A;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:391:4: ( 'a' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:391:8: 'a'
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

	// $ANTLR start "PRINTVALUE"
	public final void mPRINTVALUE() throws RecognitionException {
		try {
			int _type = PRINTVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:395:17: ( 'Open your heart' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:395:25: 'Open your heart'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:396:17: ( 'Speak your mind' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:396:25: 'Speak your mind'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:397:17: ( 'Open your mind' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:397:25: 'Open your mind'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:398:17: ( 'Listen to your heart' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:398:25: 'Listen to your heart'
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:404:10: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:407:9: ( '0' .. '9' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:410:6: ( ':' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:410:10: ':'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:411:6: ( ',' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:411:10: ','
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:412:9: ( '.' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:412:13: '.'
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

	// $ANTLR start "AP"
	public final void mAP() throws RecognitionException {
		try {
			int _type = AP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:414:9: ( '\\'' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:414:13: '\\''
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:415:9: ( '!' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:415:13: '!'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:416:9: ( '?' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:416:13: '?'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:417:6: ( '/' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:417:10: '/'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:418:6: ( '[' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:418:10: '['
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:419:6: ( ']' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:419:10: ']'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:422:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:422:9: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:423:9: ( LETTER | DIGIT | '_' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:428:6: ( ( ', ' | ': ' ) ( (~ ( '\\n' | '\\r' ) )* ) ( '\\r' )? '\\n' )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:9: ( ', ' | ': ' ) ( (~ ( '\\n' | '\\r' ) )* ) ( '\\r' )? '\\n'
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:9: ( ', ' | ': ' )
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:10: ', '
					{
					match(", "); 

					}
					break;
				case 2 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:17: ': '
					{
					match(": "); 

					}
					break;

			}

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:23: ( (~ ( '\\n' | '\\r' ) )* )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:26: (~ ( '\\n' | '\\r' ) )*
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:26: (~ ( '\\n' | '\\r' ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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

			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:42: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:429:42: '\\r'
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:433:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:434:2: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:434:2: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:
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
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:448:17: ( . )
			// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:448:19: .
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
		// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:8: ( CHARACTER | POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ACT | SCENE | ENTER | EXIT | EXEUNT | AND | YOU | ARE | THOUART | AS | SUMOF | DIFF | A | PRINTVALUE | PRINTASCII | READVALUE | READASCII | CL | CM | DOT | AP | EP | QM | FS | LB | RB | ID | COMMENT | WS | ERROR_TK )
		int alt13=37;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:10: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 2 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:20: POSITIVENOUN
				{
				mPOSITIVENOUN(); 

				}
				break;
			case 3 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:33: NEUTRALNOUN
				{
				mNEUTRALNOUN(); 

				}
				break;
			case 4 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:45: NEGATIVENOUN
				{
				mNEGATIVENOUN(); 

				}
				break;
			case 5 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:58: POSITIVEADJECTIVE
				{
				mPOSITIVEADJECTIVE(); 

				}
				break;
			case 6 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:76: NEUTRALADJECTIVE
				{
				mNEUTRALADJECTIVE(); 

				}
				break;
			case 7 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:93: NEGATIVEADJECTIVE
				{
				mNEGATIVEADJECTIVE(); 

				}
				break;
			case 8 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:111: ACT
				{
				mACT(); 

				}
				break;
			case 9 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:115: SCENE
				{
				mSCENE(); 

				}
				break;
			case 10 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:121: ENTER
				{
				mENTER(); 

				}
				break;
			case 11 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:127: EXIT
				{
				mEXIT(); 

				}
				break;
			case 12 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:132: EXEUNT
				{
				mEXEUNT(); 

				}
				break;
			case 13 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:139: AND
				{
				mAND(); 

				}
				break;
			case 14 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:143: YOU
				{
				mYOU(); 

				}
				break;
			case 15 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:147: ARE
				{
				mARE(); 

				}
				break;
			case 16 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:151: THOUART
				{
				mTHOUART(); 

				}
				break;
			case 17 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:159: AS
				{
				mAS(); 

				}
				break;
			case 18 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:162: SUMOF
				{
				mSUMOF(); 

				}
				break;
			case 19 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:168: DIFF
				{
				mDIFF(); 

				}
				break;
			case 20 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:173: A
				{
				mA(); 

				}
				break;
			case 21 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:175: PRINTVALUE
				{
				mPRINTVALUE(); 

				}
				break;
			case 22 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:186: PRINTASCII
				{
				mPRINTASCII(); 

				}
				break;
			case 23 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:197: READVALUE
				{
				mREADVALUE(); 

				}
				break;
			case 24 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:207: READASCII
				{
				mREADASCII(); 

				}
				break;
			case 25 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:217: CL
				{
				mCL(); 

				}
				break;
			case 26 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:220: CM
				{
				mCM(); 

				}
				break;
			case 27 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:223: DOT
				{
				mDOT(); 

				}
				break;
			case 28 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:227: AP
				{
				mAP(); 

				}
				break;
			case 29 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:230: EP
				{
				mEP(); 

				}
				break;
			case 30 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:233: QM
				{
				mQM(); 

				}
				break;
			case 31 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:236: FS
				{
				mFS(); 

				}
				break;
			case 32 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:239: LB
				{
				mLB(); 

				}
				break;
			case 33 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:242: RB
				{
				mRB(); 

				}
				break;
			case 34 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:245: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:248: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 36 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:256: WS
				{
				mWS(); 

				}
				break;
			case 37 :
				// C:\\Users\\kevbosk\\Documents\\Università\\github_repo\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:1:259: ERROR_TK
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
			return "200:1: NEUTRALNOUN : ( 'animal' | 'aunt' | 'brother' | 'cat' | 'chihuahua' | 'cousin' | 'cow' | 'daughter' | 'door' | 'face' | 'father' | 'fellow' | 'granddaughter' | 'grandfather' | 'grandmother' | 'grandson' | 'hair' | 'hamster' | 'horse' | 'lamp' | 'lantern' | 'mistletoe' | 'moon' | 'morning' | 'mother' | 'nephew' | 'niece' | 'nose' | 'purse' | 'road' | 'roman' | 'sister' | 'sky' | 'son' | 'squirrel' | 'stonewall' | 'thing' | 'town' | 'tree' | 'uncle' | 'wind' );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\17\67\1\127\31\67\1\u00aa\1\u00ab\12\uffff\1\67\1\uffff\36\67"+
		"\1\u00d8\1\uffff\121\67\13\uffff\40\67\1\u0184\2\67\1\u0187\1\uffff\3"+
		"\67\1\u018c\20\67\1\u019e\3\67\1\u01a2\4\67\1\u019e\6\67\2\u01af\17\67"+
		"\1\u01c1\6\67\1\u018c\10\67\1\u01c1\1\u01af\3\67\1\u01af\31\67\1\u019e"+
		"\26\67\1\u019e\5\67\1\u01c1\4\67\1\u0212\3\67\1\u0216\2\67\1\u0219\2\67"+
		"\1\u019e\4\67\1\u01a2\22\67\1\u01a2\2\67\1\uffff\1\u01af\1\67\1\uffff"+
		"\2\67\1\u01af\1\67\1\uffff\1\67\1\u0239\1\67\1\u0239\1\67\1\u018c\1\67"+
		"\1\u01af\1\67\1\u019e\1\67\1\u01c1\1\67\1\u01a2\3\67\1\uffff\2\67\1\u01c1"+
		"\1\uffff\1\u01a2\1\67\1\u01a2\11\67\1\uffff\14\67\1\u01a2\1\u01af\3\67"+
		"\1\uffff\1\u0239\12\67\1\u01c1\1\u0239\10\67\1\u0239\3\67\1\u01af\12\67"+
		"\1\u019e\1\67\1\u0239\1\67\1\u01af\13\67\1\u01af\4\67\1\u01af\3\67\1\uffff"+
		"\1\u01af\1\u019e\1\u01af\1\67\1\u01c1\1\67\1\u01af\1\u0239\1\u019e\3\67"+
		"\1\u018c\3\67\1\u018c\1\67\1\uffff\1\67\1\u029f\1\67\1\uffff\1\u0219\1"+
		"\67\1\uffff\2\67\1\u0219\5\67\1\uffff\2\67\1\uffff\12\67\1\u02b6\1\67"+
		"\1\u01a2\6\67\1\uffff\1\67\1\u01c1\1\67\1\u0239\1\u018c\3\67\1\u01af\1"+
		"\67\1\u019e\2\67\1\u01af\4\67\1\u0239\1\67\1\u0239\1\67\1\u018c\7\67\1"+
		"\u01c1\1\67\1\u0239\1\67\1\u01af\2\67\1\u01c1\2\67\1\u0239\5\67\1\u01c1"+
		"\7\67\1\u019e\4\67\2\u019e\2\67\1\u018c\2\67\1\u018c\1\67\1\u01c1\3\67"+
		"\1\u01c1\1\u019e\3\67\1\u018c\7\67\1\u01af\1\u0239\1\67\1\u01af\2\uffff"+
		"\1\67\1\u01af\1\67\1\u01c1\5\67\1\u0308\1\uffff\1\67\2\u0219\1\u01a2\2"+
		"\67\1\u0219\2\67\1\uffff\1\u0219\5\67\1\u0219\5\67\2\uffff\1\u01af\1\67"+
		"\1\u01a2\1\u01af\1\u019e\1\u01af\5\67\1\u018c\1\u0239\1\u019e\1\u01c1"+
		"\1\67\2\u0239\1\67\1\u01af\5\67\1\u018c\1\u0239\1\u018c\1\67\2\u018c\4"+
		"\67\1\u019e\3\67\1\u01c1\3\67\1\u01af\1\u019e\1\67\1\u018c\3\67\1\u018c"+
		"\10\67\2\u0239\1\67\1\u01c1\2\u0239\3\67\1\u0239\1\67\2\u01af\1\u01c1"+
		"\3\67\1\u018c\1\u01c1\2\67\1\uffff\1\u0348\2\67\1\uffff\1\u0219\1\uffff"+
		"\2\u0219\1\67\1\u0219\3\67\1\u0219\1\67\1\u0219\1\u0239\2\67\1\u01af\1"+
		"\67\1\u0239\6\67\1\u018c\1\67\1\u0239\1\u01a2\1\u01af\1\u019e\1\67\1\u019e"+
		"\6\67\1\u0239\3\67\1\u019e\6\67\1\u01af\2\67\1\u018c\1\u01af\1\67\1\u018c"+
		"\3\67\1\uffff\1\u0219\1\67\1\uffff\1\u0219\3\67\1\u0219\2\67\1\u0239\1"+
		"\u018c\1\u0239\1\u01af\2\67\1\u018c\1\u0239\4\67\1\u0239\1\u018c\1\u019e"+
		"\1\u0239\1\u01af\6\67\1\u01af\4\67\1\u018c\2\67\1\uffff\1\u019e\2\u0219"+
		"\1\67\1\u01a2\1\u01af\1\67\1\u0239\2\67\1\u01af\1\u0239\5\67\1\u01af\1"+
		"\u018c\4\67\1\uffff\1\u018c\1\u019e\1\u0239\1\u01c1\1\u018c\6\67\1\u018c"+
		"\1\u0219\2\uffff\1\u018c\1\67\2\u01af\2\u0239\1\67\1\u01af";
	static final String DFA13_eofS =
		"\u03a2\uffff";
	static final String DFA13_minS =
		"\1\0\1\157\2\141\1\145\1\141\1\160\1\145\1\154\2\141\1\165\1\145\1\157"+
		"\1\143\1\151\1\60\2\141\1\157\1\145\1\151\1\145\1\151\3\141\1\145\1\141"+
		"\1\151\1\145\1\150\1\156\1\141\1\155\1\154\1\145\1\156\1\151\1\143\1\156"+
		"\1\157\2\40\12\uffff\1\155\1\uffff\1\154\1\147\1\155\1\141\1\157\1\162"+
		"\1\144\1\162\1\163\1\145\1\141\1\142\1\157\1\141\1\162\2\143\1\156\1\154"+
		"\1\163\1\154\1\157\1\171\2\145\1\156\1\144\1\156\1\141\1\145\1\60\1\uffff"+
		"\1\151\1\143\1\154\1\156\1\162\1\165\1\151\1\141\2\147\1\171\1\141\1\156"+
		"\1\162\1\147\1\141\1\145\1\155\1\163\1\171\1\156\1\165\2\141\1\145\1\157"+
		"\1\141\1\144\1\143\1\162\1\156\1\141\1\144\2\141\1\154\1\147\1\164\1\141"+
		"\1\144\1\156\1\145\1\155\1\157\2\141\1\162\1\163\2\141\1\156\1\155\2\145"+
		"\1\166\1\151\1\147\1\157\1\160\1\145\1\142\1\145\1\141\1\145\1\156\1\143"+
		"\1\156\1\162\1\154\1\151\1\142\1\151\1\144\1\172\1\154\1\146\1\154\2\164"+
		"\1\145\1\165\13\uffff\1\145\1\151\1\157\1\154\1\166\1\154\1\163\1\164"+
		"\1\171\1\162\1\144\1\164\1\145\1\156\1\172\1\141\2\165\1\143\1\144\1\162"+
		"\1\161\1\147\1\144\1\157\1\163\1\154\1\156\1\141\1\147\1\145\1\155\1\60"+
		"\1\164\1\172\1\60\1\uffff\1\167\1\162\1\145\1\60\1\151\1\162\1\154\1\145"+
		"\1\162\1\154\1\160\1\162\1\163\1\145\2\144\1\146\1\157\1\154\1\162\1\60"+
		"\1\156\2\145\1\60\1\155\1\147\1\171\1\160\1\60\1\143\1\164\2\155\1\156"+
		"\1\164\2\60\1\162\1\151\1\156\1\162\1\156\1\146\1\157\2\154\1\145\1\164"+
		"\1\145\1\144\1\141\1\164\1\60\1\150\1\141\1\147\1\164\1\166\1\164\1\60"+
		"\1\147\1\165\2\163\1\143\1\145\1\144\1\164\2\60\1\150\1\162\1\163\1\60"+
		"\1\160\1\163\1\156\1\145\1\141\1\147\1\156\1\162\1\164\2\151\1\165\1\164"+
		"\1\147\1\164\1\156\1\145\1\164\2\144\1\164\1\160\1\164\1\147\1\143\1\60"+
		"\1\164\1\145\1\156\1\145\1\150\2\156\2\150\1\143\1\145\1\154\1\155\1\156"+
		"\1\40\1\156\1\144\1\145\1\163\1\171\1\154\1\144\1\60\1\146\1\162\1\164"+
		"\1\162\1\154\1\60\1\151\1\154\2\145\1\60\1\145\1\164\1\165\1\60\1\157"+
		"\1\145\1\60\2\145\1\60\1\164\1\162\1\115\1\164\1\60\1\145\1\154\1\40\1"+
		"\151\1\154\1\40\1\144\2\165\1\157\1\165\2\145\1\156\1\160\1\157\1\145"+
		"\1\153\1\60\1\154\1\141\1\uffff\1\60\1\151\1\uffff\1\145\1\164\1\60\1"+
		"\145\1\uffff\1\156\1\60\1\157\1\60\1\171\1\60\1\151\1\60\1\164\1\60\1"+
		"\163\1\60\1\55\1\60\1\164\1\145\1\151\1\uffff\1\144\1\163\1\60\1\uffff"+
		"\1\60\1\165\1\60\1\145\1\154\1\145\1\164\1\160\1\144\1\145\1\171\1\145"+
		"\1\uffff\1\171\1\162\1\145\1\166\1\153\1\146\1\151\1\164\2\154\2\164\2"+
		"\60\1\156\2\145\1\uffff\1\60\1\154\1\144\1\150\1\145\2\141\2\164\1\163"+
		"\1\153\2\60\1\157\1\165\1\155\1\151\1\162\1\151\1\145\1\151\1\60\1\162"+
		"\1\150\1\145\1\60\1\150\1\154\1\143\1\147\1\171\1\165\1\141\1\171\1\144"+
		"\1\156\1\60\1\145\1\60\1\154\1\60\2\145\1\150\2\154\1\156\1\147\1\154"+
		"\1\162\1\163\1\164\1\60\1\151\3\145\1\60\1\145\1\141\1\147\1\144\3\60"+
		"\1\164\1\60\1\145\3\60\1\151\1\145\1\157\1\60\1\156\1\157\1\143\1\60\1"+
		"\141\1\uffff\1\162\1\60\1\156\1\uffff\1\60\1\164\1\uffff\1\164\1\156\1"+
		"\60\1\165\1\141\1\145\1\156\1\151\1\171\1\157\1\144\1\uffff\1\151\1\172"+
		"\1\146\1\163\1\157\1\156\1\155\1\151\1\145\1\143\1\60\1\40\1\60\1\154"+
		"\1\156\1\162\1\55\1\162\1\145\1\uffff\1\167\1\60\1\156\2\60\1\145\1\157"+
		"\1\150\1\60\1\142\1\60\1\164\1\145\1\60\1\145\1\146\1\171\1\164\1\60\1"+
		"\162\1\60\1\162\1\60\1\162\1\167\1\141\1\151\1\145\1\144\1\150\1\60\1"+
		"\171\1\60\1\171\1\60\1\156\1\163\1\60\1\157\1\145\1\60\2\162\1\151\1\145"+
		"\1\157\1\60\1\164\1\155\1\141\1\151\1\156\1\144\1\145\1\60\1\156\1\145"+
		"\1\164\1\144\2\60\1\151\1\150\1\60\2\163\1\60\1\144\1\60\1\156\1\145\1"+
		"\162\2\60\1\145\1\171\1\147\1\60\1\145\1\141\1\145\1\171\1\156\1\162\1"+
		"\167\2\60\1\154\1\60\2\uffff\1\167\1\60\1\145\1\60\1\151\1\147\1\167\1"+
		"\164\1\151\1\60\1\uffff\1\164\3\60\1\144\1\143\1\60\1\40\1\141\1\157\1"+
		"\60\2\157\1\151\1\146\1\157\1\60\1\143\2\157\1\162\1\153\2\uffff\1\60"+
		"\1\147\4\60\1\145\1\162\1\155\1\171\1\154\4\60\1\165\2\60\1\u2019\1\60"+
		"\1\145\1\141\1\164\1\156\1\144\3\60\1\163\2\60\1\164\1\155\1\162\1\144"+
		"\1\60\1\146\1\162\1\155\1\60\1\154\1\150\1\156\2\60\1\143\1\60\1\147\1"+
		"\163\1\145\1\60\1\157\3\164\2\141\2\157\2\60\1\156\3\60\1\164\1\142\1"+
		"\144\1\60\1\147\3\60\1\157\2\144\2\60\1\145\1\156\1\uffff\1\60\1\145\1"+
		"\142\1\uffff\1\60\1\165\2\60\1\157\1\60\1\146\1\151\1\156\1\60\1\157\2"+
		"\60\1\145\1\163\1\60\1\145\1\60\1\145\3\154\1\151\1\147\1\60\1\164\4\60"+
		"\1\165\1\60\1\151\1\145\1\165\1\147\1\171\1\145\1\60\1\164\1\162\1\165"+
		"\1\60\1\151\1\145\1\165\2\164\1\156\1\60\1\157\1\154\2\60\1\162\1\60\1"+
		"\145\1\144\1\157\1\uffff\1\60\1\145\1\162\1\60\1\164\1\157\1\141\1\60"+
		"\2\163\4\60\1\154\1\157\2\60\1\154\1\156\1\163\1\141\5\60\1\163\1\156"+
		"\1\146\1\147\2\150\1\60\2\145\1\164\1\162\1\60\1\165\1\164\1\40\3\60\1"+
		"\163\2\60\1\156\1\60\1\147\1\163\2\60\1\147\1\165\1\150\2\145\2\60\1\150"+
		"\1\145\1\163\2\150\5\60\1\154\1\164\2\162\1\171\1\144\2\60\2\uffff\1\60"+
		"\1\145\4\60\1\162\1\60";
	static final String DFA13_maxS =
		"\1\uffff\1\157\1\165\1\145\1\150\1\157\1\162\1\150\1\154\1\151\1\141\1"+
		"\165\1\145\1\162\1\160\1\151\1\172\2\165\1\157\1\165\1\167\1\165\1\151"+
		"\1\162\2\165\1\162\1\171\2\157\1\162\1\156\1\157\1\166\1\157\1\145\1\156"+
		"\1\151\1\143\1\170\1\157\2\40\12\uffff\1\155\1\uffff\1\154\1\147\1\155"+
		"\1\154\1\157\1\162\1\145\1\162\1\163\1\150\1\141\1\142\1\157\1\141\1\162"+
		"\2\143\1\156\1\154\1\163\1\154\1\157\1\171\2\145\1\156\1\151\1\156\1\141"+
		"\1\145\1\172\1\uffff\1\157\1\164\1\154\1\156\1\162\1\165\1\164\1\162\1"+
		"\165\1\147\1\171\1\165\1\156\1\162\1\147\1\141\1\157\1\156\1\163\1\171"+
		"\1\162\2\165\1\157\1\145\1\157\1\164\1\144\1\143\1\162\1\156\1\157\1\163"+
		"\1\147\1\165\1\164\1\147\1\164\1\151\1\167\1\164\1\145\1\165\1\157\1\166"+
		"\1\141\2\163\1\145\1\157\1\156\1\162\1\145\1\164\1\166\1\151\1\163\1\164"+
		"\1\160\1\145\1\163\1\151\1\167\1\165\1\156\1\143\1\156\2\162\1\151\1\142"+
		"\1\151\1\144\1\172\1\154\1\146\1\154\2\164\1\151\1\165\13\uffff\1\145"+
		"\1\151\1\157\1\154\1\166\1\154\1\163\1\164\1\171\1\162\1\144\1\164\1\145"+
		"\1\156\1\172\1\141\2\165\1\143\1\144\1\162\1\161\1\147\1\144\1\157\1\163"+
		"\1\154\1\156\1\141\1\147\1\145\1\155\1\172\1\164\2\172\1\uffff\1\167\1"+
		"\162\1\145\1\172\1\151\1\162\1\154\1\145\1\162\1\154\1\160\1\162\1\163"+
		"\1\145\2\144\1\146\1\157\1\154\1\163\1\172\1\156\2\145\1\172\1\155\1\147"+
		"\1\171\1\163\1\172\1\143\1\164\1\165\1\155\1\156\1\164\2\172\1\162\1\151"+
		"\1\156\1\162\1\156\1\160\1\157\2\154\1\145\1\164\1\145\1\144\1\141\1\164"+
		"\1\172\1\150\1\141\1\147\1\164\1\166\1\164\1\172\1\147\1\165\2\163\1\143"+
		"\1\145\1\144\1\164\2\172\1\150\1\162\1\163\1\172\1\160\1\163\1\156\1\145"+
		"\1\141\1\147\1\156\1\162\1\164\2\151\1\165\3\164\1\156\1\145\1\164\2\144"+
		"\1\164\1\160\1\164\1\147\1\143\1\172\1\164\1\151\1\156\1\165\1\150\2\156"+
		"\2\150\1\143\1\145\1\154\1\155\1\156\1\40\1\156\1\144\1\145\1\163\1\171"+
		"\1\154\1\144\1\172\1\146\1\162\1\164\1\162\1\154\1\172\1\151\1\154\1\145"+
		"\1\154\1\172\1\145\1\164\1\165\1\172\1\157\1\145\1\172\2\145\1\172\1\164"+
		"\1\162\1\115\1\164\1\172\1\145\1\154\1\40\1\151\1\154\1\40\1\144\2\165"+
		"\1\157\1\165\2\145\1\156\1\160\1\157\1\145\1\153\1\172\1\154\1\141\1\uffff"+
		"\1\172\1\151\1\uffff\1\145\1\164\1\172\1\145\1\uffff\1\156\1\172\1\157"+
		"\1\172\1\171\1\172\1\171\1\172\1\164\1\172\1\163\1\172\1\55\1\172\1\164"+
		"\1\145\1\151\1\uffff\1\144\1\163\1\172\1\uffff\1\172\1\165\1\172\1\145"+
		"\1\154\1\145\1\164\1\160\1\144\1\145\1\171\1\145\1\uffff\1\171\1\162\1"+
		"\145\1\166\1\153\1\146\1\151\1\164\2\154\2\164\2\172\1\156\2\145\1\uffff"+
		"\1\172\1\154\1\144\1\150\1\145\2\141\2\164\1\163\1\153\2\172\1\157\1\165"+
		"\1\155\1\151\1\162\1\151\1\145\1\151\1\172\1\162\1\150\1\145\1\172\1\150"+
		"\1\154\1\143\1\147\1\171\1\165\1\141\1\171\1\144\1\156\1\172\1\145\1\172"+
		"\1\154\1\172\2\145\1\150\2\154\1\156\1\147\1\154\1\162\1\163\1\164\1\172"+
		"\1\151\3\145\1\172\1\145\1\141\1\147\1\163\3\172\1\164\1\172\1\145\3\172"+
		"\1\151\1\145\1\157\1\172\1\156\1\157\1\143\1\172\1\141\1\uffff\1\162\1"+
		"\172\1\156\1\uffff\1\172\1\164\1\uffff\1\164\1\156\1\172\1\165\1\141\1"+
		"\145\1\156\1\151\1\171\1\157\1\144\1\uffff\1\151\1\172\1\146\1\163\1\157"+
		"\1\156\1\155\1\151\1\145\1\143\1\172\1\40\1\172\1\154\1\156\1\162\1\55"+
		"\1\162\1\145\1\uffff\1\167\1\172\1\156\2\172\1\145\1\157\1\150\1\172\1"+
		"\144\1\172\1\164\1\145\1\172\1\145\1\146\1\171\1\164\1\172\1\162\1\172"+
		"\1\162\1\172\1\162\1\167\1\141\1\151\1\145\1\144\1\150\1\172\1\171\1\172"+
		"\1\171\1\172\1\156\1\163\1\172\1\157\1\145\1\172\2\162\1\151\1\145\1\157"+
		"\1\172\1\164\1\155\1\141\1\151\1\156\1\144\1\145\1\172\1\156\1\145\1\164"+
		"\1\144\2\172\1\151\1\150\1\172\2\163\1\172\1\163\1\172\1\156\1\145\1\162"+
		"\2\172\1\145\1\171\1\147\1\172\1\145\1\141\1\145\1\171\1\156\1\162\1\167"+
		"\2\172\1\154\1\172\2\uffff\1\167\1\172\1\145\1\172\1\151\1\147\1\167\1"+
		"\164\1\151\1\172\1\uffff\1\164\3\172\1\144\1\143\1\172\1\40\1\141\1\157"+
		"\1\172\2\157\1\151\1\146\1\157\1\172\1\143\2\157\1\162\1\153\2\uffff\1"+
		"\172\1\147\4\172\1\145\1\162\1\155\1\171\1\154\4\172\1\165\2\172\1\u2019"+
		"\1\172\1\145\1\141\1\164\1\156\1\144\3\172\1\163\2\172\1\164\1\155\1\162"+
		"\1\144\1\172\1\146\1\162\1\155\1\172\1\154\1\150\1\156\2\172\1\143\1\172"+
		"\1\147\1\163\1\145\1\172\1\157\3\164\2\141\2\157\2\172\1\156\3\172\1\164"+
		"\1\142\1\144\1\172\1\147\3\172\1\157\2\144\2\172\1\145\1\156\1\uffff\1"+
		"\172\1\145\1\142\1\uffff\1\172\1\165\2\172\1\157\1\172\1\146\1\151\1\156"+
		"\1\172\1\157\2\172\1\145\1\163\1\172\1\145\1\172\1\145\3\154\1\151\1\147"+
		"\1\172\1\164\4\172\1\165\1\172\1\151\1\145\1\165\1\147\1\171\1\145\1\172"+
		"\1\164\1\162\1\165\1\172\1\151\1\145\1\165\2\164\1\156\1\172\1\157\1\154"+
		"\2\172\1\162\1\172\1\145\1\144\1\157\1\uffff\1\172\1\145\1\162\1\172\1"+
		"\164\1\157\1\141\1\172\2\163\4\172\1\154\1\157\2\172\1\154\1\156\1\163"+
		"\1\141\5\172\1\163\1\156\1\146\1\147\2\150\1\172\2\145\1\164\1\162\1\172"+
		"\1\165\1\164\1\40\3\172\1\163\2\172\1\156\1\172\1\147\1\163\2\172\1\147"+
		"\1\165\1\150\2\145\2\172\1\150\1\145\1\163\1\150\1\155\5\172\1\154\1\164"+
		"\2\162\1\171\1\144\2\172\2\uffff\1\172\1\145\4\172\1\162\1\172";
	static final String DFA13_acceptS =
		"\54\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\44\1\45\1\uffff\1"+
		"\42\37\uffff\1\24\121\uffff\1\43\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1"+
		"\40\1\41\1\44\44\uffff\1\21\u00ab\uffff\1\15\2\uffff\1\17\4\uffff\1\7"+
		"\21\uffff\1\4\3\uffff\1\2\14\uffff\1\3\21\uffff\1\6\120\uffff\1\10\3\uffff"+
		"\1\16\2\uffff\1\1\13\uffff\1\20\23\uffff\1\5\131\uffff\1\22\1\23\12\uffff"+
		"\1\13\26\uffff\1\11\1\26\120\uffff\1\12\3\uffff\1\30\73\uffff\1\14\117"+
		"\uffff\1\25\1\27\10\uffff";
	static final String DFA13_specialS =
		"\1\0\u03a1\uffff}>";
	static final String[] DFA13_transitionS = {
			"\11\65\2\64\2\65\1\64\22\65\1\64\1\56\5\65\1\55\4\65\1\53\1\65\1\54\1"+
			"\60\12\65\1\52\4\65\1\57\1\65\1\47\1\12\1\10\1\14\1\50\1\13\1\4\1\3\1"+
			"\63\1\2\1\17\1\5\1\11\1\63\1\6\1\15\1\63\1\1\1\16\1\7\4\63\1\51\1\63"+
			"\1\61\1\65\1\62\1\65\1\63\1\65\1\20\1\30\1\31\1\32\1\42\1\21\1\33\1\22"+
			"\1\45\1\23\1\27\1\34\1\35\1\36\1\43\1\24\1\63\1\26\1\25\1\37\1\40\1\46"+
			"\1\41\1\63\1\44\1\63\uff85\65",
			"\1\66",
			"\1\71\23\uffff\1\70",
			"\1\72\3\uffff\1\73",
			"\1\75\2\uffff\1\74",
			"\1\76\7\uffff\1\100\5\uffff\1\77",
			"\1\101\1\uffff\1\102",
			"\1\103\2\uffff\1\104",
			"\1\105",
			"\1\107\3\uffff\1\106\3\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114\2\uffff\1\115",
			"\1\117\4\uffff\1\116\7\uffff\1\120",
			"\1\121",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\14\67\1\124\1\122\3\67\1\125"+
			"\1\126\1\67\1\123\5\67",
			"\1\131\3\uffff\1\132\3\uffff\1\133\2\uffff\1\130\2\uffff\1\135\5\uffff"+
			"\1\134",
			"\1\136\3\uffff\1\137\11\uffff\1\140\5\uffff\1\141",
			"\1\142",
			"\1\147\3\uffff\1\146\2\uffff\1\143\2\uffff\1\144\2\uffff\1\150\2\uffff"+
			"\1\145",
			"\1\152\1\uffff\1\153\1\uffff\1\157\1\161\1\154\1\uffff\1\155\2\uffff"+
			"\1\156\1\151\1\uffff\1\160",
			"\1\163\3\uffff\1\164\5\uffff\1\162\5\uffff\1\165",
			"\1\166",
			"\1\170\3\uffff\1\171\3\uffff\1\174\2\uffff\1\172\2\uffff\1\173\2\uffff"+
			"\1\167",
			"\1\175\6\uffff\1\176\3\uffff\1\u0081\2\uffff\1\177\5\uffff\1\u0080",
			"\1\u0082\3\uffff\1\u0084\3\uffff\1\u0086\5\uffff\1\u0083\2\uffff\1\u0085"+
			"\2\uffff\1\u0087",
			"\1\u008a\11\uffff\1\u0089\2\uffff\1\u0088",
			"\1\u008b\3\uffff\1\u008c\3\uffff\1\u008d\5\uffff\1\u008e\11\uffff\1"+
			"\u008f",
			"\1\u0090\5\uffff\1\u0091",
			"\1\u0092\3\uffff\1\u0093\5\uffff\1\u0094",
			"\1\u0095\1\u0098\5\uffff\1\u0096\2\uffff\1\u0097",
			"\1\u0099",
			"\1\u009b\6\uffff\1\u009d\1\u009a\5\uffff\1\u009c",
			"\1\u009e\10\uffff\1\u009f",
			"\1\u00a0\2\uffff\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6\11\uffff\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00a9",
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
			"\1\u00b4",
			"",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8\12\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c1\2\uffff\1\u00c0",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d4\2\uffff\1\u00d2\1\uffff\1\u00d3",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u00da\5\uffff\1\u00d9",
			"\1\u00db\5\uffff\1\u00de\3\uffff\1\u00dd\6\uffff\1\u00dc",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e4\2\uffff\1\u00e9\1\u00e5\1\u00e7\1\uffff\1\u00e3\1\uffff\1\u00e8"+
			"\1\uffff\1\u00e6",
			"\1\u00eb\20\uffff\1\u00ea",
			"\1\u00ed\6\uffff\1\u00ef\3\uffff\1\u00ec\2\uffff\1\u00ee",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f3\23\uffff\1\u00f2",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8\11\uffff\1\u00f9",
			"\1\u00fa\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe\3\uffff\1\u00ff",
			"\1\u0100",
			"\1\u0102\7\uffff\1\u0103\5\uffff\1\u0101\5\uffff\1\u0104",
			"\1\u0106\3\uffff\1\u0107\11\uffff\1\u0105",
			"\1\u0108",
			"\1\u0109",
			"\1\u010b\13\uffff\1\u010c\5\uffff\1\u010a\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0113\15\uffff\1\u0112",
			"\1\u0115\16\uffff\1\u0114",
			"\1\u0117\5\uffff\1\u0116",
			"\1\u011a\7\uffff\1\u0118\5\uffff\1\u0119\5\uffff\1\u011b",
			"\1\u011c\7\uffff\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0121\7\uffff\1\u0120",
			"\1\u0124\20\uffff\1\u0122\1\uffff\1\u0123",
			"\1\u0126\3\uffff\1\u0125\1\uffff\1\u0127",
			"\1\u0128",
			"\1\u012a\7\uffff\1\u0129",
			"\1\u012b",
			"\1\u012c\12\uffff\1\u012e\11\uffff\1\u012d",
			"\1\u012f",
			"\1\u0130\1\u0131",
			"\1\u0132",
			"\1\u0133\3\uffff\1\u0134",
			"\1\u0135\12\uffff\1\u0136\2\uffff\1\u0137",
			"\1\u0138",
			"\1\u0139\1\u013a\3\uffff\1\u013b",
			"\1\u013c",
			"\1\u013d\16\uffff\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0142\13\uffff\1\u0141",
			"\1\u0143\2\uffff\1\u0144\1\uffff\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0149\17\uffff\1\u014a\1\u0148",
			"\1\u014c\3\uffff\1\u014b",
			"\1\u014e\25\uffff\1\u014d",
			"\1\u014f\17\uffff\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155\5\uffff\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0162\3\uffff\1\u0161",
			"\1\u0163",
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
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
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
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0185",
			"\1\u0186",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\7\67\1\u018b\22\67",
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
			"\1\u019d\1\u019c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a7\2\uffff\1\u01a6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa\7\uffff\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5\11\uffff\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\3\67\1\u01c0\26\67",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\u01d3\31\67",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1\14\uffff\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01ee",
			"\1\u01ef\3\uffff\1\u01f0",
			"\1\u01f1",
			"\1\u01f3\16\uffff\1\u01f2\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\14\67\1\u0207\15\67",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210\6\uffff\1\u0211",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0217",
			"\1\u0218",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u021a",
			"\1\u021b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0232",
			"\1\u0233",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0234",
			"",
			"\1\u0235",
			"\1\u0236",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0237",
			"",
			"\1\u0238",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u023a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u023b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u023c\17\uffff\1\u023d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\30\67\1\u023e\1\67",
			"\1\u023f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0240",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u018c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"",
			"\1\u0244",
			"\1\u0245",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0246",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"",
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
			"\1\u025b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\u0269\7\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0271",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0272",
			"\1\u0273",
			"\1\u0274",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u027f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0280",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\u0294\16\uffff\1\u0293",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0295",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0296",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u029d",
			"",
			"\1\u029e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02a0",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02a1",
			"",
			"\1\u02a2",
			"\1\u02a3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"\1\u02ab",
			"",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02b7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u019e",
			"\1\u02bb",
			"\1\u02bc",
			"",
			"\1\u02bd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02be",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02c2\1\uffff\1\u02c3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02c4",
			"\1\u02c5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ca",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02cb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u02d4\25\67",
			"\1\u02d5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d6",
			"\1\u02d7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d8",
			"\1\u02d9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\3\67\1\u02e6\26\67",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\1\u02ea",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02eb",
			"\1\u02ec",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ed",
			"\1\u02ee",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ef\1\uffff\1\u02f0\6\uffff\1\u02f1\5\uffff\1\u02f2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0300",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0301",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0302",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0309",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030a",
			"\1\u030b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0319",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u031a\16\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0320",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01a2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0326",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u0331\16\67",
			"\1\u0332",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u033e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0342",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0346",
			"\1\u0347",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0349",
			"\1\u034a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0350",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0351",
			"\1\u0352",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0353",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036b",
			"\1\u036c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0371",
			"\1\u0372",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0376",
			"\1\u0377",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0378",
			"\1\u0379",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038d",
			"\1\u038e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398\4\uffff\1\u0399",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a1",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67"
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
			return "1:1: Tokens : ( CHARACTER | POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN | POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE | ACT | SCENE | ENTER | EXIT | EXEUNT | AND | YOU | ARE | THOUART | AS | SUMOF | DIFF | A | PRINTVALUE | PRINTASCII | READVALUE | READASCII | CL | CM | DOT | AP | EP | QM | FS | LB | RB | ID | COMMENT | WS | ERROR_TK );";
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
						else if ( (LA13_0==':') ) {s = 42;}
						else if ( (LA13_0==',') ) {s = 43;}
						else if ( (LA13_0=='.') ) {s = 44;}
						else if ( (LA13_0=='\'') ) {s = 45;}
						else if ( (LA13_0=='!') ) {s = 46;}
						else if ( (LA13_0=='?') ) {s = 47;}
						else if ( (LA13_0=='/') ) {s = 48;}
						else if ( (LA13_0=='[') ) {s = 49;}
						else if ( (LA13_0==']') ) {s = 50;}
						else if ( (LA13_0=='I'||LA13_0=='N'||LA13_0=='Q'||(LA13_0 >= 'U' && LA13_0 <= 'X')||LA13_0=='Z'||LA13_0=='_'||LA13_0=='q'||LA13_0=='x'||LA13_0=='z') ) {s = 51;}
						else if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 52;}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||(LA13_0 >= '\"' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '+')||LA13_0=='-'||(LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= ';' && LA13_0 <= '>')||LA13_0=='@'||LA13_0=='\\'||LA13_0=='^'||LA13_0=='`'||(LA13_0 >= '{' && LA13_0 <= '\uFFFF')) ) {s = 53;}
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
