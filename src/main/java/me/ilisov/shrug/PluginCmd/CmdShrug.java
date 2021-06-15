package me.ilisov.shrug.PluginCmd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdShrug implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("Shrug.shrug")) {
            sender.sendMessage("¯\\_(ツ)_/¯");
        } else {
            sender.sendMessage(ChatColor.RED + "You don't have permission");
        }

        return false;
    }
}
