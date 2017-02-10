/*
 * 
 * Created with <3 by the Realm of Gladiators development team (Only Eric right now)
 * 
 */


package net.realmofgladiator.dev;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ROGPluginOne extends JavaPlugin {

	public void onEnable() {
		
		getLogger().info("has been enabled!");
		
	}
	
	public void onDisable() {
		
		getLogger().info("has been disabled!");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("rog")) {
			
			Player player = (Player) sender;
			
			String name = player.getName();
			
			player.sendMessage(ChatColor.GOLD + "Hello, " + ChatColor.DARK_BLUE + name + ".");
			player.sendMessage(ChatColor.GOLD + "Welcome to " + ChatColor.DARK_BLUE +"Realm of Gladiators!");
			player.sendMessage(ChatColor.GOLD + "Do " + ChatColor.DARK_BLUE + "/f create " + ChatColor.GOLD + "to start a faction!");
			player.sendMessage(ChatColor.GOLD + "To donate, do " + ChatColor.DARK_BLUE + "/buy");
			player.sendMessage(ChatColor.GOLD + "To access the shop, do " + ChatColor.DARK_BLUE + "/shop");
			player.sendMessage(ChatColor.GOLD + "To view your kits, do" + ChatColor.DARK_BLUE + " /kits");
			player.sendMessage(ChatColor.GOLD + "You can visit our website here:");
			player.sendMessage(ChatColor.DARK_BLUE + "http://www.realmofgladiators.net");
		}
		
		return true;
		
	}
	
}
