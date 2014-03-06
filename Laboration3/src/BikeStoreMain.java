import java.util.ArrayList;

/**Kallar alla cyklar*/
public class BikeStoreMain {
	static String allBikes;
	static String newBikes;
		private ArrayList <Bikes> Bikes1 = new ArrayList <Bikes>();
			
			
	
	/**Returnerar cyklar*/
	public String getAllBikes(){
		String s = "";
		for (Bikes Bikes: Bikes1){
			s = s + "Color:" + " " + Bikes.getColor() + " " + "Size:" + " " + Bikes.getSize() + " " + "Price:" + " " + Bikes.getPrice() + "\n";
		}
			return s;
	}
	/**Variabel för att returnera cyklar*/
	public void addBike(String Color, int Size, int Price){
		Bikes1.add (new Bikes( Color, Size, Price));
	}
}
