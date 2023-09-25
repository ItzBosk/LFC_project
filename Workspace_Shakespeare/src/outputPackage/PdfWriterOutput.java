package outputPackage;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;


public class PdfWriterOutput {
	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		System.out.println("ciao");
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("./resources/input.file"));

		document.open();
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk chunk = new Chunk("Hello World", font);

		document.add(chunk);
		document.close();
		
	}	
}
