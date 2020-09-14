/**
 * describes the attributes of a Mage
 * @author nylesgeiger
 *
 */
public class Mage extends Player{

	/**
	 * creates a Mage player and sets their attributes 
	 * along with assigning this instance with a given name
	 * @param name
	 * the name associated with each instance of a Mage player
	 */
	public Mage (String name) {
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
