package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class CapperVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		switch(signame){
		case "clampCloseE":
			if ((!States.CAPPER_RAISED && States.BOTTLE_PRESENT && !States.BOTTLE_CLAMPED) || States.CAPPED || (States.BOTTLE_PRESENT == false) || (States.CAPPER_RAISED)) {
				States.BOTTLE_CLAMPED = status;
			}
			break;
		case "gripperCloseE":
			if((!States.CAPPER_RAISED && States.BOTTLE_PRESENT && !States.CAP_GRIPPED) || States.CAPPED || (States.BOTTLE_PRESENT == false) || (States.CAPPER_RAISED)) {
				States.CAP_GRIPPED = status;
			}
			break;
		case "capperRaisedE":
			if(!States.CAP_GRIPPED && States.GRIPPER_TURN_HOME && !States.GRIPPER_TURN_FINAL) {
				if(!States.BOTTLE_CLAMPED) {
					States.CAPPER_RAISED = status;
					if(States.CAPPED) {
						States.CAPPED = false;
						States.BOTTLE_PRESENT = false;
					}
				}
			}
			break;
		case "gripperAtFinalE":
			if(!States.CAPPER_RAISED) {
				if((!States.CAP_GRIPPED && !States.BOTTLE_CLAMPED) || (States.CAP_GRIPPED && States.BOTTLE_CLAMPED)) {
					States.GRIPPER_TURN_FINAL = status;
				}
			} else {
				States.GRIPPER_TURN_FINAL = status;
			}
			if(States.GRIPPER_TURN_FINAL && !States.CAPPER_RAISED && States.BOTTLE_PRESENT && States.CAP_GRIPPED && States.BOTTLE_CLAMPED) {
				States.CAPPED = true;
			}
			break;
		case "gripperAtHomeE":
			States.GRIPPER_TURN_HOME = status;
			
			if (!States.GRIPPER_TURN_FINAL) {
				States.GRIPPER_TURN_HOME = true;
			}
			if (States.CAPPED && States.CAP_GRIPPED) {
				States.GRIPPER_TURN_HOME = false;
				States.GRIPPER_TURN_FINAL = true;
			}
			break;
		case "bottlePos5DispE":
			States.BOTTLE_PRESENT = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("clampCloseE","gripperCloseE","capperRaisedE","gripperAtFinalE","gripperAtHomeE","bottlePos5DispE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
}
