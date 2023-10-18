//calculator - only addition
import java.awt.*;
import java.awt.event.*;

class myfrm1 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	
	myfrm1()
	{
		setTitle("Simple Addition");
		setSize(270,300);
		setLocation(400,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(new FlowLayout()); //given sequence ne label ani button add karnyasathi use krtat
		
		//memory Allocation
		l1 = new Label("Enter 1st Number");
		l2 = new Label ("Enter 2nd Number");
		l3 = new Label ("Addition of Two Numbers");
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		
		b1 = new Button("ADD");
		b2 = new Button("CLR");
		//b3 = new Button("EXIT");
		
		//Add Controls On Frames
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		
		//4) Add Listneres on controls
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
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a+b;
			t3.setText(""+c);
			//t3.setText(Integer.toString(c));

		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");


		}
		
	}

}


class frm4
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	