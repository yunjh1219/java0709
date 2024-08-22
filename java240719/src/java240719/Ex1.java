//p.477 try-catch-finally

package java240719;

public class Ex1 {
  public static void main(String[]args) {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Mysql 드라이버 로딩!");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
    }
  }
}
