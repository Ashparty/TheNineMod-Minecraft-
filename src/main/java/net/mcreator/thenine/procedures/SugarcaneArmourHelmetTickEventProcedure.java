package net.mcreator.thenine.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thenine.TheNineModElements;

import java.util.Map;

@TheNineModElements.ModElement.Tag
public class SugarcaneArmourHelmetTickEventProcedure extends TheNineModElements.ModElement {
	public SugarcaneArmourHelmetTickEventProcedure(TheNineModElements instance) {
		super(instance, 371);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SugarcaneArmourHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 1));
	}
}
