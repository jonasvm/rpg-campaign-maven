package rpg.campaign.maven.campaign;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import rpg.campaign.maven.character.NonPlayableCharacter;
import rpg.campaign.maven.user.DungeonMaster;
import rpg.campaign.maven.user.Player;

/**
 * 
 * The Class Campaign represents a campaign. The campaign contains a name, a
 * dungeon master, a list of players and a list of non playable characters. The
 * campaign is the association of all elements necessary to start a game. The
 * responsibility of this class is to hold the updated list of characters and
 * non playable characters, that are the references to update the characters and
 * non playable characters statistics.
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public class Campaign {

	private String campaignName;
	private DungeonMaster dungeonMaster;
	private List<NonPlayableCharacter> nonPlayableCharacterList = new ArrayList<NonPlayableCharacter>();
	private List<Player> playerList = new ArrayList<Player>();

	/**
	 * This is the class constructor. It is responsible to initialize variables name
	 * and dungeon master when a campaign is created.
	 * 
	 * @param dungeonMaster DungeonMaster
	 * @param campaignName  String
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public Campaign(DungeonMaster dungeonMaster, String campaignName) {
		this.campaignName = campaignName;
		this.dungeonMaster = dungeonMaster;
	}

	/**
	 * Method getName(). Responsible to get campaign's name.
	 * 
	 * @return String campaignName
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public String getName() {
		return campaignName;
	}

	/**
	 * Method getDungeonMaster(). Responsible to get campaign's dungeon master.
	 * 
	 * @return DungeonMaster dungeonMaster
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public DungeonMaster getDungeonMaster() {
		return dungeonMaster;
	}

	/**
	 * Methodget PlayerList(). Responsible to get campaign's player list.
	 * 
	 * @return List Player
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public List<Player> getPlayerList() {
		return playerList;
	}

	/**
	 * Method getNonPlayableCharacterList(). Responsible to get campaign's non
	 * playable character list.
	 * 
	 * @return List NonPlayableCharacter
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public List<NonPlayableCharacter> getNonPlayableCharacterList() {
		return nonPlayableCharacterList;
	}

	/**
	 * Method populateNpcList(). Responsible to populate campaign's non playable
	 * character list.
	 * 
	 * @param name          String
	 * @param points        int
	 * @param strength      int
	 * @param dexterity     int
	 * @param endurance     int
	 * @param armor         int
	 * @param firePower     int
	 * @param level         int
	 * @param hitPoints     int
	 * @param magicPoints   int
	 * @param advantages    Set<String>
	 * @param disadvantages Set<String>
	 * @param damageTypes   Set<String>
	 * @param knownSpells   Set<String>
	 * @param moneyAndItems Set<String>
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void populateNpcList(String characterName, int points, int strength, int dexterity, int endurance, int armor,
			int firepower, int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		nonPlayableCharacterList.add(
				new NonPlayableCharacter(characterName, points, strength, dexterity, endurance, armor, firepower, level,
						hitPoints, magicPoints, advantages, disadvantages, damageTypes, knownSpells, moneyAndItems));

	}

	/**
	 * Method populatePlayerList(). Responsible to populate campaign's player list.
	 * 
	 * @param player Player
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void populatePlayerList(Player player) {
		playerList.add(player);
	}

}

