package org.compsys704;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage layout;
	BufferedImage turn;
	BufferedImage door_opened;
	
	public Canvas(){
		try {
			layout = ImageIO.read(new File("res/rotaryTable_layout.png"));
			turn = ImageIO.read(new File("res/rotaryTable_turn.png"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(layout, 0, 50, null);
		
		
		if(States.ROTARYTABLE_TRIGGERED) {
			g.drawImage(turn, 0, 50, null);
		}else {
			g.drawImage(layout, 0, 50, null);
		}
		
		
	
	}
}
