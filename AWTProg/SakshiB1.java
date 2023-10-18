import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent.*;
import java.awt.event.ActionEvent.*;

class SakshiB extends Frame implements ActionListener,ItemListener    {
                    //1.Declaration

			MenuBar mbr;
			Menu m1,m2,m3,m4;
			MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10;


			Label l1;
			TextField t1;
			Button b1,b2,b3,btn[];
			Checkbox cb1,cb2,cb3,cb4;
			CheckboxGroup grp;
			TextArea txt;
			Panel pnl;
			List lst;
			Choice ch;
			int i;

	SakshiB()
	{


			//2.Memory Allocation
			
			mi1 = new MenuItem("New");
			mi2 = new MenuItem("Open");
			mi3 = new MenuItem("Closed");
			mi4 = new MenuItem("Cut");
			mi5 = new MenuItem("Copy");
			mi6 = new MenuItem("Paste");
			mi7 = new MenuItem("Red");
			mi8 = new MenuItem("Green");
			mi9 = new MenuItem("Blue");
			mi10 = new MenuItem("Exit");
			l1 = new Label("Enter Name:");
			t1 = new TextField("WelCome!!!");
			b1 = new Button("Click Me");

			cb1 = new Checkbox("Pen",false);
			cb2 = new Checkbox("Pencil",true);
			cb3 = new Checkbox("Book",true,grp);
			cb4 = new Checkbox("Note Book",false,grp);
			grp = new CheckboxGroup();
			txt = new TextArea();
			lst = new List();
			ch = new Choice();

			pnl = new Panel();
			pnl.setBackground(Color.YELLOW);
			btn = new Button[12];
			for(int i=0; i<12; i++)
				{
					btn[i] = new Button("Button "+(i+1)); pnl.add(btn[i]);
				}
			pnl.setLayout(new GridLayout(4,3));
			b2 = new Button("Hide Panel");  
			b3 = new Button("Show Panel");

		//3.Adding Controls
				m1.add(mi2);
				m1.add(mi3);
				m2.add(mi4);
				m2.add(mi5);
				m2.add(mi6);
				m3.add(mi7);
				m3.add(mi8);
				m3.add(mi9);
				m4.add(mi10);
				mbr.add(m1);
				mbr.add(m2);
				mbr.add(m3);
				mbr.add(m4);
				setMenuBar(mbr);
				add(l1); add(t1);
				add(b1); add(cb1);
				add(cb2); add(cb3);
				add(cb4); add(txt);
				add(pnl); add(b2);
				add(b3); add(lst);
				lst.add("Apple"); lst.add("Banana");
				lst.add("Cat"); lst.add("Dog"); add(ch);
				ch.add("Apple"); ch.add("Banana");
				ch.add("Cat"); ch.add("Dog");

                            //4.Adding Listeners
 
				mi9.addActionListener(this);
				mi10.addActionListener(this);
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				cb1.addItemListener(this);
				cb2.addItemListener(this);
				cb3.addItemListener(this);
				cb4.addItemListener(this);
				ch.addItemListener(this);
				lst.addItemListener(this);

			//5.setting Bounds
					cb1.setBounds(40,140,60,30); cb2.setBounds(110,140,60,30);
					cb3.setBounds(40,170,60,30); cb4.setBounds(110,170,80,30);
					txt.setBounds(40,220,270,90); pnl.setBounds(40,330,270,150);
					b2.setBounds(340,330,140,70); b3.setBounds(340,410,140,70);
					lst.setBounds(340,140,140,170); ch.setBounds(340,100,140,20);

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
			{t1.setText("Button Clicked");}

			if(e.getSource()==b2)
			{pnl.setVisible(false);}

			if(e.getSource()==b3)
			{pnl.setVisible(true);}

			if(e.getSource()==mi7)
			{setBackground(Color.RED);}
		   
			if(e.getSource()==mi8)
			{setBackground(Color.GREEN);}

			if(e.getSource()==mi9)
			{setBackground(Color.BLUE);}

			if(e.getSource()==mi10)
			{System.exit(0);}

		}
	public void itemStateChanged(ItemEvent e)
		{
			if(cb3.getState())
			{t1.setText("Book is Selected");}

			if(cb4.getState())
			{t1.setText("Note Book is Selected");}

			if(e.getSource()==cb1)
			{
				if(cb1.getState())
				t1.setText("Pen is Selected");
				else
				t1.setText("Pen is UNselected");
			}

			if(e.getSource()==cb2)
			{
				if(cb2.getState()) 
					t1.setText("Pencil is Selected");
				else
					t1.setText("Pencil is UNselected");
			}

			if(e.getSource()==ch)
				{
					t1.setText(ch.getSelectedItem() + " at Index = "+ch.getSelectedIndex());
				}

			if(e.getSource()==lst)
				{
					String a[]=lst.getSelectedItems(); String temp="";
					for(int i=0; i<a.length; i++) temp=temp+a[i]+", ";
				t1.setText(temp);
                }
        }
}

class SakshiB1
{
		 public static void main(String[] args)
		{
			new SakshiB();
		}
}
