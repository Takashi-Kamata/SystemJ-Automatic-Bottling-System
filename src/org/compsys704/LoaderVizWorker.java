package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtPos1E":
			States.BOTTLE1_AT_INDEX1 = status;
			break;
		case "bottleLeftPos5E":
			States.BOTTLE5_AT_INDEX5 = status;
			break;
		case "motConveyorOnOffE":
			States.CONV_ON = status;
			break;
		case "tableAlignedWithSensorE":
			States.TABLE_ALIGN = status;
			break;
		case "bottleAtPos5E":
			States.BOTTLE_AT_POS5 = status;
			break;
		case "capOnBottleAtPos1E":
			States.CAP_ON_BOTTLE1 = status;
			break;
		case "rotaryTableTriggerE":
			States.ROTATING = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("motConveyorOnOffE", "bottleAtPos1E", "bottleLeftPos5E", "tableAlignedWithSensorE", "bottleAtPos5E", "capOnBottleAtPos1E", "rotaryTableTriggerE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
