package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "pusherRetractedE":
			States.PUSHER_RETRACTED = status;
			break;
		case "pusherExtendedE":
			if(!States.MAG_EMPTY && !States.PUSHER_EXTENDED)
				States.CAP_READY = true;
			States.PUSHER_EXTENDED = status;
			break;
		case "WPgrippedE":
			if(States.GRIPPED && States.ARM_AT_SOURCE){
				if(!status)
					States.CAP_READY = true;
			}
			States.GRIPPED = status;
			if(States.GRIPPED && States.ARM_AT_SOURCE){
				States.CAP_READY = false;
			}
			break;
		case "armAtSourceE":
			States.ARM_AT_SOURCE = status;
			break;
		case "armAtDestE":
			States.ARM_AT_DEST = status;
			break;
		case "emptyE":
			States.MAG_EMPTY = status;
			break;
		case "zAxisExtendedE":
			States.GRIPPER_EXTENDED = status;
			break;
		case "zAxisRetractedE":
			States.GRIPPER_RETRACTED = status;
			break;
		case "gripperTurnExtendedE":
			break;
		case "gripperTurnRetractedE":
			break;
		case "capGripperExtendedE":
			States.GRIPPER_OPEN = status;
			break;
		case "capGripperRetractedE":
			States.GRIPPER_CLOSED = status;
			break;
		case "clampBottleExtendedE":
			break;
		case "clampBottleRetractedE":
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	public static final String SIGNAL_ZAXISEXTENDED         = "ControllerCD.zAxisExtendM";
	public static final String SIGNAL_GRIPPERTURNRETRACT	= "ControllerCD.gripperTurnRetractM";
	public static final String SIGNAL_GRIPPERTURNEXTEND     = "ControllerCD.gripperTurnExtendM";
	public static final String SIGNAL_CAPGRIPPEREXTEND      = "ControllerCD.capGripperExtendM";
	public static final String SIGNAL_CLAMPBOTTLEEXTEND     = "ControllerCD.clampBottleExtendM";
	static final List<String> signames = Arrays.asList("pusherRetractedE","pusherExtendedE","WPgrippedE","armAtSourceE","armAtDestE","emptyE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
