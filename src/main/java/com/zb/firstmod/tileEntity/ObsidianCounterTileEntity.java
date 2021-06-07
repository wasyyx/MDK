package com.zb.firstmod.tileEntity;

import com.zb.firstmod.TileEntityTypeRegistry;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class ObsidianCounterTileEntity extends TileEntity {
    private int counter;

    public ObsidianCounterTileEntity() {
        super(TileEntityTypeRegistry.obsidianCounterTileEntity.get());
    }

    public int increase(){
        counter++;
        markDirty();
        return counter;
    }

    @Override
    public void read(CompoundNBT compoundNBT) {
        counter=compoundNBT.getInt("counter");
        super.read(compoundNBT);
    }

    @Override
    public CompoundNBT write(CompoundNBT compoundNBT) {
        compoundNBT.putInt("counter",counter);
        return super.write(compoundNBT);
    }
}
