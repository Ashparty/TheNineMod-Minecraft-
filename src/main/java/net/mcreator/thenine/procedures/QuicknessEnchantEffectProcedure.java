package net.mcreator.thenine.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.thenine.enchantment.QuicknessEnchantment;
import net.mcreator.thenine.TheNineModElements;
import net.mcreator.thenine.TheNineMod;

import java.util.Map;
import java.util.HashMap;

@TheNineModElements.ModElement.Tag
public class QuicknessEnchantEffectProcedure extends TheNineModElements.ModElement {
	public QuicknessEnchantEffectProcedure(TheNineModElements instance) {
		super(instance, 375);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheNineMod.LOGGER.warn("Failed to load dependency entity for procedure QuicknessEnchantEffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(QuicknessEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 1, (false), (false)));
			} else if (((EnchantmentHelper.getEnchantmentLevel(QuicknessEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 2, (false), (false)));
			} else if (((EnchantmentHelper.getEnchantmentLevel(QuicknessEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 3, (false), (false)));
			} else if (((EnchantmentHelper.getEnchantmentLevel(QuicknessEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 4)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 4, (false), (false)));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
