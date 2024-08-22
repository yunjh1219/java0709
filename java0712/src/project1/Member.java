package project1;
import java.util.*;

public class Member {
	String name;
	String dno; //주민번호 6자리 + 패스워드
	String pno; //휴대폰 번호
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", dno=" + dno + ", pno=" + pno + "]";
	}

	public Member(String name, String dno, String pno) {
		super();
		this.name = name;
		this.dno = dno;
		this.pno = pno;
	}
	
//	public Member() {} 
	
}
