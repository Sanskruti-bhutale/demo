package game_character_management_system;

public class Character {
	private String name;
	private int level;
	private double health;
	static final String gameName="Legeds of Valor";
	private String weaponType;
	
	static {
		System.out.println("Welcome to the Legends of Valor Game!")	;
		}
	{
		System.out.println("A new character is being created...");
	}
	public Character(String name, int level, double health, String weaponType) {
		super();
		this.name = name;
		this.level = level;
		this.health = health;
		this.weaponType = weaponType;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public static String getGamename() {
		return gameName;
	}

	public static void showGameRules() {
		System.out.println("\nGame Rules: Fight bravely, protect your allies, and never give up!\\n");
	}
	public void attack() {
		System.out.println("\n"+this.name+" attacks with "+getWeaponType()+"!\n");
	}
	public void displayStats() {
		System.out.println("\r\n"
				+ "Character Details : ");
		System.out.println("Name : "+getName());
		System.out.println("Levelv : "+getLevel());
		System.out.println("Health : "+getHealth());
		System.out.println("Weapon : "+getWeaponType());
	}
	public final void  showSpecialReward() {
		System.out.println("Special reward: +100 bonus health for completing quests.");
		
	}
}
