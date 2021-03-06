package com.example.teste.ejbremote;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
	
	@Bean 
	public Context context() throws NamingException {
	    Properties jndiProps = new Properties();
	    jndiProps.put("java.naming.factory.initial", 
	      "org.jboss.naming.remote.client.InitialContextFactory");
	    jndiProps.put("jboss.naming.client.ejb.context", true);
	    jndiProps.put("java.naming.provider.url", 
	      "http-remoting://localhost:8080");
	    return new InitialContext(jndiProps);
	}

}
