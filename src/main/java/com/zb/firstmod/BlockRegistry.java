package com.zb.firstmod;

import com.zb.firstmod.block.ObsidianBlock;
import com.zb.firstmod.block.ObsidianFrame;
import com.zb.firstmod.block.ObsidianRubikCube;
import com.zb.firstmod.block.RandomBlock;
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
    public static RegistryObject<Block> obsidianRubikCube=BLOCKS.register("obsidian_rubik_cube",  ()->{
        return new ObsidianRubikCube();
    });
    public static RegistryObject<Block> obsidianFrame=BLOCKS.register("obsidian_frame",  ()->{
        return new ObsidianFrame();
    });
    public static RegistryObject<Block> randomBlock=BLOCKS.register("random_block",  ()->{
        return new RandomBlock();
    });

}
