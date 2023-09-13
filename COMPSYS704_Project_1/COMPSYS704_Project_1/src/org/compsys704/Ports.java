package org.compsys704;

public class Ports {
	/**
	 *  ABS Coordinator
	 */
	public static final int ABS_COORDINATOR 				= 10000;

	/**
	 *  Conveyor
	 */
	public static final int PORT_CONVEYOR_CONTROLLER 		= 11000;
	public static final int PORT_CONVEYOR_PLANT 			= 11001;
	public static final int PORT_CONVEYOR_VIZ 				= 11002;
	
	public static final String EBR 			= "ConveyorControllerCD.emptyBottleReady";
	public static final String ATPOS1 		= "ConveyorControllerCD.bottleAtPos1";
	public static final String ATPOS5 		= "ConveyorControllerCD.bottleAtPos5";
	public static final String LEFTPOS5 	= "ConveyorControllerCD.bottleLeftPos5";
	
	public static final String CON_ESTOP	= "ConveyorControllerCD.emergencyStop";
	

	/**
	 *  Rotary Table
	 */
	public static final int PORT_ROTARY_CONTROLLER 			= 12000;
	public static final int PORT_ROTARY_PLANT 				= 12001;
	public static final int PORT_ROTARY_VIZ 				= 12002;
	
	public static final String ALIGNEDSENSOR 	= "RotaryControllerCD.tableAlignedWithSensor";
	public static final String BOTTLEATPOS5 	= "RotaryControllerCD.bottleAtPos5";
	public static final String CAPONBOTTLE 		= "RotaryControllerCD.CapOnBottleAtPos1";
	public static final String ROTARYTRIGGER 	= "RotaryControllerCD.rotaryTableTrigger";
	public static final String ROT_ESTOP 		= "RotaryControllerCD.emergencyStop";
	

	/**
	 *  Filler
	 */
	public static final int PORT_FILLER_CONTROLLER 			= 13000;
	public static final int PORT_FILLER_PLANT 				= 13001;
	public static final int PORT_FILLER_VIZ 				= 13002;
	
	
	/**
	 *  Cap Loader
	 */
	public static final int PORT_LOADER_CONTROLLER 			= 14000;
	public static final int PORT_LOADER_PLANT 				= 14001;
	public static final int PORT_LOADER_VIZ 				= 14002;
	
	public static final String LOADER_REQUEST_SIGNAL 		= "CapLoaderControllerCD.request";
	public static final String LOADER_REFILL_SIGNAL 		= "CapLoaderPlantCD.refill";
	public static final String ENABLE_LOADER_SIGNAL 		= "CapLoaderPlantCD.enable";
	
	// Manual 
	public static final String SIGNAL_PUSHER_EXTEND   		= "CapLoaderControllerCD.pusherExtendM";
	public static final String SIGNAL_VACON           		= "CapLoaderControllerCD.vacOnM";
	public static final String SIGNAL_ARM_SOURCE      		= "CapLoaderControllerCD.armSourceM";
	public static final String SIGNAL_ARM_DEST        		= "CapLoaderControllerCD.armDestM";
	public static final String SIGNAL_LOADER_MODE           = "CapLoaderControllerCD.mode";
	
	
	/**
	 *  Capper
	 */
	public static final int PORT_CAPPER_CONTROLLER 			= 15000;
	public static final int PORT_CAPPER_PLANT 				= 15001;
	public static final int PORT_CAPPER_VIZ 				= 15002;
	
	public static final String BOTTLE_READY_SIGNAL 			= "CapperControllerCD.bottleReady";
	public static final String ENABLE_CAPPER_SIGNAL 		= "CapperPlantCD.enable";
	
	// Manual 
	public static final String SIGNAL_CLAMP_BOTTLE      	= "CapperControllerCD.clampBottleM";
	public static final String SIGNAL_GRIP_CAP        		= "CapperControllerCD.gripCapM";
	public static final String SIGNAL_LOWER_CAPPER   		= "CapperControllerCD.lowerCapperM";
	public static final String SIGNAL_GRIPPER_TURN_FINAL	= "CapperControllerCD.turnGripperFinalM";	
	public static final String SIGNAL_GRIPPER_TURN_HOME		= "CapperControllerCD.turnGripperHomeM";	
	public static final String SIGNAL_CAPPER_MODE           = "CapperControllerCD.mode";
	
	
	/**
	 * Baxter
	 */
	public static final int PORT_BAXTER_CONTROLLER 			= 16000;
	public static final int PORT_BAXTER_PLANT 				= 16001;
	public static final int PORT_BAXTER_VIZ 				= 16002;
	
