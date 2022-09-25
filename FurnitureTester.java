class FurnitureTester{

	public static void main(String [] a){
		Furniture.setFurnitureType("Tabel");
		Furniture.setFurnitureBrand("Lenox Lenox");
		Furniture.setFurnitureCost(10000.00);
	
		System.out.println("Type of Furniture is:-"+Furniture.getFurnitureType());
		System.out.println("Furniture Brand are:-"+Furniture.getFurnitureBrand());
		System.out.println("The Cost of Furniture is:-"+Furniture.getFurnitureCost());
	}


}