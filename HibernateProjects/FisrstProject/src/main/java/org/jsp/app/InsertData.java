package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertData {
public static void main(String[] args) {
	//jpa template
	//establish connection
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("FisrstProject");
	
	//create platfrom
	
	EntityManager manager=factory.createEntityManager();
	
	//start operation
	
	manager.getTransaction().begin();
	
	//insertOperation
	
	StudentDetails sd=new StudentDetails();
	
	sd.setRollno(2);
	sd.setSname("teja");
	sd.setMarks(55);
	
	manager.persist(sd);
	
	System.out.println("inserted seccusfully");
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();
	
}
}
