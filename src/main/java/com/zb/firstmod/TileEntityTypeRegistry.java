package com.zb.firstmod;

import com.zb.firstmod.tileEntity.ObsidianCounterTileEntity;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * 方块实体注册类
 */
public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE_DEFERRED_REGISTER =
            new DeferredRegister<TileEntityType<?>>(ForgeRegistries.TILE_ENTITIES, "firstmod");
    public static RegistryObject<TileEntityType<ObsidianCounterTileEntity>> obsidianCounterTileEntity =
            TILE_ENTITY_TYPE_DEFERRED_REGISTER.register("obsidian_counter_tileentity", () -> {
        return TileEntityType.Builder.create(()->{
            return new ObsidianCounterTileEntity();
        }, BlockRegistry.obsidianCounter.get()).build(null);
    });
}
