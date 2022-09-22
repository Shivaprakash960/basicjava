class SpeakerTester{
	public static void main(String shiva[]){
	Speaker.brand="Boat";
	Speaker.color="Black";
	Speaker.price=1999.99;
	
	System.out.println("The Name of the Speaker is "+Speaker.brand);
	System.out.println("The color of the Speaker is "+Speaker.color);
	System.out.println("The price of the Speaker is "+Speaker.price);
	System.out.println("The Speaker is Connected "+Speaker.isConnected);
	System.out.println("*********************************************");
	
	Speaker.onOrOff();
		System.out.println("**************************");
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
		System.out.println("**************************");
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
		System.out.println("****************************");
	Speaker.onOrOff();
	Speaker.increaseVolume();
		System.out.println("****************************");
	Speaker.decreaseVolume();
	
	}
	
}