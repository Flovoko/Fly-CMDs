package de.florian.fly.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(!player.getAllowFlight()) {
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendMessage("§aFlug Aktiviert");
            }else{
                player.setAllowFlight(false);
                player.setFlying(false);
                player.sendMessage("§cFlug Deaktiviert");
            }
        }else {
            sender.sendMessage("Um diesen Command Auszuführen musst du ein Spieler sein!");
        }
        return false;
    }
}
