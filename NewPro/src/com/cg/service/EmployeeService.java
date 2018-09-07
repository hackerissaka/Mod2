package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.EmployeeBean;

public class EmployeeService implements IEmployeeService {
public ArrayList<EmployeeBean> getAllEmps(){
	ArrayList<EmployeeBean> list=new ArrayList<>();
	list.add(new EmployeeBean(101, "e101", 678.9));
	list.add(new EmployeeBean(102, "e102", 433.9));
	list.add(new EmployeeBean(103, "e103", 667.9));
	return list;
	
}
}
