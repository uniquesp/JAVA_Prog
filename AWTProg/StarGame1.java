//Game Genrator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class star extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16; 
	JButton b1,b2,b3,b4;
	Panel pn2;
	int i;
	Font f;
	star()
	{
			super("StarGame");
			setSize(500,500);
			setLocation(400,100);
			setLayout(null);
			f = new Font("Ariat",Font.BOLD,80);
			
			pn2 = new Panel();
			b1 = new JButton("Up");
			b2 = new JButton("Down");
			b3 = new JButton("Left");
			b4 = new JButton("Right");
			
			t1 = new JTextField("*");
			t1.setFont(f);
			t2 = new JTextField("");
			t2.setFont(f);
			t3 = new JTextField("");
			t3.setFont(f);
			t4 = new JTextField("");
			t4.setFont(f);
			t5 = new JTextField("");
			t5.setFont(f);
			t6 = new JTextField("");
			t6.setFont(f);
			t7 = new JTextField("");
			t7.setFont(f);
			t8 = new JTextField("");
			t8.setFont(f);
			t9 = new JTextField("");
			t9.setFont(f);
			t10 = new JTextField("");
			t10.setFont(f);
			t11 = new JTextField("");
			t11.setFont(f);
			t12 = new JTextField("");
			t12.setFont(f);
			t13 = new JTextField("");
			t13.setFont(f);
			t14 = new JTextField("");
			t14.setFont(f);
			t15 = new JTextField("");
			t15.setFont(f);	
			t16 = new JTextField("");
			t16.setFont(f);
				
			pn2.setLayout(new GridLayout(4,3,1,1));
			pn2.setBackground(Color.YELLOW);
		
			add(pn2);
			pn2.add(t1); 
			pn2.add(t2); 
			pn2.add(t3); 
			pn2.add(t4);
			pn2.add(t5); 
			pn2.add(t6);
			pn2.add(t7); 
			pn2.add(t8);
			pn2.add(t9); 
			pn2.add(t10);
			pn2.add(t11);
			pn2.add(t12);
			pn2.add(t13); 
			pn2.add(t14); 
			pn2.add(t15);
			pn2.add(t16);
			add(b1);	add(b2);	add(b3);	add(b4);
			
			pn2.setBounds(50,100,250,250);
			b1.setBounds(370,120,80,30);
			b2.setBounds(370,170,80,30);
			b3.setBounds(370,220,80,30);
			b4.setBounds(370,270,80,30);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == b1)
			{
				if(t13.getText() == "*")
				{
					t13.setText("");
					t9.setText("*");
				}
				else if(t9.getText() == "*")
				{
					t9.setText("");
					t5.setText("*");
				}
				else if(t5.getText() == "*")
				{
					t5.setText("");
					t1.setText("*");
				}
				else if(t1.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t14.getText() == "*")
				{
					t14.setText("");
					t10.setText("*");
				}
				else if(t10.getText() == "*")
				{
					t10.setText("");
					t6.setText("*");
				} 
				else if(t6.getText() == "*")
				{
					t6.setText("");
					t2.setText("*");
				}
				else if(t2.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t15.getText() == "*")
				{
					t15.setText("");
					t11.setText("*");
				}
				else if(t11.getText() == "*")
				{
					t11.setText("");
					t7.setText("*");
				}
				else if(t7.getText() == "*")
				{
					t7.setText("");
					t3.setText("*");
				}
				else if(t3.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t16.getText() == "*")
				{
					t16.setText("");
					t12.setText("*");
				}
				else if(t12.getText() == "*")
				{
					t12.setText("");
					t8.setText("*");
				}
				else if(t8.getText() == "*")
				{
					t8.setText("");
					t4.setText("*");
				}
				else if(t4.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		
			if(e.getSource() == b2)
			{
				if(t1.getText() == "*")
				{
					t1.setText("");
					t5.setText("*");
				}
				else if(t5.getText() == "*")
				{
					t5.setText("");
					t9.setText("*");
				}
				else if(t9.getText() == "*")
				{
					t9.setText("");
					t13.setText("*");
				}
				else if(t13.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t2.getText() == "*")
				{
					t2.setText("");
					t6.setText("*");
				}
				else if(t6.getText() == "*")
				{
					t6.setText("");
					t10.setText("*");
				}
				else if(t10.getText() == "*")
				{
					t10.setText("");
					t14.setText("*");
				}
				else if(t14.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t3.getText() == "*")
				{
					t3.setText("");
					t7.setText("*");
				}
				else if(t7.getText() == "*")
				{
					t7.setText("");
					t11.setText("*");
				}
				else if(t11.getText() == "*")
				{
					t11.setText("");
					t15.setText("*");
				}
				else if(t15.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t4.getText() == "*")
				{
					t4.setText("");
					t8.setText("*");
				}
				else if(t8.getText() == "*")
				{
					t8.setText("");
					t12.setText("*");
				}
				else if(t12.getText() == "*")
				{
					t12.setText("");
					t16.setText("*");
				}
				else if(t16.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		
		
			if(e.getSource() == b3)
			{
				if(t4.getText() == "*")
				{
					t4.setText("");
					t3.setText("*");
				}
				else if(t3.getText() == "*")
				{
					t3.setText("");
					t2.setText("*");
				}
				else if(t2.getText() == "*")
				{
					t2.setText("");
					t1.setText("*");
				}
				else if(t1.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t8.getText() == "*")
				{
					t8.setText("");
					t7.setText("*");
				}
				else if(t7.getText() == "*")
				{
					t7.setText("");
					t6.setText("*");
				}
				else if(t6.getText() == "*")
				{
					t6.setText("");
					t5.setText("*");
				}
				else if(t5.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t12.getText() == "*")
				{
					t12.setText("");
					t11.setText("*");
				}
				else if(t11.getText() == "*")
				{
					t11.setText("");
					t10.setText("*");
				}
				else if(t10.getText() == "*")
				{
					t10.setText("");
					t9.setText("*");
				}
				else if(t9.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t16.getText() == "*")
				{
					t16.setText("");
					t15.setText("*");
				}
				else if(t15.getText() == "*")
				{
					t15.setText("");
					t14.setText("*");
				}
				else if(t14.getText() == "*")
				{
					t14.setText("");
					t13.setText("*");
				}
				else if(t1.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		
			if(e.getSource() == b4)
			{
				if(t1.getText() == "*")
				{
					t1.setText("");
					t2.setText("*");
				}
				else if(t2.getText() == "*")
				{
					t2.setText("");
					t3.setText("*");
				}
				else if(t3.getText() == "*")
				{
					t3.setText("");
					t4.setText("*");
				}
				else if(t4.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t5.getText() == "*")
				{
					t5.setText("");
					t6.setText("*");
				}
				else if(t6.getText() == "*")
				{
					t6.setText("");
					t7.setText("*");
				}
				else if(t7.getText() == "*")
				{
					t7.setText("");
					t8.setText("*");
				}
				else if(t7.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t9.getText() == "*")
				{
					t9.setText("");
					t10.setText("*");
				}
				else if(t10.getText() == "*")
				{
					t10.setText("");
					t11.setText("*");
				}
				else if(t11.getText() == "*")
				{
					t11.setText("");
					t12.setText("*");
				}
				else if(t12.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(t13.getText() == "*")
				{
					t13.setText("");
					t14.setText("*");
				}
				else if(t14.getText() == "*")
				{
					t14.setText("");
					t15.setText("*");
				}
				else if(t15.getText() == "*")
				{
					t15.setText("");
					t16.setText("*");
				}
				else if(t16.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		}
}

class StarGame1
{
	public static void main(String[] args)
	{
		new star();
	}
}