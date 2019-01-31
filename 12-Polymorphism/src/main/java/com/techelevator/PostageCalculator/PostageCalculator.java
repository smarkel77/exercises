package com.techelevator.PostageCalculator;

import java.text.DecimalFormat;

import java.util.Scanner;




public class PostageCalculator extends PoundsToOunces {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("#.00");
		

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the # of pounds of the package");

		String numberOfPounds = input.nextLine();

		int pounds = Integer.parseInt(numberOfPounds);

		System.out.println("Please enter the # of ounces of the package?");

		String numberOfOunces = input.nextLine();

		int ounces = Integer.parseInt(numberOfOunces);
		
		double totalWeight = getTotalOunces(pounds, ounces);

		

		System.out.println("What distance will it be traveling?");

		String stringDistance = input.nextLine();
		
		System.out.println("");
		int distance = Integer.parseInt(stringDistance);
		System.out.println("Delivery Method" + "\t\t\t\t\t $ cost");
		System.out.println("-----------------------------------------------------");

		DeliveryDriver[] deliveryOptions = new DeliveryDriver[] { new FedEx(), new SPU4DayGround(), new SPU2DayBusiness(), new SPUNextDay(), new PostalServiceFirst(), new PostalServiceSecond(), new PostalServiceThird() };
		for (DeliveryDriver option : deliveryOptions) {
			System.out.println(option.typeOfService() + "\t\t\t$" + df2.format(option.calculateRate(distance, totalWeight)));
			
			
		input.close();
		}

	}
}
