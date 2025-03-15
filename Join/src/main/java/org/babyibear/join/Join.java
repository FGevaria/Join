package org.babyibear.join;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Join extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler
    public void onPlayerConnect(PlayerJoinEvent event){
        Player player = (Player) event.getPlayer();
        String message = "§f" + player.getName() + "§a" + " Join";
        event.setJoinMessage(message);
    }



    @EventHandler
    public void onPlayerUnconnect(PlayerQuitEvent event){
        Player player = (Player) event.getPlayer();
        String message = "§f" + player.getName() + "§c" + " Quit";
        event.setQuitMessage(message);
    }
}
