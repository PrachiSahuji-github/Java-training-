package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.citibank.domain.Employee;

public class LoginDetailsRepository {
	private String userName = "root";
	private String password = "Root123$";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String query;
	private int resultcount;
	private ResultSet resultSet;
	private int loginattemptcounter = 0;
	
	//connect database
	private Connection connection;
		//write-store and execute query
	private PreparedStatement preaparedStatement;
		

	public String loginDetailsValidate(String loginId, String pwd) {
		
		query = "select user_name from login_details where login_id = ? and password = ?";
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				preaparedStatement = connection.prepareStatement(query);
				preaparedStatement.setString(1, loginId);
				preaparedStatement.setString(2, pwd);
				
				resultSet = preaparedStatement.executeQuery();
				
				if (resultSet.next() && loginattemptcounter < 3 ) {
					loginattemptcounter = 0;
					String userName = resultSet.getString("User_name");
					return userName;				
				}
				else {
					loginattemptcounter++;
					if (loginattemptcounter == 3) {
						return "max";
					}
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				preaparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
}
