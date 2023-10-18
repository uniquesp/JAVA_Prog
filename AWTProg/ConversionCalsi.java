//Coversion Calculator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class form2 extends JFrame implements ActionListener
{

	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	
	Font f;
	form2()
	{
			super("Conversion Calculator");
			setSize(500,400);
			setLocation(400,100);
			setLayout(null);
			f = new Font("Arial",Font.BOLD,15);
						
			l1 = new JLabel("Decimal No");
			l2 = new JLabel("Binary No");
			l3 = new JLabel("Octal No");
			l4 = new JLabel("HexaDecimal No");
			t1 = new JTextField();
			t2 = new JTextField();
			t3 = new JTextField();
			t4 = new JTextField();
			b1 = new JButton("Convert");
			b2 = new JButton("Clear");
			b3 = new JButton("Exit");
			
			
			
			add(l1);	add(l2);	add(l3);	add(l4);	
			add(t1);	add(t2);	add(t3);	add(t4);	
			add(b1);	add(b2);	add(b3);
		
			l1.setBounds(50,50,100,30);
			t1.setBounds(170,50,250,30);
			l2.setBounds(50,100,100,30);
			t2.setBounds(170,100,250,30);
			l3.setBounds(50,150,100,30);
			t3.setBounds(170,150,250,30);
			l4.setBounds(50,200,150,30);
			t4.setBounds(170,200,250,30);
			b1.setBounds(50,300,100,30);
			b2.setBounds(180,300,100,30);
			b3.setBounds(310,300,100,30);

			
			
			
			t1.addActionListener(this);
			t2.addActionListener(this);
			t3.addActionListener(this);
			t4.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);	
	}
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource()==b3)
				{System.exit(0);}
			
				if(e.getSource()==b2)
				{
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}
				if(e.getSource()==b1)
				{
					int decimal = Integer.parseInt(t1.getText());
					String a = "";
					for(;decimal>0;){
						int binary = decimal%2;
						a = Integer.toString(binary)+a;
						decimal/=2;
					}
					t2.setText(a);
			
					decimal = Integer.parseInt(t1.getText());
							String b = "";
							for(;decimal>0;){
								int octal = decimal%8;
								b = Integer.toString(octal)+b;
								decimal/=8;
							}
							t3.setText(b);
							
					decimal = Integer.parseInt(t1.getText());
							char p[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
							String c = "";
							for(;decimal>0;){
								int hex = decimal%16;
								c = p[hex]+c;
								decimal/=16;
							}
							t4.setText(c);
					
					
					
				}
			}
			catch(Exception ex)
			{
				System.out.println("\n\t Exception Caught\n" +ex.toString());
			}
			
		}
		
}


class ConversionCalsi
{
	public static void main(String args[])
		{
			new form2();
		}
	
}
