package org.hcl.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloSrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public HelloSrvlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Welcome to Hall Paradise</h1>");
		pw.println("<p>The type of events are");
		pw.println("<ul><li>Exhibition</li><li>Stage Show</li></ul>");
		pw.println("</body>");

		pw.println("</html>");
		
	}

}
