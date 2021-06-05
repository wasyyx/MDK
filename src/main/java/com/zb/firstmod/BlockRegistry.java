package com.zb.firstmod;

import com.zb.firstmod.block.ObsidianBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS=
            new DeferredRegister<Block>(ForgeRegistries.BLOCKS,"firstmod");
    public static RegistryObject<Block> obsidianBlock=BLOCKS.register("obsidian_block",  ()->{
        return new ObsidianBlock();
    });

}
