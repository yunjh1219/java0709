package project2;

import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
    JLabel ID = new JLabel("아이디");
    JLabel PS = new JLabel("비밀번호");
    JTextField IDt = new JTextField(5);
	JButton Log = new JButton("로그인");
	JTextArea ta = new JTextArea(20,50);
  
	
	LoginFrame(){
		
		JPanel IDnel = new JPanel();
		JPanel PSnel = new JPanel();
		JPanel jp3 = new JPanel();
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(IDnel, BorderLayout.NORTH);
		con.add(PSnel, BorderLayout.NORTH);
		IDnel.setLayout(new FlowLayout(FlowLayout.CENTER));
		PSnel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		IDnel.add(ID); 
		IDnel.add(IDt); 
		IDnel.add(Log);
		
		PSnel.add(con);
		
		
		this.setBounds(1200, 200, 700, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[]args) {
		new LoginFrame();
	}
}

