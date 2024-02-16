package com.codemind.dto;

public class EmployeeRequest {
  private String emp_name;
  private String road;
public EmployeeRequest() {
	//super();
}
public EmployeeRequest(String emp_name, String road) {
	super();
	this.emp_name = emp_name;
	this.road = road;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getRoad() {
	return road;
}
public void setRoad(String road) {
	this.road = road;
}
@Override
public String toString() {
	return "EmployeeRequest [emp_name=" + emp_name + ", road=" + road + "]";
}
  
}
