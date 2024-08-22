//문제5 +,- 기호를 번갈아 출력하는 프로그램을 작성하세요
package java0711;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("+와-를 번갈아 n개 출력합니다");
		
		do {
			System.out.print("n값:");
			n = scan.nextInt();
		} while ( n<= 0);
		
		
			for (int i=1; i <= n; i++) {
				if ( i%2==0)
					System.out.print("-");
				else 
					System.out.print("+");
			}
	}

}
