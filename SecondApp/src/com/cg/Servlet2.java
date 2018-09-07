package com.cg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/Servlet2", "/fromServlet1" })
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servlet2() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hi from servlet2");
		Integer valfromServlet1=(Integer)request.getAttribute("val");
		Integer result=valfromServlet1*valfromServlet1;
		
		request.setAttribute("result", result);		
		System.out.println("Bye from servlet2");
	}

}
