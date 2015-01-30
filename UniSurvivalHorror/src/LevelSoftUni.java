import java.util.Random;
import java.util.Scanner;

public class LevelSoftUni {

	private static Scanner input = new Scanner(System.in);

	public static void Execute(Hero player) {
		String choice;
		Hero hero = player;
		hero.resetHP();
		// First interaction;
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
			// Event
			hero = battle(hero, mob);
			if (hero.getHP() < 0) {
				return;
			}
			break;
		case "3":
			CommonEnemy ghost = new CommonEnemy("Angry Ghost", 1000, 50);
			System.out
					.printf("While you think about the meaning of life and what not you are attacked by %s.\n",
							ghost.getName());
			// Event
			hero = battle(hero, ghost);
			if (hero.getHP() < 0) {
				return;
			}
			break;
		}
		// Event
		hero = healerEvent(hero, 700);

		// Second interaction;
		lineSeperator();
		System.out.println("Your exit is blocked, the only way is forward.");
		// Event
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
			CommonEnemy zombie = new CommonEnemy("Zombie" + i, 350, 100);
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
				if (hero.getHP() < 0) {
					return;
				}
				break;
			case "2":
				System.out.printf("You engage %s in battle.\n",
						zombie.getName());
				// Event
				hero = battle(hero, zombie);
				if (hero.getHP() < 0) {
					return;
				}
				break;
			case "3":
				healerEvent(hero, hero.getHP());
				System.out.printf("Renewed and inspired you attack %s.\n",
						zombie.getName());
				// Event
				hero = battle(hero, zombie);
				if (hero.getHP() < 0) {
					return;
				}
				break;
			}
			lineSeperator();
		}

		// Third Interaction
		System.out
				.printf("You've managed to kill %d zombies. How do you feel? Good(1), OK(2), Bad(3)",
						rand);
		choice = input.nextLine();
		choice = isValid(choice);
		switch (choice) {
		case "1":
			// Event
			lineSeperator();
			hero.addHP(1000);
			System.out
					.println("You found Introduction to programming with Java, your hp has increased by 1000 for the time been.");
			hpStatus(hero);
			break;
		case "2":
			// Event
			lineSeperator();
			hero.removeHP(100);
			System.out
					.println("You stepped over old rusty computer, you loose 100 hp.");
			hpStatus(hero);
			if (hero.getHP() < 0) {
				return;
			}
			break;
		case "3":
			// Event
			lineSeperator();
			hero.removeHP(100);
			System.out.println("You tip over a cable, you loose 100 hp.");
			hpStatus(hero);
			if (hero.getHP() < 0) {
				return;
			}
			break;
		}

		// Fourth Interaction

		// Boss fight

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
		if (hero.getHP() <= 0) {
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
		if (enemy.getHP() <= 0) {
			System.out.printf("%s has %d hp left, %s has no hp left.\n",
					hero.getName(), hero.getHP(), enemy.getName());
		} else {
			System.out.printf("%s has %d hp left, %s has %d hp left.\n",
					hero.getName(), hero.getHP(), enemy.getName(),
					enemy.getHP());
		}
	}

	private static boolean isHeroAlive(Hero hero) {
		if (hero.getHP() < 0) {
			System.out.println("Level Over!");
			return false;
		}
		return true;
	}

	private static boolean tryEscape(Hero hero, CommonEnemy enemy) {
		if (rng() == 1 && hero.getHP() > enemy.getHP()) {
			System.out.printf(
					"You've managed to escape the %s, you feel like coward!\n",
					enemy.getHP());
			return true;
		}
		System.out.println("You failed to escape, better luck next time!");
		return false;
	}

	private static Hero battle(Hero hero, CommonEnemy enemy) {
		while (enemy.getHP() > 0) {
			System.out
					.printf("You can attack the %s with basic attack(1), magic attack(2) or try to escape(3). Witch one shall you use?\n",
							enemy.getName());
			String attackChoice = input.nextLine();
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
				if (!isHeroAlive(hero)) {
					return hero;
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
				if (!isHeroAlive(hero)) {
					return hero;
				}
				break;
			case "3":
				if (tryEscape(hero, enemy)) {
					return hero;
				} else {
					int escapeDmg = enemy.getBasicAttack() * rng() * 2;
					hero.removeHP(escapeDmg);
					System.out.printf("%s strikes you for %d\n",
							enemy.getName(), escapeDmg);
					battleInfo(hero, enemy);
					if (!isHeroAlive(hero)) {
						return hero;
					}
				}
				break;
			}
		}
		System.out.printf("%s is no more!\n", enemy.getName());
		return hero;
	}

	private static Hero healerEvent(Hero hero, int hpLimit) {
		if (hero.getHP() <= hpLimit) {
			hero.resetHP();
			hero.resetAbilityPower();
			System.out
					.printf("Lord Nakov apears in front of you %s and heals you with magic Java Algorithm. Now you have %d hp and full ability power!\n",
							hero.getName(), hero.getHP());
		}
		return hero;
	}

}
