class ToysTester{

	public static void main(String [] a){
		Toys.setToysTypes("Vehicles Toys ,Physical Activity Toys,Blocks,Balls,Musical Instruments Toys");
		Toys.setToysUsedto("Playing");
		Toys.setToysTopCompany("Lego Lego");
	
		System.out.println("Types of Toys  are:-"+Toys.getToysTypes());
		System.out.println("Toys are Used for:-"+Toys.getToysUsedto());
		System.out.println("Top Toys Company is:-"+Toys.getToysTopCompany());
	}

}