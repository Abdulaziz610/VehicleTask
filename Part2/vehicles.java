package Part2;

public class vehicles extends engine implements Honkable {
	private String make;
	private String model;
	private String color;
	private Integer numberOfWheels;
	private Integer weight;
	private Integer year;
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}


	
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

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		
	}
	

	
}