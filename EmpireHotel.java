class EmpireHotel{
   public static void main(String shiva[]){
	 String type="5 Star Hotel";
     String address=" Rajajinagar, Bengaluru, Karnataka 560025";
  
     String[]managerNames={"Bharth","Sunil","Praveen","chandru","Kalyani"};
     int noOfManagers=5;
  
     String foodMenu[]={"roti","paneer masala","burger","pizze","rice","sambar","chutney","puri","pani-puri","chapathi","ragiball",
     "papad","gobi manchuri","chicken biriyni","shawarma roll","cured rice"};
   
     System.out.println("Welcome to EmpireHotel");
     System.out.println("The EmpireHotel is a:- "+type);
     System.out.println("Address of the EmpireHotel is:-  "+address);
   
     System.out.println("Names of the Managers who works in the EmpireHotel are:-" );
      for (int s=0;s<managerNames.length;s++){
      System.out.println(managerNames[s]);}
	
     System.out.println("No Of Managers work in  EmpireHotel are:-  "+noOfManagers);
     System.out.println("The Menu of  EmpireHotel is:-" );
      for (int s=0;s<foodMenu.length;s++){
      System.out.println(foodMenu[s]);}
   }
   


}