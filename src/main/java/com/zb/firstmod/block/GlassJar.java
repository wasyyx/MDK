package com.zb.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlassJar extends Block {
    public GlassJar() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5).notSolid());
    }
}
