

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Hello() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>My first Servlet program</h3>");
		out.print("</body></html>");
	}

}
