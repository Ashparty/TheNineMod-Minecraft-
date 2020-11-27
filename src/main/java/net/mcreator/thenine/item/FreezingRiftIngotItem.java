
package net.mcreator.thenine.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.thenine.itemgroup.TheNineModItemGroup;
import net.mcreator.thenine.TheNineModElements;

@TheNineModElements.ModElement.Tag
public class FreezingRiftIngotItem extends TheNineModElements.ModElement {
	@ObjectHolder("the_nine:freezing_rift_ingot")
	public static final Item block = null;
	public FreezingRiftIngotItem(TheNineModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TheNineModItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("freezing_rift_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
