
/** Genererar de olika cyklarna*/
public class Bikes {

	
/** Metoder f�r att skapa cyklarna*/
	private String Color;
	private int Price;
	private int Size;
	private static int nbrOfBikes;
	
/** Kontrollerar vilken data som matas in i tex. arraylists*/
	public Bikes (String Color, int Size){
		this.Color = Color;
		this.Size = Size;
		nbrOfBikes = nbrOfBikes +1;
	}
/** Kontrollerar vilken data som matas in i tex. arraylists*/
	public Bikes (String Color, int Size, int Price){
		this.Color = Constants.checkColor(Color);
		this.Size = Constants.checkSize(Size);
		this.Price = Constants.checkPrice(Price);	
		nbrOfBikes = nbrOfBikes +1;
		
	}
/**Returnerar v�rdet Color*/
	public String getColor(){
		return Color;
}
/**Returnerar v�rdet Size*/
	public int getSize(){
		return Size;
}
/**Returnerar v�rdet Price*/
	public int getPrice (){
		return Price;
}
/**Returnerar mellan tv� prisniv�er*/
	public int setPrice (int Price){
		return Price;
	
	
}
/**Returnerar antalet cyklar*/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	
}

}

