package com.github.limdingwen.RealSleep;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.entity.Player;

public class SleepChecker {	
	Logger log;
	
	public float getSleep(Player player) {
		log = Logger.getLogger("RealSleepChecker");
		
		Map<String, Float> data = new HashMap<String, Float>();
		
		try {
			data = (Map) SLAPI.load("RealSleepData");
		} catch (Exception e) {
			log.warning("Cannot find RealSleepData! Data not checked. Reload to resolve.");
			
			return (Float) null;
		}
		
		if (data.containsKey(player.getName())) {
			return data.get(player.getName());
		}
		else return (Float) null;
	}
}