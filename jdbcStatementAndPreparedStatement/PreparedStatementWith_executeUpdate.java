package jdbcStatementAndPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementWith_executeUpdate {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbcStatementAndPreparedStatement:mysql://localhost:3306/school","root","root");
		PreparedStatement ps=c.prepareStatement("insert into student(id,name,city)values(?,?,?)");
		ps.setInt(1, 42);
		ps.setString(2, "rani");
		ps.setString(3,"pune");
		System.out.println("data inserted successfully.....");
		ps.executeUpdate();
		c.close();
	}

}
