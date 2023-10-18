//whenever we create a resultset object, which never allows us to update the database thro resultset object
//and it allows retriving the data only in the forward dirction such tyoe resultset is known as non-updatable and non-scrollable 
//resultset
//Select * from table

import java.sql.*;

class dos1
{
	public static void main(String args[])
	{
		int cnt=0;
		Connection cn;
		Statement stm;
		ResultSet rs;
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3309/sakshi","root","");
			stm = cn.createStatement();
			
			rs = stm.executeQuery("select * from mytable");
			while(rs.next())
			{
				System.out.print("\n\t" +rs.getString("roll")+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3));
				cnt++;
			}
			rs.close();
			System.out.println("\n\n\t ****Total No of Records : "+cnt );
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}