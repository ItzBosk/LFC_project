// $ANTLR 3.5.1 D:\\università\\3° anno - 2° periodo\\tecnologie cloud e mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g 2023-05-07 18:28:38

package compilerPackage;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ShakespeareParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CL", "DIGIT",
			"DOT", "EP", "ID", "LETTER", "QM" };
	public static final int EOF = -1;
	public static final int CL = 4;
	public static final int DIGIT = 5;
	public static final int DOT = 6;
	public static final int EP = 7;
	public static final int ID = 8;
	public static final int LETTER = 9;
	public static final int QM = 10;

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

	@Override
	public String[] getTokenNames() {
		return ShakespeareParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return ".\\src\\compilerPackage\\Shakespeare.g";
	}

	// $ANTLR start "parseSPL"
	// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e
	// mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:24:1:
	// parseSPL : title ;
	public final void parseSPL() throws RecognitionException {
		try {
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e
			// mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:25:2:
			// ( title )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e
			// mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:26:2:
			// title
			{
				System.out.println("* Sto per riconoscere un documento Shakespeare");
				pushFollow(FOLLOW_title_in_parseSPL60);
				title();
				state._fsp--;

				System.out.println("    - Ho riconosciuto un documento Shakespeare");
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseSPL"

	// $ANTLR start "title"
	// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e
	// mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:34:1:
	// title : ID DOT ;
	public final void title() throws RecognitionException {
		try {
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e
			// mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:35:2:
			// ( ID DOT )
			// D:\\università\\3° anno - 2° periodo\\tecnologie cloud e
			// mobile\\exe\\laboratorio\\code\\LFC_project\\Workspace_Shakespeare\\src\\compilerPackage\\Shakespeare.g:36:2:
			// ID DOT
			{
				System.out.println("* Sto per riconoscere il titolo");
				match(input, ID, FOLLOW_ID_in_title78);
				match(input, DOT, FOLLOW_DOT_in_title80);
				System.out.println("    - Ho riconosciuto il titolo");
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "title"

	// Delegated rules

	public static final BitSet FOLLOW_title_in_parseSPL60 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_title78 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_DOT_in_title80 = new BitSet(new long[] { 0x0000000000000002L });
}
