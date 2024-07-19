package java240719;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Prob4_1 extends JFrame {
	JLabel la1 = new JLabel("부서번호"); 
	JLabel la2 = new JLabel("부서명"); 
	JLabel la3 = new JLabel("부서위치");
	JTextField tf1 = new JTextField(5); 
	JTextField tf2 = new JTextField(5);
	JTextField tf3 = new JTextField(10);
	JButton bt1 = new JButton("입력"); 
	
	Prob4_1() {
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jp1, BorderLayout.CENTER);
		jp1.setLayout(new FlowLayout());
		jp1.add(la1); 
		jp1.add(tf1);
		
		jp1.add(la2); 
		jp1.add(tf2); 
		
		jp1.add(la3); 
		jp1.add(tf3);
		
		con.add(jp3, BorderLayout.SOUTH);
		jp3.setLayout(new FlowLayout());
		jp3.add(bt1);
		bt1.addActionListener(new MyListener1());
		
		this.setBounds(1200, 200, 700, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	class MyListener1 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
	     	String URL = "jdbc:mysql://localhost:3306/spring5fs";
	        Connection con = null;
	        PreparedStatement pstmt = null;
			
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection(URL,"spring5","spring5");
				System.out.println("Mysql 접속 성공");
				
				String sql = "INSERT INTO dept(dept_DEPTNO, dept_DNAME, dept_LOC) VALUES(?,?,?)";
				pstmt = con.prepareStatement(sql);
		
		        int deptno = Integer.parseInt(tf1.getText());
		        String dname = tf2.getText();
	         	String loc  = tf3.getText();
		
	         	pstmt.setInt(1, deptno);
	            pstmt.setString(2, dname);
	            pstmt.setString(3, loc);
	
		       int num = pstmt.executeUpdate();
		       System.out.println("테이블 삽입!"+ num);
		
			} catch (ClassNotFoundException | SQLException ex) {
	            ex.printStackTrace();
	        } 
			
	    }
	}
	
	
	public static void main(String[] ar) {

		
		new Prob4_1();
	}

}