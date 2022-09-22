class VivantaTajHotel{
   public static void main(String shiva[]){
	 String type="5 Star Hotel";
     String address="66, Residency Rd, Ashok Nagar, Bengaluru, Karnataka 560025";
  
     String[]managerNames={"Akshata","Lakshmi","sangeeta","Ganesha","Sumanth"};
     int noOfManagers=5;
  
     String foodMenu[]={"roti","paneer masala","burger","pizze","rice","sambar","chutney","puri","pani-puri","chapathi","ragiball",
     "papad","gobi manchuri","chicken biriyni","shawarma roll","cured rice"};
   
     System.out.println("Welcome to VivantaTajHotel");
     System.out.println("The VivantaTajHotel is a:- "+type);
     System.out.println("Address of the VivantaTajHotel is:-  "+address);
   
     System.out.println("Names of the Managers who works in the VivantaTajHotel are:-" );
      for (int s=0;s<managerNames.length;s++){
      System.out.println(managerNames[s]);}
	
     System.out.println("No Of Managers work in  VivantaTajHotel are:-  "+noOfManagers);
     System.out.println("The Menu of  VivantaTajHotel is:-" );
      for (int s=0;s<foodMenu.length;s++){
      System.out.println(foodMenu[s]);}
   }
   


}