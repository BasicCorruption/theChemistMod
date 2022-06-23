package io.github.basiccorruption.tcm;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheChemistMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("tcm");

	@Override
	public void onInitialize() {
		LOGGER.info("Mod is being initialized.");
	}
}
