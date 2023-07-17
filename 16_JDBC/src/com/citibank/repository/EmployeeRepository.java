package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.domain.Employee;
import com.mysql.cj.protocol.Resultset;

public class EmployeeRepository {
	private String userName = "root";
	private String password = "Root123$";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String query;
	private int resultcount;
	
	//connect database
	private Connection connection;
	//write-store and execute query
	private PreparedStatement preaparedStatement;
	private ResultSet resultSet;
	private Set<Employee> employeeSet = new HashSet<>();
	
	public boolean deleteEmpl(int empId) {
		query = "delete from employee_details where employee_id = ?";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				preaparedStatement = connection.prepareStatement(query);
				preaparedStatement.setInt(1, empId);
				
				resultcount = preaparedStatement.executeUpdate();
				if (resultcount > 0) 
					return true;			
				else 
					return false;	
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				preaparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}
	
	public boolean updateSalary(int empId, double newsalary) {
		query = "update employee_details set salary = ? where employee_id = ?";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				preaparedStatement = connection.prepareStatement(query);
				preaparedStatement.setDouble(1, newsalary);
				preaparedStatement.setInt(2, empId);
				
				resultcount = preaparedStatement.executeUpdate();
				if (resultcount > 0) 
					return true;			
				else 
					return false;	
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				preaparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}
	
	public Employee singleEmployee(int empID){
		
		query = "select * from employee_details where employee_id = ?";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				preaparedStatement = connection.prepareStatement(query);
				preaparedStatement.setInt(1, empID);
				resultSet = preaparedStatement.executeQuery();
				
				if (resultSet.next()) {
					int empId = resultSet.getInt("employee_id");
					String firstName = resultSet.getString("First_name");
					String lastName = resultSet.getString("Last_name");
					String email = resultSet.getString("email");
					double salary = resultSet.getDouble("salary");
					
					Employee employee = new Employee(empId, firstName, lastName, email, salary);
					return employee;				
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				connection.close();
				preaparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		}	
		return null;
	    
	}
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();
		query = "select * from employee_details";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				preaparedStatement = connection.prepareStatement(query);
				resultSet = preaparedStatement.executeQuery();
				
				while (resultSet.next()) {
					int employeeId = resultSet.getInt("employee_id");
					String firstName = resultSet.getString("First_name");
					String lastName = resultSet.getString("Last_name");
					String email = resultSet.getString("email");
					double salary = resultSet.getDouble("salary");
					
					Employee employee = new Employee(employeeId, firstName, lastName, email, salary);
					employeeList.add(employee);
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				connection.close();
				preaparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		}	
		return employeeList;
		
	}
	
	public boolean addNewEmployee(Employee employee) {
		query = "insert into employee_details value(?,?,?,?,?)";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				preaparedStatement = connection.prepareStatement(query);
				preaparedStatement.setInt(1, employee.getEmployeeID());
				preaparedStatement.setString(2, employee.getFirstName());
				preaparedStatement.setString(3, employee.getLastName());
				preaparedStatement.setString(4, employee.getEmail());
				preaparedStatement.setDouble(5, employee.getSalary());
				
				resultcount = preaparedStatement.executeUpdate();
				if (resultcount > 0) 
					return true;			
				else 
					return false;	
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				preaparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}
	
	
}
