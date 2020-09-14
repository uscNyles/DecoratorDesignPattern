/**
 * Class defines how an Skill decoration effects a player
 * @author nylesgeiger
 *
 */
public class Skill extends PlayerDecorator{

	private Player player;
	
	/**
	 * creates an Skill object
	 * @param player
	 * a player object who is receiving the Skill decoration
	 */
	public Skill (Player player) {
		this.player = player;
	}

	/**
	 * prints the string associated with the player
	 * object and the Skill 
	 */
	public String toString() {
		return player.toString() + super.toString() + "Gained a skill";
	}
		
	/**
	 * returns the power of a player after receiving an Skill 
	 * decoration
	 */
	public double getPower() {
		return player.getPower() + 2;
	}
}
