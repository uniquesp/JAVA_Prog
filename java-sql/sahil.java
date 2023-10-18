import javax.swing.*;
import java.awt.event.*;


class sahil extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton Cadd,Sadd,delete,search,CviewAll,SviewAll;
	

	sahil(String title)
	{
		super(title);
		setLayout(null);
		setSize(500,700);
		setLocation(150,100);
		setVisible(true);
		
		
		l1 = new JLabel("Course");	
		l2 = new JLabel("C_id");	
		l3 = new JLabel("C_name");	
		l4 = new JLabel("Instructor");	
		l5 = new JLabel("Student");	
		l6 = new JLabel("S_id");	
		l7 = new JLabel("S_name");	
		l8 = new JLabel("View All");	
		l9 = new JLabel("S_id");
		l10 = new JLabel("C_name");	
		
		t1 = new JTextField("");
		t2 = new JTextField("");
		t3 = new JTextField("");
		t4 = new JTextField("");
		t5 = new JTextField("");
		t6 = new JTextField("");
		t7 = new JTextField("");
		
		Cadd = new JButton("C_ADD");
		Sadd = new JButton("S_ADD");
		delete = new JButton("delete");
		search = new JButton("search");
		CviewAll = new JButton("C_ViewAll");
		SviewAll = new JButton("S_ViewAll");
		
		
		
		add(l1); add(l2); add(l3); add(l4);	add(l5); add(l6); add(l7); add(l8);	add(l9); add(l10);
		add(t1); add(t2); add(t3); add(t4);add(t5); add(t6); add(t7); 
		add(Cadd);	add(Sadd);	add(delete);	add(search); add(CviewAll); add(SviewAll);
		
	
		Cadd.addActionListener(this);
		Sadd.addActionListener(this);
		delete.addActionListener(this);
		search.addActionListener(this);
		CviewAll.addActionListener(this);
		SviewAll.addActionListener(this);
		
		
			l1.setBounds(30,50,50,30);
			l2.setBounds(100,50,50,30);
			l3.setBounds(100,100,50,30);
			l4.setBounds(100,150,80,30);
			t1.setBounds(170,50,100,30);
			t2.setBounds(170,100,100,30);
			t3.setBounds(170,150,100,30);
			Cadd.setBounds(300,50,100,30);
			CviewAll.setBounds(300,100,100,30);
			
			
			l5.setBounds(30,230,50,30);
			l6.setBounds(100,230,80,30);
			l7.setBounds(100,280,50,30);
			t4.setBounds(170,230,100,30);
			t5.setBounds(170,280,100,30);
			Sadd.setBounds(300,230,100,30);
			delete.setBounds(300,280,100,30);
			search.setBounds(300,330,100,30);
			SviewAll.setBounds(300,380,100,30);
			
			l8.setBounds(30,450,50,30);
			l9.setBounds(100,450,50,30);
			l10.setBounds(100,500,50,30);
			t6.setBounds(170,450,300,30);
			t7.setBounds(170,500,300,30);

			
			
			setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		public void actionPerformed(ActionEvent e)
		{}
		
		
		public static void main(String[] args)
	{
		new sahil("Program");
	}
	
}