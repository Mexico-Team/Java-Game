package game;

import source.Hero;
import source.Utility;
import levels.LevelSoftUni;
import levels.LevelTU;
import levels.LevelUACEG;
import levels.LevelUNWE;

public class Game {

	public static void main(String[] args) {
		// Choose hero;
		Hero player = Utility.chooseHero();
		// Choose level;
		String choice = Utility.levelChoice();
		while (!choice.equals("Exit")) {
			switch (choice) {
			case "1":
				LevelSoftUni.Execute(player);
				Utility.replay();
				break;
			case "2":
				LevelTU.Execute(player);
				Utility.replay();
				break;
			case "3":
				LevelUNWE.Execute(player);
				Utility.replay();
				break;
			case "4":
				LevelUACEG.Execute(player);
				Utility.replay();
				break;
			case "Help":
				Utility.help();
				break;
			default:
				System.out.printf("%s is not valid choice, try again!\n", choice);
				break;
			}
			// Replay levels;
			choice = Utility.repeater();
		}
		// Credits
		Utility.credits();
	}

}
