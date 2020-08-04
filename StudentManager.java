import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager {

	public void insertStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test_db","root","root");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student(id,name,phone) values('2','Thura Soe','092344')");
			con.close();
			System.out.println("Insert Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void showStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test_db","root","root");
			Statement stmt=con.createStatement();
			ResultSet  rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println("Name "+rs.getString("name")+" Phone: "+rs.getString("phone"));
				
				
			}
			con.close();
			System.out.println("Insert Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  void main(String[] args) {
		StudentManager stdManager= new StudentManager();
		stdManager.showStudent();
	}
}
