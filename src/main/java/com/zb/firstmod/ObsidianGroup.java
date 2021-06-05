package com.zb.firstmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ObsidianGroup extends ItemGroup {
    public ObsidianGroup() {
        super("obsidian_group");
    }

    /**
     * 创建创造模式物品栏图标
     * @return ItemStack
     */
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.obsidianIngot.get());
    }
}
