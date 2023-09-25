package outputPackage;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Paths;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.Path;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;



public class PdfWriterOutput {
	public  static Document document;
	
	public static void open(){
		
		try {
			 document = new Document();
			 PdfWriter.getInstance(document, new FileOutputStream("./resources/output.pdf"));
			 document.open();
			 System.err.println("OPEN");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static Chunk setChunk(String frase){
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk chunk = new Chunk(frase, font);
		System.err.println("CHUNK");

		try {
			document.add(chunk);
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		return chunk;
	}
	
	public static void close(){
		System.err.println("CLOSE");
		document.close();		
	}	
}



