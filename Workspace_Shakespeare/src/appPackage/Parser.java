package appPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compilerPackage.ShakespeareLexer;
import compilerPackage.ShakespeareParser;


public class Parser {

	static ShakespeareParser parser;
  
	public static void main(String[] args) {
		CommonTokenStream tokens;
	  	String fileIn = ".\\resources\\input.file";

		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");

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
		
			//non dovrebbe mai essere attivato, se si attiva non ho gestito errori
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

  }
}
