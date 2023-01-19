
public class mainOfVihcles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vehicle Information: ");
		vehicles vehOne = new vehicles();
		
		vehOne.make = "Toyota";
		vehOne.color = "Pink";
		vehOne.model = "2023";
		vehOne.numberOfWheels = 6;
		vehOne.weight = 2000;
		vehOne.year = 1998;
		vehOne.driveVehicle(240);
		
		
		System.out.println("\nTruck Information: ");
		truck trOne = new truck();
		
		trOne.numberOfAxles = 8;
		trOne.capacityInTons = 6000;
		trOne.loadTruck(9000);
		System.out.println("This truck has " + trOne.numberOfAxles + " Axles, and " + trOne.capacityInTons + " Capacity Tones" );
		
		System.out.println("\nCars Information: ");
		car carOne = new car();
		carOne.numberOfDoors = 4;
		carOne.openTrunk();
		System.out.println("This Car has " + carOne.numberOfDoors);
		
		
		
		
		
	}

}
