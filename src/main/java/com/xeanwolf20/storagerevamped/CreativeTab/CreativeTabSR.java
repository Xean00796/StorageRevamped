package com.xeanwolf20.storagerevamped.CreativeTab;


import com.xeanwolf20.storagerevamped.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSR
{
    public static final CreativeTabs SR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
