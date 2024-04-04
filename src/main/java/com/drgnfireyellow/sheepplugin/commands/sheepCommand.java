package com.drgnfireyellow.sheepplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.Location;
import org.bukkit.World;

public class sheepCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage("Baaaaa!");
            Player player = (Player) sender;
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SHEEP);
        }
        return false;
    }
}
