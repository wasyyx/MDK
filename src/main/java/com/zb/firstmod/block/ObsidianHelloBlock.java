package com.zb.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianHelloBlock extends Block {
    public ObsidianHelloBlock(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }
}
