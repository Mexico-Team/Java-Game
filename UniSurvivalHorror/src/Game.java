import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		//Chouse hero
		//Chouse level
		//Replay levels
		switch (choice) {
		case "1":
			sampleLevel.Execute();
			break;
		case "2":
			LevelTU.Execute();
			break;
		case "3":
			LevelUNWE.Execute();
			break;
		case "4":
			LevelUACEG.Execute();
			break;
		default:
			//check input
			break;
		}
	}

}
