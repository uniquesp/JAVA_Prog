//Different Move option with List Box

import java.awt.*;
import java.awt.event.*;

class myfrm3 extends Frame implements ActionListener,ItemListener
{
	//1) Declrartion
	List lst1, lst2;
	Button b1,b2;
	String temp = "";
	
	

	myfrm3()
	{
			setTitle("RadioButton demo");
			setSize(800,500);
			setLocation(200,200);
			setFont(new Font ("Times New Roman", Font.BOLD,20));
			setLayout(null);

			
			//2)memory Allocation
			lst1= new List(6,true);//Multiple selection
			lst2= new List();
			b1 = new Button(">>");
			b2 = new Button("<<");



			//3)Add Controls On Frames
			 add(lst1);	add(lst2);
			 add(b1);	add(b2);

			 
			 lst1.add("Virat");
			 lst1.add("MAHI");
			 lst1.add("Rohit");
			 lst1.add("Yuzi");
			 lst1.add("Hardik");
			 lst1.add("Suresh");
			 lst1.add("Shreyas");
			 

		//4) setBounds(x,y,width,height)
			lst1.setBounds(200,100,100,300);
			b1.setBounds(320,160,100,30);
			b2.setBounds(320,210,100,30);
			lst2.setBounds(450,100,100,300);
			

		//5) Add Listneres on controls
			lst1.addItemListener(this);
			lst2.addItemListener(this);
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
			
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getSource()==lst1)
				{
					String a[] = lst1.getSelectedItems();
						for(int i=0;i<a.length;i++)
						temp = temp+a[i]+"\n";
				//t1.setText(temp);	
				}
				if(e.getSource()==lst2)
				{
					String b[] = lst2.getSelectedItems();
						for(int i=0;i<b.length;i++)
						temp = temp+b[i]+"\n";
					//t1.setText(temp);
				}
			}
			public void actionPerformed(ActionEvent ef)
			{
				
			try
			{
				if(ef.getSource()==b1)
				{
					lst2.add(lst1.getSelectedItems());
					lst1.remove(temp);
					
				}
				if(ef.getSource()==b2)
				{
					lst1.add(lst2.getSelectedItems());
					lst2.remove(temp);
					
				}
			}


            catch(Exception ex)
            {
                    System.out.println("\n\t Exception Caught\n" +ex.toString());
            }

			}
}






class diff
{
	public static void main(String[] args)
	{
		new myfrm3();
	}
}
