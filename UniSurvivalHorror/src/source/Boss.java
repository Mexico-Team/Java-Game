package source;

public class Boss {
	private String name;
	private int healthPoints;
	private int basicAttack;
	private int specialAttack;
	
	//Constructor
	public Boss(String name, int HP, int basicAttack, int specialAttack){
		this.name = name;
		this.healthPoints = HP;
		this.basicAttack = basicAttack;
		this.specialAttack = specialAttack;
	}
	
	//Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getBasicAttack() {
		return basicAttack;
	}

	public void setBasicAttack(int basicAttack) {
		this.basicAttack = basicAttack;
	}

	public int getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}
	
	public boolean isDead() {
		if (this.healthPoints <= 0) {
			return true;
		}
		return false;
	}
	
	public void addHP(int value) {
		this.healthPoints += value;
	}
	
	public void removeHP(int value) {
		this.healthPoints -= value;
	}

}
