package com.cornejo.hibernate.show;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cornejo.hibernate.show.entity.Client;

public class QueryClientShow {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		// CReate session
		Session session =factory.getCurrentSession();
		
		try {
						
			// start a transaction
			session.beginTransaction();
			
			//---------------QUERIES-----------------------------
			
			// query clients
			List<Client> theClients = session.createQuery("from Client").getResultList();
			
			// display clients
			displayClients(theClients);
			
			// query clients: lastName='Cornejo'
			theClients = session.createQuery("from Client c where c.lastName='Cornejo'").getResultList();
			
			// display clients
			System.out.println("\n\nClients who have last name of Cornejo");
			displayClients(theClients);
			
			// query clients: lastName='Cornejo' OR firstName='Luis'
			theClients = session.createQuery("from Client c where"
					       + " c.lastName='Cornejo' OR c.firstName='Estrella'").getResultList();
			
			System.out.println("\n\nClients who have last name of Cornejo OR first name Luis");
			displayClients(theClients);
			
			// query client where email like 'marmel3@hotmail.com'
			theClients = session.createQuery("from Client c where c.email LIKE 'marmel3@hotmail.com'").getResultList();
			System.out.println("\n\nClients whose email ends with marmel3@hotmail.com");
			displayClients(theClients);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");

			
		}
		finally {
			factory.close();
		}
	}

	private static void displayClients(List<Client> theClients) {
		for (Client tempClient : theClients) {
			System.out.println(tempClient);
		}
	}

}
