package dp;

public class Main2 {

	public static void main(String[] args) {
	
		Student minsu = new Student("민수");  // 학생등록
		Course java = new Course("1000", "자바"); //코스등록
		Course cplus = new Course("cs101", "C/C++"); //코스등록 
		minsu.registerCourse(java);
		java.addStudent(minsu);
		
		minsu.registerCourse(cplus);
		cplus.addStudent(minsu);
		
		Student junghwan = new Student("정환");
		junghwan.registerCourse(java);
		java.addStudent(junghwan);
		
		System.out.println(minsu);
		System.out.println(junghwan);
		
		//코스별 신청자 출력
		System.out.println(java);
		System.out.println(cplus);
		
	}
}

