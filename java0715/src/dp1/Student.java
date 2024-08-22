package dp1;

import java.util.Vector;

public class Student {
  
	private String name;
	private Vector<Lecture> lectures;
	
	
	
	public Student(String name){
		this.name = name;
		this.lectures = new Vector<Lecture>();
	}
	
	@Override
	public String toString() {
		return "Student 이름=[" + name +"]"+ ", 강의=" + lectures + "";
	}
	
	public void registerLecture(Lecture lecture) {
		lectures.add(lecture);
	}
	
}
