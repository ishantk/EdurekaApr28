package co.edureka.model;

public class Student {
	
	int roll;
	String name;
	int age;
	String email;
	String address;
	
	public Student(){
		System.out.println("Student Object Constructed in Default Way");
	}
	
	public Student(int roll, String name, int age, String email, String address) {
		System.out.println("Student Object Constructed using Arguments");
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		System.out.println("Roll Set..");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// User Defined
	public void myInit(){
		System.out.println("==myInit==");
	}
	
	public void myDestroy(){
		System.out.println("==myDestroy==");
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]\n"+super.toString();
	}
	
}
