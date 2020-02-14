import  java.util.Scanner;

public class windChill {

	public static void main(String[] args) {
		
		// 1. Declare variable windChill
		double windChill;
		
		// 2. Output title
		System.out.println("Wind Chill Calculator");
		
		// 3. Get temp value from user & use it to initialize new variable temp
		System.out.println("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		Scanner userInput = new Scanner(System.in);
		double temp = userInput.nextDouble();

		// 4. Get wind speed value from user & use it to initialize new variable windSpeed
		System.out.println("Enter the wind speed (must be >= 5 and <= 60): ");
		double windSpeed = userInput.nextDouble();
		
		// 5. Use temp and windSpeed values to calculate new value for windChill, using given formula & math functions
		windChill = 35.74+0.6215*temp-35.75*(Math.pow(windSpeed,0.16))+0.4275*temp*(Math.pow(windSpeed,0.16));
        
		// 6. Display calculated information to user
		System.out.println("Wind chill temperature: ");
		System.out.print(windChill);
		System.out.println(" degrees Fahrenheit \n");
		
		// 7. Display closing info - programmer name, class
		System.out.println("Programmer Name: Janie Trombley");
		System.out.println("CMSC203 CRN 30503");

	}

}
