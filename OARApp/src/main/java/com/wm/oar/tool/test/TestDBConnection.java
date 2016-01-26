package com.wm.oar.tool.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestDBConnection {

	public static void main(String[] args) {
		
		testConnection();	
	}
	
	private static void testConnection(){
		Connection conn = null;
		 PreparedStatement preStatement = null;
		System.out.println("Testing successful...");
	try{
		String url = "jdbc:oracle:thin:@sdc-t32-4-149:1521:wmomsd1"; 
	      
        //properties for creating connection to Oracle database
        Properties props = new Properties();
        props.setProperty("user", "customer");
        props.setProperty("password", "cusd1t");
      
        //creating connection to Oracle database using JDBC
        conn = DriverManager.getConnection(url,props);

        String sql ="select sysdate as current_day from dual";

        //creating PreparedStatement object to execute query
        preStatement = conn.prepareStatement(sql);
    
        ResultSet result = preStatement.executeQuery();
      
        while(result.next()){
            System.out.println("Current Date from Oracle : " +         result.getString("current_day"));
        }
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
	      }//end finally try
	   }//end try
	
        System.out.println("done");
      
    }



}
