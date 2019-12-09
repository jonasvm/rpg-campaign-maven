package rpg.campaign.maven.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import rpg.campaign.maven.campaign.Campaign;
import rpg.campaign.maven.character.NonPlayableCharacter;
import rpg.campaign.maven.user.DungeonMaster;
import rpg.campaign.maven.user.Player;
import rpg.campaign.maven.user.User;

/**
 * 
 * @author jonas
 * @version 2
 * @since 07/10/2019
 *
 */
public class GameController {

	static DungeonMaster dungeonMaster = null;
	static Campaign campaign = null;
	static Player player = null;

	public static DungeonMaster getDungeonMaster() {
		return dungeonMaster;
	}

	public static Campaign getCampaign() {
		return campaign;
	}

	public Player findPlayer(Campaign campaign, String target) {
		Player player = null;
		for (Player p : campaign.getPlayerList()) {
			if (p.getCharacter().getName().contentEquals(target)) {
				player = p;
				break;
			}
		}
		return player;
	}

	public NonPlayableCharacter findNPC(Campaign campaign, String target) {
		NonPlayableCharacter nonPlayableCharacter = null;
		for (NonPlayableCharacter npc : campaign.getNonPlayableCharacterList()) {
			if (npc.getName().contentEquals(target)) {
				nonPlayableCharacter = npc;
				break;
			}
		}
		return nonPlayableCharacter;
	}

	public void createDungeonMaster(String username, String email, String password) {
		dungeonMaster = new DungeonMaster(username, email, password);
	}

	public void createCampaign(DungeonMaster dg, String name) {
		campaign = new Campaign(dg, name);
		System.out.println();
	}

	public Player createPlayer(String playerName, String playerEmail, String playerPassword, String characterName,
			int characterPoints, int characterStrength, int characterDexterity, int characterEndurance,
			int characterArmor, int characterFirepower, int characterLevel, int characterHitPoints,
			int characterMagicPoints, Set<String> characterAdvantages, Set<String> characterDisadvantages,
			Set<String> characterDamageTypes, Set<String> characterKnownSpells, Set<String> characterMoneyAndItems) {

		player = new Player(playerName, playerEmail, playerPassword);
		player.createCharacter(characterName, characterPoints, characterStrength, characterDexterity,
				characterEndurance, characterArmor, characterFirepower, characterLevel, characterHitPoints,
				characterMagicPoints, characterAdvantages, characterDisadvantages, characterDamageTypes,
				characterKnownSpells, characterMoneyAndItems);
		campaign.populatePlayerList(player);
		return player;
	}

//	public void createNpc(String npcName, int npcPoints, int npcStrength, int npcDexterity, int npcEndurance,
//			int npcArmor, int npcFirepower, int npcLevel, int npcHitPoints, int npcMagicPoints, String npcAdvantages,
//			String npcDisadvantages, String npcDamageTypes, String npcKnownSpells, String npcMoneyAndItems) {
//		campaign.populateNpcList(npcName, npcPoints, npcStrength, npcDexterity, npcEndurance, npcArmor, npcFirepower,
//				npcLevel, npcHitPoints, npcMagicPoints, npcAdvantages, npcDisadvantages, npcDamageTypes, npcKnownSpells,
//				npcMoneyAndItems);
//	}

