/**
 * describes the attributes of a healer
 * @author nylesgeiger
 */
public class Warrior extends Player{
	
	/**
	 * creates a warrior player and sets their attributes 
	 * along with assigning this instance with a given name
	 * @param name
	 * the name associated with each instance of a warrior player
	 */
	public Warrior (String name) {
		this.name = name;
		this.attack = 8;
		this.intellect = 2;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor  = "Breast Plate";
	}
	
	/**
	 * Describes the information each Warrior player will display
	 */
	public String toString() {
		return "Warrior" +super.toString() + "\nCarries a " + this.weapon 
				+ " and wears a " + this.armor;
	}
	
}
