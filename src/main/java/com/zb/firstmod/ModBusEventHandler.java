package com.zb.firstmod;

import com.zb.firstmod.backed_model.ObsidianHiddenBlockModel;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD,value= Dist.CLIENT)
public class ModBusEventHandler {
    //监听烘培模型事件
    @SubscribeEvent
    public static void onModelBaked(ModelBakeEvent event){
        for (BlockState blockstate:
             BlockRegistry.obsidianHiddenBlock.get().getStateContainer().getValidStates()) {
            //获取默认的IBakedModel
            ModelResourceLocation modelResourceLocation = BlockModelShapes.getModelLocation(blockstate);
            IBakedModel existingModel = event.getModelRegistry().get(modelResourceLocation);
            if (existingModel == null) {
                throw new RuntimeException("Did not find Obsidian Hidden in registry");
            } else if (existingModel instanceof ObsidianHiddenBlockModel) {
                throw new RuntimeException("Tried to replaceObsidian Hidden twice");
            } else {
                ObsidianHiddenBlockModel obsidianHiddenBlockModel = new ObsidianHiddenBlockModel(existingModel);
                event.getModelRegistry().put(modelResourceLocation, obsidianHiddenBlockModel);
            }
        }
    }
}
