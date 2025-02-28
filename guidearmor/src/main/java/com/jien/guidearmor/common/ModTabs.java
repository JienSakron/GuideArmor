package com.jien.guidearmor.common;

import com.jien.guidearmor.GuideArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            GuideArmor.MODID);
    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
            tabData.accept(ModItems.FOOT_MEN_ARMOR_HELMET.get());
            tabData.accept(ModItems.FOOT_MEN_ARMOR_CHESTPLATE.get());
            tabData.accept(ModItems.FOOT_MEN_ARMOR_LEGGINGS.get());
            tabData.accept(ModItems.FOOT_MEN_ARMOR_BOOTS.get());

            tabData.accept(ModItems.NETHERITE_MOUNTAIN_CHARACTER_HELMET.get());
            tabData.accept(ModItems.NETHERITE_MOUNTAIN_CHARACTER_CHESTPLATE.get());
            tabData.accept(ModItems.NETHERITE_MOUNTAIN_CHARACTER_LEGGINGS.get());
            tabData.accept(ModItems.NETHERITE_MOUNTAIN_CHARACTER_BOOTS.get());
        }
    }

}
