package com.zb.firstmod;

import com.zb.firstmod.block.*;
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
    public static RegistryObject<Block> glassJar=BLOCKS.register("glass_jar",  ()->{
        return new GlassJar();
    });
    public static RegistryObject<Block> obsidianOBJ=BLOCKS.register("obsidian_obj",  ()->{
        return new ObsidianOBJ();
    });
    public static RegistryObject<Block> obsidianCounter=BLOCKS.register("obsidian_counter",  ()->{
        return new ObsidianCounter();
    });
    public static RegistryObject<Block> obsidianHelloBlock=BLOCKS.register("obsidian_hello_block",  ()->{
        return new ObsidianHelloBlock();
    });
}
