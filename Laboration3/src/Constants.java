

/**Olika variabler för bland annat Priser och Storlekar*/
	public class Constants {

/**Variabler för max/min storlek, max/min pris, samt array för tillgängliga färger*/
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;

		public static final String [] Colors = {"blue", "red", "black", "silver", "green"};

		
		public static String checkColor (String Color){
			boolean sorf = false;
			for (int i = 0; i<Colors.length; i++){
				if(Color.equals(Colors[i])){
					sorf = true;
				}
			}
			if (sorf == true){
				return Color;
			}else {
				return "Finnes ej";
			}
				}


			public static int checkSize (int Size){
				if (Size >= MIN_SIZE && Size <= MAX_SIZE){
					return Size;
				}else{
					return 0;
				}
			}
			public static int checkPrice (int Price){
				if (Price >= MIN_PRICE && Price <= MAX_PRICE){
					return Price;
				}else{
					return 0;
				}
			}

		}
