package crudEmployee_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


//CRUD operation Using Statement ,   Update -Modify existing records,
public class U_UpdateDataStatement {

	public static void main(String[] args) throws Exception{


		Class.forName("com.mysql.cj.jdbc.Driver");    //exception is class not found
		Connection c = DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");
		Statement s= c.createStatement();
		s.executeUpdate("update employee set name='sonali' where eid=1");
		System.out.println("Data is updated successfully..........");
		c.close();
		

	}

}
