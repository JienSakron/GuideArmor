package com.jien.guidearmor.common.armor.model;// Made with Blockbench 4.12.2
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

public class DiamondBlackChuiArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("guidearmor", "model/armor/black_chui_armor/diamond_black_chui_armor"), "main");
	private final ModelPart bipedHead;
	private final ModelPart bipedBody;
	private final ModelPart bipedRightArm;
	private final ModelPart bipedLeftArm;
	private final ModelPart bipedLeftLeg;
	private final ModelPart bipedRightLeg;

	public DiamondBlackChuiArmor(ModelPart root) {
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
		.texOffs(28, 36).addBox(-1.0F, -14.4F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(25, 22).addBox(-4.0F, 0.3F, -3.4F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 81).addBox(-4.5F, -0.5F, -2.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(1.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone_r1 = bipedHead.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(36, 32).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.5564F, 0.1451F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone2_r1 = bipedHead.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -4.0F, -2.0F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -11.5F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone2_r2 = bipedHead.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -2.5F, -4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.4113F, 4.2015F, 0.0F, 0.1745F, -1.5708F));

		PartDefinition cube_r1 = bipedHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.5F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -6.0F, -3.5F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r2 = bipedHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -3.5F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -6.0F, -3.0F, 0.0F, -1.1345F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create().texOffs(12, 32).addBox(-4.4F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition armorRightArm_r1 = bipedRightArm.addOrReplaceChild("armorRightArm_r1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1F, -1.6F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(0.4F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition armorLeftArm_r1 = bipedLeftArm.addOrReplaceChild("armorLeftArm_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1F, -1.6F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create().texOffs(0, 112).addBox(-1.9F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.86F))
		.texOffs(0, 99).addBox(-1.9F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.88F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition dontTouch_r1 = bipedLeftLeg.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false), PartPose.offsetAndRotation(0.6F, 3.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create().texOffs(0, 59).addBox(-2.1F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.85F))
		.texOffs(0, 99).mirror().addBox(-2.1F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.89F)).mirror(false), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition dontTouch_r2 = bipedRightLeg.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(32, 50).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(-0.6F, 3.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

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