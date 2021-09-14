package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas_Conveyor extends JPanel {
	BufferedImage base;
	BufferedImage bottle1_index1;
	BufferedImage bottle5_index5;
	BufferedImage bottle1_otw;
	BufferedImage bottle5_otw;
	BufferedImage moving;

	
	public Canvas_Conveyor(){
		try {
			base = ImageIO.read(new File("res/Conveyor/conveyor_base.png"));
			bottle1_index1 = ImageIO.read(new File("res/Conveyor/bottle_1_index1.png"));
			bottle5_index5 = ImageIO.read(new File("res/Conveyor/bottle_5_index5.png"));
			bottle1_otw = ImageIO.read(new File("res/Conveyor/bottle_1_otw.png"));
			bottle5_otw = ImageIO.read(new File("res/Conveyor/bottle_5_otw.png"));
			moving = ImageIO.read(new File("res/Conveyor/moving.png"));

			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(base, 0, 0, null);
		
		if (States.BOTTLE1_AT_INDEX1) {
			g.drawImage(bottle1_index1, 0, 0, null);
		
		}
		if (States.BOTTLE5_AT_INDEX5) {
			g.drawImage(bottle5_index5, 0, 0, null);
		
		}
		if (false) {
			g.drawImage(bottle1_otw, 0, 0, null);
		
		}
		if (false) {
			g.drawImage(bottle5_otw, 0, 0, null);
		
		}
		if (States.CONV_ON) {
			g.drawImage(moving, 0, 0, null);
		
		}
		
		
	}
}
