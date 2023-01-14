package net.scaredrabbit.immersiverecipes;

import net.fabricmc.api.ModInitializer;
import net.scaredrabbit.immersiverecipes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmersiveRecipes implements ModInitializer {

	public static final String MOD_ID = "immersiverecipes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
