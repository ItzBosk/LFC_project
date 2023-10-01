package interfaceSPL;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import com.lowagie.text.pdf.PdfLayer;

import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JButton;

public class SPLinterrface extends JFrame {
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SPLinterrface frame = new SPLinterrface();
					frame.setVisible(true);
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(SPLinterrface.class.getResource("/interfaceSPL/icon.png")));
		setTitle("SPL GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 125, 1256, 619);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel filePanel = new JPanel();
		layeredPane.add(filePanel, "name_7993193991800");
		filePanel.setLayout(null);
		
		JPanel pdfPanel = new JPanel();
		layeredPane.add(pdfPanel, "name_8009681722500");
		pdfPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PDF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(451, 291, 147, 149);
		pdfPanel.add(lblNewLabel_1);
		
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

		Image imgfile = new ImageIcon(this.getClass().getResource("fileicon.png")).getImage();
		
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
		Image imgfile2 = new ImageIcon(this.getClass().getResource("pdficon.png")).getImage();
		
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
//		JLabel spllabellogo = new JLabel("spl logo");
//		spllabellogo.setBounds(10, 10, 200, 63);
//		contentPane.add(spllabellogo);
//		
//		Image imgfile3 = new ImageIcon(this.getClass().getResource("spllogo.png")).getImage();
//		spllabellogo.setIcon(new ImageIcon(imgfile3.getScaledInstance(spllabellogo.getWidth() , 
//				spllabellogo.getHeight(), Image.SCALE_SMOOTH)));
//		
		
		
//		//codice effettivo di FILE
		JTextPane codeTextArea = new JTextPane();
		codeTextArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		codeTextArea.setText("input file");
		codeTextArea.setBounds(39, 22, 515, 534);
		filePanel.add(codeTextArea);
		
		JScrollPane scrollPane_input = new JScrollPane(codeTextArea);
		scrollPane_input.setBounds(0, 43, 723, 513);
		filePanel.add(scrollPane_input);
		
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
		scrollPane_console.setBounds(762, 43, 484, 557);
		filePanel.add(scrollPane_console);
		
		JTextPane txtpnOutputConsole = new JTextPane();
		txtpnOutputConsole.setText("output console");
		txtpnOutputConsole.setFont(new Font("Consolas", Font.PLAIN, 14));
		scrollPane_console.setViewportView(txtpnOutputConsole);
		
		JPanel divisotryPanel = new JPanel();
		divisotryPanel.setBackground(new Color(0, 0, 0));
		divisotryPanel.setBounds(0, 124, 1279, 1);
		contentPane.add(divisotryPanel);
		divisotryPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		

		
	}
}







