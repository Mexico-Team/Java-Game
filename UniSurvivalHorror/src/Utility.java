import java.util.Scanner;


public class Utility {

	public static void credits() {
		System.out.println("The game was created for Java-Basics project ect ect");
	}
	
	public static String levelChoice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Text chouse level info for levels ect");
		String choice = input.nextLine();
		return choice;
	}
}
