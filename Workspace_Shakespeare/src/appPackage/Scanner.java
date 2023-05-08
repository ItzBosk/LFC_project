package appPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.Shakespeare;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class Scanner {

	public static void main(String[] args) throws IOException {

		String fileIn = ".\\resources\\input.file"; // path-name del file di input

		Token tk;
		int i;

		try {
			System.out.println("Test ANTLR lexer");
			// istanzio lo scanner passandogli un stream di ingresso
			Shakespeare lexer = new Shakespeare(new ANTLRReaderStream(new FileReader(fileIn)));

			i = 1;
			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo
			// nextToken)
			// fino ad incontrare l' End Of File EOF
			while ((tk = lexer.nextToken()).getType() != Shakespeare.EOF) {
				// recupera le informazioni relative ai token rilevati
				int line = tk.getLine();   // riga
				int col = tk.getCharPositionInLine() + 1;  // colonna
				int type = tk.getType();
				String text = tk.getText();

				// attivo questo controllo se voglio scartare i token nascosti
				if (tk.getChannel() != Shakespeare.HIDDEN)
					// stampo le informazioni del token corrente
					System.out.println("Token " + i++ + ": " + 
							"(" + line + "," + col + ")\t\t" 
							+ "TokenType: " + type + "\t" + text);
			}

		} catch (Exception e) {
			System.out.println("Test ANTLR abortito");
			e.printStackTrace();
		}

	}

}
