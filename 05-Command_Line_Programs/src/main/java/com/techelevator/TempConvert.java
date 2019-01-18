package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please enter the temperature:");
		
		String temp = input.nextLine();
		
		System.out.println("Is the temperature in (C)elcius, or (F)arenheit?");
		
		String fOrC = input.nextLine();
		
		double tempInt = Integer.parseInt(temp);
		
		double answer;
		
	
		
		if (fOrC.charAt(0) == 'F') {
			answer = (tempInt - 32) / 1.8;
			System.out.println(tempInt + fOrC + " is " + answer + "C");
			
		} 
		if (fOrC.charAt(0) == 'C') {
			answer = (tempInt * 1.8) + 32;
			System.out.println(tempInt + fOrC + " is " + answer + "F");
		}
		
		
		input.close();

	}

}
