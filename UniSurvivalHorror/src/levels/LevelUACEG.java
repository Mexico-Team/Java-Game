package levels;

import java.util.Scanner;

import source.CommonEnemy;
import source.Hero;

public class LevelUACEG {
	public static void Execute(Hero player) {

		Scanner input = new Scanner(System.in);

		Hero hero = player;
		hero.heroReseter();
		CommonEnemy enemyBossYoda = new CommonEnemy("Master Yoda", 800, 90);
		CommonEnemy enemyBaDka = new CommonEnemy("Bourgaska BaDka", 400, 70);
		CommonEnemy enemyPikachu = new CommonEnemy("Pikachu", 70, 30);

		System.out.println("Welcome to University of Sodom and Gomorrah!\n"
				+ "University of Architecture, Civil Engineering and Geodesy!"); ///11111111111111111111111111111111111111111111

		System.out.println("You have to choose what hero you want to be:"); //1111111111111111111111111111111111111111
		System.out.println("Builder of the Justice (Press 1), "
				+ "Geodesist defining the Earth processes (Press 2)?");

		String choice = input.nextLine();
		switch (choice) {

		case "1": // Builder of the Justice
			System.out.println("Good choice! Builders of Justice are very important in whole Universe! :D"); //111111111111111111111111111111111
			System.out.printf("And here %s met the first enemy! You have to chose if you want to run (Press 1)"
							+ " or if you will stay and fight (Press 2)?\n",
							hero.getName());

			String choice1 = input.nextLine();
			switch (choice1) {

			case "1": // First
				bonusAbilityPower(hero);
				battle(hero, enemyBaDka);
				System.out
						.printf("And here %s met the second enemy! You have to chose if you want to run (Press 1)"
								+ " or if you will stay and fight (Press 2)?\n",
								hero.getName());
				String choice11 = input.nextLine();
				switch (choice11) {

				case "1": // Second
					battle(hero, enemyPikachu);
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());

					String choice111 = input.nextLine();
					switch (choice111) {
					case "1": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyBossYoda);
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						battle(hero, enemyPikachu);

						break;
					}
					break;

				case "2": // Second
					bonusAbilityPower(hero);
					battle(hero, enemyBossYoda);
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());

					String choice112 = input.nextLine();
					switch (choice112) {
					case "1": // Third
						bonusAbilityPower(hero);
						battle(hero, enemyBaDka);
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						battle(hero, enemyPikachu);
						break;
					}
					break;
				}
				break;

			case "2": // First
				battle(hero, enemyBaDka);
				System.out
						.printf("And here %s met the second enemy! You have to chose if you want to run (Press 1)"
								+ " or if you will stay and fight (Press 2)?\n",
								hero.getName());

				String choice12 = input.nextLine();
				switch (choice12) {
				case "1": // Second
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());
					bonusAbilityPower(hero);
					battle(hero, enemyPikachu);

