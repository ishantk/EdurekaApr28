package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyApplication {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate(null, "CCNA");
		Certificate c2 = new Certificate(null, "OCJP");
		Certificate c3 = new Certificate(null, "AWS");
		
		List<Certificate> cList1 = new ArrayList<>();
		cList1.add(c1); // 0
		cList1.add(c2); // 1
		cList1.add(c3); // 2
		
		List<Certificate> cList2 = new ArrayList<>();
		cList2.add(c1); // 0 
		cList2.add(c2); // 1
		
		Manager mgr1 = new Manager();
		mgr1.setName("John");
		mgr1.setEmail("john@example.com");
		mgr1.setcList(cList1);
		
		Manager mgr2 = new Manager();
		mgr2.setName("Jennie");
		mgr2.setEmail("jennie@example.com");
		mgr2.setcList(cList2);
		
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
			
			//session.save(mgr1);
			//session.save(mgr2);
			
			Manager mgr = (Manager)session.get(Manager.class, 2);
			
			System.out.println(mgr);
			
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
