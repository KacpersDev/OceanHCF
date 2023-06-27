package org.oceanmc.classes;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class ClassesManager {

    public ClassesType validateClass(Player player) {
        PlayerInventory playerInventory = player.getInventory();

        if (playerInventory.getHelmet() == null
        || playerInventory.getChestplate() == null
        || playerInventory.getLeggings() == null
        || playerInventory.getBoots() == null) {
            return null;
        }

        if (playerInventory.getHelmet().getType().equals(Material.IRON_HELMET)
        || playerInventory.getChestplate().getType().equals(Material.IRON_CHESTPLATE)
        || playerInventory.getLeggings().getType().equals(Material.IRON_LEGGINGS)
        || playerInventory.getBoots().getType().equals(Material.IRON_BOOTS)) {
            return ClassesType.MINER;
        } else if (playerInventory.getHelmet().getType().equals(Material.GOLDEN_HELMET)
                || playerInventory.getChestplate().getType().equals(Material.GOLDEN_CHESTPLATE)
                || playerInventory.getLeggings().getType().equals(Material.GOLDEN_LEGGINGS)
                || playerInventory.getBoots().getType().equals(Material.GOLDEN_BOOTS)) {
            return ClassesType.BARD;
        } else if (playerInventory.getHelmet().getType().equals(Material.CHAINMAIL_HELMET)
                || playerInventory.getChestplate().getType().equals(Material.CHAINMAIL_CHESTPLATE)
                || playerInventory.getLeggings().getType().equals(Material.CHAINMAIL_LEGGINGS)
                || playerInventory.getBoots().getType().equals(Material.CHAINMAIL_BOOTS)) {
            return ClassesType.ROGUE;
        } else if (playerInventory.getHelmet().getType().equals(Material.LEATHER_HELMET)
                || playerInventory.getChestplate().getType().equals(Material.LEATHER_CHESTPLATE)
                || playerInventory.getLeggings().getType().equals(Material.LEATHER_LEGGINGS)
                || playerInventory.getBoots().getType().equals(Material.LEATHER_BOOTS)) {
            return ClassesType.ARCHER;
        }
        return null;
    }

    public void applyClass(Player player, ClassesType clazz) {
        Classes.playerClass.remove(player.getUniqueId(), clazz);
        Classes.playerClass.put(player.getUniqueId(), clazz);
    }
}
