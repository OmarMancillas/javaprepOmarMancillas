package com.enroutesystems;

import org.junit.jupiter.api.Test;
import lombok.extern.slf4j.Slf4j;
import java.sql.*;

@Slf4j
public class EjemplosJDBCTest {
	
	@Test
	public void test() {
		String connection ="jdbc:mysql://localhost:3306/employees";
		try {
			Connection con = DriverManager.getConnection(connection, "root", "root");
			
			Statement statement = con.createStatement();
			String queryStatement = "SELECT* FROM departments;";
			ResultSet resultStatement = statement.executeQuery(queryStatement);
			
			PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM employees WHERE emp_no = ?");
			preparedStatement.setInt(1, 10001);
			ResultSet resultPreparedStatement = preparedStatement.executeQuery();
			ResultSetMetaData resultSetMetaDataPreparedStatement = preparedStatement.getMetaData();

			log.info("------Result Statement------");
			while(resultStatement.next()) {
				log.info("Department number: {}, Department Name: {}.",resultStatement.getString("dept_no"), resultStatement.getString("dept_name"));
			}		
			
			System.out.println();
			log.info("------Result Prepared Statement------");
			while(resultPreparedStatement.next()) {
				log.info("Employee Number: {}, First Name: {}, Last Name: {}, Gender: {}.",resultPreparedStatement.getInt("emp_no"), resultPreparedStatement.getString("first_name"), resultPreparedStatement.getString("last_name"), resultPreparedStatement.getString("gender"));
			}
			
			System.out.println();
			log.info("------Prepared Statement MetaData------");
			log.info(resultSetMetaDataPreparedStatement.toString());
			
			resultPreparedStatement.close();
			resultStatement.close();
			statement.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
