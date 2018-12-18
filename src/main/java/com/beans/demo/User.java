package com.beans.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private int id;
	private String name;
	
	private Employee emp;
	
	public User(int id, String name, Employee emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}

	public User(){
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void test(){
		System.out.println("je suis créer : un beans !!");
		System.out.println("id = "+id+" name : "+name);
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void init(){
		System.out.println("hi ..");
	}
	public void bye(){
		System.out.println("bye");
	}
	
	
}
