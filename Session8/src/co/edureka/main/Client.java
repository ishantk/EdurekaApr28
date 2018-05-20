package co.edureka.main;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import co.edureka.model.Student;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		s1.email = "john@example.com";
		s1.age = 30;
		s1.address = "Redwood Shores";
		
		try{
			// DOM API's
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();

			// generating tags
			Element rootElm = document.createElement("students");
			Element studentElm = document.createElement("student");
			Element rollElm = document.createElement("roll");
			Element nameElm = document.createElement("name");
			Element emailElm = document.createElement("email");
			Element ageElm = document.createElement("age");
			Element addressElm = document.createElement("address");
			
			// generating tags data
			Text txtRoll = document.createTextNode(String.valueOf(s1.roll));
			Text txtName = document.createTextNode(s1.name);
			Text txtEmail = document.createTextNode(s1.email);
			Text txtAge = document.createTextNode(String.valueOf(s1.age));
			Text txtAddress = document.createTextNode(s1.address);
			
			// Setting the data within tags
			rollElm.appendChild(txtRoll);
			nameElm.appendChild(txtName);
			emailElm.appendChild(txtEmail);
			ageElm.appendChild(txtAge);
			addressElm.appendChild(txtAddress);
			
			studentElm.appendChild(rollElm);
			studentElm.appendChild(nameElm);
			studentElm.appendChild(emailElm);
			studentElm.appendChild(ageElm);
			studentElm.appendChild(addressElm);
			
			rootElm.appendChild(studentElm);
			
			document.appendChild(rootElm);
			
			File file = new File("/Users/ishantkumar/Downloads/MyStudents.xml");
			FileOutputStream fos = new FileOutputStream(file);
			
			StreamResult result = new StreamResult(fos);
			
			DOMSource source = new DOMSource(document);
			
			// We need to transform DOMSource into StreamResult
			Transformer tranformer = TransformerFactory.newInstance().newTransformer();
			tranformer.transform(source, result);
			
			System.out.println(file.getName()+" Generated ....");
			

		}catch(Exception e ){
			System.out.println("Some Exception: "+e);
		}
	}

}
