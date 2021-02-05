
package net.mcreator.thenine;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.thenine.item.AppleJuiceItem;

@TheNineModElements.ModElement.Tag
public class AppleJuiceRecipeBrewingRecipe extends TheNineModElements.ModElement {
	public AppleJuiceRecipeBrewingRecipe(TheNineModElements instance) {
		super(instance, 387);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.APPLE, (int) (1))), new ItemStack(AppleJuiceItem.block, (int) (1)));
	}
}
