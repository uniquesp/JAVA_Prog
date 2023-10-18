import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class StudentSys extends JFrame implements ActionListener
{
	JLabel lroll,lnm,lage;
	JTextField troll,tnm,tage;
	JButton clr,add,del,updt,ext;
	
	Connection cn;
	String sql;
	PreparedStatement prstm;
	
	StudentSys(String title)
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
		del = new JButton("Delete");
		updt = new JButton("Updt");
		add = new JButton("add");
		ext = new JButton("exit");
		
		add(lroll);	add(lnm);	add(lage);
		add(troll);	add(tnm);	add(tage);
		add(clr);	add(del);	add(updt);	add(add); add(ext);
	
		clr.addActionListener(this);
		del.addActionListener(this);
		updt.addActionListener(this);
		add.addActionListener(this);
		del.addActionListener(this);
		ext.addActionListener(this);
		
		lroll.setBounds(10,10,80,20);	troll.setBounds(100,10,100,20);
		lnm.setBounds(10,40,80,20);		tnm.setBounds(100,40,100,20);
		lage.setBounds(10,70,80,20);	tage.setBounds(100,70,100,20);
		clr.setBounds(10,100,80,20);	add.setBounds(100,100,80,20);
		del.setBounds(190,100,80,20);	updt.setBounds(280,100,80,20);
		ext.setBounds(370,100,80,20);

		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
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
			}
			
			if(e.getSource() == add)
			{
				sql = "insert into updatable values("+troll.getText()+",'"+tnm.getText()+"',"+tage.getText()+")";
				prstm = cn.prepareStatement(sql);
				prstm.execute();
				prstm.close();
				JOptionPane.showMessageDialog(null, "Record saved Successfully !!!");
			}
			
			if(e.getSource() == del)
			{
				sql = "delete from updatable where roll = "+troll.getText();
				prstm = cn.prepareStatement(sql);
				prstm.execute();
				prstm.close();
				JOptionPane.showMessageDialog(null, "Record deleted Successfully !!!");
			}
			
			if(e.getSource() == updt)
			{
				sql = "update updatable set name ="+tnm.getText()+"',age="+tage.getText()+" where roll = "+troll.getText();
				prstm = cn.prepareStatement(sql);
				prstm.execute();
				prstm.close();
				JOptionPane.showMessageDialog(null, "Record updated Successfully !!!");
			}
			
			if(e.getSource() == ext)
			System.exit(0);
		}//try
		catch(SQLException e1)
		{
			System.out.println(e1);
		}
	}// end addActionListener
	
	public static void main(String args[])
	{
		new StudentSys("DB Connectivity");
	}
}