class RailwayStationTester{

	public static void main(String [] a){
		RailwayStation.setRailwayStationStartedyear(1853);
		RailwayStation.setFirstRailwayStation("Bori Bunder");
		RailwayStation.setNoOfRailwayStation(7000);
	
		System.out.println("Railway Station Started in Year :-"+RailwayStation.getRailwayStationStartedyear());
		System.out.println("First RailwayStation:-"+RailwayStation.getFirstRailwayStation());
		System.out.println("No Of RailwayStation India :-"+RailwayStation.getNoOfRailwayStation());
	}


}