package rpg.campaign.maven.test;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import rpg.campaign.maven.campaign.Campaign;
import rpg.campaign.maven.controller.GameController;
import rpg.campaign.maven.ui.UserInterface;
import rpg.campaign.maven.user.DungeonMaster;

/**
 * 
 * @author jonas
 * @version 1.4
 * @since 07/10/2019
 *
 */
public class CliUserInterface implements UserInterface {

	static Scanner s = new Scanner(System.in);
	static GameController gc = new GameController();
	static int option = 0;

	public static void menu() {
		System.out.println("Please select an option!");
		System.out.println(" 1 - Create Dungeon Master");
		System.out.println(" 2 - Create Campaign");
		System.out.println(" 3 - Create Player");
		System.out.println(" 4 - Create NPC");
		System.out.println(" 5 - Show Campaign Details");
		System.out.println(" 6 - Show Character");
		System.out.println(" 7 - Show Character List");
		System.out.println(" 8 - Show NPC");
		System.out.println(" 9 - Show NPC List");
		System.out.println("10 - Increase Character Points");
		System.out.println("11 - Decrease Character Points");
		System.out.println("12 - Increase Character Strength");
		System.out.println("13 - Decrease Character Strength");
		System.out.println("14 - Increase Character Dexterity");
		System.out.println("15 - Decrease Character Dexterity");
		System.out.println("16 - Increase Character Endurance");
		System.out.println("17 - Decrease Character Endurance");
		System.out.println("18 - Increase Character Armor");
		System.out.println("19 - Decrease Character Armor");
		System.out.println("20 - Increase Character Fire Power");
		System.out.println("21 - Decrease Character Fire Power");
		System.out.println("22 - Increase Character Level");
		System.out.println("23 - Decrease Character Level");
		System.out.println("24 - Increase Character Hit Points");
		System.out.println("25 - Decrease Character Hit Points");
		System.out.println("26 - Increase Character Magic Points");
		System.out.println("27 - Decrease Character Magic Points");
		System.out.println("28 - Increase Character Advantages");
		System.out.println("29 - Decrease Character Advantages");
		System.out.println("30 - Increase Character Disadvantages");
		System.out.println("31 - Decrease Character Disadavantages");
		System.out.println("32 - Increase Character Damage Types");
		System.out.println("33 - Decrease Character Damage Types");
		System.out.println("34 - Increase Character Known Spells");
		System.out.println("35 - Decrease Character Known Spells");
		System.out.println("36 - Increase Character Money and Items");
		System.out.println("37 - Decrease Character Money and Items");
		System.out.println("38 - Increase Character Experience");
		System.out.println("39 - Decrease Character Experience");
		System.out.println("40 - Create a background for a character");
		System.out.println("41 - Authenticate Player");
		System.out.println("42 - Authenticate Dungeon Master");
		System.out.println("43 - Change user's email");
		System.out.println("44 - Change user's password");
		System.out.println("45 - Instructions");
		System.out.println("46 - Leave the system");

		try {
			option = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid entry - this field must be a number!");
			System.out.println("Leaving the program due to exception!");
			option = 0;
		}
		System.out.println();
	}

	public static String getUiName(int type) {
		String name = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the dungeon master's name");
			break;
		case 2:
			System.out.println("Please tipe the player's name");
			break;
		case 3:
			System.out.println("Please tipe the character's name");
			break;
		case 4:
			System.out.println("Please tipe the npc's name");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			name = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return name;
	}

	public static String getUiAdvantages(int type) {
		String advantage = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the player's advantage");
			break;
		case 2:
			System.out.println("Please tipe the character's advantage");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			advantage = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return advantage;
	}

	public static String getUiDisadvantages(int type) {
		String disadvantage = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the player's disadvantage");
			break;
		case 2:
			System.out.println("Please tipe the character's disadvantage");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			disadvantage = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return disadvantage;
	}

	public static String getUiDamageTypes(int type) {
		String damageType = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the player's damage type");
			break;
		case 2:
			System.out.println("Please tipe the character's damage type");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			damageType = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return damageType;
	}

