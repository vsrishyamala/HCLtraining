package org.hcl.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		String ename=request.getParameter("ename");
		String hname=request.getParameter("hname");
		String type=request.getParameter("type");
		String detail=request.getParameter("details");
		String owner=request.getParameter("owner");
		String start=request.getParameter("start");
		String end=request.getParameter("end");
		int i=0;
		String data=" ";
		if(ename.equals(" "))
		{
			data+="Event name must not be empty";
			
						
		}
		if(hname.equals(" "))
		{
			data+="Hall Name name must not be empty";
	
		}
		if(type.equals(" "))
		{
			data+="Event type must not be empty";
		
						
		}
		if(detail.equals(" "))
		{
			data+="Event type must not be empty";
			
						
		}
		if(owner.equals(" "))
		{
			data+="Event type must not be empty";
			
						
		}
		if(start.equals(" "))
		{
			data+="Event type must not be empty";
								
		}
		if(end.equals(" "))
		{
			data+="Event type must not be empty";
				
		}


	}

}
