package com.ulticraft;

import org.bukkit.Material;
import com.ulticraft.composite.Perk;
import com.ulticraft.uapi.USound;
import net.md_5.bungee.api.ChatColor;

public class Info
{
	public static final String NAME = "Ulticraft";
	public static final String VERSION = "3.1.27.1337";
	public static final String[] AUTHORS = new String[]{"Daniel Mills (cyberpwn)", "Alex Walters (Sir_Ulticraft)"};
	
	public static final String STAT_BLOCKBREAK = "Blocks Broken";
	public static final String STAT_BLOCKPLACE = "Blocks Placed";
	public static final String STAT_COMBATKILLS = "Kills";
	public static final String STAT_COMBATPLAYERKILLS = "Player Kills";
	public static final String STAT_COMBATDEATHS = "Deaths";
	public static final String STAT_CHATWORDS = "Words Chatted";
	public static final String STAT_MAGICFROSTS = "Magic Frosts";
	public static final String STAT_MAGICSHOCKS = "Magic Shocks";
	public static final String STAT_MAGICFLAMES = "Magic Flames";
	public static final String STAT_MAGICRUSHES = "Magic Rushes";
	
	public static final char DINGBAT_PENTAGON = '\u2B1F';
	public static final char DINGBAT_HEXAGON = '\u2B22';
	public static final char DINGBAT_CHECK = '\u2B22';
	public static final char DINGBAT_NOTCHECK = '\u2B22';
	public static final char DINGBAT_BACK = '\u2B22';
	
	public static final String UI_TITLE_ULTICRAFT = ChatColor.DARK_GRAY + NAME;
	public static final String UI_TITLE_PERKS_GET = ChatColor.DARK_GRAY + "Get Perks";
	public static final String UI_TITLE_PERKS_MY = ChatColor.DARK_GRAY + "My Perks";
	
	public static final String UI_ACTION_BACK = ChatColor.RED + "" + DINGBAT_BACK + " Back";
	
	public static final String PERM_GEM_GOD = "ulticraft.gems.god";
	
	public static final String ERR_NO_PERK_HAS_PERMS = "ERROR: #200";
	public static final String ERR_NO_PERMS_HAS_PERK = "ERROR: #201";
	
	public static final int ACHIEVEMENT_MAX = 1000000000;
	public static final int[] ACHIEVEMENT_PATH = new int[]{10, 100, 200, 300, 400, 500, 1000, 2000, 3000, 4000, 5000, 10000, 20000, 30000, 40000, 50000, 100000, 200000, 300000, 400000, 500000, 1000000, 2000000, 3000000, 4000000, 5000000, 10000000, 20000000, 30000000, 40000000, 50000000, 100000000, 200000000, 300000000, 400000000, 500000000, 1000000000};
	public static final String[] ACHIEVEMENT_PATH_TITLES = new String[]{"Ten", "One Hundred", "2 Hundred", "3 Hundred", "4 Hundred", "5 Hundred", "One Thousand", "2 Thousand", "3 Thousand", "4 Thousand", "5 Thousand", "Ten Thousand", "20 Thousand", "30 Thousand", "40 Thousand", "50 Thousand", "100 Thousand", "200 Thousand", "300 Thousand", "400 Thousand", "500 Thousand", "One Million", "2 Million", "3 Million", "4 Million", "5 Million", "Ten Million", "20 Million", "30 Million", "40 Million", "50 Million", "100 Million", "200 Million0", "300 Million", "400 Million", "500 Million", "One Billion"};
	
	public static final String TAG = ChatColor.LIGHT_PURPLE + "[" + ChatColor.DARK_GRAY + "%s" + ChatColor.LIGHT_PURPLE + "]" + ChatColor.AQUA + ": ";
	public static final String TAG_GEMS = String.format(TAG, "Gems");
	public static final String TAG_ULTICRAFT = String.format(TAG, "Ulticraft");
	public static final String TAG_MANA = String.format(TAG, "Mana");
	public static final String TAG_PERKS = String.format(TAG, "Perks");
	public static final String TAG_SPELLS = String.format(TAG, "Spells");
	
	public static final String CMD_GEM = "gem";
	public static final String CMD_ULTICRAFT = "ulticraft";
	public static final String CMD_MANA = "mana";
	public static final String CMD_PERK = "perk";
	public static final String CMD_SPELL = "spell";
	
	public static final String[] CMD_HELP_GEM = new String[]{TAG_GEMS + ChatColor.LIGHT_PURPLE + "/gem " + ChatColor.DARK_GRAY + "- Get current gems"};
	public static final String[] CMD_HELP_ADMIN_GEM = new String[]{TAG_GEMS + ChatColor.LIGHT_PURPLE + "/gem " + ChatColor.DARK_GRAY + "- Get current gems", Info.TAG_GEMS + ChatColor.LIGHT_PURPLE + "/gem get " + ChatColor.AQUA + "<player> " + ChatColor.DARK_GRAY + "- Get a player's gems", TAG_GEMS + ChatColor.LIGHT_PURPLE + "/gem give " + ChatColor.AQUA + "[player] [gems] " + ChatColor.DARK_GRAY + "- Give a player gems", TAG_GEMS + ChatColor.LIGHT_PURPLE + "/gem take " + ChatColor.AQUA + "[player] [gems] " + ChatColor.DARK_GRAY + "- Take player gems"};
	
