//문제6) *를 n개 출력하되 w개마다 줄을 바꿔서 출력하는 프로그램을 작성하세요
//ex) n값: 14
//w값: 5

package java0711;

import java.util.Scanner;

public class Prob6 {
public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int w;
		int i;
	
		
		do { 
			System.out.print("n을 입력하시오: ");
			n = scan.nextInt();
		} while ( n <= 0 );
		
		do {
			System.out.print("w을 입력하시오: ");
			w = scan.nextInt();
		} while ( w > n || w <= 0);
		
		
		for (i=0; i<n; i++) {
			System.out.print("*");
			if ( i % w == w-1) {
				System.out.println();
			}
		}
		if ( n % w != 0) {
			System.out.println();
			}
		System.out.println("완료!!");
		
		}	
 }


