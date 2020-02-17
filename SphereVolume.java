// Import the scanner class for i/o access
import  java.util.Scanner;
	
public class SphereVolume {

	public static void main(String[] args) {
		double radius;
		double volume;
		
		// Print the purpose of the program
		System.out.println("This program will use user input to calculate and display the results of a mathematical formula.");
		
		// Print a prompt asking for the diameter of the sphere
		System.out.println("Please enter the diameter of the sphere: ");
		Scanner userInput = new Scanner(System.in);
		double diam = userInput.nextDouble();
		
		// Read the diameter
		System.out.println("Your diameter is: " + diam);
		
		// Calculate the radius as diameter divided by 2
		radius = diam / 2.0;
		
		// Calculate the volume of the sphere using the given formula
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		// Print the volume
		System.out.println("The volume of your sphere is " + volume);

	}

}
