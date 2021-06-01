import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JdbcCreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/OneBillBankDB","root","root");
			Statement stmt = con.createStatement();
			String query = "create table Employee(emp_id int primary key , emp_name varchar(50),emp_salary int)";
			stmt.executeUpdate(query);
			System.out.println("Table created succesfully");
		}catch (Exception e) {
           e.printStackTrace();
		}
	}
}