//Login with msgs
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class form extends JFrame implements ActionListener
{

	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	JMenuItem md1,md2,md3,md4,md5,md6,md7;
	String s = "sakshi";
	int cnt = 1;
	Font f;
	form()
	{
			super("Login With");
			setSize(500,300);
			setLocation(100,100);
			setLayout(null);
			f = new Font("Arial",Font.BOLD,15);
			
			l1 = new JLabel("Login Name");
			l2 = new JLabel("Password");
			b1 = new JButton("Login");
			b2 = new JButton("Exit");
			t1 = new JTextField();
			t2 = new JPasswordField();
			
			add(l1);	add(l2);	add(t1);	add(t2);
			add(b1);	add(b2);
		
			l1.setBounds(50,50,100,30);
			l2.setBounds(50,110,100,30);
			t1.setBounds(170,50,200,30);
			t2.setBounds(170,110,200,30);
			b1.setBounds(50,190,100,30);
			b2.setBounds(170,190,100,30);
			
			t1.addActionListener(this);
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
				{System.exit(0);}	
				
				if(e.getSource()== b1)
				{
					String s1 = t1.getText();
					String s2 = t2.getText();
					
					
					if(s1.equals("") && s2.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter UserName & PassWord.");
						}
									
					else if(s1.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter UserName");
						}
					else if(s2.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter PassWord.");
						}
					else if(s1.equals(s) && s2.equals(s))
						{
							JOptionPane.showMessageDialog(null,"Login Successful");
							t1.setText("");
							t2.setText("");
						}
						
					else if(cnt==1)
						{
							JOptionPane.showMessageDialog(null,"Two more chances remaining!","Please Try Again!",
							JOptionPane.WARNING_MESSAGE);
							cnt++;
							t1.setText("");
							t2.setText("");
						}
					else if(cnt==2)
						{
							JOptionPane.showMessageDialog(null,"One more chances remaining!","Invalid PassWord !!!!",
							JOptionPane.WARNING_MESSAGE);
							cnt++;
							t1.setText("");
							t2.setText("");
						}
					else if(cnt==3)
						{
							JOptionPane.showMessageDialog(null,"Accesss Denied","Invalid PassWord !!!",
							JOptionPane.ERROR_MESSAGE);

							System.exit(0);
						}
					
				}
			}
			catch(Exception ex)
			{
				System.out.println("\n\t Exception Caught\n" +ex.toString());
			}
	}
		
}


class LoginForm1
{
	public static void main(String args[])
		{
			new form();
		}
	
}


