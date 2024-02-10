package com.Orim12.Test_mod;

import com.Orim12.Test_mod.items.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test_mod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("test Mod");
	public static final String MOD_ID = "test_mod";

	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.registerModItems();

	}
}
