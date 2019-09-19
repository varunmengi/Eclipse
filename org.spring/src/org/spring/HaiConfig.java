package org.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HaiConfig {

	@Bean(name="Hai")
	public Hai getHai(){
		return new Hai();
	}
}
