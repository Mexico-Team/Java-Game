package levels;

import java.util.Random;
import java.util.Scanner;

import source.Boss;
import source.CommonEnemy;
import source.Hero;

public class LevelUNWE {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	static String choosenNumber = "";
	
	public static void Execute(Hero player) {
		Scanner input = new Scanner(System.in);
		Hero hero = player;
		int heroInitialAttack = hero.getBasicAttack();
		slowPrint ("Very bad choice.", 60);
		slowPrint ("You have deared to enter the economists realm. Prepare yourself!", 60);
		slowPrint ("In which part of the university do you want to go? Choose your destiny!", 60);
		System.out.printf("1 - Old Hull 2 - New Hull 3 - The Bank%n");
		choosenNumber = input.nextLine();
		while (!(choosenNumber.equals("1") || choosenNumber.equals("2") || choosenNumber.equals("3"))) {
			System.out.println("Invalid choice. Try again.");
			System.out.printf("1 - Old Hull 2 - New Hull 3 - The Bank%n");
			choosenNumber = input.nextLine();
		}
		switch (choosenNumber) {
			case "1": { //Old hull
				slowPrint(String.format("%s enters in the library and finds old rare book.", hero.getName()), 60);
				slowPrint(String.format("%s starts reading the book.", hero.getName()), 60);
				
				int bonusAbilityPower = randInt(10, 20);
				slowPrint(String.format("That book gives %s wisdom and %d ability power.", hero.getName(),
						                bonusAbilityPower), 60);
				slowPrint(String.format("%s now has %d ability power.", hero.getName(), 
						          hero.getAbilityPower() + bonusAbilityPower), 60);				
				hero.setAbilityPower(hero.getAbilityPower() + bonusAbilityPower);
				CommonEnemy enemy = new CommonEnemy("Mad Reader", randInt(200, 400), randInt(40, 80));
				
				slowPrint(String.format("Unfortunatelly %s is attacked by %s (%d basic attack and %d HP).",
						  hero.getName(), enemy.getName(), enemy.getBasicAttack(),  enemy.getHP()), 60);
				slowPrint(String.format("That %s is furios because %s makes too much noise in the library.", 
						enemy.getName(), hero.getName()), 60);						
				slowPrint("The battle begins. Prepare yourself!", 60);
				
				battle (input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}		
			
				slowPrint(String.format("%s is very tired after that heavy battle.", hero.getName()), 60);
				slowPrint(String.format("%s decides to go to the shop to buy some nuts.", hero.getName()), 60);
				
				int randomBonusHP = randInt(30,60);
				slowPrint(String.format("%s bought a package of peanuts and gains %d bonus HP after eating it.", hero.getName(),
						                randomBonusHP), 60);
				hero.addHP(randomBonusHP);
				slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
				slowPrint(String.format("Where do you want %s to go now?", hero.getName()), 60);
				System.out.println("1 - Lecture hall 2 - To see the old professor");
				
				choosenNumber = input.nextLine();
				while (!(choosenNumber.equals("1") || choosenNumber.equals("2"))) {
					System.out.println("Invalid choice. Try again.");
					System.out.println("1 - Lecture hall 2 - To see the old professor");
					choosenNumber = input.nextLine();
				}
				switch (choosenNumber) {
				case "1": { //Lecture Hall
					slowPrint(String.format("Here is too crowdy. All that noise and people makes %s feel nervous.", 
							  hero.getName()), 60);
					int randomLostHP = randInt(20,50);
					slowPrint(String.format("Because of that %s looses %d HP.", hero.getName(), randomLostHP), 60);
					hero.removeHP(randomLostHP);
					if (deathAfterEvent(hero, heroInitialAttack)) {
						return;
					}
					slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
					enemy = new CommonEnemy("Zombie Student", randInt(200, 400), randInt(40, 80));
					slowPrint(String.format("Suddenly %1$s is attacked by zombie student (%2$d basic attack and %3$d HP) who obviously "
							              + "has no brain and wants to eat %1$s's. ", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
					slowPrint("The battle begins. Prepare yourself!", 60);
					battle(input, enemy, hero, heroInitialAttack);
					if (hero.isDead()) {
						return;
					}	
					
					slowPrint(String.format("%s found some food on one of the desks.", hero.getName()), 60);
					slowPrint(String.format("When %s try to get and eat it, he is attacked again.", 
							                hero.getName()), 60);
					enemy = new CommonEnemy("Lelia Vanche", randInt(200, 400), randInt(40, 80));
					slowPrint(String.format("This time the attacker is Lelia Vanche the crazy cleaner (%d basic attack and %d HP).", enemy.getBasicAttack(), enemy.getHP()), 60);
					slowPrint("The battle begins. Prepare yourself!", 60);
					battle(input, enemy, hero, heroInitialAttack);
					if (hero.isDead()) {
						return;
					}	
					
					slowPrint(String.format("Finally %s can sit and rest in the hall because everyone "
							              + "are gone.", hero.getName()), 60);
					slowPrint("Resting..........", 60);
					randomBonusHP = randInt(80, 120);
					hero.addHP(randomBonusHP);
					slowPrint(String.format("%s gains %d bonus health after the rest.", hero.getName(), randomBonusHP), 60);
					slowPrint(String.format("%s has now %d HP.", hero.getName(), hero.getHP()), 60);
					
					slowPrint(String.format("%s decides to go to the toilet to do some stuff :D", hero.getName()), 60);
					slowPrint(String.format("Unfortunatelly %s slips on the wet floor and falls down.", hero.getName()), 60);
					randomLostHP = randInt(30,60);
					slowPrint(String.format("%s looses %d HP.", hero.getName(), randomLostHP), 60);
					hero.removeHP(randomLostHP);
					if (deathAfterEvent(hero, heroInitialAttack)) {
						return;
					}
					slowPrint(String.format("%s has now %d HP.", hero.getName(), hero.getHP()), 60);
					slowPrint(String.format("%1$s meets an old “friend” who is not the same as %1$s remembers "
							              + "him.", hero.getName()), 60);
					slowPrint("He is now bigger because he has been drinking “Nacepin” recently.", 60);
					slowPrint(String.format("He bullied %1$s in the past and now %1$s has he chance to revenge "
							              + "for all that injustice.", hero.getName()), 60);
					slowPrint(String.format("What do you want %s to do?", hero.getName()), 60);
					System.out.println("1 – Attack him  2 – Don't attack him and run like a chichken.");
					enemy = new CommonEnemy ("Nacepeno zombi", randInt(200, 400), randInt(40, 80));
					choosenNumber = input.nextLine();
					while (!(choosenNumber.equals("1") || choosenNumber.equals("2"))) {
						System.out.println("Invalid choice. Try again.");
						System.out.println("1 – Attack him  2 – Don't attack him and run like a chichken.");
						choosenNumber = input.nextLine();
					}
					if (choosenNumber.equals("1")) {
						slowPrint(String.format("%s attacks %s (%d basic attack and %d HP).", hero.getName(), enemy.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
						slowPrint("The battle begins. Prepare yourself!", 60);
						battle(input, enemy, hero, heroInitialAttack);
						if (hero.isDead()) {
							return;
						}	
					}
					if (choosenNumber.equals("2")) {
						slowPrint(String.format("Two students saw %1$s's chicken wings and realized that %1$s "
								              + "is a coward.", hero.getName()), 60);
						randomLostHP = randInt(80,120);
						slowPrint(String.format("They kicked %1$s's ass. %1$s looses %2$d HP.", 
								                hero.getName(), randomLostHP), 60);
						hero.removeHP(randomLostHP);
						if (deathAfterEvent(hero, heroInitialAttack)) {
							return;
						}
						slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
					}
					slowPrint(String.format("%s finds finance calculator on the stairs. It can help in that cursed "
							              + "university.", hero.getName()), 60);
					int randomBonusAbilityPower = randInt(20, 40);
					slowPrint(String.format("%s gains %d ability power.", hero.getName(), randomBonusAbilityPower), 60);
					hero.setAbilityPower(hero.getAbilityPower() + randomBonusAbilityPower);	
					slowPrint(String.format("%s now has %d ability power.", hero.getName(), hero.getAbilityPower()), 60);
					slowPrint(String.format("%s asks an administration worker simple question but the worker "
							              + "goes crazy.", hero.getName()), 60);
					slowPrint(String.format("How can %s be so stupid to ask such lame questions?", hero.getName()), 60);
					enemy = new CommonEnemy ("Crazy administration worker", randInt(200, 400), randInt(40, 80));
					slowPrint(String.format("%s is attacked by the worker (%d basic attack and %d HP), because of the asked question.", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
					slowPrint("The battle begins. Prepare yourself!", 60);
					battle(input, enemy, hero, heroInitialAttack);
					if (hero.isDead()) {
						return;
					}	
					
					slowPrint(String.format("After that fight %s decides to go to ask the rector why all people "
							              + "in the university have becomed crazy zombies.", hero.getName()), 60);
					slowPrint(String.format("On the way to the rectorate %s finds big book (only 5000 pages) for the economic history, "
							              + "which can be nice weapon indeed. ", hero.getName()), 60);
					int randomBonusBasicAttack = randInt(15,30);
					slowPrint(String.format("%s recieves %d bonus basic attack.", hero.getName(), randomBonusBasicAttack), 60);
					hero.addBasicAttack(randomBonusBasicAttack);
					slowPrint(String.format("%s now has %d basic attack.", hero.getName(), hero.getBasicAttack()), 60);
					slowPrint(String.format("Finally %s meets the rector.", hero.getName()), 60);
					slowPrint(String.format("%s realizes that the rector is zombie too and he is managing all "
							+ "the crazy stuff in the university.", hero.getName()), 60);
					Boss rector = new Boss ("Zombie rector", randInt(500, 1000), randInt(80, 120), randInt(100,200));
					slowPrint(String.format("A great battle is coming. The zombie rector (%d basic attack, %d special attack, %d HP) attacks %s.",rector.getBasicAttack(), rector.getSpecialAttack(), rector.getHealthPoints(), 
							                hero.getName()), 60);
					bossBattle(input, rector, hero, heroInitialAttack);
					if (hero.isDead()) {
						return;
					}			
				}
				break;
				
				case "2": { //The professor
					slowPrint(String.format("%s enters in the professors room and sees him drinking vodka.", hero.getName()), 60);
					slowPrint(String.format("“Come on sit here to talk and drink with me” - says the professor. %s sits and starts drinking.", hero.getName()), 60);
					int randomBonusAttack = randInt(10,30);
					slowPrint(String.format("%s immidiately feels stronger because of the vodka and gains %d basic attack.", hero.getName(), randomBonusAttack), 60);
					hero.addBasicAttack(randomBonusAttack);
					slowPrint(String.format("%s now has %d basic attack.", hero.getName(), hero.getBasicAttack()), 60);
					slowPrint(String.format("Suddenly the professor stars arguing with %s.", hero.getName()), 60);
					slowPrint("That is what vodka do to some people.", 60);
					enemy = new CommonEnemy ("Drunk professor", randInt(200, 400), randInt(40, 80));
					slowPrint(String.format("%s is attacked by the drunk professor (%d basic attack and %d HP).", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
					slowPrint("The battle begins. Prepare yourself!", 60);
					battle(input, enemy, hero, heroInitialAttack);
					if (hero.isDead()) {
						return;
					}	
					
					slowPrint(String.format("After that crazy fight %s runs fast from professors room.", hero.getName()), 60);
					slowPrint(String.format("Acidently %s stumble over one dropped on the floor book called “Investments” (only 1000 pages and 3 kg. weight).", hero.getName()), 60);
					int randomLostHP = randInt(25, 50);
					hero.removeHP(randomLostHP);
					slowPrint(String.format("%s looses %d HP.", hero.getName(), randomLostHP), 60);
					if (deathAfterEvent(hero, heroInitialAttack)) {
						return;
					}
					slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
					slowPrint(String.format("%s needs to rest after all those crazy things and definitely needs some coffee.", hero.getName()), 60);
					slowPrint(String.format("%s buys a coffee and feels better after drinking it.", hero.getName()), 60);
					randomBonusHP = randInt(30, 60);
					hero.addHP(randomBonusHP);
					slowPrint(String.format("%s gains %d bonus HP.", hero.getName(), randomBonusHP), 60);
					slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
					Boss rector = new Boss ("Zombie rector", randInt(500, 1000), randInt(80, 120), randInt(100,200));
					slowPrint(String.format("The zombie rector sees %1$s and wants to eat %1$s's brain to make %1$s zombie too.", hero.getName()), 60);
					slowPrint(String.format("A great battle is coming. The zombie rector (%d basic attack, %d special attack, %d HP) attacks %s.",rector.getBasicAttack(), rector.getSpecialAttack(), rector.getHealthPoints(), 
			                hero.getName()), 60);
					bossBattle(input, rector, hero, heroInitialAttack);
					if (hero.isDead()) {
						return;
					}
				}
				break;
				}
			}
			break;
			
			case "2": { //New hull
				slowPrint("Oh no. Go away fast. Here is very dangerous.", 60);
				slowPrint("What will you do ?", 60);
				System.out.println("1 - Enter 2 - Go away");
				choosenNumber = input.nextLine();
				while (!(choosenNumber.equals("1") || choosenNumber.equals("2"))) {
					System.out.println("Invalid choice. Try again.");
					System.out.println("1 - Enter 2 - Go away");
					choosenNumber = input.nextLine();
				}
				if (choosenNumber.equals("1")) {
					slowPrint(String.format("%s has entered in the New Hull which is very unstable and forbiden for the students.", hero.getName()), 60);
					slowPrint(String.format("%s is going to feel the consequences of this decision.", hero.getName()), 60);
				}
				if (choosenNumber.equals("2")) {
					slowPrint(String.format("%1$s tries to go away but one zombie tries to attack %1$s.", hero.getName()), 60);
					slowPrint("The only way to escape is to enter in the New hull.", 60);
					slowPrint(String.format("%s enters in the New hull.", hero.getName()), 60);
				}
				
				CommonEnemy enemy = new CommonEnemy ("Zombie Guard", randInt(200,400), randInt(40,80));
				slowPrint(String.format("For welcome %s is attacked by one crazy zombie guard (%d basic attack and %d HP) who doesn't like visitors.", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
				slowPrint("The battle begins. Prepare yourself!", 60);
				battle(input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
				slowPrint(String.format("%s finds a diuner (a student who bought it from Mandja street droped it).", hero.getName()), 60);
				int randomBonusHP = randInt(30, 60);
				slowPrint(String.format("%s eats the diuner and recieves %d bonus HP.", hero.getName(), randomBonusHP), 60);
				hero.addHP(randomBonusHP);
				slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
				slowPrint(String.format("One hungry zombie wants to eat diuner too so he is angry that %s eated the diuner before him.", hero.getName()), 60);
				enemy = new CommonEnemy ("Hungry zombie", randInt(200,400), randInt(40,80));
				slowPrint(String.format("The hungry zombie (%d basic attack and %d HP) attacks %s.", enemy.getBasicAttack(), enemy.getHP(), hero.getName()), 60);
				slowPrint("The battle begins. Prepare yourself!", 60);
				battle(input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
				slowPrint(String.format("One lamp falls on the %1$s's head. Well %1$s was worned not to enter here.", hero.getName()), 60);
				int randomLostHP = randInt(30,60);
				hero.removeHP(randomLostHP);
				slowPrint(String.format("%s looses %d HP.", hero.getName(), randomLostHP), 60);
				if (deathAfterEvent(hero, heroInitialAttack)) {
					return;
				}
				slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
				int randomBonusAbilityPower = randInt(20, 60);
				slowPrint(String.format("%s finds very old and valuable book which gave him knowledge and %d ability power.", hero.getName(), randomBonusAbilityPower), 60);
				hero.setAbilityPower(hero.getAbilityPower() + randomBonusAbilityPower);
				slowPrint(String.format("%s now has %d ability power.", hero.getName(), hero.getAbilityPower()), 60);
				enemy = new CommonEnemy ("Crazy professor", randInt(200,400), randInt(40,80));
				slowPrint(String.format("%s is attacked by old crazy professor (%d basic attack and %d HP) who likes to torture students.", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
				slowPrint("The battle begins. Prepare yourself!", 60);
				battle(input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
				int randomBonusBasicAttack = randInt(15,30);
				slowPrint(String.format("%s sees sharp piece of wood which is maybe part of a broken desk.", hero.getName()), 60);
				slowPrint(String.format("\"This can be nice weapon\" says %s and gets it.", hero.getName()), 60);
				hero.addBasicAttack(randomBonusBasicAttack);
				slowPrint(String.format("%s now has %d basic attack.", hero.getName(), hero.getBasicAttack()), 60);
				Boss rector = new Boss ("Zombie rector", randInt(500, 1000), randInt(80, 120), randInt(100,200));
				slowPrint(String.format("The zombie rector sees %1$s and wants to eat %1$s's brain and make %1$s zombie too.", hero.getName()), 60);
				slowPrint(String.format("A great battle is coming. The zombie rector (%d basic attack, %d special attack, %d HP) attacks %s.",rector.getBasicAttack(), rector.getSpecialAttack(), rector.getHealthPoints(), 
		                hero.getName()), 60);
				bossBattle(input, rector, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
								
			}
			break;
			
			case "3": { //The bank
				slowPrint("If you like to wait, here is the right place.", 60);
				int randomLostHP = randInt(30, 60);
			    slowPrint(String.format("After 3 hours of waiting %s gets very tired and looses %d HP.", hero.getName(), randomLostHP), 60);
			    hero.removeHP(randomLostHP);
				if (deathAfterEvent(hero, heroInitialAttack)) {
					return;
				}
			    slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
			    
				CommonEnemy enemy = new CommonEnemy ("Zombie bank guard", randInt(200,400), randInt(40,80));
				slowPrint(String.format("%1$s is attacked by a zombie bank guard (%2$d basic attack and %3$d HP) who thinks that %1$s is suspicious.", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
				slowPrint("The battle begins. Prepare yourself!", 60);
				battle(input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
				slowPrint(String.format("%s finds nice jacket (a student who bought it from Ilienci droped it).", hero.getName()), 60);
				int randomBonusHP = randInt(30, 60);
				slowPrint(String.format("%s recieves %d bonus HP.", hero.getName(), randomBonusHP), 60);
				hero.addHP(randomBonusHP);
				slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
				enemy = new CommonEnemy ("Angry clerk", randInt(200,400), randInt(40,80));
				slowPrint(String.format("One angry clerk (%2$d basic attack and %3$d HP) attacks %1$s because %1$s wants to withdraw money but doesn't have ID.", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
				slowPrint("The battle begins. Prepare yourself!", 60);
				battle(input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
				slowPrint(String.format("%s decides to go out this crazy bank.", hero.getName()), 60);
				slowPrint(String.format("On his way out %s decides to withdraw some money from the ATM.", hero.getName()), 60);
				slowPrint(String.format("%1$s finds out that the bank account is empty. That drives %1$s crazy.", hero.getName()), 60);
				slowPrint(String.format("%s hits the ATM and gets hurt.", hero.getName()), 60);
				randomLostHP = randInt(30,60);
				hero.removeHP(randomLostHP);
				slowPrint(String.format("%s looses %d HP.", hero.getName(), randomLostHP), 60);
				if (deathAfterEvent(hero, heroInitialAttack)) {
					return;
				}
				slowPrint(String.format("%s now has %d HP.", hero.getName(), hero.getHP()), 60);
				int randomBonusAbilityPower = randInt(20, 60);
				slowPrint(String.format("%1$s finds diploma in front of the bank. %1$s gains %2$d ability power.", hero.getName(), randomBonusAbilityPower), 60);
				hero.setAbilityPower(hero.getAbilityPower() + randomBonusAbilityPower);
				slowPrint(String.format("%s now has %d ability power.", hero.getName(), hero.getAbilityPower()), 60);
				enemy = new CommonEnemy ("Zombie dog", randInt(200,400), randInt(40,80));
				slowPrint(String.format("%s is attacked by a zombie dog (%d basic attack and %d HP). That dog for sure is hungry for flesh.", hero.getName(), enemy.getBasicAttack(), enemy.getHP()), 60);
				slowPrint("The battle begins. Prepare yourself!", 60);
				battle(input, enemy, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
				int randomBonusBasicAttack = randInt(15,30);
				slowPrint(String.format("%s sees big book which is maybe never opened by any student.", hero.getName()), 60);
				slowPrint(String.format("\"This can be nice weapon to hit someone to the head\" says %s and gets the book.", hero.getName()), 60);
				hero.addBasicAttack(randomBonusBasicAttack);
				slowPrint(String.format("%s recieves %d bonus basic attack.", hero.getName(), randomBonusBasicAttack), 60);
				slowPrint(String.format("%s now has %d basic attack.", hero.getName(), hero.getBasicAttack()), 60);
				Boss rector = new Boss ("Zombie rector", randInt(500, 1000), randInt(80, 120), randInt(100,200));
				slowPrint(String.format("The zombie rector (%2$d basic attack, %3$d special attack, %4$d HP) sees %1$s and wants to eat %1$s's brain and make %1$s zombie too.", hero.getName(), rector.getBasicAttack(), rector.getSpecialAttack(), rector.getHealthPoints()), 60);
				slowPrint(String.format("A great battle is coming. The zombie rector attacks %s.", hero.getName()), 60);
				bossBattle(input, rector, hero, heroInitialAttack);
				if (hero.isDead()) {
					return;
				}
			}
			break;
		}
	}

	private static boolean deathAfterEvent(Hero hero, int heroInitialAttack) {
		if (hero.isDead()) {
			hero.setHP(0);
			slowPrint(String.format("%s has %d HP left.", hero.getName(), hero.getHP()), 60);
			slowPrint(String.format("%s has DIED.", hero.getName()), 60);
			slowPrint(ANSI_RED + "GAME OVER" + ANSI_RESET, 400);
			hero.resetHP();
			hero.resetAbilityPower();
			hero.setBasicAttack(heroInitialAttack);
			hero.setGold(0);
			return true;
		}
		return false;
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
	
	public static void battle (Scanner input, CommonEnemy enemy, Hero hero, int heroInitialAttack) {
		int currentEnemyBasicAttack = enemy.getBasicAttack();
		int currentHeroBasicAttack = hero.getBasicAttack();
		int currentHeroAbilityPower = hero.getAbilityPower();
		int choosenNumber = 0;
		boolean heroIsAlive = true;
		while (true) {
			System.out.println("Current round. How will you atack?");
			System.out.println(ANSI_GREEN + "1 - Use basic attack" + ANSI_CYAN + " 2 - Use ability power"
			                 + ANSI_RESET);
			
			choosenNumber = Integer.parseInt(input.nextLine());
			
			//Our hero attacks
			switch (choosenNumber) {
			case 1: { //Our hero uses basic attack
				int currentHeroRandomBasicAttack = randInt(currentHeroBasicAttack - 20, currentHeroBasicAttack + 20);
				enemy.removeHP(currentHeroRandomBasicAttack);
				if (enemy.getHP() < 0) {
					enemy.setHP(0);
				}
				System.out.printf(ANSI_GREEN +"%1$s " + ANSI_RESET + "hitted the " + ANSI_RED + "%2$s" 
				+ ANSI_RESET + " for " + ANSI_GREEN + "%3$d damage." + ANSI_RESET + ANSI_RED + " %2$s" 
				+ ANSI_RESET + " has" + ANSI_RED + " %4$d HP" +ANSI_RESET + " left.%n", 
								 hero.getName(), enemy.getName(), currentHeroRandomBasicAttack, 
						         enemy.getHP());
			}
			break;
			case 2: { //Our hero uses ability power
				if (currentHeroAbilityPower <= 0) {
					System.out.printf(ANSI_YELLOW + "%s doesn't have ability power left.%n" + ANSI_RESET, hero.getName());
					continue;
				}
				else {
					System.out.println("What ability do you want to use ?");
					System.out.println("1 - " + ANSI_CYAN + "Explain the theory of the economic history" + ANSI_RESET + 
							           " (uses"+ ANSI_CYAN + " 25 ability power " + ANSI_RESET + "and makes " 
							           + ANSI_CYAN + "100 damage"+ ANSI_RESET +").");
					System.out.println("2 - "+ ANSI_CYAN + "Summon finance monster" + ANSI_RESET + " (uses" + ANSI_CYAN + " 40 ability power " 
					+ ANSI_RESET + "and makes "+ ANSI_CYAN +"160 damage"+ ANSI_RESET + ").");
					choosenNumber = Integer.parseInt(input.nextLine());
					switch (choosenNumber) {
					case 1: {
						if (currentHeroAbilityPower >= 25) {
							enemy.removeHP(100);
							if (enemy.getHP() < 0) {
								enemy.setHP(0);
							}
							currentHeroAbilityPower -= 25;
							System.out.printf("You explained everything to the " + ANSI_RED +
								              "%s" + ANSI_RESET + ".%n", enemy.getName());
							System.out.printf("That ruined mentally the" + ANSI_RED + " %s" + ANSI_RESET 
									        + " and his HP dropped with " + ANSI_RED + "100" + ANSI_RESET + ".%n", 
									          enemy.getName());
							System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + 
									          " now has " + ANSI_RED + "%d HP" + ANSI_RESET + " left.%n", 
									          enemy.getName(), enemy.getHP());
						}
						else {
							System.out.printf(ANSI_YELLOW + "%s doesn't have enough ability power "
					                 + "to use this ability.%n" + ANSI_RESET, hero.getName());
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
							System.out.printf("That monster hitted the" + ANSI_RED + " %s" + ANSI_RESET + " and his HP dropped with " 
							+ ANSI_RED + "160" + ANSI_RESET + ".%n", enemy.getName());
							System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + " now has " + ANSI_RED +  "%d HP " + ANSI_RESET + "left.%n", enemy.getName(),
									           enemy.getHP());
						}
						else {
							System.out.printf(ANSI_YELLOW + "%s doesn't have enough ability power "
									                 + "to use this ability.%n" + ANSI_RESET, hero.getName());
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
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " finally killed that " + ANSI_RED + "%s" + ANSI_RESET + "!%n", hero.getName(), 
						          enemy.getName());
				int randomGold = randInt(50, 100);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " recieves " + ANSI_YELLOW + "%d gold" + ANSI_RESET + ".%n", hero.getName(), randomGold);
				hero.addGold(randomGold);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_GREEN + "%d HP" + ANSI_RESET + ", " + ANSI_CYAN + "%d ability power" + ANSI_RESET + " and" + ANSI_YELLOW + " %d gold" + ANSI_RESET + ".%n", hero.getName(), 
						          hero.getHP(), hero.getAbilityPower(), hero.getGold());
				break;
			}
			
			int currentEnemyRandomBasicAttack = randInt(currentEnemyBasicAttack - 20, currentEnemyBasicAttack + 20);
			
			//The enemy attacks
			hero.removeHP(currentEnemyRandomBasicAttack);
			if (hero.getHP() < 0) {
				hero.setHP(0);
			}
			System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + " hitted " + ANSI_GREEN + 
					"%s" + ANSI_RESET + " for " + ANSI_RED + "%d damage.%n" + ANSI_RESET, enemy.getName(), 
					          hero.getName(), currentEnemyRandomBasicAttack);
			System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_GREEN + "%d HP" + ANSI_RESET + " and " + ANSI_CYAN + "%d ability power left" + ANSI_RESET + ".%n", hero.getName(), 
			          hero.getHP(), currentHeroAbilityPower);
			if (hero.getHP() == 0) { //Hero is dead
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " is killed by the " + ANSI_RED + "%s" + ANSI_RESET + ".%n", hero.getName(), enemy.getName());
				slowPrint(ANSI_RED + "GAME OVER" + ANSI_RESET, 400);
				hero.resetHP();
				hero.resetAbilityPower();
				hero.setBasicAttack(heroInitialAttack);
				hero.setGold(0);
				heroIsAlive = false;
				break;
			}
		}	
		
		//Recharge if hp is lower than 50% (heroIsAlive)
		if (heroIsAlive && hero.getHP() < hero.GetMaxHP() / 2) {
			System.out.printf(ANSI_RED + "WARNING! HP LOW! " + ANSI_RESET + ANSI_GREEN + "%s" + ANSI_RESET + " has only " + ANSI_RED + "%d HP" + ANSI_RESET + " left.%n", hero.getName(),
							  hero.getHP());
			System.out.printf("Do you want to get " + ANSI_GREEN + "%1$s's HP" + ANSI_RESET + " recharched? It will cost " + ANSI_GREEN + "%1$s" + ANSI_RESET + ANSI_YELLOW +  " 150 gold" + ANSI_RESET + ".%n", hero.getName());
			System.out.printf("1 - " + ANSI_GREEN + "Yes" + ANSI_RESET + "; 2 - " + ANSI_RED + "No" + ANSI_RESET + ", " +  ANSI_GREEN + "%s" + ANSI_RESET + " is brave enough to fight without recharging.%n", 
							  hero.getName());
			choosenNumber = Integer.parseInt(input.nextLine());
			while (!(choosenNumber == 1 || choosenNumber == 2)) {
				System.out.println("Invalid choice. Try again.");
				System.out.printf("1 - " + ANSI_GREEN + "Yes" + ANSI_RESET + " 2 - " + ANSI_RED + "No" + ANSI_RESET + ", " +  ANSI_GREEN + "%s" + ANSI_RESET + " is brave enough to fight without recharging.%n", 
						  	      hero.getName());
				choosenNumber = Integer.parseInt(input.nextLine());
			}
			if (choosenNumber == 1) {
				if (hero.getGold() >= 150) {
					hero.removeGold(150);
					hero.resetHP();
					System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " now has " + ANSI_GREEN + "%d HP" + ANSI_RESET + ".%n", hero.getName(), hero.getHP());
					System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_YELLOW + "%d gold" + ANSI_RESET + " remaining.%n", hero.getName(), hero.getGold());
				}
				else {
					System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " doesn't have enough " + ANSI_YELLOW + "gold" + ANSI_RESET + "!%n", hero.getName());
				}			
		   }
			
		}
		
		//Recharge is ability power is lower than 50% (heroIsAlive)
		if (heroIsAlive && hero.getAbilityPower() < hero.getMaximumAbilityPower() / 2) {
			System.out.printf(ANSI_RED + "WARNING! Ability power LOW!" + ANSI_RESET + ANSI_GREEN + " %s" + ANSI_RESET + " has only " + ANSI_CYAN + "%d ability power" + ANSI_RESET + " left.%n", 
					          hero.getName(), hero.getAbilityPower());
			System.out.printf("Do you want to get " + ANSI_GREEN + "%1$s's" + ANSI_RESET + ANSI_CYAN + " ability power" + ANSI_RESET + " recharched? It will cost " + ANSI_GREEN + "%1$s" + ANSI_RESET + ANSI_YELLOW  + " 100 gold" + ANSI_RESET + ".%n", hero.getName());
			System.out.printf("1 - " + ANSI_GREEN + "Yes" + ANSI_RESET + "; 2 - " + ANSI_RED + "No" + ANSI_RESET + ", " +  ANSI_GREEN + "%s" + ANSI_RESET + " is brave enough to fight without recharging.%n", 
					  hero.getName());
	
			choosenNumber = Integer.parseInt(input.nextLine());
			while (!(choosenNumber == 1 || choosenNumber == 2)) {
				System.out.println("Invalid choice. Try again.");
				System.out.printf("1 - " + ANSI_GREEN + "Yes" + ANSI_RESET + " 2 - " + ANSI_RED + "No" + ANSI_RESET + ", " +  ANSI_GREEN + "%s" + ANSI_RESET + " is brave enough to fight without recharging.%n", 
						  	      hero.getName());
				choosenNumber = Integer.parseInt(input.nextLine());
			}
			if (choosenNumber == 1) {
				if (hero.getGold() >= 100) {
				hero.removeGold(100);			
				hero.resetAbilityPower();
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " now has " + ANSI_CYAN + "%d ability power" + ANSI_RESET + ".%n", hero.getName(), hero.getAbilityPower());
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_YELLOW + "%d gold" + ANSI_RESET + " remaining.%n", hero.getName(), hero.getGold());
				}
			}
			else {
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " doesn't have enough " + ANSI_YELLOW + "gold" + ANSI_RESET + "!%n", hero.getName());
			}
		}
	}
	
	public static void bossBattle (Scanner input, Boss rector, Hero hero, int heroInitialAttack) {
		int bossBasicAttack = rector.getBasicAttack();
		int bossSpecialAttack = rector.getSpecialAttack();
		int heroBasiAttack = hero.getBasicAttack();
		int heroAbilityPower = hero.getAbilityPower();
		int choosenNumber = 0;
		
		while (true) {
			System.out.println("Current round. How will you atack?");
			System.out.println(ANSI_GREEN + "1 - Use basic attack" + ANSI_CYAN + " 2 - Use ability power"
			                 + ANSI_RESET);
			
			choosenNumber = Integer.parseInt(input.nextLine());
			
			//Our hero attacks
			switch (choosenNumber) {
			case 1: { //Our hero uses basic attack
				int currentHeroRandomBasicAttack = randInt(heroBasiAttack - 20, heroBasiAttack + 20);
				rector.removeHP(currentHeroRandomBasicAttack);
				if (rector.getHealthPoints() < 0) {
					rector.setHealthPoints(0);;
				}
				System.out.printf(ANSI_GREEN +"%1$s " + ANSI_RESET + "hitted the " + ANSI_RED + "%2$s" 
				+ ANSI_RESET + " for " + ANSI_GREEN + "%3$d damage." + ANSI_RESET + ANSI_RED + " %2$s" 
				+ ANSI_RESET + " has" + ANSI_RED + " %4$d HP" + ANSI_RESET + " left.%n", 
								 hero.getName(), rector.getName(), currentHeroRandomBasicAttack, 
								 rector.getHealthPoints());
			}
			break;
			case 2: { //Our hero uses ability power
				if (heroAbilityPower <= 0) {
					System.out.printf(ANSI_YELLOW + "%s doesn't have ability power left.%n" + ANSI_RESET, hero.getName());
					continue;
				}
				else {
					System.out.println("What ability do you want to use ?");
					System.out.println("1 - " + ANSI_CYAN + "Explain the theory of the economic history" + ANSI_RESET + 
							           " (uses"+ ANSI_CYAN + " 25 ability power " + ANSI_RESET + "and makes " 
							           + ANSI_CYAN + "100 damage"+ ANSI_RESET +").");
					System.out.println("2 - "+ ANSI_CYAN + "Summon finance monster" + ANSI_RESET + " (uses" + ANSI_CYAN + " 40 ability power " 
					+ ANSI_RESET + "and makes "+ ANSI_CYAN +"160 damage"+ ANSI_RESET + ").");
					choosenNumber = Integer.parseInt(input.nextLine());
					switch (choosenNumber) {
					case 1: {
						if (heroAbilityPower >= 25) {
							rector.removeHP(100);;
							if (rector.getHealthPoints() < 0) {
								rector.setHealthPoints(0);;
							}
							heroAbilityPower -= 25;
							System.out.printf("You explained everything to the " + ANSI_RED +
								              "%s" + ANSI_RESET + ".%n", rector.getName());
							System.out.printf("That ruined mentally the" + ANSI_RED + " %s" + ANSI_RESET 
									        + " and his HP dropped with " + ANSI_RED + "100" + ANSI_RESET + ".%n", 
									        rector.getName());
							System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + 
									          " now has " + ANSI_RED + "%d HP" + ANSI_RESET + " left.%n", 
									          rector.getName(), rector.getHealthPoints());
						}
						else {
							System.out.printf(ANSI_YELLOW + "%s doesn't have enough ability power "
					                 + "to use this ability.%n" + ANSI_RESET, hero.getName());
							continue;
						}		
					}
					break;
					
					case 2: {
						if (heroAbilityPower >= 40) {
							rector.removeHP(160);
							if (rector.getHealthPoints() < 0) {
								rector.setHealthPoints(0);
							}
							heroAbilityPower -= 40;
							System.out.println("You have summoned the finance monster.");
							System.out.printf("That monster hitted the" + ANSI_RED + " %s" + ANSI_RESET + " and his HP dropped with " 
							+ ANSI_RED + "160" + ANSI_RESET + ".%n", rector.getName());
							System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + " now has " + ANSI_RED +  "%d HP " + ANSI_RESET + "left.%n", rector.getName(),
									rector.getHealthPoints());
						}
						else {
							System.out.printf(ANSI_YELLOW + "%s doesn't have enough ability power "
									                 + "to use this ability.%n" + ANSI_RESET, hero.getName());
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
			
			if (rector.getHealthPoints() == 0) { //The boss is killed
				hero.setAbilityPower(heroAbilityPower);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " finally killed that " + ANSI_RED + "%s" + ANSI_RESET + "!%n", hero.getName(), 
						         rector.getName());
				int randomGold = randInt(50, 100);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " recieves " + ANSI_YELLOW + "%d gold" + ANSI_RESET + ".%n", hero.getName(), randomGold);
				hero.addGold(randomGold);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_GREEN + "%d HP" + ANSI_RESET + ", " + ANSI_CYAN + "%d ability power" + ANSI_RESET + " and" + ANSI_YELLOW + " %d gold" + ANSI_RESET + ".%n", hero.getName(), 
						          hero.getHP(), hero.getAbilityPower(), hero.getGold());
				System.out.println(ANSI_YELLOW + "CONGRATUALTIONS. You have successfuly complete the level." + ANSI_RESET);
				hero.resetHP();
				hero.resetAbilityPower();
				hero.setBasicAttack(heroInitialAttack);
				hero.setGold(0);
				break;
			}
			
			int bossRandomSpecialAttack = randInt(bossSpecialAttack - 20, bossSpecialAttack + 20);
			int bossRandomBasicAttack = randInt(bossBasicAttack - 20, bossBasicAttack + 20);
			
			int basicOrSpecialNumber = randInt(1, 100);
			
			if (basicOrSpecialNumber <= 50) {
				//The enemy attacks with Basic Attack
				hero.removeHP(bossRandomBasicAttack);
				if (hero.getHP() < 0) {
					hero.setHP(0);
				}
				System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + " hitted " + ANSI_GREEN + 
						"%s" + ANSI_RESET + " with Basic Attack for " + ANSI_RED + "%d damage.%n" + ANSI_RESET, rector.getName(), 
						          hero.getName(), bossRandomBasicAttack);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_GREEN + "%d HP" + ANSI_RESET + " and " + ANSI_CYAN + "%d ability power left" + ANSI_RESET + ".%n", hero.getName(), 
				          hero.getHP(), heroAbilityPower);
			}
			else {
				//The enemy attacks with Special Attack
				hero.removeHP(bossRandomSpecialAttack);
				if (hero.getHP() < 0) {
					hero.setHP(0);
				}
				System.out.printf("The " + ANSI_RED + "%s" + ANSI_RESET + " hitted " + ANSI_GREEN + 
						"%s" + ANSI_RESET + " with Special Attack" + " for " + ANSI_RED + "%d damage.%n" + ANSI_RESET, rector.getName(), 
						          hero.getName(), bossRandomSpecialAttack);
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " has " + ANSI_GREEN + "%d HP" + ANSI_RESET + " and " + ANSI_CYAN + "%d ability power left" + ANSI_RESET + ".%n", hero.getName(), 
				          hero.getHP(), heroAbilityPower);
			}			
			
			if (hero.getHP() == 0) { //Hero is dead
				System.out.printf(ANSI_GREEN + "%s" + ANSI_RESET + " is killed by the " + ANSI_RED + "%s" + ANSI_RESET + ".%n", hero.getName(), rector.getName());
				slowPrint(ANSI_RED + "GAME OVER" + ANSI_RESET, 400);
				hero.resetHP();
				hero.resetAbilityPower();
				hero.setBasicAttack(heroInitialAttack);
				hero.setGold(0);
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