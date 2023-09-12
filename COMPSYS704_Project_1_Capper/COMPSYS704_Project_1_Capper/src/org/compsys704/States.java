package org.compsys704;

public class States {
	public static volatile boolean CAPPER_RAISED 		= true;
	public static volatile boolean BOTTLE_CLAMPED 		= false;
	public static volatile boolean CAP_GRIPPED	 		= false;
	public static volatile boolean GRIPPER_TURN_HOME 	= true;
	public static volatile boolean GRIPPER_TURN_FINAL 	= !GRIPPER_TURN_HOME;
	
	public static volatile boolean CAPPED 				= false;
	public static volatile boolean BOTTLE_PRESENT 		= false;
}
