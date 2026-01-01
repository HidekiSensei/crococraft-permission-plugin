package de.hidekisensei.corepermission;

import org.bukkit.plugin.java.JavaPlugin;

public final class CorePermissionsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CrococraftPermissions Core gestartet! 🎉");
        getCommand("core").setExecutor(new CoreCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("CrococraftPermissions Core gestoppt.");
    }
}