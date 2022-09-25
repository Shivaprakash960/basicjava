class GalaxyTester{


    public static void main(String []a){
		 
	   Galaxy.setName("Milky way");
	   Galaxy.setConsistOf("star,dust,gas");
	   Galaxy.setPlanet("Solar system");
	   
	   System.out.println("Name of the Galaxy :-"+Galaxy.getName());
		System.out.println("Galaxy Consist of :-"+Galaxy.getConsistOf());
		System.out.println("Which Planet it is :-"+Galaxy.getPlanet());
	}
}