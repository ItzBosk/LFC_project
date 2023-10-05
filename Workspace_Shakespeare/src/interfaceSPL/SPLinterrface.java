package interfaceSPL;


import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.awt.EventQueue;
import java.awt.FileDialog;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.lowagie.text.pdf.PdfLayer;

import appPackage.SPLparser;
import compilerPackage.ShakespeareLexer;
import compilerPackage.ShakespeareParser;
import compilerPackage.util.CharacterDescriptor;
import outputPackage.HtmlToPDF;

import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.filechooser.FileSystemView;

import org.antlr.runtime.Lexer;


public class SPLinterrface extends JFrame {
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextPane codeTextArea;
	public static SPLparser parser;
    private Popup popup;
    public static Hashtable<CharacterDescriptor, String > characterListGUI; //nome personaggio, file image associato

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					characterListGUI = new Hashtable<CharacterDescriptor, String >();
					SPLinterrface frame = new SPLinterrface();
					parser = new SPLparser();
					System.out.println("parser caricato: " + parser.getClass().toString());
					frame.setVisible(true);
					
					 String file = new String(Files.readAllBytes(Paths.get("./resources/input.file")), StandardCharsets.UTF_8); //carico file
					 codeTextArea.setText(file);
					 
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	
	
	/**
	 * Create the frame.
	 */
	public SPLinterrface() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./resources/icon.png"));
		setTitle("SPL GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1414, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 125, 1390, 619);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel filePanel = new JPanel();
		layeredPane.add(filePanel, "name_7993193991800");
		filePanel.setLayout(null);
		
		JPanel pdfPanel = new JPanel();
		layeredPane.add(pdfPanel, "name_8009681722500");
		pdfPanel.setLayout(null);
		
		
		
		JPanel hamletPanel = new JPanel();
		hamletPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		hamletPanel.setBounds(10, 10, 150, 180);
		pdfPanel.add(hamletPanel);
		hamletPanel.setLayout(null);
		
		JLabel hamletIcon = new JLabel("New label");
		hamletIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hamletPanel.setBackground(SystemColor.controlShadow);
//				hamletIcon.setToolTipText("pspspsps");
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();
                
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hamletPanel.setBackground(SystemColor.controlHighlight);
				popup.hide();
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				File fl = new File("./resources/images"); //non posso muovermi da directory attuale
				FileSystemView fsv = new SingleRootFileSystemView( fl );
				UIManager.put("FileChooser.readOnly", Boolean.TRUE); //unica azione che posso fare e' selezionare foto

				final JFileChooser fc = new JFileChooser(fsv);

				FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","jpg"); //seleziono solo file jpg
				fc.setFileFilter(filter); //applico filtro

				fc.showDialog(SPLinterrface.this, "Select Image"); //apri dialog

				System.out.println(fc.getSelectedFile().getName());


			}
		});
		hamletIcon.setBounds(0, 30, 150, 150);
		hamletPanel.add(hamletIcon);
		
		JLabel lblNewLabel_1 = new JLabel("Hamlet");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 150, 30);
		hamletPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		         
		
		
//		JLabel label = new JLabel("New label");
//		layeredPane.add(label, "name_18762670247100");
		
		
		//-------------------------------------------------------------------------------------------------------------
		//file label
		JLabel fileLabel = new JLabel(" Gestione File");
		
		
		
		fileLabel.setFont(new Font("Open Sans", Font.PLAIN, 18));
		fileLabel.setBackground(SystemColor.controlShadow);
		fileLabel.setBounds(10, 83, 150, 32);
		contentPane.add(fileLabel);
		fileLabel.setOpaque(true);
		//fileLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		//fileLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		fileLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));

		Image imgfile = Toolkit.getDefaultToolkit().getImage("./resources/fileicon.png");
		
		fileLabel.setIcon(new ImageIcon(imgfile.getScaledInstance(fileLabel.getHeight()*60/100 , 
				fileLabel.getHeight()*60/100, Image.SCALE_SMOOTH)));
		
		
		
		
		//-------------------------------------------------------------------------------------------------------------
		//pdf label
		JLabel pdfLabel = new JLabel(" Gestione PDF");
		
		//event: mouse click
		pdfLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pdfPanel.setVisible(true);
				filePanel.setVisible(false);
				pdfLabel.setBackground(SystemColor.controlShadow);
				fileLabel.setBackground(SystemColor.controlHighlight);

			}
		});
		
		//evento click mouse
		fileLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pdfPanel.setVisible(false);
				filePanel.setVisible(true);
				pdfLabel.setBackground(SystemColor.controlHighlight);
				fileLabel.setBackground(SystemColor.controlShadow);
			}
		});
		
		pdfLabel.setFont(new Font("Open Sans", Font.PLAIN, 18));
		pdfLabel.setBackground(SystemColor.controlHighlight);
		pdfLabel.setBounds(183, 83, 150, 32);
		contentPane.add(pdfLabel);
		pdfLabel.setOpaque(true);
		//pdfLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		pdfLabel.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		//pdfLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		Image imgfile2 = Toolkit.getDefaultToolkit().getImage("./resources/pdficon.png");
		
		pdfLabel.setIcon(new ImageIcon(imgfile2.getScaledInstance(pdfLabel.getHeight()*60/100 , 
				pdfLabel.getHeight()*60/100, Image.SCALE_SMOOTH)));
		
		
		//-------------------------------------------------------------------------------------------------------------
		//scritta SPL	
		JLabel spllabelwrite = new JLabel(" SPL");
		spllabelwrite.setFont(new Font("Lucida Handwriting", Font.BOLD, 28));
		spllabelwrite.setBounds(412, 20, 73, 43);
		contentPane.add(spllabelwrite);
	
		//scritta Shakespeare Programming Language
		JLabel titlelabel = new JLabel("Shakespeare Programming Language");
		titlelabel.setFont(new Font("Lucida Handwriting", Font.PLAIN, 18));
		titlelabel.setBounds(482, 34, 399, 23);
		contentPane.add(titlelabel);
		
		//logo SPL
		JLabel spllabellogo = new JLabel("spl logo");
		spllabellogo.setBounds(10, 10, 200, 63);
		contentPane.add(spllabellogo);
		
		Image imgfile3 = Toolkit.getDefaultToolkit().getImage("./resources/spllogo.png");
		spllabellogo.setIcon(new ImageIcon(imgfile3.getScaledInstance(spllabellogo.getWidth() , 
				spllabellogo.getHeight(), Image.SCALE_SMOOTH)));
		
		
		
