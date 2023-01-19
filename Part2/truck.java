package Part2;


public class truck extends vehicles{
	
	//numberOfAxles" and "capacityInTons"
	
	private Integer numberOfAxles;
	private Integer capacityInTons;
	
	
	
	public void loadTruck(Integer tonesLoaded) {
		System.out.println("Loaded " + tonesLoaded + " tons");
	}



	public Integer getNumberOfAxles() {
		return numberOfAxles;
	}



	public void setNumberOfAxles(Integer numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}



	public Integer getCapacityInTons() {
		return capacityInTons;
	}



	public void setCapacityInTons(Integer capacityInTons) {
		this.capacityInTons = capacityInTons;
	}

}
