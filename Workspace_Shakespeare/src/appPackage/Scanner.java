package appPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.ShakespeareLexer;
import interfaceSPL.SPLinterrface;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class Scanner {

	public static void main(String[] args) throws IOException {

		String fileIn = "./resources/input.file"; // path-name input file

		Token tk;
		int i;

		try {
			System.out.println();
			System.out.println("Syntactic analysis of Shakespeare program");
			System.out.println("-----------------------------------------");

			// Instantiate the scanner by passing it an input stream
			ShakespeareLexer lexer = new ShakespeareLexer(new ANTLRReaderStream(new FileReader(fileIn)));

			i = 1;
			// scan the stream from start to finish
			// the scanner continues to give the next token
			// until End Of File (EOF)
			while ((tk = lexer.nextToken()).getType() != ShakespeareLexer.EOF) {
				// retrieve information relating to detected tokens
				int line = tk.getLine();
				int col = tk.getCharPositionInLine() + 1;
				int type = tk.getType();
				String text = tk.getText();

				// activate this control if want to discard hidden tokens
				if (tk.getChannel() != ShakespeareLexer.HIDDEN)
					if (tk.getType() != ShakespeareLexer.ERROR_TK)
						// print current token info
						System.out.println("Token " + i++ + ": " + "(" + line + "," + col + ")\t\t" + "TokenType: "
								+ type + "\t" + text);
					else
						// print error token info
						System.err.println("Token " + i++ + ": " + "(" + line + "," + col + ")\t\t" + "TokenType: "
								+ type + "\t" + text + " ERROR!");
			}
		} catch (Exception e) {
			System.out.println("Syntactic analysis aborted");
			e.printStackTrace();
		}

	}
}
