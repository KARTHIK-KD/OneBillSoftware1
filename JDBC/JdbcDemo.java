//Select query

import java.sql.*;
public class JdbcDemo {
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent","root","root");
			String query="select * from student";
			stmt=(Statement) con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt("sid");
				String name=rs.getString("sname");
				int mark=rs.getInt("mark");
				System.out.println("id : "+id+" name : "+name+" mark : "+mark);
			}
			con.close();
			stmt.close();
			rs.close();
		}catch(Exception e) {
			System.out.println("error");	
		}
		
		
	}

}
