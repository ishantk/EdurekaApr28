package co.edureka.model;

import java.util.List;

public class Manager {

	Integer mid;
	String name;
	String email;
	
	List<Certificate> cList; // HAS-A Relation  |  1 - *

	public Manager(){
		
	}
	
	public Manager(Integer mid, String name, String email, List<Certificate> cList) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.cList = cList;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Certificate> getcList() {
		return cList;
	}

	public void setcList(List<Certificate> cList) {
		this.cList = cList;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + ", cList=" + cList + "]";
	}
	
}
