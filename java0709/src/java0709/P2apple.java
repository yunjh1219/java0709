package java0709;

import java.util.Scanner;

 public class P2apple{
 public static void main(String[] args)	{
	  
 Scanner scan = new Scanner(System.in);
 
 
System.out.println("사과의 갯수를 입력하라:");
String input = scan.nextLine();
int apple = Integer.parseInt(input);
 
System.out.println("사과 먹을 인원 수를 입력하라:");
input = scan.nextLine();
int people = Integer.parseInt(input);
 
 int remainder = apple % people;

 System.out.printf("남은 갯수는 :%d개\n",remainder); 
  
	}
 }
