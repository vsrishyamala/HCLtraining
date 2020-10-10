package org.hcl.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter pw= response.getWriter();
			String name= request.getParameter("uname");
			String num=request.getParameter("pno");
			String email=request.getParameter("email");
			String city= request.getParameter("city");
			pw.println("<h1> Details of user</h1>");
			pw.println("<table border=1> <tr><th>Name</th><td>"+name+"</td></tr><tr><th>Phone Number</th><td>"+num+"</td></tr><tr><th>Email</th><td>"+email+"</td></tr><tr><th>City</th><td>"+city+"</td></tr></table>");
			pw.close();
			
			
			
		
	}

}
