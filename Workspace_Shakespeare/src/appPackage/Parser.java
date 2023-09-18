package appPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compilerPackage.Handler;
import compilerPackage.ShakespeareLexer;
import compilerPackage.ShakespeareParser;


public class Parser {

	static ShakespeareParser parser;
  
	public static void main(String[] args) {
		CommonTokenStream tokens;
	  	String fileIn = ".\\resources\\input.file";

		try {
			System.out.println ("============================================================================");
			System.out.println ("============================================================================");
			System.out.println ("================ Semantic analysis of the Shakespeare program ==============");
			System.out.println ("============================================================================");
			System.out.println ("============================================================================");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			ShakespeareLexer lexer = new ShakespeareLexer(
											new ANTLRReaderStream(
												new FileReader(fileIn))); 

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
		    tokens = new CommonTokenStream(lexer);

		    // 3.Istanzio il parser
			parser = new ShakespeareParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseSPL();
			
			// 5.controllo i risultati
			Handler h = parser.getHandler();
			if (h.getErrorList().size() == 0)
			{
				System.out.println();
				System.out.println();
				System.out.println ("============================================================================");
				System.out.println ("============================================================================");
				System.out.println ("================= Semantic analysis completed successfully =================");
				System.out.println ("============================================================================");
				System.out.println ("============================================================================");
			}
			else
				for (int i=0; i<h.getErrorList().size(); i++)
					System.err.println ("Error " + (i+1) + 
							":\t" + h.getErrorList().get(i)+"");
								
			//non dovrebbe mai essere attivato, se si attiva non ho gestito errori
		} catch (Exception e) {
			System.out.println ("============================================================================");
			System.out.println ("============================================================================");
			System.out.println ("========================= Semantic analysis aborted ========================");
			System.out.println ("============================================================================");
			System.out.println ("============================================================================");
			e.printStackTrace();
		}
		

  }
}
