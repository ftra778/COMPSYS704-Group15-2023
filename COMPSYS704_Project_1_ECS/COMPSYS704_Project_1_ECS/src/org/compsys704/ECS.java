package org.compsys704;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class ECS extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9165362898456361227L;
	private JPanel panel;
	private final String timeInit = "12:30";
	
	public ECS() {
		// Canvas
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(1079, 552));
		panel.setBackground(Color.WHITE);
		
		// System
		JButton update = new JButton("Update");
		update.addActionListener(new SignalClient(Ports.PORT_ECS_CONTROLLER, Ports.UPDATE_SIGNAL));
		JTextField time = new JTextField(timeInit);
		time.setColumns(3);
		time.addFocusListener(new SignalTextBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.TIME_SIGNAL,timeInit));
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		JPanel systempanel = new JPanel();
		JPanel updatepanel = new JPanel();
		JPanel timepanel = new JPanel();
		updatepanel.add(update);
		timepanel.add(time);
		systempanel.setBorder(BorderFactory.createTitledBorder("System"));
		systempanel.setLayout(new GridBagLayout());
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 0.4;
		systempanel.add(updatepanel,c);
		c.gridx = 0;
		c.gridy = 1;
		c.weighty = 0.6;
		systempanel.add(timepanel,c);
		
		
		GridBagConstraints c2 = new GridBagConstraints();
		Dimension pandim = new Dimension(200,50);

		// Smoke Alarms, Human Presence, and Slider Listeners
		for(int i = 0; i < Labels.checkboxes.get(0).size(); i++) {
			Labels.checkboxes.get(0).get(i).setEnabled(true);
			Labels.checkboxes.get(1).get(i).setEnabled(true);
			Labels.checkboxes.get(0).get(i).addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_SMOKE[i]));
			Labels.checkboxes.get(1).get(i).addItemListener(new SignalCheckBoxClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_PRESENCE[i]));
			Labels.sliders.get(0).get(i).addChangeListener(new SignalSliderClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_TEMP[i], Labels.labels.get(0).get(i), "°C"));
			Labels.sliders.get(1).get(i).addChangeListener(new SignalSliderClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_HUMIDITY[i], Labels.labels.get(1).get(i), "%"));
			Labels.sliders.get(2).get(i).addChangeListener(new SignalSliderClient(Ports.PORT_ECS_CONTROLLER, Ports.SIGNAL_LIGHT[i], Labels.labels.get(2).get(i), " lx"));
		}
		
		// Slider Details
		for(List<JSlider> x : Labels.sliders) {
			for (JSlider i : x) {
				i.setMajorTickSpacing((i.getMaximum() - i.getMinimum())/2);
				i.setMinorTickSpacing((i.getMaximum() - i.getMinimum())/10);
				i.setPaintTicks(true);
				i.setPaintLabels(true);
				i.setPreferredSize(new Dimension(150,45));
			}
		}
		
		// Slider Labels
		for(List<JLabel> x : Labels.labels) {
			for (JLabel i : x) {
				i.setPreferredSize(new Dimension(45,45));
			}
		}
		
		// Slider Sub-panels
		for(int j = 0; j < (Labels.sliderpanels.size()/3); j++) {
			for (int i = 0; i < 3; i++) {
				Labels.sliderpanels.get((j*3)+i).setPreferredSize(pandim);
				c2.gridx = 0;
				c2.gridy = i;
				Labels.sliderpanels.get((j*3)+i).add(Labels.sliders.get(i).get(j),c2);
				c2.gridx = 1;
				c2.gridy = i;
				Labels.sliderpanels.get((j*3)+i).add(Labels.labels.get(i).get(j),c2);
			}
		}
		
		// Zone Panels
		for(int i = 0; i < Labels.zonepanels.size(); i++) {
			c2.gridwidth = 1;
			c2.gridx = 0;
			c2.gridy = 0;
			Labels.zonepanels.get(i).add(Labels.checkboxes.get(0).get(i),c2);
			c2.gridx = 1;
			c2.gridy = 0;
			Labels.zonepanels.get(i).add(Labels.checkboxes.get(1).get(i),c2);
			c2.gridwidth = 2;
			c2.gridx = 0;
			c2.gridy = 1;
			Labels.zonepanels.get(i).add(Labels.sliderpanels.get((i*3)),c2);
			c2.gridx = 0;
			c2.gridy = 2;
			Labels.zonepanels.get(i).add(Labels.sliderpanels.get((i*3)+1),c2);
			c2.gridx = 0;
			c2.gridy = 3;
			Labels.zonepanels.get(i).add(Labels.sliderpanels.get((i*3)+2),c2);
			Labels.zonepanels.get(i).setBorder(BorderFactory.createTitledBorder("Zone " + Integer.toString(i+1) + " Environment Control"));
		}
		
		// Add everything to overall panels
		JPanel opan2 = new JPanel(new GridLayout(1, 4));
		opan2.add(systempanel);
		opan2.add(Labels.zonepanels.get(0));
		opan2.add(Labels.zonepanels.get(1));
		opan2.add(Labels.zonepanels.get(2));
		JPanel opan3 = new JPanel(new GridLayout(1, 4));
		opan3.add(Labels.zonepanels.get(3));
		opan3.add(Labels.zonepanels.get(4));
		opan3.add(Labels.zonepanels.get(5));
		opan3.add(Labels.zonepanels.get(6));
		c.gridx = 0;
		c.gridy = 1;
		this.add(opan2,c);
		c.gridx = 0;
		c.gridy = 2;
		this.add(opan3,c);
		
		this.setTitle("ECS");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		ECS cl = new ECS();
		cl.pack();
		cl.setVisible(true);
		cl.setLocation(MAXIMIZED_BOTH, ABORT);
		
		SignalServer<ECSVizWorker> server = new SignalServer<ECSVizWorker>(Ports.PORT_ECS_VIZ, ECSVizWorker.class);
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
