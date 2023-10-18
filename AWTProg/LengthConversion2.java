//Length Conversion
import java.lang.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



class form3 extends JFrame implements ActionListener,ItemListener
{

	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	JComboBox ch1,ch2 ;
	Font f;
	
	form3()
	{
			super("Length Conversion");
			setSize(500,400);
			setLocation(400,100);
			setLayout(null);
			f = new Font("Arial",Font.BOLD,15);
						
			l1 = new JLabel("Input");
			l2 = new JLabel("Output");
			l3 = new JLabel("Unit");
			l4 = new JLabel("Unit");
			t1 = new JTextField();
			t2 = new JTextField();
			ch1= new JComboBox();
			ch2= new JComboBox();
			
			b1 = new JButton("Convert");
			
			add(l1);	add(l2);	add(l3);	add(l4);	
			add(t1);	add(t2);	
			add(b1);	add(ch1);	add(ch2);
			
			
			ch1.addItem("Feet");	ch1.addItem("Inches");	ch1.addItem("Centimeter");
			ch1.addItem("Meter");	ch1.addItem("Kilometer");
			
			ch2.addItem("Feet");	ch2.addItem("Inches");	ch2.addItem("Centimeter");
			ch2.addItem("Meter");	ch2.addItem("Kilometer");
			
			
			l1.setBounds(50,100,100,30);
			t1.setBounds(100,100,120,30);
			l2.setBounds(250,100,100,30);
			t2.setBounds(300,100,120,30);
			l3.setBounds(50,170,100,30);
			ch1.setBounds(100,170,100,30);
			l4.setBounds(250,170,100,30);
			ch2.setBounds(300,170,100,30);
			b1.setBounds(80,260,250,30);
			
			t1.addActionListener(this);
			t2.addActionListener(this);
			b1.addActionListener(this);
			ch1.addItemListener(this);
			ch2.addItemListener(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);	
	}
		
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource()==b1)
				{
					Double x,y=1.0,z;
					x = Double.valueOf(t1.getText());
						
					if(ch1.getSelectedIndex()==0 && ch2.getSelectedIndex()==0)
					{t2.setText( t1.getText());}
					else if(ch1.getSelectedIndex()==1 && ch2.getSelectedIndex()==1)
					{t2.setText( t1.getText());}
					else if(ch1.getSelectedIndex()==2 && ch2.getSelectedIndex()==2)
					{t2.setText( t1.getText());}
					else if(ch1.getSelectedIndex()==3 && ch2.getSelectedIndex()==3)
					{t2.setText( t1.getText());}
					else if(ch1.getSelectedIndex()==4 && ch2.getSelectedIndex()==4)
					{t2.setText( t1.getText());}
					
					
					else if(ch1.getSelectedIndex()==0 && ch2.getSelectedIndex()==1)
					{y = 12.00;
					z = x*y;}
					else if(ch1.getSelectedIndex()==0 && ch2.getSelectedIndex()==2)
					{y = 30.48;
					z = x*y;}
					else if(ch1.getSelectedIndex()==0 && ch2.getSelectedIndex()==3)
					{y = 0.3048;
					z = x*y;}
					else if(ch1.getSelectedIndex()==0 && ch2.getSelectedIndex()==4)
					{y = 0.0003048;
					z = x*y;}
					else if(ch1.getSelectedIndex()==1 && ch2.getSelectedIndex()==0)
					{y = 0.0833;
					z = x*y;}
					else if(ch1.getSelectedIndex()==1 && ch2.getSelectedIndex()==2)
					{y = 2.54;
					z = x*y;}
					else if(ch1.getSelectedIndex()==1 && ch2.getSelectedIndex()==3)
					{y = 0.0254;
					z = x*y;}
					else if(ch1.getSelectedIndex()==1 && ch2.getSelectedIndex()==4)
					{y = 0.0000254;
					z = x*y;}
					else if(ch1.getSelectedIndex()==2 && ch2.getSelectedIndex()==0)
					{y = 0.0328;
					z = x*y;}
					else if(ch1.getSelectedIndex()==2 && ch2.getSelectedIndex()==1)
					{y = 0.3937;
					z = x*y;}
					else if(ch1.getSelectedIndex()==2 && ch2.getSelectedIndex()==3)
					{y = 0.01;
					z = x*y;}
					else if(ch1.getSelectedIndex()==2 && ch2.getSelectedIndex()==4)
					{y = 0.00001;
					z = x*y;}
					else if(ch1.getSelectedIndex()==3 && ch2.getSelectedIndex()==0)
					{y = 3.2804;
					z = x*y;}
					else if(ch1.getSelectedIndex()==3 && ch2.getSelectedIndex()==1)
					{y = 39.37;
					z = x*y;}
					else if(ch1.getSelectedIndex()==3 && ch2.getSelectedIndex()==2)
					{y = 100.00;
					z = x*y;}
					else if(ch1.getSelectedIndex()==3 && ch2.getSelectedIndex()==4)
					{y = 0.001;
					z = x*y;}
					else if(ch1.getSelectedIndex()==4 && ch2.getSelectedIndex()==0)
					{y = 3280.84;
					z = x*y;}
					else if(ch1.getSelectedIndex()==4 && ch2.getSelectedIndex()==1)
					{y = 39370.1;
					z = x*y;}
					else if(ch1.getSelectedIndex()==4 && ch2.getSelectedIndex()==2)
					{y = 100000.0;
					z = x*y;}		
					else if(ch1.getSelectedIndex()==4 && ch2.getSelectedIndex()==3)
					{y = 1000.0;
					z = x*y;}
					
				t2.setText(Double.toString(z));
				t2.setText(String.format("%3",z));
				}
				
					
			}
			catch(Exception ex)
			{
				System.out.println("\n\t Exception Caught\n" +ex.toString());
			}
		}
		public void itemStateChanged(ItemEvent et)
		{}
		
}


class LengthConversion2
{
	public static void main(String[] args)
		{
			new form3();
		}
	
}
