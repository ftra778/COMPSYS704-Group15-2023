package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SACSCanvas extends JPanel {
	BufferedImage layout;
	BufferedImage door_closed;
	BufferedImage door_opened;
	
	public SACSCanvas(){
		try {
			layout = ImageIO.read(new File("res/layoutsacs.png"));
			door_closed = ImageIO.read(new File("res/door_closed.png"));
			door_opened = ImageIO.read(new File("res/door_opened.png"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(layout, 0, 50, null);
		g.drawImage(door_closed, 0, 100, null);
		g.drawImage(door_closed, 120, 100, null);
		g.drawImage(door_closed, 170, 210, null);
	
		
		
		if(!States.AUTHORIZED_DOOR_2) {
			g.drawImage(door_closed, 120, 100, null);
		}
		
		if(!States.AUTHORIZED_DOOR_3) {
			g.drawImage(door_closed, 170, 210, null);
		}
		
		if(States.AUTHORIZED_DOOR_1) {
			g.drawImage(door_opened, 0, 100, null);
			
		}else {
			g.drawImage(door_closed, 0, 100, null);
		}
		
		if(States.AUTHORIZED_DOOR_2) {
			g.drawImage(door_opened, 120, 100, null);
		}
		
		if(States.AUTHORIZED_DOOR_3) {
			g.drawImage(door_opened, 170, 210, null);
		}
		
		
	
	}
}
