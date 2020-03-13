import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Birthday {

	public static void main(String[] args) {
		
		// 1. Declare variables
		String name;	// Holds name of the child
		String ageTemp;	// Holds String containing age of the child
		int age;		// Holds age of child
		String toy;		// Holds toy choice
		boolean ageOk;	// Holds boolean value for whether gift fits age range
		String choice1;	// Holds user's choice of whether to process age inappropriate gift or not
		String card;	// Holds user's choice of whether they want to add a card
		String balloon;	// Hold user's choice of whether they want to add a balloon
		String choice2;	// Hold user's choice of whether they want another gift
		double totalCost = 0.0; // Holds total cost of the order
		int orderNumber;		// Holds random order number
		
		// 2. Create new Toy object
		Toy toyObj = new Toy();
		
		// 3. Print welcome message
		JOptionPane.showMessageDialog(null, "Welcome to the toy company to choose gifts for young children");

		// 4. Set up do...while loop for ordering multiple gifts
		do
		{
			choice2 = "no";
			// 5. Set up do...while loop for bypassing age limit
			do
			{
				choice1 = "no";
			
				// 6. Get name of the child
				name = JOptionPane.showInputDialog("Enter the child's name: ");
				if (name.isEmpty())
					name = "x"; 
			
				//7. Get age of the child
				ageTemp = JOptionPane.showInputDialog("Enter the child's age: ");
				
				if (ageTemp.isEmpty())
					age = 0;
				else
					age = Integer.parseInt(ageTemp);
				// 8. Send age value to the Toy class
				toyObj.setAge(age);
				
				// 9. Get toy choice, using a do...while loop for input validation
				do
				{
					toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
					
					if(!toy.equalsIgnoreCase("plushie") && !toy.equalsIgnoreCase("blocks") && !toy.equalsIgnoreCase("book"))
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					
				} while (!toy.equalsIgnoreCase("plushie") && !toy.equalsIgnoreCase("blocks") && !toy.equalsIgnoreCase("book"));
				// 10. Send toy value to the Toy class's setToy method
				toyObj.setToy(toy);
				
				// 11. Send ageOK method's return value to ageOk variable to check if age fits gift
				ageOk = toyObj.ageOK();
				
				if (ageOk == false)
					choice1 = JOptionPane.showInputDialog("The toy is not age appropriate. Cancel the request? (yes/no) ");
			} while (choice1.equalsIgnoreCase("yes"));
			
			// 12. Send toy value to the Toy class's setCost method to calculate cost
			if (ageTemp.isEmpty())
			toyObj.setCost("nope");
			else
			toyObj.setCost(toy);
					
			//13. Ask user if a card should be added
			card = JOptionPane.showInputDialog("Would you like to add a card? (yes/no) ");
			
			// 14. IF answer yes, call Toy class's addCard method
			if (card.equalsIgnoreCase("yes"))
			toyObj.addCard(card);
			
			// 15. Ask user if a balloon should be added
			balloon = JOptionPane.showInputDialog("Would you like to add a balloon? (yes/no) ");
			
			//16. IF answer yes, call Toy class's addBalloon method
			if (balloon.equalsIgnoreCase("yes"))
				toyObj.addBalloon(balloon);
			
			// 17. Add cost of gift to total cost
			if (ageTemp.isEmpty() && name.isEmpty())
			totalCost += 0;
			
			else
			totalCost += toyObj.getCost();
			
			// 18. Display to user: name, age, total
			System.out.println("The gift for " + name + toyObj.toString());
			
			// 19. Ask user if they want another gift
			choice2 = JOptionPane.showInputDialog("Would you like to buy another gift? (yes/no) ");
				
		} while(choice2.equalsIgnoreCase("yes"));
		
		//20. Create random object & initialize order number variable
		Random randNum = new Random();
		
		if (totalCost == 0)
		orderNumber = 0;
		else
		orderNumber = randNum.nextInt(1000000);
		
		// 21. Create dollar format object
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		// 22. Print final order information & programmer name
		System.out.println("The total cost of your order is $" + dollar.format(totalCost) + " Order number is " + orderNumber);
		System.out.println("Programmer Name: Janie Trombley");
		System.exit(0);
	}

}
