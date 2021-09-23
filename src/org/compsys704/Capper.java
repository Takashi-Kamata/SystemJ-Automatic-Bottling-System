package org.compsys704;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Capper extends JFrame {
	private JPanel panel;
	
	public Capper() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new Canvas_Capper();
		panel.setPreferredSize(new Dimension(851, 471));
		panel.setBackground(Color.WHITE);
//		JButton bottleAtPos4 = new JButton("bottleAtPos4");
//		bottleAtPos4.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.BOTTLEATPOS4_SIGNAL));
		
//		JButton bottleAtPos4 = new JButton("bottleAtPos4");
//		bottleAtPos4.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.BOTTLEATPOS4_SIGNAL));
//		JButton gripperZAxisLowered = new JButton("gripperZAxisLowered");
//		gripperZAxisLowered.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERZAXISLOWERED_SIGNAL));
//		JButton gripperZAxisLifted = new JButton("gripperZAxisLifted");
//		gripperZAxisLifted.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERZAXISLIFTED_SIGNAL));
//		JButton gripperTurnHomePos = new JButton("gripperTurnHomePos");
//		gripperTurnHomePos.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERTURNHOMEPOS_SIGNAL));
//		JButton gripperTurnFinalPos = new JButton("gripperTurnFinalPos");
//		gripperTurnFinalPos.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERTURNFINALPOS_SIGNAL));

		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.Capper_ENABLE_SIGNAL));
		JButton request = new JButton("request");
		request.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.Capper_REQUEST_SIGNAL));
		
		
//		JCheckBox bottleAtPos4 = new JCheckBox("bottleAtPos4");
//		bottleAtPos4.setEnabled(true);
//		bottleAtPos4.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.BOTTLEATPOS4_SIGNAL));
//		JCheckBox gripperZAxisLowered = new JCheckBox("gripperZAxisLowered");
//		gripperZAxisLowered.setEnabled(true);
//		gripperZAxisLowered.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERZAXISLOWERED_SIGNAL));
//		JCheckBox gripperZAxisLifted = new JCheckBox("gripperZAxisLifted");
//		gripperZAxisLifted.setEnabled(true);
//		gripperZAxisLifted.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERZAXISLIFTED_SIGNAL));
//		JCheckBox gripperTurnHomePos = new JCheckBox("gripperTurnHomePos");
//		gripperTurnHomePos.setEnabled(true);
//		gripperTurnHomePos.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERTURNHOMEPOS_SIGNAL));
//		JCheckBox gripperTurnFinalPos = new JCheckBox("gripperTurnFinalPos");
//		gripperTurnFinalPos.setEnabled(true);
//		gripperTurnFinalPos.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERTURNFINALPOS_SIGNAL));
//		JCheckBox request = new JCheckBox("request");
//		request.setEnabled(true);
//		request.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.REQUEST_SIGNAL));
		
		
		
		
		
//		JButton gripperZAxisLowered = new JButton("gripperZAxisLowered");
//		gripperZAxisLowered.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERZAXISLOWERED_SIGNAL));
//		JButton gripperZAxisLifted = new JButton("gripperZAxisLifted");
//		gripperZAxisLifted.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERZAXISLIFTED_SIGNAL));
//		JButton gripperTurnHomePos = new JButton("gripperTurnHomePos");
//		gripperTurnHomePos.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERTURNHOMEPOS_SIGNAL));
//		JButton gripperTurnFinalPos = new JButton("gripperTurnFinalPos");
//		gripperTurnFinalPos.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.GRIPPERTURNFINALPOS_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(request);
//		ss.add(bottleAtPos4);
//		ss.add(gripperZAxisLowered);
//		ss.add(gripperZAxisLifted);
//		ss.add(gripperTurnHomePos);
//		ss.add(gripperTurnFinalPos);
//		ss.add(request);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
//		// Radio buttons
//		SignalRadioClient src = new SignalRadioClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_Mode);
//		JRadioButton mmode = new JRadioButton("Manual");
//		mmode.setActionCommand("1");
//		mmode.addActionListener(src);
//		JRadioButton amode = new JRadioButton("Auto");
//		amode.setActionCommand("0");
//		amode.addActionListener(src);
//		amode.setSelected(true);
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(mmode);
//		bg.add(amode);
//		
//		JPanel pan = new JPanel(new GridLayout(1, 0));
//		pan.add(amode);
//		pan.add(mmode);
//		c.gridx = 0;
//		c.gridy = 2;
//		pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

//		// Checkboxes
//		JCheckBox pe = new JCheckBox("pusherExtend");
//		pe.setEnabled(false);
//		pe.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_PUSHER_EXTEND));
////		JCheckBox pr = new JCheckBox("vacOff");
////		pr.setEnabled(false);
////		pr.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_VACOFF));
//		JCheckBox vo = new JCheckBox("vacOn");
//		vo.setEnabled(false);
//		vo.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_VACON));
//		JCheckBox as = new JCheckBox("armSource");
//		as.setEnabled(false);
//		as.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ARM_SOURCE));
//		JCheckBox ad = new JCheckBox("armDest");
//		ad.setEnabled(false);
//		ad.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ARM_DEST));

//		JPanel pan2 = new JPanel(new GridLayout(2, 2));
//		pan2.add(pe);
////		pan2.add(pr);
//		pan2.add(vo);
//		pan2.add(as);
//		pan2.add(ad);
//		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
//		src.setCheckBoxComponent(pan2);

//		JPanel pan3 = new JPanel(new GridLayout(0, 2));
//		pan3.add(pan);
//		pan3.add(pan2);
//		c.gridx = 0;
//		c.gridy = 2;
//		this.add(pan3,c);
		
		this.setTitle("Capper");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Capper cl = new Capper();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.Capper_PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
