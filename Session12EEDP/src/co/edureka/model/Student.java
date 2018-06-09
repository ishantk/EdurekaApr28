package co.edureka.model;

public class Student {

	public int roll;
	public String name;
	public int age;
	public String address;
	
	public Student(){
		
	}
	public Student(int roll, String name, int age, String address) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
