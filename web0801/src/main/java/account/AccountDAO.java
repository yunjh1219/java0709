package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;


public class AccountDAO {
	//JDBC 관련 변수
      private Connection conn = null;
      private PreparedStatement stmt = null;
      private ResultSet rs = null;
      
      private String ACC_LIST = "select * from account";
	  private String ACC_ONE = "select * from account where id = ?";
	  private String ACC_INSERT = "insert into board(writer,title,content, regtime, hits) values(?,?,?,now(),0)";
	  private String ACC_COUNT = "select count(*) as cnt FROM account where name =? and ssn = ?";
	  
	  //로그인 확인
	  public boolean checkLogin(String name, String ssn) {
		  conn = JDBCUtil.getConnection();
		  try {
			  stmt = conn.prepareStatement(ACC_COUNT);
			  stmt.setString(1,  name);
			  stmt.setString(2, ssn);
			  rs = stmt.executeQuery();
			  rs.next();
			  if(rs.getInt("cnt")==1) {
				  return true; //로그인 성공
			  }
		  } catch (SQLException e) {
			  e.printStackTrace();
		  } finally {
			  JDBCUtil.close(rs, stmt, conn);
		  }
		  return false; //로그인 실패 
	  }
	  
}
