package mod.cockroach.entity.client;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mod.cockroach.entity.animations.ModAnimationDefinitions;
import mod.cockroach.entity.custom.CockroachEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import mod.cockroach.entity.custom.CockroachEntity;

public class CockroachModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Cockroach;
	private final ModelPart head;

	public CockroachModel(ModelPart root) {
		this.Cockroach = root.getChild("Cockroach");
		this.head = Cockroach.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Cockroach = partdefinition.addOrReplaceChild("Cockroach", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = Cockroach.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(1, 14)
						.addBox(-2.5F, -2.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(12, 11).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Antera = Head.addOrReplaceChild("Antera", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Wisker_r1 = Antera.addOrReplaceChild("Wisker_r1",
				CubeListBuilder.create().texOffs(-1, 25).addBox(2.0F, 1.75F, -7.0F, 3.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.1309F, -3.1416F));

		PartDefinition Wisker_r2 = Antera.addOrReplaceChild("Wisker_r2",
				CubeListBuilder.create().texOffs(-1, 25).addBox(1.0F, -1.75F, -7.0F, 3.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.1309F, 0.0F));

		PartDefinition Body = Cockroach.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(0, 12).addBox(-2.5F, -2.5F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Wings = Cockroach.addOrReplaceChild("Wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition InsideWings = Wings.addOrReplaceChild("InsideWings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightWing_r1 = InsideWings.addOrReplaceChild("RightWing_r1",
				CubeListBuilder.create().texOffs(4, 25).addBox(0.5F, 2.0F, -2.0F, 1.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0436F, -3.1416F));

		PartDefinition LeftWing_r1 = InsideWings.addOrReplaceChild("LeftWing_r1",
				CubeListBuilder.create().texOffs(8, 25).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0873F, 0.0F));

		PartDefinition OverlapWings = Wings.addOrReplaceChild("OverlapWings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition OverlapOne = OverlapWings.addOrReplaceChild("OverlapOne", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition OverLapWing_r1 = OverlapOne.addOrReplaceChild("OverLapWing_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -1.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, -0.1309F, 0.0F));

		PartDefinition OverlapTwo = OverlapWings.addOrReplaceChild("OverlapTwo", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition OverLapWing_r2 = OverlapTwo.addOrReplaceChild("OverLapWing_r2",
				CubeListBuilder.create().texOffs(14, 1).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.1309F, 0.0F));

		PartDefinition LeftLegs = Cockroach.addOrReplaceChild("LeftLegs", CubeListBuilder.create(),
				PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition Leg1 = LeftLegs.addOrReplaceChild("Leg1", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition Front_r1 = Leg1.addOrReplaceChild("Front_r1",
				CubeListBuilder.create().texOffs(18, 28).addBox(2.0F, 1.0F, -0.5F, 3.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.4363F));

		PartDefinition Leg2 = LeftLegs.addOrReplaceChild("Leg2", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition Middle_r1 = Leg2.addOrReplaceChild("Middle_r1",
				CubeListBuilder.create().texOffs(18, 28).addBox(2.0F, 1.0F, -2.25F, 3.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.4363F));

		PartDefinition Leg3 = LeftLegs.addOrReplaceChild("Leg3", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition Back_r1 = Leg3.addOrReplaceChild("Back_r1",
				CubeListBuilder.create().texOffs(18, 28).addBox(2.0F, 1.0F, -4.0F, 3.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.4363F));

		PartDefinition RightLegs = Cockroach.addOrReplaceChild("RightLegs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Leg4 = RightLegs.addOrReplaceChild("Leg4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Front_r2 = Leg4
				.addOrReplaceChild("Front_r2",
						CubeListBuilder.create().texOffs(18, 28).addBox(-4.0F, -2.0F, -0.5F, 3.0F, 0.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Leg5 = RightLegs.addOrReplaceChild("Leg5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Middle_r2 = Leg5
				.addOrReplaceChild("Middle_r2",
						CubeListBuilder.create().texOffs(18, 28).addBox(-4.0F, -2.0F, 1.25F, 3.0F, 0.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Leg6 = RightLegs.addOrReplaceChild("Leg6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Back_r2 = Leg6
				.addOrReplaceChild("Back_r2",
						CubeListBuilder.create().texOffs(18, 28).addBox(-4.0F, -2.0F, 3.0F, 3.0F, 0.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Cockroach.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Cockroach;
	}
}