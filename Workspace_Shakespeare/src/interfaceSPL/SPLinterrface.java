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
		setBounds(100, 100, 1012, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 125, 978, 619);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel filePanel = new JPanel();
		layeredPane.add(filePanel, "name_7993193991800");
		filePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FILE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(383, 143, 208, 104);
		filePanel.add(lblNewLabel);
		
		JPanel pdfPanel = new JPanel();
		layeredPane.add(pdfPanel, "name_8009681722500");
		pdfPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PDF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(451, 291, 147, 149);
		pdfPanel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		layeredPane.add(label, "name_18762670247100");
		
		
		//-------------------------------------------------------------------------------------------------------------
		//file label
		JLabel fileLabel = new JLabel(" Gestione File");
		
		
		
		fileLabel.setFont(new Font("Open Sans", Font.PLAIN, 18));
		fileLabel.setBackground(SystemColor.controlHighlight);
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
		spllabelwrite.setBounds(212, 20, 73, 43);
		contentPane.add(spllabelwrite);
	
		//scritta Shakespeare Programming Language
		JLabel lblNewLabel_2 = new JLabel("Shakespeare Programming Language");
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(285, 32, 399, 23);
		contentPane.add(lblNewLabel_2);
		
		//logo SPL
		JLabel spllabellogo = new JLabel("spl logo");
		spllabellogo.setBounds(10, 10, 200, 63);
		contentPane.add(spllabellogo);
		
		Image imgfile3 = new ImageIcon(this.getClass().getResource("spllogo.png")).getImage();
		spllabellogo.setIcon(new ImageIcon(imgfile3.getScaledInstance(spllabellogo.getWidth() , 
				spllabellogo.getHeight(), Image.SCALE_SMOOTH)));
	
		

	}
	
	
}







