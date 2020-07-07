package me.robertlit.babymobremover;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class BabyMobRemover extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Zombie) {
            ((Zombie) entity).setBaby(false);
        } else if (entity instanceof Zoglin) {
            ((Zoglin) entity).setBaby(false);
        } else if (entity instanceof Piglin) {
            ((Piglin) entity).setBaby(false);
        }
    }
}
