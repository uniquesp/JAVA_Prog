// Simple Calculator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class calsi extends JFrame implements ActionListener
{
	//declration
	JTextField t1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,be,badd,bsub,bmul,bdiv,bclr,bexit;
	int ch;
	Double n=0.0,a,b;
	Font f;
	String s1,s2;
	//constructor
	calsi()
	{
		//frame declration
		super("Basic Calculator");
		setSize(500,500);
		setLocation(200,100);
		setLayout(null);
		f = new Font("Arial",Font.BOLD,20);
		
		//memory allocation
		t1 = new JTextField();
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bp = new JButton(".");
		be = new JButton("=");
		badd = new JButton("+");
		bsub = new JButton("-"); 
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bclr = new JButton("Clear");
		bexit = new JButton("Exit");
		
		//add controls on frame
		add(t1);	add(bclr);	add(bexit);
		add(b0);	add(b1);	add(b2);	add(b3);	add(b4);
		add(b5);	add(b6);	add(b7);	add(b8);	add(b9);
		add(bp);	add(be);
		add(badd);	add(bsub);	add(bmul);	add(bdiv);	
		
		// addActionListener
		t1.addActionListener(this);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bp.addActionListener(this);
		be.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bclr.addActionListener(this);
		bexit.addActionListener(this);

		//add setbounds
		t1.setBounds(50,80,363,30);
		b1.setBounds(50,130,80,30);
		b2.setBounds(140,130,80,30);
		b3.setBounds(240,130,80,30);
		badd.setBounds(330,130,80,30);
		b4.setBounds(50,170,80,30);
		b5.setBounds(140,170,80,30);
		b6.setBounds(240,170,80,30);
		bsub.setBounds(330,170,80,30);
		b7.setBounds(50,210,80,30);
		b8.setBounds(140,210,80,30);
		b9.setBounds(240,210,80,30);
		bmul.setBounds(330,210,80,30);
		b0.setBounds(50,250,80,30);
		bp.setBounds(140,250,80,30);
		be.setBounds(240,250,80,30);
		bdiv.setBounds(330,250,80,30);
		bclr.setBounds(50,300,170,30);
		bexit.setBounds(240,300,170,30);
		
		
		
		// exit option lal button	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		//listner method
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource()==bclr)
				{t1.setText("");}
				if(e.getSource()==bexit)
				{System.exit(0);}
			
				String s1 = e.getActionCommand();
				if(s1.charAt(0) >= '0' && s1.charAt(0) <= '9' || s1.charAt(0) == '.')
				{
					t1.setText(t1.getText() + e.getActionCommand());
				}
				
				String s2 = t1.getText();
				if(e.getActionCommand() == "+")
				{
					a = Double.parseDouble(s2);
					ch = 1;
					t1.setText("");
				}
				if(e.getActionCommand() == "-")
				{
					a = Double.parseDouble(s2);
					ch = 2;
					t1.setText("");
				}
				if(e.getActionCommand() == "*")
				{
					a = Double.parseDouble(s2);
					ch = 3;
					t1.setText("");
				}
				if(e.getActionCommand() == "/")
				{
					a = Double.parseDouble(s2);
					ch = 4;
					t1.setText("");
				}
			
				
				if(e.getActionCommand() == "=")
				{
					b = Double.parseDouble(s2);
					switch(ch)
					{
						case 1 :
						{n = a + b;
						t1.setText(Double.toString(n));break;}
						case 2 :
						{n = a - b;
						t1.setText(Double.toString(n));break;}
						case 3 :
						{n = a * b;
						t1.setText(Double.toString(n));break;}
						case 4 :
						{n = a / b;
						t1.setText(Double.toString(n));break;}
					}
				}
				
			}
			catch(NumberFormatException E)
			{System.out.println("\n\t The entered input is invalid,please enter valid input");}
			catch(ArithmeticException a)
			{System.out.println("\n\t Cannot divide by 0");}
			catch(Exception ex)
			{System.out.println("\n\t Exception Caught\n" +ex.toString());}
		}
	}
	
	
//2nd class
class calsi2
{
	public static void main(String[] args)
	{
		new calsi();
	}
}
