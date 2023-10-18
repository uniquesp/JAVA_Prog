import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent.*;

class fonts extends Frame implements ItemListener
{
		Label l1,l2,l3;
		Choice ch1,ch2;
		Checkbox cb1,cb2;
		TextField t1;
		Font f;
fonts()
{
				setTitle("Fonts AWT");
				setLayout(null);
				setSize(450,450);
				setLocation(500,200);
				setFont(new Font("Cursive",Font.PLAIN,15));
				l1 = new Label("Font");
				ch1 = new Choice();
				l2 = new Label("Size");
				ch2 = new Choice();
				l3 = new Label("Style");
				cb1 = new Checkbox("Bold");
				cb2 = new Checkbox("Italic");
				t1 = new TextField("Jay Jinendra..!");
				add(l1); add(ch1);
				ch1.add("Arial"); ch1.add("Serif"); ch1.add("SansSerif"); ch1.add("Monospaced");
				add(l2); add(ch2);
				ch2.add("12"); ch2.add("14"); ch2.add("16"); ch2.add("20");
				add(l3); add(cb1); add(cb2);
				add(t1);
				ch1.addItemListener(this);
				ch2.addItemListener(this);
				cb1.addItemListener(this);
				cb2.addItemListener(this);
				l1.setBounds(100,100,40,30);
				ch1.setBounds(100,135,120,20);
				l2.setBounds(100,180,40,30);
				ch2.setBounds(100,210,80,20);
				l3.setBounds(250,100,60,30);
				cb1.setBounds(250,140,80,20);
				cb2.setBounds(250,170,80,20);
				t1.setBounds(100,270,220,30);
				addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
				System.exit(0);
				}
				});
				setVisible(true);
		}
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getSource() == ch1)
			{
				if(ch1.getSelectedIndex()==0)
				{f = new Font("Arial",Font.PLAIN,15);
				t1.setFont(f);}
				if(ch1.getSelectedIndex()==1)
				{f = new Font("Serif",Font.PLAIN,15);
				t1.setFont(f);}
				if(ch1.getSelectedIndex()==2)
				{f = new Font("SansSerif",Font.PLAIN,15);
				t1.setFont(f);}
				if(ch1.getSelectedIndex()==3)
				{f = new Font("Monospaced",Font.PLAIN,15);
				t1.setFont(f);}
			}
			
			if(e.getSource() == ch2)
			{
				if(ch2.getSelectedIndex()==0)
				{f = new Font(t1.getFont().getName(),Font.PLAIN,12);
				t1.setFont(f);}
				if(ch2.getSelectedIndex()==1)
				{f = new Font(t1.getFont().getName(),Font.PLAIN,14);
				t1.setFont(f);}
				if(ch2.getSelectedIndex()==2)
				{f = new Font(t1.getFont().getName(),Font.PLAIN,16);
				t1.setFont(f);}
				if(ch2.getSelectedIndex()==3)
				{f = new Font(t1.getFont().getName(),Font.PLAIN,20);
				t1.setFont(f);}
			}
			if(e.getSource() == cb1)
			{
				if(cb1.getState())
				{f = new Font(t1.getFont().getName(),Font.BOLD,t1.getFont().getSize());
				t1.setFont(f);}
				else
				{f = new Font(t1.getFont().getName(),Font.PLAIN,t1.getFont().getSize());
				t1.setFont(f);}
			}
			if(e.getSource() == cb2)
			{
				if(cb2.getState())
				{f = new Font(t1.getFont().getName(),Font.ITALIC,t1.getFont().getSize());
				t1.setFont(f);}
				else
				{f = new Font(t1.getFont().getName(),Font.PLAIN,t1.getFont().getSize());
				t1.setFont(f);}
			}
		}
	}
class Ft
{
public static void main(String[] args)
{
new fonts();
}
}