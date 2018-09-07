package com.cg.service;

import com.cg.bean.Account;

public class AccountService implements IAccountService{

	@Override
	public Account showBalance(Account account) {
		account.setBalance(56000);
		return account;
	}

}
