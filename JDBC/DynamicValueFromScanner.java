import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicValueFromScanner {
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet rs;
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent","root","root");
			String query="select * from student where sid=?";
			pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the student id : ");
			int student_id=scan.nextInt();
			pstmt.setInt(1, student_id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt("sid"));
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getInt("mark"));
			}
			else {
				System.out.println("not found");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
	}

}
