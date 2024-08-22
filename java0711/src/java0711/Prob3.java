//문제3) 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하시오.
//예) sumOf(4,2) 4 3 2 더하기 
//예) sumOf(2,4) 2 3 4 더하기

package java0711;

import java.util.Scanner;

public class Prob3 {
	
	public static int sumOf(int a, int b) {
		
		int sum=0;
		int min;
		int max;
		
		if (a<b) {
			min = a; max = b;
		} else {
			min =b; max = a;
		}
		
		if (a <= b) {
		for (int i=min; i <= max; i++) {
			sum += i;
		  }
		} return sum;
		
	}
	
	
	public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구함\n");
	System.out.println("A를 입력하시오:");
	int a = scan.nextInt();
	
	System.out.println("B를 입력하시오:");
	int b = scan.nextInt();
	
	System.out.println(sumOf(a, b));
}
}