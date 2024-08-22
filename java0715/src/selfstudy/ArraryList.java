package selfstudy;

import java.util.*;

public class ArraryList {
  public static void main(String[] args) {
	  List<String> list = new ArrayList<String>();
	  
	  list.add("Java");
	  list.add("JDBC");
	  list.add("Servlet/JSP");
	  list.add(2,"Datebase");
	  list.add("iBATIS");
	  
	  //저장된 객체 수
	  int size = list.size();
	  System.out.println("저장된 객체 수:"+ size);
	  System.out.println();
	  
	  //2번 인덱스의 객체 얻기
	  String skill = list.get(2);
	  System.out.println("2번 인덱스:"+skill);
	  System.out.println();
  
      //저장된 총 객체 수만큼 루핑
      for(int i =0; i<list.size(); i++) {
    	  String str = list.get(i);
    	  System.out.println(i+":"+str);
      }
      
      list.remove(1);
      
      System.out.println();
      System.out.println("--------");
      System.out.println("남은 객체 수");
      for(int i =0; i<list.size(); i++) {
    	  String str = list.get(i);
    	  System.out.println(i+":"+str);
      }
  }
}