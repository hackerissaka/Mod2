package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlettt1")
public class Servlettt1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlettt1() {   
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Servlet1 Started");
		String s1=request.getParameter("str1");
		String s2=request.getParameter("str2");
		String s3=s1.concat(s2);
		
		
		//RequestDispatcher dispatcher=request.getRequestDispatcher("fromServlettt1");
		
		response.sendRedirect("Servlettt2?str="+s3);
		//String res=(String) request.getAttribute("result");
		
		/*response.getWriter().print("<html><body>"+
		"<center><h4>"+"From servlet1 the result is<br/>"+
				"the result is::"+res+"</h4></center>"
				+"</body></html>");*/
		
		
		
	}

}
