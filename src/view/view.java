package view;

import java.util.ArrayList;
import model.vehicle;

public class view {
	
	public void showDetailsOfCars (ArrayList<vehicle> vehicleList) {
		
		CommandLineTable tbl = new CommandLineTable();
		System.out.println("Informations of all vehicles that are available in showroom");
		tbl.setShowVerticalLines(true);
		tbl.setHeaders("Vehicle ID", "Model No", "Engine Power", "Engine Type", "Type", "Weight", "Tire Size");
		
		for(int i = 0; i < vehicleList.size(); i++) {
			vehicle v = vehicleList.get(i);
			tbl.addRow(Integer.toString(v.getId()),  v.getModelNo(),Integer.toString(v.getEnginePower()) ,String.join(", ", v.getEngineType()) , v.getType(), Integer.toString(v.getWeight()), Integer.toString(v.getTireSize()));
		}
		tbl.print();
	}
	
	public void showExpectedVisitor(int number) {
		System.out.println("+--------------------------------------+");
		System.out.println("| Total number of expected visitor: " + number +" |");
		System.out.println("+--------------------------------------+");
	}
}
