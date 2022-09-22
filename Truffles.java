class Truffles{
   public static void main(String shiva[]){
	 
     String address="Indiranagar, #307 K. P Square, 100 ft Road, Binnamangala, 1st Stage Indiranagar, Bangalore - 560038";
  
     String[] suppliersNames={"Dharshan","Sachin","Manu","shivu","Kiran"};
     int noOfManagers=5;
  
     String foodMenu[]={"Teriyaki Chicken","Pesto Grilled Fish","Devils Chicken","Fish Fingers","Fries","Bruschetta","Slaw on Toast","Dragon Paneer","Chilly Paneer","chicken Rocky Road","Peri Peri Chicken",
     "Wedges","Paneer Tikka","Slaw on Toast","Cheese Rissoles","Chicken Popcorn"};
   
     System.out.println("Welcome to Truffles");
     
     System.out.println("Address of the Truffles is:-  "+address);
   
     System.out.println("Names of the Suppliers who works in the Truffles are:-" );
      for (int s=0;s<suppliersNames.length;s++){
      System.out.println(suppliersNames[s]);}
	
     System.out.println("No Of Managers work in  Truffles are:-  "+noOfManagers);
     System.out.println("The Menu of  Truffles is:-" );
      for (int s=0;s<foodMenu.length;s++){
      System.out.println(foodMenu[s]);}
   }
   


}