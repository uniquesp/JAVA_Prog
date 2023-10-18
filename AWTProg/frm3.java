// Adapter class demo
//components and Events


import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListener

{	
	//declaration
	Label lb1;
	Button btn1;
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
		lb1 = new Label ("Welcome");
		btn1 = new Button("Click Me");
		
		// 3) Add controls on frame
		
		add(btn1);
		add(lb1);
		
		//4) Add Listneres on controls
		btn1.addActionListener(this);
		
		
		
		addWindowListener(new WindowAdapter()
		{
			//method overriding
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cnt++;
		lb1.setText(" Clicked\t" + cnt);
	}

}


class frm3
{
	public static void main(String args[])
	{
		new myframe();
	}
}