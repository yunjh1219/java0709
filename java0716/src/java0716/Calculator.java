package java0716;

import java.util.*;

public class Calculator {
 
	
	int plus() {
//		int result = x+y;
     	return plus();
 }
	
	double avg() {
//		double sum = plus(x, y);
//		double result = sum / 2;
		return this.plus() / 2.0;
	}
	
	void execute() {
//		double result = avg();
		println("실행결과:"+ this.avg());
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	

	
}


