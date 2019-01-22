package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		/*
		 * The Fibonacci numbers are the integers in the following sequence:
		 * 
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ... By definition, the first
		 * two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number
		 * is the sum of the previous two.
		 * 
		 * Write a command line program which prompts the user for an integer value and
		 * display the Fibonacci sequence leading up to that number.
		 * 
		 * Please enter the Fibonacci number: 25
		 * 
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the Fibonacci number:");

		String fibEnd = input.nextLine();

		int intFibEnd = Integer.parseInt(fibEnd);

		int a = 0;
		int b = 1;
		int c = 0;

		if (intFibEnd != 0) {

			System.out.print(a + ", " + b);

			while (c <= intFibEnd) {
				if (c == 0) {
					c = a + b;
					a = b;
					b = c;
				}
				if (c != 0) {
					System.out.print(", " + c);

					c = a + b;
					a = b;
					b = c;
				}
			}
		} else {
			System.out.println("0");
		}

		input.close();
	}

}
