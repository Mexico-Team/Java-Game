import java.util.Random;
import java.util.Scanner;

public class LevelUNWE {
	public static void Execute(Hero player){
		Scanner input = new Scanner(System.in);
		Hero currentHero = player;
		System.out.println("Very bad choice. You have deared to enter the economists realm. Prepare yoursefl.");
		System.out.println("In which part of the university you want to go? Choose your destiny!");
		System.out.printf("1 - Old Hull, 2 - New Hull, 3 - The Bank%n");
		int choosenNumber = Integer.parseInt(input.nextLine());
		switch (choosenNumber) {
			case 1: { //Old hull
				System.out.println(" ------------------------------------");
				System.out.println("|The good old hull - so many memories|");
				System.out.println(" -----------------------------------------------------------------------------------------------------------------");
				System.out.printf("|You found old rare book in the library which gives you wisdom and +10 basic attack. You now have %d basic attack.|%n", currentHero.getBasicAttack() + 10);
				System.out.println(" -----------------------------------------------------------------------------------------------------------------");
				int newBasicAttack = currentHero.getBasicAttack() + 10;
				currentHero.setBasicAttack(newBasicAttack);
				CommonEnemy currentEnemy = new CommonEnemy("Mad Reader", 200, 40);
				System.out.printf("|You are attacked by %s (%d hp and %d basic attack) who is furious because you make too much noise.|%n", currentEnemy.getName(), currentEnemy.getHP(), currentEnemy.getBasicAttack() );
				System.out.println(" -----------------------------------------------------------------------------------------------------------");
				System.out.println("The battle have started. You hit first, because you are very careful and you saw the danger in time.");
				battle (input, currentEnemy, currentHero);
			}
			break;
			
			case 2: { //New hull
				System.out.println("Oh no. Go away fast. Here is very dangerous.");
			}
			break;
			
			case 3: { //The bank
				System.out.println("If you like to wait, here is the right place.");
			}
			break;
					
			default: { 
				
			}
			break;
		}
	}
	
	public static void battle(Scanner input, CommonEnemy currentEnemy, Hero currentHero) {
		int currentEnemyHp = currentEnemy.getHP();
		int currentHeroHp = currentHero.getHP();
		int currentEnemyBasicAttack = currentEnemy.getBasicAttack();
		int currentHeroBasicAttack = currentHero.getBasicAttack();
		
		while (true) {
			System.out.println("Current round. What do you want to do? 1 - Use basic attack, 2 - Use ability power");
			int choosenNumber = Integer.parseInt(input.nextLine());
			
			//Our hero attacks
			switch (choosenNumber) {
			case 1: { //Our hero uses basic attack
				int currentHeroRandomBasicAttack = randInt(currentHeroBasicAttack - 15, currentHeroBasicAttack + 15);
				currentEnemyHp -= currentHeroRandomBasicAttack;
				if (currentEnemyHp < 0) {
					currentEnemyHp = 0;
				}
				System.out.printf("%1$s hitted the %2$s for %3$d damage. %2$s has %4$d hp left.%n", currentHero.getName(), currentEnemy.getName(), currentHeroRandomBasicAttack, currentEnemyHp);
			}
			break;
			case 2: { //Our hero uses ability power
				int currentHeroRandomAbilityAttack = randInt(currentHeroBasicAttack - 15, currentHeroBasicAttack + 15);
				currentEnemyHp -= currentHeroRandomAbilityAttack;
			}
			break;
			default:
				break;
			}
			
			if (currentEnemyHp == 0) {
				currentHero.setHP(currentHeroHp);
				System.out.printf("You killed that %s! Congratulations!%n", currentEnemy.getName());
				System.out.printf("You have %d hp left!%n", currentHero.getHP());
				break;
			}
			
			int currentEnemyRandomBasicAttack = randInt(currentEnemyBasicAttack - 20, currentEnemyBasicAttack + 20);
			
			//The enemy attacks
			currentHeroHp -= currentEnemyRandomBasicAttack;
			if (currentHeroHp < 0) {
				currentHeroHp = 0;
			}
			System.out.printf("The %1$s hitted %2$s for %3$d damage. %2$s has %4$d hp left.%n", currentEnemy.getName(), currentHero.getName(), currentEnemyRandomBasicAttack, currentHeroHp);
			if (currentHeroHp == 0) {
				System.out.printf("You are killed by the %s%n", currentEnemy.getName());
				break;
			}
		}			
	}
	
	public static int randInt(int min, int max) {    
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}