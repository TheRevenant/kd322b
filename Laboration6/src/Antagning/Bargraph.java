package Antagning;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bargraph extends JComponent {
	
	
	int x = 0;
	int y = 0;
	int width = getWidth();
	int height = getHeight();

	private int women;
	private int men;
	private float total;
	
	public Bargraph (int women, int men){
		this.women = women;
		this.men = men;

	}
	
	
	
	public void updateValues (int women, int men){
		this.women = women;
		this.men = men;		
		this.total = this.women + this.men;
		System.out.println("updateValues" + women+ " " + men);
		this.repaint();
			
			width = getWidth();
			height = getHeight();
	}
	

	@Override
	public void paintComponent(Graphics graph) {
		// TODO Auto-generated method stub
		super.paintComponent(graph);

		
		if (women > 0){
			float procent = (women/total);
			System.out.println("procent:"+procent);
			float pixelValue = (int) (height*procent);
			int bar = (int) (height-pixelValue);
			graph.setColor (Color.RED); 
			graph.fillRect (0, bar+20, 50, (int) pixelValue); 
			}
		
		if (men > 0){
			float procent = (men/total);
			System.out.println("procent:"+procent);
			float pixelValue = (int) (height*procent);
			int bar = (int) (height-pixelValue);
			graph.setColor (Color.BLUE);
			graph.fillRect (100, bar+20, 50, (int) pixelValue);
		}
		
		if (total > 0){
			
			total = (int) total;
			graph.setColor (Color.BLACK);
			graph.drawString("Antal sökande:" + total, 0, 10 );
			
			
			
		}
		
		System.out.println(total);
	}

}