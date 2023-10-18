// Ragistration Form
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class form1 extends JFrame implements ActionListener
{

	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t5,t6;
	JPasswordField t3,t4;
	JButton b1,b2;
	int x=0;
	Font f;
	form1()
	{
			super("Ragistration Form");
			setSize(500,500);
			setLocation(400,100);
			setLayout(null);
			f = new Font("Arial",Font.BOLD,15);
						
			l1 = new JLabel("Name");
			l2 = new JLabel("Login Name");
			l3 = new JLabel("Password");
			l4 = new JLabel("Confirm Password");
			b2 = new JButton("Capatcha");
			b1 = new JButton("Submit");
			t1 = new JTextField();
			t2 = new JTextField();
			t3 = new JPasswordField();
			t4 = new JPasswordField();
			t5 = new JTextField();
			t6 = new JTextField();
			
			add(l1);	add(l2);	add(l3);	add(l4);	add(b2);
			add(t1);	add(t2);	add(t3);	add(t4);	add(t5);	add(t6);
			add(b1);
		
			l1.setBounds(50,50,100,30);
			t1.setBounds(170,50,250,30);
			l2.setBounds(50,100,100,30);
			t2.setBounds(170,100,250,30);
			l3.setBounds(50,150,100,30);
			t3.setBounds(170,150,250,30);
			l4.setBounds(50,200,150,30);
			t4.setBounds(170,200,250,30);
			b2.setBounds(50,250,90,30);
			t5.setBounds(150,250,80,30);
			t6.setBounds(250,250,170,30);
			b1.setBounds(170,330,150,30);

			t1.addActionListener(this);
			t2.addActionListener(this);
			t3.addActionListener(this);
			t4.addActionListener(this);
			t5.addActionListener(this);
			t6.addActionListener(this);
			t2.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);	
	}
		public void actionPerformed(ActionEvent e)
		{
			
			try
			{
				
				if(e.getSource()==b2)
				{
						Random rn = new Random();
						int a = rn.nextInt (10) + 0;
						int b = rn.nextInt (10) + 0;
						String c = "+";
						t5.setText(Integer.toString(a)+c+Integer.toString(b));
						x = a + b;
						//t1.setText(Integer.toString(c));
				}
				if(e.getSource()==b1)
				{
					t1.getText();
					t2.getText();
					
					String password = t3.getText();
					if (!(password.length() >= 8))
					{JOptionPane.showMessageDialog(null,"Password length should be"
									+" between 8  characters");
					}
					
					if (password.contains(" "))
					{ 
						JOptionPane.showMessageDialog(null,"No Space is allowed");
					} 
					if (true) 
					{ 
						int count = 0; 
						for (int i = 0; i <= 9; i++) { 
							String str1 = Integer.toString(i); 
							if (password.contains(str1))
							{ count = 1; } 
						} 
						if (count == 0) 
						{ 
							JOptionPane.showMessageDialog(null,"Password should contaon 0-9 digits");
						} 
					} 
					if (!(password.contains("@") || password.contains("#") 
					|| password.contains("!") || password.contains("~") 
					|| password.contains("$") || password.contains("%") 
					|| password.contains("^") || password.contains("&") 
					|| password.contains("*") || password.contains("(") 
					|| password.contains(")") || password.contains("-") 
					|| password.contains("+") || password.contains("/") 
					|| password.contains(":") || password.contains(".") 
					|| password.contains(", ") || password.contains("<") 
					|| password.contains(">") || password.contains("?") 
					|| password.contains("|")))
					{ 
						JOptionPane.showMessageDialog(null,"Password should contain at"
															+ "least one special character");
					} 

					if (true)
					{ 
						int count = 0; 
						for (int i = 65; i <= 90; i++) { 
								char c = (char)i; 
								String str1 = Character.toString(c); 
							if (password.contains(str1))
								{count = 1; } 
						} 
						if (count == 0)
						{JOptionPane.showMessageDialog(null,"Password should contain at"
														+ " least one uppercase letter(A-Z)");}
					}

					if (true)
					{ 
						int count = 0; 
						for (int i = 90; i <= 122; i++) { 
								char c = (char)i; 
								String str1 = Character.toString(c); 
								if (password.contains(str1))
									{ count = 1;} 
						} 
						if (count == 0)
						{JOptionPane.showMessageDialog(null,"Password should contain at"
													+ " least one LowerCase letter(a-z)");}
					}
					if(!(t3.getText().equals(t4.getText())))
					{JOptionPane.showMessageDialog(null,"Password should be match with confirm password");}
					else
					{JOptionPane.showMessageDialog(null,"Click on Captcha");}	
				
					if(Integer.toString(x).equals(t6.getText()))
					{JOptionPane.showMessageDialog(null,"Ragistration Successful!!! Thank You!!");}
					else
					{JOptionPane.showMessageDialog(null,"Capatcha should be match");}	
					
				}
			}
		
			catch(Exception ex)
			{
				System.out.println("\n\t Exception Caught\n" +ex.toString());
			}
		}
		
		
}


class RagistrationForm1
{
	public static void main(String args[])
		{
			new form1();
		}
	
}

