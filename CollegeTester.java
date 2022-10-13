class CollegeTester{
	
	public static void main (String []a){
	
	
	College col = new College();
	col.collegeName="Govt Engg College";
	col.address="Chamrajanagar";
	col.type="Government";
	col.education();
	System.out.println(col.collegeName+"\n"+col.address+"\n"+col.type);
	
	College col1 = new College();
	col1.collegeName="Govt Diploma College";
	col1.address="K.G.F";
	col1.type="Government";
	col1.education();
	System.out.println(col1.collegeName+"\n"+col1.address+"\n"+col1.type);
	
	College col2 = new College();
	col2.collegeName=" Goutham College";
	col2.address="Bengaluru";
	col2.type="Private";
	col2.education();
	System.out.println(col2.collegeName+"\n"+col2.address+"\n"+col2.type);
	
	College col3 = new College();
	col3.collegeName=" Excellent College";
	col3.address="Kolar";
	col3.type="Aided";
	col3.education();
	System.out.println(col3.collegeName+"\n"+col3.address+"\n"+col3.type);
	
	College col4 = new College();
	col4.collegeName=" Government Degree College";
	col4.address="Mysuru";
	col4.type="Government";
	col4.education();
	System.out.println(col4.collegeName+"\n"+col4.address+"\n"+col4.type);
	
	
	
	
	
	
	
	
	
	
	
	}



}