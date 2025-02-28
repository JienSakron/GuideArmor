package com.jien.guidearmor.common;

import com.jien.guidearmor.GuideArmor;
import com.jien.guidearmor.common.armor.ModArmorItem;
import com.jien.guidearmor.common.armor.ModArmorMaterial;
import com.jien.guidearmor.common.item.GuideItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GuideArmor.MODID);
    public static final Supplier<GuideItem> GUIDE_ITEM = ITEMS.register("guide_item",() -> new GuideItem(new Item.Properties()));
    public static final RegistryObject<Item> FOOT_MEN_ARMOR_HELMET = ITEMS.register("foot_men_armor_helmet", () -> new ModArmorItem.GuideArmorHelmet(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FOOT_MEN_ARMOR_CHESTPLATE = ITEMS.register("foot_men_armor_chestplate", () -> new ModArmorItem.GuideArmorChestplate(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FOOT_MEN_ARMOR_LEGGINGS = ITEMS.register("foot_men_armor_leggings", () -> new ModArmorItem.GuideArmorLeggings(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FOOT_MEN_ARMOR_BOOTS = ITEMS.register("foot_men_armor_boots", () -> new ModArmorItem.GuideArmorBoots(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_MOUNTAIN_CHARACTER_HELMET = ITEMS.register("netherite_mountain_character_helmet", () -> new ModArmorItem.NetheriteMoutainCharacterArmorHelmet(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MOUNTAIN_CHARACTER_CHESTPLATE = ITEMS.register("netherite_mountain_character_chestplate", () -> new ModArmorItem.NetheriteMoutainCharacterArmorChestplate(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MOUNTAIN_CHARACTER_LEGGINGS = ITEMS.register("netherite_mountain_character_leggings", () -> new ModArmorItem.NetheriteMoutainCharacterArmorLeggings(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MOUNTAIN_CHARACTER_BOOTS = ITEMS.register("netherite_mountain_character_boots", () -> new ModArmorItem.NetheriteMoutainCharacterArmorBoots(ModArmorMaterial.GUIDE_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
