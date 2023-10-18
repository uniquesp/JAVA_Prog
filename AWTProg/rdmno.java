//Random Number Genrator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

class rdmno extends JFrame implements ActionListener
{
	
	JMenuBar mbr;
	JMenu m1,m2,m3;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10;
	JSeparator sep;
	JRadioButtonMenuItem rm1,rm2;
	ButtonGroup gr;
	JLabel lb;
	Random r;
	int n[] = new int[50];
	int len = n.length;
	Font f;
	rdmno()
	{
		super("Random Number Operations");
		setSize(500,500);
		setLocation(200,100);
		setLayout(null);
		f = new Font("Arial",Font.BOLD,20);
			sep = new JSeparator();
			gr = new ButtonGroup();
			
			lb = new JLabel("50 Random numbers:");
			lb.setFont(new Font("Arial",Font.BOLD,15));
		
			mbr = new JMenuBar();
			m1 = new JMenu ("File");	
			m2 = new JMenu ("Compute");	
			m3 = new JMenu ("Operations");	
			mi1 = new JMenuItem ("Load");	
			mi2 = new JMenuItem ("Save");	
			mi3 = new JMenuItem ("Exit");	
			mi4 = new JMenuItem ("Sum");
			mi5 = new JMenuItem ("Average");	
			mi6 = new JMenuItem ("Maximum");	
			mi7 = new JMenuItem ("Minimum");	
			mi8 = new JMenuItem ("Medin");	
			mi9 = new JMenuItem ("Search");
			mi10 = new JMenuItem ("Sort");	
			rm1 = new JRadioButtonMenuItem("Ascending");
			rm2 = new JRadioButtonMenuItem("Descending");
			r = new Random();
			
			gr = new ButtonGroup();
			gr.add(rm1);	gr.add(rm2);
			
			m1.add(mi1);	 m1.add(mi2);	m1.addSeparator();
			m1.add(mi3);	mbr.add(m1);
			
			m2.add(mi4);	 m2.add(mi5);	m2.add(mi6);	m2.add(mi7);	m2.add(mi8);
			mbr.add(m2);
			
			m3.add(mi9);	 m3.add(mi10);	m3.add(rm1);	m3.add(rm2);
			mbr.add(m3);
			add(mbr);
			add(lb);
			
			mbr.setBounds(0,0,800,30);
			lb.setBounds(0,30,250,20);
			
			mi1.addActionListener(this);
			mi2.addActionListener(this);
			mi3.addActionListener(this);
			mi4.addActionListener(this);
			mi5.addActionListener(this);
			mi6.addActionListener(this);
			mi7.addActionListener(this); 
			mi8.addActionListener(this);
			mi9.addActionListener(this);
			mi10.addActionListener(this);
			rm1.addActionListener(this);
			rm2.addActionListener(this);
			
				
			for(int i = 0;i < n.length;i++)
			{
				n[i] = r.nextInt(90) + 10;
				
			}
				
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	}
	
	void Asort(int n[])
	{
		int temp;
		for(int i = 0;i < n.length;i++)
			for(int j = i+1;j < n.length;j++)
				if(n[i] > n[j])
				{	
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
	}
	void Dsort(int n[])
	{
		int temp;
		for(int i = 0;i < n.length;i++)
			for(int j = i+1;j < n.length;j++)
				if(n[i] < n[j])
				{	
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
	}
	
	int search(int n[],int num)
	{
		for(int i = 0;i < n.length;i++)
		if(num == n[i])
			return 1;
		return 0;
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		int i = 0,j = 0,sum = 0,max = 0,min = 0;
		double avg = 0;
		JPanel panel = new JPanel();
		add(panel);
		panel.setBounds(0,40,300,110);
		panel.setLayout(new GridLayout(5,10));
						
				
		if(e.getSource() == mi1)
		{
			for(i = 0;i < len;i++)
			{
				JLabel lb = new JLabel();
				lb.setText("" + n[i]);
				panel.add(lb);
				lb.setFont(new Font("Arial",Font.BOLD,15));
			}
		}
		
		
		if(e.getSource() == mi3)
		{
			System.exit(0);
		}
		
		if(e.getSource() == mi4)
		{
			for(i = 0;i < len;i++)
				sum = sum + n[i];
			JOptionPane.showMessageDialog(null,"Sum = " + sum);
		}
		
		if(e.getSource() == mi5)
		{
			for(i = 0;i < len;i++)
			{
				sum = sum + n[i];
				avg = sum/50.0;
			}
			JOptionPane.showMessageDialog(null,"Average = " + avg);
		}
		
		if(e.getSource() == mi6)
		{
			max = n[0];
			for(i = 0;i < len;i++)
			{
				if(max < n[i])
					max = n[i]; 
			}
			JOptionPane.showMessageDialog(null,"Maximum = " + max);
		}
		
		if(e.getSource() == mi7)
		{
			min = n[0];
			for(i = 0;i < len;i++)
			{
				if(min > n[i])
					min = n[i];
			}
			JOptionPane.showMessageDialog(null,"Minimum = " + min);
		}
		
		if(e.getSource() == mi8)
		{
			Asort(n);
			len  = (len+1) / 2 - 1;
			JOptionPane.showMessageDialog(null,"Median = " + n[len]);
		}
		
		if(e.getSource() == mi9)
		{
			String str = JOptionPane.showInputDialog(null,"Enter number to search : ");
			int number = Integer.parseInt(str);
			int r = search(n,number);
			if(r == 1)
				JOptionPane.showMessageDialog(null,"Found");
			else 
				JOptionPane.showMessageDialog(null,"Not Found");
		}
		if(e.getSource() == mi10)
		{
			
			if(e.getSource() == rm1)
			{
				JLabel lb1 = new JLabel("Ascending order : ");
				lb1.setFont(new Font("Arial",Font.BOLD,15));
				add(lb1);
				lb1.setBounds(0,200,200,20);
				JPanel pnl = new JPanel();
				add(pnl);
				pnl.setBounds(0,320,300,110);
				pnl.setLayout(new GridLayout(5,10));
				
				Asort(n);
				for(i = 0;i < len;i++)
				{
					JLabel lb2 = new JLabel();
					lb2.setText("" + n[i]);
					pnl.add(lb2);
					lb2.setFont(new Font("Arial",Font.BOLD,15));
				}
			}
			if(e.getSource() == rm2)
			{
				JLabel lb1 = new JLabel("Descending order : ");
				lb1.setFont(new Font("Arial",Font.BOLD,15));
				add(lb1);
				lb1.setBounds(0,300,200,20);
				JPanel pnl = new JPanel();
				add(pnl);
				pnl.setBounds(0,320,300,110);
				pnl.setLayout(new GridLayout(5,10));
				
				Dsort(n);
				for(i = 0;i < len;i++)
				{
					JLabel lb2 = new JLabel();
					lb2.setText("" + n[i]);
					pnl.add(lb2);
					lb2.setFont(new Font("Arial",Font.BOLD,15));
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		new rdmno();
	}

}

