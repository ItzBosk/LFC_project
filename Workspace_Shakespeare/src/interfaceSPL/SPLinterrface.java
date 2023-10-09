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
import compilerPackage.util.CharacterDescriptor;

public class SPLinterrface extends JFrame {
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextPane codeTextArea;
	public static SPLparser parser;
    private Popup popup;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					SPLinterrface frame = new SPLinterrface();
					parser = new SPLparser();
					System.out.println("parser caricato: " + parser.getClass().toString());
					frame.setVisible(true);
					
					 String file = new String(Files.readAllBytes(Paths.get("./resources/input.file")), StandardCharsets.UTF_8); //carico file
					 codeTextArea.setText(file);
					 CharacterDescriptor.setBasePhotoPath(); //inizializzo foto
					 
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
		contentPane.setBackground(new Color(0xFAEBD7));

		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 125, 1390, 619);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel filePanel = new JPanel();
		layeredPane.add(filePanel, "name_7993193991800");
		filePanel.setLayout(null);
		filePanel.setBackground(new Color(0xFAEBD7));

		
		
		JPanel pdfPanel = new JPanel();
		layeredPane.add(pdfPanel, "name_8009681722500");
		pdfPanel.setLayout(null);
		pdfPanel.setBackground(new Color(0xFAEBD7));

		
		
		//-------------------------------------------------------------------------------------------------------------
		//file label
		JLabel fileLabel = new JLabel("File Management");
		
		
		
		fileLabel.setFont(new Font("Open Sans", Font.PLAIN, 18));
		fileLabel.setBackground(SystemColor.controlShadow);
		fileLabel.setBounds(10, 83, 200, 32);
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
		JLabel pdfLabel = new JLabel("PDF Management");
		
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
		pdfLabel.setBounds(230, 83, 200, 32);
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
		spllabelwrite.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		spllabelwrite.setBounds(430, 20, 73, 43);
		contentPane.add(spllabelwrite);
	
		//scritta Shakespeare Programming Language
		JLabel titlelabel = new JLabel("Shakespeare Programming Language");
		titlelabel.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		titlelabel.setBounds(510, 32, 480, 23);
		contentPane.add(titlelabel);
		
		//logo SPL
//		JLabel spllabellogo = new JLabel("spl logo");
//		spllabellogo.setBounds(10, 10, 200, 63);
//		contentPane.add(spllabellogo);
//		Image imgfile3 = Toolkit.getDefaultToolkit().getImage("./resources/spllogo.png");
//		spllabellogo.setIcon(new ImageIcon(imgfile3.getScaledInstance(spllabellogo.getWidth() , 
//				spllabellogo.getHeight(), Image.SCALE_SMOOTH)));
		
		
		
//		//codice effettivo di FILE
		codeTextArea = new JTextPane();
		codeTextArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		codeTextArea.setText("input file");
		codeTextArea.setBounds(39, 22, 515, 534);
		codeTextArea.setBackground(new Color(0xFFFEEF));

		filePanel.add(codeTextArea);
		
		JScrollPane scrollPane_input = new JScrollPane(codeTextArea);
		scrollPane_input.setBounds(0, 43, 720, 513);
		scrollPane_input.setBackground(new Color(0xFEFEE9));
		filePanel.add(scrollPane_input);
		
		
		
		//button COMPILA click
		JButton compileButton = new JButton("Compile");
		compileButton.setBackground(SystemColor.controlHighlight);

		compileButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		compileButton.setBounds(295, 566, 115, 35);
		filePanel.add(compileButton);
		
		
		JTextLineNumber tln = new JTextLineNumber(codeTextArea);
		scrollPane_input.setRowHeaderView( tln );
		tln.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input File");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(310, 18, 97, 20);
		filePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Console Output ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(1000, 18, 120, 20);
		filePanel.add(lblNewLabel_3);
		
		JScrollPane scrollPane_console = new JScrollPane();
		scrollPane_console.setBounds(746, 43, 634, 557);
		filePanel.add(scrollPane_console);
		
		JTextPane txtpnOutputConsole = new JTextPane();
		txtpnOutputConsole.setEditable(false);
		scrollPane_console.setViewportView(txtpnOutputConsole);
		txtpnOutputConsole.setText("Console Output ");
		txtpnOutputConsole.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtpnOutputConsole.setBackground(new Color(0xFFFEEF));
		
		JPanel divisotryPanel = new JPanel();
		divisotryPanel.setForeground(new Color(204, 153, 0));
		divisotryPanel.setBackground(new Color(204, 153, 102));
		divisotryPanel.setBounds(0, 123, 1405, 2);
		contentPane.add(divisotryPanel);
