// Adapter class demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements ActionListener

{	
	//declaration
	JLabel lb1;
	JButton btn1;
	int cnt = 0;
	
	myframe()
	{
		super("My First Frame");
		setSize(500,300);
		//1) setTitle("MY First Frame");
		setLocation(500,200);
		
		setFont(new Font("Arial",Font.BOLD,20));
		setLayout(new FlowLayout());
		// 2)Memory Allocation
		lb1 = new JLabel ("Welcome");
		btn1 = new JButton("Click Me");
		
		// 3) Add controls on frame
		
		add(btn1);
		add(lb1);
		btn1.setMnemonic('c'); //shortcut of clicking alt+c on keyboard
		btn1.setToolTipText("This is Button");// to show msg when we keep mouse pointer near button
		
		//4) Add Listneres on controls
		btn1.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cnt++;
		lb1.setText(" Clicked\t" + cnt);
	}

}


class Jfrm3
{
	public static void main(String args[])
	{
		new myframe();
	}
}