import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;


public class CalcFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	//JButton jb = new JButton ("1");
	private CalcCode myCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcFrame frame = new CalcFrame();
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
	public CalcFrame() {
		myCalc = new CalcCode();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalc.numberButtonPressed(1);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
				
				
				
			}
		});
		btnNewButton.setBounds(10, 61, 89, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(2);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_1.setBounds(109, 61, 89, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(3);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_2.setBounds(208, 61, 89, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(4);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_3.setBounds(10, 111, 89, 39);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(5);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_4.setBounds(109, 111, 89, 39);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(6);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_5.setBounds(208, 111, 89, 39);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(7);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_6.setBounds(10, 161, 89, 39);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(8);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_7.setBounds(109, 161, 89, 39);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(9);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_8.setBounds(208, 161, 89, 39);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(0);
				
				int i = myCalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_9.setBounds(109, 211, 89, 39);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.plus();
				
				
				textField.setText(""+myCalc.getOperator());

			}
		});
		btnNewButton_10.setBounds(335, 11, 89, 39);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			myCalc.minus();
			
			textField.setText(""+myCalc.getOperator());
			}
		});
		btnNewButton_11.setBounds(335, 61, 89, 39);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.mult();
				
				textField.setText(""+myCalc.getOperator());
			}
		});
		btnNewButton_12.setBounds(335, 111, 89, 39);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.equals();
				
				
			textField.setText(""+myCalc.getResult());
				
			}
		});
		btnNewButton_13.setBounds(335, 211, 89, 39);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.setBounds(335, 161, 89, 39);
		contentPane.add(btnNewButton_14);
		
		textField = new JTextField("0");
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(13, 11, 284, 39);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
