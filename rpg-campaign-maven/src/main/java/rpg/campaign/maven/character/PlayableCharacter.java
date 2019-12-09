package rpg.campaign.maven.character;

import java.util.Set;

/**
 * 
 * The Class PlayableCharacter extends the class Character and represents a
 * character owned by a player. It is created and used by the Player, and
 * contains the implementation of super class constructor and abstract methods,
 * and also the methods to increase and decrease the experience points, that are
 * exclusive characteristics of playable character.
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public class PlayableCharacter extends Character {

	private int experiencePoints;
	private String backgroundHistory;

	/**
	 * This is the class constructor. It only invokes the super constructor.
	 * 
	 * @param name      String
	 * @param level     int
	 * @param hitPoints int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 * 
	 */
	public PlayableCharacter(String name, int points, int strength, int dexterity, int endurance, int armor,
			int firePower, int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {
		
		super(name, points, strength, dexterity, endurance, armor, firePower, level, hitPoints, magicPoints, advantages,
				disadvantages, damageTypes, knownSpells, moneyAndItems);

	}

	/**
	 * Method printSpreadsheat(). This is the implementation of abstract method of
	 * super class Character. It is responsible to show the playable character
	 * statistics.
	 * 
	 * @return String spreadsheat
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 * 
	 */
	public StringBuilder printSpreadsheat() {

		StringBuilder spreadsheat = new StringBuilder();
		spreadsheat.append("[ Character Spreadsheat ] " + " \n");
		spreadsheat.append("- Name: " + this.getName() + "\n");
		spreadsheat.append("- Points: " + this.getPoints() + "\n");
		spreadsheat.append("- Strength: " + this.getStrength() + "\n");
		spreadsheat.append("- Dexterity: " + this.getDexterity() + "\n");
		spreadsheat.append("- Endurance: " + this.getEndurance() + "\n");
		spreadsheat.append("- Armor: " + this.getArmor() + "\n");
		spreadsheat.append("- Fire Power: " + this.getFirePower() + "\n");
		spreadsheat.append("- Level: " + this.getLevel() + "\n");
		spreadsheat.append("- Hit Points: " + this.getHitPoints() + "\n");
		spreadsheat.append("- Magic Points: " + this.getMagicPoints() + "\n");
		spreadsheat.append("- Advantages: " + this.getAdvantages() + "\n");
		spreadsheat.append("- Disadvantages: " + this.getDisadvangates() + "\n");
		spreadsheat.append("- Damage Types: " + this.getDamageTypes() + "\n");
		spreadsheat.append("- Known Spells: " + this.getKnownSpells() + "\n");
		spreadsheat.append("- Money And Items: " + this.getMoneyAndItems() + "\n");
		spreadsheat.append("- Experience Points: " + this.getExperiencePoints() + "\n");
		spreadsheat.append("- Background History: " + this.getBackgroundHistory());

		return spreadsheat;
	}

	/**
	 * Method getExperiencePoints(). Responsible to get character's experience
	 * points.
	 * 
	 * @return int experiencePoints
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public int getExperiencePoints() {
		return experiencePoints;
	}

	/**
	 * Method increaseExperiencePoints(). Responsible to increase character's
	 * experience points.
	 * 
	 * @param experiencePointsToIncrease int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void increaseExperiencePoints(int experiencePointsToIncrease) {
		this.experiencePoints += experiencePointsToIncrease;
	}

	/**
	 * Method decreaseExperiencePoints(). Responsible to decrease character's
	 * experience points.
	 * 
	 * @param experiencePointsToDecrease int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void decreaseExperiencePoints(int experiencePointsToDecrease) {
		this.experiencePoints -= experiencePointsToDecrease;
	}

	/**
	 * Method getHistory(). Responsible to get character's history.
	 * 
	 * @return String history
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public String getBackgroundHistory() {
		return backgroundHistory;
	}
	
	/**
	 * Method setBackgroundHistory(). Responsible to set character's history.
	 * 
	 * @param backgroundHistory String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void setBackgroundHistory(String backgroundHistory) {
		this.backgroundHistory = backgroundHistory;
	}

}

