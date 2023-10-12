package com.jdbcConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcConnProgram {
	
	public static void main(String[] args) {
		
		try {
			//step1 load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step2 establish the connection
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
			//step3 create statement
			java.sql.Statement statement=connection.createStatement();
			
			//step4 execute query
			ResultSet rSet=statement.executeQuery("select * from emp");
			
			while(rSet.next()){
				System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+" "+rSet.getString(3)+" "+rSet.getInt(4)+""+rSet.getInt(5));
			}
			
			//step5 close the conn
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
