class TorchTester{
	public static void main(String shiva[]){
	Torch.brand="Fenix";
	Torch.color="Black";
	Torch.price=399.00;
	
	System.out.println("The Brand of the Torch "+Torch.brand);
	System.out.println("The color of the Torch "+Torch.color);
	System.out.println("The price of the Torch "+Torch.price);
	
	System.out.println("***************************");
	Torch.onOrOff();	
	System.out.println("*****************************");
	Torch.onOrOff();
	
	}

}