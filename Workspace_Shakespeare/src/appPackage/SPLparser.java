package appPackage;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import compilerPackage.SPLhandler;
import compilerPackage.ShakespeareLexer;
import compilerPackage.ShakespeareParser;
import interfaceSPL.SPLinterrface;
import outputPackage.HtmlToPDF;

public class SPLparser {

	static ShakespeareParser parser;
	static ByteArrayOutputStream baos;

	public static void main(String[] args) {

		// Create a stream to hold the output
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		// IMPORTANT: Save the old System.out!
		PrintStream old = System.out;
		PrintStream old2 = System.err;

		// Tell Java to use your special stream
		System.setOut(ps);
		System.setErr(ps);

		CommonTokenStream tokens;
		String fileIn = "./resources/input.file";

		try {
			System.out.println("============================================================================");
			System.out.println("================ Semantic analysis of the Shakespeare program ==============");
			System.out.println("============================================================================");

			// create the html file
			HtmlToPDF.HTML.initHTML();

			// Instantiate the lexer by passing it the document to analyze
			ShakespeareLexer lexer = new ShakespeareLexer(new ANTLRReaderStream(new FileReader(fileIn)));

			// Create a stream (channel) of tokens for communication between lexer and
			// parser
			tokens = new CommonTokenStream(lexer);

			// Instantiate the parser
			parser = new ShakespeareParser(tokens);

			// Launch the syntactic analysis of the input document
			parser.parseSPL();

			// check results
			SPLhandler h = parser.getHandler();
			if (h.getErrorList().size() == 0 && SPLhandler.effectiveInput == SPLhandler.neededInput) {
				h.finalPrint();
				System.out.println();
				System.out.println();
				System.out.println("============================================================================");
				System.out.println("================= Semantic analysis completed successfully =================");
				System.out.println("============================================================================");
			} else {
				// handling errors in number of input elements
				if (SPLhandler.neededInput != SPLhandler.effectiveInput) {
					System.err.println("Input Error: The Shakespeare program requires " + SPLhandler.neededInput
							+ " input elements, but the provided input has " + SPLhandler.effectiveInput);
				}

				for (int i = 0; i < h.getErrorList().size(); i++)
					System.err.println("Error " + (i + 1) + ":\t" + h.getErrorList().get(i) + "");
			}

		} catch (Exception e) {
			System.out.println("============================================================================");
			System.out.println("========================= Semantic analysis aborted ========================");
			System.out.println("============================================================================");
			e.printStackTrace();
		}

		// Put things back
		System.err.flush();
		System.setOut(old2);
		System.out.flush();
		System.setOut(old);

		// Show what happened
		System.err.println("============================================================================");
		System.out.println(baos.toString());

	}

	public String getConsoleOuput() {
		return baos.toString();
	}
}
