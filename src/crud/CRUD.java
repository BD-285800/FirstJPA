package crud;

import java.math.BigDecimal;
import java.util.Date;

import model.Employee;

public class CRUD {
	private static String employeeId = "1912";
	public static void main(String[] args) {
		
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();
		Employee employee = createEmployee();
		BigDecimal id = employee.getEmployeeId();
		System.out.print(id);
		employeeCRUD.createEmployee(employee);
		employeeCRUD.readEmployee(id);
		employeeCRUD.updateSalary(id);
		employeeCRUD.deleteEmployee(id);
		
	}
	
	private static Employee createEmployee() {
		
		Employee emp = new Employee();
		emp.setFirstName("AAA");
		emp.setLastName("BBB");
		emp.setHireDate(new Date());
		emp.setEmployeeId(new BigDecimal(employeeId));
		emp.setSalary(new BigDecimal("123456.78"));
		emp.setEmail("olek@gmail.com");
		emp.setJobId("AD_PRES");
		return emp;
	}
}
