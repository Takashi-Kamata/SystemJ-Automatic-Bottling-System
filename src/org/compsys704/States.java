package org.compsys704;

public class States {
	
	public static volatile boolean BOTTLE1_AT_INDEX1 = false;
	public static volatile boolean BOTTLE5_AT_INDEX5 = false;
	public static volatile boolean CONV_ON = true;
	
	public static volatile boolean TABLE_ALIGN = false;
	public static volatile boolean CAP_ON_BOTTLE1 = false;
	public static volatile boolean BOTTLE_AT_POS5 = false;
	public static volatile boolean ROTATING = false;
	
	public static volatile boolean INJECTOR = false;
	public static volatile boolean INLET = false;
	public static volatile boolean CYLINDER_EXTENDED = true;
	public static volatile boolean CYLINDER_RETRACTED = false;
	public static volatile boolean BOTTLE_AT_POS2 = false;
	
	public static volatile boolean FirstLiquidDoneE = false;
	public static volatile boolean SecondLiquidDoneE = false;
	public static volatile boolean ThirdLiquidDoneE = false;
	public static volatile boolean FourthLiquidDoneE = false;
	
	public static volatile boolean bottleAtPos4E = false;
	public static volatile boolean gripperZAxisLoweredE = false;
	public static volatile boolean gripperZAxisLiftedE = false;
	public static volatile boolean gripperTurnHomePosE = false;
	public static volatile boolean gripperTurnFinalPosE = false;
	public static volatile boolean cylPos5ZaxisExtendE = false;
	public static volatile boolean gripperTurnRetractE = false;
	public static volatile boolean gripperTurnExtendE = false;
	public static volatile boolean capGripperPos5ExtendE = false;
	public static volatile boolean cylClampBottleExtendE = false;
	
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;
	
	public static volatile boolean CAP_READY = false;
}
