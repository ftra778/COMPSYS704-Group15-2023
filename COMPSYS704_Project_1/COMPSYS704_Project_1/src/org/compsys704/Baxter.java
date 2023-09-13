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
		Conveyor cv = new Conveyor();
		cv.pack();
		cv.setVisible(true);
		cv.setLocation(0, 0);
		
		Rotary rt = new Rotary();
		rt.pack();
		rt.setVisible(true);
		rt.setLocation(cv.getLocation().x + 600, cv.getLocation().y);
		
		Capper cp = new Capper();
		cp.pack();
		cp.setVisible(true);
		cp.setLocation(0, cv.getLocation().y + 600);
		
		CapLoader cl = new CapLoader();
		cl.pack();
		cl.setVisible(true);
		cp.setLocation(cv.getLocation().x + 600, cv.getLocation().y + 600);

		Baxter bx = new Baxter();
		bx.pack();
		bx.setVisible(true);
		bx.setLocation(0, 0);
		
		ECS ecs = new ECS();
		ecs.pack();
		ecs.setVisible(true);
		ecs.setLocation(MAXIMIZED_BOTH, ABORT);

		SACS sacs = new SACS();
		sacs.pack();
		sacs.setVisible(true);
		

		SignalServer<SACSVizWorker> sacsserver = new SignalServer<SACSVizWorker>(Ports.PORT_SACS_VIZ, SACSVizWorker.class);
		SignalServer<ECSVizWorker> ecsserver = new SignalServer<ECSVizWorker>(Ports.PORT_ECS_VIZ, ECSVizWorker.class);
		SignalServer<ConveyorVizWorker> conserver = new SignalServer<ConveyorVizWorker>(Ports.PORT_CONVEYOR_VIZ, ConveyorVizWorker.class);
		SignalServer<RotaryVizWorker> roterver = new SignalServer<RotaryVizWorker>(Ports.PORT_ROTARY_VIZ, RotaryVizWorker.class);
		SignalServer<CapperVizWorker> capserver = new SignalServer<CapperVizWorker>(Ports.PORT_CAPPER_VIZ, CapperVizWorker.class);
		SignalServer<LoaderVizWorker> clserver = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		SignalServer<BaxterVizWorker> baxserver = new SignalServer<BaxterVizWorker>(Ports.PORT_BAXTER_VIZ, BaxterVizWorker.class);
		new Thread(conserver).start();
		new Thread(roterver).start();
		new Thread(capserver).start();
		new Thread(clserver).start();
		new Thread(baxserver).start();
		new Thread(ecsserver).start();
		new Thread(sacsserver).start();
		
		while(true){
			try {
				cv.repaint();
				rt.repaint();
				cp.repaint();
				cl.repaint();
				bx.repaint();
				ecs.repaint();
				sacs.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
