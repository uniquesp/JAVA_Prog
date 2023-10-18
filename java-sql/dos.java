import java.io.*;
import java.sql.*;

class dos
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
			//here ras is database name
			
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3309/sakshi","root","");
			
			System.out.print("\n\t Enter the roll no : ");
			roll = Integer.parseInt(br.readLine());
			
			System.out.print("\n\t Enter the name :");
			name=br.readLine();
			
			
			System.out.print("\n\t Enter the Age :");
			age= Integer.parseInt(br.readLine());

			sql = "insert into mytable values(" +roll+ "," +name+ "," +age+ ")";
			
			ps = cn.prepareStatement (sql);
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