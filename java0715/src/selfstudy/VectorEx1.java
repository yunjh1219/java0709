package selfstudy;

import java.util.*;

public class VectorEx1 {

	public static void main(String[] args){
		List<Book> list = new Vector<Book>();
		
		list.add(new Book("제목1","내용1","저자1"));
		list.add(new Book("제목2","내용2","저자2"));
		
		for(int i=0; i<list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book);
		}
	}
}
