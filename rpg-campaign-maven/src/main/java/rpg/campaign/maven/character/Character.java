package rpg.campaign.maven.character;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * The Abstract Class Character represents a generic form of a 3D&T - Defensores
 * de Toquio 3 Edição Alpha's character.
 * 
 * Any character have the following attributes: name, points, strength,
 * dexterity, endurance, armor, fire power, level, hit points, magic points,
 * advantages, disadvantages, damage types, known spells, money, items and a
 * background history.
 * 
 * A character might be of two types: Playable Character or Non Playable
 * Character. The Playable character is the one owned by a Player. The Non
 * Playable Character is owned by a campaign and differently of the Playable
 * one, it didn't have experience points.
 * 
 * The level attribute is optional in this system, so it is required in
 * character creation but it is not mandatory.
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public abstract class Character {

	private String name;
	private int points;
	private int strength;
	private int dexterity;
	private int endurance;
	private int armor;
	private int firePower;
	private int level;
	private int hitPoints;
	private int magicPoints;
	private Set<String> advantages = new HashSet<>();
	private Set<String> disadvantages = new HashSet<>();
	private Set<String> damageTypes = new HashSet<>();
	private Set<String> knownSpells = new HashSet<>();
	private Set<String> moneyAndItems = new HashSet<>();

	/**
	 * This is the class constructor. It is responsible to initialize all
	 * character's variables when it is created.
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
	 * @param points
	 * @since 07/10/2019
	 *
	 */
	public Character(String name, int points, int strength, int dexterity, int endurance, int armor, int firePower,
			int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		this.name = name;
		this.points = points;
		this.strength = strength;
		this.dexterity = dexterity;
		this.endurance = endurance;
		this.armor = armor;
		this.firePower = firePower;
		this.level = level;
		this.hitPoints = hitPoints;
		this.magicPoints = magicPoints;
		this.advantages = advantages;
		this.disadvantages = disadvantages;
		this.damageTypes = damageTypes;
		this.knownSpells = knownSpells;
		this.moneyAndItems = moneyAndItems;

	}

	/**
	 * The main function of Abstract Method printSpreadsheat() is to display the
	 * character characteristics.
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public abstract StringBuilder printSpreadsheat();

	/**
	 * Method getName(). Responsible to get character's name.
	 * 
	 * @return String name
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method getPoints(). Responsible to get character's points.
	 * 
	 * @return Int points
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getPoints() {
		return points;
	}

	/**
	 * Method increasePoints(). Responsible to increase character's points.
	 * 
	 * @param pointsToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increasePoints(int pointsToIncrease) {
		this.points += pointsToIncrease;
	}

	/**
	 * Method decreasePoints(). Responsible to decrease character's points.
	 * 
	 * @param pointsToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreasePoints(int pointsToDecrease) {
		this.points -= pointsToDecrease;
	}

	/**
	 * Method getStrength(). Responsible to get character's strength.
	 * 
	 * @return Int strength
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getStrength() {
		return strength;
	}

	/**
	 * Method increaseStrength(). Responsible to increase character's strength.
	 * 
	 * @param strengthToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseStrength(int strengthToIncrease) {
		this.strength += strengthToIncrease;
	}

	/**
	 * Method decreaseStrength(). Responsible to decrease character's strength.
	 * 
	 * @param strengthToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseStrength(int strengthToDecrease) {
		this.strength -= strengthToDecrease;
	}

	/**
	 * Method getDexterity(). Responsible to get character's dexterity.
	 * 
	 * @return Int dexterity
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getDexterity() {
		return dexterity;
	}

	/**
	 * Method increaseDexterity(). Responsible to increase character's dexterity.
	 * 
	 * @param dexterityToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseDexterity(int dexterityToIncrease) {
		this.dexterity += dexterityToIncrease;
	}

	/**
	 * Method decreaseDexterity(). Responsible to decrease character's dexterity.
	 * 
	 * @param dexterityToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseDexterity(int dexterityToDecrease) {
		this.dexterity -= dexterityToDecrease;
	}

	/**
	 * Method getEndurance(). Responsible to get character's endurance.
	 * 
	 * @return Int endurance
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getEndurance() {
		return endurance;
	}

	/**
	 * Method increaseEndurance(). Responsible to increase character's endurance.
	 * 
	 * @param enduranceToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseEndurance(int enduranceToIncrease) {
		this.endurance += enduranceToIncrease;
	}

	/**
	 * Method decreaseEndurance(). Responsible to decrease character's endurance.
	 * 
	 * @param enduranceToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseEndurance(int enduranceToDecrease) {
		this.endurance -= enduranceToDecrease;
	}

	/**
	 * Method getArmor(). Responsible to get character's armor.
	 * 
	 * @return Int armor
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getArmor() {
		return armor;
	}

	/**
	 * Method increaseArmor(). Responsible to increase character's armor.
	 * 
	 * @param armorToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseArmor(int armorToIncrease) {
		this.armor += armorToIncrease;
	}

	/**
	 * Method decreaseArmor(). Responsible to decrease character's armor.
	 * 
	 * @param armorToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseArmor(int armorToDecrease) {
		this.armor -= armorToDecrease;
	}

	/**
	 * Method getFirePower(). Responsible to get character's firePower.
	 * 
	 * @return Int firePower
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getFirePower() {
		return firePower;
	}

	/**
	 * Method increaseFirePower(). Responsible to increase character's firePower.
	 * 
	 * @param firePowerToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseFirePower(int firePowerToIncrease) {
		this.firePower += firePowerToIncrease;
	}

	/**
	 * Method decreaseFirePower(). Responsible to decrease character's firePower.
	 * 
	 * @param firePowerToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreasefirePower(int firePowerToDecrease) {
		this.firePower -= firePowerToDecrease;
	}

	/**
	 * Method getLevel(). Responsible to get character's level.
	 * 
	 * @return int level
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	protected int getLevel() {
		return level;
	}

	/**
	 * Method increaseLevel(). Responsible to increase character's level.
	 * 
	 * @param levelsToIncrease int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void increaseLevel(int levelsToIncrease) {
		this.level += levelsToIncrease;
	}

	/**
	 * Method decreaseLevel(). Responsible to decrease character's level.
	 * 
	 * @param levelsToDecrease int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void decreaseLevel(int levelsToDecrease) {
		this.level -= levelsToDecrease;
	}

	/**
	 * Method getHitPoints(). Responsible to get character's hit points.
	 * 
	 * @return int hitPoints
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	protected int getHitPoints() {
		return hitPoints;
	}

	/**
	 * Method increaseHitPoints(). Responsible to increase character's hit points.
	 * 
	 * @param hitPointsToIncrease int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void increaseHitPoints(int hitPointsToIncrease) {
		this.hitPoints += hitPointsToIncrease;
	}

	/**
	 * Method decreaseHitPoints(). Responsible to decrease character's hit points.
	 * 
	 * @param hitPointsToDecrease int
	 * 
	 * @author jonas
	 * @since 07/10/2019
	 *
	 */
	public void decreaseHitPoints(int hitPointsToDecrease) {
		this.hitPoints -= hitPointsToDecrease;
	}

	/**
	 * Method getMagicPoints(). Responsible to get character's magic points.
	 * 
	 * @return int magicPoints
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected int getMagicPoints() {
		return magicPoints;
	}

	/**
	 * Method increaseMagicPoints(). Responsible to increase character's magic
	 * points.
	 * 
	 * @param magicPointsToIncrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseMagicPoints(int magicPointsToIncrease) {
		this.magicPoints += magicPointsToIncrease;
	}

	/**
	 * Method decreaseMagicPoints(). Responsible to decrease character's magic
	 * points.
	 * 
	 * @param magicPointsToDecrease int
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseMagicPoints(int magicPointsToDecrease) {
		this.magicPoints -= magicPointsToDecrease;
	}

	/**
	 * Method getAdavantages(). Responsible to get character's advantages.
	 * 
	 * @return Set<String> advantages
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected Set<String> getAdvantages() {
		return advantages;
	}

	/**
	 * Method increaseAdvantages(). Responsible to increase character's advantages.
	 * 
	 * @param advantagesToIncrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseAdvantages(String advantageToIncrease) {
		this.advantages.add(advantageToIncrease);
	}

	/**
	 * Method decreaseAdvantages(). Responsible to decrease character's advantages.
	 * 
	 * @param advantagesToDecrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseAdvantages(String advantagesToDecrease) {
		this.advantages.remove(advantagesToDecrease);
	}

	/**
	 * Method getDisadavantages(). Responsible to get character's disadvantages.
	 * 
	 * @return Set<String> disadvantages
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected Set<String> getDisadvangates() {
		return disadvantages;
	}

	/**
	 * Method increaseDisadvantages(). Responsible to increase character's
	 * disadvantages.
	 * 
	 * @param disadvantagesToIncrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseDisadvantages(String disadvantageToIncrease) {
		this.disadvantages.add(disadvantageToIncrease);
	}

	/**
	 * Method decreaseDisadvantages(). Responsible to decrease character's
	 * disadvantages.
	 * 
	 * @param disaadvantagesToDecrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseDisadvantages(String disadvantagesToDecrease) {
		this.disadvantages.remove(disadvantagesToDecrease);
	}

	/**
	 * Method getDamageTypes(). Responsible to get character's damage types.
	 * 
	 * @return Set<String> damageTypes
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected Set<String> getDamageTypes() {
		return damageTypes;
	}

	/**
	 * Method increaseDamageTypes(). Responsible to increase character's damage
	 * types.
	 * 
	 * @param damageTypeToIncrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseDamageTypes(String damageTypeToIncrease) {
		this.damageTypes.add(damageTypeToIncrease);
	}

	/**
	 * Method decreaseDamageTypes(). Responsible to decrease character's damage
	 * types.
	 * 
	 * @param damageTypeToDecrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseDamageTypes(String damageTypeToDecrease) {
		this.damageTypes.remove(damageTypeToDecrease);
	}

	/**
	 * Method getKnownSpells(). Responsible to get character's known spells.
	 * 
	 * @return Set<String> knownSpells
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected Set<String> getKnownSpells() {
		return knownSpells;
	}

	/**
	 * Method increaseKnownSpells(). Responsible to increase character's known
	 * spells.
	 * 
	 * @param knownSpellsToIncrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseKnownSpells(String knownSpellsToIncrease) {
		this.knownSpells.add(knownSpellsToIncrease);
	}

	/**
	 * Method decreaseKnownSpells(). Responsible to decrease character's known
	 * spells.
	 * 
	 * @param knownSpellsToDecrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseKnownSpells(String knownSpellsToDecrease) {
		this.knownSpells.remove(knownSpellsToDecrease);
	}

	/**
	 * Method getMoneyAndItems(). Responsible to get character's money and items.
	 * 
	 * @return Set<String> moneyAndItems
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	protected Set<String> getMoneyAndItems() {
		return moneyAndItems;
	}

	/**
	 * Method increaseMoneyAndItems(). Responsible to increase character's money and
	 * items.
	 * 
	 * @param moneyAndItemsToIncrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void increaseMoneyAndItems(String moneyAndItemsToIncrease) {
		this.moneyAndItems.add(moneyAndItemsToIncrease);
	}

	/**
	 * Method decreaseMoneyAndItems(). Responsible to decrease character's money and
	 * items.
	 * 
	 * @param moneyAndItemsToDecrease String
	 * 
	 * @author jonas
	 * @since 07/12/2019
	 *
	 */
	public void decreaseMoneyAndItems(String moneyAndItemsToDecrease) {
		this.moneyAndItems.remove(moneyAndItemsToDecrease);
	}

}
