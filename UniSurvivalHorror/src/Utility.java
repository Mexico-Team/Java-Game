import java.util.Scanner;

public class Utility {
	private static Scanner input = new Scanner(System.in);
	private static String choice;
	
	//To be added
	public static void credits() {
		System.out.println("The game was created for Java-Basics project ect ect");
	}

	public static String levelChoice() {
		System.out.println("You are the only surviver of an apocalyptic battle between programmers and zombies. You are chased by a mob of zombies! It is time to choose where to go: Type Help for more information if you don't know where to go.");
		choice = input.nextLine();
		return choice;
	}
	
	public static String repeater() {
		System.out.println("What shall we do chief? Type Help for move info.");
		choice = input.nextLine();
		return choice;
	}
	
	public static void replay() {
		System.out.println("Perhaps you'd like to replay your favorite level again?.");
		return;
	}
	
	public static void help() {
		System.out.println("Type 1 for SoftUni level, 2 for TU level, 3 for UNWE level, 4 for UACEG level or Exit to terminate the program!");
	}
	
	//To be edited;
	public static Hero chooseHero() {
		System.out.println("What is your name mighty programmer?");
		String name = input.nextLine();
		System.out.println("Choose hero ect ect");
		while (true) {
			choice = input.nextLine();
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
