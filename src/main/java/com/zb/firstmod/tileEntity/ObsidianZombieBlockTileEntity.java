package com.zb.firstmod.tileEntity;

import com.zb.firstmod.TileEntityTypeRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.Constants;

import javax.annotation.Nullable;

public class ObsidianZombieBlockTileEntity extends TileEntity implements ITickableTileEntity {
    private static boolean flag=false;
    private static  final int MAX_TIME=20*3;
    private  static int timer=0;
    public ObsidianZombieBlockTileEntity() {
        super(TileEntityTypeRegistry.obsidianZombieBlockTileEntity.get());
    }

    @Override
    public void tick() {
        //客户端放僵尸声音,播放声音也可以在服务端执行
        if(world.isRemote && flag){
            PlayerEntity player=world.getClosestPlayer(pos.getX(),pos.getY(),pos.getZ(),10,false);
            world.playSound(player,pos, SoundEvents.ENTITY_ZOMBIE_AMBIENT, SoundCategory.AMBIENT,1.0f,1.0f);
            flag=false;
        }
        //服务端处理数据
        if(!world.isRemote){
            if (timer == MAX_TIME) {
                flag = true;
                world.notifyBlockUpdate(pos, getBlockState(), getBlockState(), Constants.BlockFlags.BLOCK_UPDATE);
                flag = true;
                timer = 0;
            }
            timer++;
        }
    }
    //服务端发送数据
    @Nullable
    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        return new SUpdateTileEntityPacket(pos,1,getUpdateTag());
    }
    //客户端获取数据
    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        handleUpdateTag(pkt.getNbtCompound());
    }
    //区块刚被载入时调用的方法，为了让方块实体再游戏被载入时自动同步数据
    @Override
    public CompoundNBT getUpdateTag() {
//        CompoundNBT compoundNBT=new CompoundNBT();
        CompoundNBT compoundNBT=super.getUpdateTag();
        compoundNBT.putBoolean("flag",flag);
        return compoundNBT;
    }

    @Override
    public void handleUpdateTag(CompoundNBT tag) {
       flag= tag.getBoolean("flag");
    }
}
