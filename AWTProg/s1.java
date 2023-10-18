import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PushCounterPanel extends JPanel
{
   private Random gen;
   private int randomNum;
   private JButton push;
   private JLabel label;

      public PushCounterPanel ()
   {
      Random gen = new Random();
      randomNum = 0;

      push = new JButton ("Random Gen");
      push.addActionListener (new ButtonListener());

      label = new JLabel ("Random: " + randomNum);

      add (push);
      add (label);

      setPreferredSize (new Dimension(300, 40));
      setBackground (Color.gray);
   }

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         randomNum = gen.nextInt(100)+1;
         label.setText("Random: " + randomNum);
      }
   }
}
class s1
{
	public static void main(String args[])
	{
		new PushCounterPanel();
	}
}