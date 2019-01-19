package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Write a command line program which prompts the user for a 
		 * series of decimal integer values separated by spaces. Each 
		 * decimal integer is displayed along with its equivalent binary value.
		 * Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

		460 in binary is 111001100
		8218 in binary is 10000000011010
		1 in binary is 1
		31313 in binary is 111101001010001
		987654321 in binary is 111010110111100110100010110001
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		String decimalInput = input.nextLine();
		String[] decimalAsString = decimalInput.split(" ");
		int[] newArray = new int [decimalAsString.length];
		
		for(int i = 0; i < decimalAsString.length; i++) {
			newArray[i] = Integer.parseInt(decimalAsString[i]);
			System.out.println(newArray[i] + " in binary is " + (int)(newArray[i]));
		

	}
	}

}
