package org.compsys704;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import com.systemj.netapi.SimpleClient;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Canvas extends JPanel {
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	private static final String IP = "127.0.0.1";
	
	SimpleClient liquidRatio;
	SimpleClient orderQuantity;
	SimpleClient sendOrder;
	BufferedImage submitOrder;
	
	JButton orderButton = new JButton();
	
//	JTextField p1liquid1 = new JTextField();
//	JTextField p2liquid2 = new JTextField();
//	JTextField p3liquid3 = new JTextField();
//	JTextField p4liquid4 = new JTextField();
	JTextField p1quantity = new JTextField();
	JTextField p2quantity = new JTextField();
	JTextField p3quantity = new JTextField();
	JTextField p4quantity = new JTextField();
	
	JTextField liquid1 = new JTextField();
	JTextField liquid2 = new JTextField();
	JTextField liquid3 = new JTextField();
	JTextField liquid4 = new JTextField();
	JTextField quantity = new JTextField();
	
	public Canvas(){
		
		
		try {
			
//			liquidRatio = new SimpleClient(IP, 10000, "POSControllerCD", "liquidRatio");
//			orderQuantity = new SimpleClient(IP, 10000, "POSControllerCD", "orderQuantity");
//			sendOrder = new SimpleClient(IP, 10000, "POSControllerCD", "sendOrder");
			JSlider liquidRatio = new JSlider(0,100);
			liquidRatio.addChangeListener(new SignalSliderClient(Ports.PORT_POS_CONTROLLER, Ports.LIQUID_RATIO, new JLabel(), "°C"));
//			JTextField orderQuantity = new JTextField(25);
//			orderQuantity.addFocusListener(new SignalTextBoxClient(Ports.PORT_POS_CONTROLLER, Ports.TIME_SIGNAL,"25"));
			
			submitOrder = ImageIO.read(new File("res/button.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		
		try {
			orderButton.setIcon(new ImageIcon(submitOrder));
			orderButton.setOpaque(false);
			orderButton.setContentAreaFilled(false);
			orderButton.setBorderPainted(false);
			orderButton.setFocusPainted(false);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		orderButton.addActionListener(e -> {
			sendOrder();
			System.out.println("Button Pressed");
		});
		
		orderButton.setBounds(500, 800, 400, 400);
		add(orderButton);
		
		p1quantity.setColumns(5);
		Dimension d = p1quantity.getPreferredSize();
		p1quantity.setBounds(100, 400 - d.height, d.width, d.height);
		
		
		p2quantity.setColumns(5);
		p2quantity.setBounds(350, 400 - d.height, d.width, d.height);
		
		p3quantity.setColumns(5);
		p3quantity.setBounds(600, 400 - d.height, d.width, d.height);
		
		p4quantity.setColumns(5);
		p4quantity.setBounds(850, 400 - d.height, d.width, d.height);
		
//		JPanel pan = new JPanel(new GridLayout(4, 1));
//		pan.add(p1quantity);
//		pan.add(p2quantity);
//		pan.add(p3quantity);
//		pan.add(p4quantity);
	}
	
//	int getLiquidTotal() {
//		if(liquid1.getText().equals("") || liquid2.getText().equals("")
//				|| liquid3.getText().equals("") || liquid4.getText().equals("")) {
//			return 0;
//		}
//		
//		try {
//			int total = Integer.parseInt(liquid1.getText()) + Integer.parseInt(liquid2.getText()) +
//					Integer.parseInt(liquid3.getText()) + Integer.parseInt(liquid4.getText());
//			
//			return total;
//		} catch (NumberFormatException e) {
//			return 0;
//		}
//	}

	
	int getP1Quantity() {
		if(p1quantity.getText().equals("")) {
			return 0;
		}
		
		try {
			int total = Integer.parseInt(p1quantity.getText());
			return total;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	
	int getP2Quantity() {
		if(p2quantity.getText().equals("")) {
			return 0;
		}
		
		try {
			int total = Integer.parseInt(p2quantity.getText());
			return total;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	
	int getP3Quantity() {
		if(p3quantity.getText().equals("")) {
			return 0;
		}
		
		try {
			int total = Integer.parseInt(p3quantity.getText());
			return total;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	
	int getP4Quantity() {
		if(p4quantity.getText().equals("")) {
			return 0;
		}
		
		try {
			int total = Integer.parseInt(p4quantity.getText());
			return total;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	
	void sendOrder() {
		
		List<Object> order = new ArrayList<>();
		
		int p1bottleQuantity = getP1Quantity();
		int p2bottleQuantity = getP2Quantity();
		int p3bottleQuantity = getP3Quantity();
		int p4bottleQuantity = getP4Quantity();
      
		for(int i = 0; i < p1bottleQuantity; i++) {
			List<Integer> p1recipe = Arrays.asList(50, 25, 10, 5);
			order.add(p1recipe);
			System.out.println("Product 1 ordered " + p1bottleQuantity + " times");
		}
		
		for(int i = 0; i < p2bottleQuantity; i++) {
			List<Integer> p2recipe = Arrays.asList(25, 25, 25, 25);
			order.add(p2recipe);
			System.out.println("Product 2 ordered " + p2bottleQuantity + " times");
		}
		
		for(int i = 0; i < p3bottleQuantity; i++) {
			List<Integer> p3recipe = Arrays.asList(0, 25, 75, 0);
			order.add(p3recipe);
			System.out.println("Product 3 ordered " + p3bottleQuantity + " times");
		}
		
		for(int i = 0; i < p4bottleQuantity; i++) {
			List<Integer> p4recipe = Arrays.asList(5, 40, 25, 30);
			order.add(p4recipe);
			System.out.println("Product 4 ordered " + p4bottleQuantity + " times");
		}
        
        
        try {
            
            liquidRatio.sustain(order);
            System.out.println("Order sent");
            
            
            // trying to emit a send order signal
//            if(s.isClosed()) {
//            	s = new Socket();
//            	s.connect(new InetSocketAddress(ip, port), 10);
//            	oos = newObjectOutputStream(s.getOutputStream());
//            	oos.object(dest);
//            	oos.writeObject(new Object[](true));
//            }
            
        } catch (IOException e) {
            System.out.println("Order failed to send");
            e.printStackTrace();
        } 
    }
	
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
			
		g.setFont(g.getFont().deriveFont(30f));
		g.drawString("Purchase Order System", 30, 50);
		
	 	g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Product 1", 50, 100);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Liquid 1(%) 50", 50, 150);
        g.drawString("Liquid 2(%) 25", 50, 200);
        g.drawString("Liquid 3(%) 15", 50, 250);
        g.drawString("Liquid 4(%) 10", 50, 300);
        g.drawString("Quantity", 85, 350);
        
        g.drawString("Product 2", 300, 100);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Liquid 1(%) 25", 300, 150);
        g.drawString("Liquid 2(%) 25", 300, 200);
        g.drawString("Liquid 3(%) 25", 300, 250);
        g.drawString("Liquid 4(%) 25", 300, 300);
        g.drawString("Quantity", 335, 350);
        
        g.drawString("Product 3", 550, 100);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Liquid 1(%) 0", 550, 150);
        g.drawString("Liquid 2(%) 25", 550, 200);
        g.drawString("Liquid 3(%) 75", 550, 250);
        g.drawString("Liquid 4(%) 0", 550, 300);
        g.drawString("Quantity", 585, 350);
        
        g.drawString("Product 4", 800, 100);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Liquid 1(%) 5", 800, 150);
        g.drawString("Liquid 2(%) 40", 800, 200);
        g.drawString("Liquid 3(%) 25", 800, 250);
        g.drawString("Liquid 4(%) 30", 800, 300);
        g.drawString("Quantity", 835, 350);
        

        
     
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 4;
		c.gridy = 1;
		this.add(p1quantity);
		this.add(p2quantity);
		this.add(p3quantity);
		this.add(p4quantity);
        
        
        
		
       
	}
}
