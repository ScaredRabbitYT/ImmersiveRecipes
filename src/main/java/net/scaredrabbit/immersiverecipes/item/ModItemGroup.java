package net.scaredrabbit.immersiverecipes.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.scaredrabbit.immersiverecipes.ImmersiveRecipes;

public class ModItemGroup{
    public static final ItemGroup NETHERITE = FabricItemGroupBuilder.build(new Identifier(ImmersiveRecipes.MOD_ID, "netherite"),
            () -> new ItemStack(ModItems.RAW_NETHERITE));
}
