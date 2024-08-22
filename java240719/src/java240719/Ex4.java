
//DB테이블 삭제 
package java240719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex4 {

	public static void main(String[]args) {
		String createString = "drop table dept";
		String createString1 = "drop table customer";
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			System.out.println("Mysql 접속 성공");
			stmt = con.createStatement();
			stmt.executeUpdate(createString);
			stmt.executeUpdate(createString1);
			int num = stmt.executeUpdate(createString);
			int num1 = stmt.executeUpdate(createString1);
			System.out.println("테이블 삭제!"+ num + num1);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}





