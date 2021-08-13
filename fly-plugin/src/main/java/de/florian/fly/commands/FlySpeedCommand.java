package de.florian.fly.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlySpeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("minecraft.*")) {
                if(args.length == 0) {
                    player.sendMessage("§cBenutzung: /flyspeed [slow,medium,high] !");
                }else if(args.length == 1){
                    if(args[0].equalsIgnoreCase("slow")) {
                        player.setFlySpeed((float) 0.1);
                        player.sendMessage("§eFlySpeed §aSLOW§e !");
                    }else if(args[0].equalsIgnoreCase("medium")) {
                        player.setFlySpeed(0.5F);
                        player.sendMessage("§eFlySpeed §aMEDIUM§e !");
                    }else if(args[0].equalsIgnoreCase("high")) {
                        player.setFlySpeed(1);
                        player.sendMessage("§eFlySpeed §aHIGH§e !");
                    }else {
                        player.sendMessage("§cBenutzung: /flyspeed [slow,medium,high] !");
                    }
                }
            }else {
                player.sendMessage("§cDu verfügst nicht über die Nötigen Rechte (minecraft.*)");
            }
        }else {
            sender.sendMessage("Um diesen Command Auszuführen musst du ein Spieler sein!");
        }
        return false;
    }
}
