package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		/*
		 Write a program that converts meters to feet and vice-versa.

		The foot to meter conversion formula is:

		m = f * 0.3048
		The meter to foot conversion formula is:

		f = m * 3.2808399
		Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.

		Please enter the length: 58
		Is the measurement in (m)eter, or (f)eet? f
		58f is 17m.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length:");
		
		String measurement = input.nextLine();
		
		int measurmentDouble = Integer.parseInt(measurement);
		
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		
		String meterOrFeet = input.nextLine();
		
		if (meterOrFeet.charAt(0) == 'm') {
			
			double uncastAnswer = measurmentDouble * 3.2808399;
			int answer = (int)uncastAnswer;
			System.out.println(measurmentDouble + meterOrFeet + " is " + answer + "f.");

		} 
		if (meterOrFeet.charAt(0) == 'f') {
			double uncastAnswer = measurmentDouble * 0.3048;
			int answer = (int)uncastAnswer;
			System.out.println(measurmentDouble + meterOrFeet + " is " + answer + "m.");
		}
		
		input.close();

	}

}
