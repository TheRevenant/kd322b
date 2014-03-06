
public class Dog extends Mammal {

	private String size;
	
	public Dog(String name, int feet, String size) {
		super(name, feet);
		this.size = size;
		this.feet = feet;
		// TODO Auto-generated constructor stub
	}

	
public String getSize(){
	return size;
}
@Override
public String getInfo() {
	return ("The Dog " + this.name + " has " + this.feet + " feet and is " + this.size);
}
}

