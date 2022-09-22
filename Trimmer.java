class Trimmer{
	public static void main(String shiva[]){
		String color ="Black";
		String brand ="Mi";
		int price =999;
		String batteryRuntime="240";
		String warranty ="1 years";
		
		
	String setting="ON";
	String setting1="Length Setting";
	String setting2="Cap Addgestment";
	String setting3="Suitable Cap";
	String setting4="OFF";
	
		String totalsettings[]={setting,setting1,setting2,setting3,setting4};
	
	String ref0 = totalsettings[0];
	String ref1 = totalsettings[1];
	String ref2 = totalsettings[2];
	String ref3 = totalsettings[3];
	String ref4 = totalsettings[4];
		
		
		System.out.println("The color of the Trimmer is "+color);
		System.out.println("The Brand Name of the Trimmer "+brand);
		System.out.println("The Price of the Trimmer "+price);
		System.out.println("The Battery Runtime of the Trimmer "+batteryRuntime);
		System.out.println("The Warranty of the Trimmer "+warranty);
		
		System.out.println("Total Settings at index 0 "+ref0);
		System.out.println("Total Settings at index 1 "+ref1);
		System.out.println("Total Settings at index 2 "+ref2);
		System.out.println("Total Settings at index 3 "+ref3);
		System.out.println("Total Settings at index 4 "+ref4);
	}

}


