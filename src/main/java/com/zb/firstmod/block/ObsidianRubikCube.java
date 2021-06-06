package com.zb.firstmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class ObsidianRubikCube extends Block {
    //创建了一个整型方块状态
    private static IntegerProperty STATE= IntegerProperty.create("face",0,1);
    public ObsidianRubikCube() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5)
        );
        //设置默认状态，可以不用设置
        this.setDefaultState(this.getStateContainer().getBaseState().with(STATE,1));
    }
    //给黑曜石魔方添加状态,此方法应该初始化自动调用，父类Block也有该方法，但函数体为空
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder){
        builder.add(STATE);
        super.fillStateContainer(builder);
    }
}
