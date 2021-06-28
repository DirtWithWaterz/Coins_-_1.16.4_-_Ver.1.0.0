package com.Jade.CoinsMod.core.init;

import com.Jade.CoinsMod.CoinsMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
    		CoinsMod.MOD_ID);
    
    // normal coins
    public static final RegistryObject<Item> WOOD_COIN = ITEMS.register("wood_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> STONE_COIN = ITEMS.register("stone_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));

    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIAMOND_COIN = ITEMS.register("diamond_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> NETHERITE_COIN = ITEMS.register("netherite_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    // dirty coins
    public static final RegistryObject<Item> DIRTY_WOOD_COIN = ITEMS.register("dirty_wood_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIRTY_STONE_COIN = ITEMS.register("dirty_stone_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIRTY_COPPER_COIN = ITEMS.register("dirty_copper_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));

    public static final RegistryObject<Item> DIRTY_SILVER_COIN = ITEMS.register("dirty_silver_coin", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIRTY_GOLD_COIN = ITEMS.register("dirty_gold_coin", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIRTY_DIAMOND_COIN = ITEMS.register("dirty_diamond_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIRTY_NETHERITE_COIN = ITEMS.register("dirty_netherite_coin",
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    // other items
    
    // crucibles
    public static final RegistryObject<Item> EMPTY_CRUCIBLE = ITEMS.register("empty_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> SILVER_CRUCIBLE = ITEMS.register("raw_silver_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> GOLD_CRUCIBLE = ITEMS.register("raw_gold_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> DIAMOND_CRUCIBLE = ITEMS.register("raw_diamond_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> NETHERITE_CRUCIBLE = ITEMS.register("raw_netherite_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    // melted crucibles
    public static final RegistryObject<Item> MELTED_SILVER_CRUCIBLE = ITEMS.register("melted_silver_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> MELTED_GOLD_CRUCIBLE = ITEMS.register("melted_gold_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> MELTED_DIAMOND_CRUCIBLE = ITEMS.register("melted_diamond_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> MELTED_NETHERITE_CRUCIBLE = ITEMS.register("melted_netherite_crucible", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    // wax mold
    public static final RegistryObject<Item> WAX_CHUNK = ITEMS.register("wax_chunk", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    public static final RegistryObject<Item> WAX_COIN_MOLD = ITEMS.register("wax_coin_mold", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    // carving knife
    public static final RegistryObject<Item> CARVING_KNIFE = ITEMS.register("carving_knife", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    // chisel
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    //ingots
    public static final RegistryObject<Item> DIAMOND_INGOT = ITEMS.register("diamond_ingot", 
    		() -> new Item(new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
    
    
    // block Items
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
    		() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(CoinsMod.JADESCOINS_GROUP)));
}