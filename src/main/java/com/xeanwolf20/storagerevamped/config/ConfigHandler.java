package com.xeanwolf20.storagerevamped.config;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static void init(File file)
    {
        Configuration config = new Configuration(file);

        config.load();

        int test = config.get("useless stuff", "example", 5).getInt();
        String test2 = config.get("useless stuff", "Some text", "Default text").getString();

        config.save();

        System.out.println(test2 + ": " + test);
    }

}
