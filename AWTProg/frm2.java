// First Frame program

import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements WindowListener
{
	myframe()
	{
		super("My First Frame");
		setSize(500,300);
		//setTitle("MY First Frame");
		setLocation(500,200);
		
		addWindowListener(this);
		setVisible(true);
		
	}


public void windowOpened(WindowEvent e)
	{
		System.out.println("FRAME STARTED");
	}
public void windowClosed(WindowEvent e)
	{
		System.out.println("FRAME ENDED");
	}
public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
}


class frm2
{
	public static void main(String args[])
	{
		new myframe();
	}
}