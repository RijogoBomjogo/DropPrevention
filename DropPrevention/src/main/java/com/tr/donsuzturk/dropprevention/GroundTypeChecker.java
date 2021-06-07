package com.tr.donsuzturk.dropprevention;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;

public interface GroundTypeChecker
{
    static boolean isOnAir(final Player player) {
        return player.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() == Material.AIR;
    }
}
