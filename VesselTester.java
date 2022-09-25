class VesselTester{

    public static void main(String a[]){
	
		Vessel.setMaterial("clay");
		Vessel.setPrice(450);
		Vessel.setColor("red");
		
		System.out.println("Vessel Material:-"+ Vessel.getMaterial());
		System.out.println("The cost of the Vessel:-"+ Vessel.getPrice());
		System.out.println("The cost of the Vessel:-"+ Vessel.getColor());
	}
}