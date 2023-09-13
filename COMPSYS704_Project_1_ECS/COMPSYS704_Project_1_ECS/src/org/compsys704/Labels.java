package org.compsys704;

import java.util.Arrays;
import java.awt.GridBagLayout;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Labels {
	
	public static final int[] tempbounds 		= {-10,50};
	public static final int[] humiditybounds 	= {0,100};
	public static final int[] lightbounds 		= {0,5000};
	public static final List envcond = Arrays.asList(	20,22,		// Ideal zone 1 & 7 Temperature Range
														40,50,		// Ideal zone 2 & 3 Temperature Range
														-5,-1,		// Ideal zone 4, 5, & 6 Temperature Range
														
														30,50,		// Ideal zone 1 & 7 Humidity Range
														90,100,		// Ideal zone 2 & 3 Humidity Range
														0,5,		// Ideal zone 4, 5, & 6 Humidity Range
														
														400,		// Ideal zone 1 & 7 Light Intensity
														10,			// Ideal zone 2 & 3 Light Intensity
														2000,		// Ideal zone 4, 5, & 6 Light Intensity
														
														4, 30,		// Facility open time
														15, 0);		// Facility close time
	
	// Temperature Labels
	public static JLabel lz1t = new JLabel();
	public static JLabel lz2t = new JLabel();
	public static JLabel lz3t = new JLabel();
	public static JLabel lz4t = new JLabel();
	public static JLabel lz5t = new JLabel();
	public static JLabel lz6t = new JLabel();
	public static JLabel lz7t = new JLabel();

	// Humidity Labels
	public static JLabel lz1h = new JLabel();
	public static JLabel lz2h = new JLabel();
	public static JLabel lz3h = new JLabel();
	public static JLabel lz4h = new JLabel();
	public static JLabel lz5h = new JLabel();
	public static JLabel lz6h = new JLabel();
	public static JLabel lz7h = new JLabel();

	// Light Labels
	public static JLabel lz1l = new JLabel();
	public static JLabel lz2l = new JLabel();
	public static JLabel lz3l = new JLabel();
	public static JLabel lz4l = new JLabel();
	public static JLabel lz5l = new JLabel();
	public static JLabel lz6l = new JLabel();
	public static JLabel lz7l = new JLabel();
	
	
	// Temperature Sliders
	public static JSlider sz1t = new JSlider(tempbounds[0],tempbounds[1]);
	public static JSlider sz2t = new JSlider(tempbounds[0],tempbounds[1]);
	public static JSlider sz3t = new JSlider(tempbounds[0],tempbounds[1]);
	public static JSlider sz4t = new JSlider(tempbounds[0],tempbounds[1]);
	public static JSlider sz5t = new JSlider(tempbounds[0],tempbounds[1]);
	public static JSlider sz6t = new JSlider(tempbounds[0],tempbounds[1]);
	public static JSlider sz7t = new JSlider(tempbounds[0],tempbounds[1]);

	// Humidity Sliders
	public static JSlider sz1h = new JSlider(humiditybounds[0],humiditybounds[1]);
	public static JSlider sz2h = new JSlider(humiditybounds[0],humiditybounds[1]);
	public static JSlider sz3h = new JSlider(humiditybounds[0],humiditybounds[1]);
	public static JSlider sz4h = new JSlider(humiditybounds[0],humiditybounds[1]);
	public static JSlider sz5h = new JSlider(humiditybounds[0],humiditybounds[1]);
	public static JSlider sz6h = new JSlider(humiditybounds[0],humiditybounds[1]);
	public static JSlider sz7h = new JSlider(humiditybounds[0],humiditybounds[1]);

	// Light Sliders
	public static JSlider sz1l = new JSlider(lightbounds[0],lightbounds[1],lightbounds[1]/2);
	public static JSlider sz2l = new JSlider(lightbounds[0],lightbounds[1]);
	public static JSlider sz3l = new JSlider(lightbounds[0],lightbounds[1]);
	public static JSlider sz4l = new JSlider(lightbounds[0],lightbounds[1]);
	public static JSlider sz5l = new JSlider(lightbounds[0],lightbounds[1]);
	public static JSlider sz6l = new JSlider(lightbounds[0],lightbounds[1]);
	public static JSlider sz7l = new JSlider(lightbounds[0],lightbounds[1]);
	
	// Smoke Alarm Check Boxes
	public static JCheckBox z1s = new JCheckBox("Enable Smoke");
	public static JCheckBox z2s = new JCheckBox("Enable Smoke");
	public static JCheckBox z3s = new JCheckBox("Enable Smoke");
	public static JCheckBox z4s = new JCheckBox("Enable Smoke");
	public static JCheckBox z5s = new JCheckBox("Enable Smoke");
	public static JCheckBox z6s = new JCheckBox("Enable Smoke");
	public static JCheckBox z7s = new JCheckBox("Enable Smoke");
	
	// Human Presence Check Boxes
	public static JCheckBox z1p = new JCheckBox("Detect Presence");
	public static JCheckBox z2p = new JCheckBox("Detect Presence");
	public static JCheckBox z3p = new JCheckBox("Detect Presence");
	public static JCheckBox z4p = new JCheckBox("Detect Presence");
	public static JCheckBox z5p = new JCheckBox("Detect Presence");
	public static JCheckBox z6p = new JCheckBox("Detect Presence");
	public static JCheckBox z7p = new JCheckBox("Detect Presence");
	
	// Slider Panels
	public static JPanel pan1t = new JPanel(new GridBagLayout());
	public static JPanel pan1h = new JPanel(new GridBagLayout());
	public static JPanel pan1l = new JPanel(new GridBagLayout());
	public static JPanel pan2t = new JPanel(new GridBagLayout());
	public static JPanel pan2h = new JPanel(new GridBagLayout());
	public static JPanel pan2l = new JPanel(new GridBagLayout());
	public static JPanel pan3t = new JPanel(new GridBagLayout());
	public static JPanel pan3h = new JPanel(new GridBagLayout());
	public static JPanel pan3l = new JPanel(new GridBagLayout());
	public static JPanel pan4t = new JPanel(new GridBagLayout());
	public static JPanel pan4h = new JPanel(new GridBagLayout());
	public static JPanel pan4l = new JPanel(new GridBagLayout());
	public static JPanel pan5t = new JPanel(new GridBagLayout());
	public static JPanel pan5h = new JPanel(new GridBagLayout());
	public static JPanel pan5l = new JPanel(new GridBagLayout());
	public static JPanel pan6t = new JPanel(new GridBagLayout());
	public static JPanel pan6h = new JPanel(new GridBagLayout());
	public static JPanel pan6l = new JPanel(new GridBagLayout());
	public static JPanel pan7t = new JPanel(new GridBagLayout());
	public static JPanel pan7h = new JPanel(new GridBagLayout());
	public static JPanel pan7l = new JPanel(new GridBagLayout());
	
	// Zone Panels
	public static JPanel pan1 = new JPanel(new GridBagLayout());
	public static JPanel pan2 = new JPanel(new GridBagLayout());
	public static JPanel pan3 = new JPanel(new GridBagLayout());
	public static JPanel pan4 = new JPanel(new GridBagLayout());
	public static JPanel pan5 = new JPanel(new GridBagLayout());
	public static JPanel pan6 = new JPanel(new GridBagLayout());
	public static JPanel pan7 = new JPanel(new GridBagLayout());
	
	
	public static List<List<JLabel>> labels 		= Arrays.asList(Arrays.asList(lz1t,lz2t,lz3t,lz4t,lz5t,lz6t,lz7t),Arrays.asList(lz1h,lz2h,lz3h,lz4h,lz5h,lz6h,lz7h),Arrays.asList(lz1l,lz2l,lz3l,lz4l,lz5l,lz6l,lz7l));
	public static List<List<JSlider>> sliders 		= Arrays.asList(Arrays.asList(sz1t,sz2t,sz3t,sz4t,sz5t,sz6t,sz7t),Arrays.asList(sz1h,sz2h,sz3h,sz4h,sz5h,sz6h,sz7h),Arrays.asList(sz1l,sz2l,sz3l,sz4l,sz5l,sz6l,sz7l));
	public static List<List<JCheckBox>> checkboxes 	= Arrays.asList(Arrays.asList(z1s,z2s,z3s,z4s,z5s,z6s,z7s), Arrays.asList(z1p,z2p,z3p,z4p,z5p,z6p,z7p));
	public static List<JPanel> sliderpanels 		= Arrays.asList(pan1t,pan1h,pan1l,pan2t,pan2h,pan2l,pan3t,pan3h,pan3l,pan4t,pan4h,pan4l,pan5t,pan5h,pan5l,pan6t,pan6h,pan6l,pan7t,pan7h,pan7l);
	public static List<JPanel> zonepanels 			= Arrays.asList(pan1,pan2,pan3,pan4,pan5,pan6,pan7);
}
