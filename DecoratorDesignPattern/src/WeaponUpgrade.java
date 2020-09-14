/**
 * Class defines how an weapon upgrade effects a player
 * @author nylesgeiger
 *
 */
public class WeaponUpgrade extends PlayerDecorator{
	
	private Player player;
	
	/**
	 * creates an weapon upgrade object
	 * @param player
	 * a player object who is receiving the weapon upgrade
	 */
	public WeaponUpgrade (Player player) {
		this.player = player;
	}

	/**
	 * prints the string associated with the player
	 * object and the weapon upgrade
	 */
	public String toString() {
		return player.toString() + super.toString() + "Upgraded weapon";
	}
		
	/**
	 * returns the power of a player after receiving an armor upgrade
	 */
	public double getPower() {
		return player.getPower() + 5;
	}
}
