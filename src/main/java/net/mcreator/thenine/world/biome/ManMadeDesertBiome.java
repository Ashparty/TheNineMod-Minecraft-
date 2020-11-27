
package net.mcreator.thenine.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import net.mcreator.thenine.block.ManMadeSandBlock;
import net.mcreator.thenine.TheNineModElements;

@TheNineModElements.ModElement.Tag
public class ManMadeDesertBiome extends TheNineModElements.ModElement {
	@ObjectHolder("the_nine:man_made_desert")
	public static final CustomBiome biome = null;
	public ManMadeDesertBiome(TheNineModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 12));
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0.3f).depth(0.1f).scale(0.2f).temperature(1f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.DESERT).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(ManMadeSandBlock.block.getDefaultState(),
							ManMadeSandBlock.block.getDefaultState(), ManMadeSandBlock.block.getDefaultState())));
			setRegistryName("man_made_desert");
			DefaultBiomeFeatures.addDeadBushes(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.CACTUS_CONFIG)
					.withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(6))));
		}
	}
}
