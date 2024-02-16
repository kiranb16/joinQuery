package com.codemind.dto;

public class EmployeeRequest2 {

	private double emp_salary;
	private String emp_name;
	private String city;
	
	public EmployeeRequest2() {
	
	}

	

	public EmployeeRequest2(double emp_salary, String emp_name, String city) {
		super();
		this.emp_salary = emp_salary;
		this.emp_name = emp_name;
		this.city = city;
	}



	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmployeeRequest2 [emp_salary=" + emp_salary + ", emp_name=" + emp_name + ", city=" + city + "]";
	}
	
	
}
