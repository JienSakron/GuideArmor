package com.jien.guidearmor.common.armor.model;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ModelNetheriteMountainCharacterArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("guidearmor", "textures/models/armor/netherite_mountain_character_armor"), "main");
	public final ModelPart bipedHead;
	public final ModelPart bipedBody;
	public final ModelPart bipedRightArm;
	public final ModelPart bipedLeftArm;
	public final ModelPart bipedLeftLeg;
	public final ModelPart bipedRightLeg;

	public ModelNetheriteMountainCharacterArmor(ModelPart root) {
		this.bipedHead = root.getChild("bipedHead");
		this.bipedBody = root.getChild("bipedBody");
		this.bipedRightArm = root.getChild("bipedRightArm");
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.bipedLeftLeg = root.getChild("bipedLeftLeg");
		this.bipedRightLeg = root.getChild("bipedRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("bipedHead", CubeListBuilder.create().texOffs(36, 0).addBox(-4.0F, -8.7F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.56F))
		.texOffs(0, 0).addBox(-4.0F, -8.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F))
		.texOffs(0, 32).addBox(-6.0F, -8.2F, -3.5F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.01F))
		.texOffs(0, 32).mirror().addBox(4.0F, -8.2F, -3.5F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(36, 32).addBox(0.0F, -15.5564F, -2.3549F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(28, 36).addBox(-1.0F, -14.6F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(25, 22).addBox(-4.0F, 0.3F, -4.2F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone_r1 = bipedHead.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(36, 32).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.5564F, 0.1451F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone2_r1 = bipedHead.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -4.0F, -2.0F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -11.5F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone2_r2 = bipedHead.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -2.5F, -4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.4113F, 4.2015F, 0.0F, 0.1745F, -1.5708F));

		PartDefinition armorHead_r1 = bipedHead.addOrReplaceChild("armorHead_r1", CubeListBuilder.create().texOffs(42, 107).addBox(-4.0F, -4.0F, -0.5F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(0.0F, 4.1F, 5.6F, 0.48F, 0.0F, 0.0F));

		PartDefinition armorHead_r2 = bipedHead.addOrReplaceChild("armorHead_r2", CubeListBuilder.create().texOffs(41, 101).addBox(-5.5F, -0.5F, 0.5F, 11.0F, 5.0F, 1.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(2.6F, 0.6F, 6.1F, 0.0F, 1.5708F, -0.5672F));

		PartDefinition armorHead_r3 = bipedHead.addOrReplaceChild("armorHead_r3", CubeListBuilder.create().texOffs(41, 89).addBox(-7.0F, -2.0881F, -1.3918F, 11.0F, 5.0F, 1.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(1.8333F, 1.1F, 6.4594F, 0.2182F, 0.6109F, 0.0F));

		PartDefinition armorHead_r4 = bipedHead.addOrReplaceChild("armorHead_r4", CubeListBuilder.create().texOffs(41, 89).mirror().addBox(-3.419F, -1.6122F, -0.3546F, 11.0F, 5.0F, 1.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(-1.987F, 1.1F, 5.6125F, 0.1571F, -0.807F, 0.0758F));

		PartDefinition armorHead_r5 = bipedHead.addOrReplaceChild("armorHead_r5", CubeListBuilder.create().texOffs(41, 101).mirror().addBox(-5.5F, -0.5F, 0.5F, 11.0F, 5.0F, 1.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.6F, 6.1F, 0.0F, -1.5708F, 0.5672F));

		PartDefinition cube_r1 = bipedHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.5F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -6.0F, -3.5F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r2 = bipedHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -3.5F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -6.0F, -3.0F, 0.0F, -1.1345F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create().texOffs(54, 72).addBox(-1.5F, 4.7F, -4.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
		.texOffs(57, 52).addBox(-2.5F, 8.0F, -3.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.8F))
		.texOffs(57, 28).addBox(-3.5F, -0.5F, -3.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.8F))
		.texOffs(0, 16).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armo_r1 = bipedBody.addOrReplaceChild("armo_r1", CubeListBuilder.create().texOffs(57, 78).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 5.8F, -3.2F, 0.0F, 0.0F, -0.3054F));

		PartDefinition armo_r2 = bipedBody.addOrReplaceChild("armo_r2", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.8F, -3.2F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create().texOffs(12, 32).addBox(-5.4F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
		.texOffs(28, 65).mirror().addBox(-4.7F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition armorRightArm_r1 = bipedRightArm.addOrReplaceChild("armorRightArm_r1", CubeListBuilder.create().texOffs(33, 1).mirror().addBox(-0.5F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6F, -2.3F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition armorRightArm_r2 = bipedRightArm.addOrReplaceChild("armorRightArm_r2", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6F, -2.3F, 0.0F, 0.0F, 0.0F, 1.0908F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(1.4F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(28, 65).addBox(0.7F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition armorLeftArm_r1 = bipedLeftArm.addOrReplaceChild("armorLeftArm_r1", CubeListBuilder.create().texOffs(33, 1).addBox(-1.5F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, -2.3F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition armorLeftArm_r2 = bipedLeftArm.addOrReplaceChild("armorLeftArm_r2", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, -2.3F, 0.0F, 0.0F, 0.0F, -1.0908F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create().texOffs(0, 112).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.86F))
		.texOffs(0, 99).addBox(-2.0F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.88F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition cube_r3 = bipedLeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, -4).mirror().addBox(0.0F, -4.0F, 0.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 8.7F, -1.0F, 0.4138F, 0.3788F, 0.0716F));

		PartDefinition dontTouch_r1 = bipedLeftLeg.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.85F))
		.texOffs(0, 99).mirror().addBox(-2.0F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.89F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition cube_r4 = bipedRightLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, -4).addBox(0.0F, -4.0F, 0.0F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 8.7F, -1.0F, 0.4138F, -0.3788F, -0.0716F));

		PartDefinition dontTouch_r2 = bipedRightLeg.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(32, 50).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(-0.5F, 3.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.bipedHead.yRot = netHeadYaw * ((float)Math.PI / 180F);
		this.bipedHead.xRot = headPitch * ((float)Math.PI / 180F);
		this.bipedRightArm.xRot =  Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bipedLeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bipedLeftLeg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bipedRightLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bipedHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}