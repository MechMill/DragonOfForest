
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonofforest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dragonofforest.client.renderer.TornadoRenderer;
import net.mcreator.dragonofforest.client.renderer.SlaimRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonofforestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DragonofforestModEntities.SLAIM.get(), SlaimRenderer::new);
		event.registerEntityRenderer(DragonofforestModEntities.TORNADO.get(), TornadoRenderer::new);
	}
}
