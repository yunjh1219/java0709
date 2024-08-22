//DB테이블 값 입력
package java240719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Prob2 {

	public static void main(String[]args) {
        
		Scanner sc = new Scanner(System.in);
     	String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"spring5","spring5");
			System.out.println("Mysql 접속 성공");
			
			String sql = "INSERT INTO dept(dept_DEPTNO, dept_DNAME, dept_LOC) VALUES(?,?,?)";
			pstmt = con.prepareStatement(sql);
			
            System.out.print("Dept deptno: ");
            String input = sc.nextLine();
            int deptno = Integer.parseInt(input);
            
            System.out.println("Dept dname: ");
            String dname = sc.nextLine();
            
            System.out.println("Dept loc: ");
            String loc = sc.nextLine();
            
            pstmt.setInt(1, deptno);
            pstmt.setString(2, dname);
            pstmt.setString(3, loc);
            
			int num = pstmt.executeUpdate();
			System.out.println("테이블 삽입!"+ num);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
