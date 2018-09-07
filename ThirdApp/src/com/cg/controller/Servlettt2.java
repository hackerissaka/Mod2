package com.cg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/Servlettt2","/fromServlettt1"})
public class Servlettt2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlettt2() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String r=request.getParameter("str");
		String newStr=r.toUpperCase();
		System.out.println(newStr);
		response.getWriter().print("<html><body>"
				+"<center><h4>From servlet 1<br/>"
				+"the result is:: "+newStr+"</h4></center>"
				+"</body></html>");
	}

}



