package net.mcreator.thenine.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.thenine.TheNineModElements;

import java.util.Map;

@TheNineModElements.ModElement.Tag
public class FreezingEffectPotionExpiresProcedure extends TheNineModElements.ModElement {
	public FreezingEffectPotionExpiresProcedure(TheNineModElements instance) {
		super(instance, 366);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure FreezingEffectPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 1);
	}
}
