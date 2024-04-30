package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("FisrstProject");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id: ");
		StudentDetails sd=manager.find(StudentDetails.class,sc.nextInt());
		
		if(sd!=null) {
			manager.remove(sd);
			System.out.println("deleted....");
		}
		else {
			System.out.println("invalid data....");
		}
	}
}
