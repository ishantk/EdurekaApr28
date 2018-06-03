package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Address;
import co.edureka.model.CB;
import co.edureka.model.Father;
import co.edureka.model.Person;
import co.edureka.model.Son;
import co.edureka.model.Student;

public class Application {

	public static void main(String[] args) {
		
		// Object Construction
		Student s1 = new Student(101,"John",30,"john@example.com","Redwood Shores");
		
		Student s2 = new Student();
		s2.setRoll(102);
		s2.setName("Jennie");
		s2.setAge(32);
		s2.setEmail("jennie@example.com");
		s2.setAddress("Country Homes");
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		// Spring FW | Core Layer
		// Inversion Of Control : You Do not create Objects, Objects will be created automatically by the system(IOC Container).
		//						  You will have reference to the constructed object. 
		//						  Life Cycle of the object is also managed by the system(IOC Container)
		
		// IOC Container : It will look for construction and destruction of objects for us.
		// 				   We configure the data for an object in an XML File and IOC Container parses the same for objects.
		
		// IOC Container : BeanFactory
		// 1. Link the Spring Core Jars
		// 2. Configure the data for Object in an XML File
		// 3. In Client class with main method, use BeanFactory API
		
		//Resource resource = new ClassPathResource("context.xml");
		//BeanFactory factory = new XmlBeanFactory(resource); // Parse the XML File
		
		// BeanFactory is constructing objects using default constructor and setter methods
		// Requesting the access for the reference of the object constructed by Spring FW
		//Student sRef = (Student)factory.getBean("s3");
		//Student sRef = factory.getBean("s3",Student.class);
		//System.out.println("Student Details: "+sRef);
		
		// IOC Container : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		//Student sRef = (Student)context.getBean("s3");
		//Student sRef1 = context.getBean("s3",Student.class);
		//Student sRef2 = context.getBean("s3",Student.class);
		
		//System.out.println("sRef1: "+sRef1);
		//System.out.println("sRef2: "+sRef2);
		
		// Close the ApplicationContext
		//ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		//cxt.close();

		/*Father f = context.getBean("fRef",Father.class);
		Son s = context.getBean("sRef",Son.class);
		
		System.out.println(f);
		System.out.println(s);*/
		
		/*Person pRef = new Person();
		
		Address aRef = new Address();
		pRef.setAddress(aRef);
		
		Person pRef1 = new Person(aRef);*/
		
		/*Person p = context.getBean("pRef",Person.class);
		System.out.println(p);
		System.out.println("Certificates: "+p.getCertificates());*/
		
		CB cRef = context.getBean("cb",CB.class);
		cRef.getCa().sayHello("Mike Watson");
	}

}
