package model;

import java.util.ArrayList;

public class showroom {
	
	private ArrayList<vehicle> vehicleList = new ArrayList<vehicle>(); 
	private int vehicleCount, visitorCount = 30;
	private int nextId = 0;
	
	public void addVehicle(String vehicleType) {
		
		try {
			if(vehicleType == "sports") {
				this.visitorCount += 20;
				vehicle new_vehicle = new sportsVehicle(nextId);
				this.vehicleList.add(new_vehicle);
			}
			else if (vehicleType == "heavy") {
				vehicle new_vehicle = new heavyVehicle(nextId);
				this.vehicleList.add(new_vehicle);
			}
			
			else if (vehicleType == "normal") {
				vehicle new_vehicle = new vehicle();
				this.vehicleList.add(new_vehicle);
				new_vehicle.setId(nextId);
			}
			
			else System.out.println("please enter a valid value");
			
			this.nextId++;
			System.out.println(vehicleType + " vehicle added to the showroom");
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
				
	}
	
	public void removeVehicle(int id) {
		int flag = 0;
		for(int i = 0; i < vehicleList.size(); i++) {
			if(this.vehicleList.get(i).getId() == id) {
				if(this.vehicleList.get(i).getType() == "sports") this.visitorCount -= 20;				
				this.vehicleList.remove(i);
				System.out.println("The vehicle is removed from showroom");
				flag = 1;
				break;
			}
		}
		if(flag == 0) System.out.println("Please Enter a valid id. If you can't remember id, see the details and then try again.");
	}
	
	public ArrayList<vehicle> getListOfVehicles() {
		return vehicleList;
	}
	
	public int getExpectedVisitor () {
		return this.visitorCount;
	}

	public int getVehicleCount() {
		return vehicleCount;
	}

	public void setVehicleCount(int vehicleCount) {
		this.vehicleCount = vehicleCount;
	}
}
