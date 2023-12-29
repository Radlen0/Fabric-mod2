package net.radlen.learningmodding;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningModding implements ModInitializer {
	public static  final String MOD_ID = "learningmodding";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Block JAR  = new Block(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.DECORATED_POT_SHATTER));

	@Override
	public void onInitialize() {
		Registry.register(Registries.BLOCK, new Identifier("learningmodding", "jar"), JAR);

		Registry.register(Registries.ITEM, new Identifier("learningmodding", "jar"), new BlockItem(JAR, new FabricItemSettings()));
	}
}