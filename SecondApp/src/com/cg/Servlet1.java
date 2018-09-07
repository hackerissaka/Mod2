package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet1() {
    }
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		
		Integer num = Integer.parseInt(request.getParameter("num"));
		System.out.println("in servlet1 num1:: "+num);
		Integer newNum=num+5;
		
		request.setAttribute("val", newNum);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("fromServlet1");
		dispatcher.include(request, response);
				
		Integer result=(Integer)request.getAttribute("result");
		
		System.out.println("in servlet1 about to send response Result "+result);
		response.getWriter().print("<html><body>"+
		                           "<center><h4>"+
	                            	"Hi,this is response from servlet1 <br/>"+
			                      	"the result is:: "+result+
		                    		"</h4></center>"+
		                    		"</body></html>");
	}

}
