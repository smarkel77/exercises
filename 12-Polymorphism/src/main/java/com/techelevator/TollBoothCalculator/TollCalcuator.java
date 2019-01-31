package com.techelevator.TollBoothCalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalcuator {

	public static void main(String[] args) {
		
		DecimalFormat df2 = new DecimalFormat("#.00");
		Vehicle car1 = new Car(true);
		
		
		
		List<Vehicle> allVehicles = new ArrayList<Vehicle>();
		allVehicles.add(car1);
		int totalMiles = 0;
		double totalRevenue;
		
		System.out.println("Vehicle" + "\t\tDistance Traveled" + "\t\t\t Toll $");
		for (Vehicle vehicle : allVehicles) {
			Random r = new Random();
			int low = 10;
			int high = 240;
			int distance = r.nextInt(high-low) + low;
			
			totalMiles =+ distance;
			totalRevenue =+ vehicle.calculateToll(distance); 
			System.out.println(vehicle.vehicleName() + "\t\t" + distance + "\t\t\t$" + df2.format(vehicle.calculateToll(distance)));
			System.out.println();
			System.out.println("Total Miles Traveled: " + totalMiles);
			System.out.println("Total Tollbooth Revenue: " + totalRevenue);
			
		}

	}

}
