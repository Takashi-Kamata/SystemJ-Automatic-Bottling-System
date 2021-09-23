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
		case "valveInjectorOnOffE":
			States.INJECTOR = status;
			break;
		case "valveInletOnOffE":
			States.INLET = status;
			break;
		case "dosUnitValveRetractE":
			States.CYLINDER_RETRACTED = status;
			break;
		case "dosUnitValveExtendE":
			States.CYLINDER_EXTENDED = status;
			break;
		case "bottleAtPos2E":
			States.BOTTLE_AT_POS2 = status;
			break;
		case "FirstLiquidDoneE":
			States.FirstLiquidDoneE = status;
			break;
		case "SecondLiquidDoneE":
			States.SecondLiquidDoneE = status;
			break;
		case "ThirdLiquidDoneE":
			States.ThirdLiquidDoneE = status;
			break;
		case "FourthLiquidDoneE":
			States.FourthLiquidDoneE = status;
			break;
		case "bottleAtPos4E":
			States.bottleAtPos4E = status;
			break;
		case "gripperZAxisLoweredE":
			States.gripperZAxisLoweredE = status;
			break;
		case "gripperZAxisLiftedE":
			States.gripperZAxisLiftedE = status;
			break;
		case "gripperTurnHomePosE":
			States.gripperTurnHomePosE = status;
			break;
		case "gripperTurnFinalPosE":
			States.gripperTurnFinalPosE = status;
			break;
		case "cylPos5ZaxisExtendE":
			States.cylPos5ZaxisExtendE = status;
			break;
		case "gripperTurnRetractE":
			States.gripperTurnRetractE = status;
			break;
		case "gripperTurnExtendE":
			States.gripperTurnExtendE = status;
			break;
		case "capGripperPos5ExtendE":
			States.capGripperPos5ExtendE = status;
			break;
		case "cylClampBottleExtendE":
			States.cylClampBottleExtendE = status;
			break;
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
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("motConveyorOnOffE", "bottleAtPos1E", "bottleLeftPos5E", "tableAlignedWithSensorE", "bottleAtPos5E", "capOnBottleAtPos1E", "rotaryTableTriggerE",
			"valveInjectorOnOffE", "valveInletOnOffE","dosUnitValveRetractE","dosUnitValveExtendE", "bottleAtPos2E",
			"FirstLiquidDoneE", "SecondLiquidDoneE", "ThirdLiquidDoneE","FourthLiquidDoneE",
			"bottleAtPos4E","gripperZAxisLoweredE","gripperZAxisLiftedE","gripperTurnHomePosE","gripperTurnFinalPosE","cylPos5ZaxisExtendE","gripperTurnRetractE","gripperTurnExtendE","capGripperPos5ExtendE","cylClampBottleExtendE",
			"pusherRetractedE","pusherExtendedE","WPgrippedE","armAtSourceE","armAtDestE","emptyE"
			);
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
