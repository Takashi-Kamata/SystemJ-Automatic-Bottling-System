package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas_LiquidFiller extends JPanel {
	BufferedImage base;
	BufferedImage injector;
	BufferedImage inlet_valve;
	BufferedImage injector_valve;
	BufferedImage bottle;

	
	public Canvas_LiquidFiller(){
		try {
			base = ImageIO.read(new File("res/LiquidFiller/base.png"));
			injector = ImageIO.read(new File("res/LiquidFiller/injector.png"));
			inlet_valve = ImageIO.read(new File("res/LiquidFiller/inlet_valve.png"));
			injector_valve = ImageIO.read(new File("res/LiquidFiller/injector_valve.png"));
			bottle = ImageIO.read(new File("res/LiquidFiller/bottle.png"));


			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(base, 0, 0, null);
		int injector_y = 0;
		if (States.CYLINDER_EXTENDED && !States.FirstLiquidDoneE && !States.SecondLiquidDoneE && !States.ThirdLiquidDoneE && !States.FourthLiquidDoneE ) {
			injector_y = 0;
			g.drawImage(injector, 0,0, null);
		} 
		
		if (States.CYLINDER_RETRACTED && !States.FirstLiquidDoneE && !States.SecondLiquidDoneE && !States.ThirdLiquidDoneE && !States.FourthLiquidDoneE && !States.INLET ) {
			injector_y = 0;
			g.drawImage(injector, 0,injector_y, null);
		}
		
		
		if (States.FirstLiquidDoneE) {
			injector_y = 0-20;
			g.drawImage(injector, 0,injector_y, null);
			
		}
		if (States.SecondLiquidDoneE) {
			injector_y = 0-20-20;
			g.drawImage(injector, 0,injector_y, null);
			
		}
		if (States.ThirdLiquidDoneE) {
			injector_y = 0-20-20-20;
			g.drawImage(injector, 0,injector_y, null);
			
		}
		if (States.FourthLiquidDoneE) {
			injector_y = 0-20-20-20-20;
			g.drawImage(injector, 0,injector_y, null);
			
		}
		
		if (!States.INJECTOR) {
			g.drawImage(injector_valve, 0,injector_y, null);
		}
		
		if (!States.INLET) {
			g.drawImage(inlet_valve, 0,0, null);
		}
		if (States.BOTTLE_AT_POS2) {
			g.drawImage(bottle, 0,0, null);
		}
		

		
		
	}
}
