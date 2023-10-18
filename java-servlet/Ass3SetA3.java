import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class Ass3SetA3 extends HttpServlet 
{
	Connection con;
	Statement stm;
	ResultSet rs;

    public void service(HttpServletRequest req, HttpServletResponse res)
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
			int roll = Integer.parseInt(req.getParameter("txt1"));
			con = DriverManager.getConnection("jdbc:mysql://localhost:3309/sakshi","root","");
			stm = con.createStatement();
			rs = stm.executeQuery("select * from mytable where roll = "+roll);
			
			rs.next();
			out.println("<TR>");
			out.println("<TD>"+rs.getString(1)+ "</TD>");
			out.println("<TD>"+rs.getString(2)+ "</TD>");
			out.println("<TD>"+rs.getString(3)+ "</TD>");
			out.println("</TR>");
			
			rs.close();	stm.close();	con.close();
		}
		catch(Exception e)
		{
			out.println(e.getMessage());
		}
		out.println("</TABLE></BODY></HTML>");
	}
}