package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class ECSVizWorker extends Worker{
	
	public volatile Boolean dupe = false;		// SIGNALS ARE SENT TWICE: ONCE ON EACH EMITTED/SUSTAINED RISING AND FALLING EDGE
	
	@Override
	public void setSignal(boolean status) {
		int j;
		if (!this.dupe) {
//			this.dupe = true;
			switch(signame){
			case "tempHotE":
				States.TEMP_STATE[States.CURR_ZONE] = 2;
				break;
			case "tempOffE":
				States.TEMP_STATE[States.CURR_ZONE] = 1;
				break;
			case "tempColdE":
				States.TEMP_STATE[States.CURR_ZONE] = 0;
				break;
			case "humidityIncE":
				States.HUMIDITY_STATE[States.CURR_ZONE] = 2;
				break;
			case "humidityOffE":
				States.HUMIDITY_STATE[States.CURR_ZONE] = 1;
				break;
			case "humidityRedE":
				States.HUMIDITY_STATE[States.CURR_ZONE] = 0;
				break;
			case "lightOnE":		
				if((States.CURR_ZONE == 0) || (States.CURR_ZONE == 6)) 			{ j = 0; } 
				else if ((States.CURR_ZONE == 1) || (States.CURR_ZONE == 2)) 	{ j = 1; } 
				else 															{ j = 2; }
				States.LIGHT_STATE[States.CURR_ZONE] = (int)Labels.envcond.get(j+12) - Labels.sliders.get(2).get(States.CURR_ZONE).getValue();
				break;
			case "lightOffE":
				States.LIGHT_STATE[States.CURR_ZONE] = 0;
				break;
			default: 
				System.err.println("Wrong sig name : "+signame);
				System.exit(1);
			}
		} else {
			this.dupe = false;
		}
	}
	
	
	static final List<String> signames = Arrays.asList("tempHotE","tempOffE","tempColdE","humidityIncE","humidityRedE","humidityOffE","lightOnE","lightOffE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
}
