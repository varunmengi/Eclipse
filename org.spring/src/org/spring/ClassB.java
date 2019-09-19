package org.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassB {
	private int b;
	private String message;
	
	public void setBMessage(){
		System.out.println("i am from Class B");
	}
	
//	public ClassB(){
//		System.out.println("Default constructor from Class B");
//	}
	
	public ClassB(int b, String message){
		this.b = b;
		this.message=message;
		System.out.println("constructor from Class B with 2 args");
		System.out.println(this.b+"  "+this.message);

	}
	
//	public void setMessage(String message) {
//		this.message = message;
//	}
//	public void show(){
//		System.out.println("B class show method");
//		System.out.println(b);
//		System.out.println(message);
//	}
	
	public String toString(){
		return ""+b+"\t"+message ;
	}
	
}
