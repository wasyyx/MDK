package com.zb.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianOBJ extends Block {
    public ObsidianOBJ() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(5).notSolid());
    }
}
