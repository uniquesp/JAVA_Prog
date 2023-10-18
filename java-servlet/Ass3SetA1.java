import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Ass3SetA1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body><H1>");
		java.util.Properties p = System.getProperties();
		out.println("Server Name:"+req.getServerName()+"<BR>");
		out.println("Remote Address:"+req.getRemoteAddr()+"<BR>");
		out.println("Remote User:"+req.getRemoteUser()+"<BR>");
		out.println("Server port:"+req.getServerPort()+"<BR>");
		out.println("Remote host:"+req.getRemoteHost()+"<BR>");
		out.println("Local Name :"+req.getLocalName()+"<BR>");
		out.println("Local Address:"+req.getLocalAddr()+"<BR>");
		out.println("Servlet Name:"+this.getServletName()+"<BR>");
		out.println("os name:"+p.getProperty("os.name")+"<BR>");
		out.println("</H1></body></html>");
    }
	
}