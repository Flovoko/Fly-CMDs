package de.florian.fly.main;

import de.florian.fly.commands.FlyCommand;
import de.florian.fly.commands.FlySpeedCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("flyspeed").setExecutor(new FlySpeedCommand());

        PluginManager pluginManager = Bukkit.getPluginManager();
    }

    @Override
    public void onDisable() {
        
    }
}
