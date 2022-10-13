 class SoapTester{

	public static void main(String arg[]){
		//object is a instance of class 
	//create a multiple of Soap
	//object creation of soap class
	//ClassName ref =new ClassName();
	Soap soap = new Soap();
	
	soap.shape ="Oval";
	soap.color ="cream";
	soap.name ="Mysore Sandal Soap";
	soap.toGetFresh();
		System.out.println(soap.shape+"\n"+soap.color+"\n"+soap.name);
	
	Soap soap1 = new Soap();
	soap1.shape="Rectangle";
	soap1.color="White";
	soap1.name="Fiama";
	soap1.toGetFresh();
		System.out.println(soap1.shape+"\n"+soap1.color+"\n"+soap1.name);
		
	Soap soap2 = new Soap();
	soap2.shape="Round";
	soap2.color="Green";
	soap2.name="Lime";
	soap2.toGetFresh();
		System.out.println(soap2.shape+"\n"+soap2.color+"\n"+soap2.name);

	}


}