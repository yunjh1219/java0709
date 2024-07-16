package projectYJH;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LoginPage extends JFrame{
	
	JLabel lb1 = new JLabel("로그인 하시오");
	JLabel lb2 = new JLabel("아이디");
	JLabel lb3 = new JLabel("비밀번호");
	JTextField jt1 = new JTextField(); //아이디
	JTextField jt2 = new JTextField(); //아이디
    JButton jb1 = new JButton("로그인");
	List<Member> list;
	Member member; // 로그인 된 현재 사용자
	
    public LoginPage() {
    	
    	try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			list = new ArrayList<>(Arrays.asList(list2));   // 배열을 ArrayList로
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : list) {
			System.out.println(member);
		}
		System.out.println("총회원수:"+list.size());
    	
		Container con = this.getContentPane();
		con.setLayout(null);
		
		con.add(lb1); //라벨
		lb1.setLocation(410,70);
		lb1.setSize(100,30);
		lb1.setForeground(Color.white);
		
		con.add(lb2); //라벨
		lb2.setLocation(400,125);
		lb2.setSize(100,30);
		lb2.setForeground(Color.white);
		
		con.add(lb3); //라벨
		lb3.setLocation(400,195);
		lb3.setSize(100,30);
		lb3.setForeground(Color.white);
		
		con.add(jt1); //입력칸
		jt1.setLocation(400,150);
		jt1.setSize(100, 30);
		
		con.add(jt2); //입력칸
		jt2.setLocation(400,220);
		jt2.setSize(100, 30);
		
		con.add(jb1);  //로그인 버튼
		jb1.setLocation(400,280);
		jb1.setSize(100,30);
		jb1.addActionListener(new MyListener1());
		
		this.setTitle("안녕 스윙");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(700, 300);
		con.setBackground(Color.black);
		this.setSize(900, 500);
		this.setVisible(true);
    }
	
	
	class MyListener1 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// 로그인 처리
		
		String name = jt1.getText(); // name 변수의 값 입력
		String strPassword = jt2.getText();//패스워드입력
		
		for (Member member2 : list) {
			if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
				member = member2;
				System.out.println("로그인 성공!");
				dispose();
				new MyFrame();
				break;
			}
		}
		System.out.println(member);
	 }
}
	
  
	public static void main(String[] args) {
		new LoginPage();  
	}
	
}
