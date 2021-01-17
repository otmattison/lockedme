package lockedme;
import java.util.*;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		Menu m = new Menu();
		Scanner input = new Scanner(System.in);
		String choice;
		
		
		m.showWelcome();
		m.showMenu();
		choice = input.nextLine();
		m.getMainIn(choice);
		
		
	}

}
