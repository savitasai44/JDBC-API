<h1>JDBC API</h1><br>
<h4>Java Database Connectivity </h4><br><br>
JDBC is also known as java database connectivity it is an API (Application Programming Languges).
It present in java.sql package ,and used connect java application to the database by using JDBC Drivers.<br>
<h3>JDBC Key Components :</h3>
1.Driver -->it is an Class present in java.sql package
2.DriverManager -->it is an class,present ij java.sql package
3.Conncetion --> it is an interface ,present is java.sql package
4.Statement -->it is an interface ,present in java.sql package
5.PreparedStatement --> it is an interface , present in java.sql package
6.ResultSet  -->it is an interface ,present in java.sql package
<br>
<h3>JDBC Connectivity Steps :</h3>
1.firstly we need to add the Jar( Mysql Connector 8)
2.Register and load the Driver Class using class.ForName("com.mysql.cj.jdbc.Driver");
3.Get jdbc connection .
4.create jdbc Statement through the sql queries(used Statement or PreparedStatement).
5.execute the query and collect the result.
6. close all connections.
