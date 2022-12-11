
package net.mcreator.dragonofforest.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.dragonofforest.procedures.GolembigModelProcedure;
import net.mcreator.dragonofforest.entity.GolembigEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GolembigRenderer extends GeoEntityRenderer<GolembigEntity> {
	public GolembigRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GolembigModelProcedure());
		this.shadowRadius = 3f;
	}

	@Override
	public RenderType getRenderType(GolembigEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
