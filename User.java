class User{
             static  String name ;
             static int     age ;
           static float height ;
             static char letter;
  public static void main(String shiva[]){

     System.out.println("main started");
//local

     System.out.println("variables before the initialization");

     System.out.println("user name is " +  name);
     System.out.println("user age is " +  age);
     System.out.println("user height is " + height);
     System.out.println("user name starts with a letter "+letter);
//initilization of above declared variables
String name = " Shivaprakash";
int     age = 21;
float height = 6.6f;
char letter= '9'+'8';

       System.out.println("variables after the initialization");

System.out.println("user name is " +  name);
System.out.println("user age is " +  age);
System.out.println("user height is " + height);
System.out.println("user name starts with a letter "+letter);
     System.out.println("main ended");
}

}