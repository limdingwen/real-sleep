package com.github.limdingwen.RealSleep;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.command.CommandSender;

public class SleepRefresher {
	static Logger log;
	
	public static boolean regain(String name) {
		log = Logger.getLogger("RealSleepRefresher");
		Map<String, Float> data = new HashMap<String, Float>();
		
		try {
			data = (Map) SLAPI.load("RealSleepData");
		} catch (Exception e) {
			log.warning("Cannot regain sleep! Reason: Cannot load RealSleepData.");
			
			return false;
		}
		
		if (data.containsKey(name)) {
			Float tempSleep = data.get(name);
			tempSleep = 100.0f;
			data.put(name, tempSleep);
		}
		else {
			log.warning("Cannot regain sleep! Reason: Cannot find personal data to edit.");
			
			return false;
		}
		
		try {
			SLAPI.save(data, "RealSleepData");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warning("Cannnot regain sleep! Reason: Cannot save data.");
			
			return false;
		}
		
		SleepEffect.refreshEffects();
		
		return true;
	}
}
