package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class BaxterVizWorker extends Worker{
	
	public volatile Boolean dupe = false;		// SIGNALS ARE SENT TWICE: ONCE ON EACH EMITTED/SUSTAINED RISING AND FALLING EDGE
	
	@Override
	public void setSignal(boolean status) {
		
		if (!this.dupe) {
			this.dupe = true;
		}
	}
	
	
	static final List<String> signames = Arrays.asList("tempHotE","tempOffE","tempColdE","humidityIncE","humidityRedE","humidityOffE","lightOnE","lightOffE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
}
