// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bone_bottom;
	private final ModelPart bone_bottom_mid;
	private final ModelPart bone_top_mid;
	private final ModelPart bone_top;
	private final ModelPart bone_eye;

	public Modelcustom_model(ModelPart root) {
		this.bone_bottom = root.getChild("bone_bottom");
		this.bone_bottom_mid = root.getChild("bone_bottom_mid");
		this.bone_top_mid = root.getChild("bone_top_mid");
		this.bone_top = root.getChild("bone_top");
		this.bone_eye = root.getChild("bone_eye");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone_bottom = partdefinition.addOrReplaceChild("bone_bottom", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_bottom_mid = partdefinition.addOrReplaceChild("bone_bottom_mid", CubeListBuilder.create()
				.texOffs(11, 41).addBox(-7.0F, -16.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_top_mid = partdefinition.addOrReplaceChild("bone_top_mid", CubeListBuilder.create()
				.texOffs(2, 31).addBox(-11.0F, -24.0F, -11.0F, 22.0F, 8.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_top = partdefinition.addOrReplaceChild("bone_top", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-15.0F, -32.0F, -15.0F, 30.0F, 8.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_eye = partdefinition.addOrReplaceChild("bone_eye", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_eye_r1 = bone_eye
				.addOrReplaceChild("cube_eye_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -23.0F, -7.0F, 0.0F, 6.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone_bottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone_bottom_mid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone_top_mid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone_top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone_eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone_top.yRot = ageInTicks;
		this.bone_bottom.yRot = ageInTicks / 20.f;
		this.bone_bottom_mid.yRot = ageInTicks;
		this.bone_top_mid.yRot = ageInTicks / 20.f;
	}
}