import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class ComboSqlDemo extends JFrame implements ItemListener
{
	JLabel lroll,lnm,lage;
	JTextField tnm,tage;
	JComboBox c1;
	
	Connection cn;
	Statement stm;
	ResultSet rs;
	
	ComboSqlDemo(String title)
	{
		super(title);	setLayout(null);
		setSize(300,200);
		
		lroll = new JLabel("Roll No");
		lnm = new JLabel("Name");
		lage = new JLabel("Age");
		c1 = new JComboBox();
		tnm = new TextField("");
		tage = new TextField("");
		
		add(lroll); 	add(lnm);		add(lage);
		add(tnm);		add(tage);		add(c1);

		lroll.setBounds(10,10,20,80);
		lnm.setBounds(10,40,80,20);
		lage.setBounds(10,70,80,20);
		tnm.setBounds(100,40,80,20);
		lage.setBounds(10,70,80,20);
		c1.setBounds(100,100,100,20);
		
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			stm = cn.createStatement();
			rs = stm.executeQuery("select * from updatable order by roll");
			while(rs.next())
				c1.addItem(rs.getString(1));
		}
		catch(Exception e)
		{}
		
		c1.addItemListnere(this);
		
		
		
	
	
	}






























}