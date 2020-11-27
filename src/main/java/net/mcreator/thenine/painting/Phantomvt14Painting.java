
package net.mcreator.thenine.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.thenine.TheNineModElements;

@TheNineModElements.ModElement.Tag
public class Phantomvt14Painting extends TheNineModElements.ModElement {
	public Phantomvt14Painting(TheNineModElements instance) {
		super(instance, 11);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 32).setRegistryName("phantomvt_14"));
	}
}
