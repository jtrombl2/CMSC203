	import  java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 

		//identifier declarations
		final int NUMBER = 2; // number of scores
		//double score1 = 100; // first test score
		//double score2 = 95; // second test score
		
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		System.out.println("Please enter the first score: ");
		Scanner userInput = new Scanner(System.in);
		double score1 = userInput.nextDouble();
		System.out.println("Score 1 is: " + score1);
		
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		System.out.println("Please enter the second score: ");
		double score2 = userInput.nextDouble();
		System.out.println("Score 2 is: " + score2);
		
		final double BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		double tempC;
	
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		// Task #2 ask user to input a temperature in Fahrenheit
		System.out.println("Please enter a temperature (F): ");
		double tempF = userInput.nextDouble();
		//Task #2 read the user’s temperature in Fahrenheit
		System.out.println("Your temperature is " + tempF + " degrees Fahrenheit.");
		//Task #2 convert the user’s temperature to Celsius
		tempC = (5.0/9.0) * (tempF - 32);
		//Task #2 print the user’s temperature in Celsius
		System.out.println(tempF + " in Fahrenheit is " + tempC + " in Celsius.");
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
