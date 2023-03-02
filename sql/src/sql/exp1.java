package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exp1 
{
public static void main(String[] args)throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hii1","root","8102@uma");
	Statement stmt=con.createStatement();
	
    String sql="create table app(age int,name varchar(40),city varchar(50))";
    String sql1="insert into app values(45,'ram','mpl'),55,'setu','bg1'),(76,'lakhma',tpt')";
    String sql2="update app set name='ravana'where age=45";
    String sql3="delete from uma where age=45";
    /*
    smt.execute(sql3);
    con.close();
    */
    String sql41="select*from app";
	ResultSet rs=stmt.executeQuery(sql41);
	while(rs.next())
	{
		System.out.println("Age:"+rs.getInt(1)+"Name:"+rs.getString(2)+"city:"+rs.getString(3));
	}
    System.out.println("sucess");
}


	}

