// Slider in java

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class SliderDemo extends JFrame implements ChangeListener
{
		JSlider sldr;
		JLabel lb1;
		
		SliderDemo()
		{
			super("Demo of Slider");
			setLayout(new FlowLayout());
			setSize(400,400);
			setLocation(200,300);
			
			//JSlider(min val,max val,intial val)
			sldr = new JSlider(0,300,100);
			add(sldr);
			add(lb1 = new JLabel("100"));
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	
		public void stateChanged(ChangeEvent ce)
		{
			lb1.setText(Integer.toString(sldr.getValue()));
		}
		
		public static void main(String[] args)
		{
				new SliderDemo();
		}
}