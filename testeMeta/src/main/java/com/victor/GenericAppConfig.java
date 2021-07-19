package com.victor; 
import org.springframework.context.annotation.Configuration;

import com.victor.metadados.MetadadosUtil;

@Configuration
public class GenericAppConfig {

	public MetadadosUtil getMetadados() {
		return new MetadadosUtil();
	}

}
