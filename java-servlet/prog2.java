import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class prog2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body bgcolor=pink>");
        out.println("<h1>TYBCS</h1>");
        out.println("</body></html>");
    }
}