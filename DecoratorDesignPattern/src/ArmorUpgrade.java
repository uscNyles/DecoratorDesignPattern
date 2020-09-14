/**
 * Class defines how an armor upgrade effects a player
 * @author nylesgeiger
 *
 */
public class ArmorUpgrade extends PlayerDecorator{
	
	private Player player;
	
	/**
	 * creates an Armor upgrade object
	 * @param player
	 * a player object who is receiving the armor upgrade
	 */
	public ArmorUpgrade (Player player) {
		this.player = player;
	}

	/**
	 * prints the string associated with the player
	 * object and the armor upgrade
	 */
	public String toString() {
		return player.toString() + super.toString() + "Upgraded armor";
	}
		
	/**
	 * returns the power of a player after receiving an armor upgrade
	 */
	public double getPower() {
		return player.getPower() + 3;
	}
}
