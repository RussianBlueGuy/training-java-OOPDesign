package assignment1.domain.dao;

import assignment1.database.DatabaseConnectionManager;
import assignment1.domain.Employee;

public class EmployeeDAO {
	
	private DatabaseConnectionManager connectionManager;
	
	public void saveEmployee(Employee employee) {
//		DatabaseConnectionManager connectionManager = DatabaseConnectionManager.get;
//		connectionManager.connect();
//		connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
//		connectionManager.disconnect();
		System.out.println("saved employee to the database: " + employee);
	}
	
	public void deleteEmployee(Employee employee) {
		System.out.println("deleted employee from the database: " + employee);
	}

}
