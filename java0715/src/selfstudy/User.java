package selfstudy;

import java.util.*;

import dp1.Lecture;

public class User {
	
	private String name;
	private Vector<Book> books;

	public User(String name){
		this.name = name;
		this.books = new Vector<Book>();
	}
	
	public String toString(){
		return "[사용자 이름="+name+", 책="+books+"]";
	}
	
	public void registerBook(Book books) {
		books.add(books);
	}
	
}
