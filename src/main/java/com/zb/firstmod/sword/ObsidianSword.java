package com.zb.firstmod.sword;

import com.zb.firstmod.ItemRegistry;
import com.zb.firstmod.ObsidianIngot;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class ObsidianSword extends SwordItem {
    private static IItemTier iItemTier=new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2000;
        }

        @Override
        public float getEfficiency() {
            return 10.0F;
        }

        @Override
        public float getAttackDamage() {
            return 20F;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 30;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegistry.obsidianIngot.get());
        }
    };
    public ObsidianSword() {
        super(iItemTier, 20, -2.4F, new Properties().group(ItemGroup.COMBAT));
    }
}
