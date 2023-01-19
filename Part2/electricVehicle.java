package Part2;

public class electricVehicle extends vehicles{
	// "batteryCapacity" and "chargeLevel". It should also have a method called "charge" that increases the charge level of the battery.
	
	private Integer batteryCapacity;
	private Integer chargeLevel;
	

	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Integer getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(Integer chargeLevel) {
		this.chargeLevel = chargeLevel;
	}
	
	
	public void charge() {
		chargeLevel++;
		
	}

	@Override
	public void driveVehicle(Integer milesDriven) {
		// TODO Auto-generated method stub
		//super.driveVehicle(milesDriven);
		System.out.println("Electrical Vehicle " + milesDriven + " miles.");
	}

	
}
