class MobileTester{
	public static void main(String shiva[]){
	Mobile.brand="OPPO";
	Mobile.warranty="6 Months";
	Mobile.price=13000.00;
	
	System.out.println("The Brand of the Mobile "+Mobile.brand);
	System.out.println("The warranty of the Mobile "+Mobile.warranty);
	System.out.println("The price of the Mobile "+Mobile.price);
	
	System.out.println("***************************");
	Mobile.onOrOff();
	Mobile.increaseVolume();
	Mobile.increaseVolume();
	Mobile.increaseVolume();
	System.out.println("********************************");
	Mobile.decreaseVolume();
	Mobile.decreaseVolume();
	Mobile.decreaseVolume();	
	System.out.println("********************************");
	Mobile.onOrOff();
	Mobile.increaseVolume();
	System.out.println("********************************");
	Mobile.decreaseVolume();
	}

}