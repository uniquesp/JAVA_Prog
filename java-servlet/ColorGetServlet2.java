import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ColorGetServlet2 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        String color = request.getParameter("color");
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>The Selected Color is:  ");
		pw.println(color);
		pw.close();
    }
}