	public static final String ENABLE_BAXTER_SIGNAL 		= "BaxterPlantCD.enable";
	public static final String EMPTY_BOTTLE_READY_SIGNAL 	= "BaxterControllerRCD.bottleReady";
	public static final String FULL_BOTTLE_READY_SIGNAL 	= "BaxterControllerLCD.bottleReady";
	
	
	/**
	 *  POS
	 */
	public static final int PORT_POS_CONTROLLER 			= 30000;
	public static final int PORT_POS_PLANT 					= 30001;
	public static final int PORT_POS_VIZ 					= 30002;
	
	
	/**
	 *  SACS
	 */
	public static final int PORT_SACS_CONTROLLER 			= 40000;
	public static final int PORT_SACS_PLANT 				= 40001;
	public static final int PORT_SACS_VIZ 					= 40002;	
	
	public static final String HP1 = "SACSPlantCD.hp1";
	public static final String HP2 = "SACSPlantCD.hp2";
	public static final String HP3 = "SACSPlantCD.hp3";
	public static final String HP4 = "SACSPlantCD.hp4";
	public static final String HP5 = "SACSPlantCD.hp5";
	public static final String HP6 = "SACSPlantCD.hp6";
	public static final String HP7 = "SACSPlantCD.hp7";
	
	public static final String SmokeDetected = "SACSControllerCD.smokeDetected";
	
	public static final String SIGNAL_ACCESS_DOOR1 = "SACSControllerCD.accessDoor1";
	public static final String SIGNAL_ACCESS_DOOR2 = "SACSControllerCD.accessDoor2";
	public static final String SIGNAL_ACCESS_DOOR3 = "SACSControllerCD.accessDoor3";
	public static final String SIGNAL_OFFICE_AUTH = "SACSControllerCD.officeAuthorised";
	public static final String SIGNAL_Manufacturing_AUTH = "SACSControllerCD.ManufacturingAuthorised";
	
	
	/**
	 *  ECS
	 */
	public static final int PORT_ECS_CONTROLLER 			= 50000;
	public static final int PORT_ECS_PLANT 					= 50001;
	public static final int PORT_ECS_VIZ 					= 50002;
	
	public static final String TIME_SIGNAL 					= "ECSControllerCD.time";
	public static final String UPDATE_SIGNAL 				= "ECSControllerCD.update";
	
	public static final String[] SIGNAL_TEMP				= {"ECSControllerCD.SIGNAL_Z1_TEMP","ECSControllerCD.SIGNAL_Z2_TEMP","ECSControllerCD.SIGNAL_Z3_TEMP","ECSControllerCD.SIGNAL_Z4_TEMP","ECSControllerCD.SIGNAL_Z5_TEMP","ECSControllerCD.SIGNAL_Z6_TEMP","ECSControllerCD.SIGNAL_Z7_TEMP"};
	public static final String[] SIGNAL_HUMIDITY    		= {"ECSControllerCD.SIGNAL_Z1_HUMIDITY","ControllerCD.SIGNAL_Z2_HUMIDITY","ControllerCD.SIGNAL_Z3_HUMIDITY","ControllerCD.SIGNAL_Z4_HUMIDITY","ControllerCD.SIGNAL_Z5_HUMIDITY","ControllerCD.SIGNAL_Z6_HUMIDITY","ECSControllerCD.SIGNAL_Z7_HUMIDITY"};
	public static final String[] SIGNAL_LIGHT       		= {"ECSControllerCD.SIGNAL_Z1_LIGHT","ECSControllerCD.SIGNAL_Z2_LIGHT","ECSControllerCD.SIGNAL_Z3_LIGHT","ECSControllerCD.SIGNAL_Z4_LIGHT","ECSControllerCD.SIGNAL_Z5_LIGHT","ECSControllerCD.SIGNAL_Z6_LIGHT","ECSControllerCD.SIGNAL_Z7_LIGHT"};
	public static final String[] SIGNAL_SMOKE       		= {"ECSControllerCD.SIGNAL_Z1_SMOKE","ECSControllerCD.SIGNAL_Z2_SMOKE","ECSControllerCD.SIGNAL_Z3_SMOKE","ECSControllerCD.SIGNAL_Z4_SMOKE","ECSControllerCD.SIGNAL_Z5_SMOKE","ECSControllerCD.SIGNAL_Z6_SMOKE","ECSControllerCD.SIGNAL_Z7_SMOKE"};
	public static final String[] SIGNAL_PRESENCE    		= {"ECSControllerCD.SIGNAL_Z1_PRESENCE","ECSControllerCD.SIGNAL_Z2_PRESENCE","ECSControllerCD.SIGNAL_Z3_PRESENCE","ECSControllerCD.SIGNAL_Z4_PRESENCE","ECSControllerCD.SIGNAL_Z5_PRESENCE","ECSControllerCD.SIGNAL_Z6_PRESENCE","ECSControllerCD.SIGNAL_Z7_PRESENCE"};

	
	
	
	
	
	
}