					String choice121 = input.nextLine();
					switch (choice121) {
					case "1": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyBossYoda);
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyPikachu);
						break;
					}
					break;

				case "2": // Second
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());
					bonusAbilityPower(hero);
					battle(hero, enemyBossYoda);

					String choice122 = input.nextLine();
					switch (choice122) {
					case "1": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyBaDka);
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyPikachu);
						break;
					}
					break;
				}
				break;
			}

			
			
			// =========================================================================================================
		case "2": 
			System.out.println("You are Geodesist defining the Earth processes! :D"); //111111111111111111111111111111111
			System.out.printf("And here %s met the first enemy! You have to chose if you want to run (Press 1)"
							+ " or if you will stay and fight (Press 2)?\n",
							hero.getName());

			String choice2 = input.nextLine();
			switch (choice2) {

			case "1": // First
				bonusAbilityPower(hero);
				battle(hero, enemyBaDka);
				System.out
						.printf("And here %s met the second enemy! You have to chose if you want to run (Press 1)"
								+ " or if you will stay and fight (Press 2)?\n",
								hero.getName());
				String choice11 = input.nextLine();
				switch (choice11) {

				case "1": // Second
					battle(hero, enemyPikachu);
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());

					String choice111 = input.nextLine();
					switch (choice111) {
					case "1": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyBossYoda);
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						battle(hero, enemyPikachu);

						break;
					}
					break;

				case "2": // Second

					bonusAbilityPower(hero);
					battle(hero, enemyBossYoda);
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());

					String choice112 = input.nextLine();
					switch (choice112) {
					case "1": // Third
						bonusAbilityPower(hero);
						battle(hero, enemyBaDka);
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						battle(hero, enemyPikachu);
						break;
					}
					break;
				}
				break;

			case "2": // First
				battle(hero, enemyBaDka);
				System.out
						.printf("And here %s met the second enemy! You have to chose if you want to run (Press 1)"
								+ " or if you will stay and fight (Press 2)?\n",
								hero.getName());

				String choice12 = input.nextLine();
				switch (choice12) {
				case "1": // Second
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());
					bonusAbilityPower(hero);
					battle(hero, enemyPikachu);

					String choice121 = input.nextLine();
					switch (choice121) {
					case "1": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyBossYoda);
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyPikachu);
						break;
					}
					break;

				case "2": // Second
					System.out
							.printf("And here %s met the third enemy! You have to chose if you want to run (Press 1)"
									+ " or if you will stay and fight (Press 2)?\n",
									hero.getName());
					bonusAbilityPower(hero);
					battle(hero, enemyBossYoda);

					String choice122 = input.nextLine();
					switch (choice122) {
					case "1": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyBaDka);
						break;

					case "2": // Third
						System.out
								.printf("And here %s met the fourth enemy! You have to chose if you want to run (Press 1)"
										+ " or if you will stay and fight (Press 2)?\n",
										hero.getName());
						bonusAbilityPower(hero);
						battle(hero, enemyPikachu);
						break;
					}
					break;
				}
				break;

			}
		}
	}


	// Bonus!
	private static void bonusAbilityPower(Hero hero) {
		int randomNumBonus = 20 + (int) (Math.random() * 100);
		int heroHp = hero.getHP() + randomNumBonus;
		System.out.printf("You won %1$d hp!!\n"
				+ "--------------> %2$s has %3$d hp.\n", randomNumBonus,
				hero.getName(), heroHp);
	}

	
	
	// Battle
	public static void battle(Hero hero, CommonEnemy enemy) {
		Scanner input = new Scanner(System.in);
		int enemyHp = enemy.getHP();
		int heroHp = hero.getHP();
		int enemyBasicAttack = enemy.getBasicAttack();
		int heroBasicAttack = hero.getBasicAttack();
		int randomNumAttack = 40 + (int) (Math.random() * 80);
		int randomNumAttackAbility = 60 + (int) (Math.random() * 100);
		
		while (true) {
			System.out
					.println("What do you want to do? If you want to use normal attack - Press \"1\"."
							+ "If you want to use your ability power - Press \"2\"");

			int choicePlayer = Integer.parseInt(input.nextLine());
			switch (choicePlayer) {
			
			// Basic attack
			case 1: {
				int basicAttack = (heroBasicAttack - enemyBasicAttack + randomNumAttack);
				enemyHp -= basicAttack;
				heroHp -= (enemyBasicAttack + randomNumAttack);
				heroBasicAttack -= randomNumAttack;
				if (heroBasicAttack <= 40) {
					heroBasicAttack = 40;
				} 

				if (enemyHp <= 0) {
					hero.setHP(heroHp);
					System.out.printf("You killed %s!\n", enemy.getName());
					return;
				}
				
				if (heroHp <= 0) {
					System.out.println("You are DEAD!!");
					return;
				}
				
				System.out.printf(
						"%1$s kicked  %2$s's ass with %7$d damage.\n"
						+ "%1$s has %4$d Attack. %2$s has %3$d Attack.\n"
						+ "%1$s has %6$d hp. %2$s has %5$d hp.\n",
						hero.getName(), enemy.getName(), basicAttack, heroBasicAttack, enemyHp, heroHp, enemyBasicAttack+randomNumAttack);
			}
				break;

			// Ability power
			case 2: {
				
				int AbilityAttack = (heroBasicAttack - enemyBasicAttack + randomNumAttackAbility);
				enemyHp -= AbilityAttack;
				heroBasicAttack -= randomNumAttack;
							
				if (enemyHp <= 0) {
					hero.setHP(heroHp);
					System.out.printf("You killed %s!\n", enemy.getName());
					return;
				}
				
				if (heroHp <= 0) {
					System.out.println("You are DEAD!!");
					return;
				}

				System.out.printf(
						"%1$s kicked  %2$s's ass with %7$d damage.\n"
						+ "%1$s has %4$d Attack. %2$s has %3$d Attack.\n"
						+ "%1$s has %6$d hp. %2$s has %5$d hp.\n",
						hero.getName(), enemy.getName(), AbilityAttack, heroBasicAttack, enemyHp, heroHp, enemyBasicAttack+randomNumAttackAbility);
				}
				break;
			}
		}
	}
	
	
}
