import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent.*;
import java.awt.event.ActionEvent.*;
import java.lang.String.*;
class myfrm extends Frame implements ItemListener,ActionListener
{
Label l1,l2,l3;
TextField t1,t2;
Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
CheckboxGroup grp1;
String a,b,c,d;
myfrm()
{
setTitle("Radio+CheckBox+TextField");
setSize(500,350);
setLocation(500,200);
setLayout(null);
l1 = new Label("Enter Your Name:");
l2 = new Label("Your Class");
l3 = new Label("Your Hobbies");
t1 = new TextField();
t2 = new TextField("Name:--- Class:--- Hobbies:---");
grp1 = new CheckboxGroup();
cb1 = new Checkbox("FY",false,grp1);
cb2 = new Checkbox("SY",false,grp1);
cb3 = new Checkbox("TY",false,grp1);
cb4 = new Checkbox("Music");
cb5 = new Checkbox("Dance");
cb6 = new Checkbox("Sports");
add(l1); add(l2); add(l3);
add(t1); add(t2);
add(cb1); add(cb2); add(cb3);
add(cb4); add(cb5); add(cb6);
l1.setBounds(50,50,110,30);
t1.setBounds(160,50,130,30);
t1.requestFocus();
l2.setBounds(50,110,100,30);
cb1.setBounds(60,135,50,30);
cb2.setBounds(60,165,50,30);
cb3.setBounds(60,195,50,30);
l3.setBounds(170,110,100,30);
cb4.setBounds(180,135,100,30);
cb5.setBounds(180,165,100,30);
cb6.setBounds(180,195,100,30);
t2.setBounds(40,270,430,30);
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
cb5.addItemListener(this);
cb6.addItemListener(this);
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
		}
	public void itemStateChanged(ItemEvent e)
	{
		{
		if(cb1.getState())
			a=("Name: "+t1.getText()+" class: FY");
			t2.setText(a);
		if(cb2.getState())
			a=("Name: "+t1.getText()+" class: SY");
			t2.setText(a);
		if(cb3.getState())
			a=("Name: "+t1.getText()+" class: TY");
			t2.setText(a);
		}
		if(e.getSource()==cb4)
		{
			if(cb4.getState())
			{	b=("Music");
				c=(a+" Hobbies: "+b+"");
				t2.setText(c);
			}
			else
				{t2.setText(a);}
		}
		if(e.getSource()==cb5)
		{
			if(cb5.getState())
				{c=("Dance");
				d=(a+" Hobbies: "+b+", "+c);
				t2.setText(d);}
			else
				{t2.setText(a+" Hobbies: "+b+"");}
				}
		if(e.getSource()==cb6)
		{
			if(cb6.getState())
				{d=("Sports");
				t2.setText(a+" Hobbies: "+b+", "+c+", "+d);}
			else
				t2.setText(a+" Hobbies: "+b+", "+c);
		}
	}
}
class Ass3q2
{
public static void main(String [] args)
{
new myfrm();
}
}
