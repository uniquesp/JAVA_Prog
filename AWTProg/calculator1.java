// Simple calculator  

import java.awt.*;
import java.awt.event.*;

class cal extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	cal()
	{
		setTitle("Simple Calculator");
		setLayout(new FlowLayout());
		setFont(new Font("Aerial",Font.BOLD,20));
		setLocation(400,100);
		setSize(280,240);
			
		l1 = new Label("1st Number ");
		l2 = new Label("2nd Number ");
		l3 = new Label("Result  ");
		 
		t1 = new TextField(5);
		t2 = new TextField(5);
		t3 = new TextField(5);
		
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		b4 = new Button("DIV");
		b5 = new Button("CLR");
		b6 = new Button("EXT");
		
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
		add(b3);add(b4);
		add(l3);add(t3);
		add(b5);add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
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
			if(e.getSource() == b5)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
		     	t1.requestFocus();  // defualt cursor blinking
			}
			
			else if(e.getSource() == b6)
			{
				System.exit(0);
			}
			else
			{
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = 0;
				
				if(e.getSource() == b1)
					 c = a + b;
				
				if(e.getSource() == b2)
					 c = a - b;			
				
				if(e.getSource() == b3)
					 c = a * b;
				
				if(e.getSource() == b4)
					 c = a / b;
				
				t3.setText(Integer.toString(c));
       		}
		}
		catch(NumberFormatException E)
		{
			System.out.println("\n\t The entered input is invalid,please enter valid input");
		}
		catch(ArithmeticException a)
		{
			System.out.println("\n\t Cannot divide by 0");
		}
		catch(Exception ex)
		{
			System.out.println("\n\t Uncaught Exception found");
		}		
	}
}
class calculator1
{
	public static void main(String args[])
	{
		new cal();
	}
}