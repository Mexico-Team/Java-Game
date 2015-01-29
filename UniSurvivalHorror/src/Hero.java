
public class Hero {
	private String name;
	private int maximumHealthPoints;
	private int healthPoints;
	private int basicAttack;
	private int abilityPower;

	//Constructor
	public Hero(String name, int HP, int basicAttack, int abilityPower){
		this.name = name;
		this.maximumHealthPoints = HP;
		this.healthPoints = HP;
		this.basicAttack = basicAttack;
		this.abilityPower = abilityPower;
	}
	
	//Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int GetMaxHP() {
		return maximumHealthPoints;
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

	public int getAbilityPower() {
		return abilityPower;
	}

	public void setAbilityPower(int abilityPower) {
		this.abilityPower = abilityPower;
	}
	
}
