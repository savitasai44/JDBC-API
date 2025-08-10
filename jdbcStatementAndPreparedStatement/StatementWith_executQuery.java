//Statement interface using executeQuery method return type is resultSet and performed the DQL sql statement
//fetch data in Eclipse ..using the resultset interface and while loop  this method is next() and SYso msg get ..

package jdbcStatementAndPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementWith_executQuery {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/school","root","root");
	    Statement s= c.createStatement();
	    ResultSet rs=s.executeQuery("select * from student ");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    }
	    c.close();		
	}

}
