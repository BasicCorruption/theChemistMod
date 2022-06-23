package io.github.basiccorruption.tcm;

import io.github.basiccorruption.tcm.block.ModBlocks;
import io.github.basiccorruption.tcm.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheChemistMod implements ModInitializer {
	public static final String MOD_ID = "tcm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
