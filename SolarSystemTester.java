class SolarSystemTester{

   public static void main(String a[]){
   
   SolarSystem solar = new SolarSystem() ;
	solar.name = "Earth";
    solar.age = "4.543 billion years";
	solar.distenceFromSun = "149.6 million km";
	solar.water = "70%";
	solar.big();
		System.out.println(solar.name +" \n  "+ solar.age +" \n "+solar.distenceFromSun+" \n "+solar.water);
	
	SolarSystem solar1 = new SolarSystem() ;
	solar1.name = "Jupiter";
    solar1.age = "4.603 billion years";
	solar1.distenceFromSun = "778.5 million km";
	solar1.water = "0.25%";
	solar1.big();
		System.out.println(solar1.name +" \n  "+ solar1.age +" \n "+solar1.distenceFromSun+" \n "+solar1.water);
	
	SolarSystem solar2 = new SolarSystem() ;
	solar2.name = "Saturn";
    solar2.age = "4.503 billion years";
	solar2.distenceFromSun = "1.434 billion km";
	solar2.water = "60%";
	solar2.big();
		System.out.println(solar2.name +" \n  "+ solar2.age +" \n "+solar2.distenceFromSun+" \n "+solar2.water);
	
	SolarSystem solar3 = new SolarSystem() ;
	solar3.name = "Mars";
    solar3.age = "4.603 billion years";
	solar3.distenceFromSun = "227.9 million km";
	solar3.water = "14%";
	solar3.big();
		System.out.println(solar3.name +" \n  "+ solar3.age +" \n "+solar3.distenceFromSun+" \n "+solar3.water);
		
	SolarSystem solar4 = new SolarSystem() ;
	solar4.name = "Mercury";
    solar4.age = "4.503 billion years";
	solar4.distenceFromSun = "58 million km";
	solar4.water = "80%";
	solar4.big();
		System.out.println(solar4.name +" \n  "+ solar4.age +" \n "+solar4.distenceFromSun+" \n "+solar4.water);
	
	}
	
}