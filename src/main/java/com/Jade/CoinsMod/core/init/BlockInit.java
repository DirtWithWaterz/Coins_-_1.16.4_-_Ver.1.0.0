package com.Jade.CoinsMod.core.init;

import com.Jade.CoinsMod.CoinsMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			CoinsMod.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
					.hardnessAndResistance(0.75f, 0.5f)
					.harvestTool(ToolType.SHOVEL)
					.harvestLevel(-1)
					.sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(15f, 3f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.STONE)
					.setRequiresTool()));
}
