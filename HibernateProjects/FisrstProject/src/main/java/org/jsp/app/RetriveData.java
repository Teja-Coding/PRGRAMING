package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetriveData {
	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("FisrstProject");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		StudentDetails sd=manager.find(StudentDetails.class, 1);
		
		if(sd!=null) {
			System.out.println("rollNo:"+sd.getRollno());
			System.out.println("student name:"+sd.getSname());
			System.out.println("student marks:"+sd.getMarks());
		}
		else {
			System.out.println("invalid student rollNo....");
		}
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
