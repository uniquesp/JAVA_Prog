//Different Move option with List Box

import java.awt.*;
import java.awt.event.*;

class listbox extends Frame implements ItemListener,ActionListener
{
		 //1)Declaration
		List ls1,ls2;
		Button b1,b2;

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
			b1 = new Button(">>");
			b2 = new Button("<<");

			 //3)Add Controls On Frames
			add(ls1); add(ls2);
			add(b1);  add(b2);
			ls1.add("Virat");
			ls1.add("Mahi");
			ls1.add("Raina");
			ls1.add("Chahal");
			ls1.add("Bumraha");
			
			 //4) setBounds(x,y,width,height)
			ls1.setBounds(20,40,200,250);
			ls2.setBounds(280,40,200,250);
			b1.setBounds(230,100,40,50);
			b2.setBounds(230,150,40,50);
			
			//5) Add Listneres on controls
			ls1.addItemListener(this);
			ls2.addItemListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);



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
					int a=ls1.getSelectedIndex();
					ls1.remove(a);
				}
				if(ef.getSource()==b2)
				{
					ls1.add(ls2.getSelectedItem());
					int b=ls2.getSelectedIndex();
					ls2.remove(b);
				}
			}


            catch(Exception ex)
            {
                    System.out.println("\n\t Exception Caught\n" +ex.toString());
            }
	}
}

	class movesb
	{
		public static void main(String args[])
		{
			new listbox();
		}
	}
