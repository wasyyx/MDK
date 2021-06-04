package com.zb.firstmod;

import com.zb.firstmod.food.ObsidianApple;
import com.zb.firstmod.sword.ObsidianSword;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "firstmod");
    public static RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", () -> {
        return new ObsidianIngot();
    });
    public  static RegistryObject<Item> obsidianApple=ITEMS.register("obsidian_apple",
            ()->{return new ObsidianApple();
    });
    public  static RegistryObject<SwordItem> obsidianSword=ITEMS.register("obsidian_sword",
            ()->{return new ObsidianSword();
    });
}
