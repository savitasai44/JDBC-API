package crudEmployee_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//CRUD operation Using Statement ,  Delete -Remove records 
public class D_DeleteDateStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver"); //exception class not found
		Connection c =DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("delete from employee where eid=3");
		System.out.println("Data deleted ........");
		c.close();
		
	}

}
