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


	
	public Canvas_LiquidFiller(){
		try {
			base = ImageIO.read(new File("res/LiquidFiller/base.png"));


			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(base, 0, 0, null);
	
		

		
		
	}
}
