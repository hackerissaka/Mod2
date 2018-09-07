package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Account;
import com.cg.service.AccountService;
import com.cg.service.IAccountService;


@WebServlet("/AccountServlet2")
public class AccountServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IAccountService service;
   
    public AccountServlet2() {
    	service= new AccountService();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is Servlet2");
	
		Account account=(Account) request.getAttribute("val");
		
		
		Integer newBalance=account.getBalance()+500;
		account.setBalance(newBalance);
		request.setAttribute("result", account);	
		
		
		System.out.println("Bye from servlet2");
	}

}
