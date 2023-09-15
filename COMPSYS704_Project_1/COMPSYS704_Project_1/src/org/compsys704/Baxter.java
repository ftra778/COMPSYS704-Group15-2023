package org.compsys704;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Baxter extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9165362898456361227L;
	private JPanel panel;
	
	public Baxter() {
		// Canvas
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 50));
		
		JButton enable = new JButton("Enable");
		enable.addActionListener(new SignalClient(Ports.PORT_BAXTER_PLANT, Ports.ENABLE_BAXTER_SIGNAL));
		JButton ebl = new JButton("Empty Bottle Ready");
		ebl.addActionListener(new SignalClient(Ports.PORT_BAXTER_CONTROLLER, Ports.EMPTY_BOTTLE_READY_SIGNAL));
		JButton fbl = new JButton("Full Bottle Ready");
		fbl.addActionListener(new SignalClient(Ports.PORT_BAXTER_CONTROLLER, Ports.FULL_BOTTLE_READY_SIGNAL));

		panel.add(ebl);
		panel.add(enable);
		panel.add(fbl);
		this.add(panel);
		
		this.setTitle("Baxter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Baxter bx = new Baxter();
		bx.pack();
		bx.setVisible(true);
		bx.setLocation(MAXIMIZED_BOTH, ABORT);
		
		SignalServer<BaxterVizWorker> server = new SignalServer<BaxterVizWorker>(Ports.PORT_BAXTER_VIZ, BaxterVizWorker.class);
		new Thread(server).start();
	}
}
