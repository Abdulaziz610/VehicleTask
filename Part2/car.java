package Part2;


public class car extends vehicles {
	
	
	private Integer numberOfDoors;
	
	
	public void openTrunk() {
		
		System.out.println(" Trunk opened.");
		
	}


	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	

}
