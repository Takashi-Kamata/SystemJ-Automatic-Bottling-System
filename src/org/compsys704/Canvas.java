package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.systemj.netapi.TCPReceiver;

public class Canvas extends JPanel {
	TCPReceiver r = new TCPReceiver("127.0.0.1", 20001);
	TCPReceiver f = new TCPReceiver("127.0.0.1", 20002);
	TCPReceiver v = new TCPReceiver("127.0.0.1", 20003);
	TCPReceiver b = new TCPReceiver("127.0.0.1", 20004);

	BufferedImage arm1;
	BufferedImage arm2;
	BufferedImage p1;
	BufferedImage p2;
	BufferedImage loader;
	BufferedImage cap;
	
	BufferedImage background;
	BufferedImage bottle;
	
	BufferedImage l1on;
	BufferedImage l2on;
	BufferedImage l3on;
	BufferedImage l4on;
	
	BufferedImage f1on_r;
	BufferedImage f2on_r;
	BufferedImage f3on_r;
	BufferedImage f4on_r;
	
	BufferedImage f1on_g;
	BufferedImage f2on_g;
	BufferedImage f3on_g;
	BufferedImage f4on_g;
	
	BufferedImage f1on_b;
	BufferedImage f2on_b;
	BufferedImage f3on_b;
	BufferedImage f4on_b;
	
	BufferedImage f1on_y;
	BufferedImage f2on_y;
	BufferedImage f3on_y;
	BufferedImage f4on_y;
	
