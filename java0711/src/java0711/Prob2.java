///문제2) for문으로 1부터 n까지의 합을 구하세요 (n은 입력받은 정수)
package java0711;

import java.util.Scanner;

public class Prob2 {
  public static void main(String[]args) {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int n;
	  System.out.println("1부터 n까지의 합을 출력합니다.");
	  do {
		  System.out.println("n의 값을 입력하시오:");
		  n = scan.nextInt();
	  } while (n <= 0);
	 

	  int sum = 0;
	  
	  for (int i =1; i<=n; i++) {
		  sum += i;
	  }
	  System.out.println(sum);
	  
  }
}
