package crudEmployee_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//CRUD operation Using Statement  , Read -Fetch all records.       executeQuery method to fetch data using statement. 
public class R_FetchAllRecords {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/jdbcconnection","root","root");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from employee");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		
	}

}
