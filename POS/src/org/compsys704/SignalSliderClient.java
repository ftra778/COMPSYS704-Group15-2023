package org.compsys704;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SignalSliderClient extends SignalClient implements ChangeListener {
	
	public int val;
	protected JLabel label;
	protected String unit;
	
	public SignalSliderClient(int p, String dest, JLabel label, String unit) {
		super(p, dest);
		this.label = label;
		this.unit = unit;
		if (this.unit.contains("°C")) {
			this.val = (Labels.tempbounds[1]+Labels.tempbounds[0])/2;
		} else if (this.unit.contains("%")) {
			this.val = (Labels.humiditybounds[1]+Labels.humiditybounds[0])/2;
		} else {
			this.val = (Labels.lightbounds[1]+Labels.lightbounds[0])/2;
		}
		this.label.setText(Integer.toString(val) + unit);
		
		// Set initial values so that each slider does not require change
		try {
			if(s.isClosed()){
				s = new Socket();
				s.connect(new InetSocketAddress(ip, port), 10);
				oos = new ObjectOutputStream(s.getOutputStream());
				oos.writeObject(dest);
				int resp = s.getInputStream().read();
				if(resp < 0)
					throw new ConnectException("Not thru");
			}
			oos.writeObject(new Object[]{true, this.val});
		}
		catch (IOException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		 this.val = ((JSlider)e.getSource()).getValue();
		 this.label.setText(Integer.toString(val) + unit);
		 try {
			if(s.isClosed()){
				s = new Socket();
				s.connect(new InetSocketAddress(ip, port), 10);
				oos = new ObjectOutputStream(s.getOutputStream());
				oos.writeObject(dest);
				int resp = s.getInputStream().read();
				if(resp < 0)
					throw new ConnectException("Not thru");
			}
			oos.writeObject(new Object[]{true, this.val});
		}
		catch (IOException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}
}


	
