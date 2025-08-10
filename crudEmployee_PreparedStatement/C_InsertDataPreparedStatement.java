package crudEmployee_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C_InsertDataPreparedStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");   //exception is class not found
		Connection c =DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");  //sql exception
        PreparedStatement ps=c.prepareStatement("insert into employee(eid,name,salary,city)values(?,?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "sai");
        ps.setString(3, "40000");
        ps.setString(4, "pune");
        System.out.println("Data is inserted....");
        ps.executeUpdate();
        c.close();
        
	}

}
