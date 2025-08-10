<h1>JDBC API</h1><br>
<h2>Java Database Connectivity </h2><br>
JDBC is also known as java database connectivity it is an API (Application Programming Languges).
It present in java.sql package ,and used connect java application to the database by using JDBC Drivers.<br>
<h3>JDBC Key Components :</h3>
1.Driver -->it is an Class present in java.sql package<br>
2.DriverManager -->it is an class,present ij java.sql package<br>
3.Conncetion --> it is an interface ,present is java.sql package<br>
4.Statement -->it is an interface ,present in java.sql package<br>
5.PreparedStatement --> it is an interface , present in java.sql package<br>
6.ResultSet  -->it is an interface ,present in java.sql package<br>
<br>
<h3>JDBC Connectivity Steps :</h3>
1.firstly we need to add the Jar( Mysql Connector 8)<br>
2.Register and load the Driver Class using class.ForName("com.mysql.cj.jdbc.Driver");<br>
3.Get jdbc connection .<br>
4.create jdbc Statement through the sql queries(used Statement or PreparedStatement).<br>
5.execute the query and collect the result.<br>
6. close all connections.<br>
