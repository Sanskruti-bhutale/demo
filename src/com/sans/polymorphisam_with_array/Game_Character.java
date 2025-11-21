package game_character_management_system;

public class Game_Character {

	public static void main(String[] args) {
		Character c1=new Character("Arjun",5,1500,"Sword");
		Hero h1=new Hero("Riya",8,2500,"Bow","Fire Arrows");
		Character.showGameRules();
		c1.displayStats();
		c1.attack();
		h1.displayStats();
		h1.attack();
		h1.showSpecialReward();

	}

}
