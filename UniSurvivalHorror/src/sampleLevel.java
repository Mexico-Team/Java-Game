import java.util.Scanner;


public class sampleLevel {
	public static void Execute(Hero player){
		Scanner input = new Scanner(System.in);
		System.out.println("test1");
		Hero hero = player;
		//First Fight
		System.out.println(hero.getName());
		System.out.println(hero.getBasicAttack());
		//read
		/*switch (key) {
		case value:
			
			break;

		default:
			break;
		}*/
		hero.setBasicAttack(10000);
		System.out.println(hero.getBasicAttack());
		System.out.println(hero.getName());
		//Event
		CommonEnemy zombie = new CommonEnemy("Radzi", 150, 1);
		System.out.println("what to do");
		//read;
		/*switch (key) {
		case value:
		//for
			if(zombie.getHP == 0) {
			 break;
			}
			break;

		default:
			break;
		}*/
		//event
	}
}
