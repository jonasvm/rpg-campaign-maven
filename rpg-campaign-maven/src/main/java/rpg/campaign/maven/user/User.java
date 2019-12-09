package rpg.campaign.maven.user;

/**
 * 
 * The Abstract Class User represents a user. The user contains a user name, an
 * email and a password.
 * 
 * A user might be of two types: Player or Dungeon Master. The Player is a User
 * that have a character and cannot interact with campaign. The Dungeon Master
 * is a user that have a campaign and is able to change every campaign detail.
 * 
 * The class User is also responsible to verify if the user is authenticated,
 * change user's email and change user's password.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public abstract class User {

	private String username;
	private String email;
	private String password;

	/**
	 * This is the class constructor. It is responsible to initialize variables user
	 * name, email and password when a user is created.
	 * 
	 * @param username String
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	/**
	 * Method getUserName(). Responsible to get user's name.
	 * 
	 * @return String name
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public String getUserName() {
		return username;
	}

	/**
	 * Method getEmail(). Responsible to get user's email.
	 * 
	 * @return String email
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Method getPassword(). Responsible to get user's password.
	 * 
	 * @return String password
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Method changeEmail(). Responsible to change user's email.
	 * 
	 * @param email    String
	 * @param newEmail String
	 * 
	 * @return boolean
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public boolean changeEmail(String email, String newEmail) {
		if (this.getEmail().equals(email)) {
			this.email = newEmail;
			return true;
		}
		return false;
	}

	/**
	 * Method isAuthenticated(). Responsible to check if user has access to the
	 * game.
	 * 
	 * @param password String
	 * 
	 * @return boolean
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public boolean isAuthenticated(String password) {
		return this.password.equals(password) ? true : false;
	}

	/**
	 * Method changePassword(). Responsible to change user's password.
	 * 
	 * @param password    String
	 * @param newPassword String
	 * 
	 * @return boolean
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public boolean changePassword(String password, String newPassword) {
		if (this.password.equals(password)) {
			this.password = newPassword;
			return true;
		}
		return false;
	}

}

