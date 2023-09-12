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
	BufferedImage block;
	BufferedImage linExt;
	BufferedImage linRet;
	BufferedImage clampOpen;
	BufferedImage clampClose;
	BufferedImage gripOpen;
	BufferedImage gripClose;
	BufferedImage rotHome;
	BufferedImage rotFinal;
	BufferedImage bottleUncapped;
	BufferedImage bottleCapped;
	int extAmount = 0; //40 if extended
	
	public Canvas(){
		try {
			block 			= ImageIO.read(new File("res/block.png"));
			linExt 			= ImageIO.read(new File("res/lin_ext.png"));
			linRet 			= ImageIO.read(new File("res/lin_ret.png"));
			clampOpen 		= ImageIO.read(new File("res/clamp_open.png"));
			clampClose 		= ImageIO.read(new File("res/clamp_close.png"));
			gripOpen 		= ImageIO.read(new File("res/grip_open.png"));
			gripClose 		= ImageIO.read(new File("res/grip_close.png"));
			rotHome 		= ImageIO.read(new File("res/rot_home.png"));
			rotFinal 		= ImageIO.read(new File("res/rot_final.png"));
			bottleUncapped 	= ImageIO.read(new File("res/bottle_uncapped.png"));
			bottleCapped 	= ImageIO.read(new File("res/bottle_capped.png"));

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(block, 114, 81, null);
		if(States.CAPPER_RAISED) {
			g.drawImage(linRet, 59, 96, null);
			extAmount = 0;
		} else {
			g.drawImage(linExt, 59, 96, null);
			extAmount = 40;
		}
		
		if (States.BOTTLE_PRESENT && !States.CAPPED) {
			g.drawImage(bottleUncapped, 11, 255, null);
		} else if (States.BOTTLE_PRESENT && States.CAPPED) {
			g.drawImage(bottleCapped, 11, 255, null);
		}
		
		if(States.BOTTLE_CLAMPED) {
			g.drawImage(clampClose, 29, 154 + extAmount, null);
		} else {
			g.drawImage(clampOpen, 29, 154 + extAmount, null);
		}

		if(States.GRIPPER_TURN_FINAL) {
			g.drawImage(rotFinal, 0, 148 + extAmount, null);
		} else if(States.GRIPPER_TURN_HOME) {
			g.drawImage(rotHome, 0, 148 + extAmount, null);
		}
		
		if(States.CAP_GRIPPED) {
			g.drawImage(gripClose, 0, 183 + extAmount, null);
		} else {
			g.drawImage(gripOpen, 0, 183 + extAmount, null);
		}
	}
}
