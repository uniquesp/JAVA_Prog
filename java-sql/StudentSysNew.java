import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class StudentSysNew extends JFrame implements ActionListener
{
	JLabel lroll,lnm,lage;
	JTextField troll,tnm,tage;
	JButton clr,add,del,updt,ext,fst,lst,next,prv;
	
	Connection cn;
	String sql;
	PreparedStatement prstm;
	ResultSet rs;
	Statement stm;
	
	StudentSysNew(String title)
	{
		super(title);
		setLayout(null);
		setSize(500,200);
		setLocation(250,200);
		setVisible(true);
		
		lroll = new JLabel("Roll no.");		troll = new JTextField("");
		lnm = new JLabel("Name");			tnm = new JTextField("");
		lage= new JLabel("Age");			tage = new JTextField("");
		clr = new JButton("Clear");
		del = new JButton("Delete");	updt = new JButton("Updt");
		add = new JButton("add");	ext = new JButton("exit");
		
		fst = new JButton("First");	next = new JButton("Next");
		lst = new JButton("Last");		prv = new JButton("Prev");
		
		
		
		add(lroll);	add(lnm);	add(lage);
		add(troll);	add(tnm);	add(tage);
		add(clr);	add(del);	add(updt);	add(add); add(ext);
		add(fst);	add(lst);	add(next);	add(prv);
		
	
		clr.addActionListener(this);
		del.addActionListener(this);
		updt.addActionListener(this);
		add.addActionListener(this);
		del.addActionListener(this);
		ext.addActionListener(this);
		fst.addActionListener(this);
		lst.addActionListener(this);
		next.addActionListener(this);
		prv.addActionListener(this);
		
		lroll.setBounds(10,10,80,20);	troll.setBounds(100,10,100,20);
		lnm.setBounds(10,40,80,20);		tnm.setBounds(100,40,100,20);
		lage.setBounds(10,70,80,20);	tage.setBounds(100,70,100,20);
		clr.setBounds(10,100,80,20);	add.setBounds(100,100,80,20);
		del.setBounds(190,100,80,20);	updt.setBounds(280,100,80,20);
		ext.setBounds(370,100,80,20);
		
		fst.setBounds(190,130,80,20);	next.setBounds(10,130,80,20);
		lst.setBounds(280,130,80,20);	prv.setBounds(100,130,80,20);


		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			stm = cn.createStatement();
			rs = stm.executeQuery("select * from updatable order by roll");
			rs.first();
			display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()== clr)
			{
				troll.setText("");
				tnm.setText("");
				tage.setText("");
				troll.requestFocus();
			}
			
			if(e.getSource() == add)
			{
				sql = "insert into updatable values("+troll.getText()+",'"+tnm.getText()+"',"+tage.getText()+")";
				prstm = cn.prepareStatement(sql);
				prstm.execute();
				refresh();
			}
			
			if(e.getSource() == del)
			{
				sql = "delete from updatable where roll = "+troll.getText();
				prstm = cn.prepareStatement(sql);
				prstm.execute();
				refresh();
			}
			
			if(e.getSource() == updt)
			{
				sql = "update updatable set name ="+tnm.getText()+"',age="+tage.getText()+" where roll = "+troll.getText();
				prstm = cn.prepareStatement(sql);
				prstm.execute();
				refresh();
			}
			
			if(e.getSource() == ext)
			System.exit(0);
			
			//part 2
			if(e.getSource() == fst)
			{
				rs.first();
				display();
			}
			
			if(e.getSource() == lst)
			{
				rs.last();
				display();
			}
			
			if(e.getSource() == next)
			{
				rs.next();
				if(rs.isAfterLast())
					rs.last();
				
				display();
			}
			
			if(e.getSource() == prv)
			{
				rs.previous();
				if(rs.isBeforeFirst())
					rs.first();
				
				display();
			}
		}//try
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}// end addActionListener
	
	public void refresh()
	{
		try
		{
			rs = stm.executeQuery("select * from updatable order by roll");
			rs.next();
			display();
			prstm.close();
		}
		catch(Exception et)
		{et.printStackTrace();}
	}
	
	
	public void display()
	{
		try
		{
			troll.setText(rs.getString(1));
			tnm.setText(rs.getString(2));
			tage.setText(rs.getString(3));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		new StudentSysNew("DB Connectivity");
	}
}