package outputPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.pdf.BaseFont;

public class HtmlToPDF {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (OutputStream outputStream = new FileOutputStream("./resources/out.pdf")) {
		File inputHTML = new File("./resources/test.html");
		Document document = Jsoup.parse(inputHTML, "UTF-8");
		document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
		
		    ITextRenderer renderer = new ITextRenderer();
		    SharedContext sharedContext = renderer.getSharedContext();
		    sharedContext.setPrint(true);
		    sharedContext.setInteractive(false);
		    renderer.getFontResolver().addFont("Seagramtfb.ttf", BaseFont.IDENTITY_H, true);
		    renderer.setDocumentFromString(document.html());

		    //System.out.println(renderer.getFontResolver().getFontFamily("Seagram.ttf"));
		    renderer.layout();
		    renderer.createPDF(outputStream);
	}
}
}
