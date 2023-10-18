//combobox

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	Choice ch;
	TextField t1;

	myfrm1()
	{
		setTitle("ComboList Demo");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);

		//2)memory Allocation

			ch= new Choice();
			t1 = new TextField();



		//3)Add Controls On Frames
			 add(ch);	add(t1);
			 ch.add("Apple");
			 ch.add("Banana");
			 ch.add("Mango");
			 ch.add("Strawberry");

		//4) setBounds(x,y,width,height)
			ch.setBounds(100,100,210,30);
			t1.setBounds(100,140,210,30);

		//5) Add Listneres on controls
			ch.addItemListener(this);

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
				if(e.getSource()==ch)
				{
					t1.setText(ch.getSelectedItem() + "\t at Index = " + ch.getSelectedIndex());
				}


			}


}






class combolist
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
