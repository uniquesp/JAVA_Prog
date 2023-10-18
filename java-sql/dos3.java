import java.sql.*;
import java.util.*;

class dos3
{
	public static void main(String args[])
	{
		int cnt =0;
		Connection cn;
		ResultSet rs;
		String sql;
		String name;
		Statement stm;
		PreparedStatement prstm;
		Scanner s;
		int roll,age;
		int ch;
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			stm = cn.createStatement();
		
			s = new Scanner(System.in);
			while(true)
			{
				System.out.print("\n\t ***Menu***");
				System.out.print("\n\t 1. Display");
				System.out.print("\n\t 2. Insert");
				System.out.print("\n\t 3. Update");
				System.out.print("\n\t 4. Delete");
				System.out.print("\n\t 5. Search");
				System.out.print("\n\t 6. Exit");
				System.out.print("\n\n\t Enter Your Choice :");
				ch = s.nextInt();
				
				if(ch==6)
					{System.exit(0);}
				
				switch(ch)
				{
					
					case 1:
					cnt = 0;
					rs = stm.executeQuery("select * from updatable");
					while(rs.next())
					{
						System.out.print("\n\t"+rs.getString(1)+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3));
						cnt++;
					}
					rs.close();
					System.out.println("\n\n\t Total No of Records : " +cnt);
					break;
						
					case 2:
					System.out.println("\n\t Enter Roll no age and Name: ");
					roll = s.nextInt();
					age = s.nextInt();
					name = s.nextLine();
					
					sql = "insert into updatable values(" +roll+ ", '"+name+"', "+age+")";
					prstm = cn.prepareStatement(sql);
					prstm.execute();
					prstm.close();
					System.out.println("\n\t **** Record Successfully inserted ***");
					break;
					
					case 3:
					System.out.println("\n\t Enter Roll no to update: ");
					roll = s.nextInt();
					System.out.println("\n\t Enter New name & New age: ");
						name = s.next();	age = s.nextInt();
						
					sql = "update updatable set name='" +name+"',age="+age+" where roll="+roll; 
					prstm = cn.prepareStatement(sql);
					prstm.execute();
					prstm.close();
					System.out.println("\n\t **** Record Successfully updated ***");
					break;
			
					case 4:
					System.out.println("\n\t Enter Roll no to delete: ");
					roll = s.nextInt();
					
					sql = "delete from updatable where roll="+roll; 
					prstm = cn.prepareStatement(sql);
					prstm.execute();
					prstm.close();
					System.out.println("\n\t **** Record Successfully deleted ***");
					break;

					case 5:
					try
					{
						System.out.println("\n\t Enter roll no to search : ");
						roll = s.nextInt();
						
						rs = stm.executeQuery("select * from updatable where roll = "+roll);
						rs.first();
						System.out.print("\n\t Roll = " +rs.getString(1)+"\t Name = "+rs.getString(2)+
						"\t Age = "+rs.getString(3));
					}
					catch(Exception exx)
					{
						System.out.println("\n\t Student Not found");
						
					}
				}//switch
			}//while
		
		}//try
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	


}