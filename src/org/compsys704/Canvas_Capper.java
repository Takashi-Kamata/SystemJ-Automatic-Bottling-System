package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas_Capper extends JPanel {
	BufferedImage Background;
	BufferedImage GripperStart;
	BufferedImage GripperLoweredOpenTwisted;
	BufferedImage UnclampedClamps;
	BufferedImage ClampedClamps;
	BufferedImage UnprocessedBottle;
	BufferedImage ProcessedBottle;
	BufferedImage GripperLoweredOpen;
	BufferedImage GripperLoweredClosed;
	BufferedImage GripperLoweredClosedTwisted;
	Integer done = 0;
	
	public Canvas_Capper(){
		try {
			Background = ImageIO.read(new File("res/Capper/Background.png"));
			GripperStart = ImageIO.read(new File("res/Capper/GripperStart.png"));
			GripperLoweredOpenTwisted = ImageIO.read(new File("res/Capper/GripperLoweredOpenTwisted.png"));
			UnclampedClamps = ImageIO.read(new File("res/Capper/UnclampedClamps.png"));
			ClampedClamps = ImageIO.read(new File("res/Capper/ClampedClamps.png"));
			UnprocessedBottle = ImageIO.read(new File("res/Capper/UnprocessedBottle.png"));
			ProcessedBottle = ImageIO.read(new File("res/Capper/ProcessedBottle.png"));
			GripperLoweredOpen = ImageIO.read(new File("res/Capper/GripperLoweredOpen.png"));
			GripperLoweredClosed = ImageIO.read(new File("res/Capper/GripperLoweredClosed.png"));
			GripperLoweredClosedTwisted = ImageIO.read(new File("res/Capper/GripperLoweredClosedTwisted.png"));

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(Background,0,0,null);
		g.drawImage(UnclampedClamps,0,0,null);
		g.drawImage(GripperStart,0,0,null);
		if (States.cylPos5ZaxisExtendE) {
			g.drawImage(GripperLoweredOpen,0,0,null);
		}
		if (States.cylClampBottleExtendE) {
			g.drawImage(ClampedClamps,0,0,null);
		}
		if (States.bottleAtPos4E) {
			done = 1;
		}
		if (done == 1) {
			g.drawImage(UnprocessedBottle,0,0,null);
			if (States.gripperTurnFinalPosE && States.gripperZAxisLoweredE) {
				done = 2;
			}
		}
		if (done == 2) {
			g.drawImage(ProcessedBottle,0,0,null);
			if (States.gripperTurnHomePosE && States.gripperZAxisLiftedE) {
				done = 0;
			}
		}
		if (States.capGripperPos5ExtendE && States.gripperTurnHomePosE && States.cylPos5ZaxisExtendE) {
			g.drawImage(GripperLoweredClosed,0,0,null);
		}
		if (States.capGripperPos5ExtendE && States.gripperTurnFinalPosE && States.cylPos5ZaxisExtendE) {
			g.drawImage(GripperLoweredClosedTwisted,0,0,null);
		}
		if (!States.capGripperPos5ExtendE && States.gripperTurnFinalPosE && States.cylPos5ZaxisExtendE) {
			g.drawImage(GripperLoweredOpenTwisted,0,0,null);
		}
		
		

	}
}
