package crudEmployee_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//Update data using the preparedStatement and executeUpdate method
public class U_UpdateDataPreparedStatement {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");
		PreparedStatement ps=c.prepareStatement("update employee set name=? where eid=?");
		ps.setString(1,"ovi");
		ps.setInt(2,2);
		ps.executeUpdate();
		System.out.println("Data is updated ......");
		c.close();
		
	}

}
