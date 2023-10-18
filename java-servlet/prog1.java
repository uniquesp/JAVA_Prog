import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class prog1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body bgcolor=yellow>");
        out.println("<h1>sp_the_unique_brand</h1>");
        out.println("</body></html>");
    }
}