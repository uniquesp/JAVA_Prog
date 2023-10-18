//Different Move option with List Box


import java.awt.*;
import java.awt.event.*;

class listbox extends Frame implements ItemListener,ActionListener
{
		 //1)Declaration
		List ls1,ls2;
		Button b1,b2,b3,b4;

		listbox()
		{
			setTitle("List Box");
			//super("List Box");
			setSize(500,350);
			setLocation(500,200);
			setFont(new Font("Arial",Font.BOLD,15));

			 //2)memory Allocation
			ls1 = new List(10);
			ls2 = new List(10);
			b1 = new Button(">");
			b2 = new Button("<");
			b3 = new Button(">>");
			b4 = new Button("<<");

			 //3)Add Controls On Frames
			add(ls1); add(ls2);
			add(b1);  add(b2);
			add(b3);  add(b4);
			ls1.add("Virat");
			ls1.add("Rohit");
			ls1.add("Chahal");
			ls1.add("Hardik");
			ls1.add("Suresh");
			ls1.add("Ishan");
			ls1.add("Bumraha");
			ls1.add("Shreyas");
			ls1.add("Harbajn");
			
			 //4) setBounds(x,y,width,height)
			ls1.setBounds(20,40,200,270);
			ls2.setBounds(280,40,200,270);
			b1.setBounds(230,80,40,30);
			b2.setBounds(230,120,40,30);
			b3.setBounds(230,160,40,30);
			b4.setBounds(230,190,40,30);
			
			//5) Add Listneres on controls
			ls1.addItemListener(this);
			ls2.addItemListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);



		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			});
		setLayout(null);
		setVisible(true);

		}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == ls1)
		{
			
		}
	
		if(e.getSource() == ls2)
		{
		}
	}
    public void actionPerformed(ActionEvent ef)
    {
			try
			{
				if(ef.getSource()==b1)
				{
					ls2.add(ls1.getSelectedItem());
					int a = ls1.getSelectedIndex();
					ls1.remove(a);
				}
				if(ef.getSource()==b2)
				{
					ls1.add(ls2.getSelectedItem());
					int b=ls2.getSelectedIndex();
					ls2.remove(b);
				}
				if(ef.getSource()==b3)
				{
					String arr[] = ls1.getSelectedItems();
					String temp = "";
					
					for(int i=0;i<arr.length;i++)
						temp = temp+arr[i];
					
					ls2.add(temp);
					
					
					for(int i=arr.length ; i>=0;i--)
					{
						ls1.remove(i);
					}
				}
				if(ef.getSource()==b4)
				{
					String arr[] = ls2.getSelectedItems();
					String a = "";
					for(int i=0;i<arr.length;i++)
						a = a + arr[i]+ ",";
					
					
				ls1.add(a);
				for(int i=arr.length ; i>=0;i--)
					{
						ls2.remove(i);
					}
					
				}
			}


            catch(Exception ex)
            {
                    System.out.println("\n\t Exception Caught\n" +ex.toString());
            }
	}
}

	class move1
	{
		public static void main(String args[])
		{
			new listbox();
		}
	}

