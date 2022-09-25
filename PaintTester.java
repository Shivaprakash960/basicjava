class PaintTester{

	public static void main(String [] a){
		Paint.setPaintId(45335642);
		Paint.setBrandName("Asian Paints");
		Paint.setColor("blue");
	
		System.out.println(Paint.getPaintId());
		System.out.println(Paint.getBrandName());
		System.out.println(Paint.getColor());
	}

}