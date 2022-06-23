package io.github.basiccorruption.tcm.itemgroup;

import io.github.basiccorruption.tcm.TheChemistMod;
import io.github.basiccorruption.tcm.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TCMItemGroup {
    public static final ItemGroup TCM_TAB = FabricItemGroupBuilder.build(new Identifier(TheChemistMod.MOD_ID, "tcm_tab"), () -> new ItemStack(ModItems.RAW_LITHIUM));
}
