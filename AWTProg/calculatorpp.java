import java.awt.*;
import java.awt.event.*;
public class calculatorpp implements ActionListener
{
int c,n;
String s1,s2,s3,s4,s5;
Frame f;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
Panel p;
TextField tf;
GridLayout g;
calculatorpp()
{
f = new Frame("My calculator");
p = new Panel();
f.setLayout(new FlowLayout());

b1 = new Button("0");
b2 = new Button("1");
b3 = new Button("2");
b4 = new Button("3");
b5 = new Button("4");
b6 = new Button("5");
b7 = new Button("6");
b8 = new Button("7");
b9 = new Button("8");
b10 = new Button("9");
b11 = new Button("+");
b12 = new Button("-");
b13 = new Button("*");
b14 = new Button("/");
b15 = new Button("%");
b16 = new Button("=");
b17 = new Button("C");

tf = new TextField();
f.add(tf);
g = new GridLayout(4,4,10,20);
p.setLayout(g);
p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);
f.add(p);

b1.addActionListenere(this);
b2.addActionListenere(this);
b3.addActionListenere(this);
b4.addActionListenere(this);
b5.addActionListenere(this);
b6.addActionListenere(this);
b7.addActionListenere(this);
b8.addActionListenere(this);
b9.addActionListenere(this);
b10.addActionListenere(this);
b11.addActionListenere(this);
b12.addActionListenere(this);
b13.addActionListenere(this);
b14.addActionListenere(this);
b15.addActionListenere(this);
b16.addActionListenere(this);
b17.addActionListenere(this);

		
f.setSize(300,300);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
s3 = tf.getText();
s4 = "0";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b2)
{
s3 = tf.getText();
s4 = "1";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b3)
{
s3 = tf.getText();
s4 = "2";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b4)
{
s3 = tf.getText();
s4 = "3";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b5)
{
s3 = tf.getText();
s4 = "4";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b6)
{
s3 = tf.getText();
s4 = "5";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b7)
{
s3 = tf.getText();
s4 = "6";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b8)
{
s3 = tf.getText();
s4 = "7";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b9)
{
s3 = tf.getText();
s4 = "8";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b10)
{
s3 = tf.getText();
s4 = "9";
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b11)
{
s1 = tf.getText();
tf.setText("");
c=1;
 
}
if(e.getSource()==b12)
{
s1 = tf.getText();
tf.setText("");
c=2;
 
}
if(e.getSource()==b13)
{
s1 = tf.getText();
tf.setText("");
c=3;
 
}
if(e.getSource()==b14)
{
s1 = tf.getText();
tf.setText("");
c=4;
 
}
if(e.getSource()==b15)
{
s1 = tf.getText();
tf.setText("");
c=5;
 
}//
if(e.getSource()==b16)
{
s2 = tf.getText();
if(c==1)
{
n = Integer.parseInt(s1)+Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
else if(c==2)
{
n = Integer.parseInt(s1)-Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
else if(c==3)
{
n = Integer.parseInt(s1)*Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
if(c==4)
{
try
{
	int p=Integer.parseInt(s2);
		if(p!=0)
		{
			n = Integer.parseInt(s1)/Integer.parseInt(s2);
			tf.setText(String.valueOf(n));
		}
		else
			tf.setText("infinite");
 
}
catch(Exception i){}
}
if(c==5)
{
n = Integer.parseInt(s1)%Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
}
if(e.getSource()==b17)
{
tf.setText("");
}
}
 
public static void main(String[] abc)
{
calculator v = new calculator();
}
}