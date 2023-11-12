package ca.vaxs.health.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Criterias;
import org.bukkit.scoreboard.DisplaySlot;

import net.md_5.bungee.api.ChatColor;

public class HealthTab implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Scoreboard health = Bukkit.getScoreboardManager().getNewScoreboard();
		Player player = event.getPlayer();
		
		Objective objective =  health.registerNewObjective(
				"health", Criterias.HEALTH
		);
		objective.setDisplayName(ChatColor.RED + "❤");
		objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		player.setScoreboard(health);
	}
	
}
