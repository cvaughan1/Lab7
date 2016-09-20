package favorites;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Lab7Students {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String choice = "";
		int id = 0;

		System.out.println(
				"Welcome to our Java Class. Which student would you like to learn more about? (Enter a number between 1 and 20)");	
		
		
		while (choice.equalsIgnoreCase("y")){
			
			
			
			try {
				
				id = scan.nextInt();// awaiting value for id

				if (id < 0 || id >= 21)
					throw new NumberFormatException("ID is out of range. Please enter a number from 1 - 20");
			}

			catch (NumberFormatException e) {

				System.out.println("Integer is out of range");
				System.out.println(" ");

			}

			catch (InputMismatchException e) {

				System.out.println("That ID does not exist. Please enter an valid ID number");
				choice = "n";

			}

		} 
		 
		
		
		try {
			System.out.println(askQuestions(id));
		}

		catch (Exception e) {
			System.out.println(" what?");
			choice = "y";
		}
		// Continue block

		
		System.out.println("Would you like to learn about a different student (y/n):?");
		choice = scan.nextLine();			
	}

	
	
	public static String askQuestions(int id) throws Exception {

		String s = "";
		String studentName = "";
		String studentHomeTown = "";
		String studentFood = "";

		switch (id) {
		case 1:
			studentName = "Armani";
			studentHomeTown = "Detroit";
			studentFood = "Pasta";
			break;

		case 2:
			studentName = "Yasmine";
			studentHomeTown = "Detroit";
			studentFood = "Steak";
			break;

		case 3:
			studentName = "Tyler";
			studentHomeTown = "Detroit";
			studentFood = "Chili";
			break;

		case 4:
			studentName = "Nicole";
			studentHomeTown = "Detroit";
			studentFood = "Hamburger";
			break;

		case 5:
			studentName = "Daniel";
			studentHomeTown = "New York";
			studentFood = "Potato Salad";
			break;

		case 6:
			studentName = "Dominique";
			studentHomeTown = "New York";
			studentFood = "Pizza";

		case 7:
			studentName = "Elle";
			studentHomeTown = "Detroit";
			studentFood = "Pasta";
			break;

		case 8:
			studentName = "Clark";
			studentHomeTown = "Detroit";
			studentFood = "Steak";
			break;

		case 9:
			studentName = "Kevin";
			studentHomeTown = "Detroit";
			studentFood = "Chili";
			break;

		case 10:
			studentName = "Jennifer";
			studentHomeTown = "Detroit";
			studentFood = "Hamburger";
			break;

		case 11:
			studentName = "Zalika";
			studentHomeTown = "Detroit";
			studentFood = "Potato Salad";
			break;

		case 12:
			studentName = "Johnny";
			studentHomeTown = "Detroit";
			studentFood = "Pizza";
			break;

		case 13:
			studentName = "Dom B";
			studentHomeTown = "Detroit";
			studentFood = "rice";
			break;

		case 14:
			studentName = "Kim";
			studentHomeTown = "Detroit";
			studentFood = "Chili";
			break;

		case 15:
			studentName = "Jeseekia";
			studentHomeTown = "Detroit";
			studentFood = "Hamburger";
			break;

		case 16:
			studentName = "Tricia";
			studentHomeTown = "New York";
			studentFood = "Potato Salad";
			break;

		case 17:
			studentName = "Jack";
			studentHomeTown = "Detroit";
			studentFood = "Pizza";

		case 18:
			studentName = "Andy";
			studentHomeTown = "Atlanta";
			studentFood = "Pasta";
			break;

		case 19:
			studentName = "John";
			studentHomeTown = "Detroit";
			studentFood = "Steak";
			break;

		case 20:
			studentName = "Mike";
			studentHomeTown = "Detroit";
			studentFood = "Chili";
			break;

	

		}

		if (id >= 1 && id <= 21) {
			
			Scanner scan = new Scanner(System.in);

			System.out.println("Student " + id + " is " + studentName
					+ ". What would you like to know about this student?(Hometown or Favorite Food)");
			String studentInfo = scan.nextLine();

			if (studentInfo.equalsIgnoreCase("hometown"))
				s = studentName + " is from " + studentHomeTown;

			else if (studentInfo.equalsIgnoreCase("favorite food"))
				s = studentName + "'s favorite food is " + studentFood;

		}
		return s;
	}
}












