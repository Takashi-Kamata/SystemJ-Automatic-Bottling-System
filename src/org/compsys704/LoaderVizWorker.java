package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		System.out.println(signame+"  "+status);
		switch(signame){
		case "Liquid1OnE":
			States.LIQUID1ON = status;
			break;
		case "Liquid2OnE":
			States.LIQUID2ON = status;
			break;
		case "Liquid3OnE":
			States.LIQUID3ON = status;
			break;
		case "Liquid4OnE":
			States.LIQUID4ON = status;
			break;
		case "RequestE":
			States.REQUESTE = status;
			break;
		case "LiquidFillerDoneE":
			States.LIQUIDFILLERDONE = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("Liquid1OnE", "Liquid2OnE", "Liquid3OnE", "Liquid4OnE", "LiquidFillerDoneE", "RequestE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
