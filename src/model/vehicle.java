package model;


public class vehicle {
	
	private String[] engineType;
	private String modelNo,type;
	private int enginePower, tireSize;
	private int id, weight;
	private boolean turbo;
	
	
	public vehicle () {
	
		this.engineType = new String[] {"oil", "diesel", "gas"};
		this.type = "normal";
		this.enginePower = 1500;
		this.tireSize = 150;
		this.turbo = false;
		this.modelNo = "NORMALDEMO101";
	}


	public String[] getEngineType() {
		return engineType;
	}


	public String getModelNo() {
		return modelNo;
	}


	public String getType() {
		return type;
	}


	public int getEnginePower() {
		return enginePower;
	}


	public int getTireSize() {
		return tireSize;
	}


	public int getId() {
		return id;
	}


	public int getWeight() {
		return weight;
	}


	public boolean isTurbo() {
		return turbo;
	}


	public void setEngineType(String[] engineType) {
		this.engineType = engineType;
	}


	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}


	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	
}
