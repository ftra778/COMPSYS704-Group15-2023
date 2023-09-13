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

public class Rotary extends JFrame {
	private JPanel panel;
	
	public Rotary() {

		panel = new Canvas();
		panel.setPreferredSize(new Dimension(360, 350));
		panel.setBackground(Color.WHITE);
		JButton trigger = new JButton("rotaryTable Trigger");
		trigger.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.ROTARYTRIGGER));
		JButton eStop = new JButton("emergency Stop");
		eStop.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.ESTOP));
		
		JPanel ss = new JPanel();
		ss.add(trigger);
		ss.add(eStop);

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 2;
		this.add(ss,c);
		

		JCheckBox co = new JCheckBox("Cap on Bottle At Position 1");
		co.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.CAPONBOTTLE));
		
		JCheckBox as = new JCheckBox("Table aligned with sensor");
		as.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.ALIGNEDSENSOR));
		
		JCheckBox a5 = new JCheckBox("bottle At Pos5");
		a5.addActionListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.BOTTLEATPOS5));
		
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(co);
		pan.add(as);
		pan.add(a5);

		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Manual control"));


		JPanel pan3 = new JPanel(new GridLayout(2, 2));
		pan3.add(pan);
		c.gridx = 0;
		c.gridy = 1;
		this.add(pan3,c);
		
		this.setTitle("Rotary Table");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Rotary cl = new Rotary();
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
