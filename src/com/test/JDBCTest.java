package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class JDBCTest {
	
	@Test
	public void testDriver() throws Exception{
		
		String sqlserverDriverStr = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String MysqlDriverStr = "com.mysql.jdbc.Driver";

		String sqlserverUrl = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true;";
		String mysqlUrl = "jdbc:mysql://localhost/test1?useUnicode=true&characterEncoding=utf8";
		
		String sqlserverUser = "sa";
		String mysqlUser = "root";
		
		String sqlserverPassword = "sharpower1*";
		String mysqlPassword = "";
		
		Class.forName(MysqlDriverStr);
		Connection connection = DriverManager.getConnection( mysqlUrl, mysqlUser, mysqlPassword );
		
		Statement statment = connection.createStatement();
		
		statment.execute("INSERT INTO student(id, name, sex) VALUES(111,'经常','w' )");
		
		statment.close();
		
		connection.close();
				
	}

}
