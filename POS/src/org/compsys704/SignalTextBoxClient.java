package org.compsys704;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.JTextField;

public class SignalTextBoxClient extends SignalClient implements FocusListener {
	
	public String text;

	public SignalTextBoxClient(int p, String dest, String text) {
		super(p, dest);
		this.text = text;
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
			oos.writeObject(new Object[]{true, text});
		}
		catch (IOException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		JTextField onFocus;
		onFocus = (JTextField) e.getSource();
		text = onFocus.getText();
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		int hours;
		int minutes;
		JTextField onUnfocus;
		
		onUnfocus = (JTextField) e.getSource();
		
		try {
	        hours = Integer.parseInt(onUnfocus.getText().substring(0, 2));
	        minutes = Integer.parseInt(onUnfocus.getText().substring(3, 5));
	        if (onUnfocus.getText().length() != 5) {
				throw new StringIndexOutOfBoundsException();
			}
	        if ((hours > 24) || (minutes > 59) || (onUnfocus.getText().charAt(2) != ':')) {
	        	throw new NumberFormatException();
	        }
	    } catch (NumberFormatException | StringIndexOutOfBoundsException ee) {
			onUnfocus.setText(text);
	        return;
	    }
		 try {
			 text = onUnfocus.getText();
			 if(s.isClosed()){
				s = new Socket();
				s.connect(new InetSocketAddress(ip, port), 10);
				oos = new ObjectOutputStream(s.getOutputStream());
				oos.writeObject(dest);
				int resp = s.getInputStream().read();
				if(resp < 0)
					throw new ConnectException("Not thru");
			}
			oos.writeObject(new Object[]{true, text});
		}
		catch (IOException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}

}
