
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonofforest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dragonofforest.entity.TornadoEntity;
import net.mcreator.dragonofforest.entity.SlaimEntity;
import net.mcreator.dragonofforest.DragonofforestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonofforestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DragonofforestMod.MODID);
	public static final RegistryObject<EntityType<SlaimEntity>> SLAIM = register("slaim",
			EntityType.Builder.<SlaimEntity>of(SlaimEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SlaimEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TornadoEntity>> TORNADO = register("tornado",
			EntityType.Builder.<TornadoEntity>of(TornadoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TornadoEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SlaimEntity.init();
			TornadoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SLAIM.get(), SlaimEntity.createAttributes().build());
		event.put(TORNADO.get(), TornadoEntity.createAttributes().build());
	}
}
