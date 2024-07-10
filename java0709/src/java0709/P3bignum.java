package java0709;

import java.util.Scanner;

//문제3) 두개의 값을 받아서 큰 수를 출력하세요(단, 같으면 0으로 출력)
public class P3bignum {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1번째 수:");
	int firnum = scan.nextInt();
	
	System.out.println("2번째 수:");
	int secnum = scan.nextInt();
	
	int maxnum;
	if (firnum > secnum) {
		 maxnum = firnum;
		 }
	else {
		maxnum = secnum;
	}
	
	System.out.printf("더 큰 숫자는 %d이다",maxnum);
	
}
}