	public static final String MSG_NO_PERMISSION = TAG_ULTICRAFT + ChatColor.RED + "Insufficient Permissions";
	public static final String MSG_CANT_FIND_PLAYER = TAG_ULTICRAFT + ChatColor.RED + "Cannot find player '%s'";
	public static final String MSG_NOT_POSITIVE = TAG_ULTICRAFT + ChatColor.RED + "%s is clearly not positive.";
	public static final String MSG_NOT_NEGATIVE = TAG_ULTICRAFT + ChatColor.RED + "%s is clearly not negative.";
	public static final String MSG_NOT_ZERO = TAG_ULTICRAFT + ChatColor.RED + "%s is zero. Fix that.";
	public static final String MSG_NOT_NUMBER = TAG_ULTICRAFT + ChatColor.RED + "'%s' is not a number. It's Trash.";
	public static final String MSG_PLAYER_GEM_HAS = TAG_GEMS + ChatColor.LIGHT_PURPLE + "%s" + ChatColor.DARK_GRAY + " has " + ChatColor.LIGHT_PURPLE + "%s Gems";
	public static final String MSG_PLAYER_ONLY = TAG_ULTICRAFT + ChatColor.RED + "Player Only Command";
	public static final String MSG_CONSOLE_ONLY = TAG_ULTICRAFT + ChatColor.RED + "Console Only Command";
	public static final String MSG_UNKNOWN_SUB_COMMAND = TAG_ULTICRAFT + ChatColor.RED + "Unknown Sub Command '%s'";
	public static final String MSG_GEMS_GAVE = TAG_GEMS + ChatColor.DARK_GRAY + "Gave " + ChatColor.LIGHT_PURPLE + "%s Gems" + ChatColor.DARK_GRAY + " to " + ChatColor.LIGHT_PURPLE + "%s";
	public static final String MSG_GEMS_TOOK = TAG_GEMS + ChatColor.DARK_GRAY + "Took " + ChatColor.LIGHT_PURPLE + "%s Gems" + ChatColor.DARK_GRAY + " from " + ChatColor.LIGHT_PURPLE + "%s";
	public static final String MSG_GEMS_NOT_ENOUGH = TAG_GEMS + ChatColor.DARK_GRAY + "Nope. " + ChatColor.LIGHT_PURPLE + "%s" + ChatColor.DARK_GRAY + " only has " + ChatColor.LIGHT_PURPLE + "%s Gems";
	
	public static final String MSG_GEMS_HAVE = TAG_GEMS + ChatColor.DARK_GRAY + "You have " + ChatColor.LIGHT_PURPLE + "%s Gems";
	public static final String MSG_GEMS_SPENT = ChatColor.DARK_GRAY + "Spent " + ChatColor.LIGHT_PURPLE + "%s Gems";
	public static final String MSG_GEMS_EARNED = ChatColor.DARK_GRAY + "Earned " + ChatColor.LIGHT_PURPLE + "%s Gems";
	public static final String MSG_PERK_UNLOCK = ChatColor.DARK_GRAY + "Unlocked " + ChatColor.LIGHT_PURPLE + "%s";
	public static final String MSG_ACHIEVEMENT = ChatColor.DARK_GRAY + "Achieved " + ChatColor.LIGHT_PURPLE + "%s %s";
	public static final String MSG_UPGRADED = ChatColor.DARK_GRAY + "Updated Ulticraft " + ChatColor.LIGHT_PURPLE + "v" + VERSION;
	public static final String MSG_DEVELOPED_BY = ChatColor.LIGHT_PURPLE + "Developed by";
	
	public static final String BROAD_ACHIEVEMENT = ChatColor.LIGHT_PURPLE + "%s " + ChatColor.DARK_GRAY + "Achieved " + ChatColor.LIGHT_PURPLE + "%s %s";
	public static final String BROAD_PERK_UNLOCK = ChatColor.LIGHT_PURPLE + "%s " + ChatColor.DARK_GRAY + "Unlocked " + ChatColor.LIGHT_PURPLE + "%s";
	
	public static final USound SOUND_PERK_UNLOCK = new USound("ulticraft.event.unlock");
	public static final USound SOUND_PERK_UNLOCK_DISTANT = new USound("ulticraft.distantevent.unlock");
	public static final USound SOUND_ACHIEVE = new USound("ulticraft.event.achieve");
	public static final USound SOUND_ACHIEVE_DISTANT = new USound("ulticraft.distantevent.achieve");
	public static final USound SOUND_GUI_CONFIRM = new USound("ulticraft.event.gui.confirm");
	public static final USound SOUND_GUI_EXIT = new USound("ulticraft.event.gui.exit");
	
	public static final int MANA_BAR_SPLIT = 20;
	
	public static final Perk PERK_FLY = new Perk("Fly", new String[]{"Fly anywhere with /fly!"}, new String[]{"essentials.fly", "essentials.fly.safelogin"}, 400, Material.FEATHER);
	
	public static final Perk[] PERKS = new Perk[]{PERK_FLY};
}
