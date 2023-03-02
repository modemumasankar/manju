package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class sample1
{
	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","8102@uma");
		
		PreparedStatement pst=con.prepareStatement("insert into uma values(?,?,?)");
		 pst.setInt (1,111);
		 pst.setString(2,"apple ");
		 pst.setString(3,"tpt");
		 pst.execute();
		  PreparedStatement pst1=con.prepareStatement("update uma set name=? where id=?"); 
		 pst1.setString(1,"somu");
		 pst1.setInt(2,2323);
		 pst1.execute();
		 
		 PreparedStatement pst2=con.prepareStatement("select*from hsc");
		 ResultSet rs=pst2.executeQuery();
		 while(rs.next())
		 {
			 System.out.println("ID:"+rs.getInt(1)+"Name:"+rs.getString(2)+"city:"+rs.getString(3));
		 }
		 System.out.println("done");
		 }
}
