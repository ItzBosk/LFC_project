package outputPackage;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.pdf.BaseFont;

public class HtmlToPDF {
	
	public static void main(String[] args)  {
	}
	
	public static void generatePDFfromHTML() throws Exception {
			System.out.println("/n/n/n"+HTML.getFile());
			String outPath = "./resources/out.pdf";
			
		try (OutputStream outputStream = new FileOutputStream(outPath)) {
			Document document = Jsoup.parse(HTML.getFile(), "UTF-8");
			document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
			ITextRenderer renderer = new ITextRenderer();
			SharedContext sharedContext = renderer.getSharedContext();
			sharedContext.setPrint(true);
			sharedContext.setInteractive(false);
			renderer.getFontResolver().addFont("Seagramtfb.ttf", BaseFont.IDENTITY_H, true);
			renderer.setDocumentFromString(document.html());
			renderer.layout();
			renderer.createPDF(outputStream);
			Desktop.getDesktop().browse(new URI(System.getProperty("user.dir").replace("\\", "/")+outPath));
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	//Subclass per gestire la creazione incrementale del file html
	public static class HTML{
		private static String htmlFile="";
		private static boolean firstPersonae = true;
		private static boolean stageEventLeft = true;
		
		public static void initHTML() {
		htmlFile = "<html> "
				+ "    <head> "
				+ "        <style> "
				+ "		    @font-face { font-family: Seagram; src: url('Seagramtfb.ttf'); }  "
				+ "			@media print "
				+ "			{ "
				+ "				.no-page-break { "
				+ "					page-break-inside : avoid; "
				+ "					-fs-keep-with-inline : keep; "
				+ "					-fs-table-paginate: paginate; "
				+ "				} "
				+ "			} "
				+ "			@page{ "
				+ "			margin : 0px; "
				+ "			} "
				+ " "
				+ "			body{ "
				+ "			padding: 25px; "
				+ "			font-family:Seagram tfb, Seagram; "
				+ "			background-image: url('background.jpg'); "
				+ "			background-repeat: no-repeat; "
				+ "			background-attachment: fixed; "
				+ "			background-size: cover; "
				+ "			} "
				+ "			.title{ "
				+ "			margin-top: 25px;text-align:center; font-size:65px; "
				+ "			} "
				+ "			.charList{ "
				+ "			page-break-after: always; "
				+ "			clear: both; "
				+ "			display: table;  "
				+ "			width:100%;  "
				+ "			text-align:left;  "
				+ "			margin:20px 0px 20px 0px; "
				+ "			} "
				+ "			.image{ "
				+ "			float:left; width:170px; height:170px; padding : 10px; "
				+ "			} "
				+ "			.act{ "
				+ "			font-size:30px; "
				+ "			background-color:yellow; "
				+ "			text-align:center; "
				+ "			page-break-before: always; "
				+ "			} "
				+ "			.scene{ "
				+ "			font-size:25px;background-color:green;text-align:center "
				+ "			} "
				+ "			.stageEvent{ "
				+ "			 clear: both;  display: table; width:100%; "
				+ "			} "
				+ "			.left{ "
				+ "			text-align:left "
				+ "			} "
				+ "			.right{ "
				+ "			text-align:right "
				+ "			} "
				+ "			.fleft{ "
				+ "			float:left; "
				+ "			} "
				+ "			.fright{ "
				+ "			float:right; "
				+ "			} "
				+ "			.text{ "
				+ "			padding:20px; "
				+ "			} "
				+ "        </style> "
				+ "    </head> "
				+ "    <body>";
		}
		
		public static void addPersonae(String personae) {
			if(firstPersonae) {
				htmlFile += "<div class=\"charList\">"
						+ "		<h2>Character list:</h2>";
				firstPersonae = false;
			}
			else
				htmlFile = htmlFile.substring(0, htmlFile.length()-6);
			htmlFile += "<img class=\"image\"  src=\""+personae+"_text.jpg\" /></img>	</div>";
			
		}
		
		public static void addTitle(String title) {
			htmlFile += "<div class=\"title\">"
					+ title +"</div>";
		}
		
		public static void addStageEvent(String personae, String event) {
			if(stageEventLeft) {
				htmlFile += "<div class=\"stageEvent no-page-break left\">\r\n"
						+ "			<img class=\"image fleft\" src=\""+personae+".jpg\" /> </img>\r\n"
						+ "			<div class=\"text fleft\" width=\"100%\"> ";
			}
			else
			{
				htmlFile += "<div class=\"stageEvent no-page-break right\">\r\n"
						+ "			<img class=\"image fright\" src=\""+personae+".jpg\" /> </img>\r\n"
						+ "			<div class=\"text fright\" width=\"100%\"> ";
			}
			stageEventLeft = !stageEventLeft;
			htmlFile += "<h2>"+personae+":</h2>\r\n"
					+ event
					+ "			</div>\r\n"
					+ "		</div>";
		}
		
		public static void addAct(String act) {
			htmlFile += "<div class=\"act\">ACT "+act+"</div>";
		}
		
		public static void addScene(String scene) {
			htmlFile += "<div class=\"scene\">SCENE "+scene+"</div>";
			stageEventLeft = true;
		}
		
		public static String getFile() {
			htmlFile += "</body></html>";
			return htmlFile;
		}
	}
}
