
public class Cat extends Mammal {
	
	private String Color;
	
	public Cat(String name, int feet, String Color) {
		super(name, feet);
		this.feet = feet;
		this.Color = Color;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String getColor(){
		return Color;
	}
	@Override
	public String getInfo() {
		return ("The Cat " + this.name + " has " + this.feet + " feet and is " + this.Color);
	}
}
