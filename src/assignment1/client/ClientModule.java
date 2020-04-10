package assignment1.client;

import assignment1.domain.Employee;
import assignment1.domain.dao.EmployeeDAO;
import assignment1.reporting.EmployeeReportFormatter;
import assignment1.reporting.FormatType;

public class ClientModule {
	
	public static void main(String args[]) {
		Employee peggy = new Employee(1, "Peggy", "Accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);
	}
	
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}

}
