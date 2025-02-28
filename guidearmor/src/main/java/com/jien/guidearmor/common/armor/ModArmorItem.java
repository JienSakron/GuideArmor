package com.jien.guidearmor.common.armor;

import com.jien.guidearmor.common.armor.model.ModelFootMenArmor;
import com.jien.guidearmor.common.armor.model.ModelNetheriteMountainCharacterArmor;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import static net.minecraft.client.Minecraft.*;

public abstract class ModArmorItem extends ArmorItem {
    public ModArmorItem(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
        super(material, slot, new Properties());
    }
    public static class GuideArmorHelmet extends ModArmorItem {
        public GuideArmorHelmet(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.HELMET, properties);
        }
        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedHead,
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm",new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/golden_footmen_armorlayer_1.png";
        }
    }
    public static class GuideArmorChestplate extends ModArmorItem {

        public GuideArmorChestplate(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.CHESTPLATE, properties);
        }

        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedBody,
                                    "right_arm", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedRightArm,
                                    "left_arm",new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedLeftArm,
                                    "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/golden_footmen_armorlayer_1.png";
        }

    }
    public static class GuideArmorLeggings extends ModArmorItem {
        public GuideArmorLeggings(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.LEGGINGS, properties);
        }
        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head",new ModelPart(Collections.emptyList(), Collections.emptyMap()) ,
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm",new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_leg", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedRightLeg,
                                    "left_leg", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedLeftLeg)));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/golden_footmen_armorlayer_1.png";
        }
    }
    public static class GuideArmorBoots extends ModArmorItem {
        public GuideArmorBoots(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.BOOTS, properties);
        }
        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head",new ModelPart(Collections.emptyList(), Collections.emptyMap()) ,
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm",new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_leg", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedRightLeg,
                                    "left_leg", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedLeftLeg)));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/golden_footmen_armorlayer_1.png";
        }
    }

    public static class NetheriteMoutainCharacterArmorHelmet extends ModArmorItem {
        public NetheriteMoutainCharacterArmorHelmet(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.HELMET, properties);
        }
        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head", new ModelNetheriteMountainCharacterArmor<>(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedHead,
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm",new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/netherite_mountain_character_armor.png";
        }
    }
    public static class NetheriteMoutainCharacterArmorChestplate extends ModArmorItem {
        public NetheriteMoutainCharacterArmorChestplate(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.CHESTPLATE, properties);
        }

        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelNetheriteMountainCharacterArmor<>(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedBody,
                                    "right_arm", new ModelNetheriteMountainCharacterArmor<>(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedRightArm,
                                    "left_arm",new ModelNetheriteMountainCharacterArmor<>(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedLeftArm,
                                    "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/netherite_mountain_character_armor.png";
        }
    }
    public static class NetheriteMoutainCharacterArmorLeggings extends ModArmorItem {
        public NetheriteMoutainCharacterArmorLeggings(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.LEGGINGS, properties);
        }
        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head",new ModelPart(Collections.emptyList(), Collections.emptyMap()) ,
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm",new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_leg", new ModelNetheriteMountainCharacterArmor<>(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedRightLeg,
                                    "left_leg", new ModelNetheriteMountainCharacterArmor<>(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedLeftLeg)));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/netherite_mountain_character_armor.png";
        }
    }
    public static class NetheriteMoutainCharacterArmorBoots extends ModArmorItem {
        public NetheriteMoutainCharacterArmorBoots(ModArmorMaterial material, ArmorItem.Type slot, Properties properties) {
            super(ModArmorMaterial.GUIDE_ARMOR, Type.BOOTS, properties);
        }
        @Override
        public void  initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                @Override
                public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                            Map.of("head",new ModelPart(Collections.emptyList(), Collections.emptyMap()) ,
                                    "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "left_arm",new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                                    "right_leg", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedRightLeg,
                                    "left_leg", new ModelFootMenArmor(getInstance().getEntityModels().bakeLayer(ModelFootMenArmor.LAYER_LOCATION)).bipedLeftLeg)));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }
        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "guidearmor:textures/models/armor/netherite_mountain_character_armor.png";
        }
    }
}
