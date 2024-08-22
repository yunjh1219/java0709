package java0715;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ArraryListEx1 {

	public static void main(String[] args) {
		
             ArrayList<String> list;  // String list[];
             list = new ArrayList<String>();  // new String[10];
             
//           ArrayList<String> = new ArrayList<String>();
             

             
             list.add("홍길동");
             list.add("자바");
             list.add("Hello");
             
//           이터레이터 (자바 디자인 패턴 ★)
             Iterator<String> it = list.iterator();
             while (it.hasNext()) {
            	 String str = it.next();
            	 System.out.println(str);
             }
         }
	}