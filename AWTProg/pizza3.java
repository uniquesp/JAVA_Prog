import java.awt.*;
import java.awt.event.*;

class myfrm2 extends Frame implements ActionListener,ItemListener
{
//1) Declrartion
Choice ch;
Label l1,l2,l3,l4;
TextField t1,t2,t3;
Button b1,b2,b3;

	int a,b;


	myfrm2()
	{
	setTitle("PizzaHut Shop");
	setSize(800,500);
	setLocation(200,200);
	setFont(new Font ("Times New Roman", Font.BOLD,20));
	setLayout(null);

			//2)memory Allocation
			l1 = new Label("Select Pizza Type");
			l2 = new Label("Price in Indian Rs");
			l3 = new Label("Quantity");
			l4 = new Label("Total Cost");
			ch= new Choice();
			t1 = new TextField();
			t2 = new TextField();
			t3 = new TextField();
			b1 = new Button("Total");
			b2 = new Button("Clear");
			b3 = new Button("Exit");

			//3)Add Controls On Frames

			add(l1); add(ch);
			add(l2); add(t1);
			add(l3); add(t2);
			add(l4); add(t3);

			add(b1); add(b2); add(b3);


			ch.add("PureVeg Pizza");
			ch.add("AllInOne Mini Pizza");
			ch.add("Paneer Cheese Pizza");
			ch.add("Capsicum Cheese Pizza");
			ch.add("Corn Cheese Pizza");
			ch.add("Periperi Pizza");
			ch.add("Chicken Pizza");
			ch.add("Classic Veg Pizza");
			ch.add("Italian Pizza");
			ch.add("Mashroom Pizza");


				//4) setBounds(x,y,width,height)

				ch.setBounds(330,100,210,30);

				l1.setBounds(100,100,210,30);
				l2.setBounds(100,150,210,30);
				t1.setBounds(330,150,200,30);
				l3.setBounds(100,200,210,30);
				t2.setBounds(330,200,200,30);
				l4.setBounds(100,250,210,30);
				t3.setBounds(330,250,200,30);
				b1.setBounds(100,320,100,30);
				b2.setBounds(330,320,100,30);
				b3.setBounds(560,320,100,30);


				//5) Add Listneres on controls
				ch.addItemListener(this);
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);

					addWindowListener(new WindowAdapter()
					{
					//method overriding
					public void windowClosing(WindowEvent e)
					{
					System.exit(0);
					}

					});
					setVisible(true);

	}


				public void itemStateChanged(ItemEvent e)
				{
					try
					{
						if(e.getSource()==ch)
						{
							 if(ch.getSelectedIndex()==0){
								t1.setText("99");
							}

							else if(ch.getSelectedIndex()==1){
								t1.setText("125");
							}

							else if(ch.getSelectedIndex()==2){
								t1.setText("165");
							}

							else if(ch.getSelectedIndex()==3){
								t1.setText("115");
							}

							else if(ch.getSelectedIndex()==4){
								t1.setText("60");
							}

							else if(ch.getSelectedIndex()==5){
								t1.setText("125");
							}

							else if(ch.getSelectedIndex()==6){
								t1.setText("235");
							}

							else if(ch.getSelectedIndex()==7){
								t1.setText("190");
							}

							else if(ch.getSelectedIndex()==8){
								t1.setText("249");
							}

							else if(ch.getSelectedIndex()==9) {
								t1.setText("149");
							}

						}
						else{}

					}
					catch(Exception rr)
					{
					rr.printStackTrace();
					}

				}

		public void actionPerformed(ActionEvent et)
		{
			try
			{
				if(et.getSource()==b1)
				{

				a = Integer.parseInt(t1.getText());

				b = Integer.parseInt(t2.getText());

				int c = a*b;

				t3.setText(""+c);

				}

				else if(et.getSource()==b2)
				{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				}
				else if(et.getSource()==b3)
				{
				System.exit(0);
				}

			}

			catch(ArithmeticException ex)
			{
			  System.out.println("\n\t Can not divide by zero " );
			}
			catch(NumberFormatException ex)
			{
			  System.out.println("\n\t Exception Invalid Number");
			}
			catch(Exception ex)
			{
			System.out.println("\n\t Exception Caught\n" +ex.toString());
			}

		}
}




class pizza3
{
public static void main(String args[])
{
new myfrm2();
}
}