package co.edureka.model;

import java.util.List;

public class Person {

	String name;
	int age;
	
	Address address; // Has-A Relation | 1 to 1
	List<String> certificates; // Has-A Relation | 1 to *

	public Person(){
		
	}
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// Dependency : Resolved through Constructor
	public Person(Address address) {
		System.out.println("--Constructor Injection--");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	// Dependency : Resolved through Setter
	public void setAddress(Address address) {
		System.out.println("--Setter Injection--");
		this.address = address;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	// Dependency : Resolved through Setter
	public void setCertificates(List<String> certificates) {
		System.out.println("--Setter Injection for List--");
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}
