package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas_Table extends JPanel {
	BufferedImage base;
	BufferedImage rotating;
	BufferedImage bottle1;


	
	public Canvas_Table(){
		try {
			base = ImageIO.read(new File("res/Table/base.png"));
			rotating = ImageIO.read(new File("res/Table/rotating.png"));
			bottle1 = ImageIO.read(new File("res/Table/bottle1.png"));
			

			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(base, 0, 0, null);
		
		if (States.ROTATING) {
			g.drawImage(rotating, 0,0,null);
			g.drawImage(bottle1, 0,0,null);
		}
		
		
	}
}
