package org.spring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Hello.class);
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}

}
