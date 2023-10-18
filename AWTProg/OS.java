//Operating System {Radio Button}

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	Checkbox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8;
	CheckboxGroup grp1,grp2,grp3; 
	TextField t1;
	String a,b,c;
	
	myfrm1()
	{
		setTitle("Operating System");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);
		
		//2)memory Allocation
			grp1 = new CheckboxGroup();
			grp2 = new CheckboxGroup();
			grp3 = new CheckboxGroup();
			ch1 = new Checkbox("Win 7",true,grp1); //bydefault false
			ch2 = new Checkbox("Win 8",false,grp1); 
			ch3 = new Checkbox("Win 10",false,grp1); 
			ch4 = new Checkbox("Supported",true,grp2); 
			ch5 = new Checkbox("Not Supported",false,grp2); 
			ch6 = new Checkbox("c",true,grp3); 
			ch7 = new Checkbox("cpp",false,grp3); 
			ch8 = new Checkbox("java",false,grp3); 

			t1 = new TextField();



		//3)Add Controls On Frames
			 add(ch1);	add(ch2);	add(ch3);	add(ch4);
			 add(ch5);	add(ch6);	add(ch7);	add(ch8);
			 add(t1);
		
		//4) setBounds(x,y,width,height)
			ch1.setBounds(100,100,100,30);
			ch2.setBounds(260,100,100,30);
			ch3.setBounds(390,100,100,30);
			
			ch4.setBounds(150,180,150,30);
			ch5.setBounds(300,180,180,30);

			ch6.setBounds(100,260,100,30);
			ch7.setBounds(260,260,100,30);
			ch8.setBounds(390,260,100,30);

			t1.setBounds(100,360,500,30);
		
		//5) Add Listneres on controls
			ch1.addItemListener(this);
			ch2.addItemListener(this);
			ch3.addItemListener(this);
			ch4.addItemListener(this);
			ch5.addItemListener(this);
			ch6.addItemListener(this);
			ch7.addItemListener(this);
			ch8.addItemListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			//method overriding
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		setVisible(true);
		t1.setText("Win 7 Supported c");
		
		}
			public void itemStateChanged(ItemEvent e)
			{
					if(ch1.getState())
						 t1.setText("Win7");
					else if(ch2.getState())
						t1.setText("Win8");
					else if(ch3.getState())
						t1.setText("Win10");
					
				a=t1.getText();
					
				
					if(ch4.getState())
						 t1.setText("Supported");
					else if(ch5.getState())
						 t1.setText("Not Supported");
						 
				b=t1.getText();
					
				
					if(ch6.getState())
						 t1.setText("c");
					else if(ch7.getState())
						 t1.setText("cpp");
					else if(ch8.getState())
						 t1.setText("java");
					 
				c=t1.getText();
				
				t1.setText(a+"  "+b+"  "+c);

				
				
			}
		

}






class OS
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	