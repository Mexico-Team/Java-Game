import java.util.Scanner;

public class LevelUACEG {
	public static void Execute(Hero player){

		Scanner input=new Scanner(System.in);
			
		Hero hero = player;
		System.out.println("Welcome to University of Sodom and Gomorrah!\n"
				+ "University of Architecture, Civil Engineering and Geodesy!");

		System.out.println("You have to choose what profession you want to study:");
		System.out.println("Builder of the Justice (Press 1), "
				+ "Geodesist defining the Earth processes (Press 2) or "
				+ "HyrdoMan controlling the Water");
			
		String choice=input.nextLine();
		
		switch(choice){
		// Builder of the Justice ---------------------------------------------------------------------
		case "1":
			System.out.println("Good choice! Builders of Justice are very important in hole Universe! :D "
					+ "But because it's very hard you have to pay with your blood for stuDYING.\n"
					+ "-100hp "); // ? 100	
			hero.setHP(hero.getHP() - 100);
			
			System.out.println("You have the power to control the Physics of the Universe (Press 1) or "
					+ "the Math algorithms of the Universe (Press 2)");
			
			String choice1=input.nextLine();
			switch (choice1) {
			// 1. The Physics
			case "1":
				System.out.println("You don't have time for everything. The Physics is too hard so you have to choose:\n"
						+ "You will study hard (Press 1) or cheat (Press2)? ]:)");
				
				String choice11 = input.nextLine();
				switch (choice11) {
				
				// 1.1. Study
				case "1":
					hero.setHP(hero.getHP() - 20);
					hero.setAbilityPower(hero.getAbilityPower() + 30);
					hero.setBasicAttack(hero.getBasicAttack() + 20);
					System.out.println("Lol you are hard worker! Your pain will be worth it! "
							+ "You win +30 to your Ability Power and +20 to your Basic Attack!\n"
							+ ""); // Next case ???			
					break;
					
				// 1.1. Cheat	
				case "2": 

					hero.setHP(hero.getHP() - 20);
					hero.setAbilityPower(hero.getAbilityPower() - 30);
					hero.setBasicAttack(hero.getBasicAttack() - 20);
					
					System.out.println("Lol you are lazzzyyy asss babe! You will go to Hell for this dirty cheating!! "
							+ "Da professor catch youu!"
							+ "You lost -30 from your Ability Power and -20 from your Basic Attack! :pPppPpp\n"
							+ ""); // Next case ???
					break;
				}

				break;
				
			// 2. The Math
			case "2":
				System.out.println("You don't have time for everything. The Physics is too hard so you have to choose:\n"
						+ "You will study hard (Press 1) or cheat (Press 2)? ]:)");
				
				String choice12 = input.nextLine();
				switch (choice12) {
				
				// 1.2. Study
				case "1":
					hero.setHP(hero.getHP() - 20);
					hero.setAbilityPower(hero.getAbilityPower() + 30);
					hero.setBasicAttack(hero.getBasicAttack() + 20);
					System.out.println("Lol you are hard worker! Your pain will be worth it! "
							+ "You win +30 to your Ability Power and +20 to your Basic Attack!\n"
							+ ""); // Next case ???			
					break;
					
				// 1.2. Cheat	
				case "2": 

					hero.setHP(hero.getHP() - 20);
					hero.setAbilityPower(hero.getAbilityPower() - 30);
					hero.setBasicAttack(hero.getBasicAttack() - 20);
					
					System.out.println("Lol you are lazzzyyy asss babe! You will go to Hell for this dirty cheating!! "
							+ "Da professor catch youu!"
							+ "You lost -30 from your Ability Power and -20 from your Basic Attack! :pPppPpp\n"
							+ ""); // Next case ???
					break;
				}
				
				break;	
			}
			
			// Geodesist defining the Earth processes -------------------------------------------------
			
			// HyrdoMan controlling the Water ---------------------------------------------------------
				
		}
	}
}

	
	
	










