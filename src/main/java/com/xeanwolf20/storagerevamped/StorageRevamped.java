package com.xeanwolf20.storagerevamped;

import com.xeanwolf20.storagerevamped.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class StorageRevamped
{

    @Mod.Instance(Reference.MOD_ID)
    public static StorageRevamped instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
   {

   }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
