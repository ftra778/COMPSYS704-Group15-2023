package org.compsys704;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Capper extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9165362898456361227L;
	private JPanel panel;
	
	public Capper() {
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(366, 350));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("Enable");
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));
		JButton bottleReady = new JButton("Bottle Ready");
		bottleReady.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.BOTTLE_READY_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(bottleReady);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_Mode);
		JRadioButton mmode = new JRadioButton("Manual");
		mmode.setActionCommand("1");
		mmode.addActionListener(src);
		JRadioButton amode = new JRadioButton("Auto");
		amode.setActionCommand("0");
		amode.addActionListener(src);
		amode.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(mmode);
		bg.add(amode);
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(amode);
		pan.add(mmode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Mode Selector"));

		// Checkboxes
		JCheckBox cb = new JCheckBox("clampBottle");
		cb.setEnabled(false);
		cb.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_CLAMP_BOTTLE));
		JCheckBox gc = new JCheckBox("gripCap");
		gc.setEnabled(false);
		gc.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_GRIP_CAP));
		JCheckBox lc = new JCheckBox("lowerCapper");
		lc.setEnabled(false);
		lc.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_LOWER_CAPPER));
		JCheckBox th = new JCheckBox("rotateGripperHome");
		th.setEnabled(false);
		th.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_GRIPPER_TURN_HOME));
		JCheckBox tf = new JCheckBox("rotateGripperFinal");
		tf.setEnabled(false);
		tf.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_GRIPPER_TURN_FINAL));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(lc);
		pan2.add(cb);
		pan2.add(gc);
		pan2.add(th);
		pan2.add(tf);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		this.setTitle("Capper");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Capper cl = new Capper();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<CapperVizWorker> server = new SignalServer<CapperVizWorker>(Ports.PORT_LOADER_VIZ, CapperVizWorker.class);
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
