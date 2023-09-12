package org.compsys704;

public class Ports {
	public static final String BOTTLE_READY_SIGNAL 	= "ControllerCD.bottleReady";
	public static final String ENABLE_SIGNAL 		= "PlantCD.enable";
	public static final int PORT_CAPPER_PLANT 		= 10001;
	public static final int PORT_CAPPER_CONTROLLER 	= 10000;
	public static final int PORT_CAPPER_VIZ 		= 20000;
	
	// Manual 
	public static final String SIGNAL_CLAMP_BOTTLE      	= "ControllerCD.clampBottleM";
	public static final String SIGNAL_GRIP_CAP        		= "ControllerCD.gripCapM";
	public static final String SIGNAL_LOWER_CAPPER   		= "ControllerCD.lowerCapperM";
	public static final String SIGNAL_GRIPPER_TURN_FINAL	= "ControllerCD.turnGripperFinalM";	
	public static final String SIGNAL_GRIPPER_TURN_HOME		= "ControllerCD.turnGripperHomeM";	
	public static final String SIGNAL_Mode            		= "ControllerCD.mode";
}