package com.zb.firstmod;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "firstmod");
    public static RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", () -> {
        return new ObsidianIngot();
    });
}
