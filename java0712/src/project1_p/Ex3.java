//파일생성
package project1_p;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		Member[] list = {
		    	 new Member("강하나", "911224","010-1234-5678"),
		    	 new Member("김하나", "891224","010-1234-3456"),
		    	 new Member("이하나", "901224","010-7890-5678"),
		      };
		try(FileOutputStream fos = new FileOutputStream("C:\\temp\\members.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(list);
			System.out.println("객체를 파일에 저장했습니다.");
  
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	}


