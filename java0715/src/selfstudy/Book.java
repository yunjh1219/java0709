package selfstudy;

public class Book {
  
	String subject;
	String content;
	String writer;
	
	public Book (String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public String toString() {
		return "Student [과목=" + subject + ", 내용=" + content + ", 저자=" + writer + "]";
	}
	
}

