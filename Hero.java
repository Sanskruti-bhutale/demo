package game_character_management_system;

public class Hero extends Character {
	private String specialPower;
	public Hero(String name, int level, double health, String weaponType,String specialPower) {
		super(name,level,health,weaponType);
		this.specialPower=specialPower;
		
	}
	@Override
	public void displayStats() {
		System.out.println("Hero Details : ");
		System.out.println("Name : "+getName());
		System.out.println("Levelv : "+getLevel());
		System.out.println("Health : "+getHealth());
		System.out.println("Weapon : "+getWeaponType());
		System.out.println("Special Power :"+specialPower);
		
	}
	

}
