import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	Checkbox ch1,ch2;
	TextField t1;
	
	myfrm1()
	{
		setTitle("CheckBox demo");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);
		
		//2)memory Allocation
			ch1 = new Checkbox("pen",false); //bydefault false
			ch2 = new Checkbox("pencil",false);
			t1 = new TextField();



		//3)Add Controls On Frames
			 add(ch1);	add(ch2);	add(t1);
		
		//4) setBounds(x,y,width,height)
			ch1.setBounds(100,100,100,30);
			ch2.setBounds(210,100,100,30);
			t1.setBounds(100,140,210,30);
		
		//5) Add Listneres on controls
			ch1.addItemListener(this);
			ch2.addItemListener(this);
		
		
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
				
			}
		

}






class CB1
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	