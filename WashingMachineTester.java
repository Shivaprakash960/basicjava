class WashingMachineTester{
	public static void main(String shiva[]){
	WashingMachine.brand="LG";
	WashingMachine.warranty="1 years";
	WashingMachine.price=29999.00;
	
	System.out.println("The Brand of the Washing Machine "+WashingMachine.brand);
	System.out.println("The warranty of the Washing Machine "+WashingMachine.warranty);
	System.out.println("The price of the Washing Machine "+WashingMachine.price);
	
	System.out.println("***************************");
	WashingMachine.onOrOff();
	WashingMachine.increaseRpm();	
	WashingMachine.increaseRpm();	
	WashingMachine.increaseRpm();
		System.out.println("******************************");	
	WashingMachine.decreaseRpm();	
	WashingMachine.decreaseRpm();	
	WashingMachine.decreaseRpm();	
		System.out.println("******************************");
	WashingMachine.onOrOff();
	WashingMachine.increaseRpm();	
		System.out.println("******************************");
	WashingMachine.decreaseRpm();	
	
	}

}