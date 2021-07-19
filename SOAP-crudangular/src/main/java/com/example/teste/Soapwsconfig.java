package com.example.teste;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;	
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class Soapwsconfig {
	
	@Autowired
	private IndicatorEndpoint endpoint01 ;
	@Autowired
	  private Bus bus;

	@Bean
	   public Endpoint endpoint() {
	       EndpointImpl endpoint = new EndpointImpl(bus, endpoint01);
	       endpoint.publish("/solicita-ws");
	       return endpoint;
	   }
	
	@Bean
	public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/soap-api/*");
	}
	
	@Bean
	@Primary
	public DispatcherServletPath dispatcherServletPathProvider() {
		return () -> "";
	}
}
