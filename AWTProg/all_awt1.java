//All awt controls in  one prog
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent.*;
import java.awt.event.ActionEvent.*;

class myfrm6 extends Frame implements ActionListener,ItemListener
{
	//1) Declrartion
	Choice ch;
	List lst;
	Label l1;
	TextField t1;
	Checkbox c1,c2,c3,c4;
	CheckboxGroup grp1;
	Button b1,b2,b3,btn[];
	Panel p1;
	MenuBar mbr;
	Menu m1,m2,m3,m4;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10;
	TextArea txa;
	int i;
	
	myfrm6()
	{
		//1)Declration
			setTitle("All AWT");
			setSize(750,620);
			setLocation(150,100);
			setFont(new Font ("Times New Roman", Font.BOLD,18));
			setLayout(null);
			
		//2)memory Allocation
			grp1 = new CheckboxGroup();
			c1 = new Checkbox("Book",true,grp1); 
			c2 = new Checkbox("NoteBook",false,grp1);
			c3 = new Checkbox("Pen",false); 
			c4 = new Checkbox("Pencil",true); 
			l1 = new Label("Enter Your Name");
			t1 = new TextField("Welcome");
			ch= new Choice();
			b1 = new Button("Click me");
			b2 = new Button("Show");
			b3 = new Button("Hide");
			mbr = new MenuBar();
			m1 = new Menu ("File");	
			m2 = new Menu ("Edit");	
			m3 = new Menu ("Help");	
			m4 = new Menu ("Color");	
			mi1 = new MenuItem ("Open");	
			mi2 = new MenuItem ("Save");	
			mi3 = new MenuItem ("Exit");	
			mi4 = new MenuItem ("Cut");
			mi5 = new MenuItem ("Copy");	
			mi6 = new MenuItem ("Paste");	
			mi7 = new MenuItem ("About us");	
			mi8 = new MenuItem ("Green");	
			mi9 = new MenuItem ("Red");
			mi10 = new MenuItem ("Blue");
			txa = new TextArea();
			lst = new List();
			p1 = new Panel();
			
		//3)Add Controls On Frames 
			add(l1);	add(t1);	
			add(b1);	add(b2);	add(b3);
			add(c1);	add(c2);	add(c3);	add(c4);
			m1.add(mi1);	 m1.add(mi2);	m1.add(mi3);
			mbr.add(m1);
			m2.add(mi4);	 m2.add(mi5);	m2.add(mi6);
			mbr.add(m2);
			m3.add(mi7);
			mbr.add(m3);
			m4.add(mi8);	 m4.add(mi9);	m4.add(mi10);
			mbr.add(m4);
			setMenuBar(mbr);
			add(txa);
			add(ch);
			ch.add("Apple");ch.add("Banana");ch.add("Mango");ch.add("Orange");ch.add("Strawberry");
			add(lst);
			lst.add("Cat"); lst.add("Dog"); lst.add("Cow"); lst.add("Monkey");lst.add("OX");
			
			add(p1);
			p1.setBackground(Color.YELLOW);
			p1.setLayout(new GridLayout(3,4,5,5));
			btn = new Button[12];
			for(int i=0;i<12;i++)
			{
				btn[i] = new Button("Button\t"+(i+1));
				p1.add(btn[i]);
			}
		
		//4) setBounds(x,y,width,height)
			l1.setBounds(50,100,200,20);
			t1.setBounds(300,100,400,30);
			b1.setBounds(50,150,400,30);
			ch.setBounds(500,150,200,30);
			lst.setBounds(500,200,200,200);
			c3.setBounds(50,210,100,30);
			c4.setBounds(200,210,100,30);
			c1.setBounds(50,260,100,30);
			c2.setBounds(200,260,130,30);
			txa.setBounds(50,300,400,90);
			b2.setBounds(500,450,200,50);
			b3.setBounds(500,530,200,50);
			p1.setBounds(50,430,400,160);
			
		//5) Add Listneres on controls
			ch.addItemListener(this);
			c1.addItemListener(this);
			c2.addItemListener(this);
			c3.addItemListener(this);
			c4.addItemListener(this);
			lst.addItemListener(this);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			mi3.addActionListener(this);
			mi8.addActionListener(this);
			mi9.addActionListener(this);
			mi10.addActionListener(this);
			
		addWindowListener(new WindowAdapter()
		{	
			public void windowClosing(WindowEvent e)
			{System.exit(0);}
		});
		setVisible(true);
	}
		
		public void itemStateChanged(ItemEvent et)
		{
			if(c1.getState())
				t1.setText("Book is Selected");
			if(c2.getState())
				t1.setText("Note Book is Selected");
			if(et.getSource()==c3)
			{
				if(c1.getState()==true)
					t1.setText("Pen is Checked");
				else
					t1.setText("Pen is UNChecked");
			}
			if(et.getSource()==c4)
			{
				if(c2.getState()==true)
					t1.setText("Pencil is Checked");
				else
					t1.setText("Pencil is UNChecked");
			}
			if(c1.getState()== true && c2.getState()==true)
			{
				t1.setText("Pen & Pencil is Checked");
			}
			if(et.getSource()==ch)
				t1.setText(ch.getSelectedItem() + " at Index = "+ch.getSelectedIndex());
			if(et.getSource()==lst)
			{
				String a[]=lst.getSelectedItems();
				String temp="";
				for(int i=0; i<a.length; i++)
				temp=temp+a[i]+", ";
				t1.setText(temp);
			}
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
				t1.setText("Button Clicked");
			if(e.getSource()==b2)
				p1.setVisible(true);
			if(e.getSource()==b3)
				p1.setVisible(false);
			if(e.getSource()==mi3)
				System.exit(0);
			if(e.getSource()==mi8)
				setBackground(Color.GREEN);
			if(e.getSource()==mi9)
				setBackground(Color.RED);
			if(e.getSource()==mi10)
				setBackground(Color.BLUE);
				
		}
}			

class all_awt1
{
	public static void main(String[] args)
	{
		new myfrm6();
	}
}
	