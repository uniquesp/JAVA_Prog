//Login with 7 Messages

import java.awt.event.*;
import javax.swing.*;

class login7 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField pf1;
	JButton b1,b2;
	String s = "admin";
	int ch=3;
		
	login7()
	{
		super("Login With 7 Messages");
		setLayout(null);
		setLocation(500,100);
		setSize(250,180);
		
		l1 = new JLabel("UserName :");
		l2 = new JLabel("PassWord :");
		pf1 = new JPasswordField();
		t1 = new JTextField();
		b1 = new JButton("Login");
		b2 = new JButton("Exit");
		
		add(l1);	add(l2);	add(pf1);	add(t1);	add(b1);	add(b2);
		
		l1.setBounds(20,20,80,20);
		t1.setBounds(110,20,100,20);
		l2.setBounds(20,50,80,20);
		pf1.setBounds(110,50,100,20);
		b1.setBounds(20,90,70,30);
		b2.setBounds(100,90,70,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b2)
		{
			System.exit(0);
		}
		if(e.getSource() == b1)
		{
			String s1 = t1.getText();
			String s2 = pf1.getText();
			
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
			
			
			else if(ch != 0)
			{
			if(s1.equals(s) && s2.equals(s))
			{
				JOptionPane.showMessageDialog(null,"Login SuccessFul..!!!");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Try Again..! "+(ch-1)+" More Chances Remaining.",
				"Invalid PassWord !!!",JOptionPane.WARNING_MESSAGE);
				ch--;
			}
			
			if(ch == 0)
			{
				JOptionPane.showMessageDialog(null,"Accesss Denied","Invalid PassWord !!!",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
			}
			
			t1.setText("");
			pf1.setText("");
		}
	}
}

class msg_login
{
	public static void main(String[] args)
	{
		new login7();
	}
}