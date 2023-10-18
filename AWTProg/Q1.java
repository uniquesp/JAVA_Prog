//Working With Fonts

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
		Label l1,l2,l3;
		Checkbox ch1,ch2;
		TextField t1;
		Choice c1,c2;
		Font f;
	
	myfrm1()
	{
		setTitle("Working With Font");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.PLAIN,20));
		setLayout(null);
		
		//2)memory Allocation
			ch1 = new Checkbox("Bold"); //bydefault false
			ch2 = new Checkbox("Italic");
			l1 = new Label("Font");
			l2 = new Label("Size");
			l3 = new Label("Style");
			c1= new Choice();
			c2= new Choice();
			t1 = new TextField("Welcome");
			
		//3)Add Controls On Frames
			 add(ch1);	add(ch2);	add(t1);
			 add(l1);	add(l2);	add(l3);
			 add(c1);	add(c2);
			 
			 c1.add("Cursive");	c1.add("Arial");
			 c1.add("Monospaced");	c1.add("Serif");
			 
			 c2.add("14");	c2.add("16");
			 c2.add("18");	c2.add("24");
		
		//4) setBounds(x,y,width,height)
			l1.setBounds(100,100,100,30);
			c1.setBounds(100,150,180,30);
			l2.setBounds(100,200,100,30);
			c2.setBounds(100,250,180,30);
			l3.setBounds(350,100,100,30);
			ch1.setBounds(350,150,100,30);
			ch2.setBounds(350,200,100,30);
			t1.setBounds(100,300,300,40);
		
		//5) Add Listneres on controls
			c1.addItemListener(this);
			c2.addItemListener(this);
			ch1.addItemListener(this);
			ch2.addItemListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{System.exit(0);}
		});
		setVisible(true);
	}
			
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == c1)
		{
			if(c1.getSelectedIndex()==0)
			{
				f = new Font("Cursive",Font.PLAIN,20);
				t1.setFont(f);
			}
			if(c1.getSelectedIndex()==1)
			{
				f = new Font("Arial",Font.PLAIN,20);
				t1.setFont(f);
			}
			if(c1.getSelectedIndex()==2)
			{	
				f = new Font("Monospaced",Font.PLAIN,20);
				t1.setFont(f);
			}
			if(c1.getSelectedIndex()==3)
			{
				f = new Font("Serif",Font.PLAIN,20);
				t1.setFont(f);
			}
		}
		if(e.getSource() == c2)
		{
			if(c2.getSelectedIndex()==0)
				f = new Font(t1.getFont().getName(),Font.PLAIN,14);
				t1.setFont(f);
			if(c2.getSelectedIndex()==1)
				f = new Font(t1.getFont().getName(),Font.PLAIN,16);
				t1.setFont(f);
			if(c2.getSelectedIndex()==2)
				f = new Font(t1.getFont().getName(),Font.PLAIN,18);
				t1.setFont(f);
			if(c2.getSelectedIndex()==3)
				f = new Font(t1.getFont().getName(),Font.PLAIN,24);
				t1.setFont(f);
		}
		if(e.getSource()==ch1)
		{
			if(ch1.getState()==true)
				{f = new Font(t1.getFont().getName(),Font.BOLD,t1.getFont().getSize());
				t1.setFont(f);}
			else 
				{f = new Font(t1.getFont().getName(),Font.PLAIN,t1.getFont().getSize());
				t1.setFont(f);}
		}
		if(e.getSource()==ch2)
		{
			if(ch2.getState()==true)
				{f = new Font(t1.getFont().getName(),Font.ITALIC,t1.getFont().getSize());
				t1.setFont(f);}
			else 
				{f = new Font(t1.getFont().getName(),Font.PLAIN,t1.getFont().getSize());
				t1.setFont(f);}
		}
		if(ch1.getState()==true && ch2.getState()==true)
		{
			f = new Font(t1.getFont().getName(),Font.BOLD+Font.ITALIC,t1.getFont().getSize());
			t1.setFont(f);
		}
	 }
}
class Q1
{
	public static void main(String args[])
	{new myfrm1();}
}
	