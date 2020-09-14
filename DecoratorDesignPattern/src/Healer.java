/**
 * describes the attributes of a healer
 * @author nylesgeiger
 *
 */
public class Healer extends Player{
	
	/**
	 * creates a healer player and sets their attributes 
	 * along with assigning this instance with a given name
	 * @param name
	 * the name associated with each instance of a healer player
	 */
	public Healer (String name) {
		this.name = name;
		this.attack = 3;
		this.intellect = 7;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor  = "Robe";
		
	}
	
	/**
	 * Describes the information each healer player will display
	 */
	public String toString() {
		return "Mage" + super.toString() + "\nCarries a " + this.weapon 
				+ " and wears a " + this.armor;
	}

}
