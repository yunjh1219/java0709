package dp;

import java.util.*;

public class Course {
// private [ - ] 기호 
// 왜 private로 설정하는지는 다음에
   private String id;
   private String name;
   private int numOfStudent = 0; 
   private Vector<Student> students;
    
public Course(String id, String name) {
	super();
	this.id = id;
	this.name = name;
	this.students = new Vector<Student>();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public void addStudent(Student student) {
	students.add(student);
	++numOfStudent;
}
public void deleteStudent (Student student) {
	if (students.contains(student)) {
		students.remove(student);
		--numOfStudent;
	}
}




@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", numOfStudent=" + numOfStudent + "]";
}

public void addStudent() {
	   
   }
   
   public void deleteStudent() {
	   
   }
   
}