	public static String getUiKnownSpells(int type) {
		String knownSpell = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the player's known spell");
			break;
		case 2:
			System.out.println("Please tipe the character's known spell");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			knownSpell = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return knownSpell;
	}

	public static String getUiMoneyAndItems(int type) {
		String moneyAndItem = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the player's money and item");
			break;
		case 2:
			System.out.println("Please tipe the character's money and item");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			moneyAndItem = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return moneyAndItem;
	}

	public static String getUiEmail(int type) {
		String email = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the dungeon master's email");
			break;
		case 2:
			System.out.println("Please tipe the player's email");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			email = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return email;
	}
	
	public static String getUiNewEmail() {
		String email = null;
		System.out.println("Please tipe the new email");
		try {
			email = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return email;
	}
	
	public static String getUiBackgroundHistory() {
		String backgroundHistory = null;
		System.out.println("Please tipe the character's background history.");
		try {
			backgroundHistory = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return backgroundHistory;
	}

	public static String getUiPassword(int type) {
		String password = null;
		switch (type) {
		case 1:
			System.out.println("Please tipe the dungeon master's password");
			break;
		case 2:
			System.out.println("Please tipe the player's password");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			password = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return password;
	}

	public static int getUiLevel(int type) {
		int level = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's level");
			break;
		case 2:
			System.out.println("Please tipe the npc's level");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			level = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return level;
	}

	public static int getUiMagicPoints(int type) {
		int magicPoints = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's magic points");
			break;
		case 2:
			System.out.println("Please tipe the npc's magic points");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			magicPoints = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return magicPoints;
	}

	public static int getUiPoints(int type) {
		int points = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's points");
			break;
		case 2:
			System.out.println("Please tipe the npc's points");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			points = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return points;
	}

	public static int getUiStrength(int type) {
		int strength = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's strength");
			break;
		case 2:
			System.out.println("Please tipe the npc's strength");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			strength = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return strength;
	}

	public static int getUiDexterity(int type) {
		int dexterity = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's dexterity");
			break;
		case 2:
			System.out.println("Please tipe the npc's dexterity");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			dexterity = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return dexterity;
	}

	public static int getUiEndurance(int type) {
		int endurance = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's endurance");
			break;
		case 2:
			System.out.println("Please tipe the npc's endurance");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			endurance = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return endurance;
	}

	public static int getUiArmor(int type) {
		int armor = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's armor");
			break;
		case 2:
			System.out.println("Please tipe the npc's armor");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			armor = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return armor;
	}

	public static int getUiFirePower(int type) {
		int firePower = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's firePower");
			break;
		case 2:
			System.out.println("Please tipe the npc's firePower");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			firePower = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return firePower;
	}

	public static int getUiHitPoints(int type) {
		int hitPoints = 0;
		switch (type) {
		case 1:
			System.out.println("Please tipe the character's hit points");
			break;
		case 2:
			System.out.println("Please tipe the npc's hit points");
			break;
		default:
			System.out.println("Invalid type!");
			break;
		}
		try {
			hitPoints = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return hitPoints;
	}

	public static int getUiExperiencePoints() {
		int experiencePoints = 0;
		System.out.println("Please tipe the character's experience points");
		try {
			experiencePoints = s.nextInt();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return experiencePoints;
	}

	public static String getUiPassword() {
		String password = null;
		System.out.println("Please tipe the password");
		try {
			password = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return password;
	}
	
	public static String getUiNewPassword() {
		String password = null;
		System.out.println("Please tipe the new password");
		try {
			password = s.next();
		} catch (Exception ex) {
			System.out.println("Invalid entry. MSG: " + ex.getMessage());
		}
		return password;
	}

	@Override
	public void checkIfUserIsAuthenticated(String userName, String password) {
		gc.checkIfUserIsAuthenticated(userName, password);
	}

	@Override
	public void createDungeonMaster(String username, String email, String password) {
		gc.createDungeonMaster(username, email, password);

	}

	@Override
	public void createCampaign(DungeonMaster dg, String name) {
		gc.createCampaign(dg, name);

	}

	@Override
	public void showCampaignDetails(Campaign campaign) {
		gc.showCampaignDetails(campaign);

	}

	@Override
	public void showCharacter(String player) {
		gc.showCharacter(player);

	}

	@Override
	public void showCharacterList(Campaign campaign) {
		gc.showCharacterList(campaign);

	}

	@Override
	public void showNpc(String npc) {
		gc.showNpc(npc);

	}

	@Override
	public void showNpcList(Campaign campaign) {
		gc.showNpcList(campaign);

	}

	@Override
	public void increaseCharacterHitPoints(String player, int hitPoints) {
		gc.increaseCharacterHitPoints(player, hitPoints);

	}

	@Override
	public void decreaseCharacterHitPoints(String player, int hitPoints) {
		gc.decreaseCharacterHitPoints(player, hitPoints);

	}

	@Override
	public void increaseCharacterExperience(String player, int expPoints) {
		gc.increaseCharacterExperience(player, expPoints);
	}

	@Override
	public void decreaseCharacterExperience(String player, int expPoints) {
		gc.decreaseCharacterExperience(player, expPoints);
	}

	@Override
	public void increaseCharacterLevel(String player, int level) {
		gc.increaseCharacterLevel(player, level);

	}

	@Override
	public void decreaseCharacterLevel(String player, int level) {
		gc.decreaseCharacterLevel(player, level);

	}

	@Override
	public void showInstructions() {
		gc.showInstructions();

	}

	@Override
	public void leaveGame() {
		System.out.println("Leaving the system!");
		System.out.println();
	}

	public static void main(String[] args) {

		/*
		 * para getUiName dungeon master = 1 player = 2 character = 3 npc = 4 para
		 * outros character = 1 , npc = 2
		 */
		CliUserInterface cliUserInterface = new CliUserInterface();

		System.out.println("Welcome to the RPG Game Manager v2");
		System.out.println();

		while (option <= 46)

			switch (option) {
			case 1:
				cliUserInterface.createDungeonMaster(getUiName(1), getUiEmail(1), getUiPassword(1));
				option = 0;
				break;
			case 2:
				System.out.println("Please tipe the campaign's name");
				cliUserInterface.createCampaign(GameController.getDungeonMaster(), s.next());
				option = 0;
				break;
			case 3:
				cliUserInterface.createPlayer(getUiName(2), getUiEmail(2), getUiPassword(2), getUiName(3),
						getUiPoints(1), getUiStrength(1), getUiDexterity(1), getUiEndurance(1), getUiArmor(1),
						getUiFirePower(1), getUiLevel(1), getUiHitPoints(1), getUiMagicPoints(1), getUiAdvantages(1),
						getUiDisadvantages(1), getUiDamageTypes(1), getUiKnownSpells(1), getUiMoneyAndItems(1));
				option = 0;
				break;
			case 4:
				cliUserInterface.createNpc(getUiName(4), getUiPoints(2), getUiStrength(2), getUiDexterity(2),
						getUiEndurance(2), getUiArmor(2), getUiFirePower(2), getUiLevel(2), getUiHitPoints(2),
						getUiMagicPoints(2), getUiAdvantages(2), getUiDisadvantages(2), getUiDamageTypes(2),
						getUiKnownSpells(2), getUiMoneyAndItems(2));
				option = 0;
				break;
			case 5:
				cliUserInterface.showCampaignDetails(GameController.getCampaign());
				option = 0;
				break;
			case 6:
				cliUserInterface.showCharacter(getUiName(3));
				option = 0;
				break;
			case 7:
				cliUserInterface.showCharacterList(GameController.getCampaign());
				option = 0;
				break;
			case 8:
				cliUserInterface.showNpc(getUiName(4));
				option = 0;
				break;
			case 9:
				cliUserInterface.showNpcList(GameController.getCampaign());
				option = 0;
				break;
			case 10:
				cliUserInterface.increaseCharacterPoints(getUiName(3), getUiPoints(1));
				option = 0;
				break;
			case 11:
				cliUserInterface.decreaseCharacterPoints(getUiName(3), getUiPoints(1));
				option = 0;
				break;
			case 12:
				cliUserInterface.increaseCharacterStrength(getUiName(3), getUiStrength(1));
				option = 0;
				break;
			case 13:
				cliUserInterface.decreaseCharacterStrength(getUiName(3), getUiStrength(1));
				option = 0;
				break;
			case 14:
				cliUserInterface.increaseCharacterDexterity(getUiName(3), getUiDexterity(1));
				option = 0;
				break;
			case 15:
				cliUserInterface.decreaseCharacterDexterity(getUiName(3), getUiDexterity(1));
				option = 0;
				break;
			case 16:
				cliUserInterface.increaseCharacterEndurance(getUiName(3), getUiEndurance(1));
				option = 0;
				break;
			case 17:
				cliUserInterface.decreaseCharacterEndurance(getUiName(3), getUiEndurance(1));
				option = 0;
				break;
			case 18:
				cliUserInterface.increaseCharacterArmor(getUiName(3), getUiArmor(1));
				option = 0;
				break;
			case 19:
				cliUserInterface.decreaseCharacterArmor(getUiName(3), getUiArmor(1));
				option = 0;
				break;
			case 20:
				cliUserInterface.increaseCharacterFirePower(getUiName(3), getUiFirePower(1));
				option = 0;
				break;
			case 21:
				cliUserInterface.decreaseCharacterFirePower(getUiName(3), getUiFirePower(1));
				option = 0;
				break;
			case 22:
				cliUserInterface.increaseCharacterLevel(getUiName(3), getUiLevel(1));
				option = 0;
				break;
			case 23:
				cliUserInterface.decreaseCharacterLevel(getUiName(3), getUiLevel(1));
				option = 0;
				break;
			case 24:
				cliUserInterface.increaseCharacterHitPoints(getUiName(3), getUiHitPoints(1));
				option = 0;
				break;
			case 25:
				cliUserInterface.decreaseCharacterHitPoints(getUiName(3), getUiHitPoints(1));
				option = 0;
				break;
			case 26:
				cliUserInterface.increaseCharacterMagicPoints(getUiName(3), getUiMagicPoints(1));
				option = 0;
				break;
			case 27:
				cliUserInterface.decreaseCharacterMagicPoints(getUiName(3), getUiMagicPoints(1));
				option = 0;
				break;
			case 28:
				cliUserInterface.increaseCharacterAdvantages(getUiName(3), getUiAdvantages(1));
				option = 0;
				break;
			case 29:
				cliUserInterface.decreaseCharacterAdvantages(getUiName(3), getUiAdvantages(1));
				option = 0;
				break;
			case 30:
				cliUserInterface.increaseCharacterDisadvantages(getUiName(3), getUiDisadvantages(1));
				option = 0;
				break;
			case 31:
				cliUserInterface.decreaseCharacterDisadvantages(getUiName(3), getUiDisadvantages(1));
				option = 0;
				break;
			case 32:
				cliUserInterface.increaseCharacterDamageTypes(getUiName(3), getUiDamageTypes(1));
				option = 0;
				break;
			case 33:
				cliUserInterface.decreaseCharacterDamageTypes(getUiName(3), getUiDamageTypes(1));
				option = 0;
				break;
			case 34:
				cliUserInterface.increaseCharacterKnownSpells(getUiName(3), getUiKnownSpells(1));
				option = 0;
				break;
			case 35:
				cliUserInterface.decreaseCharacterKnownSpells(getUiName(3), getUiKnownSpells(1));
				option = 0;
				break;
			case 36:
				cliUserInterface.increaseCharacterMoneyAndItems(getUiName(3), getUiMoneyAndItems(1));
				option = 0;
				break;
			case 37:
				cliUserInterface.decreaseCharacterMoneyAndItems(getUiName(3), getUiMoneyAndItems(1));
				option = 0;
				break;
			case 38:
				cliUserInterface.increaseCharacterExperience(getUiName(3), getUiExperiencePoints());
				option = 0;
				break;
			case 39:
				cliUserInterface.decreaseCharacterExperience(getUiName(3), getUiExperiencePoints());
				option = 0;
				break;
			case 40:
				cliUserInterface.generateCharacterBackgroundHistory(getUiName(3), getUiBackgroundHistory());
				option = 0;
				break;
			case 41:
				cliUserInterface.checkIfUserIsAuthenticated(getUiName(2), getUiPassword());
				option = 0;
				break;
			case 42:
				cliUserInterface.checkIfUserIsAuthenticated(getUiName(1), getUiPassword());
				option = 0;
				break;
			case 43:
				cliUserInterface.changeEmail(getUiName(2), getUiEmail(2), getUiNewEmail());
				option = 0;
				break;
			case 44:
				cliUserInterface.changePassword(getUiName(2), getUiPassword(), getUiNewPassword());
				option = 0;
				break;
			case 45:
				cliUserInterface.showInstructions();
				option = 0;
				break;
			case 46:
				cliUserInterface.leaveGame();
				option = 47;
				break;
			default:
				menu();
				break;
			}

	}

	@Override
	public void changeEmail(String user, String email, String newEmail) {
		gc.changeEmail(user, email, newEmail);

	}

	@Override
	public void changePassword(String user, String password, String newPassword) {
		gc.changePassword(user, password, newPassword);

	}

	@Override
	public void createPlayer(String playerName, String playerEmail, String playerPassword, String characterName,
			int characterPoints, int characterStrength, int characterDexterity, int characterEndurance,
			int characterArmor, int characterFirepower, int characterLevel, int characterHitPoints,
			int characterMagicPoints, String characterAdvantages, String characterDisadvantages,
			String characterDamageTypes, String characterKnownSpells, String characterMoneyAndItems) {

		Set<String> setAdvantages = new HashSet<String>();
		Set<String> setDisadvantages = new HashSet<String>();
		Set<String> setDamageTypes = new HashSet<String>();
		Set<String> setKnownSpells = new HashSet<String>();
		Set<String> setMoneyAndItems = new HashSet<String>();

		setAdvantages.add(characterAdvantages);
		setDisadvantages.add(characterDisadvantages);
		setDamageTypes.add(characterDamageTypes);
		setKnownSpells.add(characterKnownSpells);
		setMoneyAndItems.add(characterMoneyAndItems);

		gc.createPlayer(playerName, playerEmail, playerPassword, characterName, characterPoints, characterStrength,
				characterDexterity, characterEndurance, characterArmor, characterFirepower, characterLevel,
				characterHitPoints, characterMagicPoints, setAdvantages, setDisadvantages, setDamageTypes,
				setKnownSpells, setMoneyAndItems);

	}

	@Override
	public void createNpc(String npcName, int npcPoints, int npcStrength, int npcDexterity, int npcEndurance,
			int npcArmor, int npcFirepower, int npcLevel, int npcHitPoints, int npcMagicPoints, String npcAdvantages,
			String npcDisadvantages, String npcDamageTypes, String npcKnownSpells, String npcMoneyAndItems) {

		Set<String> setAdvantages = new HashSet<String>();
		Set<String> setDisadvantages = new HashSet<String>();
		Set<String> setDamageTypes = new HashSet<String>();
		Set<String> setKnownSpells = new HashSet<String>();
		Set<String> setMoneyAndItems = new HashSet<String>();

		setAdvantages.add(npcAdvantages);
		setDisadvantages.add(npcDisadvantages);
		setDamageTypes.add(npcDamageTypes);
		setKnownSpells.add(npcKnownSpells);
		setMoneyAndItems.add(npcMoneyAndItems);

		GameController.getCampaign().populateNpcList(npcName, npcPoints, npcStrength, npcDexterity, npcEndurance,
				npcArmor, npcFirepower, npcLevel, npcHitPoints, npcMagicPoints, setAdvantages, setDisadvantages,
				setDamageTypes, setKnownSpells, setMoneyAndItems);

	}

	@Override
	public void increaseCharacterPoints(String player, int points) {
		gc.increaseCharacterPoints(player, points);

	}

	@Override
	public void decreaseCharacterPoints(String player, int points) {
		gc.decreaseCharacterPoints(player, points);

	}

	@Override
	public void increaseCharacterStrength(String player, int strength) {
		gc.increaseCharacterStrength(player, strength);

	}

	@Override
	public void decreaseCharacterStrength(String player, int strength) {
		gc.decreaseCharacterStrength(player, strength);

	}

	@Override
	public void increaseCharacterDexterity(String player, int dexterity) {
		gc.increaseCharacterDexterity(player, dexterity);

	}

	@Override
	public void decreaseCharacterDexterity(String player, int dexterity) {
		gc.decreaseCharacterDexterity(player, dexterity);

	}

	@Override
	public void increaseCharacterEndurance(String player, int endurance) {
		gc.increaseCharacterEndurance(player, endurance);

	}

	@Override
	public void decreaseCharacterEndurance(String player, int endurance) {
		gc.decreaseCharacterEndurance(player, endurance);

	}

	@Override
	public void increaseCharacterArmor(String player, int armor) {
		gc.increaseCharacterArmor(player, armor);

	}

	@Override
	public void decreaseCharacterArmor(String player, int armor) {
		gc.decreaseCharacterArmor(player, armor);

	}

	@Override
	public void increaseCharacterFirePower(String player, int firePower) {
		gc.increaseCharacterFirePower(player, firePower);

	}

	@Override
	public void decreaseCharacterFirePower(String player, int firePower) {
		gc.decreaseCharacterFirePower(player, firePower);

	}

	@Override
	public void increaseCharacterMagicPoints(String player, int magicPoints) {
		gc.increaseCharacterMagicPoints(player, magicPoints);

	}

	@Override
	public void decreaseCharacterMagicPoints(String player, int magicPoints) {
		gc.decreaseCharacterMagicPoints(player, magicPoints);

	}

	@Override
	public void increaseCharacterAdvantages(String player, String advantages) {
		gc.increaseCharacterAdvantages(player, advantages);

	}

	@Override
	public void decreaseCharacterAdvantages(String player, String advantages) {
		gc.decreaseCharacterAdvantages(player, advantages);

	}

	@Override
	public void increaseCharacterDisadvantages(String player, String disadvantages) {
		gc.increaseCharacterDisadvantages(player, disadvantages);

	}

	@Override
	public void decreaseCharacterDisadvantages(String player, String disadvantages) {
		gc.decreaseCharacterDisadvantages(player, disadvantages);

	}

	@Override
	public void increaseCharacterDamageTypes(String player, String damageTypes) {
		gc.increaseCharacterDamageTypes(player, damageTypes);

	}

	@Override
	public void decreaseCharacterDamageTypes(String player, String damageTypes) {
		gc.decreaseCharacterDamageTypes(player, damageTypes);

	}

	@Override
	public void increaseCharacterKnownSpells(String player, String knownSpells) {
		gc.increaseCharacterKnownSpells(player, knownSpells);

	}

	@Override
	public void decreaseCharacterKnownSpells(String player, String knownSpells) {
		gc.decreaseCharacterKnownSpells(player, knownSpells);

	}

	@Override
	public void increaseCharacterMoneyAndItems(String player, String moneyAndItems) {
		gc.increaseCharacterMoneyAndItems(player, moneyAndItems);

	}

	@Override
	public void decreaseCharacterMoneyAndItems(String player, String moneyAndItems) {
		gc.decreaseCharacterMoneyAndItems(player, moneyAndItems);

	}

	@Override
	public void generateCharacterBackgroundHistory(String player, String backgroundHistory) {
		gc.generateCharacterBackgroundHistory(player, backgroundHistory);

	}
}
