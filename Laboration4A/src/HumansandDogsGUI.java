import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HumansandDogsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField humani;
	private JTextField dogi;
	private JTextField info;
	private JTextField error;
	Human human1;
	Dog dog1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansandDogsGUI frame = new HumansandDogsGUI();
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
	public HumansandDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		humani = new JTextField();
		humani.setBounds(10, 37, 113, 32);
		contentPane.add(humani);
		humani.setColumns(10);
		
		dogi = new JTextField();
		dogi.setBounds(10, 80, 113, 32);
		contentPane.add(dogi);
		dogi.setColumns(10);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String human = humani.getText();
				if( human.length()< 4){
					
					error.setText("Error1");
					
				}else{
					
					human1 = new Human(human);
					
				}
			}
		});
		btnNewButton.setBounds(146, 37, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dog = dogi.getText();
				if (human1 != null){
					
					dog1 = new Dog (dog);
					human1.buyDog(dog1);
					
				}else{
					
					error.setText("Error2");
					
				}
				
			}
		});
		btnNewButton_1.setBounds(146, 80, 128, 23);
		contentPane.add(btnNewButton_1);
		
		info = new JTextField();
		info.setBounds(10, 175, 414, 32);
		contentPane.add(info);
		info.setColumns(10);
		
		error = new JTextField();
		error.setEditable(false);
		error.setBounds(10, 218, 414, 32);
		contentPane.add(error);
		error.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				info.setText(human1.getInfo());
			}
		});
		btnNewButton_2.setBounds(146, 141, 128, 23);
		contentPane.add(btnNewButton_2);
	}
}
