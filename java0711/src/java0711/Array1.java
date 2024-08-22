package java0711;

public class Array1 {
 
	public static void main(String[]args) {
		
		int a [] = new int[] {1, 2, 3};
		int a1 [] = {1, 2, 3}; // 둘이 같음
		
		int sum=0;
		double avg = 0;
		
		for (int i=0; i < a.length; i++) {
			sum += a[i];
		} System.out.println("총점 = "+sum);
		avg = (double)sum / a.length;
		System.out.println("평균 = "+avg);
		
		
		
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//p.202
		int scores[] = {83, 90, 87};
		
		int[] myArr = new int[5];    // 배열 생성 (초기화)
		// └ int myArr[] 취향차이
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr[i]);
		}
		
		double myArr2[] = new double[5];
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr2[i]);
		}
		
		boolean myArr3[] = new boolean[5];
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr3[i]);
		}
		
		
	}
}
