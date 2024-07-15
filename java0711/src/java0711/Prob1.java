package java0711;

import java.util.Scanner;

public class Prob1 {
	
	public static int med(int a, int b, int c) {
		
		if ((b >=a && c <= a) || (b <= a && c >=a)) {
			return a;
		} else if ((a >= b && c <= b) || (c >=b && b <=a)) {
			return b;
		} return c;
	}
	
//		if ( a >= b) {
//	    	if (b>= c) {
//	    		return b;
//	    	} else if (a <= c) {    // c >= a >= b
//	    		return a;
//	    	} else { 
//	    		return c;
//	    	}
//	    } else if (a > c) {  // a는 b보다 작다
//	    	return a;
//	    } else if (b > c) { // a는 b보다 작다 
//	    	return c;
//	    } else { //a는 b보다 작다 , a는 c보다 작거나 같다, b는 c보다 작거나 같다
//	    	return b;
//	    }
		


 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("a 값 :");
	 String input = scan.nextLine();
	 int a = Integer.parseInt(input);
		 
	 System.out.println("b 값 :");
	 input = scan.nextLine();
	 int b = Integer.parseInt(input);
	 
	 System.out.println("c 값 :");
	 input = scan.nextLine();
	 int c = Integer.parseInt(input);
	 
	 System.out.println(med(a,b,c));		  	
    }	
 }

