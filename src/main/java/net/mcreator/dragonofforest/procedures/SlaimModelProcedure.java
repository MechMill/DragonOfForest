package net.mcreator.dragonofforest.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dragonofforest.entity.SlaimEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class SlaimModelProcedure extends AnimatedGeoModel<SlaimEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SlaimEntity entity) {
		return new ResourceLocation("dragonofforest", "animations/slaim.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SlaimEntity entity) {
		return new ResourceLocation("dragonofforest", "geo/slaim.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SlaimEntity entity) {
		return new ResourceLocation("dragonofforest", "textures/entities/slaim.png");
		/**
		}
		@Override
		public void setCustomAnimations(SlaimEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
