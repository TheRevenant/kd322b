import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Bikes>  myBike = new ArrayList<Bikes>();


Bikes b1 = new Bikes ("blue", 28, 10000);
Bikes b2 = new Bikes ("black", 24, 15000);
Bikes b3 = new Bikes ("red", 14, 5000);
Bikes b4 = new Bikes ("silver", 28, 8000 );
Bikes b5 = new Bikes ("green", 19, 6900);
Bikes b6 = new Bikes ("blue", 15, 2000);
Bikes b7 = new Bikes ("red", 18, 7000);
Bikes b8 = new Bikes ("black", 26, 5000);
Bikes b9 = new Bikes ("green", 22, 4800);
Bikes b10 = new Bikes ("silver", 24, 10000);

myBike.add (b1);
myBike.add (b2);
myBike.add (b3);
myBike.add (b4);
myBike.add (b5);
myBike.add (b6);
myBike.add (b7);
myBike.add (b8);
myBike.add (b9);
myBike.add (b10);

for (int i = 0; i< myBike.size(); i++){
	if (myBike.get(i) != null){
		System.out.println (myBike.get(i).getColor() + " " + myBike.get(i).getSize() + " " + myBike.get(i).getPrice()+ "\n");
		

	}
}


	}

}
