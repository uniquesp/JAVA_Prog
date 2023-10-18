//prepared statements => pre-compiled sql statements
//inserting data

import java.io.*;
import java.sql.*;

class dos_method2
{
	public static void main(String args[])
	{
		try
		{
			String name;
			int roll,age;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Connection cn;
			PreparedStatement ps;
			String sql;
			
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			
			System.out.print("\n\t Enter the roll no : ");
			roll = Integer.parseInt(br.readLine());
			
			System.out.print("\n\t Enter the name :");
			name=br.readLine();
			
			
			System.out.print("\n\t Enter the Age :");
			age= Integer.parseInt(br.readLine());

			sql = "insert into mytable values(?,?,?)";
			ps = cn.prepareStatement (sql);
			ps.setInt(1,roll);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.execute();
			ps.close();
			System.out.println("\n\t *** Record Successfully Inserted *** ");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
			
		}
		
		
	
	
	}


}