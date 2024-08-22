//DB테이블 값 입력
package java240719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex5 {

	public static void main(String[]args) {
		String createString = "INSERT INTO customer VALUES ('C-1003','홍길동','010-1341-2222','강남')";
		
		String createString1 = "INSERT INTO dept VALUES (10, 'ACCOUNTING', 'NEW YORK')";
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			System.out.println("Mysql 접속 성공");
			stmt = con.createStatement();
			stmt.executeUpdate(createString1);
			stmt.executeUpdate(createString);
			int num = stmt.executeUpdate(createString1);
			int num1 = stmt.executeUpdate(createString);
			System.out.println("테이블 삽입!"+ num + num1 );
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
