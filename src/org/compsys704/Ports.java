package org.compsys704;

public class Ports {
	public static final int PORT_LOADER_PLANT = 10000;
	
	public static final int PORT_LOADER_CONTROLLER = 20000;
	public static final String REQUEST_SIGNAL = "Conveyor_Controller.request";
	public static final String ENABLE_SIGNAL = "Orchestrator.enable";
	public static final int CONVEYOR_PORT_LOADER_VIZ = 20001;


	
	public static final int TABLE_PORT_LOADER_CONTROLLER = 30000;
	public static final int TABLE_PORT_LOADER_VIZ = 30001;
	public static final String TABLE_REQUEST_SIGNAL = "Table_Controller.request";
	public static final String TABLE_ENABLE_SIGNAL = "Orchestrator.enable";
	
	public static final int LIQUIDFILLER_PORT_LOADER_CONTROLLER = 40000;
	public static final int LIQUIDFILLER_PORT_LOADER_VIZ = 40001;
	public static final String LIQUIDFILLER_REQUEST_SIGNAL = "LiquidFiller_Controller.request";
	public static final String LIQUIDFILLER_ENABLE_SIGNAL = "Orchestrator.enable";

}
