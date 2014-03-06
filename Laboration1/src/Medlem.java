import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;


public class Medlem extends JFrame {

	private JPanel contentPane;
	private JTextField txtClaudeRains;
	private JTextField textField_1;
	private JTextField txtCasablanca;
	private JTextField textField_3;
	private JTextField txtInvisiblemancom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medlem frame = new Medlem();
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
	public Medlem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(10, 32, 580, 50);
		contentPane.add(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenu mnSkrivUt = new JMenu("Skriv ut");
		mnArkiv.add(mnSkrivUt);
		
		JMenu mnAvsluta = new JMenu("Avsluta");
		mnArkiv.add(mnAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenu mnNyMedlem = new JMenu("Ny medlem");
		mnMedlem.add(mnNyMedlem);
		
		JMenu mnSkMedlem = new JMenu("S\u00F6k medlem");
		mnMedlem.add(mnSkMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenu mnHjlp_1 = new JMenu("Hj\u00E4lp");
		mnHjlp.add(mnHjlp_1);
		
		JMenu mnOmProgrammet = new JMenu("Om Programmet");
		mnHjlp.add(mnOmProgrammet);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(10, 121, 58, 21);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnr = new JLabel("Personnr.");
		lblPersonnr.setBounds(10, 136, 58, 21);
		contentPane.add(lblPersonnr);
		
		JLabel lblNewLabel = new JLabel("Adress");
		lblNewLabel.setBounds(10, 153, 58, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblTelefonnr = new JLabel("Telefonnr.");
		lblTelefonnr.setBounds(10, 168, 58, 21);
		contentPane.add(lblTelefonnr);
		
		JLabel lblEpos = new JLabel("E-post");
		lblEpos.setBounds(10, 185, 58, 21);
		contentPane.add(lblEpos);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(10, 236, 89, 23);
		contentPane.add(btnSpara);
		
		txtClaudeRains = new JTextField();
		txtClaudeRains.setText("Claude Rains");
		txtClaudeRains.setBounds(88, 121, 127, 20);
		contentPane.add(txtClaudeRains);
		txtClaudeRains.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("10-11-1889");
		textField_1.setBounds(88, 136, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtCasablanca = new JTextField();
		txtCasablanca.setText("Casablanca");
		txtCasablanca.setBounds(88, 153, 127, 20);
		contentPane.add(txtCasablanca);
		txtCasablanca.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("648-348935");
		textField_3.setBounds(88, 168, 127, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		txtInvisiblemancom = new JTextField();
		txtInvisiblemancom.setText("invisible@man.com");
		txtInvisiblemancom.setBounds(88, 185, 127, 20);
		contentPane.add(txtInvisiblemancom);
		txtInvisiblemancom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Medlem.class.getResource("/image/Clade Rains.jpg")));
		lblNewLabel_1.setBounds(249, 83, 214, 278);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("The Gymnasium of Horrors");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(10, 0, 580, 29);
		contentPane.add(label);
	}
}
