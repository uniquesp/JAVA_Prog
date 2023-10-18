//Shopping mall program {Check Box}
import java.awt.*;
import java.awt.event.*;



class myfrm1 extends Frame implements ItemListener
{
	//1) Declrartion
	Checkbox ch1,ch2,ch3,ch4;
	Label l1,l2,l3,l4;
	TextField t1;
	
	myfrm1()
	{
		setTitle("Shopping Mall");
		setSize(800,500);
		setLocation(200,200);
		setFont(new Font ("Times New Roman", Font.BOLD,20));
		setLayout(null);
		
		//2)memory Allocation
			ch1 = new Checkbox("Pen ",false); //bydefault false
			ch2 = new Checkbox("Pencil",false);
			ch3 = new Checkbox("Sharpner",false);
			ch4 = new Checkbox("Book",false);

			l1 = new Label("Rs 15 -/- ");
			l2 = new Label("Rs 5 -/- ");
			l3 = new Label("Rs 5 -/- ");
			l4 = new Label("Rs 150 -/- ");

			t1 = new TextField();
			


		//3)Add Controls On Frames
			add(ch1);	add(ch2);	add(ch3);	add(ch4);
			add(l1);	add(l2);	add(l3);	add(l4);
			add(t1);
		
		//4) setBounds(x,y,width,height)
			ch1.setBounds(200,100,100,40);
			ch2.setBounds(200,150,100,40);
			ch3.setBounds(200,200,130,40);
			ch4.setBounds(200,250,100,40);
			
			l1.setBounds(400,100,100,30);
			l2.setBounds(400,150,100,30);
			l3.setBounds(400,200,100,30);
			l4.setBounds(400,250,100,30);
			
			t1.setBounds(200,350,300,30);
		
		//5) Add Listneres on controls
			ch1.addItemListener(this);
			ch2.addItemListener(this);
			ch3.addItemListener(this);
			ch4.addItemListener(this);
		
		
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
				int sum = 0;
				if (ch1.getState()) {
					sum += 15;

				}

				if (ch2.getState()) {
					sum += 5;
				}
				if (ch3.getState()) {
					sum += 5;
				}
				if (ch4.getState()) {
					sum += 150;
				}
				
				int total = sum;
				t1.setText("Total Price = RS "+ total +" -/-");

				
			}
		

}






class shopmall
{
	public static void main(String args[])
	{
		new myfrm1();
	}
}
	