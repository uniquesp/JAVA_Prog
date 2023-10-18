import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	Checkbox ch1,ch2,ch3,ch4;
	CheckboxGroup grp1,grp2; 
	TextField t1;
	
	myfrm1()
	{
		setTitle("RadioButton demo");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);
		
		//2)memory Allocation
			grp1 = new CheckboxGroup();
			grp2 = new CheckboxGroup();
			ch1 = new Checkbox("pen",false,grp1); //bydefault false
			ch2 = new Checkbox("pencil",false,grp1); 
			ch3 = new Checkbox("BOOK",false,grp2); 
			ch4 = new Checkbox("Notebook",false,grp2);
			t1 = new TextField();



		//3)Add Controls On Frames
			 add(ch1);	add(ch2);	add(ch3);	add(ch4);
			 add(t1);
		
		//4) setBounds(x,y,width,height)
			ch1.setBounds(100,100,100,30);
			ch2.setBounds(210,100,100,30);
			ch3.setBounds(320,100,100,30);
			ch4.setBounds(430,100,100,30);
			t1.setBounds(100,140,210,30);
		
		//5) Add Listneres on controls
			ch1.addItemListener(this);
			ch2.addItemListener(this);
			ch3.addItemListener(this);
			ch4.addItemListener(this);
		
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
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getSource()==ch1)
				{
					if(ch1.getState())
						t1.setText("Pen Checked");
					else
						t1.setText("Pen UNChecked");
				}
				else if(e.getSource()==ch2)
				{
					if(ch2.getState())
						t1.setText("Pencil Checked");
					else
						t1.setText("Pencil UNChecked");
				}
				else if(e.getSource()==ch3)
				{
					if(ch3.getState())
						t1.setText("Book Checked");
					else
						t1.setText("Book UNChecked");
				}
				else if(e.getSource()==ch4)
				{
					if(ch4.getState())
						t1.setText("Notebook Checked");
					else
						t1.setText("Notebook UNChecked");
				}
				
			}
		

}






class RB1
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	