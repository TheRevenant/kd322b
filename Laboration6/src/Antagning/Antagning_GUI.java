package Antagning;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JComboBox;




public class Antagning_GUI extends JFrame {

	private Document doc;
	private JPanel contentPane;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private Bargraph bargraph;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Antagning_GUI frame = new Antagning_GUI();
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
	public Antagning_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		doc = openXmlFile ("ht2013_antagning.xml");
		Node n =  doc.getDocumentElement();
		String root = n.getNodeName();
		programsList = loadAllPrograms();
		
		System.out.println(root);
		
		JLabel lblNewLabel = new JLabel("Första element: " + root);
		lblNewLabel.setBounds(10, 11, 414, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Antal program: " + programsList.size());
		lblNewLabel_1.setBounds(10, 47, 414, 47);
		contentPane.add(lblNewLabel_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 89, 414, 27);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent graph) {
				int index = comboBox.getSelectedIndex();
				Program prog = programsList.get(index);
				System.out.println("Vi valde:" + index);
				bargraph.updateValues(prog.getWomen(),prog.getMen());
				
				
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
		bargraph = new Bargraph(0, 0);
		bargraph.setBounds(10, 148, 414, 257);
		contentPane.add(bargraph);
	
		
	}
	
	

	
	private ArrayList<Program> loadAllPrograms() {
		ArrayList<Program> output = new ArrayList<Program>();
		// Hämta alla program
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i < programs.getLength(); i++) {
		// Gör om varje nod i listan till ett element
		Node node = programs.item(i);
		Element elm = (Element) node;
		// Hämta data från elementet
		String name = elm.getElementsByTagName("name").item(0).getTextContent();
		String code = elm.getElementsByTagName("code").item(0).getTextContent();
		int women = Integer.parseInt (elm.getElementsByTagName("women").item(0).getTextContent());
		int men = Integer.parseInt (elm.getElementsByTagName("men").item(0).getTextContent());
		// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
		// Skapa programmet och lägg till i listan
		Program program = new Program(name, code, women, men);
		output.add(program);
		}
		return output;
		}

	
	private Document openXmlFile(String fileName) {
		Document doc = null;
		try {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		} catch (Exception e) {
		e.printStackTrace();
		}
		return doc;
		}
	


}


