
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonofforest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.dragonofforest.item.ZakladkadragonofforestItem;
import net.mcreator.dragonofforest.DragonofforestMod;

public class DragonofforestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonofforestMod.MODID);
	public static final RegistryObject<Item> ZAKLADKADRAGONOFFOREST = REGISTRY.register("zakladkadragonofforest",
			() -> new ZakladkadragonofforestItem());
	public static final RegistryObject<Item> SLAIM = REGISTRY.register("slaim_spawn_egg", () -> new ForgeSpawnEggItem(DragonofforestModEntities.SLAIM,
			-12761885, -13288227, new Item.Properties().tab(DragonofforestModTabs.TAB_DRAGONOFFOREST)));
	public static final RegistryObject<Item> TORNADO = REGISTRY.register("tornado_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonofforestModEntities.TORNADO, -2302360, -724833,
					new Item.Properties().tab(DragonofforestModTabs.TAB_DRAGONOFFOREST)));
	public static final RegistryObject<Item> GOLEMBIG = REGISTRY.register("golembig_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonofforestModEntities.GOLEMBIG, -10066330, -26368,
					new Item.Properties().tab(DragonofforestModTabs.TAB_DRAGONOFFOREST)));
}
