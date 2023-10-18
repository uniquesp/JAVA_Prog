//minimize the code

import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	
	myfrm1()
	{
		setTitle("Simple Addition");
		setSize(300,300);
		setLocation(400,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(new FlowLayout());
		
		//memory Allocation
		l1 = new Label("Enter 1st Number");
		l2 = new Label ("Enter 2nd Number");
		l3 = new Label ("Answer");
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		b4 = new Button("DIV");
		b5 = new Button("CLR");
		b6 = new Button("EXIT");
		
		//Add Controls On Frames
		add(l1);	add(t1);	add(l2);
		add(t2);	add(l3);	add(t3);
		add(b1);	add(b2);	add(b3);
		add(b4);	add(b5);	add(b6);
		
		
		//4) Add Listneres on controls
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
			if(e.getSource()==b6)
			{
				System.exit(0);
			}
			if(e.getSource()==b5)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
			
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			 if(e.getSource()==b1)
			{
				int c = a+b;
				t3.setText(""+c);
				//t3.setText(Integer.toString(c));
			}
			else if(e.getSource()==b2)
			{
				int c = a-b;
				t3.setText(""+c);
			}
			else if(e.getSource()==b3)
			{
				int c = a*b;
				t3.setText(""+c);
			}
			else if(e.getSource()==b4)
			{
				int c = a/b;
				t3.setText(""+c);
			}
			
			}
			catch(ArithmeticException ex)
			{
				   System.out.println("\n\t Can not divide by zero " );
			}
			catch(NumberFormatException ex)
			{
				System.out.println("\n\t Exception Invalid Number");
			}
			
			catch(Exception ex)
			{
				System.out.println("\n\t Exception Caught\n" +ex.toString());
			}
		
	}

}


class frm5
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	