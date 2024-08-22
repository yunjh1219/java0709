//DB에 테이블 올림
package java240719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3 {

	public static void main(String[] args) {
		
		String createString = "CREATE TABLE customer " + 
				"(customer_id char(6) not null primary key, " +
				"customer_name varchar(15) not null, " +
				"customer_tel varchar(13), " + 
		        "customer_addr varchar(20))";

		String createString1 = "CREATE TABLE dept " + 
				"(dept_DEPTNO int(11) default null, " +
				"dept_DNAME varchar(14) default null, " +
				"dept_LOC varchar(13) default null )" ; 
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공!");
			stmt = con.createStatement();
	
			int num = stmt.executeUpdate(createString);
			int num1 = stmt.executeUpdate(createString1);
			System.out.println("테이블 생성! "+ num + num1);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
