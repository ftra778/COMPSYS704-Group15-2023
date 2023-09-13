package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class ConveyorVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {

		switch(signame){
		
		case "ConveyorONe":
			States.CONVEYOR_ON = true;
			break;
			
		case "ConveyorOFFe":
			States.CONVEYOR_OFF = true;
			break;
		
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("ConveyorONe","ConveyorOFFe");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
