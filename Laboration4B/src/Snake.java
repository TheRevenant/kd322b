
public class Snake extends Animal {
	
	private int length;
	
	public Snake(String name, int length) {
		super(name);
		this.length= length;
		// TODO Auto-generated constructor stub
	}

	public int getLength(){
		return length;
	}
	@Override
	public String getInfo() {
		return ("The Snake " + this.name + " and is " + this.length);
	}
}
