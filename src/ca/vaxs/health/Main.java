package ca.vaxs.health;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import ca.vaxs.health.listeners.HealthTab;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("[BetterHealthBar]: Plugin is loaded!");
		getServer().getPluginManager().registerEvents(new HealthTab(), this);
	}

	@Override
	public FileConfiguration getConfig() {
		return super.getConfig();
	}
	
}