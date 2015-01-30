import java.util.Random;
import java.util.Scanner;

public class LevelUNWE {
	public static void Execute(Hero player){
		Scanner input = new Scanner(System.in);
		Hero currentHero = player;
		System.out.println("Very bad choice.");
		System.out.println("You have deared to enter the economists realm. Prepare yoursefl!");
		System.out.println("In which part of the university do you want to go? Choose your destiny!");
		System.out.printf("1 - Old Hull, 2 - New Hull, 3 - The Bank%n");
		int choosenNumber = Integer.parseInt(input.nextLine());
		switch (choosenNumber) {
			case 1: { //Old hull
				System.out.printf("%s entered in the library and find old rare book.%n", currentHero.getName());
				System.out.println("That book gives him wisdom and +10 ability power.");
				System.out.printf("You now have %d ability power.%n", currentHero.getAbilityPower() + 10);				
				currentHero.setAbilityPower(currentHero.getAbilityPower() + 10);
				CommonEnemy currentEnemy = new CommonEnemy("Mad Reader", 320, 150);
				System.out.printf("Unfortunatelly you are attacked by %s (%d hp and %d basic attack).%n",
								  currentEnemy.getName(), currentEnemy.getHP(), currentEnemy.getBasicAttack());
				System.out.printf("That %s is furios because you make too much noise in the library.%n", 
						          currentEnemy.getName());						
				System.out.println("The battle begin.");
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
				System.out.println("Invalid choice.");
			}
			break;
		}
	}
	
