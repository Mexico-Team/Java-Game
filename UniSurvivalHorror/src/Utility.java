import java.util.Scanner;

public class Utility {
	private static Scanner input = new Scanner(System.in);
	
	public static void credits() {
		System.out.println("The game was created for Java-Basics project ect ect");
	}

	public static String levelChoice() {
		System.out.println("Text choose level - info for levels ect");
		String choice = input.nextLine();
		return choice;
	}

	public static Hero chooseHero() {
		System.out.println("Name?");
		String name = input.nextLine();
		System.out.println("Choose hero ect ect");
		while (true) {
			String choice = input.nextLine();
			switch (choice) {
			case "1":
				System.out.println("1 is ect ect");
				return new Hero(name, 1000, 100, 100);
			case "2":
				System.out.println("2 is ect ect");
				return new Hero(name, 1200, 80, 100);
			case "3":
				System.out.println("2 is ect ect");
				return new Hero(name, 800, 50, 200);
			case "4":
				System.out.println("2 is ect ect");
				return new Hero(name, 1500, 150, 0);
			default:
				System.out.printf("%s is not valid choice", choice);
				break;
			}
		}
	}
}
