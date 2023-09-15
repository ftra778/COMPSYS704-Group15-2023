package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class POSVizWorker extends Worker{
	
	public volatile Boolean dupe = false;		// SIGNALS ARE SENT TWICE: ONCE ON EACH EMITTED/SUSTAINED RISING AND FALLING EDGE
	
	@Override
	public void setSignal(boolean status) {
		
		if (!this.dupe) {
			this.dupe = true;
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
				States.LIGHT_STATE[States.CURR_ZONE] = true;
				break;
			case "lightOffE":
				States.LIGHT_STATE[States.CURR_ZONE] = false;
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