//		divisotryPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
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
		
		JButton downloadPdfButton = new JButton("Download PDF");
		downloadPdfButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		downloadPdfButton.setBounds(486, 566, 180, 35);
		downloadPdfButton.setBackground(SystemColor.controlHighlight);

		
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
		
		
		
		//-------------------------------------------------------------------------------------------------
		//HAMLET
		JPanel hamletPanel = new JPanel();

		hamletPanel.setBounds(100, 54, 150, 210);
		pdfPanel.add(hamletPanel);
		hamletPanel.setLayout(null);
		hamletPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel hamletIcon = new JLabel("New label");
		hamletIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hamletPanel.setBackground(SystemColor.controlShadow);
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

				try {
					System.out.println(fc.getSelectedFile().getAbsolutePath());	
					CharacterDescriptor.setPersonaePhotoPath("Hamlet", fc.getSelectedFile().getAbsolutePath()); //cambio foto

					//visualizzo nuova immagine
					Image imgHamlet = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					hamletIcon.setIcon(new ImageIcon(imgHamlet.getScaledInstance(hamletIcon.getHeight() , 
							hamletIcon.getHeight(), Image.SCALE_SMOOTH)));
				} catch (Exception e2) {
					// TODO: handle exception
				}												
			}
		});
		hamletIcon.setBounds(0, 30, 150, 150);
		hamletIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		hamletPanel.add(hamletIcon);
		
		JLabel lblNewLabel_1 = new JLabel("Hamlet");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 150, 30);
		hamletPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));				
		hamletPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		hamletPanel.setBackground(SystemColor.controlHighlight);
		
		Image imgHamlet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Hamlet.jpg");
		hamletIcon.setIcon(new ImageIcon(imgHamlet.getScaledInstance(hamletIcon.getHeight() , 
				hamletIcon.getHeight(), Image.SCALE_SMOOTH)));
		
		JButton hamletButtonReset = new JButton("Reset Image");
		hamletButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Hamlet");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgHamlet = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Hamlet.jpg");
				hamletIcon.setIcon(new ImageIcon(imgHamlet.getScaledInstance(hamletIcon.getHeight() , 
						hamletIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		hamletButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hamletButtonReset.setBounds(0, 180, 150, 30);
		hamletPanel.add(hamletButtonReset);
		hamletButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		hamletButtonReset.setBackground(SystemColor.controlHighlight);
		
//		Image imgJuliet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Juliet.jpg");
		

		
		
		//-------------------------------------------------------------------------------------------------
		//BANQUO
		JPanel banquoPanel = new JPanel();
		banquoPanel.setLayout(null);
		banquoPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		banquoPanel.setBackground(SystemColor.controlHighlight);
		banquoPanel.setBounds(300, 54, 150, 210);
		pdfPanel.add(banquoPanel);
		
		JLabel banquoIcon = new JLabel("New label");
		banquoIcon.setBounds(0, 30, 150, 150);
		banquoPanel.add(banquoIcon);
		banquoIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		banquoIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				banquoPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				banquoPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Banquo", fc.getSelectedFile().getName()); //cambio foto

					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					banquoIcon.setIcon(new ImageIcon(img.getScaledInstance(banquoIcon.getHeight() , 
							banquoIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
				}
												
			}
		});
		
		JLabel lblNewLabel_1_1 = new JLabel("Banquo");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(0, 0, 150, 30);
		banquoPanel.add(lblNewLabel_1_1);
		
		Image imgBanquo = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Banquo.jpg");
		banquoIcon.setIcon(new ImageIcon(imgBanquo.getScaledInstance(banquoIcon.getHeight() , 
				banquoIcon.getHeight(), Image.SCALE_SMOOTH)));
		
		JButton banquoButtonReset = new JButton("Reset Image");
		banquoButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Banquo");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgBanquo = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Banquo.jpg");
				banquoIcon.setIcon(new ImageIcon(imgBanquo.getScaledInstance(banquoIcon.getHeight() , 
						banquoIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		banquoButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		banquoButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		banquoButtonReset.setBackground(SystemColor.controlHighlight);
		banquoButtonReset.setBounds(0, 180, 150, 30);
		banquoPanel.add(banquoButtonReset);
		
		
		
		
		//-------------------------------------------------------------------------------------------------
		//gertrude
		JPanel gertrudePanel = new JPanel();
		gertrudePanel.setLayout(null);
		gertrudePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		gertrudePanel.setBackground(SystemColor.controlHighlight);
		gertrudePanel.setBounds(500, 54, 150, 210);
		pdfPanel.add(gertrudePanel);
		
		JLabel gertrudeIcon = new JLabel("New label");
		gertrudeIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		gertrudeIcon.setBounds(0, 30, 150, 150);
		gertrudePanel.add(gertrudeIcon);
		gertrudeIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gertrudePanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gertrudePanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Gertrude", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					gertrudeIcon.setIcon(new ImageIcon(img.getScaledInstance(gertrudeIcon.getHeight() , 
							gertrudeIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		
		JLabel lblNewLabel_1_2 = new JLabel("Gertrude");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(0, 0, 150, 30);
		gertrudePanel.add(lblNewLabel_1_2);
		
		Image imgGertrude = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Gertrude.jpg");
		gertrudeIcon.setIcon(new ImageIcon(imgGertrude.getScaledInstance(gertrudeIcon.getHeight() , 
				gertrudeIcon.getHeight(), Image.SCALE_SMOOTH)));
		
		
		JButton gertrudeButtonReset = new JButton("Reset Image");
		gertrudeButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		gertrudeButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		gertrudeButtonReset.setBackground(SystemColor.controlHighlight);
		gertrudeButtonReset.setBounds(0, 180, 150, 30);
		gertrudePanel.add(gertrudeButtonReset);
		gertrudeButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Gertrude");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgGertrude = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Gertrude.jpg");
				gertrudeIcon.setIcon(new ImageIcon(imgGertrude.getScaledInstance(gertrudeIcon.getHeight() , 
						gertrudeIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		
		
		//-------------------------------------------------------------------------------------------------
		//ghost
		JPanel ghostPanel = new JPanel();
		ghostPanel.setLayout(null);
		ghostPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		ghostPanel.setBackground(SystemColor.controlHighlight);
		ghostPanel.setBounds(100, 294, 150, 210);
		pdfPanel.add(ghostPanel);
		
		JLabel ghostIcon = new JLabel("New label");
		ghostIcon.setBounds(0, 30, 150, 150);
		ghostPanel.add(ghostIcon);
		ghostIcon.setBorder(BorderFactory.createLineBorder(Color.black));

		ghostIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ghostPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ghostPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Ghost", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					ghostIcon.setIcon(new ImageIcon(img.getScaledInstance(ghostIcon.getHeight() , 
							ghostIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		JLabel lblNewLabel_1_3 = new JLabel("Ghost");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(0, 0, 150, 30);
		ghostPanel.add(lblNewLabel_1_3);
		
		Image imgGhost = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Ghost.jpg");
		ghostIcon.setIcon(new ImageIcon(imgGhost.getScaledInstance(ghostIcon.getHeight() , 
				ghostIcon.getHeight(), Image.SCALE_SMOOTH)));
		
		
		JButton ghostButtonReset = new JButton("Reset Image");
		ghostButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ghostButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		ghostButtonReset.setBackground(SystemColor.controlHighlight);
		ghostButtonReset.setBounds(0, 180, 150, 30);
		ghostPanel.add(ghostButtonReset);
		ghostButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Ghost");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgGhost = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Ghost.jpg");
				ghostIcon.setIcon(new ImageIcon(imgGhost.getScaledInstance(ghostIcon.getHeight() , 
						ghostIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		//-------------------------------------------------------------------------------------------------
		//juliet
		JPanel julietPanel = new JPanel();
		julietPanel.setLayout(null);
		julietPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		julietPanel.setBackground(SystemColor.controlHighlight);
		julietPanel.setBounds(300, 294, 150, 210);
		pdfPanel.add(julietPanel);
		
		JLabel julietIcon = new JLabel("New label");
		julietIcon.setBounds(0, 30, 150, 150);
		julietPanel.add(julietIcon);
		julietIcon.setBorder(BorderFactory.createLineBorder(Color.black));

		julietIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				julietPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				julietPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Juliet", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					julietIcon.setIcon(new ImageIcon(img.getScaledInstance(julietIcon.getHeight() , 
							julietIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		JLabel lblNewLabel_1_4 = new JLabel("Juliet");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(0, 0, 150, 30);
		julietPanel.add(lblNewLabel_1_4);
		
		Image imgJuliet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Juliet.jpg");
		julietIcon.setIcon(new ImageIcon(imgJuliet.getScaledInstance(julietIcon.getHeight() , 
				julietIcon.getHeight(), Image.SCALE_SMOOTH)));
			
		JButton julietButtonReset = new JButton("Reset Image");
		julietButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		julietButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		julietButtonReset.setBackground(SystemColor.controlHighlight);
		julietButtonReset.setBounds(0, 180, 150, 30);
		julietPanel.add(julietButtonReset);
		julietButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Juliet");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgJuliet = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Juliet.jpg");
				julietIcon.setIcon(new ImageIcon(imgJuliet.getScaledInstance(julietIcon.getHeight() , 
						julietIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		

		//-------------------------------------------------------------------------------------------------
		//ladymacbeth
		JPanel ladymacbethPanel = new JPanel();
		ladymacbethPanel.setLayout(null);
		ladymacbethPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		ladymacbethPanel.setBackground(SystemColor.controlHighlight);
		ladymacbethPanel.setBounds(500, 294, 150, 210);
		pdfPanel.add(ladymacbethPanel);
		
		JLabel ladymacbethIcon = new JLabel("New label");
		ladymacbethIcon.setBounds(0, 30, 150, 150);
		ladymacbethPanel.add(ladymacbethIcon);
		
		ladymacbethIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ladymacbethPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ladymacbethPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Ladymacbeth", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					ladymacbethIcon.setIcon(new ImageIcon(img.getScaledInstance(ladymacbethIcon.getHeight() , 
							ladymacbethIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgLadymacbeth = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Ladymacbeth.jpg");
		ladymacbethIcon.setIcon(new ImageIcon(imgLadymacbeth.getScaledInstance(ladymacbethIcon.getHeight() , 
				ladymacbethIcon.getHeight(), Image.SCALE_SMOOTH)));
		ladymacbethIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Ladymacbeth");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 18));
		lblNewLabel_1_4_1.setBounds(0, 0, 150, 30);
		ladymacbethPanel.add(lblNewLabel_1_4_1);
		
		JButton ladymacbethButtonReset = new JButton("Reset Image");
		ladymacbethButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ladymacbethButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		ladymacbethButtonReset.setBackground(SystemColor.controlHighlight);
		ladymacbethButtonReset.setBounds(0, 180, 150, 30);
		ladymacbethPanel.add(ladymacbethButtonReset);
		ladymacbethButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Ladymacbeth");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgLadymacbeth = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Ladymacbeth.jpg");
				ladymacbethIcon.setIcon(new ImageIcon(imgLadymacbeth.getScaledInstance(ladymacbethIcon.getHeight() , 
						ladymacbethIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		
		//-------------------------------------------------------------------------------------------------
		//mercutio
		JPanel mercutioPanel = new JPanel();
		mercutioPanel.setLayout(null);
		mercutioPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		mercutioPanel.setBackground(SystemColor.controlHighlight);
		mercutioPanel.setBounds(700, 294, 150, 210);
		pdfPanel.add(mercutioPanel);
		
		JLabel mercutioIcon = new JLabel("New label");
		mercutioIcon.setBounds(0, 30, 150, 150);
		mercutioPanel.add(mercutioIcon);
		
		mercutioIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mercutioPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mercutioPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Mercutio", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					mercutioIcon.setIcon(new ImageIcon(img.getScaledInstance(mercutioIcon.getHeight() , 
							mercutioIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgMercutio = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Mercutio.jpg");
		mercutioIcon.setIcon(new ImageIcon(imgMercutio.getScaledInstance(mercutioIcon.getHeight() , 
				mercutioIcon.getHeight(), Image.SCALE_SMOOTH)));
		mercutioIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Mercutio");
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4_2.setBounds(0, 0, 150, 30);
		mercutioPanel.add(lblNewLabel_1_4_2);
		
		JButton mercutioButtonReset = new JButton("Reset Image");
		mercutioButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mercutioButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		mercutioButtonReset.setBackground(SystemColor.controlHighlight);
		mercutioButtonReset.setBounds(0, 180, 150, 30);
		mercutioPanel.add(mercutioButtonReset);
		mercutioButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Mercutio");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgMercutio = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Mercutio.jpg");
				mercutioIcon.setIcon(new ImageIcon(imgMercutio.getScaledInstance(mercutioIcon.getHeight() , 
						mercutioIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		
		//-------------------------------------------------------------------------------------------------
		//ophelia
		JPanel opheliaPanel = new JPanel();
		opheliaPanel.setLayout(null);
		opheliaPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		opheliaPanel.setBackground(SystemColor.controlHighlight);
		opheliaPanel.setBounds(900, 294, 150, 210);
		pdfPanel.add(opheliaPanel);
		
		JLabel opheliaIcon = new JLabel("New label");
		opheliaIcon.setBounds(0, 30, 150, 150);
		opheliaPanel.add(opheliaIcon);
		
		opheliaIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				opheliaPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				opheliaPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Ophelia", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					opheliaIcon.setIcon(new ImageIcon(img.getScaledInstance(opheliaIcon.getHeight() , 
							opheliaIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgOphelia = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Ophelia.jpg");
		opheliaIcon.setIcon(new ImageIcon(imgOphelia.getScaledInstance(opheliaIcon.getHeight() , 
				opheliaIcon.getHeight(), Image.SCALE_SMOOTH)));
		opheliaIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Ophelia");
		lblNewLabel_1_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_3.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4_3.setBounds(0, 0, 150, 30);
		opheliaPanel.add(lblNewLabel_1_4_3);
		
		JButton opheliaButtonReset = new JButton("Reset Image");
		opheliaButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		opheliaButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		opheliaButtonReset.setBackground(SystemColor.controlHighlight);
		opheliaButtonReset.setBounds(0, 180, 150, 30);
		opheliaPanel.add(opheliaButtonReset);
		opheliaButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Ophelia");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgOphelia = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Ophelia.jpg");
				opheliaIcon.setIcon(new ImageIcon(imgOphelia.getScaledInstance(opheliaIcon.getHeight() , 
						opheliaIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		//-------------------------------------------------------------------------------------------------
		//polonio
		JPanel polonioPanel = new JPanel();
		polonioPanel.setLayout(null);
		polonioPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		polonioPanel.setBackground(SystemColor.controlHighlight);
		polonioPanel.setBounds(1100, 294, 150, 210);
		pdfPanel.add(polonioPanel);
		
		JLabel poloniotIcon = new JLabel("New label");
		poloniotIcon.setBounds(0, 30, 150, 150);
		polonioPanel.add(poloniotIcon);
		
		poloniotIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				polonioPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				polonioPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Polonio", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					poloniotIcon.setIcon(new ImageIcon(img.getScaledInstance(poloniotIcon.getHeight() , 
							poloniotIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgPolonio = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Polonio.jpg");
		poloniotIcon.setIcon(new ImageIcon(imgPolonio.getScaledInstance(poloniotIcon.getHeight() , 
				poloniotIcon.getHeight(), Image.SCALE_SMOOTH)));
		poloniotIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_4_4 = new JLabel("Polonio");
		lblNewLabel_1_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_4.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4_4.setBounds(0, 0, 150, 30);
		polonioPanel.add(lblNewLabel_1_4_4);
		
		JButton polonioButtonReset = new JButton("Reset Image");
		polonioButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		polonioButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		polonioButtonReset.setBackground(SystemColor.controlHighlight);
		polonioButtonReset.setBounds(0, 180, 150, 30);
		polonioPanel.add(polonioButtonReset);
		
		polonioButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Polonio");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgPolonio = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Polonio.jpg");
				poloniotIcon.setIcon(new ImageIcon(imgPolonio.getScaledInstance(poloniotIcon.getHeight() , 
						poloniotIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		
		//-------------------------------------------------------------------------------------------------
		//prospero
		JPanel prosperoPanel = new JPanel();
		prosperoPanel.setLayout(null);
		prosperoPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		prosperoPanel.setBackground(SystemColor.controlHighlight);
		prosperoPanel.setBounds(700, 54, 150, 210);
		pdfPanel.add(prosperoPanel);
		
		JLabel prosperoIcon = new JLabel("New label");
		prosperoIcon.setBounds(0, 30, 150, 150);
		prosperoPanel.add(prosperoIcon);
		
		prosperoIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				prosperoPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				prosperoPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Prospero", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					prosperoIcon.setIcon(new ImageIcon(img.getScaledInstance(prosperoIcon.getHeight() , 
							prosperoIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgProspero = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Prospero.jpg");
		prosperoIcon.setIcon(new ImageIcon(imgProspero.getScaledInstance(prosperoIcon.getHeight() , 
				prosperoIcon.getHeight(), Image.SCALE_SMOOTH)));
		prosperoIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_4_5 = new JLabel("Prospero");
		lblNewLabel_1_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_5.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4_5.setBounds(0, 0, 150, 30);
		prosperoPanel.add(lblNewLabel_1_4_5);
		
		JButton prosperoButtonReset = new JButton("Reset Image");
		prosperoButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		prosperoButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		prosperoButtonReset.setBackground(SystemColor.controlHighlight);
		prosperoButtonReset.setBounds(0, 180, 150, 30);
		prosperoPanel.add(prosperoButtonReset);
		
		prosperoButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Prospero");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgProspero = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Prospero");
				prosperoIcon.setIcon(new ImageIcon(imgProspero.getScaledInstance(prosperoIcon.getHeight() , 
						prosperoIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		
		//-------------------------------------------------------------------------------------------------
		//romeo
		JPanel romeoPanel = new JPanel();
		romeoPanel.setLayout(null);
		romeoPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		romeoPanel.setBackground(SystemColor.controlHighlight);
		romeoPanel.setBounds(900, 54, 150, 210);
		pdfPanel.add(romeoPanel);
		
		JLabel romeoIcon = new JLabel("New label");
		romeoIcon.setBounds(0, 30, 150, 150);
		romeoPanel.add(romeoIcon);
		
		romeoIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				romeoPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				romeoPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Romeo", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					romeoIcon.setIcon(new ImageIcon(img.getScaledInstance(romeoIcon.getHeight() , 
							romeoIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgRomeo = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Romeo.jpg");
		romeoIcon.setIcon(new ImageIcon(imgRomeo.getScaledInstance(romeoIcon.getHeight() , 
				romeoIcon.getHeight(), Image.SCALE_SMOOTH)));
		romeoIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_4_6 = new JLabel("Romeo");
		lblNewLabel_1_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_6.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4_6.setBounds(0, 0, 150, 30);
		romeoPanel.add(lblNewLabel_1_4_6);
		
		JButton romeoButtonReset = new JButton("Reset Image");
		romeoButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		romeoButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		romeoButtonReset.setBackground(SystemColor.controlHighlight);
		romeoButtonReset.setBounds(0, 180, 150, 30);
		romeoPanel.add(romeoButtonReset);
		
		romeoButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Romeo");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgRomeo = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Romeo.jpg");
				romeoIcon.setIcon(new ImageIcon(imgRomeo.getScaledInstance(romeoIcon.getHeight() , 
						romeoIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		//-------------------------------------------------------------------------------------------------
		//shylock
		JPanel shylockPanel = new JPanel();
		shylockPanel.setLayout(null);
		shylockPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		shylockPanel.setBackground(SystemColor.controlHighlight);
		shylockPanel.setBounds(1100, 54, 150, 210);
		pdfPanel.add(shylockPanel);
		
		JLabel shylockIcon = new JLabel("New label");
		shylockIcon.setBounds(0, 30, 150, 150);
		shylockPanel.add(shylockIcon);
		
		shylockIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				shylockPanel.setBackground(SystemColor.controlShadow);
				JLabel text = new JLabel("Click to change the Image");
                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
                popup.show();            
			}
			@Override
			public void mouseExited(MouseEvent e) {
				shylockPanel.setBackground(SystemColor.controlHighlight);
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

				try {
					System.out.println(fc.getSelectedFile().getName());	
					CharacterDescriptor.setPersonaePhotoPath("Shylock", fc.getSelectedFile().getName()); //cambio foto
					//visualizzo nuova immagine
					Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/"+fc.getSelectedFile().getName());
					shylockIcon.setIcon(new ImageIcon(img.getScaledInstance(shylockIcon.getHeight() , 
							shylockIcon.getHeight(), Image.SCALE_SMOOTH)));	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		Image imgShylock = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Shylock.jpg");
		shylockIcon.setIcon(new ImageIcon(imgShylock.getScaledInstance(shylockIcon.getHeight() , 
				shylockIcon.getHeight(), Image.SCALE_SMOOTH)));
		shylockIcon.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1_4_7 = new JLabel("Shylock");
		lblNewLabel_1_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_7.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_1_4_7.setBounds(0, 0, 150, 30);
		shylockPanel.add(lblNewLabel_1_4_7);
		
		JButton shylockButtonReset = new JButton("Reset Image");
		shylockButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		shylockButtonReset.setBorder(BorderFactory.createLineBorder(Color.black));
		shylockButtonReset.setBackground(SystemColor.controlHighlight);
		shylockButtonReset.setBounds(0, 180, 150, 30);
		shylockPanel.add(shylockButtonReset);
		

		shylockButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.resetPersonaePhotoPath("Shylock");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Image imgShylock = Toolkit.getDefaultToolkit().getImage("./resources/images/custom_Shylock.jpg");
				shylockIcon.setIcon(new ImageIcon(imgShylock.getScaledInstance(shylockIcon.getHeight() , 
						shylockIcon.getHeight(), Image.SCALE_SMOOTH)));
			}
		});
		
		
		
		//----------------------------------------------------------------------------------------------------
		//reset all button
		JButton resetAllButton = new JButton("Reset All Images");
		resetAllButton.setBackground(SystemColor.controlHighlight);

		resetAllButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CharacterDescriptor.setBasePhotoPath();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				Image imgShylock = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Shylock.jpg");
				shylockIcon.setIcon(new ImageIcon(imgShylock.getScaledInstance(shylockIcon.getHeight() , 
						shylockIcon.getHeight(), Image.SCALE_SMOOTH)));
				shylockIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgHamlet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Hamlet.jpg");
				hamletIcon.setIcon(new ImageIcon(imgHamlet.getScaledInstance(hamletIcon.getHeight() , 
						hamletIcon.getHeight(), Image.SCALE_SMOOTH)));
				hamletIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgBanquo = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Banquo.jpg");
				banquoIcon.setIcon(new ImageIcon(imgBanquo.getScaledInstance(banquoIcon.getHeight() , 
						banquoIcon.getHeight(), Image.SCALE_SMOOTH)));
				banquoIcon.setBorder(BorderFactory.createLineBorder(Color.black));

				Image imgGertrude = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Gertrude.jpg");
				gertrudeIcon.setIcon(new ImageIcon(imgGertrude.getScaledInstance(gertrudeIcon.getHeight() , 
						gertrudeIcon.getHeight(), Image.SCALE_SMOOTH)));
				gertrudeIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgGhost = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Ghost.jpg");
				ghostIcon.setIcon(new ImageIcon(imgGhost.getScaledInstance(ghostIcon.getHeight() , 
						ghostIcon.getHeight(), Image.SCALE_SMOOTH)));
				ghostIcon.setBorder(BorderFactory.createLineBorder(Color.black));

				Image imgJuliet = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Juliet.jpg");
				julietIcon.setIcon(new ImageIcon(imgJuliet.getScaledInstance(julietIcon.getHeight() , 
						julietIcon.getHeight(), Image.SCALE_SMOOTH)));
				julietIcon.setBorder(BorderFactory.createLineBorder(Color.black));

				Image imgLadymacbeth = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Ladymacbeth.jpg");
				ladymacbethIcon.setIcon(new ImageIcon(imgLadymacbeth.getScaledInstance(ladymacbethIcon.getHeight() , 
						ladymacbethIcon.getHeight(), Image.SCALE_SMOOTH)));
				ladymacbethIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgMercutio = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Mercutio.jpg");
				mercutioIcon.setIcon(new ImageIcon(imgMercutio.getScaledInstance(mercutioIcon.getHeight() , 
						mercutioIcon.getHeight(), Image.SCALE_SMOOTH)));
				mercutioIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgOphelia = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Ophelia.jpg");
				opheliaIcon.setIcon(new ImageIcon(imgOphelia.getScaledInstance(opheliaIcon.getHeight() , 
						opheliaIcon.getHeight(), Image.SCALE_SMOOTH)));
				opheliaIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgPolonio = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Polonio.jpg");
				poloniotIcon.setIcon(new ImageIcon(imgPolonio.getScaledInstance(poloniotIcon.getHeight() , 
						poloniotIcon.getHeight(), Image.SCALE_SMOOTH)));
				poloniotIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgProspero = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Prospero.jpg");
				prosperoIcon.setIcon(new ImageIcon(imgProspero.getScaledInstance(prosperoIcon.getHeight() , 
						prosperoIcon.getHeight(), Image.SCALE_SMOOTH)));
				prosperoIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				Image imgRomeo = Toolkit.getDefaultToolkit().getImage("./resources/images/base_Romeo.jpg");
				romeoIcon.setIcon(new ImageIcon(imgRomeo.getScaledInstance(romeoIcon.getHeight() , 
						romeoIcon.getHeight(), Image.SCALE_SMOOTH)));
				romeoIcon.setBorder(BorderFactory.createLineBorder(Color.black));
				
				

				
			}
		});
		resetAllButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		resetAllButton.setBounds(688, 566, 180, 35);
		pdfPanel.add(resetAllButton);
	}
}







