package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class RotaryVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		switch(signame){
		
		case "turnE":
			States.ROTARYTABLE_TRIGGERED = true;
			break;
			
		case "stopE":
			States.ROTARYTABLE_TRIGGERED = false;
			break;
			
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("turnE","stopE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
