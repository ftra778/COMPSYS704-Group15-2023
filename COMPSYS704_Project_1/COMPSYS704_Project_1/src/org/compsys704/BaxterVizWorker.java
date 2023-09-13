package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class BaxterVizWorker extends Worker{
	
	@Override
	public void setSignal(boolean status) {;}
	
	
	static final List<String> signames = Arrays.asList("tempHotE","tempOffE","tempColdE","humidityIncE","humidityRedE","humidityOffE","lightOnE","lightOffE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
}
