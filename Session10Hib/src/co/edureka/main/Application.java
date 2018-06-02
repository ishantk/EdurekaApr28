package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

/*
  	Hibernate Procedure
  	Pre Req : Link Hibernate Jar Files...
	1. Create a Java Class for Business Object which will contain data
	2. Create a Java Class with main method
	3. Copy hibernate.cfg.xml file and edit it -> src directory
	4. Copy anyname.hbm.xml (employee.hbm.xml in our case) file and map Business Object to the Table -> src directory
	5. Write Hibernate API's to perform CRUD Operations in main method
	
 */

public class Application {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.setName("Fionna");
		emp1.setEmail("fionna@example.com");
		emp1.setAge(36);
		emp1.setAddress("Redwood Shores");
		
		Employee emp2 = new Employee(null,"Mike","mike@example.com",22,"Country Homes");
		
		System.out.println(emp1); // emp1.toString()
		System.out.println(emp2);*/
		
		// Data is available in Objects, and is temporary
		// We shall persist the data using Hibernate API's
		
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
			
			// Inserting data in Table
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve data from table - Single Record
			//Employee eRef = (Employee)session.get(Employee.class, 2);
			//System.out.println(eRef);

			// Update data 
			//eRef.setName("Jennie JJ");
			//eRef.setAge(36);
			
			//session.update(eRef);
			
			// Delete data
			//Employee eRef = new Employee();
			//eRef.setEid(2);
			//session.delete(eRef);
			
			// Retrieve All Records
			// 1. HQL -> Hibernate Query Language
			//String hql = "From Employee";
			//String hql = "From Employee where age > 33";
			//List<Employee> empList = session.createQuery(hql).list();
			
			
			//2. Criteria -> API (No HQL Required)
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("age", 28));
			List<Employee> empList = criteria.list();
		
			for(Employee e : empList){
				System.out.println(e);
				System.out.println("============================================================");
			}*/
			
			// 1st Level Cache
			/*Employee e1 = (Employee) session.get(Employee.class, 1);
			Employee e2 = (Employee) session.get(Employee.class, 3);
			Employee e3 = (Employee) session.get(Employee.class, 1);
			Employee e4 = (Employee) session.get(Employee.class, 1);
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e4);*/
			
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
