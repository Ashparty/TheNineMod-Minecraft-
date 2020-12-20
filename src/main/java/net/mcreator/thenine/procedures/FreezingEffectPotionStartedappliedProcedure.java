package net.mcreator.thenine.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.thenine.TheNineModElements;

import java.util.Map;

@TheNineModElements.ModElement.Tag
public class FreezingEffectPotionStartedappliedProcedure extends TheNineModElements.ModElement {
	public FreezingEffectPotionStartedappliedProcedure(TheNineModElements instance) {
		super(instance, 365);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure FreezingEffectPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.OUT_OF_WORLD, (float) 1);
	}
}
