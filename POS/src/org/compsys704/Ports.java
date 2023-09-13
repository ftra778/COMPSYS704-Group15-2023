package org.compsys704;

public class Ports {
	public static final String TIME_SIGNAL 			= "ControllerCD.time";
	public static final String UPDATE_SIGNAL 		= "ControllerCD.update";
	public static final int PORT_ECS_CONTROLLER 	= 10000;
	public static final int PORT_ECS_VIZ 			= 20000;
	
	// Manual 
	public static final String SIGNAL_CLAMP_BOTTLE      	= "ControllerCD.clampBottleM";
	public static final String SIGNAL_GRIP_CAP        		= "ControllerCD.gripCapM";
	public static final String SIGNAL_LOWER_CAPPER   		= "ControllerCD.lowerCapperM";
	public static final String SIGNAL_GRIPPER_TURN_FINAL	= "ControllerCD.turnGripperFinalM";	
	public static final String SIGNAL_GRIPPER_TURN_HOME		= "ControllerCD.turnGripperHomeM";
	public static final String[] SIGNAL_TEMP         		= {"ControllerCD.SIGNAL_Z1_TEMP","ControllerCD.SIGNAL_Z2_TEMP","ControllerCD.SIGNAL_Z3_TEMP","ControllerCD.SIGNAL_Z4_TEMP","ControllerCD.SIGNAL_Z5_TEMP","ControllerCD.SIGNAL_Z6_TEMP","ControllerCD.SIGNAL_Z7_TEMP"};
	public static final String[] SIGNAL_HUMIDITY           	= {"ControllerCD.SIGNAL_Z1_HUMIDITY","ControllerCD.SIGNAL_Z2_HUMIDITY","ControllerCD.SIGNAL_Z3_HUMIDITY","ControllerCD.SIGNAL_Z4_HUMIDITY","ControllerCD.SIGNAL_Z5_HUMIDITY","ControllerCD.SIGNAL_Z6_HUMIDITY","ControllerCD.SIGNAL_Z7_HUMIDITY"};
	public static final String[] SIGNAL_LIGHT            	= {"ControllerCD.SIGNAL_Z1_LIGHT","ControllerCD.SIGNAL_Z2_LIGHT","ControllerCD.SIGNAL_Z3_LIGHT","ControllerCD.SIGNAL_Z4_LIGHT","ControllerCD.SIGNAL_Z5_LIGHT","ControllerCD.SIGNAL_Z6_LIGHT","ControllerCD.SIGNAL_Z7_LIGHT"};
	public static final String[] SIGNAL_SMOKE            	= {"ControllerCD.SIGNAL_Z1_SMOKE","ControllerCD.SIGNAL_Z2_SMOKE","ControllerCD.SIGNAL_Z3_SMOKE","ControllerCD.SIGNAL_Z4_SMOKE","ControllerCD.SIGNAL_Z5_SMOKE","ControllerCD.SIGNAL_Z6_SMOKE","ControllerCD.SIGNAL_Z7_SMOKE"};
	public static final String[] SIGNAL_PRESENCE            = {"ControllerCD.SIGNAL_Z1_PRESENCE","ControllerCD.SIGNAL_Z2_PRESENCE","ControllerCD.SIGNAL_Z3_PRESENCE","ControllerCD.SIGNAL_Z4_PRESENCE","ControllerCD.SIGNAL_Z5_PRESENCE","ControllerCD.SIGNAL_Z6_PRESENCE","ControllerCD.SIGNAL_Z7_PRESENCE"};
	public static final String SIGNAL_Mode            		= "ControllerCD.mode";
}