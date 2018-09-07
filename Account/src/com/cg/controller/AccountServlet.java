package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Account;
import com.cg.service.AccountService;
import com.cg.service.IAccountService;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private IAccountService service;
    
    public AccountServlet() {
       service= new AccountService();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servlet 1");
		Account account=new Account();
		
		String name= request.getParameter("name");
		Integer accountNo= Integer.parseInt(request.getParameter("accountNo"));
		
		account.setName(name);
		account.setAccountNo(accountNo);
		
		Account acc=service.showBalance(account);
		request.setAttribute("val", acc);
		RequestDispatcher dispatcher= request.getRequestDispatcher("AccountServlet2");
		dispatcher.include(request, response);
		

		Account result=(Account)request.getAttribute("result");
		System.out.println("in servlet1 about to send response Result "+result);
		response.getWriter().print("<html><head><title>Insert title here</title></head>"
		                          +"<body><center>Account details:<br/>"+result.toString()
	                          	+"</center></body></html>");
		
		
	}

}
