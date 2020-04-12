package com.cornejo.hibernate.show;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cornejo.hibernate.show.entity.Client;

public class CreateClientShow {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		// CReate session
		Session session =factory.getCurrentSession();
		
		try {
			// --------- use the session object to save Java Object ---------
			
			// create a student object
			System.out.println("Creating new Client object...");
			Client tempClient1 = new Client("Luis","Cornejo","luisitocornejo3@hotmail.com");
			Client tempClient2 = new Client("Mary","Melendez","marmel3@hotmail.com");
			Client tempClient3 = new Client("Estrella","Olivera","eob385@hotmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the Client");
			session.save(tempClient1);
			session.save(tempClient2);
			session.save(tempClient3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");

			
		}
		finally {
			factory.close();
		}
	}

}
