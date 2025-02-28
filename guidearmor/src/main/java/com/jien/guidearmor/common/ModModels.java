package com.jien.guidearmor.common;

import com.jien.guidearmor.common.armor.model.ModelFootMenArmor;
import com.jien.guidearmor.common.armor.model.ModelNetheriteMountainCharacterArmor;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModModels {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelFootMenArmor.LAYER_LOCATION, ModelFootMenArmor::createBodyLayer);
        event.registerLayerDefinition(ModelNetheriteMountainCharacterArmor.LAYER_LOCATION,ModelNetheriteMountainCharacterArmor::createBodyLayer);
    }
}
