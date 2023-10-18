/*Updatable Resultset
In order o make resultset obj as updatable and scroolable, we must use the follow constants which are prsent 
in resultset.

int Type => TYPE_SCROLL_SENSITIVE
int Mode => CONCUR_UPDATABLE

public Statement createStatement(int Type, int Mode) 
*/

import java.sql.*;

class dos2
{
	public static void main(String args[])
	{
		int cnt=0;
		Connection cn;
		Statement stm;
		ResultSet rs;
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
			
			rs = stm.executeQuery("select * from updatable order by roll");
			while(rs.next())
			{
				System.out.print("\n\t" +rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3));
			
			}
			System.out.print("\n\t ****Operations On resultSset****");
			
			//Updating 2nd Row from table
			rs.absolute(2);       //move to 2nd row
			rs.updateString(2,"Row 2");
			rs.updateInt(3,50);		//age =50
			rs.updateRow();
			
			//Deleting the fourth Row
			rs.absolute(4);
			rs.deleteRow();
			
		//Inserting Row TableCellEditor
			rs.moveToInsertRow();
			rs.updateInt(1,18);
			rs.updateString(2,"Notebook");
			rs.updateInt(3,99);
			rs.insertRow();
			
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.print("\n\t" +rs.getString(1)+ "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3));
			}
			rs.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}