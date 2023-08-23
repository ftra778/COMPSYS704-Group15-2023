package org.compsys704;

public class Ports {
	public static final String REQUEST_SIGNAL = "ControllerCD.request";
	public static final String REFILL_SIGNAL = "PlantCD.refill";
	public static final String ENABLE_SIGNAL = "PlantCD.enable";	
	public static final String BOTTLEREADY_SIGNAL = "PlantCD.bottleready";
	public static final String GRIP_SIGNAL = "PlantCD.grip";
	public static final String LOWER_SIGNAL = "PlantCD.lower";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_PUSHER_EXTEND   		= "ControllerCD.pusherExtendM";
//	public static final String SIGNAL_VACOFF          		= "ControllerCD.vacOffM";
	public static final String SIGNAL_VACON           		= "ControllerCD.vacOnM";
	public static final String SIGNAL_ARM_SOURCE      		= "ControllerCD.armSourceM";
	public static final String SIGNAL_ARM_DEST        		= "ControllerCD.armDestM";
	public static final String SIGNAL_Mode            		= "ControllerCD.mode";	
	public static final String SIGNAL_ZAXISEXTENDED         = "ControllerCD.zAxisExtendM";
	public static final String SIGNAL_GRIPPERTURNRETRACT	= "ControllerCD.gripperTurnRetractM";
	public static final String SIGNAL_GRIPPERTURNEXTEND     = "ControllerCD.gripperTurnExtendM";
	public static final String SIGNAL_CAPGRIPPEREXTEND      = "ControllerCD.capGripperExtendM";
	public static final String SIGNAL_CLAMPBOTTLEEXTEND     = "ControllerCD.clampBottleExtendM";
}
