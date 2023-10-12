package outputPackage;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.pdfbox.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.w3c.dom.Element;
import org.xhtmlrenderer.extend.FSImage;
import org.xhtmlrenderer.extend.ReplacedElementFactory;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextFSImage;
import org.xhtmlrenderer.pdf.ITextImageElement;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.simple.extend.FormSubmissionListener;

import com.lowagie.text.Image;
import com.lowagie.text.pdf.BaseFont;
import com.openhtmltopdf.extend.ReplacedElement;
import com.openhtmltopdf.extend.UserAgentCallback;
import com.openhtmltopdf.layout.LayoutContext;
import com.openhtmltopdf.render.BlockBox;

import utilityPackage.CharacterDescriptor;

public class HtmlToPDF {
	
	public static void main(String[] args)  {
	}
	
	public static void generatePDFfromHTML() throws Exception {
			String outPath = "./resources/out.pdf";
			
		try (OutputStream outputStream = new FileOutputStream(outPath)) {
			Document document = Jsoup.parse(HTML.getFile(), "UTF-8");
			document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
			ITextRenderer renderer = new ITextRenderer();
			SharedContext sharedContext = renderer.getSharedContext();
			sharedContext.setPrint(true);
			sharedContext.setInteractive(false);
			renderer.getFontResolver().addFont("./resources/Seagramtfb.ttf", BaseFont.IDENTITY_H, true);
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
		private static boolean firstAct = true;
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
				+ "			background-image: url('resources/images/background.jpg'); "
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
				+ "    		font-size: 45px;\r\n"
				+ "    		background-image: url(resources/images/actBanner.png);\r\n"
				+ "    		background-repeat: no-repeat;\r\n"
				+ "         background-position:center;"	
				+ "    		background-size: contain;\r\n"
				+ "   		text-align: center;\r\n"
				+ "    		page-break-before: always;\r\n"
				+ "    		height: 250px;"
				+ "         margin-top:400px;"
				+ "			} "
				+ "			.scene{ "
				+ "    		font-size: 25px;\r\n"
				+ "    		background-image: url(resources/images/sceneBanner.png);\r\n"
				+ "    		background-repeat: no-repeat;\r\n"
				+ "         background-position:center;"	
				+ "    		background-size: contain;\r\n"
				+ "   		text-align: center;\r\n"
				+ "    		page-break-before: always;"
				+ "			margin-top:20px;"
				+ "    		height: 100px;"
				+ "			}"
				+ "         .sceneText{padding-top: 35px;}"
				+ "			.stageEvent{ "
				+ "			 clear: both;  display: table; width:100%; "
				+ "			} "
				+ "			.left{ "
				+ "			text-align:left "
				+ "			} "
				+ "			.right{ "
				+ "			text-align:right "
				+ "			} "
				+ "			.center{ "
				+ "			text-align:center "
				+ "			} "
				+ "			.fleft{ "
				+ "			float:left; "
				+ "			} "
				+ "			.fright{ "
				+ "			float:right; "
				+ "			} "
				+ "			.text{ "
				+ "			padding:20px; width: 300px;"
				+ "			} div.item{"
				+ "    vertical-align: top;"
				+ "    display: inline-block;"
				+ "    text-align: center;"
				+ "    width: 190px;"
				+ "	   font-size:30px;"
				+ "} "
				+ ".caption"
				+ "    display: block;"
				+ "	   }"			
				+ "        </style> "
				+ "    </head> "
				+ "    <body>";
		}
		
		public static void reset(){
			firstPersonae = true;
			firstAct = true;
			stageEventLeft = true;
		}
		
		public static void addPersonae(String personae) {
			if(firstPersonae) {
				htmlFile += "<div class=\"charList\">"
						+ "		<h2 style=\"font-size:40px;\">Character list:</h2>";
				firstPersonae = false;
			}
			htmlFile += "<div class=\"item\">"
					+ "    <img class=\"image\"  src=\"resources/images/custom_"+personae+".jpg\" /></img>"
					+ "    <span class=\"caption\">"+personae+"</span></div>";
		}
		
		public static void addTitle(String title) {
			htmlFile += "<div class=\"title\">"
					+ title +"</div>";
		}
		
		public static void addStageEvent(String personae, String wh, String event) {
			if(wh.compareTo("are")==0)
				addStageEvent(personae,"You are"+event);
			else
				addStageEvent(personae,wh+" "+event);
		}
			
		public static void addStageEvent(String personae, String event) {
			if(stageEventLeft) {
				htmlFile += "<div class=\"stageEvent no-page-break left\">\r\n"
						+ "			<img class=\"image fleft\" src=\"resources/images/custom_"+personae+".jpg\" /></img>"
						+ "			<div class=\"text fleft\" > ";
			}
			else
			{
				htmlFile += "<div class=\"stageEvent no-page-break right\">\r\n"
						+ "			<img class=\"image fright\" src=\"resources/images/custom_"+personae+".jpg\" /></img>"
						+ "			<div class=\"text fright\" > ";
			}
			stageEventLeft = !stageEventLeft;
			htmlFile += "<h2>"+personae+":</h2>"
					+ "<p>"+event+"</p>"
					+ "			</div>"
					+ "		</div>";
		}
		
		public static void addAct(String act, String comment) {
			if(firstAct) {
				htmlFile += "</div>";
				firstAct = false;
			}
			htmlFile += "<div class=\"act\">ACT "+act+"</div><div class=\"center\"><h1>"+comment+"</h1></div>";
		}
		
		public static void addScene(String scene,String comment) {
			htmlFile += "<div class=\"scene\"><div class=\"sceneText\">SCENE "+scene+"</div></div><div class=\"center\"><h2>"+comment+"</h2></div>";
			stageEventLeft = true;
		}
		
		public static String getFile() {
			htmlFile += "</body></html>";
			return htmlFile;
		}
	}
}
