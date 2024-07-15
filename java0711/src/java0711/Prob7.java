package java0711;

import java.util.Scanner;

public class Prob7 {
public static void main(String[]args) {
	
	int no;
	
	Scanner scan = new Scanner(System.in);
	
	do {
		System.out.println("no값:");
		no = scan.nextInt();
	} while ( no < 10 || no > 99  ) ;
	
	System.out.println("변수 no값은"+ no +"이(가) 되었습니다.");
	
 }
}