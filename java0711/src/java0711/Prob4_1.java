package java0711;

import java.util.Scanner;

public class Prob4_1 {
	public static void main(String[]args) {
	 	
		Scanner scan = new Scanner(System.in);
		int n;
		
		do { 
			System.out.print("N 값을 입력하시오:");
		    n = scan.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i=1; i < n; i++) {
				System.out.println(i+" + ");
				sum += i;
			}
			
			System.out.print(n + "=");
			sum += n;
			System.out.println(sum);
		}
		
	}
