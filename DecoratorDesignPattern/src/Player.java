/**
 * Describes the general shape of each player object
 * @author nylesgeiger
 */
public abstract class Player {
	
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * Each player will display their name
	 */
	public String toString() {
		return ": " + this.name;
	};
	
	/**
	 * calculates the power of a player based on their attributes
	 * @return
	 * a double value
	 */
	public double getPower() {
		return this.attack * (double)3 + this.defense + this.intellect / 2;
	};
}
