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
	
	public Capper() {
		
	}

	public static void main(String[] args) {
		Capper cl = new Capper();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<CapperVizWorker> server = new SignalServer<CapperVizWorker>(Ports.PORT_CAPPER_VIZ, CapperVizWorker.class);
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
