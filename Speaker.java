class Speaker{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=8;
	static int currentVolume;
	
  public static boolean onOrOff(){
  System.out.println("inside onOrOff");
  
	if(isConnected==false)
	{	isConnected = true;
	
	System.out.println("Speaker is turned ON...");
	}
	else if(isConnected==true)
	{	isConnected =false;

	System.out.println("Speaker is turned OOF...");}
  System.out.println("end of  onOrOff");
  return isConnected;}
  
 static void increaseVolume(){
	System.out.println("inside increaseVolume()");
		if(isConnected==true){
		if(currentVolume < maxVolume){
			currentVolume=currentVolume+1;
	System.out.println("The Current Volume is "+currentVolume);
	}
	else{
		System.out.println("maxVolume is reached...");
		}
		}
	else{
		System.out.println("Gube... Speaker on madu");
	}
	}
  
	public static void decreaseVolume(){
	System.out.println("inside decreaseVolume:-");
		if(isConnected==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("Thte Current Volume is "+currentVolume);
			}
		else{
			System.out.println("Min Volume is reached...");
			}
		}
		else{
			System.out.println("Gube... Speaker on madu");
		}
	}
}