package com.cg.bean;

public class Account {
private String name;
private int accountNo;
private int Balance;
@Override
public String toString() {
	return "Account [name=" + name + ", accountNo=" + accountNo + ", Balance="
			+ Balance + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public int getBalance() {
	return Balance;
}
public void setBalance(int balance) {
	Balance = balance;
}


}
