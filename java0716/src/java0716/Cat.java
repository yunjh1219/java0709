package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor

public class Cat {
  private String breed;  //품종
  private String color;
  private int age;
  
  
  
//  public Cat(String breed) {
////	super();
////	this.breed = breed;     //생성자 호출전에 아무 작업도 못함
//	this(breed, "흰색", 10); 
//}

//  public Cat(String breed, String color) {
////		super();
////		this.breed = breed;
////		this.color = color;
//	    this(breed, color, 10);
//	}
//  
//public Cat(String breed, String color, int age) {
//	super();
//	this.breed = breed;
//	this.color = color;
//	if (age > 9) {
//	this.age = age;
//	}
//}
//
//
//
//Cat() { //기본 생성자
//	  System.out.println("Cat()");
//  }
//  
//  Cat(int age){  //생성자
//	  
//  }
}
