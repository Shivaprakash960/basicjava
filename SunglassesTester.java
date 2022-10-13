class SunglassesTester {

   public static void main(String a[]){
   
   Sunglasses sun = new Sunglasses() ;
	sun.name = "Fastrack";
    sun.price = 679;
	sun.warranty = "1 year";
	sun.cool();
		System.out.println(sun.name +" \n  "+ sun.price +" \n "+sun.warranty);
	
   Sunglasses big =sun;
		System.out.println(big.name +" \n  "+ big.price +" \n "+big.warranty);
	
	
	Sunglasses sun1 = new Sunglasses() ;
	sun1.name = "Rozzetta craft";
    sun1.price = 303;
	sun1.warranty = "6 monthes";
	sun1.cool();
	System.out.println(sun1.name +" \n  "+ sun1.price +" \n "+sun1.warranty);
	
	Sunglasses sun2 = new Sunglasses() ;
	sun2.name = "Rybon";
    sun2.price = 1000;
	sun2.warranty = "12 monthes";
	sun2.cool();
	System.out.println(sun2.name +" \n  "+ sun2.price +" \n "+sun2.warranty);
	
	Sunglasses sun3 = new Sunglasses() ;
	sun3.name = "Polaroid";
    sun3.price = 3079;
	sun3.warranty = "6 monthes";
	sun3.cool();
	System.out.println(sun3.name +" \n  "+ sun3.price +" \n "+sun3.warranty);
	
	Sunglasses sun4 = new Sunglasses() ;
	sun4.name = "Rich club";
    sun4.price = 279;
	sun4.warranty = "6 monthes";
	sun4.cool();
	System.out.println(sun4.name +" \n"+ sun4.price +" \n"+sun4.warranty);
	
   }
   
}