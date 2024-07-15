package project1;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class User {
	
	
	public static void main(String[] args) {
		
		
		Member[] member = new Member[3];
		
		boolean run = true;
		boolean menu1 = false;
		boolean menu2 = false;
		boolean menu3 = false;
		
		
		String id;
		String strPassword;
		
		
		//잔고
		int balance = 0;
		
		//회원가입
		String name; //이름
		String dno;  //주민
		String pno;  //폰번호
		
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.은행 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			
			int menuNum = Integer.parseInt(scan.nextLine());
			
			switch(menuNum) {
			case 1 :
     			menu1 = true;	
     			break;
			case 2 :
     			menu2 = true;	
     			break;
			case 3 :
     			menu3 = true;	
     			break;
			case 4 :
     			run = false;	
     			System.out.println("종료!");
     			break;
		
			}
		 //1번 로그인
			while(menu1) {
			    System.out.println("[로그인 처리]");
		    	System.out.print("1.아이디: ");
		    	id = scan.nextLine();
		    	System.out.print("2.패스워드: ");
		    	strPassword = scan.nextLine();
		        
		    	if(id.equals(name)) {
		    		if(strPassword.equals(dno)) {
		    		System.out.println("로그인 성공");	
		    		}else {
		    			System.out.println("로그인 실패: 패스워드가 틀림");
		    		}
		    	}else {
		    		System.out.println("로그인 실패: 아이디가 틀림");
		    	}
		    	menu1 = false;
		    	break;
		     }
			
		// 2번 회원가입
			 while(menu2) {
				 
				    for ( int i= 0; i<member.length; i++) {
				        System.out.print("성함 : ");
				    	String name = scan.nextLine();
				    	System.out.print("주민등록번호: ");
				    	String dno = scan.nextLine();
				    	System.out.print("전화번호: ");
				    	String pno = scan.nextLine();
				    	
				     member[i] = new Member(name, dno, pno);
				    		 
				    }
				    System.out.println("[필수 정보 입력]");
			    	System.out.print("1.이름: ");
			    	name = scan.nextLine();
			    	System.out.print("2.주민번호(6자리): ");
			    	dno = scan.nextLine();
			    	System.out.print("3.전화번호: ");
			    	pno = scan.nextLine();
			    	
			    	System.out.println();
			    	System.out.println("[입력된 내용]");
			    	System.out.println("1.이름: "+name);
			    	System.out.println("2.주민번호(6자리): "+dno);
			    	System.out.println("3.전화번호: "+pno);
			    	
			    	//객체 생성
			 
			    	System.out.println(member);
			    	menu2 = false;
			    	break;
			     }
			 
		// 3번 은행	
	    while(menu3) {
	    	System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			int menu3Num = Integer.parseInt(scan.nextLine());
			switch(menu3Num){
			case 1:
				System.out.print("예금액>");
				balance += Integer.parseInt(scan.nextLine());
				break;
			case 2:
				System.out.print("출금액>");
				balance -= Integer.parseInt(scan.nextLine());
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4:
				System.out.println("4");
				menu3 = false;
				break;
			}
	     }    
	   } //while(run)	
	}	
}
