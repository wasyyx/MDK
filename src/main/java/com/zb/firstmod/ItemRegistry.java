package com.zb.firstmod;

import com.zb.firstmod.food.ObsidianApple;
import com.zb.firstmod.sword.ObsidianSword;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
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
    /**
     * 黑耀石方块对应的黑曜石方块物品
     */
    public  static RegistryObject<BlockItem> obsidianBlock=ITEMS.register("obsidian_block",
            ()->{return new BlockItem(BlockRegistry.obsidianBlock.get(),new Item.Properties().group(ModGroup.obsidianGroup));
        });
}
