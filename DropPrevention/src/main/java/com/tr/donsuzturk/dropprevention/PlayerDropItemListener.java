package com.tr.donsuzturk.dropprevention;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import com.tr.donsuzturk.dropprevention.GroundTypeChecker;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.Listener;

public class PlayerDropItemListener implements Listener
{
    @EventHandler
    public void onPlayerDropItem(final PlayerDropItemEvent event) {
        final Player player = event.getPlayer();
        if (GroundTypeChecker.isOnAir(player)) {
            event.setCancelled(true);
        }
    }
}
