package com.victor;

import org.springframework.context.annotation.Configuration;

import com.victor.singleton.ClassSingleton;

@Configuration
public class AppConfig {

	
	public ClassSingleton getSingleton() {
		return new ClassSingleton();
	}
	
}
