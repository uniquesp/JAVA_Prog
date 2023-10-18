// Colour Chooser Demo

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class ColorChooserDemo extends JFrame implements ChangeListener
{
		JColorChooser cc;
		JLabel l1;
		
		ColorChooserDemo()
		{
			super("Color Chooser Demo");
			setSize(500,500);
			setLocation(200,200);
			setLayout(null);
			
			//JSlider(min val,max val,intial val)
			l1 = new JLabel("Be A Coder! Never Give Up", JLabel.CENTER);
			l1.setForeground(Color.yellow);
			l1.setBackground(Color.black);
			l1.setOpaque(true);
			
			l1.setFont(new Font("SansSerif",Font.BOLD,30));
			//l1.setBorder(BorderFactory.createTitleBorder("Display"));
			//l1.setBorder(BorderFactory.createLineBorder("Color.GREEN,5"));
			
			cc = new JColorChooser(l1.getForeground());
			cc.getSelectionModel().addChangeListener(this);
			//cc.setBorder(BorderFactory.createTitleBorder("Choose Text Color"));
			
			add(l1);
			add(cc);
			
			l1.setBounds(15,15,500,80);
			cc.setBounds(15,105,500,350);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	
		public void stateChanged(ChangeEvent e)
		{
			Color clr = cc.getColor();
			l1.setForeground(clr);
		}
		
		public static void main(String[] args)
		{
				new ColorChooserDemo();
		}
}