package org.compsys704;

public class Ports {
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	public static final String HP1 = "PlantCD.hp1";
	public static final String HP2 = "PlantCD.hp2";
	public static final String HP3 = "PlantCD.hp3";
	
	public static final String SmokeDetected = "ControllerCD.smokeDetected";
	
	public static final String SIGNAL_ACCESS_DOOR1 = "ControllerCD.accessDoor1";
	public static final String SIGNAL_ACCESS_DOOR2 = "ControllerCD.accessDoor2";
	public static final String SIGNAL_ACCESS_DOOR3 = "ControllerCD.accessDoor3";
	public static final String SIGNAL_OFFICE_AUTH = "ControllerCD.officeAuthorised";
	public static final String SIGNAL_Manufacturing_AUTH = "ControllerCD.ManufacturingAuthorised";
	
}
