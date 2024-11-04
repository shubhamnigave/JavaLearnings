package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.register.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO employee"
				+ "id,first_Name,last_Name,username,email,password,address,contact)values" + "(?,?,?,?,?,?,?,?);";
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false",
				"root", "shubham");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getEmail());
			preparedStatement.setString(6, employee.getPassword());
			preparedStatement.setString(7, employee.getAddress());
			preparedStatement.setString(3, employee.getContact());
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
