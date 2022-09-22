class TelevisionTester{
	public static void main(String shiva[]){
	Television.brand="LG";
	Television.color="Black";
	Television.price=59999.00;
	
	
	
	
	System.out.println("The Name of the Television is "+Television.brand);
	System.out.println("The color of the Television is "+Television.color);
	System.out.println("The price of the Television is "+Television.price);
	System.out.println("The Television is Connected "+Television.isConnected);
	System.out.println("*********************************************");
	
	Television.onOrOff();
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	System.out.println("*********************************************");
	Television.onOrOff();
	Television.increaseVolume();
	Television.decreaseVolume();
	}
}