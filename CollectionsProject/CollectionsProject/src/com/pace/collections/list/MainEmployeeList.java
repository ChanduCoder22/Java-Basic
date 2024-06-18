package com.pace.collections.list;
import java.util.ArrayList;
public class MainEmployeeList {

	public static void main(String[] args) {
		Employee kumar = new Employee(1254,"Kumar",10254.25f);
		Employee ram = new Employee(1568,"Ram",75454.25f);
 		Employee anthony = new Employee(1914,"Anthony",36524.25f);
	
		ArrayList<Employee> empList = new ArrayList<Employee>();
		// add employee objects
		empList.add(kumar);
		empList.add(ram);
		empList.add(anthony);
		for(Employee emp : empList) {
			System.out.println( emp.getId() );
			System.out.println( emp.getName() );
			System.out.println( emp.getSalary() );
		}
	
	
	}

}
