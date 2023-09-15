package org.compsys704;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class ABS extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9165362898456361227L;
	private JPanel panel;
	
	public ABS() {
		// Canvas
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 50));
		
		JButton enable = new JButton("Enable");
		enable.addActionListener(new SignalClient(Ports.PORT_BAXTER_PLANT, Ports.ENABLE_BAXTER_SIGNAL));
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_LOADER_SIGNAL));
		enable.addActionListener(new SignalClient(Ports.PORT_CAPPER_PLANT, Ports.ENABLE_CAPPER_SIGNAL));
		enable.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.ATPOS1));
		JButton ebl = new JButton("Empty Bottle Ready");
		ebl.addActionListener(new SignalClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.EBR));
		JCheckBox fbl = new JCheckBox("Full Bottle Ready");
		fbl.addActionListener(new SignalCheckBoxClient(Ports.PORT_CONVEYOR_CONTROLLER, Ports.LEFTPOS5));

		panel.add(ebl);
		panel.add(enable);
		panel.add(fbl);
		this.add(panel);
		
		this.setTitle("ABS");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		ABS abs = new ABS();
		abs.pack();
		abs.setVisible(true);
		
		Conveyor cv = new Conveyor();
		cv.pack();
		cv.setVisible(true);
		
		Rotary rt = new Rotary();
		rt.pack();
		rt.setVisible(true);
		
		Capper cp = new Capper();
		cp.pack();
		cp.setVisible(true);
		
		CapLoader cl = new CapLoader();
		cl.pack();
		cl.setVisible(true);

//		Baxter bx = new Baxter();
//		bx.pack();
//		bx.setVisible(true);
//		
		ECS ecs = new ECS();
		ecs.pack();
		ecs.setVisible(true);

		SACS sacs = new SACS();
		sacs.pack();
		sacs.setVisible(true);
		

		SignalServer<SACSVizWorker> sacsserver = new SignalServer<SACSVizWorker>(Ports.PORT_SACS_VIZ, SACSVizWorker.class);
		SignalServer<ECSVizWorker> ecsserver = new SignalServer<ECSVizWorker>(Ports.PORT_ECS_VIZ, ECSVizWorker.class);
		SignalServer<ConveyorVizWorker> conserver = new SignalServer<ConveyorVizWorker>(Ports.PORT_CONVEYOR_VIZ, ConveyorVizWorker.class);
		SignalServer<RotaryVizWorker> rotserver = new SignalServer<RotaryVizWorker>(Ports.PORT_ROTARY_VIZ, RotaryVizWorker.class);
		SignalServer<CapperVizWorker> capserver = new SignalServer<CapperVizWorker>(Ports.PORT_CAPPER_VIZ, CapperVizWorker.class);
		SignalServer<LoaderVizWorker> clserver = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		SignalServer<BaxterVizWorker> baxserver = new SignalServer<BaxterVizWorker>(Ports.PORT_BAXTER_VIZ, BaxterVizWorker.class);
		new Thread(conserver).start();
		new Thread(rotserver).start();
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
//				bx.repaint();
				ecs.repaint();
				sacs.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
