package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	BufferedImage gocr;
	BufferedImage goce;
	BufferedImage gccr;
	BufferedImage gcce;
	BufferedImage loader;
	BufferedImage cap;
	BufferedImage capper;
	
	public Canvas(){
		try {
			BufferedImage bi = ImageIO.read(new File("res/Capper.png"));
			gocr = bi.getSubimage(540, 297, 369, 189);	// Gripper Open, Cylinder Retracted
			goce = bi.getSubimage(963, 297, 369, 189);		// Gripper Open, Cylinder Extended
//			gccr = bi.getSubimage(540, 564, 64, 189);		// Gripper Closed, Cylinder Retracted (SHOULD NOT HAPPEN)
			gcce = bi.getSubimage(963, 564, 369, 189);		// Gripper Closed, Cylinder Extended

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(States.GRIPPER_RETRACTED)
			g.drawImage(gocr, 0, 60, null);
		else if (States.GRIPPER_EXTENDED)
			if (States.GRIPPER_OPEN)
				g.drawImage(goce, 0, 60, null);
			else if (States.GRIPPER_CLOSED)
				g.drawImage(gcce, 0, 60, null);
	}
}
