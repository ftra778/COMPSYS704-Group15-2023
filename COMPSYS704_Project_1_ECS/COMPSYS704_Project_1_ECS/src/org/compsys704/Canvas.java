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
	private static final int[] x = {165,515,745,905,665,445,175};
	private static final int[] y = {330,330,330,50,50,50,50};
	BufferedImage layout;
	BufferedImage coldOn;
	BufferedImage coldOff;
	BufferedImage heatOn;
	BufferedImage heatOff;
	BufferedImage lightOn;
	BufferedImage lightOff;
	BufferedImage warningOn;
	BufferedImage warningOff;
	BufferedImage airconOff;
	BufferedImage airconCold;
	BufferedImage airconHot;
	BufferedImage humidityOff;
	BufferedImage humidityInc;
	BufferedImage humidityDec;
	
	public Canvas(){
		
		try {
			layout 		= ImageIO.read(new File("res/layout.png"));
			coldOn 		= ImageIO.read(new File("res/cold_on.png"));
			coldOff 	= ImageIO.read(new File("res/cold_off.png"));
			heatOn 		= ImageIO.read(new File("res/heat_on.png"));
			heatOff 	= ImageIO.read(new File("res/heat_off.png"));
			lightOn 	= ImageIO.read(new File("res/light_on.png"));
			lightOff 	= ImageIO.read(new File("res/light_off.png"));
			warningOn 	= ImageIO.read(new File("res/warning_on.png"));
			warningOff 	= ImageIO.read(new File("res/warning_off.png"));
			airconOff 	= ImageIO.read(new File("res/aircon_off.png"));
			airconCold 	= ImageIO.read(new File("res/aircon_cold.png"));
			airconHot 	= ImageIO.read(new File("res/aircon_hot.png"));
			humidityOff = ImageIO.read(new File("res/humidity_off.png"));
			humidityInc = ImageIO.read(new File("res/humidity_inc.png"));
			humidityDec = ImageIO.read(new File("res/humidity_dec.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(layout, 0, 0, null);
		
		for(int i = 0; i < States.TEMP_STATE.length; i++) {
			if ((i == 0) || (i == 6)) {
				if (States.TEMP_STATE[i] == 0) {
					g.drawImage(coldOn, x[i], y[i], null);
					g.drawImage(heatOff, x[i] + 50, y[i], null);
				} else if (States.TEMP_STATE[i] == 1) {
					g.drawImage(coldOff, x[i], y[i], null);
					g.drawImage(heatOff, x[i] + 50, y[i], null);
				} else if (States.TEMP_STATE[i] == 2) {
					g.drawImage(coldOff, x[i], y[i], null);
					g.drawImage(heatOn, x[i] + 50, y[i], null);
				}
			} else {
				if (States.TEMP_STATE[i] == 0) {
					g.drawImage(airconCold, x[i], y[i], null);
				} else if (States.TEMP_STATE[i] == 1) {
					g.drawImage(airconOff, x[i], y[i], null);
				} else if (States.TEMP_STATE[i] == 2) {
					g.drawImage(airconHot, x[i], y[i], null);
				}
			}
			
			if (States.HUMIDITY_STATE[i] == 0) {
				g.drawImage(humidityInc, x[i] + 100, y[i], null);
			} else if (States.HUMIDITY_STATE[i] == 1) {
				g.drawImage(humidityOff, x[i] + 100, y[i], null);
			} else if (States.HUMIDITY_STATE[i] == 2) {
				g.drawImage(humidityDec, x[i] + 100, y[i], null);
			}
			
			if (States.LIGHT_STATE[i] == false) {
				g.drawImage(lightOff, x[i], y[i] + 50, null);
			} else {
				g.drawImage(lightOn, x[i], y[i] + 50, null);
			}
			
			if (States.SMOKE_STATE == 0) {
				g.drawImage(warningOff, x[i] + 50, y[i] + 50, null);
			} else {
				g.drawImage(warningOn, x[i] + 50, y[i] + 50, null);
			}
		}
	}
}
