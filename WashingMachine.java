class WashingMachine{
	static String brand;
	static String warranty;
	static double price;
	static boolean isConnected;
	static int minRpm;
	static int maxRpm=500;
	static int currentRpm;
	
		public static boolean onOrOff(){
		System.out.println("inside onOrOff");
		
	if(isConnected==false){
	isConnected=true;
	System.out.println("Washing Machine is turned ON...");
	}
	else if(isConnected==true){
	isConnected=false;
	System.out.println("Washing Machine is turned OFF...");}
	System.out.println("end of onOrOff");
	return isConnected;
	
	}
	public static void increaseRpm(){
	System.out.println("inside increaseRpm()");
		if(isConnected==true){
		if(currentRpm < maxRpm){
			currentRpm=currentRpm+10;
	System.out.println("The Current Volume is "+currentRpm);
	}
	else{
		System.out.println("maxRpm is reached...");
		}
		}
	else{
		System.out.println("Gube... Washing Machine on madu");
	}
	}
	
	public static void decreaseRpm(){
	System.out.println("inside decreaseRpm:-");
		if(isConnected==true){
		if(currentRpm>minRpm){
			currentRpm=currentRpm-10;
			System.out.println("The current Rpm is "+currentRpm);
			}
		else{
			System.out.println("Current Rpm is reached...");
			}
		}
		else{
			System.out.println("Gube... WashingMachine on madu");
		}
	}
}