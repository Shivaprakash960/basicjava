class Ac{
	static String brand;
	static String warranty;
	static double price;
	static boolean isConnected;
	static int minColling;
	static int maxColling=35;
	static int currentColling;
	
	public static boolean onOrOff(){
	System.out.println("inside onOrOff");
		
		if(isConnected==false){
		isConnected=true;
		System.out.println("AC is turned ON...");
	}
		else if(isConnected==true){
		isConnected=false;
		System.out.println("AC is turned OFF...");}
		System.out.println("end of onOrOff");
	return isConnected;}
	public static void increaseColling(){
	System.out.println("inside increaseColling()");
		if(isConnected==true){
		if(currentColling < maxColling){
		currentColling=currentColling+1;
		System.out.println("The Current Volume is "+currentColling);
	}
	else{
		System.out.println("maxColling is reached...");
		}
		}
	else{
		System.out.println("Gube... Ac on madu");
	}
	}
  
	public static void decreaseColling(){
	System.out.println("inside decreaseColling:-");
		if(isConnected==true){
		if(currentColling>minColling){
			currentColling=currentColling-1;
			System.out.println("The Current Volume is "+currentColling);
			}
		else{
			System.out.println("Min Colling is reached...");
			}
		}
		else{
			System.out.println("Gube... Ac on madu");
		}
	}
}