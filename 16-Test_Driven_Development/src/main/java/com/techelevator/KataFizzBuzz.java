package com.techelevator;

public class KataFizzBuzz {
	
	public static String fizzBuzz(int input) {
		String output = "";
		String fizz = "Fizz";
		String buzz = "Buzz";
		if (input < 1 || input > 100) {
			return output;
		}
		output = Integer.toString(input);
		if ((input % 3 == 0 && input % 5 == 0) || (output.contains("3") && output.contains("5"))) {
			return fizz + buzz;
		}
		
		if (input % 3 == 0 || output.contains("3")) {
			return fizz;
		}
		if (input % 5 == 0 || output.contains("5")) {
			return buzz;
		}
		
		
		return output;
	}

}
