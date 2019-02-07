package com.techelevator;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		
		
		File inputFile = getInputFileFromUser();
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many lines of text (max) should there be in the split files?");
		String maxLines = userInput.nextLine();
		int max = Integer.parseInt(maxLines);
		//PrintWriter writer = new PrintWriter(newFile);
		int count = 0;
		while (count <= max) {
		//	try(Scanner fileScanner = new Scanner(inputFile)) {
				
			}
		}
		
		
		
		
		
		

	//}
	
	
	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) {
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
