package dp1;

import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		
     	  // 학생등록
		Student minsu = new Student("민수");
		Lecture java = new Lecture("1000", "Java"); //코스등록
		Lecture cplus = new Lecture("cs101", "C/C++"); //코스등록 
		minsu.registerLecture(java);
		
		//코스별 신청자 출력
		System.out.println(minsu);
		System.out.println(cplus);
		
	}
}