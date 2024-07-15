package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class VectorEx1 {

	public static void main(String[] args) {
		
             List<Object> list = new Vector<>(); //제네릭을 쓴다는건 <>에 타입을 쓴다는 것 object x String o
             
             list.add(123);
             list.add("홍길동");
             list.add("자바");
             list.add("Hello");
             
//           이터레이터 (자바 디자인 패턴 ★)
             Iterator<Object> it = list.iterator();
             while (it.hasNext()) {
            	 Object str = it.next();
            	 System.out.println(str);
             }       
         }
	}

