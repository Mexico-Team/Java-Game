import java.util.Scanner;
public class LevelTU {

	public static void Execute(Hero player){
		Scanner input=new Scanner(System.in);
		
		Hero hero = player;
		System.out.println("Cogradilations,you choosed poorly!");
		System.out.println("Surviving the TU joy ride will be impos....not likely...");
		System.out.println(hero.getName()+" stars with 1000hp,100 attack and 100 ability power");
		System.out.println("You are faced with 2 choices,to begin your horrible journey:");
		System.out.println("Choose between starting at section 1 or section 2 of TU,by typing 1 or 2");
		
		String choice1=input.nextLine();
		switch(choice1){
		case "1":
			System.out.println("Section 1,the enterance:");
			hero.setHP(900);
			System.out.println("Immediately a zombifed batka bites your leg and you loose 100hp!");
			System.out.println("You are faced with a choice to kill the bad zombie batka with your "
					+ "basic attack or use 30 ability power to smite him down");
			System.out.println("Type 1 to use basic attack or type 2 for ability");
			String choice21=input.nextLine();
			switch(choice21){
			case "1":
				System.out.println("The batka has durable addidas armor allowing him "
						+ "to tank several of your hits and you loose 300hp");
				hero.setHP(600);
				System.out.println("You see a safe room near by and rush towards it.");
				System.out.println("Than suddenly you get attacked by baba de6ka!");
				System.out.println("You are again faced with the choice of using basic attack "
						+ "or 50 ability points to defeat the chubby beast");
				System.out.println("Type 1 to use basic attack or type 2 for ability");
				String choice31=input.nextLine();
				switch(choice31){
				case "1":
					System.out.println("Your basic attack instantly blows up the obesed monster"
							+ "in a gushy fontain of gore!Excellent choice!");
					System.out.println("You are almost to the safe room now");
					System.out.println("And than just as you are about to enter boss Nakov drops"
							+ "from above(like a boss),does 600 dmg,you split in half and die");
					System.out.println("Atleast you did not die in vain "+hero.getName()+""
							+ " you did managed to take out baba de6ka..which is nice I guess");
					
					break;
				case"2":
					System.out.println("The vile creature shows no vulnerability to your"
							+ " powerfull abilities and it completely devours you!");
					
					System.out.println("You die in a brutal agonizing way,game over man,GAME OVER!");
					break;
				default:
					System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
					break;
				}
				break;
			case"2":
				System.out.println("The batka is quickly defeated,you take his addidas armor"
						+ " and your hp is back to 1000");
				hero.setHP(1000);	
				System.out.println("You see a safe room near by and rush towards it.");
				System.out.println("Than suddenly you get attacked by baba de6ka!");
				System.out.println("You are again faced with the choice of using basic attack "
						+ "or 50 ability points to defeat the chubby beast");
				System.out.println("Type 1 to use basic attack or type 2 for ability");
				String choice32=input.nextLine();
				switch(choice32){
				case"1":
					System.out.println("Your basic attack instantly blows up the obesed monster"
							+ "in a gushy fontain of gore!Excellent choice!");
					System.out.println("You are almost to the safe room now");
					System.out.println("And than just as you are about to enter boss Nakov drops"
							+ "from above(like a boss),does 600 dmg and"
							+ "leaves you gasping for air");
					System.out.println("You gather all your ability power and decide to give him "
							+ "your best shot!");
					System.out.println("Choose what type of special attack do you use against "
							+ "boss Nakov,press 1 for ice attack and 2 for chi attack");
					String choice41=input.nextLine();
					switch(choice41){
					case "1":
						System.out.println("Lord Nakov breaks through your ice attack and rips "
								+ "out your heart");
						System.out.println("You fool,have you never heard I have ice blood, "
								+ "I am the the very thing students fear,I am the one who knocks, "
								+ "I AM DEATH!");
						System.out.println("As boss Nakov is devouring your soul,"
								+ "you wish you died earlier");
						break;
					case "2":
						System.out.println("kame...kame..kamEEE...KHAAAAAAAAAAAAA!!!!");
						System.out.println("You blast lord Nakov with everything you got "
								+ "and you manage to melt his skin");
						System.out.println("But underneath the melted flesh you see lord Nakov's"
								+ " metal endoskeleton(with the logo of oracle on it)");
						System.out.println("His red eyes stare at you and he slowly starts to wiggle your way.");
						System.out.println("If you want to find out what happens next you need to get the "
								+ "awesome totaly non generic ending DLC,only for 999,9$! ");
						break;
						
					default:
						System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
						break;
					}
					break;
				case"2":
					System.out.println("The vile creature shows no vulnerability to your"
							+ " powerfull abilities and it completely devours you!");
					
					System.out.println("You die in a brutal agonizing way,game over man,GAME OVER!");
					break;
			
				default:
					System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
					break;
				}
				break;
			default:
				System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
				break;
				
			}
			break;
		case "2":
			System.out.println("Section 2,the enterance:");
			break;
		default:
			System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
			break;
		}

}
}
