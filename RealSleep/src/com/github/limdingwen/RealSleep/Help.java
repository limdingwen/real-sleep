package com.github.limdingwen.RealSleep;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help {
	public static void printHelp(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "==RealSleep Help - Commands==");
		sender.sendMessage("----------------------");
		sender.sendMessage("Remember that you could replace all 'sleep' with 'rs'.");
		sender.sendMessage("----------------------");
		sender.sendMessage("/sleep - Base of all commands.");
		sender.sendMessage("/sleep help - Displays this help screen.");
		sender.sendMessage("/sleep check - Checks your sleep.");
		sender.sendMessage("/sleep check <Player> - Checks another person's sleep.");
		sender.sendMessage("/sleep restore <Player> - Base of all commands.");
		sender.sendMessage("----------------------");
	}
}