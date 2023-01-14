package net.scaredrabbit.immersiverecipes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.scaredrabbit.immersiverecipes.ImmersiveRecipes;

public class ModItems {


    public static final Item RAW_NETHERITE = registerItem("raw_netherite",
            new Item(new FabricItemSettings().group(ModItemGroup.NETHERITE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ImmersiveRecipes.MOD_ID, name), item);
    }

    public static void registerModItems() {
            ImmersiveRecipes.LOGGER.debug("Registering Mod Items for " + ImmersiveRecipes.MOD_ID);
        }
    }

