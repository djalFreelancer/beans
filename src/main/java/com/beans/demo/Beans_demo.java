package com.beans.demo;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beans_demo {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beans/config/bean.xml");
		User user = (User) ac.getBean("user");
		user.test();
		System.out.println(user.getEmp().toString()+"");
		
		((ClassPathXmlApplicationContext)ac).close();
	}

}
