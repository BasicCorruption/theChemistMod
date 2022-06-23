package io.github.basiccorruption.tcm.item;

import io.github.basiccorruption.tcm.TheChemistMod;
import io.github.basiccorruption.tcm.itemgroup.TCMItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // TODO: First we will add all the elements that are metals. Check trello for list of metals.

    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item(new FabricItemSettings().group(TCMItemGroup.TCM_TAB)));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new FabricItemSettings().group(TCMItemGroup.TCM_TAB)));
    public static final Item LITHIUM_NUGGET = registerItem("lithium_nugget", new Item(new FabricItemSettings().group(TCMItemGroup.TCM_TAB)));
    public static final Item LITHIUM_DUST = registerItem("lithium_dust", new Item(new FabricItemSettings().group(TCMItemGroup.TCM_TAB)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheChemistMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TheChemistMod.LOGGER.info("Registering mod items.");
    }
}
