package com.tr.donsuzturk.dropprevention;

import org.bukkit.event.EventHandler;
import com.tr.donsuzturk.dropprevention.GroundTypeChecker;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.Listener;

public class InventoryClickListener implements Listener
{
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {
            final Player player = (Player)event.getWhoClicked();
            if (GroundTypeChecker.isOnAir(player)) {
                event.setCancelled(true); 
            }
        }
    }
}
