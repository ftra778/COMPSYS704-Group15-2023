package org.compsys704;

public class Ports {
	public static final String ENABLE_SIGNAL 				= "PlantCD.enable";
	public static final String EMPTY_BOTTLE_READY_SIGNAL 	= "ControllerRCD.bottleReady";
	public static final String FULL_BOTTLE_READY_SIGNAL 	= "ControllerLCD.bottleReady";
	public static final int PORT_BAXTER_CONTROLLER 			= 10000;
	public static final int PORT_BAXTER_PLANT 				= 10001;
	public static final int PORT_BAXTER_VIZ 				= 20000;
}