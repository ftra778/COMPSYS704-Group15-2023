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

public class POS extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9165362898456361227L;
	private JPanel panel;
	
	
	public POS() {
		// Canvas
		panel = new POSCanvas();
		panel.setPreferredSize(new Dimension(1100, 500));
		panel.setBackground(Color.WHITE);
		
		// System
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		
		
		this.setTitle("Purchase Order System");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		POS pos = new POS();
		pos.pack();
		pos.setVisible(true);
		pos.setLocation(MAXIMIZED_BOTH, ABORT);

		SignalServer<POSVizWorker> server = new SignalServer<POSVizWorker>(Ports.PORT_POS_VIZ, POSVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				pos.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
