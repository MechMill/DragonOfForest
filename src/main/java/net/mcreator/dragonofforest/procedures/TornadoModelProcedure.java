package net.mcreator.dragonofforest.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dragonofforest.entity.TornadoEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class TornadoModelProcedure extends AnimatedGeoModel<TornadoEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(TornadoEntity entity) {
		return new ResourceLocation("dragonofforest", "animations/tornado.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(TornadoEntity entity) {
		return new ResourceLocation("dragonofforest", "geo/tornado.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(TornadoEntity entity) {
		return new ResourceLocation("dragonofforest", "textures/entities/sand.png");
		/**
		}
		@Override
		public void setCustomAnimations(TornadoEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
