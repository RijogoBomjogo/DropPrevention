package com.tr.donsuzturk.dropprevention;

import com.tr.donsuzturk.dropprevention.InventoryClickListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import com.tr.donsuzturk.dropprevention.PlayerDropItemListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)new PlayerDropItemListener(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new InventoryClickListener(), (Plugin)this);
    }
}
