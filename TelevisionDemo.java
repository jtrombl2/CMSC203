import java.util.Scanner;

/** 
* This class tests the Television class
*/
public class TelevisionDemo
	{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		//declare variables
		int station; //the user’s channel choice
		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		//turn the power on
		bigScreen.power();
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + "-inch " +
				bigScreen.getManufacturer() + " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		//display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println(); //for a blank line
		
		// TASK #5:
		
		// Create a new object, portable, of Television
		// Instantiate the object to be Sharp & 19-inch
		Television portable = new Television("Sharp", 19);
		
		// Turn portable's power on
		portable.power();
		
		// Call accessor methods to display tv power info
		System.out.println("A " + portable.getScreenSize() + "-inch " +
				portable.getManufacturer() + " has been turned on.");
		
		// Change the channel to the user's preference
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		portable.setChannel(station);
		
		// Decrease volume by 2
		portable.decreaseVolume();
		portable.decreaseVolume();
		
		// Print changed state of portable
		System.out.println("Channel: " + portable.getChannel() +
				", Volume: " + portable.getVolume());
		}
	}