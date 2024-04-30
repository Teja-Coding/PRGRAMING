package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTemplate {
	
	public static void main(String[] args) {
		
	
     //jpa template
	// establish connection by using program
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("FisrstProject");
	System.out.println("connection established.....");
	
	//to carry state of an object make use of platform
	
	EntityManager manager = factory.createEntityManager();
	System.out.println("platform created...");
	
	//start transaction
	
	manager.getTransaction().begin();
	//perform crud operation
	//sava transtions
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();
	
	System.out.println("jpa tamplated completed");
	
	}
	
}
