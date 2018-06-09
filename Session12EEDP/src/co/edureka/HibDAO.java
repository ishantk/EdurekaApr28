package co.edureka;

import java.util.ArrayList;

public interface HibDAO {

	void addEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	void updateEmployee(Employee emp);
	ArrayList<Employee> retrieveEmoloyees();
	
}
