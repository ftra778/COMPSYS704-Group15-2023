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

public class SACS extends JFrame {
	private JPanel panel;
	
	public SACS() {

		panel = new Canvas();
		panel.setPreferredSize(new Dimension(360, 350));
		panel.setBackground(Color.WHITE);
		JButton accessDoor1 = new JButton("access_door1");
		accessDoor1.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ACCESS_DOOR1));
		JButton accessDoor2 = new JButton("access_door2");
		accessDoor2.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ACCESS_DOOR2));
		JButton accessDoor3 = new JButton("access_door3");
		accessDoor3.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ACCESS_DOOR3));
		
		
		JPanel ss = new JPanel();
		ss.add(accessDoor1);
		ss.add(accessDoor2);
		ss.add(accessDoor3);

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 2;
		this.add(ss,c);
		

		JCheckBox hp1 = new JCheckBox("hp1");
		hp1.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.HP1));
		
		JCheckBox hp2 = new JCheckBox("hp2");
		hp2.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.HP2));
		
		JCheckBox hp3 = new JCheckBox("hp3");
		hp3.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.HP3));
		
		JCheckBox smokeDetected = new JCheckBox("smokeDetected");
		smokeDetected.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SmokeDetected));
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(hp1);
		pan.add(hp2);
		pan.add(hp3);
		pan.add(smokeDetected);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Human Presence"));


		JCheckBox oa = new JCheckBox("Office section Authorized ");
		oa.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_OFFICE_AUTH));
		
		JCheckBox ma = new JCheckBox("Manufacturing section Authorized");
		ma.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_Manufacturing_AUTH));
		
		
		JPanel pan2 = new JPanel(new GridLayout(1, 2));
		pan2.add(oa);
		pan2.add(ma);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));


		JPanel pan3 = new JPanel(new GridLayout(2, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 1;
		this.add(pan3,c);
		
		this.setTitle("ACS");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		SACS cl = new SACS();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
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
