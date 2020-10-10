package org.hcl.servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Exhibition() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<Center>");
		pw.println("<h1>TextFair 2018 expo</h1>");
		pw.println("<table border=1><tr><th>Name</th><td>TextFair 2017 expo</td></tr><tr><th>Hall Name</th><td>PVR Superlex</td></tr><tr><th>Start Date</th><td>10-10-2020</td></tr><tr><th>End Date</th><td>10-10-2030</td></tr><table>");
		pw.println("</Center>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
		
	}

}
