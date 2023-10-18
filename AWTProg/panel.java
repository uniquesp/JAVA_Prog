// panel

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ActionListener
{
	//1) Declrartion
	Button b1,b2,btn[];
	Panel pn1;
	Checkbox c1,c2;
	myfrm1()
	{
		setTitle("Panel");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);
		
		//2)memory Allocation
			b1 = new Button("Hide");
			b2 = new Button("Show");
			pn1 = new Panel();
			c1 = new Checkbox("Pen");
			c2 = new Checkbox("Pencil");
				
			//3)Add Controls On Frames
			 add(b1);	add(b2);	add(pn1);
			pn1.add(c1);	pn1.add(c2);

		
		//4) setBounds(x,y,width,height)
				b1.setBounds(100,100,100,30);
				b2.setBounds(220,100,100,30);
				pn1.setBounds(100,150,220,220);
				pn1.setBackground(Color.RED);
			//	c1.setBounds(120,0,100,30);
			//	c2.setBounds(120,100,100,30);
			btn = new Button[10];
			for(int i=0;i<10;i++)
			{
				btn[i] = new Button(""+(i+1));
				pn1.add(btn[i]);
			}
				
		
		//5) Add Listneres on controls
			b1.addActionListener(this);
			b2.addActionListener(this);
			
		
		
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
				if(e.getSource()==b1)
				{
					pn1.setVisible(false);
				}
				else if(e.getSource()==b2)
				{
					pn1.setVisible(true);
				}
				else if(e.getSource()==c1)
				{
					
				}
				else if(e.getSource()==c2)
				{
					
				}
			}
		

}

class panel 
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	