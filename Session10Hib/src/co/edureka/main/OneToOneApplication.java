package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApplication {

	public static void main(String[] args) {
		
		
		Person person = new Person();
		person.setName("George");
		person.setAge(30);
		person.setEmail("george@example.com");
		
		
		Address address = new Address();
		address.setAdrsLine("Country Homes");
		address.setCity("Benagluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		
		person.setAddress(address);
		address.setPerson(person);
		
		
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating Connection with DB
			
			transaction = session.beginTransaction();
			
			session.save(person);
			
			transaction.commit();
			
			System.out.println("--Transaction Finished--");
			
		} catch (Exception e) {
			
			System.out.println("Some Exception: "+e);
			
			transaction.rollback();
			
		}finally{
			
			if(session!=null){
				session.close();
			}
			
			if(factory!=null){
				factory.close();
			}

		}		


	}

}
