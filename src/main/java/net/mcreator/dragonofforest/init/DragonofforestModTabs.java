
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonofforest.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DragonofforestModTabs {
	public static CreativeModeTab TAB_DRAGONOFFOREST;

	public static void load() {
		TAB_DRAGONOFFOREST = new CreativeModeTab("tabdragonofforest") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DragonofforestModItems.ZAKLADKADRAGONOFFOREST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
