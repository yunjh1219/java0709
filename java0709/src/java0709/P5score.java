//100만점의 학점을 입력받아서 90점 이상이면 a, 80점 이상이면 B, 70점 이상이면 c, 60점 이상이면 D, 60점 미만이면 F를 구하는
//프로그램을 작성하세요.

package java0709;

import java.util.Scanner;

public class P5score {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오:");
		int num = scan.nextInt();
		
		char score;
		
		switch (num/10) {
		case 10:
		case 9:
			score = 'a';
			break;
		case 8:
			score = 'b';
			break;
		case 7:
			score = 'c';
			break;
		case 6:
			score = 'd';
			break;
		default:
			score ='f';
		}
		
		
		
		System.out.printf("당신의 학점은 %c입니다",score);
				
		scan.close();
	}

}
