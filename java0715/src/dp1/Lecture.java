package dp1;

import java.util.*;

public class Lecture {
  private String name; //코스명
  private String langh; //언어 
  private Vector<Student> student;
  
  public Lecture(String name, String langh){
	  this.name = name;
	  this.langh = langh;
  }
  
  public String toString() {
	  return "Lecture 강의명="+name+", 언어="+langh+"";
  }
  
}