	public static void battle (Scanner input, CommonEnemy currentEnemy, Hero currentHero) {
		int currentEnemyBasicAttack = currentEnemy.getBasicAttack();
		int currentHeroBasicAttack = currentHero.getBasicAttack();
		int currentHeroAbilityPower = currentHero.getAbilityPower();
		int choosenNumber = 0;
		//boolean heroIsAlive = true;
		while (true) {
			System.out.println("Current round. How will you atack?");
			System.out.println("1 - Use basic attack, 2 - Use ability power.");
			
			choosenNumber = Integer.parseInt(input.nextLine());
			
			//Our hero attacks
			switch (choosenNumber) {
			case 1: { //Our hero uses basic attack
				int currentHeroRandomBasicAttack = randInt(currentHeroBasicAttack - 15,
														   currentHeroBasicAttack + 15);
				currentEnemy.removeHP(currentHeroRandomBasicAttack);
				if (currentEnemy.getHP() < 0) {
					currentEnemy.setHP(0);
				}
				System.out.printf("%1$s hitted the %2$s for %3$d damage. %2$s has %4$d hp left.%n", 
								 currentHero.getName(), currentEnemy.getName(), currentHeroRandomBasicAttack, 
						         currentEnemy.getHP());
			}
			break;
			case 2: { //Our hero uses ability power
				if (currentHeroAbilityPower <= 0) {
					System.out.println("You don't have ability power left.");
					continue;
				}
				else {
					System.out.println("What ability do you want to use ?");
					System.out.println("1 - Explain the economic history to the enemy (uses 25 ability power "
							         + "and makes 100 damage).");
					System.out.println("2 - Summon finance monster (uses 40 ability power and makes "
							         + "160 damage).");
					choosenNumber = Integer.parseInt(input.nextLine());
					switch (choosenNumber) {
					case 1: {
						if (currentHeroAbilityPower >= 25) {
							currentEnemy.removeHP(100);
							if (currentEnemy.getHP() < 0) {
								currentEnemy.setHP(0);
							}
							currentHeroAbilityPower -= 25;
							System.out.printf("You explained everything to the %s.%n", currentEnemy.getName());
							System.out.printf("That ruined mentally the %s and his hp dropped with 100.%n", 
									          currentEnemy.getName());
							System.out.printf("The %s now has %d hp left.%n", currentEnemy.getName(),
									           currentEnemy.getHP());
						}
						else {
							System.out.println("You don't have enough ability power to use this ability.");
							continue;
						}		
					}
					break;
					
					case 2: {
						if (currentHeroAbilityPower >= 40) {
							currentEnemy.removeHP(160);
							if (currentEnemy.getHP() < 0) {
								currentEnemy.setHP(0);
							}
							currentHeroAbilityPower -= 40;
							System.out.println("You have summoned the finance monster.");
							System.out.printf("That monster hitted the %s and his hp dropped with 160.%n", 
									          currentEnemy.getName());
							System.out.printf("The %s now has %d hp left.%n", currentEnemy.getName(),
									           currentEnemy.getHP());
						}
						else {
							System.out.println("You don't have enough ability power to use this ability.");
							continue;
						}	
					}
					break;
					default:
						System.out.println("Invalid choice.");
						continue;
					}
				}			
			}
			break;
			default:
				System.out.println("Invalid choice.");
				continue;
			}		
			
			if (currentEnemy.getHP() == 0) { //The enemy is killed
				currentHero.setAbilityPower(currentHeroAbilityPower);
				System.out.printf("%s finally killed that %s!%n", currentHero.getName(), 
						          currentEnemy.getName());
				System.out.printf("%s has %d hp and %d ability power left.%n", currentHero.getName(), 
						          currentHero.getHP(), currentHero.getAbilityPower());
				break;
			}
			
			int currentEnemyRandomBasicAttack = randInt(currentEnemyBasicAttack - 15, 
														currentEnemyBasicAttack + 15);
			
			//The enemy attacks
			currentHero.removeHP(currentEnemyRandomBasicAttack);
			if (currentHero.getHP() < 0) {
				currentHero.setHP(0);
			}
			System.out.printf("The %s hitted %s for %d damage.%n", currentEnemy.getName(), 
					          currentHero.getName(), currentEnemyRandomBasicAttack);
			System.out.printf("%s has %d hp and %d ability power left.%n", currentHero.getName(), 
					          currentHero.getHP(), currentHeroAbilityPower);
			if (currentHero.getHP() == 0) { //Hero is dead
				System.out.printf("%s is killed by the %s. Game over.%n", currentHero.getName(), 
						          currentEnemy.getName());
				System.exit(0);
				//heroIsAlive = false;
				//break;
			}
		}	
		
		//Recharge if hp is lower than 50% (heroIsAlive)
		if (currentHero.getHP() < currentHero.GetMaxHP() / 2) {
			System.out.printf("Warning! HP low! %s has only %d HP left.%n", currentHero.getName(),
							  currentHero.getHP());
			System.out.printf("Do you want to get %s's hp recharched?%n", currentHero.getName());
			System.out.printf("1 - Yes, 2 - No, %s is brave enough to fight without recharging%n", 
							  currentHero.getName());
			choosenNumber = Integer.parseInt(input.nextLine());
			if (choosenNumber == 1) {
				currentHero.resetHP();
				System.out.printf("%s now has %d HP.%n", currentHero.getName(), currentHero.getHP());
			}
		}
		
		//Recharge is ability power is lower than 50% (heroIsAlive)
		if (currentHero.getAbilityPower() < currentHero.getMaximumAbilityPower() / 2) {
			System.out.printf("Warning! Ability power low! %s has only %d ability power left.%n", 
					          currentHero.getName(), currentHero.getAbilityPower());
			System.out.printf("Do you want to get %s's ability power recharched?%n", currentHero.getName());
			System.out.printf("1 - Yes, 2 - No, %s is brave enough to fight without recharging", 
					          currentHero.getName());
	
			choosenNumber = Integer.parseInt(input.nextLine());
			if (choosenNumber == 1) {
			currentHero.resetAbilityPower();
			System.out.printf("%s now has %d ability power.%n", currentHero.getName(), 
					          currentHero.getAbilityPower());
			}
		}
	}
	
	public static int randInt(int min, int max) {    
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}