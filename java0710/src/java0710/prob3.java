package java0710;

import java.util.Scanner;

public class prob3 {
	
	public static int maxNum(int x, int y, int z) {
		
		int max = z;
		
		if (x > max) {
			max = x;
		} if (y > max) {
			max = y;
		}
		return max;
	}
	
	public static void main(String[]args) {
		//3개의 값을 받아서 최대값
		Scanner scan = new Scanner(System.in);
	    System.out.print("3개의 수를 입력:");
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
		
		System.out.printf("최대값은 %d\n",maxNum(a, b, c));

		
	}
}


