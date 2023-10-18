import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class pass extends JFrame implements ActionListener
{
	//1)Declaration 
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2;
	JPasswordField p1;
	
	pass()
	{
		super("LoginForm");
		setSize(500,500);
		setLocation(400,200);
		setLayout(null);
		
		//2)memory Allocation
		
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField();
		b1=new JButton("LOGIN");
		b2=new JButton("EXIT");
		p1=new JPasswordField();
		
		//3)add controls on frame
		
		add(l1);
		add(l2);
		add(t1);
		add(b1);
		add(b2);
		add(p1);
		
		//4)setBounds
		
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		t1.setBounds(220,100,150,30);
		p1.setBounds(220,150,150,30);
		b1.setBounds(100,200,100,30);
		b2.setBounds(250,200,100,30);
		//5)Add controls on Listener
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
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
				
				
				if(e.getSource()==b1)
				{
					
					t1.setText("");
					p1.setText("");
				}
				JOptionPane.showMessageDialog(null,"Registration Successful");
				if(e.getSource()==b2)
				{
					System.exit(0);
				}
			}
}



class Harshu
{
	public static void main(String args[])
	{
		new pass();
	}	
}