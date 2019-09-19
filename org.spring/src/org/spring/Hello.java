package org.spring;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	
	private ClassA aobj;
	
	private ClassB bobj;

	public Hello()
	{
		System.out.println("Default const from Hello");
	}

	public void setAobj(ClassA aobj) {
		System.out.println("setAobj from Hello class");
		this.aobj = aobj;
	}

	public void setBobj(ClassB bobj) {
		System.out.println("setBobj from Hello class");
		this.bobj = bobj;
	}

	public Hello(ClassA aobj) {
		
		this.aobj = aobj;
		System.out.println("const from Hello with one argument");
	}

	public Hello(ClassA aobj, ClassB bobj) {
		this.aobj = aobj;
		this.bobj = bobj;
		System.out.println("const from Hello with two arguments");
		System.out.println(this.aobj+"  "+this.bobj);
	}
	
	public void show(){
		System.out.println(aobj);
		System.out.println("Message from show  "+bobj);
	}

}