	public void showCampaignDetails(Campaign campaign) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Campaign Details");
		System.out.println();
		System.out.println("Campaign's name - " + campaign.getName());
		System.out.println("Campaign's Dungeon Master - " + campaign.getDungeonMaster().getUserName());
		System.out.println("Dungeon Master's email - " + campaign.getDungeonMaster().getEmail());
		System.out.println("Dungeon Master's password - " + campaign.getDungeonMaster().getPassword());
		System.out.println();
		System.out.println("Campaign's Player List");
		for (Player p : campaign.getPlayerList()) {
			System.out.println(p.getUserName());
			System.out.println(p.getEmail());
			System.out.println(p.getPassword());
			System.out.println(p.getCharacter().printSpreadsheat());
		}
		System.out.println();
		System.out.println("Campaign's Non Playable Character List");
		for (NonPlayableCharacter npc : campaign.getNonPlayableCharacterList()) {
			System.out.println(npc.printSpreadsheat());
		}
		System.out.println("---------------------------------------------------------------------------------------");
	}

	public void showCharacter(String target) {
		Player player = findPlayer(campaign, target);
		if (player != null) {
			System.out.println(player.getUserName());
			System.out.println(player.getCharacter().printSpreadsheat());
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void showCharacterList(Campaign campaign) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Campaign's Player List");
		for (Player p : campaign.getPlayerList()) {
			System.out.println(p.getUserName());
			System.out.println(p.getCharacter().printSpreadsheat());
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void showNpc(String target) {
		NonPlayableCharacter nonPlayableCharacter = findNPC(campaign, target);
		if (nonPlayableCharacter != null) {
			System.out.println(nonPlayableCharacter.printSpreadsheat());
		} else {
			System.out.println("NPC not found!");
		}
		System.out.println();
	}

	public void showNpcList(Campaign campaign) {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Campaign's Non Playable Character List");
		for (NonPlayableCharacter npc : campaign.getNonPlayableCharacterList()) {
			System.out.println(npc.printSpreadsheat());
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void increaseCharacterHitPoints(String target, int characterHitPoints) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseHitPoints(characterHitPoints);

		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterHitPoints(String target, int characterHitPoints) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseHitPoints(characterHitPoints);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterExperience(String target, int characterExperiencePoints) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseExperiencePoints(characterExperiencePoints);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterExperience(String target, int characterExperiencePoints) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseExperiencePoints(characterExperiencePoints);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterLevel(String target, int characterLvl) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseLevel(characterLvl);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterLevel(String target, int characterLvl) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseLevel(characterLvl);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void showInstructions() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(">> INSTRUCTIONS");
		System.out.println();
		System.out.println("Please read the instructions below before using the system!");
		System.out.println();
		System.out.println("Preliminary Steps: ");
		System.out.println("Step 1: Create a Dungeon Master.");
		System.out.println("Step 2: Create a Campaign.");
		System.out.println("Step 3: Add players to the campaign.");
		System.out.println("Step 4: Add NPCs to the campaign.");
		System.out.println();
		System.out.println("After these steps, you can: ");
		System.out.println(" - check the campaign information;");
		System.out.println(" - look for some specific player;");
		System.out.println(" - check the players list;");
		System.out.println(" - look for some specific NPC;");
		System.out.println(" - check the NPC list;");
		System.out.println(" - change the NPCs attributes like level, experience, hit pointes, etc;");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void checkIfUserIsAuthenticated(String userName, String password) {
		List<User> userList = new ArrayList<User>();
		userList.addAll(campaign.getPlayerList());
		userList.add(dungeonMaster);
		boolean authenticated = false;

		for (User user : userList) {
			if (user.getUserName().contentEquals(userName)) {
				authenticated = user.isAuthenticated(password);
				break;
			}
		}

		if (authenticated) {
			System.out.println("User Authenticated!");
		} else {
			System.out.println("User Not Authenticated!");
		}
		System.out.println();
	}

	public void increaseCharacterPoints(String target, int points) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increasePoints(points);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterPoints(String target, int points) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreasePoints(points);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterStrength(String target, int strength) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseStrength(strength);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterStrength(String target, int strength) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseStrength(strength);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterDexterity(String target, int dexterity) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseDexterity(dexterity);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterDexterity(String target, int dexterity) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseDexterity(dexterity);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterEndurance(String target, int endurance) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseEndurance(endurance);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterEndurance(String target, int endurance) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseEndurance(endurance);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterArmor(String target, int armor) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseArmor(armor);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();

	}

	public void decreaseCharacterArmor(String target, int armor) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseArmor(armor);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();

	}

	public void increaseCharacterFirePower(String target, int firePower) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseFirePower(firePower);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterFirePower(String target, int firePower) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreasefirePower(firePower);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterMagicPoints(String target, int magicPoints) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseMagicPoints(magicPoints);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterMagicPoints(String target, int magicPoints) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseMagicPoints(magicPoints);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterAdvantages(String target, String advantages) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseAdvantages(advantages);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterAdvantages(String target, String advantages) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseAdvantages(advantages);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterDisadvantages(String target, String disadvantages) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseDisadvantages(disadvantages);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterDisadvantages(String target, String disadvantages) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseDisadvantages(disadvantages);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterDamageTypes(String target, String damageTypes) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseDamageTypes(damageTypes);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterDamageTypes(String target, String damageTypes) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseDamageTypes(damageTypes);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterKnownSpells(String target, String knownSpells) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseKnownSpells(knownSpells);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterKnownSpells(String target, String knownSpells) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseKnownSpells(knownSpells);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void increaseCharacterMoneyAndItems(String target, String moneyAndItems) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().increaseMoneyAndItems(moneyAndItems);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void decreaseCharacterMoneyAndItems(String target, String moneyAndItems) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().decreaseMoneyAndItems(moneyAndItems);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void generateCharacterBackgroundHistory(String target, String backgroundHistory) {
		player = findPlayer(campaign, target);
		if (player != null) {
			player.getCharacter().setBackgroundHistory(backgroundHistory);
		} else {
			System.out.println("Character not found!");
		}
		System.out.println();
	}

	public void changeEmail(String target, String email, String newEmail) {
		List<User> userList = new ArrayList<User>();
		userList.addAll(campaign.getPlayerList());
		userList.add(dungeonMaster);

		for (User user : userList) {
			if (user.getUserName().contentEquals(target)) {
				user.changeEmail(email, newEmail);
				break;
			}
		}

		System.out.println();
	}

	public void changePassword(String target, String password, String newPassword) {
		List<User> userList = new ArrayList<User>();
		userList.addAll(campaign.getPlayerList());
		userList.add(dungeonMaster);

		for (User user : userList) {
			if (user.getUserName().contentEquals(target)) {
				user.changePassword(password, newPassword);
				break;
			}
		}

		System.out.println();
	}

}
