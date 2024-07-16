package java0716;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
    JLabel lb1 = new JLabel("아이디");
    JLabel lb2 = new JLabel("SSN");
    JLabel lb3 = new JLabel("전화번호");
    JTextField jt1 = new JTextField();
    JTextField jt2 = new JTextField();
    JTextField jt3 = new JTextField();
	JTextArea ta = new JTextArea();
	JButton jb1 = new JButton("로그인");
	JButton jb2 = new JButton("회원가입");
	JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금");
	JButton jb5 = new JButton("잔고");
	public MyFrame(){
		Container con = this.getContentPane();
		con.setLayout(null);
		
		con.add(lb1); //라벨
		lb1.setLocation(20, 50);
		lb1.setSize(100,30);
		
		con.add(lb2);
		lb2.setLocation(220, 50);
		lb2.setSize(100,30);
		
		con.add(lb3);
		lb3.setLocation(420, 50);
		lb3.setSize(100,30);
		
		con.add(jt1); //입력칸
		jt1.setLocation(80,50);
		jt1.setSize(100, 30);
		
		con.add(jt2);
		jt2.setLocation(280,50);
		jt2.setSize(100, 30);
		
		con.add(jt3);
		jt3.setLocation(480,50);
		jt3.setSize(100, 30);
		
		con.add(ta);
		ta.setLocation(20, 120);
		ta.setSize(830,200);
		
		con.add(jb1);  //로그인 버튼
		jb1.setLocation(20,350);
		jb1.setSize(100,30);
		jb1.addActionListener(new MyListener());
		
		con.add(jb2); //회원가입
		jb2.setLocation(120,350);
		jb2.setSize(100,30);
		
		con.add(jb3); //예금
		jb3.setLocation(220,350);
		jb3.setSize(100,30);
		
		con.add(jb4); //출금
		jb4.setLocation(320,350);
		jb4.setSize(100,30);
		
		con.add(jb5); //잔고
		jb5.setLocation(420,350);
		jb5.setSize(100,30);
		
		this.setTitle("안녕 스윙");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(700, 300);
		this.setSize(900, 500);
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
	
		new MyFrame();  
	}
}