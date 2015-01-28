import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Choose hero
		/*To be added Utility.Method for selection the hero*/
		System.out.println("Name???");
		String heroName = input.nextLine();
		Hero player = new Hero(heroName);
		// Choose level
		String choice = Utility.levelChoice();
		while (!choice.equals("Exit")) {
			switch (choice) {
			case "1":
				LevelSoftUni.Execute(player);
				break;
			case "2":
				LevelTU.Execute(player);
				break;
			case "3":
				LevelUNWE.Execute(player);
				break;
			case "4":
				LevelUACEG.Execute(player);
				break;
			default:
				// check input
				break;
			}
			// Replay levels
			choice = Utility.levelChoice();
		}
		// Credits
		Utility.credits();
	}

}
