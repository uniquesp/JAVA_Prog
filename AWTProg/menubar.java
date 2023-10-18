//Menu Bar


// panel

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ActionListener
{
	//1) Declrartion
	MenuBar mbr;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	myfrm1()
	{
		setTitle("Panel");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,30));
		setLayout(null);
		
		//2)memory Allocation
		mbr = new MenuBar();
		m1 = new Menu ("File");	
		m2 = new Menu ("color");	
		m3 = new Menu ("Exit");	
		mi1 = new MenuItem ("New");	
		mi2 = new MenuItem ("Open");	
		mi3 = new MenuItem ("Close");	
		mi4 = new MenuItem ("Red");	
		mi5 = new MenuItem ("Green");	
		mi6 = new MenuItem ("Yellow");	
		mi7 = new MenuItem ("Exit");	
				
			//3)Add Controls On Frames
			m1.add(mi1);	 m1.add(mi2);	m1.add(mi3);
			mbr.add(m1);
			
			m2.add(mi4);	 m2.add(mi5);	m2.add(mi6);
			mbr.add(m2);
			
			m3.add(mi7);
			mbr.add(m3);
			
			setMenuBar(mbr);
			//mbr.setFont(new Font ("Arial", Font.BOLD,20));


		
		//4) setBounds(x,y,width,height)
				
				
		
		//5) Add Listneres on controls
			mi7.addActionListener(this);
			mi4.addActionListener(this);
			mi5.addActionListener(this);
			mi6.addActionListener(this);
			
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
				if(e.getSource() == mi7)
				{
					System.exit(0);
				}
				if(e.getSource() == mi4)
				{
					setBackground(Color.RED);
				}
				if(e.getSource() == mi5)
				{
					setBackground(Color.GREEN);

				}
				if(e.getSource() == mi6)
				{
					setBackground(Color.YELLOW);

				}
			}
		

}

class menubar
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	