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

public class Conveyor extends JFrame {
	private JPanel panel;
	
	public Conveyor() {

		panel = new ConveyorCanvas();
		panel.setPreferredSize(new Dimension(360, 350));
		panel.setBackground(Color.WHITE);
		JButton eReady = new JButton("emptyBottleReady");
		eReady.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.EBR));
		JButton AtPos1  = new JButton("bottleAtPos1");
		AtPos1.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.ATPOS1));
		JButton AtPos5  = new JButton("bottleAtPos5");
		AtPos5.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.ATPOS5));
		
		
		JPanel ss = new JPanel();
		ss.add(eReady);
		ss.add(AtPos1);
		ss.add(AtPos5);

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 2;
		this.add(ss,c);
		
		JButton eStop  = new JButton("emergencyStop");
		eStop.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.CON_ESTOP));

		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(eStop);

		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Human Presence"));
////
		JCheckBox LeftPos5 = new JCheckBox("bottleLeftPos5");
		LeftPos5.addItemListener(new SignalCheckBoxClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.LEFTPOS5));

		
		JPanel pan2 = new JPanel(new GridLayout(1, 2));
		pan2.add(LeftPos5);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));


		JPanel pan3 = new JPanel(new GridLayout(2, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 1;
		this.add(pan3,c);
		
		this.setTitle("Conveyor");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

//	public static void main(String[] args) {
//		Conveyor cl = new Conveyor();
//		cl.pack();
//		cl.setVisible(true);
//		
//		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
//		new Thread(server).start();
//		while(true){
//			try {
//				cl.repaint();
//				Thread.sleep(5);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
