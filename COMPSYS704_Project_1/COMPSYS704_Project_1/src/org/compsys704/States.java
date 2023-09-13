package org.compsys704;

public class States {
	// Conveyor
	public static volatile boolean CONVEYOR_ON = false;
	public static volatile boolean CONVEYOR_OFF = false;
	
	// Rotary
	public static volatile boolean ROTARYTABLE_TRIGGERED = false;
	
	// Cap Loader
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;
	
	public static volatile boolean CAP_READY = false;
	
	// Capper
	public static volatile boolean CAPPER_RAISED 		= true;
	public static volatile boolean BOTTLE_CLAMPED 		= false;
	public static volatile boolean CAP_GRIPPED	 		= false;
	public static volatile boolean GRIPPER_TURN_HOME 	= true;
	public static volatile boolean GRIPPER_TURN_FINAL 	= !GRIPPER_TURN_HOME;
	
	public static volatile boolean CAPPED 				= false;
	public static volatile boolean BOTTLE_PRESENT 		= false;
	
	// ECS
	public static volatile int CURR_ZONE				= 6;
	public static volatile int[] TEMP_STATE 			= {1,1,1,1,1,1,1};								// 0 = Cool, 1 = Off, 2 = Heat
	public static volatile int[] HUMIDITY_STATE 		= {1,1,1,1,1,1,1};								// 0 = Humidify, 1 = Off, 2 = Dehumidify
	public static volatile int[] LIGHT_STATE 			= {0,0,0,0,0,0,0};								// 0 = off, >0 = on
	public static volatile int SMOKE_STATE 				= 0;											// 0 = off, 1 = on
	public static volatile Boolean[] PRESENCE_STATE 	= {false,false,false,false,false,false,false};	// 0 = empty, 1 = >0 people present 
	
	// SACS
	public static volatile boolean AUTHORIZED_DOOR_1 = false;
	public static volatile boolean AUTHORIZED_DOOR_2 = false;
	public static volatile boolean AUTHORIZED_DOOR_3 = false;
}
