import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStatic {

	static Connection con = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent","root","root");
			String query = "Delete from student where sid=1";
			stmt = con.createStatement();
			int res = stmt.executeUpdate(query);
			if (res > 0) {
				System.out.println("Deleted Successfully!!");
			}
		} catch (Exception e) {
			System.out.println("Exception Error");
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				System.out.println("Exception Error");
			}
		}
	}
}