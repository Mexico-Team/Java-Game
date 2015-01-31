
public class CommonEnemy {
	private String name;
	private int healthPoints;
	private int basicAttack;
	
	//Constructors
	public CommonEnemy(String name, int hp, int basicAttack){
		this.name = name;
		this.healthPoints = hp;
		this.basicAttack = basicAttack;
	}
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHP() {
		return healthPoints;
	}
	public void setHP(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getBasicAttack() {
		return basicAttack;
	}
	public void setBasicAttack(int basicAttack) {
		this.basicAttack = basicAttack;
	}
	
	public void removeHP(int value) {
		setHP(getHP() - value);
	}
	
	public boolean isDead() {
		if (this.healthPoints <= 0) {
			return true;
		}
		return false;
	}
}
