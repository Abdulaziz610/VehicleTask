import java.util.ArrayList;

public class vehicles {
	public String make;
	public String model;
	public String color;
	public Integer numberOfWheels;
	public Integer weight;
	public Integer year;
	
	// make, model, year, color, numberOfWheels, and weight
	public void startVehicle(){
		System.out.println("Vehicle started.");
	}
	
	public void stopVehicle(){
		System.out.println("Vehicle stopped.");
	}
	
	public void driveVehicle(Integer milesDriven){
		System.out.println("Vehicle driven " + milesDriven + " miles.");
	}
	
	public void honkVehicle(){
		System.out.println("Honk Honk!");
	}
	
}