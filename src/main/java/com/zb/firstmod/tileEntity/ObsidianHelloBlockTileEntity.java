package com.zb.firstmod.tileEntity;

import com.zb.firstmod.TileEntityTypeRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.StringTextComponent;

public class ObsidianHelloBlockTileEntity extends TileEntity implements ITickableTileEntity {
    private static final int MAX_TIME=5*20;
    private static  int timer=0;
    public ObsidianHelloBlockTileEntity() {
        super(TileEntityTypeRegistry.obsidianHelloBlockTileEntity.get());
    }

    @Override
    public void tick() {
        if(!world.isRemote){
            if(timer==MAX_TIME){
                //获取这个方块位置周围10格的玩家实体
                PlayerEntity player=world.getClosestPlayer(pos.getX(),pos.getY(),pos.getZ(),10,false);
                //stringTextComponent不需要写lang文件
                StringTextComponent stringTextComponent=new StringTextComponent("欢迎来到旅店，我的朋友!");
                if(player!=null){
                    player.sendMessage(stringTextComponent);
                }
                timer=0;
            }
            timer++;
        }
    }
}
