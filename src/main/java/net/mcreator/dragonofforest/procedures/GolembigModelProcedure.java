package net.mcreator.dragonofforest.procedures;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.dragonofforest.entity.GolembigEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class GolembigModelProcedure extends AnimatedGeoModel<GolembigEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GolembigEntity entity) {
		return new ResourceLocation("dragonofforest", "animations/golembig.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GolembigEntity entity) {
		return new ResourceLocation("dragonofforest", "geo/golembig.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GolembigEntity entity) {
		return new ResourceLocation("dragonofforest", "textures/entities/golem_texture.png");
	}

	@Override
	public void setCustomAnimations(GolembigEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
