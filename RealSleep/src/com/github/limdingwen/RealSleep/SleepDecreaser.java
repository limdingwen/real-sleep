package com.github.limdingwen.RealSleep;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SleepDecreaser {
	public static void decrease() {
		Player[] players = Bukkit.getServer().getOnlinePlayers();
		Map<String, Float> data = new HashMap<String, Float>();
		Logger log = Logger.getLogger("RealSleepDecreaser");
		
		// Load data
		
		try {
			data = (Map) SLAPI.load("RealSleepData");
		} catch (Exception e) {
			log.warning("Could not decrease sleep! Reason: Could not load file. Try reloading.");
		}
		
		// Go through every single player
		
		for (int i = 0; i < players.length; i++) {
			if (!players[i].hasPermission("RealSleep.false")) {
				if (data.containsKey(players[i].getName())) {
					
				}
				else {
					log.warning("Could not decrease " + players[i].getName() + "'s sleep! Reason: Could not find personal sleep. Try reconnecting.");
				}
			}
		}
		
		// Save the file
		
		try {
			SLAPI.save(data, "RealSleepData");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warning("Could not save RealSleepData. Reason: Failed to save file. Try reloading.");
		}
	}
}
