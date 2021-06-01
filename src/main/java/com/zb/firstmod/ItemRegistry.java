package com.zb.firstmod;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS=new DeferredRegister(ForgeRegistries.ITEMS,"firstmod");
    RegistryObject<Item> obsidianIngot= ITEMS.register(
           "obsidian_Ingot",()->{return new ObsidianIngot();}
    );
}
