package controller;

import model.showroom;
import view.view;

public class controller {
	private showroom model = new showroom();
	private view vieww = new view();
	
	public void showDetails () {
		vieww.showDetailsOfCars(model.getListOfVehicles());
	}
	
	public void showExpectedVisitor () {
		vieww.showExpectedVisitor(model.getExpectedVisitor());
	}
	
	public void removeVehicle(int id) {
		model.removeVehicle(id);
	}
	
	public void addVehicle(String type) {
		model.addVehicle(type);
	}
}
