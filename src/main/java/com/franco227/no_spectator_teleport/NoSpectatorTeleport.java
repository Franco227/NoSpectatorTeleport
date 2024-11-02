package com.franco227.no_spectator_teleport;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoSpectatorTeleport implements ModInitializer {
	public static final String MOD_ID = "no-spectator-teleport";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Disabled spectator teleporting.");
	}
}
