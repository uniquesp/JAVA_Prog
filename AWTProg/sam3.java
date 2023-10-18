// Simple Calculator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class sam extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,be,badd,bsub,bmul,bdiv,bclr,bexit;
	int ch,temp;
	Font f;
	sam()
	{
		super("Basic Calculator");
		setSize(500,500);
		setLocation(200,100);
		setLayout(null);
		f = new Font("Arial",Font.BOLD,20);
		
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
		
		add(t1);	add(bclr);	add(bexit);
		add(b0);	add(b1);	add(b2);	add(b3);	add(b4);
		add(b5);	add(b6);	add(b7);	add(b8);	add(b9);
		add(bp);	add(be);
		add(badd);	add(bsub);	add(bmul);	add(bdiv);	
		
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
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				
				if(e.getSource() == bclr)
				{
					t1.setText("");
				}
				if(e.getSource() == bexit)
				{
					System.exit(0);
				}
				
				String s1 = e.getActionCommand();
				t1.setText(t1.getText().concat(s1));
				badd.setActionCommand("");
				bsub.setActionCommand("");
				bmul.setActionCommand("");
				bdiv.setActionCommand("");

				if(e.getSource()==badd)
				{
				String s2 = t1.getText();
				temp = Integer.parseInt(s2);
				t1.setText("");	
				ch=1;}
				if(e.getSource()==bsub)
				{String s2 = t1.getText();
				temp = Integer.parseInt(s2);
				t1.setText("");
				ch=2;}
				if(e.getSource()==bmul)
				{String s2 = t1.getText();
				temp = Integer.parseInt(s2);
				t1.setText("");
				ch=3;}
				if(e.getSource()==bdiv)
				{String s2 = t1.getText();
				temp = Integer.parseInt(s2);
				t1.setText("");
				ch=4;}
				
				if(e.getSource()==be)
				{
					switch(ch)
					{
						case 1 :
						{String s3 = t1.getText();
						int a = Integer.parseInt(s3);
						int b = a + temp;
						t1.setText(Integer.toString(b));break;}
						case 2 :
						{String s3 = t1.getText();
						int a = Integer.parseInt(s3);
						int b = temp - a;
						t1.setText(Integer.toString(b));break;}
						case 3 :
						{String s3 = t1.getText();
						int a = Integer.parseInt(s3);
						int b = a * temp;
						t1.setText(Integer.toString(b));break;}
						case 4 :
						{String s3 = t1.getText();
						int a = Integer.parseInt(s3);
						int b = temp / a;
						t1.setText(Integer.toString(b));break;}
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

class sam3
{
	public static void main(String[] args)
	{
		new sam();
	}
}

