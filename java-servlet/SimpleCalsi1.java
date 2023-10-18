import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class SimpleCalsi1 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        String txt1 = request.getParameter("txt1");
        String txt2 = request.getParameter("txt2");
		
		int a = Integer.parseInt(txt1);
		int b = Integer.parseInt(txt2);
		int k=0;
		
        String op = request.getParameter("op");
		if(op.equals("ADD"))
		{k=a+b;}
		else if(op.equals("SUB"))
		{k=a-b;}
		else if(op.equals("MUL"))
		{k=a*b;}
		else if(op.equals("DIV"))
		{k=a/b;}
		
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<BR> First No:  "+ a);
        pw.println("<BR> Second No:  "+ b);
		pw.println("<BR> Ans:  "+ k);

		pw.close();
    }
}