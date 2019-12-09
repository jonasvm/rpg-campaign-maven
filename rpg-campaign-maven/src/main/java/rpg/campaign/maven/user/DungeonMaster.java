package rpg.campaign.maven.user;

/**
 * 
 * The Class Dungeon Master extends the class User and represents a dungeon
 * master. The dungeon master contains a name and is associated with a campaign.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public class DungeonMaster extends User {

	/**
	 * This is the class constructor. It is responsible to initialize variable name
	 * when a dungeon master is created.
	 * 
	 * @param name String
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public DungeonMaster(String username, String email, String password) {
		super(username, email, password);
	}

}
