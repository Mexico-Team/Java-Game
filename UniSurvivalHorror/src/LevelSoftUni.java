import java.util.Random;
import java.util.Scanner;


public class LevelSoftUni {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void Execute(Hero player){
		String choice = new String();
		boolean validChoice;
		Hero hero = player;
		//First interaction;
		System.out.println("---------------");
		System.out.println("Evening traveler. Your search is over - you've found the right place.");
		System.out.println("You are in the hallway - do you dare entering?\nYes(1), No(2)");
		choice = input.nextLine();
		validChoice = false;
		while (!validChoice) {
			switch (choice) {
			case "1":
				hero.setBasicAttack(hero.getBasicAttack() + 30);
				System.out.printf("Lord Nakov commands you for your bravery and he gave you old rusty keyboard to defend yourself. You gained 30 basic attack and now have %s basic attack.\n"
						, hero.getBasicAttack() );
				break;
			case "2":
				System.out.println("You try to escape, but you are attacked by Angry Mob.");
				CommonEnemy mob = new CommonEnemy("Angry Mod", 500, 50);
				//Event
				hero = battle(hero, mob);
				if (hero.getHP() < 0) {
					return;
				}
				break;
			default:
				validChoice = isValid(choice);
				break;
			}
			break;
		}
		if (hero.getHP() < 800) {
			hero = healerEvent(hero);
		}
		System.out.println("---------------");
		System.out.println("Your exit is blocked, the only way is forward.");
		//Second interaction;
		
		//Event
		System.out.println("---------------");
		hero.setHP(hero.getHP() + 1000);
		System.out.println("You found Introduction to programming with Java, your hp has increased by 1000 for the time been.");
		hpStatus(hero);
		
		//Event
		System.out.println("---------------");
		hero.setHP(hero.getHP() - 100);
		System.out.println("You stepped over old rusty computer, you loose 100 hp.");
		if (hero.getHP() < 0) {
			return;
		}
		hpStatus(hero);
		
		//Event
		System.out.println("---------------");
		hero.setBasicAttack(hero.getBasicAttack() + 30);
		System.out.println("You meet Sto, he tries to explain Linux to you as a result you gain 120 basic attack - Java code no longer scares you!");
		System.out.printf("Your basic attack is %d now.\n",  hero.getBasicAttack());
		
		//Event
		System.out.println("---------------");
		hero.setHP(hero.getHP() - 100);
		System.out.println("You tip over a cable, you loose 100 hp.");
		if (hero.getHP() < 0) {
			return;
		}
		hpStatus(hero);
		
	}
	
	private static int rng() {
		Random rngJesus = new Random();
	    int randomNum = rngJesus.nextInt(3);
	    return randomNum;
	}
	
	private static void battleInfo(Hero hero, CommonEnemy enemy) {
		if (enemy.getHP() <= 0) {
			System.out.printf("%s has %d hp left, %s has no hp left.\n",
					hero.getName(), hero.getHP(), enemy.getName());
		}
		else {
			System.out.printf("%s has %d hp left, %s has %d hp left.\n",
				hero.getName(), hero.getHP(), enemy.getName(), enemy.getHP());
		}
	}
	
	private static boolean isHeroAlive(Hero hero) {
		if (hero.getHP() < 0) {
			System.out.println("Level Over!");
			return false;
		}
		return true;
	}
	
	private static boolean isValid(String choice) {
		System.out.printf("%s is not valid choice, try again!", choice);
		choice = input.nextLine();
		if (choice.equals("1") || choice.equals("2")) {
			return true;
		}
		return false;
	}
	
	private static void hpStatus(Hero hero) {
		System.out.printf("%s now has %d hp!\n", hero.getName(), hero.getHP());
	}
	
	private static Hero battle(Hero hero, CommonEnemy enemy) {
		while (enemy.getHP() > 0) {
			System.out.printf("You can attack the %s with basic attack(1), magic attack(2). Witch one shall you use?\n",
					enemy.getName());
			String attackChoice = input.nextLine();
			while (!attackChoice.equals("1") && !attackChoice.equals("2")) {
				System.out.printf("%s is not valid choice, try again!", attackChoice);
				attackChoice = input.nextLine();
			}
			switch (attackChoice) {
			case "1":
				int damage = hero.getBasicAttack() * rng();
				enemy.setHP(enemy.getHP() - damage);
				System.out.printf("You attacked the %s for %d basic damage\n", enemy.getName(), damage);
				int enemyDamage = enemy.getBasicAttack() * rng();
				hero.setHP(hero.getHP() - enemyDamage);
				System.out.printf("%s strikes you back for %d\n", enemy.getName(), enemyDamage);
				battleInfo(hero, enemy);
				if (!isHeroAlive(hero)) {
					return hero;
				}
				break;
			case "2":
				int spellDamage = hero.getAbilityPower() * (3 + rng());
				hero.setAbilityPower(0);
				enemy.setHP(enemy.getHP() - spellDamage);
				System.out.printf("You cast insane Java code in %s's face for %d damage. Your ability power is now 0. Your next spell will do 0 damage, you need to replanish your ability power!\n",
						enemy.getName(), spellDamage);
				int enemyDmg = enemy.getBasicAttack() * rng();
				hero.setHP(hero.getHP() - enemyDmg);
				System.out.printf("%s strikes you back for %d\n", enemy.getName(), enemyDmg);
				battleInfo(hero, enemy);
				if (!isHeroAlive(hero)) {
					return hero;
				}
				break;
			}
		}
		System.out.printf("%s is no more!\n", enemy.getName());
		return hero;
	}

	private static Hero healerEvent(Hero hero) {
		hero.setHP(hero.GetMaxHP());
		System.out.printf("Lord Nakov apears in front of you %s and heals you with magic Java Algorithm. Now you have %d hp and full ability power!\n",
				hero.getName(), hero.getHP());
		return hero;
	}
	
	

}
