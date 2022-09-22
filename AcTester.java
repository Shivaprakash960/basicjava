class AcTester{
	public static void main(String shiva[]){
	Ac.brand="LG";
	Ac.warranty="1 years";
	Ac.price=28999.00;
	
	System.out.println("The Brand of the AC "+Ac.brand);
	System.out.println("The warranty of the AC "+Ac.warranty);
	System.out.println("The price of the AC "+Ac.price);
	
	System.out.println("***************************");
	Ac.onOrOff();
	Ac.increaseColling();
	Ac.increaseColling();
	Ac.increaseColling();
	System.out.println("*****************************");
	Ac.decreaseColling();
	Ac.decreaseColling();
	Ac.decreaseColling();
	System.out.println("*****************************");
	Ac.onOrOff();
	Ac.increaseColling();
	System.out.println("*****************************");
	Ac.decreaseColling();
	
	}

}