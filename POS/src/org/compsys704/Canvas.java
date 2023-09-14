package org.compsys704;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.util.List;
import java.util.ArrayList;

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
			JTextField orderQuantity = new JTextField(25);
			orderQuantity.addFocusListener(new SignalTextBoxClient(Ports.PORT_POS_CONTROLLER, Ports.TIME_SIGNAL,"25"));
			
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
		
		orderButton.setBounds(250, 500, 200, 100);
		add(orderButton);
		
		liquid1.setColumns(10);
		liquid2.setColumns(10);
		liquid3.setColumns(10);
		liquid4.setColumns(10);
		Dimension d = liquid1.getPreferredSize();
		liquid1.setBounds(150, 150 - d.height, d.width, d.height);
		liquid2.setBounds(150, 200 - d.height, d.width, d.height);
		liquid3.setBounds(150, 250 - d.height, d.width, d.height);
		liquid4.setBounds(150, 300 - d.height, d.width, d.height);
		
		quantity.setColumns(10);
		d = quantity.getPreferredSize();
		quantity.setBounds(300, 150 - d.height, d.width, d.height);
		
		add(liquid1);
		add(liquid2);
		add(liquid3);
		add(liquid4);
		add(quantity);
	}
	
	int getLiquidTotal() {
		if(liquid1.getText().equals("") || liquid2.getText().equals("")
				|| liquid3.getText().equals("") || liquid4.getText().equals("")) {
			return 0;
		}
		
		try {
			int total = Integer.parseInt(liquid1.getText()) + Integer.parseInt(liquid2.getText()) +
					Integer.parseInt(liquid3.getText()) + Integer.parseInt(liquid4.getText());
			
			return total;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	int getQuantity() {
		if(quantity.getText().equals("")) {
			return 0;
		}
		
		try {
			int total = Integer.parseInt(quantity.getText());
			return total;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	
	void sendOrder() {
		
		int bottleQuantity = getQuantity();
        int total = getLiquidTotal();
        if (bottleQuantity == 0 || total != 100) {
            System.out.println("Invalid order");
            return;
        }
        
        List<Integer> order = new ArrayList<>();
        
        try {
            order.add(Integer.parseInt(liquid1.getText()));
            order.add(Integer.parseInt(liquid2.getText()));
            order.add(Integer.parseInt(liquid3.getText()));
            order.add(Integer.parseInt(liquid4.getText()));
            
            liquidRatio.sustain(order);
            orderQuantity.sustain(Float.parseFloat(quantity.getText()));
            
            
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
        } catch (NumberFormatException e) {
            System.out.println("Invalid liquid percentages");
            e.printStackTrace();
        }
    }
	
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
			
		g.setFont(g.getFont().deriveFont(30f));
		g.drawString("Purchase Order System", 30, 50);
	 	g.setFont(g.getFont().deriveFont(25f));
        g.drawString("Fill Amounts", 50, 120);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Liquid 1(%)", 50, 150);
        g.drawString("Liquid 2(%)", 50, 200);
        g.drawString("Liquid 3(%)", 50, 250);
        g.drawString("Liquid 4(%)", 50, 300);
        g.setFont(g.getFont().deriveFont(25f));
        g.drawString("Quantity", 400, 120);
		
        
		if (getLiquidTotal() != 100) {
            g.setFont(g.getFont().deriveFont(20f));
            g.drawString("Liquid values do not add up to 100 percent", 50, 420);
        }
        if (getQuantity() == 0) {
            g.setFont(g.getFont().deriveFont(20f));
            g.drawString("Quantity not valid", 442, 420);
        }
	}
}
