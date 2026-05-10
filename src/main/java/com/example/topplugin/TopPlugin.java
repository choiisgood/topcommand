package com.example.topplugin;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class TopPlugin extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        var cmd = getCommand("top");
        if (cmd != null) {
            cmd.setExecutor(this);
        }
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use /top.");
            return true;
        }

        if (!player.hasPermission("topplugin.top")) {
            player.sendMessage("You don't have permission to use /top.");
            return true;
        }

        Location loc = player.getLocation();
        World world = player.getWorld();

        int surfaceY = world.getHighestBlockYAt(loc.getBlockX(), loc.getBlockZ());

        Location destination = new Location(
                world,
                loc.getX(),
                surfaceY + 1,
                loc.getZ(),
                loc.getYaw(),
                loc.getPitch()
        );

        player.teleport(destination);
        player.sendMessage("Teleported to the surface!");
        return true;
    }
}
