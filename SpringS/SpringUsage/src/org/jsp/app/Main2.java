package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		
		Student s1=(Student)context.getBean("stud1");
		System.out.println(s1);
		
		Student s2=(Student)context.getBean("student2");
		System.out.println(s2);
	}

}
