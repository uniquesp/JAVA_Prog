//All awt controls in  one prog


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class all_swing extends JFrame implements ActionListener,ItemListener,
ListSelectionListener
{
	//1) Declrartion
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	JCheckBox cb1,cb2;
	JComboBox ch;
	JList lst;
	JMenuBar mbr;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mir,mig,mib;
	JMenuItem md1,md2,md3,md4,md5,md6;
	JTextArea ta;
	String s_arr[] = {"Apple","Banana","Dog","Cat"};
	
	JRadioButton rb1,rb2;
	ButtonGroup grp;
	Font f;
	JSeparator sep;
	JPanel pn1;
	JButton b[];
	JButton b2,b3;
	
	
	all_swing()
	{
			//1)Declration
			super("All Swing Controls");
			setSize(700,700);
			setLocation(100,50);
			setLayout(null);
			
			f = new Font("Arial",Font.BOLD,15);
			//setFont(f); //not applicable for Swing
			
			//2)memory Allocation
			l1 = new JLabel("Enter Your Name");
			l2 = new JLabel("JpasswordField");
			t1 = new JTextField("Welcome");
			t2 = new JPasswordField();
			b1 = new JButton("Click me");
			b2 = new JButton("Hide");
			b3 = new JButton("Show");
			cb1 = new JCheckBox("Pen"); 
			cb2 = new JCheckBox("Pencil",true); 
			ch= new JComboBox();
			//lst = new List();
			
			lst = new JList(s_arr);
			ta = new JTextArea();
			sep = new JSeparator();
			
			grp = new ButtonGroup();
			rb1 = new JRadioButton("Book",true);
			rb2 = new JRadioButton("NoteBook");
			pn1 = new JPanel();

			mbr = new JMenuBar();
			m1 = new JMenu ("File");	
			m2 = new JMenu ("Edit");	
			m3 = new JMenu ("Help");	
			m4 = new JMenu ("Color");
			m5 = new JMenu("MessageDailogs");
			mi1 = new JMenuItem ("Open");	
			mi2 = new JMenuItem ("Save");	
			mi3 = new JMenuItem ("Exit");	
			mi4 = new JMenuItem ("Cut");
			mi5 = new JMenuItem ("Copy");	
			mi6 = new JMenuItem ("Paste");	
			mi7 = new JMenuItem ("About us");	
			mig = new JMenuItem ("Green");	
			mir = new JMenuItem ("Red");
			mib = new JMenuItem ("Blue");	
			md1 = new JMenuItem("Simple Msg Box");
			md2 = new JMenuItem("Warning Msg Box");
			md3 = new JMenuItem("Error Msg Box");
			md4 = new JMenuItem("Confirm Box");
			md5 = new JMenuItem("Confirm Box2");
			md6 = new JMenuItem("Input Dailog");
			
			m1.add(mi1);	 m1.add(mi2);	m1.addSeparator();
			m1.add(mi3);	mbr.add(m1);
			
			m2.add(mi4);	 m2.add(mi5);	m2.add(mi6);
			mbr.add(m2);
			
			m3.add(mi7);
			mbr.add(m3);
			
			m4.add(mir);	 m4.add(mig);	m4.add(mib);
			mbr.add(m4);
			
			m5.add(md1);	m5.add(md2);	m5.add(md3);
			m5.add(md4);	m5.add(md5);	m5.add(md6);
			mbr.add(m5);

			add(mbr);

			
			b = new JButton[12];
			
			for(int i=0; i<12; i++)
			{
				b[i] = new JButton("Button" +(i+1));
				pn1.add(b[i]);
			}
			
		
			//bydefault panel having flowlayout()
			pn1.setLayout(new GridLayout(4,3,5,5));
			pn1.setBackground(Color.YELLOW);
			add(pn1);
			
			// Add component on Frame
			add(l1);	add(t1);	add(b1);	add(cb1);
			add(cb2);	add(b2);	add(b3);	add(l2);
			add(rb1);	add(rb2);	add(t2);	add(sep);
			add(l1);	add(t1);	
			grp.add(rb1); grp.add(rb2);
			add(ch);
			
			
			//add(lst)
			int v1 = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h1 = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
			JScrollPane jsp1 = new JScrollPane(lst,v1,h1);
			add(jsp1);
			
			//add(ta)
			int v2 = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h2 = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
			JScrollPane jsp2 = new JScrollPane(ta,v2,h2);
			add(jsp2);
			
			ch.addItem("Apple");	ch.addItem("Banana");
			ch.addItem("cat");	ch.addItem("Dog");
			
			t1.setFont(f);
			
			
			//4) setBounds(x,y,width,height)
			mbr.setBounds(0,0,800,30);
			l1.setBounds(50,100,100,30);
			l2.setBounds(50,190,100,30);
			t1.setBounds(160,100,460,30);
			t2.setBounds(160,190,290,30);
			b1.setBounds(50,145,400,30);
			cb1.setBounds(50,230,100,30);
			cb2.setBounds(160,230,100,30);
			rb1.setBounds(50,260,100,30);
			rb2.setBounds(160,260,100,30);
			
			ta.setBounds(50,300,400,100);
			
			jsp2.setBounds(50,300,400,100);
			sep.setBounds(20,410,650,100);
			pn1.setBounds(50,430,400,150);
			b2.setBounds(470,430,150,70);
			b3.setBounds(470,510,150,70);
			
			ch.setBounds(470,150,150,30);
			//lst.setBounds(500,200,200,200);
			jsp1.setBounds(470,200,150,200);

			

			//5) Add Listneres on controls
			
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				rb1.addActionListener(this);
				rb2.addActionListener(this);
				cb1.addItemListener(this);
				cb2.addItemListener(this);
				ch.addItemListener(this);
			//lst.addItemListener(this);
				lst.addListSelectionListener(this);
				mi3.addActionListener(this);
				mir.addActionListener(this);
				mig.addActionListener(this);
				mib.addActionListener(this);
				md1.addActionListener(this);
				md2.addActionListener(this);
				md3.addActionListener(this); 
				md4.addActionListener(this);
				md5.addActionListener(this);
				md6.addActionListener(this);
				
				t1.setToolTipText("Result Shown Here");
				b1.setToolTipText("This Is A Button");
				
				b1.setMnemonic('c');
				m1.setMnemonic('f');
				mi3.setMnemonic('x');
				
				m4.setMnemonic('L');
				mir.setMnemonic('R');
				mig.setMnemonic('G');
				mib.setMnemonic('B');
			
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
	}
	
	
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==b1)
					t1.setText("Button Clicked");
				
				if(e.getSource()==b2)
					pn1.setVisible(false);
				
				if(e.getSource()==b3)
					pn1.setVisible(true);
				
				if(e.getSource()==mi3)
					System.exit(0);
			//setBackground(Color.pink); //not applicable for Swing	
				
				if(e.getSource()==mir)
					pn1.setBackground(Color.red);
				if(e.getSource()==mig)
					pn1.setBackground(Color.green);
				if(e.getSource()==mib)
					pn1.setBackground(Color.blue);
				
				if(e.getSource()==rb1 || e.getSource()==rb2)
				{
					if(rb1.isSelected())
						t1.setText("Book Selected");
					else
						t1.setText("NoteBook Selected");
				}
				
				if(e.getSource()==md1)
				JOptionPane.showMessageDialog(null,"This is Simple Msg Box");
			
				if(e.getSource()==md2)
				JOptionPane.showMessageDialog(null,"Please Try Again!","Invalid Password!!!",
				JOptionPane.WARNING_MESSAGE);
			
				if(e.getSource()==md3)
				JOptionPane.showMessageDialog(null,"Please Try Again!","Invalid Password!!!",
				JOptionPane.ERROR_MESSAGE);
			
				if(e.getSource()==md4)
				{
					int ans = JOptionPane.showConfirmDialog(
					null,"This is Yes/No/cancel Msg Box");
					if(ans==0)
						t1.setText("You Clicked on Yes Button");
					else if(ans==1)
						t1.setText("You Clicked on NO Button");
					else
						t1.setText("You Clicked on Cancel Button");
				}
				if(e.getSource()==md5)
				{
					int ans = JOptionPane.showConfirmDialog(
					null,"Message"," Msg Box Title", JOptionPane.OK_CANCEL_OPTION);
					if(ans==0)
						t1.setText("You Clicked on ok Button");
					else 
						t1.setText("You Clicked on Cancel Button");
				}
			
				if(e.getSource()==md6)
				{
						String str = JOptionPane.showInputDialog(null,"Enter Some Text: ");
						if(str != null)
							t1.setText("You entered text: "+ str);
						else
							t1.setText("You Pressed cancel button ");
				}
			
			}
			
			public void itemStateChanged(ItemEvent et)
			{
				if(et.getSource()==cb1)
				{
					if(cb1.isSelected())
						t1.setText("pen Checked");
					if(cb1.isSelected()==false)
						t1.setText("pen UnChecked");
				}
				if(et.getSource()==cb2)
				{
					if(cb1.isSelected())
						t1.setText("pencil Checked");
					if(cb1.isSelected()==false)
						t1.setText("pencil UnChecked");
				}
				if(et.getSource()==ch)
				{
					t1.setText(ch.getSelectedItem()+"is at Index = "+ ch.getSelectedIndex());
				}
				
			}
		
			public void valueChanged(ListSelectionEvent e)
			{
				t1.setText("Selected Item = " + lst.getSelectedValue());
			
			}
		
}

class all_swing2
{	
public static void main(String args[])
	{
		new all_swing();
	}
}