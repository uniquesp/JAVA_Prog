import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class serve_db extends HttpServlet 
{
	Connection cn;
	Statement stm;
	ResultSet rs;

    public void service(HttpServletRequest request, HttpServletResponse res)
    throws IOException, ServletException
    {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<HTML><HEAD><TITLE>Database Connectivity</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<p align=center><BIG>Data From Database</BIG></P>");
		out.println("<TABLE align=center border=1>");
		out.println("<TR><TH>Roll Number</TH><TH>Name</TH><TH>Age</TH></TR>");
		
		try 
		{
		
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3309/sakshi","root","");
			stm = cn.createStatement();
			rs = stm.executeQuery("select * from mytable");
			
			while(rs.next())
			{
				out.println("<TR>");
				out.println("<TD>"+rs.getString(1)+ "</TD>");
				out.println("<TD>"+rs.getString(2)+ "</TD>");
				out.println("<TD>"+rs.getString(3)+ "</TD>");
				out.println("</TR>");
			}
			rs.close();	stm.close();	cn.close();
		}
		catch(Exception e)
		{
			out.println(e.getMessage());
		}
		out.println("</TABLE></BODY></HTML>");
	}
}