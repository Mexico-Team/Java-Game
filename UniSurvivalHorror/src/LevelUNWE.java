import java.util.Random;
import java.util.Scanner;

public class LevelUNWE {
	public static void Execute(Hero player) {
		Scanner input = new Scanner(System.in);
		Hero hero = player;
		slowPrint ("Very bad choice.", 60);
		slowPrint ("You have deared to enter the economists realm. Prepare yoursefl!", 60);
		slowPrint ("In which part of the university do you want to go? Choose your destiny!", 60);
		System.out.printf("1 - Old Hull; 2 - New Hull; 3 - The Bank.%n");
		int choosenNumber = Integer.parseInt(input.nextLine());
		switch (choosenNumber) {
			case 1: { //Old hull
				slowPrint(String.format("%s enters in the library and finds old rare book.", hero.getName()), 60);
				slowPrint(String.format("%s starts reading the book.", hero.getName()), 60);
				//sleep with dots (loading)
				int bonusAbilityPower = randInt(10, 20);
				slowPrint(String.format("That book gives %s wisdom and +%d ability power.", hero.getName(),
						                bonusAbilityPower), 60);
				System.out.printf("%s now has %d ability power.%n", hero.getName(), 
						          hero.getAbilityPower() + bonusAbilityPower);				
				hero.setAbilityPower(hero.getAbilityPower() + bonusAbilityPower);
				CommonEnemy enemy = new CommonEnemy("Mad Reader", randInt(200, 400), randInt(40, 80));
				// sleep (little)
				slowPrint(String.format("Unfortunatelly %s is attacked by %s (%d basic attack and %d HP).",
						  hero.getName(), enemy.getName(), enemy.getBasicAttack(),  enemy.getHP()), 60);
				slowPrint(String.format("That %s is furios because %s makes too much noise in the library.", 
						enemy.getName(), hero.getName()), 60);						
				slowPrint("The battle begins. Prepare yourself!", 60);
				//sleep
				battle (input, enemy, hero);
				if (hero.isDead()) {
					return;
				}		
				//sleep
				slowPrint(String.format("%s is very tired after that heavy battle.", hero.getName()), 60);
				slowPrint(String.format("%s decides to go to the shop to buy some food.", hero.getName()), 60);
				//sleep (going to the shop)
				slowPrint(String.format("%s bought a sandwich which gave him 50 bonus HP.", hero.getName()), 60);
				hero.addHP(50);
				slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
				slowPrint(String.format("Where do you want %s to go now?", hero.getName()), 60);
				System.out.println("1 - Lecture hall; 2 - To see the old professor.");
				
				choosenNumber = Integer.parseInt(input.nextLine());
				switch (choosenNumber) {
				case 1: {
					slowPrint(String.format("Here is too crowdy. All that noise and people makes %s feel nervous.", 
							  hero.getName()), 60);
					slowPrint(String.format("Because of that %s loose 50 HP.", hero.getName()), 60);
					hero.removeHP(50);
					slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
					slowPrint(String.format("Suddenly %1$s is attacked by zombie student who obviously "
							              + "has no brain and wants to eat %1$s's. ", hero.getName()), 60);
					enemy = new CommonEnemy("Zombie Student", randInt(200, 400), randInt(40, 80));
					slowPrint("The battle begin. Prepare yourself!", 60);
					battle(input, enemy, hero);
					if (hero.isDead()) {
						return;
					}	
					//sleep
					slowPrint(String.format("%s found some food on one of the desks.", hero.getName()), 60);
					slowPrint(String.format("When %s try to get and eat it the hero is attacked again.", 
							                hero.getName()), 60);
					slowPrint("This time the attacker is Lelia Vanche the Crazy Cleaner.", 60);
					enemy = new CommonEnemy("Lelia Vanche", randInt(200, 400), randInt(40, 80));
					slowPrint("The battle begins. Prepare yourself!", 60);
					battle(input, enemy, hero);
					if (hero.isDead()) {
						return;
					}	
					//sleep
					slowPrint(String.format("Finally %s can sit and rest in the hall because everyone "
							              + "are gone.", hero.getName()), 60);
					slowPrint("Resting..........", 60);
					slowPrint(String.format("%s gains 100 bonus health after the rest.", hero.getName()), 60);
					slowPrint(String.format("%s has now %d HP.", hero.getName(), hero.getHP()), 60);
					slowPrint(String.format("%s decides to go to the toilet to do some stuff :D", hero.getName()), 60);
					slowPrint(String.format("Unfortunatelly %s slips on the wet floor and falls down.", hero.getName()), 60);
					slowPrint(String.format("%s looses 50 HP.", hero.getName()), 60);
					slowPrint(String.format("%1$s meets an old “friend” who is not the same as %1$s remembers "
							              + "him.", hero.getName()), 60);
					slowPrint("He is now bigger because he has been drinking “Nacepin” recently.", 60);
					slowPrint(String.format("He bullied %1$s in the past and now %1$s has he chance to revenge "
							              + "for all that injustice.", hero.getName()), 60);
					slowPrint(String.format("What do you want %s to do?", hero.getName()), 60);
					System.out.println("1 – Attack him;  2 – Don't attack him and run like a chichken.");
					enemy = new CommonEnemy ("Nacepeno Zombi", randInt(200, 400), randInt(40, 80));
					choosenNumber = Integer.parseInt(input.nextLine());
					if (choosenNumber == 1) {
						slowPrint("The battle begins. Prepare yourself!", 60);
						battle(input, enemy, hero);
						if (hero.isDead()) {
							return;
						}	
						//sleep
					}
					else {
						slowPrint(String.format("Two students saw %1$s's chicken wings and realized that %1$s "
								              + "is a coward.", hero.getName()), 60);
						slowPrint(String.format("They kicked %1$s's ass. %1$s looses 100 HP.", 
								                hero.getName()), 60);
						hero.removeHP(100);
						slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
					}
					slowPrint(String.format("%s finds finance calculator on the stairs. Hmmm it can help in that cursed "
							              + "university.", hero.getName()), 60);
					slowPrint(String.format("%s gains 30 ability power.", hero.getName()), 60);
					hero.setAbilityPower(hero.getAbilityPower() + 30);
					slowPrint(String.format("%s now has %d ability power.", hero.getName(), hero.getAbilityPower()), 60);
					slowPrint(String.format("%s asks an administration worker simple question but the worker "
							              + "goes crazy.", hero.getName()), 60);
					slowPrint(String.format("How can %s be so stupid to ask such lame questions?", hero.getName()), 60);
					slowPrint(String.format("%s is attacked by the worker because of the asked question.", hero.getName()), 60);
					enemy = new CommonEnemy ("Crazy administration worker", randInt(200, 400), randInt(40, 80));
					slowPrint("The battle begins. Prepare yourself!", 60);
					battle(input, enemy, hero);
					if (hero.isDead()) {
						return;
					}	
					//sleep
					slowPrint(String.format("After that fight %s decides to go to ask the rector why all people "
							              + "in the university are crazy zombies.", hero.getName()), 60);
					slowPrint(String.format("On the way to the rectorate %s finds big book (only 5000 pages) for the economic history, "
							              + "which can be nice weapon indeed. ", hero.getName()), 60);
					slowPrint(String.format("%s recieves 20 bonus basic attack", hero.getName()), 60);
					hero.addBasicAttack(20);
					slowPrint(String.format("%s now has %d basic attack.", hero.getName()), 60);
					slowPrint(String.format("Finally %s meets the rector.", hero.getName()), 60);
					slowPrint(String.format("%s realizes that the rector is zombied too and he is managing all "
							+ "the crazy stuff in the university.", hero.getName()), 60);
					slowPrint(String.format("A great battle is coming. The zombie rector attacks %s.", 
							                hero.getName()), 60);
					//BOSS FIGHT			
				}
				break;
				
				case 2: {
					
				}
				break;

				default:
					break;
				}
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
	
	public static void slowPrint (String message, long milliseconds) {
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public static void battle (Scanner input, CommonEnemy enemy, Hero hero) {
		int currentEnemyBasicAttack = enemy.getBasicAttack();
		int currentHeroBasicAttack = hero.getBasicAttack();
		int currentHeroAbilityPower = hero.getAbilityPower();
		int choosenNumber = 0;
		boolean heroIsAlive = true;
		while (true) {
			System.out.println("Current round. How will you atack?");
			System.out.println("1 - Use basic attack, 2 - Use ability power.");
			
			choosenNumber = Integer.parseInt(input.nextLine());
			
			//Our hero attacks
			switch (choosenNumber) {
			case 1: { //Our hero uses basic attack
				int currentHeroRandomBasicAttack = randInt(currentHeroBasicAttack - 15,
														   currentHeroBasicAttack + 15);
				enemy.removeHP(currentHeroRandomBasicAttack);
				if (enemy.getHP() < 0) {
					enemy.setHP(0);
				}
				System.out.printf("%1$s hitted the %2$s for %3$d damage. %2$s has %4$d hp left.%n", 
								 hero.getName(), enemy.getName(), currentHeroRandomBasicAttack, 
						         enemy.getHP());
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
							enemy.removeHP(100);
							if (enemy.getHP() < 0) {
								enemy.setHP(0);
							}
							currentHeroAbilityPower -= 25;
							System.out.printf("You explained everything to the %s.%n", enemy.getName());
							System.out.printf("That ruined mentally the %s and his hp dropped with 100.%n", 
									          enemy.getName());
							System.out.printf("The %s now has %d hp left.%n", enemy.getName(),
									           enemy.getHP());
						}
						else {
							System.out.println("You don't have enough ability power to use this ability.");
							continue;
						}		
					}
					break;
					
					case 2: {
						if (currentHeroAbilityPower >= 40) {
							enemy.removeHP(160);
							if (enemy.getHP() < 0) {
								enemy.setHP(0);
							}
							currentHeroAbilityPower -= 40;
							System.out.println("You have summoned the finance monster.");
							System.out.printf("That monster hitted the %s and his hp dropped with 160.%n", 
									          enemy.getName());
							System.out.printf("The %s now has %d hp left.%n", enemy.getName(),
									           enemy.getHP());
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
			
			if (enemy.getHP() == 0) { //The enemy is killed
				hero.setAbilityPower(currentHeroAbilityPower);
				System.out.printf("%s finally killed that %s!%n", hero.getName(), 
						          enemy.getName());
				System.out.printf("%s has %d hp and %d ability power left.%n", hero.getName(), 
						          hero.getHP(), hero.getAbilityPower());
				break;
			}
			
			int currentEnemyRandomBasicAttack = randInt(currentEnemyBasicAttack - 15, 
														currentEnemyBasicAttack + 15);
			
			//The enemy attacks
			hero.removeHP(currentEnemyRandomBasicAttack);
			if (hero.getHP() < 0) {
				hero.setHP(0);
			}
			System.out.printf("The %s hitted %s for %d damage.%n", enemy.getName(), 
					          hero.getName(), currentEnemyRandomBasicAttack);
			System.out.printf("%s has %d hp and %d ability power left.%n", hero.getName(), 
					          hero.getHP(), currentHeroAbilityPower);
			if (hero.getHP() == 0) { //Hero is dead
				System.out.printf("%s is killed by the %s. Game over.%n", hero.getName(), 
						          enemy.getName());
				heroIsAlive = false;
				break;
			}
		}	
		
		//Recharge if hp is lower than 50% (heroIsAlive)
		if (heroIsAlive && hero.getHP() < hero.GetMaxHP() / 2) {
			System.out.printf("Warning! HP low! %s has only %d HP left.%n", hero.getName(),
							  hero.getHP());
			System.out.printf("Do you want to get %s's hp recharched?%n", hero.getName());
			System.out.printf("1 - Yes, 2 - No, %s is brave enough to fight without recharging%n", 
							  hero.getName());
			choosenNumber = Integer.parseInt(input.nextLine());
			if (choosenNumber == 1) {
				hero.resetHP();
				System.out.printf("%s now has %d HP.%n", hero.getName(), hero.getHP());
			}
		}
		
		//Recharge is ability power is lower than 50% (heroIsAlive)
		if (heroIsAlive && hero.getAbilityPower() < hero.getMaximumAbilityPower() / 2) {
			System.out.printf("Warning! Ability power low! %s has only %d ability power left.%n", 
					          hero.getName(), hero.getAbilityPower());
			System.out.printf("Do you want to get %s's ability power recharched?%n", hero.getName());
			System.out.printf("1 - Yes, 2 - No, %s is brave enough to fight without recharging", 
					          hero.getName());
	
			choosenNumber = Integer.parseInt(input.nextLine());
			if (choosenNumber == 1) {
			hero.resetAbilityPower();
			System.out.printf("%s now has %d ability power.%n", hero.getName(), 
					          hero.getAbilityPower());
			}
		}
	}
	
	public static int randInt(int min, int max) {    
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}