package org.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class jlcConfig {

	@Bean
	public ClassA ClassABean() {
		return new ClassA();
	}

	@Bean
	public ClassB ClassBBean() {
		return new ClassB(1, "Hi i am jlcConfig class");
	}

	@Bean(name = "hello")
	public Hello getHello() {
		System.out.println("getHello from jlcConfig");
		Hello hello = new Hello();
		hello.setAobj(ClassABean());
		hello.setBobj(ClassBBean());
		return hello;
	}

}
