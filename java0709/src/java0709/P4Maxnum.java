// 2-4 3개의 정수값을 받아서 최대값을 구하여 출력하여 보세요
package java0709;

import java.util.Scanner;

public class P4Maxnum {
 public static void main(String []args) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("첫 번째 값:");
	 int num1 = scan.nextInt();
	 
	 System.out.println("두 번째 값:");
	 int num2 = scan.nextInt();
	 
	 System.out.println("세 번째 값:");
	 int num3 = scan.nextInt();
	 
	 int Maxnum = findMax(num1, num2, num3);
	 
	 System.out.printf("최댓값은 %d입니다",Maxnum);
	 
	 }
	
 

 public static int findMax(int a, int b, int c) {
	 int Max = a;
	 
	 if(b>Max) {
		 Max = b;
	 }
	 if(c>Max) {
		 Max = c;
	 }
	 return Max;
  }
}