	int bottle_on = 0;
	int counter = 0;
	int flag1 =0, flag2 =0, flag3 =0, flag4 = 0;
	int[] intArray = new int[]{ 0,0,0,0 }; 
	
	
	public Canvas(){

		r.setConsumer((status,value) -> {if (status == true) { States.FirstLiquidAmount = (int) value;}});
		f.setConsumer((status,value) -> {if (status == true) { States.SecondLiquidAmount = (int) value;}});
		v.setConsumer((status,value) -> {if (status == true) { States.ThirdLiquidAmount = (int) value;}});
		b.setConsumer((status,value) -> {if (status == true) { States.FourthLiquidAmount = (int) value;}});
		try {
			BufferedImage bi = ImageIO.read(new File("res/arm.png"));
			arm1 = bi.getSubimage(0, 0, 64, 256);
			arm2 = bi.getSubimage(71, 0, 48, 256);
			loader = ImageIO.read(new File("res/loader.png"));
			bi = ImageIO.read(new File("res/pusher.png"));
			p1 = bi.getSubimage(0, 0, 238, 68);
			p2 = bi.getSubimage(238, 0, 172, 68);
			cap = ImageIO.read(new File("res/cap.png"));
			
			background = ImageIO.read(new File("res/liquidFiller/background.png"));
			bottle = ImageIO.read(new File("res/liquidFiller/bottle.png"));
			
			l1on = ImageIO.read(new File("res/liquidFiller/liquid/l1on.png"));
			l2on = ImageIO.read(new File("res/liquidFiller/liquid/l2on.png"));
			l3on = ImageIO.read(new File("res/liquidFiller/liquid/l3on.png"));
			l4on = ImageIO.read(new File("res/liquidFiller/liquid/l4on.png"));
			
			f1on_r = ImageIO.read(new File("res/liquidFiller/fill_liquid/red/f1on.png"));
			f2on_r = ImageIO.read(new File("res/liquidFiller/fill_liquid/red/f2on.png"));
			f3on_r = ImageIO.read(new File("res/liquidFiller/fill_liquid/red/f3on.png"));
			f4on_r = ImageIO.read(new File("res/liquidFiller/fill_liquid/red/f4on.png"));

			f1on_g = ImageIO.read(new File("res/liquidFiller/fill_liquid/green/f1on.png"));
			f2on_g = ImageIO.read(new File("res/liquidFiller/fill_liquid/green/f2on.png"));
			f3on_g = ImageIO.read(new File("res/liquidFiller/fill_liquid/green/f3on.png"));
			f4on_g = ImageIO.read(new File("res/liquidFiller/fill_liquid/green/f4on.png"));

			f1on_b = ImageIO.read(new File("res/liquidFiller/fill_liquid/blue/f1on.png"));
			f2on_b = ImageIO.read(new File("res/liquidFiller/fill_liquid/blue/f2on.png"));
			f3on_b = ImageIO.read(new File("res/liquidFiller/fill_liquid/blue/f3on.png"));
			f4on_b = ImageIO.read(new File("res/liquidFiller/fill_liquid/blue/f4on.png"));
			
			f1on_y = ImageIO.read(new File("res/liquidFiller/fill_liquid/yellow/f1on.png"));
			f2on_y = ImageIO.read(new File("res/liquidFiller/fill_liquid/yellow/f2on.png"));
			f3on_y = ImageIO.read(new File("res/liquidFiller/fill_liquid/yellow/f3on.png"));
			f4on_y= ImageIO.read(new File("res/liquidFiller/fill_liquid/yellow/f4on.png"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(background, 0, 0, null);
	
		if (States.REMOVEE) {
			flag1 = 0;
			flag2 = 0;
			flag3 = 0;
			flag4 = 0;
			bottle_on = 0;
			counter = 0;
		} else {
			;
		}
		
		if (States.LIQUID1ON && bottle_on == 1) {
			if (!States.LIQUIDFILLERDONE) {
				g.drawImage(l1on, 0, 0, null);
			}
			flag1 = 1;
			counter = flag1+flag2+flag3+flag4;
			intArray[counter-1] = 1;//red
		} else {
			;
		}
		
		if (States.LIQUID2ON && bottle_on == 1) {
			if (!States.LIQUIDFILLERDONE) {
				g.drawImage(l2on, 0, 0, null);
			}
			flag2 = 1;
			counter = flag1+flag2+flag3+flag4;
			intArray[counter-1] = 2;//green
		} else {
			;
		}
		if (States.LIQUID3ON && bottle_on == 1) {
			if (!States.LIQUIDFILLERDONE) {
				g.drawImage(l3on, 0, 0, null);
			}
			flag3 = 1;
			counter = flag1+flag2+flag3+flag4;
			intArray[counter-1] = 3;//yellow
		} else {
			;
		}
		if (States.LIQUID4ON && bottle_on == 1) {
			if (!States.LIQUIDFILLERDONE) {
				g.drawImage(l4on, 0, 0, null);
			}
			flag4 = 1;
			counter = flag1+flag2+flag3+flag4;
			intArray[counter-1] = 4;//blue
		} else {
			;
		}
		
		if (States.REQUESTE) {
			bottle_on = 1;
		}
		
		
		int max = 65;
		int min = 165;
		double dif = min - max; //100
		
		int firstRectHeight = (int) (dif * (States.FirstLiquidAmount / 100.0));
		int secondRectHeight = (int) (dif * (States.FirstLiquidAmount / 100.0));
		int thirdRectHeight = (int) (dif * (States.FirstLiquidAmount / 100.0));
		int fourthRectHeight = (int) (dif * (States.FirstLiquidAmount / 100.0));
		
		counter = flag1+flag2+flag3+flag4;
		if (counter >= 1) {
			
			if (intArray[0] == 1) {		
				g.setColor(Color.red);
				g.fillRect(126, min, 49, firstRectHeight);
			} else if (intArray[0] == 2) {
				g.setColor(Color.green);
				g.fillRect(126, min, 49, firstRectHeight);
			} else if (intArray[0] == 3) {
				g.setColor(Color.yellow);
				g.fillRect(126, min, 49, firstRectHeight);
			} else if (intArray[0] == 4) {
				g.setColor(Color.blue);
				g.fillRect(126, min, 49, firstRectHeight);
			}
			
		}
		if (counter >= 2) {
			
			if (intArray[1] == 1) {
				g.setColor(Color.red);
				g.fillRect(126, min-firstRectHeight, 49, secondRectHeight);
			} else if (intArray[1] == 2) {
				g.setColor(Color.green);
				g.fillRect(126, min-firstRectHeight, 49, secondRectHeight);
			} else if (intArray[1] == 3) {
				g.setColor(Color.yellow);
				g.fillRect(126, min-firstRectHeight, 49, secondRectHeight);
			} else if (intArray[1] == 4) {
				g.setColor(Color.blue);
				g.fillRect(126, min-firstRectHeight, 49, secondRectHeight);
			}
		}
		if (counter >= 3) {
			if (intArray[2] == 1) {
				g.setColor(Color.red);
				g.fillRect(126, min-firstRectHeight-secondRectHeight, 49, thirdRectHeight);
			} else if (intArray[2] == 2) {
				g.setColor(Color.green);
				g.fillRect(126, min-firstRectHeight-secondRectHeight, 49, thirdRectHeight);
			} else if (intArray[2] == 3) {
				g.setColor(Color.yellow);
				g.fillRect(126, min-firstRectHeight-secondRectHeight, 49, thirdRectHeight);
			} else if (intArray[2] == 4) {
				g.setColor(Color.blue);
				g.fillRect(126, min-firstRectHeight-secondRectHeight, 49, thirdRectHeight);
			}
		}
		if (counter == 4) {
			if (intArray[3] == 1) {
				g.setColor(Color.red);
				g.fillRect(126, min-firstRectHeight-secondRectHeight-thirdRectHeight, 49, fourthRectHeight);
			} else if (intArray[3] == 2) {
				g.setColor(Color.green);
				g.fillRect(126, min-firstRectHeight-secondRectHeight-thirdRectHeight, 49, fourthRectHeight);
			} else if (intArray[3] == 3) {
				g.setColor(Color.yellow);
				g.fillRect(126, min-firstRectHeight-secondRectHeight-thirdRectHeight, 49, fourthRectHeight);
			} else if (intArray[3] == 4) {
				g.setColor(Color.blue);
				g.fillRect(126, min-firstRectHeight-secondRectHeight-thirdRectHeight, 49, fourthRectHeight);
			}
		}
		
		
		if (bottle_on == 1) {
			g.drawImage(bottle, 0, 0, null);
		} else {
			;
		}
	}
}
