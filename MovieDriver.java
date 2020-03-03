import  java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		String title;		// holds title
		String rating;		// holds rating
		int ticketsSold;	// holds amount of tickets sold
		char choice;		// holds user input for "again?" question
		String cHolder;		// used to get user input for choice variable
		
		//Create a new object of type Scanner that reads from the keyboard
		Scanner userInput = new Scanner(System.in);
		
		//Create a new movie object
		Movie mov = new Movie();
		
		do
		{
		//Prompt the user to enter the title of a movie 
		System.out.print("Please enter the title of a movie: ");
		
		//Read in the line that the user types
		title = userInput.nextLine();
		
		//Set the title in the movie object
		mov.setTitle(title);
		
		//Prompt the user to enter the movie’s rating
		System.out.print("Please enter the movie's rating: ");
		
		//Read in the line that the user types
		rating = userInput.nextLine();
		
		//Set the rating in the movie object
		mov.setRating(rating);
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.print("Please enter the amount of tickets sold: ");
		
		//Read in the integer that the user types
		ticketsSold = userInput.nextInt();
		
		//Set the number of tickets sold in the movie object
		mov.setSoldTickets(ticketsSold);
		
		//Print out the information using the movie’s toString method
		System.out.println(mov.toString());
		
		userInput.nextLine();
		System.out.print("Do you want to enter another? (y or n) ");
		cHolder = userInput.nextLine();
		choice = cHolder.charAt(0);
		} while (choice == 'y');
		
		System.out.print("Goodbye.");
	}

}
