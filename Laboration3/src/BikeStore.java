import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BikeStore extends JFrame {
	
	private JTextArea textArea;
	private JPanel contentPane;
	private JTextField txtColor;
	private JTextField txtSize;
	private JTextField txtPrice;
	
private BikeStoreMain mybikestore = new BikeStoreMain();
//private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStore frame = new BikeStore();
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
	public BikeStore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 69, 397, 132);
		contentPane.add(textArea);
		
		
		txtColor = new JTextField();
		txtColor.setBounds(20, 35, 120, 23);
		contentPane.add(txtColor);
		txtColor.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setBounds(150, 35, 137, 23);
		contentPane.add(txtSize);
		txtSize.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(297, 35, 120, 23);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		

			

		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(20, 10, 120, 14);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(150, 10, 137, 14);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(297, 10, 120, 14);
		contentPane.add(lblPrice);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mybikestore.addBike(txtColor.getText(), Integer.parseInt(txtSize.getText()), Integer.parseInt(txtPrice.getText()));
				textArea.setText(mybikestore.getAllBikes());
				
			
			}
		});
		btnNewButton.setBounds(328, 227, 89, 23);
		contentPane.add(btnNewButton);
	
	}
}


