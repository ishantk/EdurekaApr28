package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.CA;
import co.edureka.model.CB;
import co.edureka.model.CC;

public class InheritanceApplication {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.setA(10);
		
		CB cb = new CB();
		cb.setA(100);
		cb.setB(200);
		
		CC cc = new CC();
		cc.setA(1000);
		cc.setB(2000);
		cc.setC(3000);
		
		
		
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
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
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