//		//codice effettivo di FILE
		codeTextArea = new JTextPane();
		codeTextArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		codeTextArea.setText("input file");
		codeTextArea.setBounds(39, 22, 515, 534);
		filePanel.add(codeTextArea);
		
		JScrollPane scrollPane_input = new JScrollPane(codeTextArea);
		scrollPane_input.setBounds(0, 43, 720, 513);
		filePanel.add(scrollPane_input);
		
		
		//button COMPILA click
		JButton compileButton = new JButton("Compila");

		compileButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		compileButton.setBounds(295, 566, 115, 34);
		filePanel.add(compileButton);
		
		
		JTextLineNumber tln = new JTextLineNumber(codeTextArea);
		scrollPane_input.setRowHeaderView( tln );
		tln.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input File");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(300, 18, 97, 20);
		filePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Output console");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(955, 18, 107, 20);
		filePanel.add(lblNewLabel_3);
		
		JScrollPane scrollPane_console = new JScrollPane();
		scrollPane_console.setBounds(746, 43, 634, 557);
		filePanel.add(scrollPane_console);
		
		JTextPane txtpnOutputConsole = new JTextPane();
		txtpnOutputConsole.setEditable(false);
		scrollPane_console.setViewportView(txtpnOutputConsole);
		txtpnOutputConsole.setText("output console");
		txtpnOutputConsole.setFont(new Font("Consolas", Font.PLAIN, 14));
		
		JPanel divisotryPanel = new JPanel();
		divisotryPanel.setBackground(new Color(0, 0, 0));
		divisotryPanel.setBounds(0, 125, 1390, 0);
		contentPane.add(divisotryPanel);
		divisotryPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		//event button compila click
		compileButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			 try {
			      FileWriter myWriter = new FileWriter( "./resources/input.file");
			      myWriter.write(codeTextArea.getText());
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException ee) {
			      System.out.println("An error occurred.");
			      ee.printStackTrace();
			    }
				 
				parser.main(null);
//				txtpnOutputConsole.setText(parser.toString());
				System.out.println(parser.getConsoleOuput());
//				System.out.println(parser.toString());
				txtpnOutputConsole.setText(parser.getConsoleOuput());

			}
		});
		
		
		
		
		//-------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------------------
		//   PARTE PDF
	    //   'Romeo'
	    //   'Juliet'
	    //   'Hamlet'
	    //   'Ghost'
	    //   'LadyMacbeth'
	    //   'Ophelia'
	    //   'Mercutio'
	    //   'Banquo'
	    //   'Gertrude'
	    //   'Polonio'
	    //   'Shylock'
	    //   'Prospero'
		hamletPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		hamletPanel.setBackground(SystemColor.controlHighlight);
		
		Image imgHamlet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Hamlet.jpg");
		hamletIcon.setIcon(new ImageIcon(imgHamlet.getScaledInstance(hamletIcon.getHeight() , 
				hamletIcon.getHeight(), Image.SCALE_SMOOTH)));
		
		JPanel julietPanel = new JPanel();
		julietPanel.setLayout(null);
		julietPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		julietPanel.setBackground(SystemColor.controlHighlight);
		julietPanel.setBounds(200, 10, 150, 180);
		pdfPanel.add(julietPanel);
		
		JLabel julietIcon = new JLabel("New label");
		julietIcon.setBounds(0, 30, 150, 150);
		julietPanel.add(julietIcon);
		
		Image imgJuliet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Juliet.jpg");
		julietIcon.setIcon(new ImageIcon(imgJuliet.getScaledInstance(julietIcon.getHeight() , 
				julietIcon.getHeight(), Image.SCALE_SMOOTH)));
		
		JLabel lblNewLabel_1_1 = new JLabel("Juliet");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(0, 0, 150, 30);
		julietPanel.add(lblNewLabel_1_1);
		
		JPanel hamletPanel_2 = new JPanel();
		hamletPanel_2.setLayout(null);
		hamletPanel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		hamletPanel_2.setBackground(SystemColor.controlHighlight);
		hamletPanel_2.setBounds(950, 10, 300, 100);
		pdfPanel.add(hamletPanel_2);
		
		JLabel hamletIcon_2 = new JLabel("New label");
		hamletIcon_2.setBounds(0, 0, 100, 100);
		hamletPanel_2.add(hamletIcon_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hamlet");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(222, 34, 78, 25);
		hamletPanel_2.add(lblNewLabel_1_2);
		
		JButton downloadPdfButton = new JButton("Download PDF");
		downloadPdfButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		downloadPdfButton.setBounds(543, 522, 162, 75);
		downloadPdfButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 try {
				  contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			      HtmlToPDF.generatePDFfromHTML();
			      contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			    } catch (Exception ee) {
			      System.out.println("An error occurred.");
			      ee.printStackTrace();
			    }
			}
		});
		pdfPanel.add(downloadPdfButton);
	}

	void loadBaseImage() {
//		characterListGUI.put();
	}
}







