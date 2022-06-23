package io.github.basiccorruption.tcm.item;

import io.github.basiccorruption.tcm.TheChemistMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    private static Item registeritem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheChemistMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TheChemistMod.LOGGER.info("Registering mod items.");
    }
}
