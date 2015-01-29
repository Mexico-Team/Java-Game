
public class Game {

	public static void main(String[] args) {
		// Choose hero
		Hero player = Utility.chooseHero();
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
			case "Help":
				System.out.println("Help manu ect ect");
				break;
			default:
				System.out.printf("%s is not valid choice", choice);
				break;
			}
			// Replay levels
			choice = Utility.levelChoice();
		}
		// Credits
		Utility.credits();
	}

}
