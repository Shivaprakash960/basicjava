class Cricket{
	public static void main(String shiva[]){
		
		int rohitHighestScore=264;    //declare and init
		int sachinHighestScore=200;
		int mandanaHighestScore=135;
		int ackerrHighestScore=232;
		int bjClarkHighestScore=229;
	
		int highestScore[]={rohitHighestScore,sachinHighestScore,mandanaHighestScore,
		ackerrHighestScore,bjClarkHighestScore};
		
		//  explicit of use arry 
		//variable retutned from array element
	//	int ref4 = highestScore[4];
		//int ref0 =highestScore[0];
		//int ref2 =highestScore[2];
		
		
		//System.out.println("Element at index 4 "+ref4);
		//System.out.println("Element at index 0 "+ref0);
		//System.out.println("Element at index 2 "+ref2);
		
		// length is a property of array 
		System.out.println("The Length of Highest Score is "+highestScore.length);
		//for loop
		 for (int index =0; index<highestScore.length;index++){
			int ref = highestScore[index];
			System.out.println("Elemenet at index "+ index+" "+ref);
		}
			
	}

}