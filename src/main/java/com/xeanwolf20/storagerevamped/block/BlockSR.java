package com.xeanwolf20.storagerevamped.block;


import com.xeanwolf20.storagerevamped.CreativeTab.CreativeTabSR;
import com.xeanwolf20.storagerevamped.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public class BlockSR extends Block
{
    public BlockSR(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabSR.tabSrItems);
    }

    public BlockSR()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
