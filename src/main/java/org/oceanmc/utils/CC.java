package org.oceanmc.utils;

import org.bukkit.ChatColor;

public class CC {

    @SuppressWarnings("ALL")
    public static String translate(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
