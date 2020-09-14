/**
 * Describes the general shape of a PlayerDecorator object
 * @author nylesgeiger
 *
 */
public abstract class PlayerDecorator extends Player{
	
	/**
	 * each PlayerDecorator object will have addtional
	 *  information to display apart from the player's information
	 */
	@Override
	public String toString() {
		return "\n";
	}
	
	
}
