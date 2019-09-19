package org.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	private int a;
	private String message;
	
	public void SetMessage(){
		System.out.println("I am from Class A");
	}
	
//	public ClassA(){
//		System.out.println("Default constructor from Class A");
//	}
	public void setA(int a) {
		this.a = a;
	}
	public void setMessage(String message) {
		this.message = message;
	}
//	public void show(){
//		System.out.println("A class show method");
//		System.out.println(a);
//		System.out.println(message);
//	}
	
	public String toString(){
		return " "+ a +"\t"+message ;
	}

}
