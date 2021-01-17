package lockedme;
import java.util.*;

public class Menu {
	String option = "";
	Scanner input = new Scanner(System.in);

	public void showWelcome() {
		System.out.println("--------------------------");
		System.out.println("         Welcome          ");
		System.out.println("       LockedMe.com       ");
		System.out.println("\n");
		System.out.println(" Company Lockers Pvt. Ltd.");
		System.out.println("Developer: Trevis Mattison");
		System.out.println("--------------------------");
	}

	public void showMenu() {
		System.out.println("\n");
		System.out.println("--------------------------");
		System.out.println("Main Menu");
		System.out.println("1.) Show files in ascending order");
		System.out.println("2.) Perform file operations ");
		System.out.println("3.) Close the application");
		System.out.println("--------------------------");
		System.out.println("\n" + "		Please choose 1, 2 or 3"+ "\n" );

	}

	public void showFileMenu() {
		System.out.println("--------------------------");
		System.out.println("1.) Add a file");
		System.out.println("2.) Delete a file");
		System.out.println("3.) Search for a file");
		System.out.println("4.) Back to main menu");
		System.out.println("--------------------------");
		System.out.println("\n" + "		Please choose 1, 2 or 3"+ "\n" );


	}
	public void getMainIn(String choice) {
		switch(choice) {
		case "1":
			break;
		case "2":
			showFileMenu();
			option = input.nextLine();
			getFileIn(option);
		case "3":
			System.out.println("Thank you for using lockedme.com." + "\n" + "Closing Application.");
			System.exit(0);
			break;
			default:
				System.out.println("Invalid input provided, please choose 1, 2, or 2");
			
		}
		showMenu();

	}
	
	

	public void getFileIn(String choice) {
		switch(choice) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			showMenu();
			option = input.nextLine();
			getMainIn(option);
			break;
			
		}

	}
	
	

}
