package com.zb.firstmod.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ObsidianIngot extends Item {
    private static EffectInstance effectInstance=new EffectInstance(Effects.POISON,20*3,1);
    private static Food food=(new Food.Builder())
            .hunger(20)
            .saturation(10)
            .effect(effectInstance,1)
            .build();

    public ObsidianIngot() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
