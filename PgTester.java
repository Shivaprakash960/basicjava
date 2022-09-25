class PgTester{

    public static void main(String a[]){
			 
		Pg.setName("Sri Pg");
		Pg.setAddress("Rajajinagara");
		Pg.setCost(4500);
		Pg.setFood("Veg");
			  
	 
		System.out.println("name of the PG is:-"+Pg.getName() );
		System.out.println("PG Address :-"+ Pg.getAddress());
		System.out.println("Cost of PG:-"+ Pg.getCost());
		System.out.println("Food in PG"+ Pg.getFood());
	}
}