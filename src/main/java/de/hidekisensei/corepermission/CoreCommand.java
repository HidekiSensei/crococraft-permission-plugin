package de.hidekisensei.corepermission;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.checkerframework.checker.nullness.qual.NonNull;

public class CoreCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, @NonNull Command command, @NonNull String label, String @NonNull [] args) {
        sender.sendMessage("§6CrococraftPermissions §alive!");
        sender.sendMessage("§7/core help für mehr Commands");
        return true;
    }
}
