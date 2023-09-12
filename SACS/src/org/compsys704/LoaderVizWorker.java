package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {

		switch(signame){
		
		case "door1_opened":
			States.AUTHORIZED_DOOR_1 = true;
			break;
			
		case "door2_opened":
			States.AUTHORIZED_DOOR_2 = true;
			break;
		
		case "door3_opened":
			States.AUTHORIZED_DOOR_3 = true;
			break;
			
		case "door1_closed":
			States.AUTHORIZED_DOOR_1 = false;
			
			break;
			
		case "door2_closed":
			States.AUTHORIZED_DOOR_2 = false;
			break;
			
		case "door3_closed":
			States.AUTHORIZED_DOOR_3 = false;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("door1_opened","door2_opened","door3_opened", "door1_closed", "door2_closed", "door3_closed");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
