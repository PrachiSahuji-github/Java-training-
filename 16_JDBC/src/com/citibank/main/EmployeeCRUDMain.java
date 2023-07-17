package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;
import com.citibank.repository.EmployeeRepository;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee = null;
		int choice;
		int employeeId;
		String firstName;
		String lastName;
		String email;
		String continueChoice;
		double salary;
		
		
		do {
		System.out.println("Menu");
		System.out.println("1. Add New Employee");
		System.out.println("2. Update Salary of existing Employee");
		System.out.println("3. Display Single Employee Details");
		System.out.println("4. Display All Employees");
		System.out.println("5. Delete single Employee");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1 :
			System.out.println("Enter Employee ID");
			employeeId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Employee First Name");
			firstName = scanner.next();
			System.out.println("Enter Employee Last Name");
			lastName = scanner.next();
			System.out.println("Enter Employee Email");
			email = scanner.next();
			System.out.println("Enter Employee Salary");
			salary = scanner.nextDouble();
			
			
			employee = new Employee(employeeId, firstName, lastName, email, salary);
			boolean result = employeeRepository.addNewEmployee(employee);
			if (result)
				System.out.println("Employee Added Successfully");
			else
				System.out.println("Failed to add Employee");
		
			//System.out.println("Hashcode of Emp object: " +employee.hashCode());
			
			break;
			
		case 2:
			System.out.println("Update salary of given employee");
			System.out.println("Enter Employee ID");
			employeeId = scanner.nextInt();
			System.out.println("Enter Employee updated Salary");
			salary = scanner.nextDouble();
			boolean result1 = employeeRepository.updateSalary(employeeId, salary);
			if (result1 == true) {
				System.out.println("Salary is updated");
			}else {
				System.out.println("Salary is not updated");
			}
			//System.out.println(employee);
			break;
			
		case 3 :
			System.out.println("Display Employe details of entered emp ID");
			System.out.println("Enter Employee ID");
			employeeId = scanner.nextInt();
			//employee = new Employee(employeeId, name, salary);
			employee = employeeRepository.singleEmployee(employeeId);
			System.out.println(employee);
			
			break;			
		case 4 :
			System.out.println("Display All Employee details :");
			//employee = new Employee(employeeId, name, salary);
			//System.out.println(employeeRepository.getAllEmployee());
			for (Employee e : employeeRepository.getAllEmployee()) {
				System.out.println(e);
			}
			
			break;
		case 5 :
			System.out.println("Delete Employee details of given emp ID :");
			System.out.println("Enter Employee ID");
			employeeId = scanner.nextInt();
			//employee = new Employee(employeeId, name, salary);
			employeeRepository.deleteEmpl(employeeId);
			System.out.println("Employee Deleted");		
			break;
			
		default :
			System.out.println("Invalid choice!");
			break;
		
		}
		
		System.out.println("Do you want to continue?");
		continueChoice = scanner.next();
	}while (continueChoice.equalsIgnoreCase("Yes"));
		System.out.println("Thank you!!");
		

	}

}
