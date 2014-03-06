import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class Animal_Kingdom_GUI extends JFrame {

	private Dog dog;
	private Cat cat;
	private Snake snake;
	
	private JPanel contentPane;
	private JTextField textField;
private ArrayList <Animal> myAnimals;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animal_Kingdom_GUI frame = new Animal_Kingdom_GUI();
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
	public Animal_Kingdom_GUI() {
		
		myAnimals = new ArrayList <Animal>();
		myAnimals.add(dog = new Dog("Golden Retriver", 4, "Large"));
		myAnimals.add(snake = new Snake("Python", 10));
		myAnimals.add(cat = new Cat("Bondkatt",4, "Black"));
		myAnimals.add(dog = new Dog("Tax", 4, "Small" ));
		myAnimals.add(snake = new Snake ("Cobra", 10));
		myAnimals.add(cat = new Cat("Angora", 4, "White"));
		myAnimals.add(dog = new Dog("Labrador", 4, "Medium"));
		myAnimals.add(snake = new Snake("Boa", 20));
		myAnimals.add(cat = new Cat("Perser", 4, "Gray"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 11, 414, 239);
		contentPane.add(textArea_1);
		
		
		for (Animal a: myAnimals){
			textArea_1.append((a.getInfo())+ "\n");
	}

		}
	}
