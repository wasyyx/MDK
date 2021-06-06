package com.zb.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RandomBlock extends Block {
    public RandomBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }
}
