package com.zb.firstmod;

import com.zb.firstmod.food.ObsidianApple;
import com.zb.firstmod.sword.ObsidianSword;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "firstmod");
    /**
     * 物品注册
     */
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
     * 方块物品注册
     */
    public  static RegistryObject<BlockItem> obsidianBlock=ITEMS.register("obsidian_block",
            ()->{return new BlockItem(BlockRegistry.obsidianBlock.get(),new Item.Properties().group(ModGroup.obsidianGroup));
        });
    public  static RegistryObject<BlockItem> obsidianRubikCube=ITEMS.register("obsidian_rubik_cube",
            ()->{return new BlockItem(BlockRegistry.obsidianRubikCube.get(),new Item.Properties().group(ModGroup.obsidianGroup));
            });
    public  static RegistryObject<BlockItem> obsidianFrame=ITEMS.register("obsidian_frame",
            ()->{return new BlockItem(BlockRegistry.obsidianFrame.get(),new Item.Properties().group(ModGroup.obsidianGroup));
            });
    public  static RegistryObject<BlockItem> randmoBlock=ITEMS.register("random_block",
            ()->{return new BlockItem(BlockRegistry.randomBlock.get(),new Item.Properties().group(ModGroup.obsidianGroup));
            });
}
