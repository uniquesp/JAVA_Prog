// ToolBar Swing

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JTbar extends JFrame implements ActionListener
{
		JToolBar bar;
		JButton b1,b2,b3;
		
		JTbar()
		{
			super("Demo of ToolBar");
			setSize(500,500);
			setLocation(150,150);
			
			bar = new JToolBar();
			
			b1 = new JButton("Windows XP");
			b2 = new JButton("Windows Vista");
			b3 = new JButton("Windows 7");
			
			bar.add(b1);
			//bar.addSeprator();
			bar.add(b2);
			//bar.addSeprator();
			bar.add(b3);
			
			add(bar,BorderLayout.NORTH);
			bar.setFloatable(false);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null,e.getActionCommand());
			//to get text which we have selected
		}
		
		public static void main(String args[])
		{
				new JTbar();
		}
}