package org.oceanmc;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.oceanmc.classes.ClassesManager;
import org.oceanmc.utils.ConfigFile;

import java.io.File;

public final class OceanHCF extends JavaPlugin {

    private ConfigFile configuration;
    private ClassesManager classesManager;

    @Override
    public void onEnable() {
        this.configuration();
        this.command();
        this.listener();

        this.classesManager = new ClassesManager();
    }

    @Override
    public void onDisable() {

    }

    private void command(){}

    private void listener(){}

    private void configuration(){
        this.configuration = new ConfigFile(this, new File(getDataFolder(), "configuration.yml"),
                new YamlConfiguration(), "configuration.yml");


        this.configuration.create();
    }

    public ConfigFile getConfiguration() {
        return configuration;
    }

    public ClassesManager getClassesManager() {
        return classesManager;
    }
}

