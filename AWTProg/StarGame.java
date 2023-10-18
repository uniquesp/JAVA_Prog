//Game Genrator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class star extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16; 
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
			
			l1 = new JLabel("*");
			l1.setFont(f);
			l2 = new JLabel("");
			l2.setFont(f);
			l3 = new JLabel("");
			l3.setFont(f);
			l4 = new JLabel("");
			l4.setFont(f);
			l5 = new JLabel("");
			l5.setFont(f);
			l6 = new JLabel("");
			l6.setFont(f);
			l7 = new JLabel("");
			l7.setFont(f);
			l8 = new JLabel("");
			l8.setFont(f);
			l9 = new JLabel("");
			l9.setFont(f);
			l10 = new JLabel("");
			l10.setFont(f);
			l11 = new JLabel("");
			l11.setFont(f);
			l12 = new JLabel("");
			l12.setFont(f);
			l13 = new JLabel("");
			l13.setFont(f);
			l14 = new JLabel("");
			l14.setFont(f);
			l15 = new JLabel("");
			l15.setFont(f);	
			l16 = new JLabel("");
			l16.setFont(f);
				
			pn2.setLayout(new GridLayout(4,3,1,1));
			pn2.setBackground(Color.YELLOW);
		
			add(pn2);
			pn2.add(l1); 
			pn2.add(l2); 
			pn2.add(l3); 
			pn2.add(l4);
			pn2.add(l5); 
			pn2.add(l6);
			pn2.add(l7); 
			pn2.add(l8);
			pn2.add(l9); 
			pn2.add(l10);
			pn2.add(l11);
			pn2.add(l12);
			pn2.add(l13); 
			pn2.add(l14); 
			pn2.add(l15);
			pn2.add(l16);
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
				if(l13.getText() == "*")
				{
					l13.setText("");
					l9.setText("*");
				}
				else if(l9.getText() == "*")
				{
					l9.setText("");
					l5.setText("*");
				}
				else if(l5.getText() == "*")
				{
					l5.setText("");
					l1.setText("*");
				}
				else if(l1.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l14.getText() == "*")
				{
					l14.setText("");
					l10.setText("*");
				}
				else if(l10.getText() == "*")
				{
					l10.setText("");
					l6.setText("*");
				} 
				else if(l6.getText() == "*")
				{
					l6.setText("");
					l2.setText("*");
				}
				else if(l2.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l15.getText() == "*")
				{
					l15.setText("");
					l11.setText("*");
				}
				else if(l11.getText() == "*")
				{
					l11.setText("");
					l7.setText("*");
				}
				else if(l7.getText() == "*")
				{
					l7.setText("");
					l3.setText("*");
				}
				else if(l3.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l16.getText() == "*")
				{
					l16.setText("");
					l12.setText("*");
				}
				else if(l12.getText() == "*")
				{
					l12.setText("");
					l8.setText("*");
				}
				else if(l8.getText() == "*")
				{
					l8.setText("");
					l4.setText("*");
				}
				else if(l4.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		
			if(e.getSource() == b2)
			{
				if(l1.getText() == "*")
				{
					l1.setText("");
					l5.setText("*");
				}
				else if(l5.getText() == "*")
				{
					l5.setText("");
					l9.setText("*");
				}
				else if(l9.getText() == "*")
				{
					l9.setText("");
					l13.setText("*");
				}
				else if(l13.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l2.getText() == "*")
				{
					l2.setText("");
					l6.setText("*");
				}
				else if(l6.getText() == "*")
				{
					l6.setText("");
					l10.setText("*");
				}
				else if(l10.getText() == "*")
				{
					l10.setText("");
					l14.setText("*");
				}
				else if(l14.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l3.getText() == "*")
				{
					l3.setText("");
					l7.setText("*");
				}
				else if(l7.getText() == "*")
				{
					l7.setText("");
					l11.setText("*");
				}
				else if(l11.getText() == "*")
				{
					l11.setText("");
					l15.setText("*");
				}
				else if(l15.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l4.getText() == "*")
				{
					l4.setText("");
					l8.setText("*");
				}
				else if(l8.getText() == "*")
				{
					l8.setText("");
					l12.setText("*");
				}
				else if(l12.getText() == "*")
				{
					l12.setText("");
					l16.setText("*");
				}
				else if(l16.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		
		
			if(e.getSource() == b3)
			{
				if(l4.getText() == "*")
				{
					l4.setText("");
					l3.setText("*");
				}
				else if(l3.getText() == "*")
				{
					l3.setText("");
					l2.setText("*");
				}
				else if(l2.getText() == "*")
				{
					l2.setText("");
					l1.setText("*");
				}
				else if(l1.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l8.getText() == "*")
				{
					l8.setText("");
					l7.setText("*");
				}
				else if(l7.getText() == "*")
				{
					l7.setText("");
					l6.setText("*");
				}
				else if(l6.getText() == "*")
				{
					l6.setText("");
					l5.setText("*");
				}
				else if(l5.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l12.getText() == "*")
				{
					l12.setText("");
					l11.setText("*");
				}
				else if(l11.getText() == "*")
				{
					l11.setText("");
					l10.setText("*");
				}
				else if(l10.getText() == "*")
				{
					l10.setText("");
					l9.setText("*");
				}
				else if(l9.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l16.getText() == "*")
				{
					l16.setText("");
					l15.setText("*");
				}
				else if(l15.getText() == "*")
				{
					l15.setText("");
					l14.setText("*");
				}
				else if(l14.getText() == "*")
				{
					l14.setText("");
					l13.setText("*");
				}
				else if(l1.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		
			if(e.getSource() == b4)
			{
				if(l1.getText() == "*")
				{
					l1.setText("");
					l2.setText("*");
				}
				else if(l2.getText() == "*")
				{
					l2.setText("");
					l3.setText("*");
				}
				else if(l3.getText() == "*")
				{
					l3.setText("");
					l4.setText("*");
				}
				else if(l4.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l5.getText() == "*")
				{
					l5.setText("");
					l6.setText("*");
				}
				else if(l6.getText() == "*")
				{
					l6.setText("");
					l7.setText("*");
				}
				else if(l7.getText() == "*")
				{
					l7.setText("");
					l8.setText("*");
				}
				else if(l7.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l9.getText() == "*")
				{
					l9.setText("");
					l10.setText("*");
				}
				else if(l10.getText() == "*")
				{
					l10.setText("");
					l11.setText("*");
				}
				else if(l11.getText() == "*")
				{
					l11.setText("");
					l12.setText("*");
				}
				else if(l12.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
				
				else if(l13.getText() == "*")
				{
					l13.setText("");
					l14.setText("*");
				}
				else if(l14.getText() == "*")
				{
					l14.setText("");
					l15.setText("*");
				}
				else if(l15.getText() == "*")
				{
					l15.setText("");
					l16.setText("*");
				}
				else if(l16.getText() == "*")
				{
					JOptionPane.showMessageDialog(null,"Out Of Panel");
				}
			}
		}
}

class StarGame
{
	public static void main(String[] args)
	{
		new star();
	}
}