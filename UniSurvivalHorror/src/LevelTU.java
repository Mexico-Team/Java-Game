import java.util.Scanner;
public class LevelTU {

	public static void Execute(Hero player){
		Scanner input=new Scanner(System.in);
		
		Hero hero = player;
		System.out.println("Congradulations,you choosed poorly!");
		System.out.println("Surviving the TU joy ride will be impos....not likely...");
		System.out.println(hero.getName()+" starts with 1000hp,100 attack and 100 ability power");
		System.out.println("You are faced with 2 choices,to begin your horrible journey:");
		System.out.println("Choose between starting at section 1 or section 2 of TU,by typing 1 or 2");
		
		String choice1=input.nextLine();
		//region choice1S
		
		switch(choice1){
		case "1":
			System.out.println("Section 1,the enterance:");
			hero.setHP(900);
			System.out.println("Immediately a zombifed batka bites your leg and you loose 100hp!");
			System.out.println("You are faced with a choice to kill the bad zombie batka with your "
					+ " basic attack or use 30 ability power to smite him down");
			System.out.println("Type 1 to use basic attack or type 2 for ability");
			String choice21=input.nextLine();
			switch(choice21){
			//region choice2c1
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
					System.out.println("Your basic attack instantly blows up the obesed monster "
							+ "in a gushy fontain of gore!Excellent choice!");
					System.out.println("You are almost to the safe room now");
					System.out.println("And than just as you are about to enter boss Nakov drops"
							+ " from above(like a boss),does 600 dmg,you split in half and die");
					System.out.println("Atleast you did not die in vain "+hero.getName()+""
							+ " you did managed to take out baba de6ka..which is nice I guess");
					
					break;
					//endregion choice2c1
				case"2":
					System.out.println("The vile creature shows no vulnerability to your "
							+ " powerfull abilities and it completely devours you!");
					
					System.out.println("You die in a brutal agonizing way,game over man,GAME OVER!");
					break;
				default:
					System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
					break;
				}
				break;
			case"2":
				System.out.println("The batka is quickly defeated,you take his addidas armor "
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
							+ " in a gushy fontain of gore!Excellent choice!");
					System.out.println("You are almost to the safe room now");
					System.out.println("And than just as you are about to enter boss Nakov drops "
							+ "from above(like a boss),does 600 dmg and "
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
								+ " I AM DEATH!");
						System.out.println("As boss Nakov is devouring your soul,"
								+ " you wish you died earlier");
						break;
					case "2":
						System.out.println("kame...kame..kamEEE...KHAAAAAAAAAAAAA!!!!");
						System.out.println("You blast lord Nakov with everything you got "
								+ "and you manage to melt his skin");
						System.out.println("But underneath the melted flesh you see lord Nakov's "
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
			System.out.println("You are now faced with a choice of either going towards "
					+ " the math cabinet(1),the toilets(2) or the computer room(3)");
			String choice22=input.nextLine();
			switch(choice22){
			case "1":
				System.out.println("You head towards the math cabinet and you see a sign saying:");
				System.out.println("This is baba de6ka's lair!");
				System.out.println("Before you continue heading down the hallway "
						+ " ,covered in organic creep,you are faced with a choice what weapons to take.");
				System.out.println("You can choose between a bomb(1) and a flamethrower(2)");
				String choice321=input.nextLine();
				switch(choice321){
				case "1":
					System.out.println("You picked up the bomb and went down the creepy hallway");
					System.out.println("You are now surrounded by baba de6ka's unhatched eggs "
							+ "you must be very silent and carefull not to wake the buggers up.");
					System.out.println("One of the eggs is starting to hatch right next to you!");
					System.out.println("Do you keep walking(1) or do you look at the egg(2)");
					String choice4321=input.nextLine();
					switch(choice4321){
					case "1":
						System.out.println("You get past the egg and you are almost to the safe room.");
						System.out.println("But suddenly baba de6ka unburrows from the ground,zerg style, "
								+ "and starts rolling towards you,like a baneling");
						System.out.println("You throw the bomb at her and you blow up everything "
								+ "including yourself!");
						System.out.println("You are dead now "+hero.getName()
								+ " but atleast you killed the nasty baba de6ka and stoped "
								+ "her unholy infestation,which is nice I guess...");
								
						break;
					case "2":
						System.out.println("The egg hatches and a little baba de6ling jumps on your face!");
						System.out.println("Game over man,GAME OVER!");
						break;
					default:
						System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
						break;
					}
					break;
				case "2":
					System.out.println("You picked up the flamethrower and went down the creepy hallway.");
					System.out.println("You are now surrounded by baba de6ka's unhatched eggs "
							+ "you must be very silent and carefull not to wake the buggers up.");
					System.out.println("One of the eggs is starting to hatch right next to you!");
					System.out.println("Do you keep walking(1) or do you look at the egg(2)");
					String choice4322=input.nextLine();
					switch(choice4322){
					case "1":
						System.out.println("You get past the egg and you are almost to the safe room.");
						System.out.println("But suddenly baba de6ka unburrows from the ground,zerg style, "
								+ "and starts rolling towards you,like a baneling");
						System.out.println("You pull out your flame thrower and set everything on fire!");
						System.out.println("Sadly the chubby beast survives your flames and cries out:");
						System.out.println("You killed my children,I will have your soul for this "+hero.getName());
						System.out.println("You suffer a fate much worse than death as baba de6ka devours you!");
						break;
					case"2":
						System.out.println("The egg hatches and a little baba de6ling jumps on your face!");
						System.out.println("Game over man,GAME OVER!");
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
				System.out.println("You head towards the toilets and open the toilets door");
				System.out.println("A dense green mist quickly surround you!");
				System.out.println("You start gasping for air butt the smell is just too strong");
				System.out.println("You die a slow agonizing death "+hero.getName());
				break;
			case "3":
				System.out.println("You safely reached the computer room");
				System.out.println("As you open the door,Oleg the zombified 90y old coder charges at you"
						+ " ,grabs you,and pushes you against the wall ");
				System.out.println("He starts to speak in your face and in the proccess wets your face with "
						+ "his disgusting juices:");
				System.out.println("Riddle me this "+hero.getName()+" how does a true coder code?");
				System.out.println("Does he writes the code on paper(1) or on a computer(2)?");
				String choice323=input.nextLine();
				switch(choice323){
				case "1":
					System.out.println("You write code on paper,very well,you are a true coder "
							+ "of the TU clan");
					System.out.println("I shall ask one more question of you and if you answer "
							+ "corrently I will let you go");
					System.out.println("How much is 1+1?");
					String choice4323=input.nextLine();
					switch(choice4323){
					case "SourceCodeMagic":
						System.out.println("You cheated "+hero.getName()+"! You really are a student of TU!");
						System.out.println("Remember when I told you I was going to let you go?");
						System.out.println("You look at the old zombie coder and say yes with a "
								+ " trembling voice");
						System.out.println("Oleg stares at you and says:I LIED!!!");
						System.out.println("He than drags you to his lair where he tortures "
								+ " you for days before you die.");
						break;
					default:
						System.out.println("WRONG!");
						System.out.println("Oleg rips out your heart and you die");
						break;
					}
					break;
				case "2":
					System.out.println("You write code on a computer,are you retarded!");
					System.out.println("You are obviously not a student of TU!");
					System.out.println("Oleg rips out your spine and you are now dead "+hero.getName());
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
		default:
			System.out.println("English DO U SPEAK IT?!Type 1 or 2!");
			break;
		}
		//endregion choice1S

}
}
