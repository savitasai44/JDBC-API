package crudEmployee_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class D_DeleteDataPreparedStatemet {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");
		PreparedStatement ps= c.prepareStatement("delete from employee where eid=?");
		ps.setInt(1,1);
		ps.executeUpdate();
		System.out.println("data is deleted.............");
		c.close();
	}

}
