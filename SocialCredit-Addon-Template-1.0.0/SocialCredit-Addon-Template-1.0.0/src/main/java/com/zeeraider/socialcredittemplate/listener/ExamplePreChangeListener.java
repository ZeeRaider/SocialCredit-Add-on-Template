package com.zeeraider.socialcredittemplate.listener;

import com.example.socialcredit.api.event.SocialCreditPreChangeEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public final class ExamplePreChangeListener implements Listener {

    @EventHandler
    public void onSocialCreditPreChange(SocialCreditPreChangeEvent event) {
        // Example behaviour:
        // Cap very large penalties and rewrite the reason.
        if (event.getDelta() < -10) {
            event.setDelta(-10);
            event.setReason("Penalty capped by template addon");
        }
    }
}
