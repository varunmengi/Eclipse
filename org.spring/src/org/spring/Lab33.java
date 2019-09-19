package org.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(HaiConfig.class);
		Hallo hel = (Hallo)cont.getBean(Hallo.class);
		hel.show();
		Hai hi =(Hai)cont.getBean(Hai.class);
		hi.show();
	}

}
