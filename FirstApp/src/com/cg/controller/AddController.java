package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.NumberBean;
import com.cg.service.AddServiceImpl;
import com.cg.service.IAddService;

@WebServlet(urlPatterns={"/AddController"},loadOnStartup=1)
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private IAddService service;
  
    public AddController() {
       service= new AddServiceImpl();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Integer num1= Integer.parseInt(request.getParameter("num1"));
		Integer num2= Integer.parseInt(request.getParameter("num2"));
		
		NumberBean numberBean = new NumberBean();
		numberBean.setNum1(num1);
		numberBean.setNum2(num2);
		
		int result=service.add(numberBean);
		
		response.setContentType("text/html");
		
		PrintWriter pr=response.getWriter();
		pr.print("<html>+"
				+ "<head><title>Add</title></head>"+
				"<body>Addition of num1 and num2 is "+result+"</body>"+
				"</html>");
	}

}
