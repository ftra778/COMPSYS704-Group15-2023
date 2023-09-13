package org.compsys704;

public class States {
	public static volatile int CURR_ZONE				= 6;
	public static volatile int[] TEMP_STATE 			= {1,1,1,1,1,1,1};								// 0 = Cool, 1 = Off, 2 = Heat
	public static volatile int[] HUMIDITY_STATE 		= {1,1,1,1,1,1,1};								// 0 = Humidify, 1 = Off, 2 = Dehumidify
	public static volatile int[] LIGHT_STATE 			= {0,0,0,0,0,0,0};								// 0 = off, >0 = on
	public static volatile int SMOKE_STATE 				= 0;											// 0 = off, 1 = on
	public static volatile Boolean[] PRESENCE_STATE 	= {false,false,false,false,false,false,false};	// 0 = empty, 1 = >0 people present 
}
