package com.drgnfireyellow.sheepplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import com.drgnfireyellow.sheepplugin.commands.sheepCommand;

public class sheepplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getCommand("sheep").setExecutor(new sheepCommand());
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Are you a sheep???");
    }

}
