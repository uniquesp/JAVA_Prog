//List 1

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	List lst;
	TextField t1;

	myfrm1()
	{
		setTitle("RadioButton demo");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);

		//2)memory Allocation

			lst= new List();
			t1 = new TextField();



		//3)Add Controls On Frames
			 add(lst);	add(t1);
			 
			 lst.add("Virat");
			 lst.add("MAHI");
			 lst.add("Rohit");
			 lst.add("Yuzi");
			 lst.add("Hardik");
			 lst.add("Suresh");
			 lst.add("Shreyas");
			 

		//4) setBounds(x,y,width,height)
			lst.setBounds(100,100,100,200);
			t1.setBounds(100,320,300,30);

		//5) Add Listneres on controls
			lst.addItemListener(this);

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
				if(e.getSource()==lst)
				{
					t1.setText(lst.getSelectedItem() + "at index" + lst.getSelectedIndex());
				}


			}


}






class list
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
