//minimize the code

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ActionListener
{
	//1) Declrartion
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	
	myfrm1()
	{
		setTitle("Simple Addition");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);
		
		//2)memory Allocation
		l1 = new Label("Enter 1st Number");
		l2 = new Label ("Enter 2nd Number");
		l3 = new Label ("ANSWER");
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		b4 = new Button("DIV");
		b5 = new Button("CLR");
		b6 = new Button("EXIT");
		
		//3)Add Controls On Frames
		add(l1);	add(t1);	add(l2);
		add(t2);	add(l3);	add(t3);
		add(b1);	add(b2);	add(b3);
		add(b4);	add(b5);	add(b6);
		
		//4) setBounds(x,y,width,height)
			l1.setBounds(100,100,180,30);
			t1.setBounds(300,100,100,30);
			
			l2.setBounds(100,150,180,30);
			t2.setBounds(300,150,100,30);
			
			l3.setBounds(100,200,180,30);
			t3.setBounds(300,200,100,30);
			
			b1.setBounds(103,250,65,30);
			b2.setBounds(178,250,65,30);
			b3.setBounds(253,250,65,30);
			b4.setBounds(328,250,65,30);
			
			b5.setBounds(103,300,140,30);
			b6.setBounds(253,300,140,30);
			
		
		//5) Add Listneres on controls
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		
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
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{	
			if(e.getSource()==b5)
			{
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t1.requestFocus();

			}
			else if(e.getSource()==b6)
			{
				System.exit(0);
			}
			
			else
			{
			
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					int c = 0;
				if(e.getSource()==b1)
				{
					 c = a+b;
				}
				if(e.getSource()==b2)
				{
					 c = a-b;
				}
				 if(e.getSource()==b3)
				{
					 c = a*b;
				}
				 if(e.getSource()==b4)
				{
					 c = a/b;
				}
					t3.setText(Integer.toString(c));
				
			}
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
		
		
	}

}


class frm6
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	