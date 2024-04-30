package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertRuntimeValues {
	public static void main(String[] args) {
		 EntityManagerFactory factory =Persistence.createEntityManagerFactory("FisrstProject");
		 
		 EntityManager manager = factory.createEntityManager();
		 
		 manager.getTransaction().begin();
		 
		 //insert operation
		 
		 StudentDetails sd=new StudentDetails();
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter rollNo: ");
		 sd.setRollno(sc.nextInt());
		 
		 System.out.println("enter the name");
		 sd.setSname(sc.next());
		 
		 System.out.println("enter the marks: ");
		 sd.setMarks(sc.nextDouble());
		 
		 manager.persist(sd);
		 
		 System.out.println("record inserted succesfully");
		 
		 manager.getTransaction().commit();
		 
		 manager.close();
		 factory.close();
		 
	}
}
