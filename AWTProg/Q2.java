//Working with Checkbox,RadioButton and Choice

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	Label l1,l2,l3;
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup grp1;
	TextField t1,t2;
	String a,b;
	
	myfrm1()
	{
		setTitle("Working with Checkbox,RadioButton and Choice");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,15));
		setLayout(null);
		
		//2)memory Allocation
			grp1 = new CheckboxGroup();
			l1 = new Label("Enter Your Name");
			l2 = new Label("Your Class");
			l3 = new Label("Your Hobbies");
			c1 = new Checkbox("Fy",false,grp1); 
			c2 = new Checkbox("SY",false,grp1);
			c3 = new Checkbox("TY",false,grp1); 
			c4 = new Checkbox("Music",false); 
			c5 = new Checkbox("Dance",false); 
			c6 = new Checkbox("Sports",false); 
			t1 = new TextField();
			t2 = new TextField("Name:--- Class:--- Hobbies:---");

		//3)Add Controls On Frames
			 add(c1);	 add(c2);	 add(c3);
			 add(c4);	 add(c5);	 add(c6);
			 add(l1);	add(l2);	add(l3);
			 add(t1);	 add(t2);
			 
		//4) setBounds(x,y,width,height)
			l1.setBounds(100,100,210,30);
			t1.setBounds(320,100,210,30);
			l2.setBounds(100,160,150,30);
			c1.setBounds(100,210,100,30);
			c2.setBounds(100,250,100,30);
			c3.setBounds(100,290,100,30);
			l3.setBounds(300,160,200,30);
			c4.setBounds(300,210,100,30);
			c5.setBounds(300,250,100,30);
			c6.setBounds(300,290,100,30);
			t2.setBounds(100,360,400,30);
		
		//5) Add Listneres on controls
			c1.addItemListener(this);
			c2.addItemListener(this);
			c3.addItemListener(this);
			c4.addItemListener(this);
			c5.addItemListener(this);
			c6.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{System.exit(0);}
		});
		setVisible(true);
	}
		public void itemStateChanged(ItemEvent e)
		{
			if(c1.getState())
					a=("Name: "+t1.getText()+" class: FY");
			else if(c2.getState())
					a=("Name: "+t1.getText()+" class: TY");
			else if(c3.getState())
					a=("Name: "+t1.getText()+" class: SY");	
				
			t2.setText(a);
				
			if(e.getSource()==c4)
			{
				if(c4.getState()==true)
					t2.setText(a+" Hobbies: Music");
				else 
					t2.setText(a);
			}
			if(e.getSource()==c5)
			{
				if(c5.getState()==true)
					t2.setText(a +" Hobbies:Dance");
				else 
					t2.setText(a);
			}
			if(e.getSource()==c6)
			{
				if(c6.getState()==true )
					t2.setText(a +" Hobbies:Sports");
				else
					t2.setText(a);
			}
			if(c4.getState()==true && c5.getState()==true)
			{
				t2.setText(a +" Hobbies:Music,Dance");
			}
			if(c5.getState()==true && c6.getState()==true)
			{
				t2.setText(a +" Hobbies:Dance,Sports");
			}
			if(c4.getState()==true && c6.getState()==true)
			{
				t2.setText(a +" Hobbies:Music,Sports");
			}	
			if(c4.getState()==true && c5.getState()==true && c6.getState()==true)
			{
				t2.setText(a +" Hobbies:Music,Dance,Sports");
			}	
		}
}


class Q2
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	