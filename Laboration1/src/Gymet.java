import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import java.awt.Insets;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;


public class Gymet extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gymet frame = new Gymet();
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
	public Gymet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(10, 25, 580, 50);
		contentPane.add(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenu mnSkivUt = new JMenu("Skiv ut");
		mnArkiv.add(mnSkivUt);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 580, 190);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Chaney, Lon", "01-04-1883", "Paris", "012-345678", "hunch@chaney.com"},
				{"Karloff, Boris", "23-11-1887", "Golstadt", "084-567245", "frankenstein@monster.com"},
				{"Lugosi, Bela", "20-10-1882", "Transylvanien", "0516-56486", "dracula@castle.com"},
				{"Rains, Claude", "10-11-1889", "Casablanca", "648-348935", "invisible@man.com"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Namn", "Persnr.", "Adress", "Telefonnr.", "E-post"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(135);
		scrollPane.setViewportView(table);
		
		JLabel lblMedlemmar = new JLabel("Medlemmar");
		lblMedlemmar.setBounds(10, 83, 82, 23);
		contentPane.add(lblMedlemmar);
		
		JLabel lblNewLabel = new JLabel("The Gymnasium of Horrors");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(10, 0, 580, 29);
		contentPane.add(lblNewLabel);
	}
}
