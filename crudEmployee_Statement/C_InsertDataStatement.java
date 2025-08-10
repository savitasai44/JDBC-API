package crudEmployee_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
  
//CRUD operation Using Statement ,    Create -Insert new Records...
public class C_InsertDataStatement {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");   //Occurs exception is class not found        //load driver
    	Connection c=DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");//getConnection
		Statement s=c.createStatement();     //create statement
		s.executeUpdate("insert into employee(eid,name,salary,city)values(2,'komal','30000','kelgaon')");   //create
		System.out.println("Data is inserted successfully...........");
		c.close();
	}

}
