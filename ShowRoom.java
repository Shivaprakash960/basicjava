class ShowRoom{

	static void getCars(String [] cars){
		System.out.println("inside getCars()");
		System.out.println("size of the cars:-"+cars.length);
		System.out.println("List of Cars");
		for(int i=0; i<cars.length; i++){
		System.out.println(cars[i]);}
			System.out.println("end of getCars ");	
	}
	static void getBikes(String [] bikes){
		System.out.println("inside getBikes()");
		System.out.println("size of the bikes:-"+bikes.length);
		System.out.println("List of Bikes");
		for(int i=0; i<bikes.length; i++){
		System.out.println(bikes[i]);}
			System.out.println("end of getBikes ");	

}
}