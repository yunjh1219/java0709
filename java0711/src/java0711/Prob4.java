//1부터 n까지의 합과 그 값을 구하는 과정을 출력하는 프로그램을 작성하세요.
//예 n값 : 5
//1 + 2 + 3 + 4 + 5 = 15

package java0711;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[]args) {
	 	
		Scanner scan = new Scanner(System.in);
		System.out.println("N 값을 입력하시오:");
		int n = scan.nextInt();
		
		int sum=0;
		
		for (int i=1; i<=n; i++) {
			if(i <n) {
			System.out.printf("%d+",i);
		} else {
			System.out.printf("%d",i);
		}
		sum += i;
		}
		System.out.println( "="+sum);
		
	}

}
