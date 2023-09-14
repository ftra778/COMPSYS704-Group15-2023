package org.compsys704;

public class Ports {
	public static final String TIME_SIGNAL 			= "POSControllerCD.time";
	public static final String UPDATE_SIGNAL 		= "POSControllerCD.update";
	public static final int PORT_POS_CONTROLLER 	= 10000;
	public static final int PORT_POS_PLANT		 	= 10001;
	public static final int PORT_POS_VIZ 			= 20000;
	public static final String ENABLE_SIGNAL 				= "PlantCD.enable";
	public static final String EMPTY_BOTTLE_READY_SIGNAL 	= "POSControllerRCD.bottleReady";
	public static final String FULL_BOTTLE_READY_SIGNAL 	= "POSControllerLCD.bottleReady";
	public static final String LIQUID_RATIO 	= "POSControllerLCD.liquidRatio";
}