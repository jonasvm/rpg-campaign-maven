package rpg.campaign.maven.ui;

import rpg.campaign.maven.campaign.Campaign;
import rpg.campaign.maven.user.DungeonMaster;

/**
 * 
 * The interface UserInterface contains the methods that any user interface have
 * to implement in order to interact with campaign, player, dungeon master,
 * playable characters and non playable characters.
 * 
 * @author jonas
 * @version 1.4
 * @since 07/10/2019
 *
 */
public interface UserInterface {

	void checkIfUserIsAuthenticated(String userName, String password);

	void changeEmail(String player, String email, String newEmail);

	void changePassword(String player, String password, String newPassword);

	void createDungeonMaster(String username, String email, String password);

	void createCampaign(DungeonMaster dg, String name);

	void createPlayer(String playerName, String playerEmail, String playerPassword, String characterName,
			int characterPoints, int characterStrength, int characterDexterity, int characterEndurance,
			int characterArmor, int characterFirepower, int characterLevel, int characterHitPoints,
			int characterMagicPoints, String characterAdvantages, String characterDisadvantages,
			String characterDamageTypes, String characterKnownSpells, String characterMoneyAndItems);

	void createNpc(String npcName, int npcPoints, int npcStrength, int npcDexterity, int npcEndurance, int npcArmor,
			int npcFirepower, int npcLevel, int npcHitPoints, int npcMagicPoints, String npcAdvantages,
			String npcDisadvantages, String npcDamageTypes, String npcKnownSpells, String npcMoneyAndItems);

	void showCampaignDetails(Campaign campaign);

	void showCharacter(String player);

	void showCharacterList(Campaign campaign);

	void showNpc(String npc);

	void showNpcList(Campaign campaign);

	void increaseCharacterPoints(String player, int points);

	void decreaseCharacterPoints(String player, int points);

	void increaseCharacterStrength(String player, int strength);

	void decreaseCharacterStrength(String player, int strength);

	void increaseCharacterDexterity(String player, int dexterity);

	void decreaseCharacterDexterity(String player, int dexterity);

	void increaseCharacterEndurance(String player, int endurance);

	void decreaseCharacterEndurance(String player, int endurance);

	void increaseCharacterArmor(String player, int armor);

	void decreaseCharacterArmor(String player, int armor);

	void increaseCharacterFirePower(String player, int firePower);

	void decreaseCharacterFirePower(String player, int firePower);

	void increaseCharacterLevel(String player, int level);

	void decreaseCharacterLevel(String player, int level);

	void increaseCharacterHitPoints(String player, int hitPoints);

	void decreaseCharacterHitPoints(String player, int hitPoints);

	void increaseCharacterMagicPoints(String player, int magicPoints);

	void decreaseCharacterMagicPoints(String player, int magicPoints);

	void increaseCharacterAdvantages(String player, String advantages);

	void decreaseCharacterAdvantages(String player, String advantages);

	void increaseCharacterDisadvantages(String player, String disadvantages);

	void decreaseCharacterDisadvantages(String player, String disadvantages);

	void increaseCharacterDamageTypes(String player, String damageTypes);

	void decreaseCharacterDamageTypes(String player, String damageTypes);

	void increaseCharacterKnownSpells(String player, String knownSpells);

	void decreaseCharacterKnownSpells(String player, String knownSpells);

	void increaseCharacterMoneyAndItems(String player, String moneyAndItems);

	void decreaseCharacterMoneyAndItems(String player, String moneyAndItems);

	void increaseCharacterExperience(String player, int expPoints);

	void decreaseCharacterExperience(String player, int expPoints);

	void generateCharacterBackgroundHistory(String player, String backgroundHistory);

	void showInstructions();

	void leaveGame();

}
