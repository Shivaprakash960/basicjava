class Torch{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
		public static boolean onOrOff(){
		System.out.println("inside onOrOff");
		
	if(isConnected==false){
	isConnected=true;
	System.out.println("Torch is turned ON...");
	}
	else if(isConnected==true){
	isConnected=false;
	System.out.println("Torch is turned OFF...");}
	System.out.println("end of onOrOff");
	return isConnected;
	
	}


}