package com.wm.oar.tool.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public static Connection getConnection(String dbName){

		Connection conn = null;
		 PreparedStatement preStatement = null;
	try{
		String url = "jdbc:oracle:thin:@sdc-t32-4-149:1521:wmomsd1"; 
	      
        //properties for creating connection to Oracle database
        Properties props = new Properties();
        props.setProperty("user", "customer");
        props.setProperty("password", "cusd1t");
      
        //creating connection to Oracle database using JDBC
        conn = DriverManager.getConnection(url,props);

      
	}catch(SQLException se){
	      se.printStackTrace();
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      try{
	         if(preStatement!=null)
	        	 preStatement.close();
	      }catch(SQLException se2){
	      } 
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      } 
	   }
        System.out.println("returning Connection");
        return conn;   
	}
}
