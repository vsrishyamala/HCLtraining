package org.hcl.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		String name= request.getParameter("uname");
		String num=request.getParameter("pno");
		String email=request.getParameter("email");
		String city= request.getParameter("city");
		if(name.equals("") || num.equals("") || email.equals(" ") ||city.equals(" "))
		{
			
			pw.println("Plz enter all details");
			RequestDispatcher rd= request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("/display");
			rd.forward(request, response);
						
		}
		

	}

}
