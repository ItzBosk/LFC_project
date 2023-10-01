package appPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.ShakespeareLexer;
import interfaceSPL.SPLinterrface;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;


public class Scanner {

	public static void main(String[] args) throws IOException {

//		String fileIn = "./resources/input.file"; // path-name del file di input
	  	String fileIn = SPLinterrface.getInputFile();   //da GUI

		
		Token tk;
		int i;

		try {
			System.out.println();
			System.out.println("Syntactic analysis of Shakespeare program");
			System.out.println ("-----------------------------------------");
			// istanzio lo scanner passandogli un stream di ingresso
			ShakespeareLexer lexer = new ShakespeareLexer(new ANTLRReaderStream(new FileReader(fileIn)));

			i = 1;
			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo
			// nextToken)
			// fino ad incontrare l' End Of File EOF
			while ((tk = lexer.nextToken()).getType() != ShakespeareLexer.EOF) {
				// recuper le informazioni relative ai token rilevati
				int line = tk.getLine();
				int col = tk.getCharPositionInLine()+1;
				int type = tk.getType();
				String text = tk.getText();

				// attivo questo controllo se voglio scartare i token nascosti
			if (tk.getChannel() !=  ShakespeareLexer.HIDDEN)
					if (tk.getType() !=  ShakespeareLexer.ERROR_TK)
						// stampo le informazioni del token corrente
						System.out.println("Token " + i++ + ": "
								+ "(" + line + "," + col + ")\t\t" 
								+ "TokenType: " + type + "\t" + text);
					else
						// stampo le informazioni del token di errore sullo standard error
						System.err.println("Token " + i++ + ": "
								+ "(" + line + "," + col + ")\t\t" 
								+ "TokenType: " + type + "\t" + text + " ERROR!");
						
			} 

		} catch (Exception e) {
			System.out.println ("Syntactic analysis aborted");
			e.printStackTrace();
		}

	}
  	
}
