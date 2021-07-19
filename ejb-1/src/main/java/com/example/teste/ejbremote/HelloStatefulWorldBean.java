package com.example.teste.ejbremote;

import javax.ejb.Stateful;
import javax.naming.Context;
import javax.naming.NamingException;

import org.springframework.context.annotation.Bean;

@Stateful(name = "HelloStatefulWorld")
public class HelloStatefulWorldBean implements HelloStatefulWorld {
 
    private int howManyTimes = 0;
 
    public int howManyTimes() {
        return howManyTimes;
    }
 
    public String getHelloWorld() {
        howManyTimes++;
        return "Hello Stateful World";
    }
    
    private String getFullName(Class classType) {
	    String moduleName = "ejb-remote-for-spring/";
	    String beanName = classType.getSimpleName();
	    String viewClassName = classType.getName();
	    return moduleName + beanName + "!" + viewClassName;
	}
    
	@Bean
	public HelloStatefulWorld helloStatefulWorld(Context context) 
	  throws NamingException {
	 
	    return (HelloStatefulWorld) 
	      context.lookup(this.getFullName(HelloStatefulWorld.class));
	}
}