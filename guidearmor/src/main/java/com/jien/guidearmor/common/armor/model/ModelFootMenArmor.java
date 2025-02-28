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

public class ModelFootMenArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("guidearmor", "textures/models/armor/golden_footmen_armorlayer_1"), "main");
	public final ModelPart bipedHead;
	public final ModelPart bipedBody;
	public final ModelPart bipedRightArm;
	public final ModelPart bipedLeftArm;
	public final ModelPart bipedLeftLeg;
	public final ModelPart bipedRightLeg;

	public ModelFootMenArmor(ModelPart root) {
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
		.texOffs(41, 0).addBox(-4.0F, -4.1F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.7F))
		.texOffs(0, 0).addBox(-4.0F, -8.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F))
		.texOffs(0, 0).addBox(-1.1F, -12.8564F, -1.3549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.5F))
		.texOffs(0, 78).addBox(-3.6F, -10.9F, -3.6F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bipedHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(75, 22).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.1F, -13.0564F, 0.1451F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone2_r1 = bipedHead.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -2.0F, -3.0F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -13.0F, 1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone2_r2 = bipedHead.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -2.5F, -4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -12.1288F, 2.8195F, 0.0F, 0.2618F, 1.5708F));

		PartDefinition armorHead_r1 = bipedHead.addOrReplaceChild("armorHead_r1", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-4.0F, -1.5F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create().texOffs(63, 44).addBox(-4.0F, -0.5F, -2.8F, 8.0F, 5.0F, 6.0F, new CubeDeformation(1.1F))
		.texOffs(63, 65).addBox(-4.0F, 2.3F, -2.8F, 8.0F, 5.0F, 6.0F, new CubeDeformation(1.01F))
		.texOffs(0, 16).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-4.7F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition dontTouch_r1 = bipedRightArm.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(12, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition dontTouch_r2 = bipedRightArm.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(26, 21).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.52F)), PartPose.offsetAndRotation(2.4F, -2.9F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create().texOffs(28, 65).addBox(0.7F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition armorle_r1 = bipedLeftArm.addOrReplaceChild("armorle_r1", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(12, 32).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition dontTouch_r3 = bipedLeftArm.addOrReplaceChild("dontTouch_r3", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-1.0F, 4.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.52F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -3.7F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create().texOffs(0, 112).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.86F))
		.texOffs(0, 99).addBox(-2.0F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.88F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition dontTouch_r4 = bipedLeftLeg.addOrReplaceChild("dontTouch_r4", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.85F))
		.texOffs(0, 99).mirror().addBox(-2.0F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.89F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition dontTouch_r5 = bipedRightLeg.addOrReplaceChild("dontTouch_r5", CubeListBuilder.create().texOffs(32, 50).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(-0.5F, 3.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

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