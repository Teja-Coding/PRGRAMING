package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateSalary {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("FisrstProject");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno:");
		StudentDetails sd= manager.find(StudentDetails.class, sc.nextInt());
		sd.setMarks(65);
		
		if(sd!=null) {
			//update salary
			System.out.println("enter marks");
			sd.setMarks(sc.nextDouble());
			System.out.println("updated successfully");
		
		}
		else {
			System.out.println("invalid data from table");
		}
	}
}
