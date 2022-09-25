class TeaStall{

	static int teaStallId;
	static String name;
	static String address;
	static long contactNo;
	
	
	//setter and getter
	
	static void setTeaStallId(int id){
		teaStallId = id;
			
		}

	static int getTeaStallId(){
		return teaStallId;
	}
	
	static void setContactNo(long cNo){
		contactNo=cNo;
		
	}
	static long getContactNo(){
		return contactNo;
	}
	static void setAddrass(String ad){
		address=ad;
		}
	static String getAddrass(){
		return address;
	}
	
	static void setName(String na){
		name=na;
	}
	static String getName(){
		return name;
	}
}