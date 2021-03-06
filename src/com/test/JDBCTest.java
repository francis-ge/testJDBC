package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCTest {
	
	@Test
	public void testDriver() throws Exception{
		
		//String sqlserverDriverStr = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String MysqlDriverStr = "com.mysql.jdbc.Driver";

		//String sqlserverUrl = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true;";
		String mysqlUrl = "jdbc:mysql://localhost/test1?useUnicode=true&characterEncoding=utf8";
		
		//String sqlserverUser = "sa";
		String mysqlUser = "root";
		
		//String sqlserverPassword = "sharpower1*";
		String mysqlPassword = "";
		
		Class.forName(MysqlDriverStr);
		Connection connection = DriverManager.getConnection( mysqlUrl, mysqlUser, mysqlPassword );
		
		Statement statment = connection.createStatement();
		
		statment.execute("INSERT INTO student(id, name, sex) VALUES(111,'经常','w' )");
		
		statment.close();
		
		connection.close();
				
	}
	
	@Test
	public void testUpdateBlob() throws ClassNotFoundException, IOException, SQLException{
		String sql = "INSERT INTO student VALUES(?,?,?,?)";
		InputStream pic = new FileInputStream("pic\\Penguins.jpg");
	
		JDBCTools.update(sql, 12, "22222", "w", pic);
				
	}

	@Test
	public void TestGetConnection() throws ClassNotFoundException, IOException, SQLException{
		Connection connection = JDBCTools.getConnection();
		System.out.println(connection);
		
	}
	
	@Test
	public void testTransaction() throws ClassNotFoundException, IOException, SQLException{
		Connection connection = null;
		Statement ps = null;
		
		try {
			connection = JDBCTools.getConnection();
			connection.setAutoCommit(false);
			
			String sql = "UPDATE student id = 3333 WHERE name = 22222";
			ps = connection.createStatement();
			ps.execute(sql);
			connection.commit();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCTools.releaseDB(null, ps, connection);
			
		}
		
		
		
	}
}
