package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	BufferedImage layout;
	BufferedImage on;
	BufferedImage off;
	
	public Canvas(){
		try {
			layout = ImageIO.read(new File("res/conveyor_layout.png"));
			on = ImageIO.read(new File("res/on.png"));
			off = ImageIO.read(new File("res/off.png"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}

	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		g.drawImage(layout, 0, 50, null);
		
		
		if(States.CONVEYOR_ON) {
			g.drawImage(on, 0, 100, null);
			
		}
		
		if(States.CONVEYOR_OFF){
			g.drawImage(off, 0, 100, null);
		}
	

		
	
	}
}
