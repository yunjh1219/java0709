package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ArraryListEx2 {

	public static void main(String[] args) {
		
             ArrayList<Object> list = new ArrayList<>(); //제네릭을 쓴다는건 <>에 타입을 쓴다는 것 object x String o
             
             list.add(123);
             list.add("홍길동");
             list.add("자바");
             list.add("Hello");
             
             
             Iterator<Object> it = list.iterator();
             while (it.hasNext()) {
            	 Object obj = it.next();
            	 
            	 if (obj instanceof Integer) {
            		 int num = (int)obj + 100;
            		 System.out.println(num);
            	 }else {
            		 String str = (String) obj;
            		 System.out.println(str);
            	 }
            	 
             }
             
             
//           이터레이터 (자바 디자인 패턴 ★)
//             Iterator<Object> it = list.iterator();
//             while (it.hasNext()) {
//            	 Object str = it.next();
//            	 int num = (int)str + 100;
//            	 System.out.println(num);
//             }       
//        
	
	
	}
	}

