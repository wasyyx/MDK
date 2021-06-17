package com.zb.firstmod.backed_model;

import com.zb.firstmod.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraftforge.client.model.data.IModelData;
import net.minecraftforge.client.model.data.ModelDataMap;
import net.minecraftforge.client.model.data.ModelProperty;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class ObsidianHiddenBlockModel implements IBakedModel {
    IBakedModel defaultModel;
    //相当于是一个键
    public static ModelProperty<BlockState> COPIED_BLOCK=new ModelProperty<>();
    public ObsidianHiddenBlockModel(IBakedModel existingModel) {
        defaultModel = existingModel;
    }

    @Nonnull
    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, @Nonnull Random rand, @Nonnull IModelData extraData) {
        IBakedModel renderModel=defaultModel;
        if(extraData.hasProperty(COPIED_BLOCK)){
           BlockState copiedBlock = extraData.getData(COPIED_BLOCK);
           if(copiedBlock!=null){
               Minecraft mc=Minecraft.getInstance();
               BlockRendererDispatcher blockRendererDispatcher=mc.getBlockRendererDispatcher();
               renderModel=blockRendererDispatcher.getModelForState(copiedBlock);
           }
        }
        return renderModel.getQuads(state,side,rand,extraData);
    }

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand) {
        throw new AssertionError("IBakedModel::getQuads should never be called, only IForgeBakedModel::getQuads");
    }

    @Nonnull
    @Override
    //返回值传入getQuads中的extraData参数
    public IModelData getModelData(@Nonnull ILightReader world, @Nonnull BlockPos pos, @Nonnull BlockState state, @Nonnull IModelData tileData) {
        BlockState downBlockState=world.getBlockState(pos.down());
        ModelDataMap modelDataMap=new ModelDataMap.Builder().withInitial(COPIED_BLOCK,null).build();
        //下方为空气或隐藏方块则隐藏
        if(downBlockState.getBlock()== Blocks.AIR || downBlockState.getBlock()== BlockRegistry.obsidianHiddenBlock.get()){
            return modelDataMap;
        }
        modelDataMap.setData(COPIED_BLOCK,downBlockState);
        return modelDataMap;
    }

    @Override
    //控制是否开启环境光遮蔽
    public boolean isAmbientOcclusion() {
        return defaultModel.isAmbientOcclusion();
    }

    @Override
    //暂不明，应该和物品的渲染光有关
    public boolean func_230044_c_() {
        return defaultModel.func_230044_c_();
    }

    @Override
    //是否使用内置的渲染，返回Ture会使用ISTR渲染
    public boolean isBuiltInRenderer() {
        return defaultModel.isBuiltInRenderer();
    }

    @Override
    //控制掉落物是否是3D的
    public boolean isGui3d() {
        return defaultModel.isGui3d();
    }

    @Override
    //粒子效果材质
    public TextureAtlasSprite getParticleTexture() {
        return defaultModel.getParticleTexture();
    }

    @Override
    //获取模型的复写列表
    public ItemOverrideList getOverrides() {
        return defaultModel.getOverrides();
    }
}
