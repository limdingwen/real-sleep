package com.github.limdingwen.RealSleep;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Help {
	public static void printHelp(Player player) {
		player.sendMessage(ChatColor.GREEN + "==RealSleep Help - Commands==");
		player.sendMessage("----------------------");
		player.sendMessage("Remember that you could replace all 'sleep' with 'rs'.");
		player.sendMessage("----------------------");
		player.sendMessage("/sleep - Base of all commands.");
		player.sendMessage("/sleep help - Displays this help screen.");
		player.sendMessage("/sleep check - Checks your sleep.");
		player.sendMessage("/sleep check <Player> - Checks another person's sleep.");
		player.sendMessage("/sleep restore <Player> - Base of all commands.");
		player.sendMessage("----------------------");
	}
}