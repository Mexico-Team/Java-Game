import java.util.Random;
import java.util.Scanner;

public class LevelSoftUni {

	private static Scanner input = new Scanner(System.in);
	private static Hero hero;
	private static String choice;
	
	public static void Execute(Hero player) {
		int[] directions = new int[2]; //dupricated;
		hero = player;
		hero.resetHP();
		
		// First interaction - done;	
		entry();
		if (hero.isDead()) {
			return;
		}

		// Second interaction - done;
		wayIn();
		if (hero.isDead()) {
			return;
		}
		
		// Third Interaction - done;
		specialEvent();
		if (hero.isDead()) {
			return;
		}

		// Fourth Interaction - need death fix;
		char[][] maze = getMaze();
		printMaze(maze);
		//Start index of hero in maze is 1,1
		directions[0] = 1; //dupricated
		directions[1] = 1; //dupricated
		while (true) { //get detections for boss fight;
			choice = input.nextLine();
			//input validation
			directions = move(choice, maze, directions[0], directions[1]); //need fixing
			if (hero.isDead()) {
				return;
			}
		}

	}

	private static void lineSeperator() {
		System.out.println("---------------");
	}

	private static String isValid(String choice) {
		if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
			return choice;
		} else {
			System.out.printf("%s is not valid choice, try again!", choice);
			choice = input.nextLine();
			return isValid(choice);
		}
	}

	private static void hpStatus(Hero hero) {
		if (hero.isDead()) {
			System.out.println("You DEAD!");
		} else {
			System.out.printf("%s now has %d hp!\n", hero.getName(),
					hero.getHP());
		}
	}

	private static int rng() {
		Random rngJesus = new Random();
		int randomNum = rngJesus.nextInt(3);
		return randomNum;
	}

	private static void battleInfo(Hero hero, CommonEnemy enemy) {
		if(hero.isDead()){
			System.out.println("You are no more, songs will be written in your honor!");
		}
		else if (enemy.isDead()) {
			System.out.printf("%s has %d hp left, %s has no hp left.\n",
					hero.getName(), hero.getHP(), enemy.getName());
		}
		else {
			System.out.printf("%s has %d hp left, %s has %d hp left.\n",
					hero.getName(), hero.getHP(), enemy.getName(),
					enemy.getHP());
		}
	}
	
	private static void battleInfo(Hero hero, Boss enemy) {
		if(hero.isDead()){
			System.out.printf("%s gave you a few reasons to die and you accepted!\n", enemy.getName());
		}
		else if (enemy.isDead()) {
			System.out.printf("%s you did the unthinkable...%s is dead.\n",
					hero.getName(), enemy.getName());
		}
		else {
			System.out.printf("%s has %d hp left, %s has %d hp left.\n",
					hero.getName(), hero.getHP(), enemy.getName(),
					enemy.getHealthPoints());
		}
	}

	private static boolean tryEscape(Hero hero, CommonEnemy enemy) {
		if (rng() == 1 && hero.getHP() > enemy.getHP()) {
			System.out.printf(
					"You've managed to escape the %s, you feel like coward!\n",
					enemy.getName());
			return true;
		}
		System.out.println("You failed to escape, better luck next time!");
		return false;
	}

	private static void battle(Hero hero, CommonEnemy enemy) {
		while (!enemy.isDead()) {
			System.out
					.printf("You can attack the %s with basic attack(1), magic attack(2) or try to escape(3). Witch one shall you use?\n",
							enemy.getName());
			String attackChoice = input.nextLine();
			//Validation;
			while (!attackChoice.equals("1") && !attackChoice.equals("2")
					&& !attackChoice.equals("3")) {
				System.out.printf("%s is not valid choice, try again!",
						attackChoice);
				attackChoice = input.nextLine();
			}
			switch (attackChoice) {
			case "1":
				int damage = hero.getBasicAttack() * rng();
				enemy.removeHP(damage);
				System.out.printf("You attacked the %s for %d basic damage.\n",
						enemy.getName(), damage);
				int enemyDamage = enemy.getBasicAttack() * rng();
				hero.removeHP(enemyDamage);
				System.out.printf("%s strikes you back for %d.\n",
						enemy.getName(), enemyDamage);
				battleInfo(hero, enemy);
				lineSeperator();
				if (hero.isDead()) {
					return;
				}
				break;
			case "2":
				int spellDamage = hero.getAbilityPower() * (3 + rng());
				hero.setAbilityPower(0);
				enemy.removeHP(spellDamage);
				System.out
						.printf("You cast insane Java code in %s's face for %d damage. Your ability power is now 0. Your next spell will do 0 damage, you need to replanish your ability power!\n",
								enemy.getName(), spellDamage);
				int enemyDmg = enemy.getBasicAttack() * rng();
				hero.removeHP(enemyDmg);
				System.out.printf("%s strikes you back for %d\n",
						enemy.getName(), enemyDmg);
				battleInfo(hero, enemy);
				lineSeperator();
				if (hero.isDead()) {
					return;
				}
				break;
			case "3":
				if (tryEscape(hero, enemy)) {
					return;
				} else {
					int escapeDmg = enemy.getBasicAttack() * rng() * 2;
					hero.removeHP(escapeDmg);
					System.out.printf("%s strikes you for %d\n",
							enemy.getName(), escapeDmg);
					battleInfo(hero, enemy);
					if (hero.isDead()) {
						return;
					}
				}
				break;
			}
		}
		System.out.printf("%s is no more!\n", enemy.getName());
		hpStatus(hero);
	}
	
	private static void battle(Hero hero, Boss enemy) {
		while (!enemy.isDead()) {
			System.out
					.printf("You can attack the %s with basic attack(1), magic attack(2) or pray(3). Witch one shall you use?\n",
							enemy.getName());
			String attackChoice = input.nextLine();
			//Validation;
			while (!attackChoice.equals("1") && !attackChoice.equals("2")
					&& !attackChoice.equals("3")) {
				System.out.printf("%s is not valid choice, try again!",
						attackChoice);
				attackChoice = input.nextLine();
			}
			switch (attackChoice) {
			case "1":
				int damage = hero.getBasicAttack() - (rng() * 50);
				if (damage <= 0) {
					damage = 10 * rng();
				}
				enemy.removeHP(damage);
				System.out.printf("You attacked the %s for %d basic damage.\n",
						enemy.getName(), damage);
				int enemyDamage = enemy.getBasicAttack() * rng();
				hero.removeHP(enemyDamage);
				System.out.printf("%s strikes you back for %d.\n",
						enemy.getName(), enemyDamage);
				battleInfo(hero, enemy);
				lineSeperator();
				if (hero.isDead()) {
					return;
				}
				break;
			case "2":
				int spellDamage = hero.getAbilityPower() * (10 - rng());
				hero.setAbilityPower(0);
				enemy.removeHP(spellDamage);
				System.out
						.printf("You cast insane Java code in %s's face for %d damage. Your ability power is now 0. Your next spell will do 0 damage, you need to replanish your ability power!\n",
								enemy.getName(), spellDamage);
				int enemyDmg = enemy.getBasicAttack() * rng();
				hero.removeHP(enemyDmg);
				System.out.printf("%s strikes you back for %d\n",
						enemy.getName(), enemyDmg);
				battleInfo(hero, enemy);
				lineSeperator();
				if (hero.isDead()) {
					return;
				}
				break;
			case "3":
				if (rng() == 2) {
					healerEvent(hero, 850);
				} else {
					int specialAttack = enemy.getSpecialAttack() * (rng() + 1);
					hero.removeHP(specialAttack);
					System.out.printf("%s uses his special powers to do %d damage to you!\n",
							enemy.getName(), specialAttack);
					battleInfo(hero, enemy);
					if (hero.isDead()) {
						return;
					}
				}
				break;
			}
		}
	}

	private static void healerEvent(Hero hero, int hpLimit) {
		if (hero.getHP() <= hpLimit) {
			hero.resetHP();
			hero.resetAbilityPower();
			System.out.printf("Lord Nakov apears in front of you %s and heals you with magic Java Algorithm. Now you have %d hp and full ability power!\n",
							hero.getName(), hero.getHP());
		}
		return;
	}
	
	private static void entry() {
		lineSeperator();
		System.out
				.println("Evening traveler. Your search is over - you've found the right place.");
		System.out
				.println("You are in the hallway - do you dare entering?\nYes(1), No(2), Maybe?(3)");
		choice = input.nextLine();
		choice = isValid(choice);
		switch (choice) {
		case "1":
			hero.addBasicAttack(30);
			System.out
					.printf("Lord Nakov commands you for your bravery and he gave you old rusty keyboard to defend yourself. You gained 30 basic attack and now have %s basic attack.\n",
							hero.getBasicAttack());
			break;
		case "2":
			CommonEnemy mob = new CommonEnemy("Angry Mob", 500, 50);
			System.out.printf(
					"You try to escape, but you are attacked by %s.\n",
					mob.getName());
			// Event;
			battle(hero, mob);
			if (hero.isDead()) {
				return;
			}
			break;
		case "3":
			CommonEnemy ghost = new CommonEnemy("Angry Ghost", 1000, 100);
			System.out
					.printf("While you think about the meaning of life and what not you are attacked by %s.\n",
							ghost.getName());
			// Event;
			battle(hero, ghost);
			if (hero.isDead()) {
				return;
			}
			break;
		}
		// Event;
		healerEvent(hero, 700);
	}
	
	private static void wayIn() {
		lineSeperator();
		System.out.println("Your exit is blocked, the only way is forward.");
		// Event;
		lineSeperator();
		hero.addBasicAttack(120);
		System.out
				.println("You meet Sto, he tries to explain Linux to you as a result you gain 120 basic attack - Java code no longer scares you!");
		System.out.printf("Your basic attack is %d now.\n",
				hero.getBasicAttack());
		lineSeperator();
		System.out
				.println("You can use your new coding powers for GOOD(1) or for EVEL(2)...or for fun(3)...witch one you choose?");
		choice = input.nextLine();
		choice = isValid(choice);
		int rand = rng() + 4;
		System.out.printf(
				"You are attacked by a pack of zombies. They are %d.\n", rand);
		for (int i = 0; i < rand; i++) {
			CommonEnemy zombie = new CommonEnemy("Zombie" + (i + 1), 350, 100);
			System.out
					.printf("%s is infront of you. You can Scream(1), Fight(2), Pray(3) - what you do?\n",
							zombie.getName());
			choice = input.nextLine();
			choice = isValid(choice);
			switch (choice) {
			case "1":
				hero.removeHP(100);
				System.out.printf(
						"Screaming scared %s, but you loose 100 hp\n",
						zombie.getName());
				hpStatus(hero);
				if (hero.isDead()) {
					return;
				}
				break;
			case "2":
				System.out.printf("You engage %s in battle.\n",
						zombie.getName());
				// Event;
				battle(hero, zombie);
				if (hero.isDead()) {
					return;
				}
				break;
			case "3":
				healerEvent(hero, hero.getHP());
				System.out.printf("Renewed and inspired you attack %s.\n",
						zombie.getName());
				// Event;
				battle(hero, zombie);
				if (hero.isDead()) {
					return;
				}
				break;
			}
			lineSeperator();
		}
	}
	
	private static void specialEvent() {
		System.out.println("You've managed to deal with the enemy. How do you feel? Good(1), OK(2), Bad(3)");
		choice = input.nextLine();
		choice = isValid(choice);
		switch (choice) {
		case "1":
			// Event;
			lineSeperator();
			hero.removeHP(100);
			System.out.println("You tip over a cable, you loose 100 hp.");
			hpStatus(hero);
			if (hero.isDead()) {
				return;
			}
			break;
		case "2":
			// Event;
			lineSeperator();
			hero.removeHP(100);
			System.out.println("You stepped over old rusty computer, you loose 100 hp.");
			hpStatus(hero);
			if (hero.isDead()) {
				return;
			}
			break;
		case "3":
			// Event;
			lineSeperator();
			hero.addHP(1000);
			System.out.println("You found Introduction to programming with Java, your hp has increased by 1000 for the time been.");
			hpStatus(hero);
			break;
		}
	}

	private static char[][] getMaze() {
		//Can be added more mazes;
		lineSeperator();
		System.out.println("You've entered in to SoftUni - or what it looks like maze now. 'h' mark is you, 'e' is the Boss, 'p' are prayer monuments and 'x' is event - it might be good or bad - who knows (laught) - I know! Good luck hero - you will need it!");
		char maze[][] = {
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'|', 'h', '.', '.', 'b', '.', '.', 'b', '|', '-', '-', '|', '|', '/', '|'},
				{'|', '.', '|', '/', '/', '-', '-', '.', '\\', '.', '-', '|', '/', 'x', '|'},
				{'|', '.', '|', '/', '|', '.', '.', '.', '.', 'x', '.', '|', '|', '.', '|'},
				{'|', 'p', '.', '|', '|', '.', '|', '|', '|', '/', '.', '.', 'b', '.', '|'},
				{'|', '\\', 'x', 'b', '|', 'x', '|', '|', '/', '.', '.', '/', '/', '/', '|'},
				{'|', '\\', '-', '.', '|', '.', '|', '|', '|', '.', '/', '/', '/', '/', '|'},
				{'|', '-', '\\', '.', '.', '.', '|', 'b', '.', '.', 'p', '|', '|', 'p', '|'},
				{'|', '-', '|', '.', '.', '.', '-', '-', '.', '|', '.', '|', '|', '.', '|'},
				{'|', '.', '.', '.', 'x', '.', '|', '|', '.', '|', '.', '|', '|', '.', '|'},
				{'|', '.', '|', '|', '-', '.', '|', '|', 'b', '|', '.', '|', '|', '.', '|'},
				{'|', '.', '|', '|', '.', 'b', '|', '|', '.', '|', '.', '.', '.', '.', '|'},
				{'|', '.', '|', '|', '/', '.', 'p', '|', '.', '|', '.', '-', '.', 'b', '|'},
				{'|', 'p', '|', '/', '|', '.', '.', '.', '.', '|', '.', 'x', '|', 'e', '|'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
		};
		return maze;
	}
	
	private static int[] move(String direction, char maze[][], int posRow, int posCol) {
		char nextPosition;
		int[] directions = new int[2];
		directions[0] = posRow;
		directions[1] = posCol;
		switch (direction) {
		// Move right;
		case "1": 
			nextPosition = maze[posRow][posCol + 1];
			if (isClear(nextPosition)) {
				if (isEvent(nextPosition)) {
					doEvent(nextPosition);
				}
				maze[posRow][posCol] = '.';
				maze[posRow][posCol + 1] = 'h';
				directions[0] = posRow;
				directions[1] = posCol + 1;
				printMaze(maze);
			}
			else {
				notValidDirection();
			}
			break;
		//Move left;
		case "2": 
			nextPosition = maze[posRow][posCol - 1];
			if (isClear(nextPosition)) {
				if (isEvent(nextPosition)) {
					doEvent(nextPosition);
				}
				maze[posRow][posCol] = ' ';
				maze[posRow][posCol - 1] = 'h';
				directions[0] = posRow;
				directions[1] = posCol - 1;
				printMaze(maze);
			}
			else {
				notValidDirection();
			}
			break;
		//Move up;
		case "3": 
			nextPosition = maze[posRow - 1][posCol];
			if (isClear(nextPosition)) {
				if (isEvent(nextPosition)) {
					doEvent(nextPosition);
				}
				maze[posRow][posCol] = ' ';
				maze[posRow - 1][posCol] = 'h';
				directions[0] = posRow - 1;
				directions[1] = posCol;
				printMaze(maze);
			}
			else {
				notValidDirection();
			}
			break;
		//Move down;
		case "4": 
			nextPosition = maze[posRow + 1][posCol];
			if (isClear(nextPosition)) {
				if (isEvent(nextPosition)) {
					doEvent(nextPosition);
				}
				maze[posRow][posCol] = ' ';
				maze[posRow + 1][posCol]= 'h';
				directions[0] = posRow + 1;
				directions[1] = posCol;
				printMaze(maze);
			}
			else {
				notValidDirection();
			}
			break;
		}
		return directions;
	}
	
	private static void notValidDirection() {
		System.out.println("This way is blocked!");
	}
	
	private static boolean isClear(char nextPosition) {
		return nextPosition != '|' && nextPosition != '-' && nextPosition != '/' && nextPosition != '\\';
	}
	
	private static boolean isEvent(char nextPosition) {
		return nextPosition == 'x' || nextPosition == 'b' || nextPosition == 'p' || nextPosition == 'e';
	}
	
	private static void doEvent(char nextPosition) {
		switch (nextPosition) {
		case 'b':
			//hero.setHP(20); //fix death!
			int hp = 300 * (rng() + 1);
			int basicAttack = 80 * (rng() + 1);
			CommonEnemy enemy = new CommonEnemy("Maze Guard", hp, basicAttack);
			// Event;
			battle(hero, enemy);
			if (hero.isDead()) {
				return;
			}
			break;
		case 'p':
			// Event;
			healerEvent(hero, hero.GetMaxHP());
			break;
		case 'x':
			// Event;
			specialEvent();
			if (hero.isDead()) {
				return;
			}
		break;
		case 'e':
			Boss boss = new Boss("The Main Reason", 2500, 100, 200);
			System.out.printf("%s is in front of you. You are scared like a little girl.\n");
			// Event;
			battle(hero, boss);
			if (hero.isDead()) {
				return;
			}
		break;
		}
	}
	
	private static void printMaze(char maze[][]) {
		for (int row = 0; row < maze.length; row++) {
			for (int col = 0; col < maze.length; col++) {
				System.out.print(maze[row][col]);
			}
			System.out.println();
		}
	}
}
