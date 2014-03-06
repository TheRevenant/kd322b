import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTextArea;


public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 239);
		contentPane.add(textArea);
		
		House House1 = new House (1985,185);
		House House2 = new House (1852,9);
		House House3 = new House (1587,250);
		
		House houseArray []; 
		houseArray = new House [10];
		
		houseArray [0] = House1;
		houseArray [1] = House2;
		houseArray [2] = House3;
		
		for (int i = 0; i< houseArray.length; i++){
			if (houseArray[i] != null){
				textArea.append("Ett hus är byggt " + houseArray[i].getYear() + " och är "  + houseArray[i].getSize() + "\n");
				
			}
		}
		textArea.append("Totalt finns " + House.getNbrHouses() + " stycken hus");
	}
}
	

