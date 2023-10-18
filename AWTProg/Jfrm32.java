//one Frame to Other Frame 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class myframe extends JFrame implements ActionListener
{	
	//declaration
	JLabel lb1;
	JButton btn1;
	
	
	myframe()
	{
		
		setSize(500,300);
		setTitle("I am on main frame");
		setLocation(500,200);
		setFont(new Font("Arial",Font.BOLD,20));
		setLayout(new FlowLayout());
		
		
		// 2)Memory Allocation
		lb1 = new JLabel ("Welcome");
		btn1 = new JButton("Click Me");
		
		// 3) Add controls on frame
		add(btn1);	add(lb1);
		
		//4) Add Listneres on controls
		btn1.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
	     new myframe1(); //call to next frame constructor
		// dispose(); //it will disposes itself means main frame and calls child frame
	}

}


class Jfrm32
{
	public static void main(String args[])
	{
		new myframe();
	}
}


class myframe1 extends JFrame implements ActionListener
{	
	//declaration
	JLabel lb1;
	JButton btn1;
	
	
	myframe1()
	{
		setTitle("Nextframe");
		setSize(500,300);
		setLocation(500,300);
		setLayout(new FlowLayout());
		
		
		// 2)Memory Allocation
		lb1 = new JLabel ("I am on Frame 1");
		btn1 = new JButton("Back");
		
		// 3) Add controls on frame
		add(btn1);	add(lb1);
		
		//4) Add Listneres on controls
		btn1.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
			dispose();
	}

}


