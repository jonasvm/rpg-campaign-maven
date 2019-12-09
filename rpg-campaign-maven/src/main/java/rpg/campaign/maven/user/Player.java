package rpg.campaign.maven.user;

import java.util.Set;

import rpg.campaign.maven.character.PlayableCharacter;

/**
 * 
 * The Class Player extends the class User and represents a player. The player
 * have a name and a character. The player is associated with a campaign.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public class Player extends User {

	private PlayableCharacter character;

	/**
	 * This is the class constructor. It only invokes the super constructor.
	 * 
	 * @param name String
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 * 
	 */
	public Player(String username, String email, String password) {
		super(username, email, password);
	}

	/**
	 * Method getCharacter(). Responsible to get an object character that is owned
	 * by a player.
	 * 
	 * @return Character character
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public PlayableCharacter getCharacter() {
		return character;
	}

	/**
	 * Method createCharacter(). Responsible to create an object character that is
	 * owned by a player.
	 * 
	 * @param name              String
	 * @param points            int
	 * @param strength          int
	 * @param dexterity         int
	 * @param endurance         int
	 * @param armor             int
	 * @param firePower         int
	 * @param level             int
	 * @param hitPoints         int
	 * @param magicPoints       int
	 * @param advantages        Set<String>
	 * @param disadvantages     Set<String>
	 * @param damageTypes       Set<String>
	 * @param knownSpells       Set<String>
	 * @param moneyAndItems     Set<String>
	 * 
	 * @return Character character
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public Player createCharacter(String characterName, int points, int strength, int dexterity, int endurance,
			int armor, int firepower, int level, int hitPoints, int magicPoints, Set<String> advantages,
			Set<String> disadvantages, Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		this.character = new PlayableCharacter(characterName, points, strength, dexterity, endurance, armor, firepower,
				level, hitPoints, magicPoints, advantages, disadvantages, damageTypes, knownSpells, moneyAndItems);

		return this;
	}

}

