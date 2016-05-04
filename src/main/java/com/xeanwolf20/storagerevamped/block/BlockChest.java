package com.xeanwolf20.storagerevamped.block;

import com.xeanwolf20.storagerevamped.CreativeTab.CreativeTabSR;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;

public abstract class BlockChest extends BlockSR implements ITileEntityProvider
{
    public BlockChest()
    {
        super();
        setHardness(25.0f);
        setResistance(120.0f);
        setStepSound(SoundType.METAL);
        setCreativeTab(CreativeTabSR.tabSrItems);
        setHarvestLevel("Pickaxe", 2);
    }
}
