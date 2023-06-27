package org.oceanmc.utils;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.oceanmc.OceanHCF;

import java.io.File;
import java.io.IOException;

public class ConfigFile {

    private final OceanHCF plugin;
    private final File file;
    private final FileConfiguration configuration;
    private final String directory;

    public ConfigFile(OceanHCF plugin, File file, FileConfiguration configuration, String directory) {
        this.plugin = plugin;
        this.file = file;
        this.configuration = configuration;
        this.directory = directory;
    }

    public void create(){
        if (!(this.file.exists())) {
            this.file.getParentFile().mkdir();
            this.plugin.saveResource(this.directory, false);
        }

        try {
            this.configuration.load(this.file);
        } catch (IOException | InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public File getFile() {
        return file;
    }

    public FileConfiguration getConfiguration() {
        return configuration;
    }

    public String getDirectory() {
        return directory;
    }
}
