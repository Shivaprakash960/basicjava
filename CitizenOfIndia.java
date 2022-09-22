class CitizenOfIndia{
	
	public static void showTheResponsibility(){
		System.out.println("invoking of showTheResponsibility");
	int age =16;
	char gender='F';
	// AND Operator=&& both the case must satisfiy
	//OR Operator=|| one case must satisfiy
	if(age >=10 && age<16){
	System.out.println("Responsiblity is goto School");	
	}
	if(age==16){
	System.out.println("Responsiblity is goto Collage");	
	}
	if(age==21){
	System.out.println("Responsiblity is Voting");
		if(gender=='F'){
			System.out.println("Girl can get legaly can marry");
		}
	}else{
			System.out.println("Boys cannot get legaly marry");
		}
	
	System.out.println("end of showTheResponsibility");
	
	
	}
	
}