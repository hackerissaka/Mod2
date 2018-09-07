package com.cg.bean;

public class EmployeeBean {
private int eid;
private String ename;
private double sal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public EmployeeBean(int eid, String ename, double sal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
}
@Override
public String toString() {
	return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", sal=" + sal
			+ "]";
}
	

}
