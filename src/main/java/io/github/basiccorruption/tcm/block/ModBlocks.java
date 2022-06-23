package io.github.basiccorruption.tcm.block;

import io.github.basiccorruption.tcm.TheChemistMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block LITHIUM_BLOCK = registerBlock("lithium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().strength(6f)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TheChemistMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TheChemistMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        TheChemistMod.LOGGER.info("Registering blocks...");
    }
}
