package com.example.teste.ejbremote;

import javax.naming.Context;
import javax.naming.NamingException;

import org.springframework.context.annotation.Bean;

public class HelloStatelessWorldBean implements HelloStatelessWorld {
	 
    public String getHelloWorld() {
        return "Hello Stateless World!";
    }
    
    private String getFullName(Class classType) {
	    String moduleName = "ejb-remote-for-spring/";
	    String beanName = classType.getSimpleName();
	    String viewClassName = classType.getName();
	    return moduleName + beanName + "!" + viewClassName;
	}
    
    @Bean
	public HelloStatelessWorld helloStatelessWorld(Context context) 
	  throws NamingException {
	 
	    return (HelloStatelessWorld) 
	      context.lookup(this.getFullName(HelloStatelessWorld.class));
	}
}