import java.util.Scanner;

// To make the battle
// To make "Game over" ??
// To use the tree characteristics (HP, basicAttack, abilityPower) in the battle
// To make the STORY!
// ...


public class LevelUACEG {
	public static void Execute(Hero player){

		Scanner input = new Scanner(System.in);
		
		Hero hero = player;
		
		CommonEnemy enemyBossYoda = new CommonEnemy("Master Yoda", 800, 90);
		CommonEnemy enemyBaDka = new CommonEnemy("Bourgaska BaDka", 400, 80);
		CommonEnemy enemyPikachu = new CommonEnemy("Pikachu", 70, 30);
		
		
		System.out.println("Welcome to University of Sodom and Gomorrah!\n"
				+ "University of Architecture, Civil Engineering and Geodesy!");

		System.out.println("You have to choose what profession you want to study:");
		System.out.println("Builder of the Justice (Press 1), "
				+ "Geodesist defining the Earth processes (Press 2) or "
				+ "HyrdoMan controlling the Water");
					
		
		String choice = input.nextLine();
		switch(choice){
		
		case "1": // Builder of the Justice ----------------------------------------------------
			System.out.println("Good choice! Builders of Justice are very important in whole Universe! :D"); 
						
			System.out.println("You have the power to control the Physics of the Universe (Press 1) or "
					+ "the Math algorithms of the Universe (Press 2)");
			
			String choice1=input.nextLine();
			switch (choice1) {
			
			case "1":
				bonusAbilityPower(hero);
				battle (hero, enemyBaDka);
				
				String choice11 = input.nextLine();
				switch (choice11) {
				
				case "1":
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyPikachu);
					
					String choice111 = input.nextLine();
					switch (choice111) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBossYoda);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
					
				case "2": 
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyBossYoda);
					
					String choice112 = input.nextLine();
					switch (choice112) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
				}
				break;
				
			case "2":
				bonusAbilityPower(hero);
				battle (hero, enemyBaDka);
				
				String choice12 = input.nextLine();
				switch (choice12) {
				case "1":
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyPikachu);
					
					String choice121 = input.nextLine();
					switch (choice121) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBossYoda);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
					
				case "2": 
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyBossYoda);
					
					String choice122 = input.nextLine();
					switch (choice122) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
				}
				break;
			}
			
		// =========================================================================================================
		case "2": // Geodesist defining the Earth processes ----------------------------------------------------
			System.out.println("Good choice! Builders of Justice are very important in whole Universe! :D"); 
						
			System.out.println("You have the power to control the Physics of the Universe (Press 1) or "
					+ "the Math algorithms of the Universe (Press 2)");
			
			String choice2 = input.nextLine();
			switch (choice2) {
			case "1":
				bonusAbilityPower(hero);
				battle (hero, enemyBaDka);
				
				String choice21 = input.nextLine();
				switch (choice21) {
				case "1":
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyPikachu);
					
					String choice211 = input.nextLine();
					switch (choice211) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBossYoda);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
					
				case "2": 
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyBossYoda);
					
					String choice212 = input.nextLine();
					switch (choice212) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
				}
				break;
				
			case "2":
				bonusAbilityPower(hero);
				battle (hero, enemyBaDka);
				
				String choice22 = input.nextLine();
				switch (choice22) {
				case "1":
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyPikachu);
					
					String choice221 = input.nextLine();
					switch (choice221) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBossYoda);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
					
				case "2": 
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyBossYoda);
					
					String choice222 = input.nextLine();
					switch (choice222) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
				}
				break;
			}
			
			
		// =====================================================================================================
		case "3": // HyrdoMan controlling the Water ----------------------------------------------------
			System.out.println("Good choice! Builders of Justice are very important in whole Universe! :D"); 
						
			System.out.println("You have the power to control the Physics of the Universe (Press 1) or "
					+ "the Math algorithms of the Universe (Press 2)");
			
			String choice3 = input.nextLine();
			switch (choice3) {
			case "1":
				bonusAbilityPower(hero);
				battle (hero, enemyBaDka);
				
				String choice31 = input.nextLine();
				switch (choice31) {
				case "1":
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyPikachu);
					
					String choice311 = input.nextLine();
					switch (choice311) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBossYoda);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
					
				case "2": 
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyBossYoda);
					
					String choice312 = input.nextLine();
					switch (choice312) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
				}
				break;

			case "2":
				bonusAbilityPower(hero);
				battle (hero, enemyBaDka);
			
				String choice32 = input.nextLine();
				switch (choice32) {
				case "1":
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyPikachu);
					
					String choice321 = input.nextLine();
					switch (choice321) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyPikachu);
						break;
					}
					break;
					
				case "2": 
					System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
							+ "....................................");
					bonusAbilityPower(hero);
					battle (hero, enemyBossYoda);
					
					String choice322 = input.nextLine();
					switch (choice322) {
					case "1":
						System.out.println("You passed the first Battle." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBossYoda);
						break;

					case "2":
						System.out.println("You passed the first Battle. Your journey is just begun." // Ah.. oh.. Pokemonnn
								+ "....................................");
						bonusAbilityPower(hero);
						battle (hero, enemyBaDka);
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
		
		int randomNumBonus = 20 + (int)(Math.random()*100);
		int heroHp = hero.getHP() + randomNumBonus;		
		System.out.printf("Becouse of your choice, %2$s won %1$d hp\n"
				+ "--------------> %2$s has %3$d hp left.\n", 
				randomNumBonus, hero.getName(), heroHp);
	}
	
	
	// Battle
	// With help from https://github.com/SimeonStoykov
	public static void battle(Hero hero, CommonEnemy enemy) {
		Scanner input = new Scanner(System.in);
		int enemyHp = enemy.getHP();
		int heroHp = hero.getHP();
		int enemyBasicAttack = enemy.getBasicAttack();
		int heroBasicAttack = hero.getBasicAttack();
		int randomNumAttack = 40 + (int)(Math.random()*180);
		
		while (true) {
			System.out.println("Battlee! Prepare yourself! :D\n"
					+ "What do you want to do? If you want to use normal attack - Press \"1\"."
					+ "If you want to use your ability power - Press \"2\"");
			
			int choicePlayer = Integer.parseInt(input.nextLine());		
			switch (choicePlayer) {
			// Basic attack -----------------------------------------------------
			case 1: {
				int basicAttack = (heroBasicAttack - enemyBasicAttack + randomNumAttack);
				enemyHp -= basicAttack;
				if (enemyHp < 0) {
					enemyHp = 0;
				}
				System.out.printf("%1$s kicked  %2$s's ass with %3$d damage.\n"
						+ "--------------> %2$s has %4$d hp left.\n",
						hero.getName(), enemy.getName(), basicAttack, enemyHp);	
			}
			break;
			
			// Ability power ----------------------------------------------------
			case 2: {
				int AbilityAttack = (heroBasicAttack - enemyBasicAttack + randomNumAttack);
				enemyHp -= AbilityAttack;
			}
			break;
			default:
				break;
			}
			if (enemyHp == 0) {
				hero.setHP(heroHp);
				System.out.printf("You killed %s!\n", enemy.getName());
				break;
			}
								
		}			
	}
	
}