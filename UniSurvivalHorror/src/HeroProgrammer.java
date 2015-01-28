
public class HeroProgrammer {
	private String name;
	private int healthPoints = 1000;
	private int basicAttack = 100;
	private int abilityPower = 100;

	//Constructor
	public HeroProgrammer(String name){
		this.name = name;
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

	public int getAbilityPower() {
		return abilityPower;
	}

	public void setAbilityPower(int abilityPower) {
		this.abilityPower = abilityPower;
	}
	
	
}
