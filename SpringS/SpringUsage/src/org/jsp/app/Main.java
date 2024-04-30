package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
	
	ApplicationContext context =new ClassPathXmlApplicationContext("sample.xml");
	Employee employee1=(Employee)context.getBean("emp");
	
	
	System.out.println("empId=" + employee1.getEmpId());
	System.out.println("empName="+employee1.getName());
	
	Employee employee2 =(Employee) context.getBean("emp2");
	System.out.println(employee2);
	System.out.println("empId="+ employee2.getEmpId());
	System.out.println("empName="+employee2.getName());
	System.out.println("empSalary="+employee2.getSalary());
	
	Employee employee3=(Employee) context.getBean("emp3");
	System.out.println(employee3);
	
	System.out.println("empId="+ employee3.getEmpId());
	System.out.println("empName="+employee3.getName());
	System.out.println("empSalary="+employee3.getSalary());

  }
}
