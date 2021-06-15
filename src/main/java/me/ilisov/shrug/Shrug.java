package me.ilisov.shrug;

import me.ilisov.shrug.PluginCmd.CmdShrug;
import org.bukkit.plugin.java.JavaPlugin;

public final class Shrug extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Shrug enable");
        getCommand("shrug").setExecutor(new CmdShrug());
    }

    @Override
    public void onDisable() {
        getLogger().info("Shrug disable, А ты чего ожидал?");
    }
}
