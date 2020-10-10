package org.hcl.servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StageEvent
 */
public class StageEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StageEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<Center>");
		pw.println("<h1>New Year Eve</h1>");
		pw.println("<table border =1><tr><th>Name</th><td>New Year Eve</td></tr><tr><th>Hall Name</th><td>PVR Lulu Mall</td></tr><tr><th>Date</th><td>10 10 2020</td></tr><tr><th>Star Time</th><td>10:00:00</td></tr><tr><th>End Time</th><td>12:00:00</td></tr></table>");
		pw.println("</Center>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
	}

}
