package org.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
//@Import(HaiConfig.class)
public class HalloConfig {
	
//	@Bean(name="Hallo")
	public Hallo getHallo(){
		return new Hallo();
	}
}
