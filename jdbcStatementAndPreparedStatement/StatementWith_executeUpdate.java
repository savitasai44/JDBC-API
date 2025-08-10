package jdbcStatementAndPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementWith_executeUpdate {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/school","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("insert into student(id,name,city)values(41,'komal','latur')");
		c.close();
	}
}
