package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		String fizzBuzz = "FizzBuzz.txt";
		File newFile = new File(fizzBuzz);
		newFile.createNewFile();
		int counter = 1;
		PrintWriter writer = new PrintWriter(newFile);

		while (counter <= 300) {
			String print = fizzBuzz(counter);
			counter++;
			writer.println(print);
		}
		writer.close();

	}

	public static String fizzBuzz(int input) {
		String output = "";
		String fizz = "Fizz";
		String buzz = "Buzz";
		if (input < 1 || input > 301) {
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
