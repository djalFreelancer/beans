package com.beans.demo;

import java.util.List;

public class Employee {

	private int emp_id;
	private String emp_name;
	
	private List<String> all_employer;
	
	public Employee(){
		
	}
	
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<String> getAll_employer() {
		return all_employer;
	}

	public void setAll_employer(List<String> all_employer) {
		this.all_employer = all_employer;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name
				+ ", all_employer=" + all_employer + "]";
	}
	
	
	
}
