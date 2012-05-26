package com.github.limdingwen.RealSleep;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SleepChecker {	
	static Logger log;
	
	public static Float getSleep(CommandSender sender) {
		log = Logger.getLogger("RealSleepChecker");
		
		Map<String, Float> data = new HashMap<String, Float>();
		
		try {
			data = (Map) SLAPI.load("RealSleepData");
		} catch (Exception e) {
			log.warning("Cannot find RealSleepData! Data not checked. Reload to resolve.");
			
			return null;
		}
		
		if (data.containsKey(sender.getName())) {
			return data.get(sender.getName());
		}
		else return null;
	}
}