package java0711;

import java.util.Scanner;

public class yuns {
	public static void main(String[] args) {
		
	  Scanner scan = new Scanner(System.in);
	  
	  int n;
	  int w;
	  int i;
	  
	  do {
	  System.out.print("n 값:");
	  n = Integer.parseInt(scan.nextLine());
	  } while (n<0);
	  
	  do {
	  System.out.print("w 값: ");
	  w = Integer.parseInt(scan.nextLine());
	  } while (w<0 || w>n);
	  
	  for( i=0; i < n/w; i++) {
			System.out.println("*".repeat(w));
	  }
		
	}	
}
