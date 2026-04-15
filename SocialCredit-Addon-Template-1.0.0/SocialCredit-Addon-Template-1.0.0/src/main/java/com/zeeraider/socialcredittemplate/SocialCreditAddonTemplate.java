package com.zeeraider.socialcredittemplate;

import com.zeeraider.socialcredittemplate.listener.ExamplePreChangeListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialCreditAddonTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        if (getServer().getPluginManager().getPlugin("SocialCredit") == null) {
            getLogger().severe("SocialCredit is required. Disabling addon.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getServer().getPluginManager().registerEvents(new ExamplePreChangeListener(), this);
        getLogger().info("SocialCreditAddonTemplate enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("SocialCreditAddonTemplate disabled.");
    }
}
