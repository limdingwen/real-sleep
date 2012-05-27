package com.github.limdingwen.RealSleep;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help {
	public static void printHelp(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "=====" + ChatColor.RESET + "RealSleep Help - Commands" + ChatColor.GREEN + "=====");
		sender.sendMessage(ChatColor.LIGHT_PURPLE + "----------------------");
		sender.sendMessage(ChatColor.BOLD + "Remember that you could replace all 'sleep' with 'rs' or 'realsleep'.");
		sender.sendMessage(ChatColor.LIGHT_PURPLE + "----------------------");
		sender.sendMessage(ChatColor.GOLD + "/sleep" + ChatColor.BLUE + " - Base of all commands.");
		sender.sendMessage(ChatColor.GOLD + "/sleep help" + ChatColor.BLUE + " - Displays this help screen.");
		sender.sendMessage(ChatColor.GOLD + "/sleep check" + ChatColor.BLUE + " - Checks your sleep.");
		sender.sendMessage(ChatColor.GOLD + "/sleep check <Player>" + ChatColor.BLUE + " - Checks another person's sleep.");
		sender.sendMessage(ChatColor.GOLD + "/sleep restore <Player>" + ChatColor.BLUE + " - Restores a person's sleep to full.");
		sender.sendMessage(ChatColor.LIGHT_PURPLE + "----------------------");
	}
}