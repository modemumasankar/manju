package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class uma 
{
public static void main(String[] args)throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hii","root","8102@uma");
	Statement stmt=con.createStatement();
	 String sql="create table somu(age int,name varchar(50),city varchar(50))";
	  //String sql="insert into somu values(1,'ram','mpl'),(2,'setu','bg1')";
	  //String sql="update app set name='ravana'where id=1";
	  //String sql="delete from somu where id=1";
	 /*
	  stmt.exceut(sql1);
	   con.close();
	  */
	  String sql1="selet*from somu";
	   ResultSet rs = stmt.executeQuery(sql1);
	  while (rs.next())
	  {
		  System.out.println("id: "+rs.getInt(1)+"name: "+rs.getString(2)+"city: "+rs.getString(3));
	  }
	  System.out.println("done");
	}
}
