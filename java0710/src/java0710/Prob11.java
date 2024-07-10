package java0710;

import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {

      boolean run = true;
      int balace = 0;
      Scanner scan = new Scanner(System.in);
      
      while(run) {
    	  System.out.println("-------------------");
    	  System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
    	  System.out.println("-------------------");
    	  System.out.print("선택>");
    	  
    	  String input = scan.nextLine();
    	  int selNum = Integer.parseInt(input);
    	  
    	  switch(selNum) {
    	  case 1: 
    		 
    		  System.out.println("예금액>10000");
    		  break;
    		  
    	  case 2:
    		  System.out.println("선택> 2");
    		  System.out.println("출금액>2000");
    		  break;
    		  
    	  case 3:
    		  System.out.println("선택> 3");
    		  System.out.println("잔고>8000");
    		  break;    		  
    	 
    	  default:
    		  System.out.println("선택> 4");
    		  }
    	  System.out.println("프로그램 종료");
    	  
    	  scan.close();
      }
      
    	
 }
}