package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import co.edureka.model.Student;

public class AnnotationApplication {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Leo");
		s1.setAge(12);
		
		Student s2 = new Student(null, "Kia", 14);
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Reads hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating Connection with DB
			
			transaction = session.beginTransaction();
			
			//session.save(s1);
			//session.save(s2);
			
			
			for(int i=1;i<=100;i++){
				Student s = new Student(null,"Student"+i,i);
				session.save(s);
			}
			
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
