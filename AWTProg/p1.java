// pizzaHut shop (choice Box)

import java.awt.*;
import java.awt.event.*;

class myfrm2 extends Frame implements ItemListener
{
	//1) Declrartion
	Choice ch;
	Label l1,l2,l3,l4;
	//Button b1,b2,b3;
	TextField t1,t2,t3;

	myfrm2()
	{
		setTitle("PizzaHut Shop");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);

		//2)memory Allocation
			l1 = new Label("Select Pizza Type");
			l2 = new Label("Price");
			l3 = new Label("Quantity");
			l4 = new Label("Total Cost");
			
		//	ch= new Choice();
			
			t1 = new TextField();
			t2 = new TextField();
			t3 = new TextField();


		//3)Add Controls On Frames
			 add(ch);	
			 add(l1);	 add(l2);	 add(l3);	 add(l4);
			 add(t1);	 add(t2);	 add(t3);
			// add(b1);	 add(b2);	 add(b3);
			 
			 ch.add("PureVeg Pizza");
			 ch.add("AllInOne Mini Pizza");
			 ch.add("Paneer Cheese Pizza");
			 ch.add("Capsicum Cheese Pizza");
			 ch.add("Corn Cheese Pizza");
			 ch.add("Periperi Pizza");
			 ch.add("Chicken Pizza");
			 ch.add("Classic Veg Pizza");
			 ch.add("Italian Pizza");
			 ch.add("Mashroom Pizza");



		//4) setBounds(x,y,width,height)
		
			ch.setBounds(330,100,210,30);

			l1.setBounds(100,100,210,30);
			l2.setBounds(100,150,210,30);
			l3.setBounds(100,200,210,30);
			l4.setBounds(100,250,210,30);

			t1.setBounds(330,100,210,30);
			t2.setBounds(330,100,210,30);
			t3.setBounds(330,100,210,30);
			
		//	b1.setBounds(100,350,210,30);
		//	b2.setBounds(330,350,210,30);
		//	b3.setBounds(330,350,210,30);


		//5) Add Listneres on controls
			ch.addItemListener(this);
		//	b1.addActionListener(this);
		//	b2.addActionListener(this);
		//	b3.addActionListener(this);
 

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
			
	/*	public void actionPerformed(ActionEvent e)
		{
			try
			{
			
				if(e.getSource()==b1)
				{
				
					//t3.setText(Integer.toString(c));
					
				}
				else if(e.getSource()==b2)
				{
					
					t1.setText("");
					t2.setText("");
					t3.setText("");

				}
				else if(e.getSource()==b3)
				{
					System.exit(0);
			}
			
			catch(NumberFormatException ex)
			{
				System.out.println("\n\t Exception Invalid Number");
			}
			 catch(ArithmeticException ex)
			{
				   System.out.println("\n\t Can not divide by zero " );
			}
		
			catch(ArrayIndexOutOfBoundsException ex)
			{
				   System.out.println("\n\t Invalid no of arguments" );
			}
			catch(Exception ex)
			{
				System.out.println("\n\t Exception Caugh\t" +ex.toString());
			}
		}*/
					

}

class p1
{
	public static void main(String args[])
	{
		new myfrm2();
	}
}
	